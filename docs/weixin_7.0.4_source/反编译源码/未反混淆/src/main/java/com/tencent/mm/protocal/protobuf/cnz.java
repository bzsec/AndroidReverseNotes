package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class cnz extends btd {
    public int fJT;
    public LinkedList<bts> vEg = new LinkedList();
    public int wnW;
    public String xlz;

    public cnz() {
        AppMethodBeat.i(116815);
        AppMethodBeat.o(116815);
    }

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(116816);
        b bVar;
        int ix;
        byte[] bArr;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(116816);
                throw bVar;
            }
            if (this.BaseResponse != null) {
                aVar.iy(1, this.BaseResponse.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.iz(2, this.fJT);
            aVar.iz(3, this.wnW);
            aVar.e(4, 8, this.vEg);
            if (this.xlz != null) {
                aVar.e(5, this.xlz);
            }
            AppMethodBeat.o(116816);
            return 0;
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            ix = ((ix + e.a.a.b.b.a.bs(2, this.fJT)) + e.a.a.b.b.a.bs(3, this.wnW)) + e.a.a.a.c(4, 8, this.vEg);
            if (this.xlz != null) {
                ix += e.a.a.b.b.a.f(5, this.xlz);
            }
            AppMethodBeat.o(116816);
            return ix;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.vEg.clear();
            e.a.a.a.a aVar2 = new e.a.a.a.a(bArr, unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(116816);
                throw bVar;
            }
            AppMethodBeat.o(116816);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            cnz cnz = (cnz) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            e.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        BaseResponse baseResponse = new BaseResponse();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = baseResponse.populateBuilderWithField(aVar4, baseResponse, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        cnz.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.o(116816);
                    return 0;
                case 2:
                    cnz.fJT = aVar3.BTU.vd();
                    AppMethodBeat.o(116816);
                    return 0;
                case 3:
                    cnz.wnW = aVar3.BTU.vd();
                    AppMethodBeat.o(116816);
                    return 0;
                case 4:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        bts bts = new bts();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = bts.populateBuilderWithField(aVar4, bts, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        cnz.vEg.add(bts);
                    }
                    AppMethodBeat.o(116816);
                    return 0;
                case 5:
                    cnz.xlz = aVar3.BTU.readString();
                    AppMethodBeat.o(116816);
                    return 0;
                default:
                    AppMethodBeat.o(116816);
                    return -1;
            }
        } else {
            AppMethodBeat.o(116816);
            return -1;
        }
    }
}
