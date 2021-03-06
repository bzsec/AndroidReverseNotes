package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;
import com.tencent.smtt.sdk.WebView;

public final class bbz extends c {
    private final int height = 96;
    private final int width = 96;

    public final int a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 96;
            case 1:
                return 96;
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
                c.a(k2, looper).setStrokeWidth(1.0f);
                canvas.save();
                g = c.a(g, 1.0f, 0.0f, -127.0f, 0.0f, 1.0f, -128.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                g = c.a(g, 1.0f, 0.0f, 127.0f, 0.0f, 1.0f, 128.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                k = c.a(k, looper);
                k.setColor(-9276814);
                g = c.a(g, 1.0f, 0.0f, 9.0f, 0.0f, 1.0f, 5.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a = c.a(k, looper);
                Path l = c.l(looper);
                l.moveTo(78.0f, 47.0f);
                l.cubicTo(78.0f, 68.53911f, 60.539104f, 86.0f, 39.0f, 86.0f);
                l.cubicTo(17.460896f, 86.0f, 0.0f, 68.53911f, 0.0f, 47.0f);
                l.cubicTo(0.0f, 29.647755f, 11.332416f, 14.942338f, 27.0f, 9.880997f);
                l.lineTo(27.0f, 18.408052f);
                l.cubicTo(15.838201f, 23.098259f, 8.0f, 34.133774f, 8.0f, 47.0f);
                l.cubicTo(8.0f, 64.12083f, 21.879173f, 78.0f, 39.0f, 78.0f);
                l.cubicTo(56.120827f, 78.0f, 70.0f, 64.12083f, 70.0f, 47.0f);
                l.cubicTo(70.0f, 34.133774f, 62.1618f, 23.098259f, 51.0f, 18.408056f);
                l.lineTo(51.0f, 9.880997f);
                l.cubicTo(66.66759f, 14.942338f, 78.0f, 29.647755f, 78.0f, 47.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a = c.a(k, looper);
                l = c.l(looper);
                l.moveTo(35.0f, 2.0f);
                l.cubicTo(35.0f, 0.89543045f, 35.89543f, 0.0f, 37.0f, 0.0f);
                l.lineTo(42.0f, 0.0f);
                l.cubicTo(43.10457f, 0.0f, 44.0f, 0.89543045f, 44.0f, 2.0f);
                l.lineTo(44.0f, 28.0f);
                l.cubicTo(44.0f, 29.10457f, 43.10457f, 30.0f, 42.0f, 30.0f);
                l.lineTo(37.0f, 30.0f);
                l.cubicTo(35.89543f, 30.0f, 35.0f, 29.10457f, 35.0f, 28.0f);
                l.lineTo(35.0f, 2.0f);
                l.close();
                canvas.drawPath(l, a);
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
