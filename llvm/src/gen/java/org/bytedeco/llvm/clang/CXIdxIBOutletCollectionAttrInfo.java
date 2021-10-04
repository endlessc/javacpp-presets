// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.clang;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;

import static org.bytedeco.llvm.global.clang.*;


@Properties(inherit = org.bytedeco.llvm.presets.clang.class)
public class CXIdxIBOutletCollectionAttrInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXIdxIBOutletCollectionAttrInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CXIdxIBOutletCollectionAttrInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXIdxIBOutletCollectionAttrInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CXIdxIBOutletCollectionAttrInfo position(long position) {
        return (CXIdxIBOutletCollectionAttrInfo)super.position(position);
    }
    @Override public CXIdxIBOutletCollectionAttrInfo getPointer(long i) {
        return new CXIdxIBOutletCollectionAttrInfo((Pointer)this).offsetAddress(i);
    }

  public native @Const CXIdxAttrInfo attrInfo(); public native CXIdxIBOutletCollectionAttrInfo attrInfo(CXIdxAttrInfo setter);
  public native @Const CXIdxEntityInfo objcClass(); public native CXIdxIBOutletCollectionAttrInfo objcClass(CXIdxEntityInfo setter);
  public native @ByRef CXCursor classCursor(); public native CXIdxIBOutletCollectionAttrInfo classCursor(CXCursor setter);
  public native @ByRef CXIdxLoc classLoc(); public native CXIdxIBOutletCollectionAttrInfo classLoc(CXIdxLoc setter);
}
