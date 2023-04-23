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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ReflectionPad3d
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies ReflectionPad over a 3-D input.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.ReflectionPad3d to
 *  learn about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::ReflectionPad3dOptions} class to learn
 *  what constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  ReflectionPad3d model(ReflectionPad3dOptions(1));
 *  ReflectionPad3d model(ReflectionPad3dOptions({1, 1, 2, 0, 1, 2}));
 *  }</pre> */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ReflectionPad3dImpl extends ReflectionPad3dImplBase {
    static { Loader.load(); }

  
    public ReflectionPad3dImpl(@ByVal @Cast("torch::ExpandingArray<3*2>*") LongPointer padding) { super((Pointer)null); allocate(padding); }
    @NoDeallocator private native void allocate(@ByVal @Cast("torch::ExpandingArray<3*2>*") LongPointer padding);
    public ReflectionPad3dImpl(@Const @ByRef ReflectionPad3dOptions options_) { super((Pointer)null); allocate(options_); }
    @NoDeallocator private native void allocate(@Const @ByRef ReflectionPad3dOptions options_);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ReflectionPad3dImpl(Pointer p) { super(p); }

}
