// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnxruntime;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;

import static org.bytedeco.onnxruntime.global.onnxruntime.*;

@Name("Ort::Base<OrtMapTypeInfo>") @NoOffset @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class BaseMapTypeInfo extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseMapTypeInfo(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BaseMapTypeInfo(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BaseMapTypeInfo position(long position) {
        return (BaseMapTypeInfo)super.position(position);
    }
    @Override public BaseMapTypeInfo getPointer(long i) {
        return new BaseMapTypeInfo((Pointer)this).offsetAddress(i);
    }


  public BaseMapTypeInfo() { super((Pointer)null); allocate(); }
  private native void allocate();
  public BaseMapTypeInfo(OrtMapTypeInfo p) { super((Pointer)null); allocate(p); }
  private native void allocate(OrtMapTypeInfo p);

  public native @Name("operator OrtMapTypeInfo*") OrtMapTypeInfo asOrtMapTypeInfo();

  public native OrtMapTypeInfo release();
}
