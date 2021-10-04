// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.leptonica.global.lept.*;


@Name("L_Rbtree") @Properties(inherit = org.bytedeco.leptonica.presets.lept.class)
public class L_RBTREE extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public L_RBTREE() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public L_RBTREE(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public L_RBTREE(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public L_RBTREE position(long position) {
        return (L_RBTREE)super.position(position);
    }
    @Override public L_RBTREE getPointer(long i) {
        return new L_RBTREE((Pointer)this).offsetAddress(i);
    }

    public native L_RBTREE_NODE root(); public native L_RBTREE root(L_RBTREE_NODE setter);
    public native @Cast("l_int32") int keytype(); public native L_RBTREE keytype(int setter);
}
