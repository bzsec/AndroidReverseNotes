package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p1121d.p1122a.p1123a.C44604a;
import p1121d.p1122a.p1123a.C44605g;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.zc */
public final class C40593zc extends btd {
    public int kdT;
    public String kdU;
    public LinkedList<C44605g> wew = new LinkedList();
    public int wex;
    public C44604a wey;

    public C40593zc() {
        AppMethodBeat.m2504i(56776);
        AppMethodBeat.m2505o(56776);
    }

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(56777);
        int ix;
        byte[] bArr;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.BaseResponse != null) {
                c6093a.mo13479iy(1, this.BaseResponse.computeSize());
                this.BaseResponse.writeFields(c6093a);
            }
            c6093a.mo13480iz(2, this.kdT);
            if (this.kdU != null) {
                c6093a.mo13475e(3, this.kdU);
            }
            c6093a.mo13474e(4, 8, this.wew);
            c6093a.mo13480iz(5, this.wex);
            if (this.wey != null) {
                c6093a.mo13479iy(6, this.wey.computeSize());
                this.wey.writeFields(c6093a);
            }
            AppMethodBeat.m2505o(56777);
            return 0;
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = C6087a.m9557ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            ix += C6091a.m9572bs(2, this.kdT);
            if (this.kdU != null) {
                ix += C6091a.m9575f(3, this.kdU);
            }
            ix = (ix + C6087a.m9552c(4, 8, this.wew)) + C6091a.m9572bs(5, this.wex);
            if (this.wey != null) {
                ix += C6087a.m9557ix(6, this.wey.computeSize());
            }
            AppMethodBeat.m2505o(56777);
            return ix;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.wew.clear();
            C6086a c6086a = new C6086a(bArr, unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            AppMethodBeat.m2505o(56777);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            C40593zc c40593zc = (C40593zc) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            C6086a c6086a3;
            boolean z;
            switch (intValue) {
                case 1:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        BaseResponse baseResponse = new BaseResponse();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = baseResponse.populateBuilderWithField(c6086a3, baseResponse, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        c40593zc.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.m2505o(56777);
                    return 0;
                case 2:
                    c40593zc.kdT = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(56777);
                    return 0;
                case 3:
                    c40593zc.kdU = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(56777);
                    return 0;
                case 4:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        C44605g c44605g = new C44605g();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = c44605g.populateBuilderWithField(c6086a3, c44605g, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        c40593zc.wew.add(c44605g);
                    }
                    AppMethodBeat.m2505o(56777);
                    return 0;
                case 5:
                    c40593zc.wex = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(56777);
                    return 0;
                case 6:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        C44604a c44604a = new C44604a();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = c44604a.populateBuilderWithField(c6086a3, c44604a, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        c40593zc.wey = c44604a;
                    }
                    AppMethodBeat.m2505o(56777);
                    return 0;
                default:
                    AppMethodBeat.m2505o(56777);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(56777);
            return -1;
        }
    }
}
