// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** \} dnnl_api_lrn
 <p>
 *  \addtogroup dnnl_api_batch_normalization
 *  \{
 <p>
 *  A descriptor of a Batch Normalization operation. */
@Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class dnnl_batch_normalization_desc_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public dnnl_batch_normalization_desc_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public dnnl_batch_normalization_desc_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dnnl_batch_normalization_desc_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public dnnl_batch_normalization_desc_t position(long position) {
        return (dnnl_batch_normalization_desc_t)super.position(position);
    }
    @Override public dnnl_batch_normalization_desc_t getPointer(long i) {
        return new dnnl_batch_normalization_desc_t((Pointer)this).position(position + i);
    }

    /** The kind of primitive. Used for self-identifying the primitive
     *  descriptor. Must be #dnnl_batch_normalization. */
    public native @Cast("dnnl_primitive_kind_t") int primitive_kind(); public native dnnl_batch_normalization_desc_t primitive_kind(int setter);
    /** The kind of propagation. Possible values: #dnnl_forward_training,
     *  #dnnl_forward_inference, #dnnl_backward, and #dnnl_backward_data. */
    public native @Cast("dnnl_prop_kind_t") int prop_kind(); public native dnnl_batch_normalization_desc_t prop_kind(int setter);
    /** Source and destination memory descriptor. */
    public native @ByRef dnnl_memory_desc_t data_desc(); public native dnnl_batch_normalization_desc_t data_desc(dnnl_memory_desc_t setter);
    /** Source and destination gradient memory descriptor. */
    
    ///
    public native @ByRef dnnl_memory_desc_t diff_data_desc(); public native dnnl_batch_normalization_desc_t diff_data_desc(dnnl_memory_desc_t setter);
    /** Scale and shift data and gradient memory descriptors.
     * 
     *  Scaleshift memory descriptor uses 2D #dnnl_nc format[2,Channels]. 1-st
     *  dimension contains gamma parameter, 2-nd dimension contains beta
     *  parameter. */
    public native @ByRef dnnl_memory_desc_t data_scaleshift_desc(); public native dnnl_batch_normalization_desc_t data_scaleshift_desc(dnnl_memory_desc_t setter);
    
    ///
    public native @ByRef dnnl_memory_desc_t diff_data_scaleshift_desc(); public native dnnl_batch_normalization_desc_t diff_data_scaleshift_desc(dnnl_memory_desc_t setter);
    /** Statistics memory descriptor.
     * 
     *  Statistics (mean or variance) descriptor use 1D #dnnl_x format[Channels]. */
    public native @ByRef dnnl_memory_desc_t stat_desc(); public native dnnl_batch_normalization_desc_t stat_desc(dnnl_memory_desc_t setter);
    /** Batch normalization epsilon parameter. */
    public native float batch_norm_epsilon(); public native dnnl_batch_normalization_desc_t batch_norm_epsilon(float setter);
    public native @Cast("unsigned") int flags(); public native dnnl_batch_normalization_desc_t flags(int setter);
}
