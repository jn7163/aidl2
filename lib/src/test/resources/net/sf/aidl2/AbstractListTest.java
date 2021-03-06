package net.sf.aidl2;

import android.os.Binder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.SizeF;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@AIDL("net.sf.aidl2.AbstractListTest")
public interface AbstractListTest extends IInterface {
    Collection<AbstractListTest> methodWithCollectionReturn(AbstractList<SizeF> abstrList) throws RemoteException;
}
