// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief Streaming compressor interface
 *  */
@Namespace("arrow::util") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class Compressor extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Compressor(Pointer p) { super(p); }


  /** \brief Compress some input.
   * 
   *  If bytes_read is 0 on return, then a larger output buffer should be supplied. */
  
  ///
  public native @ByVal Status Compress(@Cast("int64_t") long input_len, @Cast("const uint8_t*") BytePointer input, @Cast("int64_t") long output_len,
                            @Cast("uint8_t*") BytePointer output, @Cast("int64_t*") LongPointer bytes_read,
                            @Cast("int64_t*") LongPointer bytes_written);
  public native @ByVal Status Compress(@Cast("int64_t") long input_len, @Cast("const uint8_t*") ByteBuffer input, @Cast("int64_t") long output_len,
                            @Cast("uint8_t*") ByteBuffer output, @Cast("int64_t*") LongBuffer bytes_read,
                            @Cast("int64_t*") LongBuffer bytes_written);
  public native @ByVal Status Compress(@Cast("int64_t") long input_len, @Cast("const uint8_t*") byte[] input, @Cast("int64_t") long output_len,
                            @Cast("uint8_t*") byte[] output, @Cast("int64_t*") long[] bytes_read,
                            @Cast("int64_t*") long[] bytes_written);

  /** \brief Flush part of the compressed output.
   * 
   *  If should_retry is true on return, Flush() should be called again
   *  with a larger buffer. */
  
  ///
  ///
  public native @ByVal Status Flush(@Cast("int64_t") long output_len, @Cast("uint8_t*") BytePointer output, @Cast("int64_t*") LongPointer bytes_written,
                         @Cast("bool*") BoolPointer should_retry);
  public native @ByVal Status Flush(@Cast("int64_t") long output_len, @Cast("uint8_t*") ByteBuffer output, @Cast("int64_t*") LongBuffer bytes_written,
                         @Cast("bool*") boolean[] should_retry);
  public native @ByVal Status Flush(@Cast("int64_t") long output_len, @Cast("uint8_t*") byte[] output, @Cast("int64_t*") long[] bytes_written,
                         @Cast("bool*") BoolPointer should_retry);
  public native @ByVal Status Flush(@Cast("int64_t") long output_len, @Cast("uint8_t*") BytePointer output, @Cast("int64_t*") LongPointer bytes_written,
                         @Cast("bool*") boolean[] should_retry);
  public native @ByVal Status Flush(@Cast("int64_t") long output_len, @Cast("uint8_t*") ByteBuffer output, @Cast("int64_t*") LongBuffer bytes_written,
                         @Cast("bool*") BoolPointer should_retry);
  public native @ByVal Status Flush(@Cast("int64_t") long output_len, @Cast("uint8_t*") byte[] output, @Cast("int64_t*") long[] bytes_written,
                         @Cast("bool*") boolean[] should_retry);

  /** \brief End compressing, doing whatever is necessary to end the stream.
   * 
   *  If should_retry is true on return, End() should be called again
   *  with a larger buffer.  Otherwise, the Compressor should not be used anymore.
   * 
   *  End() implies Flush(). */
  public native @ByVal Status End(@Cast("int64_t") long output_len, @Cast("uint8_t*") BytePointer output, @Cast("int64_t*") LongPointer bytes_written,
                       @Cast("bool*") BoolPointer should_retry);
  public native @ByVal Status End(@Cast("int64_t") long output_len, @Cast("uint8_t*") ByteBuffer output, @Cast("int64_t*") LongBuffer bytes_written,
                       @Cast("bool*") boolean[] should_retry);
  public native @ByVal Status End(@Cast("int64_t") long output_len, @Cast("uint8_t*") byte[] output, @Cast("int64_t*") long[] bytes_written,
                       @Cast("bool*") BoolPointer should_retry);
  public native @ByVal Status End(@Cast("int64_t") long output_len, @Cast("uint8_t*") BytePointer output, @Cast("int64_t*") LongPointer bytes_written,
                       @Cast("bool*") boolean[] should_retry);
  public native @ByVal Status End(@Cast("int64_t") long output_len, @Cast("uint8_t*") ByteBuffer output, @Cast("int64_t*") LongBuffer bytes_written,
                       @Cast("bool*") BoolPointer should_retry);
  public native @ByVal Status End(@Cast("int64_t") long output_len, @Cast("uint8_t*") byte[] output, @Cast("int64_t*") long[] bytes_written,
                       @Cast("bool*") boolean[] should_retry);

  // XXX add methods for buffer size heuristics?
}