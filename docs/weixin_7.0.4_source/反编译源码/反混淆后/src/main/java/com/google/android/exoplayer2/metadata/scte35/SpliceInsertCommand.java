package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.p111i.C32065l;
import com.google.android.exoplayer2.p111i.C45042s;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SpliceInsertCommand extends SpliceCommand {
    public static final Creator<SpliceInsertCommand> CREATOR = new C255461();
    public final long bfF;
    public final boolean bfG;
    public final boolean bfH;
    public final boolean bfI;
    public final boolean bfJ;
    public final long bfK;
    public final long bfL;
    public final List<C37268a> bfM;
    public final boolean bfN;
    public final long bfO;
    public final int bfP;
    public final int bfQ;
    public final int bfR;

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand$1 */
    static class C255461 implements Creator<SpliceInsertCommand> {
        C255461() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new SpliceInsertCommand[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            AppMethodBeat.m2504i(95365);
            SpliceInsertCommand spliceInsertCommand = new SpliceInsertCommand(parcel, (byte) 0);
            AppMethodBeat.m2505o(95365);
            return spliceInsertCommand;
        }
    }

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand$a */
    public static final class C37268a {
        public final int bfS;
        public final long bfT;
        public final long bfU;

        /* synthetic */ C37268a(int i, long j, long j2, byte b) {
            this(i, j, j2);
        }

        C37268a(int i, long j, long j2) {
            this.bfS = i;
            this.bfT = j;
            this.bfU = j2;
        }
    }

    /* synthetic */ SpliceInsertCommand(Parcel parcel, byte b) {
        this(parcel);
    }

    private SpliceInsertCommand(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<C37268a> list, boolean z5, long j4, int i, int i2, int i3) {
        AppMethodBeat.m2504i(95366);
        this.bfF = j;
        this.bfG = z;
        this.bfH = z2;
        this.bfI = z3;
        this.bfJ = z4;
        this.bfK = j2;
        this.bfL = j3;
        this.bfM = Collections.unmodifiableList(list);
        this.bfN = z5;
        this.bfO = j4;
        this.bfP = i;
        this.bfQ = i2;
        this.bfR = i3;
        AppMethodBeat.m2505o(95366);
    }

    private SpliceInsertCommand(Parcel parcel) {
        boolean z;
        boolean z2 = true;
        AppMethodBeat.m2504i(95367);
        this.bfF = parcel.readLong();
        this.bfG = parcel.readByte() == (byte) 1;
        if (parcel.readByte() == (byte) 1) {
            z = true;
        } else {
            z = false;
        }
        this.bfH = z;
        if (parcel.readByte() == (byte) 1) {
            z = true;
        } else {
            z = false;
        }
        this.bfI = z;
        if (parcel.readByte() == (byte) 1) {
            z = true;
        } else {
            z = false;
        }
        this.bfJ = z;
        this.bfK = parcel.readLong();
        this.bfL = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new C37268a(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.bfM = Collections.unmodifiableList(arrayList);
        if (parcel.readByte() != (byte) 1) {
            z2 = false;
        }
        this.bfN = z2;
        this.bfO = parcel.readLong();
        this.bfP = parcel.readInt();
        this.bfQ = parcel.readInt();
        this.bfR = parcel.readInt();
        AppMethodBeat.m2505o(95367);
    }

    /* renamed from: a */
    static SpliceInsertCommand m62538a(C32065l c32065l, long j, C45042s c45042s) {
        boolean z;
        long j2;
        AppMethodBeat.m2504i(95368);
        long cM = c32065l.mo52366cM();
        if ((c32065l.readUnsignedByte() & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        long j3 = -9223372036854775807L;
        List emptyList = Collections.emptyList();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z5 = false;
        if (z) {
            j2 = -9223372036854775807L;
        } else {
            long j4;
            boolean z6;
            int readUnsignedByte = c32065l.readUnsignedByte();
            boolean z7 = (readUnsignedByte & 128) != 0;
            boolean z8 = (readUnsignedByte & 64) != 0;
            Object obj = (readUnsignedByte & 32) != 0 ? 1 : null;
            z4 = (readUnsignedByte & 16) != 0;
            if (z8 && !z4) {
                j3 = TimeSignalCommand.m40387c(c32065l, j);
            }
            if (!z8) {
                i = c32065l.readUnsignedByte();
                emptyList = new ArrayList(i);
                int i4 = 0;
                while (true) {
                    int i5 = i4;
                    if (i5 >= i) {
                        break;
                    }
                    readUnsignedByte = c32065l.readUnsignedByte();
                    j4 = -9223372036854775807L;
                    if (!z4) {
                        j4 = TimeSignalCommand.m40387c(c32065l, j);
                    }
                    emptyList.add(new C37268a(readUnsignedByte, j4, c45042s.mo72551ao(j4), (byte) 0));
                    i4 = i5 + 1;
                }
            }
            if (obj != null) {
                j4 = (long) c32065l.readUnsignedByte();
                z6 = (128 & j4) != 0;
                j4 = ((j4 & 1) << 32) | c32065l.mo52366cM();
            } else {
                j4 = -9223372036854775807L;
                z6 = false;
            }
            i = c32065l.readUnsignedShort();
            i2 = c32065l.readUnsignedByte();
            i3 = c32065l.readUnsignedByte();
            j2 = j4;
            z5 = z6;
            z3 = z8;
            z2 = z7;
        }
        SpliceInsertCommand spliceInsertCommand = new SpliceInsertCommand(cM, z, z2, z3, z4, j3, c45042s.mo72551ao(j3), emptyList, z5, j2, i, i2, i3);
        AppMethodBeat.m2505o(95368);
        return spliceInsertCommand;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        int i3 = 1;
        AppMethodBeat.m2504i(95369);
        parcel.writeLong(this.bfF);
        parcel.writeByte((byte) (this.bfG ? 1 : 0));
        if (this.bfH) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeByte((byte) i2);
        if (this.bfI) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeByte((byte) i2);
        if (this.bfJ) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeByte((byte) i2);
        parcel.writeLong(this.bfK);
        parcel.writeLong(this.bfL);
        int size = this.bfM.size();
        parcel.writeInt(size);
        for (int i4 = 0; i4 < size; i4++) {
            C37268a c37268a = (C37268a) this.bfM.get(i4);
            parcel.writeInt(c37268a.bfS);
            parcel.writeLong(c37268a.bfT);
            parcel.writeLong(c37268a.bfU);
        }
        if (!this.bfN) {
            i3 = 0;
        }
        parcel.writeByte((byte) i3);
        parcel.writeLong(this.bfO);
        parcel.writeInt(this.bfP);
        parcel.writeInt(this.bfQ);
        parcel.writeInt(this.bfR);
        AppMethodBeat.m2505o(95369);
    }

    static {
        AppMethodBeat.m2504i(95370);
        AppMethodBeat.m2505o(95370);
    }
}
