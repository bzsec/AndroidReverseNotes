package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;

public final class cvx extends a {
    public int vAS;
    public String wBw;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(96318);
        int bs;
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            aVar.iz(1, this.vAS);
            if (this.wBw != null) {
                aVar.e(2, this.wBw);
            }
            AppMethodBeat.o(96318);
            return 0;
        } else if (i == 1) {
            bs = e.a.a.b.b.a.bs(1, this.vAS) + 0;
            if (this.wBw != null) {
                bs += e.a.a.b.b.a.f(2, this.wBw);
            }
            AppMethodBeat.o(96318);
            return bs;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (bs = a.getNextFieldNumber(aVar2); bs > 0; bs = a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, bs)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(96318);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            cvx cvx = (cvx) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    cvx.vAS = aVar3.BTU.vd();
                    AppMethodBeat.o(96318);
                    return 0;
                case 2:
                    cvx.wBw = aVar3.BTU.readString();
                    AppMethodBeat.o(96318);
                    return 0;
                default:
                    AppMethodBeat.o(96318);
                    return -1;
            }
        } else {
            AppMethodBeat.o(96318);
            return -1;
        }
    }
}
