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


/**
 * \brief Internal base class to
 *  handle conversion to POD values.
 */
@Namespace("tvm::runtime") @NoOffset @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class TVMPODValue_ extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TVMPODValue_(Pointer p) { super(p); }

  public native @Name("operator double") double asDouble();
  public native @Cast("int64_t") @Name("operator int64_t") long asLong();
  public native @Name("operator int") int asInt();
  public native @Cast("bool") @Name("operator bool") boolean asBoolean();
  public native @Name("operator void*") Pointer asPointer();
  public native @Name("operator DLTensor*") DLTensor asDLTensor();
  public native @ByVal @Name("operator tvm::runtime::NDArray") NDArray asNDArray();
  public native @ByVal @Name("operator tvm::runtime::Module") Module asModule();
  public native @ByVal @Cast("TVMContext*") @Name("operator TVMContext") DLContext asDLContext();
  public native int type_code();
  /**
   * \brief return handle as specific pointer type.
   * \tparam T the data type.
   * @return The pointer type.
   */
  // ObjectRef handling
}
