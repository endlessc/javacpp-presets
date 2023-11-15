// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvcomp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvcomp.*;

// #endif

/**
 * \brief Structure for configuring LZ4 compression.
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvcomp.class)
public class nvcompLZ4FormatOpts extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvcompLZ4FormatOpts() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvcompLZ4FormatOpts(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvcompLZ4FormatOpts(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvcompLZ4FormatOpts position(long position) {
        return (nvcompLZ4FormatOpts)super.position(position);
    }
    @Override public nvcompLZ4FormatOpts getPointer(long i) {
        return new nvcompLZ4FormatOpts((Pointer)this).offsetAddress(i);
    }

  /**
   * \brief The size of each chunk of data to decompress indepentently with
   * LZ4. Must be within the range of [32768, 16777216]. Larger sizes will
   * result in higher compression, but with decreased parallelism. The
   * recommended size is 65536.
   */
  public native @Cast("size_t") long chunk_size(); public native nvcompLZ4FormatOpts chunk_size(long setter);
}
