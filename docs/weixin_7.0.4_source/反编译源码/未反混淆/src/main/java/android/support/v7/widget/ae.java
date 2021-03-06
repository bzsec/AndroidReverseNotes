package android.support.v7.widget;

import android.os.SystemClock;
import android.support.v7.view.menu.s;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewParent;

public abstract class ae implements OnAttachStateChangeListener, OnTouchListener {
    private final float aiL;
    private final int aiM;
    private final int aiN;
    final View aiO;
    private Runnable aiP;
    private Runnable aiQ;
    private boolean aiR;
    private final int[] aiS = new int[2];
    private int mActivePointerId;

    class a implements Runnable {
        a() {
        }

        public final void run() {
            ViewParent parent = ae.this.aiO.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        public final void run() {
            ae.this.m0if();
        }
    }

    public abstract s gm();

    public ae(View view) {
        this.aiO = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.aiL = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.aiM = ViewConfiguration.getTapTimeout();
        this.aiN = (this.aiM + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.aiR;
        View view2;
        int z3;
        if (z2) {
            view2 = this.aiO;
            s gm = gm();
            if (gm == null || !gm.isShowing()) {
                z3 = false;
            } else {
                ab abVar = (ab) gm.getListView();
                if (abVar == null || !abVar.isShown()) {
                    z3 = false;
                } else {
                    MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                    int[] iArr = this.aiS;
                    view2.getLocationOnScreen(iArr);
                    obtainNoHistory.offsetLocation((float) iArr[0], (float) iArr[1]);
                    int[] iArr2 = this.aiS;
                    abVar.getLocationOnScreen(iArr2);
                    obtainNoHistory.offsetLocation((float) (-iArr2[0]), (float) (-iArr2[1]));
                    boolean b = abVar.b(obtainNoHistory, this.mActivePointerId);
                    obtainNoHistory.recycle();
                    z3 = motionEvent.getActionMasked();
                    if (z3 == 1 || z3 == 3) {
                        z3 = false;
                    } else {
                        z3 = 1;
                    }
                    if (!b || r0 == 0) {
                        z3 = false;
                    } else {
                        z3 = 1;
                    }
                }
            }
            if (z3 == 0 && hc()) {
                z3 = false;
            } else {
                z3 = true;
            }
        } else {
            view2 = this.aiO;
            if (view2.isEnabled()) {
                switch (motionEvent.getActionMasked()) {
                    case 0:
                        this.mActivePointerId = motionEvent.getPointerId(0);
                        if (this.aiP == null) {
                            this.aiP = new a();
                        }
                        view2.postDelayed(this.aiP, (long) this.aiM);
                        if (this.aiQ == null) {
                            this.aiQ = new b();
                        }
                        view2.postDelayed(this.aiQ, (long) this.aiN);
                    case 1:
                    case 3:
                        ie();
                    case 2:
                        z3 = motionEvent.findPointerIndex(this.mActivePointerId);
                        if (z3 >= 0) {
                            float x = motionEvent.getX(z3);
                            float y = motionEvent.getY(z3);
                            float f = this.aiL;
                            if (x < (-f) || y < (-f) || x >= ((float) (view2.getRight() - view2.getLeft())) + f || y >= ((float) (view2.getBottom() - view2.getTop())) + f) {
                                z3 = false;
                            } else {
                                z3 = 1;
                            }
                            if (z3 == 0) {
                                ie();
                                view2.getParent().requestDisallowInterceptTouchEvent(true);
                                z3 = 1;
                                break;
                            }
                        }
                        break;
                }
            }
            z3 = false;
            boolean z4 = z3 != 0 && gn();
            if (z4) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.aiO.onTouchEvent(obtain);
                obtain.recycle();
            }
            z3 = z4;
        }
        this.aiR = z3;
        if (z3 || z2) {
            return true;
        }
        return false;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.aiR = false;
        this.mActivePointerId = -1;
        if (this.aiP != null) {
            this.aiO.removeCallbacks(this.aiP);
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean gn() {
        s gm = gm();
        if (!(gm == null || gm.isShowing())) {
            gm.show();
        }
        return true;
    }

    /* Access modifiers changed, original: protected */
    public boolean hc() {
        s gm = gm();
        if (gm != null && gm.isShowing()) {
            gm.dismiss();
        }
        return true;
    }

    private void ie() {
        if (this.aiQ != null) {
            this.aiO.removeCallbacks(this.aiQ);
        }
        if (this.aiP != null) {
            this.aiO.removeCallbacks(this.aiP);
        }
    }

    /* Access modifiers changed, original: final */
    /* renamed from: if */
    public final void m0if() {
        ie();
        View view = this.aiO;
        if (view.isEnabled() && !view.isLongClickable() && gn()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.aiR = true;
        }
    }
}
