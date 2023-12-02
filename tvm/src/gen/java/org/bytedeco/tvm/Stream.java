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
 * \brief interface of stream I/O for serialization
 */
@Namespace("dmlc") @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class Stream extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Stream(Pointer p) { super(p); }

  /**
   * \brief reads data from a stream
   * @param ptr pointer to a memory buffer
   * @param size block size
   * @return the size of data read
   */
  public native @Cast("size_t") long Read(Pointer ptr, @Cast("size_t") long size);
  /**
   * \brief writes data to a stream
   * @param ptr pointer to a memory buffer
   * @param size block size
   */
  public native void Write(@Const Pointer ptr, @Cast("size_t") long size);
  /** \brief virtual destructor */
  /**
   * \brief generic factory function
   *  create an stream, the stream will close the underlying files upon deletion
   *
   * @param uri the uri of the input currently we support
   *            hdfs://, s3://, and file:// by default file:// will be used
   * @param flag can be "w", "r", "a"
   * @param allow_null whether NULL can be returned, or directly report error
   * @return the created stream, can be NULL when allow_null == true and file do not exist
   */
  
  // helper functions to write/read different data structures
  /**
   * \brief writes a data to stream.
   *
   * dmlc::Stream support Write/Read of most STL composites and base types.
   * If the data type is not supported, a compile time error will be issued.
   *
   * This function is endian-aware,
   * the output endian defined by DMLC_IO_USE_LITTLE_ENDIAN
   *
   * @param data data to be written
   * \tparam T the data type to be written
   */
  /**
   * \brief loads a data from stream.
   *
   * dmlc::Stream support Write/Read of most STL composites and base types.
   * If the data type is not supported, a compile time error will be issued.
   *
   * This function is endian-aware,
   * the input endian defined by DMLC_IO_USE_LITTLE_ENDIAN
   *
   * @param out_data place holder of data to be deserialized
   * @return whether the load was successful
   */
  /**
   * \brief Endian aware write array of data.
   * @param data The data pointer
   * @param num_elems Number of elements
   * \tparam T the data type.
   */
  /**
   * \brief Endian aware read array of data.
   * @param data The data pointer
   * @param num_elems Number of elements
   * \tparam T the data type.
   * @return whether the load was successful
   */
}
