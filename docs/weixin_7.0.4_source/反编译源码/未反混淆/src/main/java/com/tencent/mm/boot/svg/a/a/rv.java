package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;
import com.tencent.smtt.sdk.WebView;

public final class rv extends c {
    private final int height = 60;
    private final int width = 60;

    public final int a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 60;
            case 1:
                return 60;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                c.h(looper);
                c.g(looper);
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
                Paint a = c.a(k, looper);
                a.setColor(WebView.NIGHT_MODE_COLOR);
                canvas.saveLayerAlpha(null, 51, 4);
                canvas.save();
                Paint a2 = c.a(a, looper);
                Path l = c.l(looper);
                l.moveTo(29.73f, 4.822f);
                l.cubicTo(15.804f, 4.822f, 4.514f, 16.111f, 4.514f, 30.038f);
                l.cubicTo(4.514f, 43.965f, 15.804f, 55.253f, 29.73f, 55.253f);
                l.cubicTo(43.656f, 55.253f, 54.946f, 43.963997f, 54.946f, 30.036999f);
                l.cubicTo(54.946f, 16.11f, 43.656f, 4.822f, 29.73f, 4.822f);
                l.close();
                l.moveTo(29.73f, 53.27f);
                l.cubicTo(16.898998f, 53.27f, 6.4969997f, 42.868f, 6.4969997f, 30.037f);
                l.cubicTo(6.4969997f, 17.206001f, 16.899f, 6.805f, 29.73f, 6.805f);
                l.cubicTo(42.561f, 6.805f, 52.962997f, 17.207f, 52.962997f, 30.038f);
                l.cubicTo(52.962997f, 42.869f, 42.561f, 53.27f, 29.73f, 53.27f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.save();
                k = c.a(a, looper);
                Path l2 = c.l(looper);
                l2.moveTo(31.23f, 15.037f);
                l2.lineTo(28.23f, 15.037f);
                l2.lineTo(28.23f, 28.537f);
                l2.lineTo(14.73f, 28.537f);
                l2.lineTo(14.73f, 31.537f);
                l2.lineTo(28.23f, 31.537f);
                l2.lineTo(28.23f, 45.037f);
                l2.lineTo(31.23f, 45.037f);
                l2.lineTo(31.23f, 31.537f);
                l2.lineTo(44.73f, 31.537f);
                l2.lineTo(44.73f, 28.537f);
                l2.lineTo(31.23f, 28.537f);
                l2.close();
                WeChatSVGRenderC2Java.setFillType(l2, 2);
                WeChatSVGRenderC2Java.setFillType(l2, 2);
                canvas.drawPath(l2, k);
                canvas.restore();
                canvas.restore();
                c.j(looper);
                break;
        }
        return 0;
    }
}
