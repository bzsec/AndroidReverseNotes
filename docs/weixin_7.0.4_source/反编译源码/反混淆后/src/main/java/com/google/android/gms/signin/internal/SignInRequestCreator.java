package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class SignInRequestCreator implements Creator<SignInRequest> {
    public static final int CONTENT_DESCRIPTION = 0;

    public SignInRequest createFromParcel(Parcel parcel) {
        AppMethodBeat.m2504i(61699);
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        ResolveAccountRequest resolveAccountRequest = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 2:
                    resolveAccountRequest = (ResolveAccountRequest) SafeParcelReader.createParcelable(parcel, readHeader, ResolveAccountRequest.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        SignInRequest signInRequest = new SignInRequest(i, resolveAccountRequest);
        AppMethodBeat.m2505o(61699);
        return signInRequest;
    }

    public SignInRequest[] newArray(int i) {
        return new SignInRequest[i];
    }
}
