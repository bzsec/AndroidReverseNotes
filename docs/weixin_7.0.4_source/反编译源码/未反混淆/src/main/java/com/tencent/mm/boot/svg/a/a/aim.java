package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.c;
import com.tencent.smtt.sdk.WebView;

public final class aim extends c {
    private final int height = 24;
    private final int width = 24;

    public final int a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 24;
            case 1:
                return 24;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                Matrix h = c.h(looper);
                float[] g = c.g(looper);
                Paint k = c.k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = c.k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                Paint a = c.a(k2, looper);
                a.setStrokeWidth(1.0f);
                canvas.save();
                g = c.a(g, 1.0f, 0.0f, -276.0f, 0.0f, 1.0f, -60.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                g = c.a(g, 1.0f, 0.0f, 276.0f, 0.0f, 1.0f, 60.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                Path l = c.l(looper);
                l.moveTo(0.0f, 0.0f);
                l.lineTo(24.0f, 0.0f);
                l.lineTo(24.0f, 24.0f);
                l.lineTo(0.0f, 24.0f);
                l.lineTo(0.0f, 0.0f);
                l.close();
                canvas.save();
                a = c.a(a, looper);
                a.setColor(-1);
                a.setStrokeWidth(1.5f);
                g = c.a(g, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 4.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.saveLayerAlpha(null, 230, 4);
                canvas.save();
                Paint a2 = c.a(a, looper);
                Path l2 = c.l(looper);
                l2.moveTo(0.0f, 5.8581343f);
                l2.lineTo(-5.551115E-17f, 0.37615737f);
                l2.cubicTo(-7.5801766E-17f, 0.21047194f, 0.13431458f, 0.07615736f, 0.3f, 0.07615736f);
                l2.lineTo(6.0260386f, 0.07615736f);
                canvas.drawPath(l2, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(a, looper);
                l2 = c.l(looper);
                l2.moveTo(0.0f, 10.096506f);
                l2.lineTo(-5.551115E-17f, 15.578483f);
                l2.cubicTo(4.798332E-16f, 15.744168f, 0.13431458f, 15.878483f, 0.3f, 15.878483f);
                l2.lineTo(6.0260386f, 15.878483f);
                canvas.drawPath(l2, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(a, looper);
                l2 = c.l(looper);
                l2.moveTo(15.876585f, 9.997669f);
                l2.lineTo(15.876585f, 15.6773205f);
                l2.cubicTo(15.876585f, 15.843005f, 15.74227f, 15.977321f, 15.576586f, 15.977321f);
                l2.lineTo(9.850547f, 15.977321f);
                canvas.drawPath(l2, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(a, looper);
                l2 = c.l(looper);
                l2.moveTo(15.876585f, 5.9344497f);
                l2.lineTo(15.876585f, 0.3f);
                l2.cubicTo(15.876585f, 0.13431458f, 15.74227f, 6.9120906E-16f, 15.576586f, 7.2164497E-16f);
                l2.lineTo(9.916438f, 0.0f);
                canvas.drawPath(l2, a2);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                canvas.restore();
                canvas.restore();
                c.j(looper);
                break;
        }
        return 0;
    }
}
