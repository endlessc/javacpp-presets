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

/** \brief common data structure for URI */
@Namespace("dmlc::io") @NoOffset @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class URI extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public URI(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public URI(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public URI position(long position) {
        return (URI)super.position(position);
    }
    @Override public URI getPointer(long i) {
        return new URI((Pointer)this).offsetAddress(i);
    }

  /** \brief protocol */
  public native @StdString BytePointer protocol(); public native URI protocol(BytePointer setter);
  /**
   * \brief host name, namenode for HDFS, bucket name for s3
   */
  public native @StdString BytePointer host(); public native URI host(BytePointer setter);
  /** \brief name of the path */
  public native @StdString BytePointer name(); public native URI name(BytePointer setter);
  /** \brief enable default constructor */
  public URI() { super((Pointer)null); allocate(); }
  private native void allocate();
  /**
   * \brief construct from URI string
   */
  public URI(@Cast("const char*") BytePointer uri) { super((Pointer)null); allocate(uri); }
  private native void allocate(@Cast("const char*") BytePointer uri);
  public URI(String uri) { super((Pointer)null); allocate(uri); }
  private native void allocate(String uri);
  /** \brief string representation */
  public native @StdString BytePointer str();
}
