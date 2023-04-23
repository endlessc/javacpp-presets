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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ FeatureAlphaDropout
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** See the documentation for {@code torch::nn::FeatureAlphaDropoutOptions} class to
 *  learn what constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  FeatureAlphaDropout model(FeatureAlphaDropoutOptions(0.2).inplace(true));
 *  }</pre> */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class FeatureAlphaDropoutImpl extends FeatureAlphaDropoutImplBase {
    static { Loader.load(); }

  
    public FeatureAlphaDropoutImpl(double p) { super((Pointer)null); allocate(p); }
    @NoDeallocator private native void allocate(double p);
  
    public FeatureAlphaDropoutImpl(@Const @ByRef(nullValue = "torch::nn::DropoutOptions{}") DropoutOptions options_) { super((Pointer)null); allocate(options_); }
    @NoDeallocator private native void allocate(@Const @ByRef(nullValue = "torch::nn::DropoutOptions{}") DropoutOptions options_);
    public FeatureAlphaDropoutImpl() { super((Pointer)null); allocate(); }
    @NoDeallocator private native void allocate();
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FeatureAlphaDropoutImpl(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FeatureAlphaDropoutImpl(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public FeatureAlphaDropoutImpl position(long position) {
        return (FeatureAlphaDropoutImpl)super.position(position);
    }
    @Override public FeatureAlphaDropoutImpl getPointer(long i) {
        return new FeatureAlphaDropoutImpl((Pointer)this).offsetAddress(i);
    }


  public native @ByVal Tensor forward(@Const @ByRef Tensor input);

  /** Pretty prints the {@code FeatureAlphaDropout} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);
}
