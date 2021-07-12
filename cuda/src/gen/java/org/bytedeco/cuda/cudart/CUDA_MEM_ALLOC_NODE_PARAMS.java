// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * Memory allocation node parameters
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUDA_MEM_ALLOC_NODE_PARAMS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUDA_MEM_ALLOC_NODE_PARAMS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUDA_MEM_ALLOC_NODE_PARAMS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUDA_MEM_ALLOC_NODE_PARAMS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUDA_MEM_ALLOC_NODE_PARAMS position(long position) {
        return (CUDA_MEM_ALLOC_NODE_PARAMS)super.position(position);
    }
    @Override public CUDA_MEM_ALLOC_NODE_PARAMS getPointer(long i) {
        return new CUDA_MEM_ALLOC_NODE_PARAMS((Pointer)this).offsetAddress(i);
    }

    /**
    * in: location where the allocation should reside (specified in ::location).
    * ::handleTypes must be ::CU_MEM_HANDLE_TYPE_NONE. IPC is not supported.
    */
    public native @ByRef @Cast("CUmemPoolProps*") CUmemPoolProps_v1 poolProps(); public native CUDA_MEM_ALLOC_NODE_PARAMS poolProps(CUmemPoolProps_v1 setter);
    /** in: array of memory access descriptors. Used to describe peer GPU access */
    public native @Cast("const CUmemAccessDesc*") CUmemAccessDesc_v1 accessDescs(); public native CUDA_MEM_ALLOC_NODE_PARAMS accessDescs(CUmemAccessDesc_v1 setter);
    /** in: number of memory access descriptors.  Must not exceed the number of GPUs. */
    public native @Cast("size_t") long accessDescCount(); public native CUDA_MEM_ALLOC_NODE_PARAMS accessDescCount(long setter);
    /** in: size in bytes of the requested allocation */
    public native @Cast("size_t") long bytesize(); public native CUDA_MEM_ALLOC_NODE_PARAMS bytesize(long setter);
    /** out: address of the allocation returned by CUDA */
    public native @Cast("CUdeviceptr") long dptr(); public native CUDA_MEM_ALLOC_NODE_PARAMS dptr(long setter);
}