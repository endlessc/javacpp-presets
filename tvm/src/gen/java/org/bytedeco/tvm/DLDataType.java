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


/**
 * \brief The data type the tensor can hold. The data type is assumed to follow the
 * native endian-ness. An explicit error message should be raised when attempting to
 * export an array with non-native endianness
 *
 *  Examples
 *   - float: type_code = 2, bits = 32, lanes=1
 *   - float4(vectorized 4 float): type_code = 2, bits = 32, lanes=4
 *   - int8: type_code = 0, bits = 8, lanes=1
 *   - std::complex<float>: type_code = 5, bits = 64, lanes = 1
 */
@Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class DLDataType extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public DLDataType() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DLDataType(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DLDataType(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public DLDataType position(long position) {
        return (DLDataType)super.position(position);
    }
    @Override public DLDataType getPointer(long i) {
        return new DLDataType((Pointer)this).offsetAddress(i);
    }

  /**
   * \brief Type code of base types.
   * We keep it uint8_t instead of DLDataTypeCode for minimal memory
   * footprint, but the value should be one of DLDataTypeCode enum values.
   * */
  public native @Cast("uint8_t") byte code(); public native DLDataType code(byte setter);
  /**
   * \brief Number of bits, common choices are 8, 16, 32.
   */
  public native @Cast("uint8_t") byte bits(); public native DLDataType bits(byte setter);
  /** \brief Number of lanes in the type, used for vector types. */
  public native @Cast("uint16_t") short lanes(); public native DLDataType lanes(short setter);
}
