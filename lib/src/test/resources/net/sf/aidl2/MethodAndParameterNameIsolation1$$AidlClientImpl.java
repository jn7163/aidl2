// AUTO-GENERATED FILE.  DO NOT MODIFY.
package net.sf.aidl2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.lang.Deprecated;
import java.lang.Override;
import java.lang.String;

/**
 * Perform IPC calls according to the interface contract.
 *
 * You can create instances of this class, using {@link InterfaceLoader}.
 *
 * @deprecated — do not use this class directly in your Java code (see above)
 */
@Deprecated
public final class MethodAndParamNameIsolation1$$AidlClientImpl implements MethodAndParamNameIsolation1 {
    private final IBinder delegate;

    public MethodAndParamNameIsolation1$$AidlClientImpl(IBinder delegate) {
        this.delegate = delegate;
    }

    @Override
    public IBinder asBinder() {
        return delegate;
    }

    @Override
    public void bigDeal(String theStringVariable) throws RemoteException {
        Parcel data = Parcel.obtain();
        Parcel reply = Parcel.obtain();
        try {
            data.writeInterfaceToken(MethodAndParamNameIsolation1$$AidlServerImpl.DESCRIPTOR);

            data.writeString(theStringVariable);

            delegate.transact(MethodAndParamNameIsolation1$$AidlServerImpl.TRANSACT_bigDeal, data, reply, 0);
            reply.readException();
        } finally {
            data.recycle();
            reply.recycle();
        }
    }

    @Override
    public void bigDeal(String theStringVariable, String anotherString) throws RemoteException {
        Parcel data = Parcel.obtain();
        Parcel reply = Parcel.obtain();
        try {
            data.writeInterfaceToken(MethodAndParamNameIsolation1$$AidlServerImpl.DESCRIPTOR);

            data.writeString(theStringVariable);

            data.writeString(anotherString);

            delegate.transact(MethodAndParamNameIsolation1$$AidlServerImpl.TRANSACT_bigDeal, data, reply, 0);
            reply.readException();
        } finally {
            data.recycle();
            reply.recycle();
        }
    }

    @Override
    public void bigDeal(String theStringVariable, String anotherString, cunningType cunningType) throws RemoteException {
        Parcel data = Parcel.obtain();
        Parcel reply = Parcel.obtain();
        try {
            data.writeInterfaceToken(MethodAndParamNameIsolation1$$AidlServerImpl.DESCRIPTOR);

            data.writeString(theStringVariable);

            data.writeString(anotherString);

            data.writeSerializable(cunningType);

            delegate.transact(MethodAndParamNameIsolation1$$AidlServerImpl.TRANSACT_bigDeal, data, reply, 0);
            reply.readException();
        } finally {
            data.recycle();
            reply.recycle();
        }
    }

    @Override
    public void cunningType(String theStringVariable, String anotherString, cunningType cunningType, MethodAndParamNameIsolation2 MethodAndParamNameIsolation2) throws RemoteException {
        Parcel data = Parcel.obtain();
        Parcel reply = Parcel.obtain();
        try {
            data.writeInterfaceToken(MethodAndParamNameIsolation1$$AidlServerImpl.DESCRIPTOR);

            data.writeString(theStringVariable);

            data.writeString(anotherString);

            data.writeSerializable(cunningType);

            data.writeStrongBinder(MethodAndParamNameIsolation2 == null ? null : MethodAndParamNameIsolation2.asBinder());

            delegate.transact(MethodAndParamNameIsolation1$$AidlServerImpl.TRANSACT_cunningType, data, reply, 0);
            reply.readException();
        } finally {
            data.recycle();
            reply.recycle();
        }
    }

    @Override
    public void cunningType(String theStringVariable, String anotherString, cunningType cunningType, MethodAndParamNameIsolation2 MethodAndParamNameIsolation2, RemoteException... RemoteException) throws RemoteException {
        Parcel data = Parcel.obtain();
        Parcel reply = Parcel.obtain();
        try {
            data.writeInterfaceToken(MethodAndParamNameIsolation1$$AidlServerImpl.DESCRIPTOR);

            data.writeString(theStringVariable);

            data.writeString(anotherString);

            data.writeSerializable(cunningType);

            data.writeStrongBinder(MethodAndParamNameIsolation2 == null ? null : MethodAndParamNameIsolation2.asBinder());

            data.writeSerializable(RemoteException);

            delegate.transact(MethodAndParamNameIsolation1$$AidlServerImpl.TRANSACT_cunningType, data, reply, 0);
            reply.readException();
        } finally {
            data.recycle();
            reply.recycle();
        }
    }
}
