// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.leptonica.global.lept.*;


/** Array of Boxa */
@Name("Boxaa") @Properties(inherit = org.bytedeco.leptonica.presets.lept.class)
public class BOXAA extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public BOXAA() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BOXAA(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BOXAA(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public BOXAA position(long position) {
        return (BOXAA)super.position(position);
    }
    @Override public BOXAA getPointer(long i) {
        return new BOXAA((Pointer)this).offsetAddress(i);
    }

    /** number of boxa in ptr array       */
    public native @Cast("l_int32") int n(); public native BOXAA n(int setter);
    /** number of boxa ptrs allocated     */
    public native @Cast("l_int32") int nalloc(); public native BOXAA nalloc(int setter);
    /** boxa ptr array                    */
    public native BOXA boxa(int i); public native BOXAA boxa(int i, BOXA setter);
    public native @Cast("Boxa**") PointerPointer boxa(); public native BOXAA boxa(PointerPointer setter);
}
