// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tvm;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;

import static org.bytedeco.tvm.global.tvm_runtime.*;


/** \brief Arguments into TVM functions. */
@Namespace("tvm::runtime") @NoOffset @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class TVMArgs extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TVMArgs(Pointer p) { super(p); }

  public native @Const TVMValue values(); public native TVMArgs values(TVMValue setter);
  public native @Const IntPointer type_codes(); public native TVMArgs type_codes(IntPointer setter);
  public native int num_args(); public native TVMArgs num_args(int setter);
  /**
   * \brief constructor
   * @param values The argument values
   * @param type_codes The argument type codes
   * @param num_args number of arguments.
   */
  public TVMArgs(@Const TVMValue values, @Const IntPointer type_codes, int num_args) { super((Pointer)null); allocate(values, type_codes, num_args); }
  private native void allocate(@Const TVMValue values, @Const IntPointer type_codes, int num_args);
  public TVMArgs(@Const TVMValue values, @Const IntBuffer type_codes, int num_args) { super((Pointer)null); allocate(values, type_codes, num_args); }
  private native void allocate(@Const TVMValue values, @Const IntBuffer type_codes, int num_args);
  public TVMArgs(@Const TVMValue values, @Const int[] type_codes, int num_args) { super((Pointer)null); allocate(values, type_codes, num_args); }
  private native void allocate(@Const TVMValue values, @Const int[] type_codes, int num_args);
  /** @return size of the arguments */
  public native int size();
  /**
   * \brief Get i-th argument
   * @param i the index.
   * @return the ith argument.
   */
  public native @ByVal @Name("operator []") TVMArgValue get(int i);
}
