// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Softmax ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies the Softmax function.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.Softmax to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::SoftmaxOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  Softmax model(SoftmaxOptions(1));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SoftmaxImpl extends SoftmaxImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SoftmaxImpl(Pointer p) { super(p); }

  public SoftmaxImpl(@Cast("int64_t") long dim) { super((Pointer)null); allocate(dim); }
  @NoDeallocator private native void allocate(@Cast("int64_t") long dim);
  public SoftmaxImpl(@Const @ByRef SoftmaxOptions options_) { super((Pointer)null); allocate(options_); }
  @NoDeallocator private native void allocate(@Const @ByRef SoftmaxOptions options_);

  public native @ByVal Tensor forward(@Const @ByRef Tensor input);

  public native void reset();

  /** Pretty prints the {@code Softmax} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  public native @ByRef SoftmaxOptions options(); public native SoftmaxImpl options(SoftmaxOptions setter);
}
