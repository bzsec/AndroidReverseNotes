package com.tencent.p177mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.luggage.p146d.C37393a.C32183a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p208bz.C1338a;
import com.tencent.p177mm.plugin.webview.luggage.C24905d;
import com.tencent.p177mm.plugin.webview.luggage.jsapi.C22840bc.C22841a;
import com.tencent.p177mm.sdk.platformtools.C4990ab;
import java.util.HashMap;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.ba */
public class C22839ba extends C46419bd<C24905d> {
    public final String name() {
        return "showSmileyPanel";
    }

    public final int biG() {
        return 0;
    }

    /* renamed from: b */
    public final void mo9618b(C32183a c32183a) {
        AppMethodBeat.m2504i(6386);
        C4990ab.m7416i("MicroMsg.JsApiShowSmileyPanel", "invokeInOwn");
        int cWF = ((C24905d) c32183a.bOZ).cWF();
        if (cWF > 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("height", Integer.valueOf(C1338a.m2859ao(((C24905d) c32183a.bOZ).mContext, cWF)));
            c32183a.mo52825c("", hashMap);
            AppMethodBeat.m2505o(6386);
            return;
        }
        c32183a.mo52824a("fail", null);
        AppMethodBeat.m2505o(6386);
    }

    /* renamed from: a */
    public final void mo9617a(Context context, String str, C22841a c22841a) {
    }
}
