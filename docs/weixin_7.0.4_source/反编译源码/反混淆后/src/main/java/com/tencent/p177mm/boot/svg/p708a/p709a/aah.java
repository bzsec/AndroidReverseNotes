package com.tencent.p177mm.boot.svg.p708a.p709a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.p177mm.svg.C5163c;
import com.tencent.p177mm.svg.WeChatSVGRenderC2Java;
import com.tencent.smtt.sdk.WebView;

/* renamed from: com.tencent.mm.boot.svg.a.a.aah */
public final class aah extends C5163c {
    private final int height = 72;
    private final int width = 72;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 72;
            case 1:
                return 72;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                C5163c.m7881h(looper);
                C5163c.m7880g(looper);
                Paint k = C5163c.m7883k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = C5163c.m7883k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                C5163c.m7876a(k2, looper).setStrokeWidth(1.0f);
                k = C5163c.m7876a(k, looper);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                canvas.save();
                Paint a = C5163c.m7876a(k, looper);
                Path l = C5163c.m7884l(looper);
                l.moveTo(49.864876f, 45.51525f);
                l.lineTo(62.598618f, 58.248997f);
                l.lineTo(58.355976f, 62.49164f);
                l.lineTo(45.63759f, 49.77325f);
                l.cubicTo(42.1214f, 52.426655f, 37.744442f, 54.0f, 33.0f, 54.0f);
                l.cubicTo(21.402f, 54.0f, 12.0f, 44.598f, 12.0f, 33.0f);
                l.cubicTo(12.0f, 21.402f, 21.402f, 12.0f, 33.0f, 12.0f);
                l.cubicTo(44.598f, 12.0f, 54.0f, 21.402f, 54.0f, 33.0f);
                l.cubicTo(54.0f, 37.68957f, 52.462833f, 42.020115f, 49.864876f, 45.51525f);
                l.close();
                l.moveTo(48.0f, 33.0f);
                l.cubicTo(48.0f, 24.715714f, 41.284286f, 18.0f, 33.0f, 18.0f);
                l.cubicTo(24.715714f, 18.0f, 18.0f, 24.715714f, 18.0f, 33.0f);
                l.cubicTo(18.0f, 41.284286f, 24.715714f, 48.0f, 33.0f, 48.0f);
                l.cubicTo(41.284286f, 48.0f, 48.0f, 41.284286f, 48.0f, 33.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
