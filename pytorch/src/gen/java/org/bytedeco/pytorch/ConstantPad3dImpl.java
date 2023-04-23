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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ConstantPad3d ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies ConstantPad over a 3-D input.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.ConstantPad3d to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::ConstantPad3dOptions} class to learn
 *  what constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  ConstantPad3d model(ConstantPad3dOptions({1, 2, 1, 2, 1, 2}, 3.5));
 *  }</pre> */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ConstantPad3dImpl extends ConstantPad3dImplBase {
    static { Loader.load(); }

  
    public ConstantPad3dImpl(@ByVal @Cast("torch::ExpandingArray<3*2>*") LongPointer padding, double value) { super((Pointer)null); allocate(padding, value); }
    @NoDeallocator private native void allocate(@ByVal @Cast("torch::ExpandingArray<3*2>*") LongPointer padding, double value);
    public ConstantPad3dImpl(@Const @ByRef ConstantPad3dOptions options_) { super((Pointer)null); allocate(options_); }
    @NoDeallocator private native void allocate(@Const @ByRef ConstantPad3dOptions options_);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ConstantPad3dImpl(Pointer p) { super(p); }

}
