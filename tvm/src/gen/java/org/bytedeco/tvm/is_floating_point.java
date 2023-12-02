// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tvm;

import org.bytedeco.tvm.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.tvm.global.tvm_runtime.*;


@Name("dmlc::is_floating_point<float>") @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class is_floating_point extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public is_floating_point() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public is_floating_point(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public is_floating_point(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public is_floating_point position(long position) {
        return (is_floating_point)super.position(position);
    }
    @Override public is_floating_point getPointer(long i) {
        return new is_floating_point((Pointer)this).offsetAddress(i);
    }

    @MemberGetter public static native @Cast("const bool") boolean value();
    public static final boolean value = value();
  }
