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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~ AdaptiveMaxPool2d ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies adaptive maxpool over a 2-D input.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.AdaptiveMaxPool2d to
 *  learn about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::AdaptiveMaxPool2dOptions} class to
 *  learn what constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  AdaptiveMaxPool2d model(AdaptiveMaxPool2dOptions({3, 2}));
 *  }</pre> */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class AdaptiveMaxPool2dImpl extends AdaptiveMaxPool2dImplBase {
    static { Loader.load(); }

  
    public AdaptiveMaxPool2dImpl(@ByVal @Cast("torch::ExpandingArrayWithOptionalElem<2>*") LongOptional output_size) { super((Pointer)null); allocate(output_size); }
    @NoDeallocator private native void allocate(@ByVal @Cast("torch::ExpandingArrayWithOptionalElem<2>*") LongOptional output_size);
    public AdaptiveMaxPool2dImpl(
          @Const @ByRef AdaptiveMaxPool2dOptions options_) { super((Pointer)null); allocate(options_); }
    @NoDeallocator private native void allocate(
          @Const @ByRef AdaptiveMaxPool2dOptions options_);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AdaptiveMaxPool2dImpl(Pointer p) { super(p); }


  public native @ByVal Tensor forward(@Const @ByRef Tensor input);

  /** Returns the indices along with the outputs.
   *  Useful to pass to nn.MaxUnpool2d. */
  public native @ByVal TensorTensorTuple forward_with_indices(@Const @ByRef Tensor input);
}
