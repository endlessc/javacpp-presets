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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~ MultiheadAttention ~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies the MultiheadAttention function element-wise.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.MultiheadAttention
 *  to learn about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::MultiheadAttentionOptions} class to
 *  learn what constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  MultiheadAttention model(MultiheadAttentionOptions(20, 10).bias(false));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class MultiheadAttentionImpl extends MultiheadAttentionImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MultiheadAttentionImpl(Pointer p) { super(p); }

  public MultiheadAttentionImpl(@Cast("int64_t") long embed_dim, @Cast("int64_t") long num_heads) { super((Pointer)null); allocate(embed_dim, num_heads); }
  @NoDeallocator private native void allocate(@Cast("int64_t") long embed_dim, @Cast("int64_t") long num_heads);
  public MultiheadAttentionImpl(@Const @ByRef MultiheadAttentionOptions options_) { super((Pointer)null); allocate(options_); }
  @NoDeallocator private native void allocate(@Const @ByRef MultiheadAttentionOptions options_);

  public native @ByVal TensorTensorTuple forward(
        @Const @ByRef Tensor query,
        @Const @ByRef Tensor key,
        @Const @ByRef Tensor value,
        @Const @ByRef(nullValue = "at::Tensor{}") Tensor key_padding_mask,
        @Cast("bool") boolean need_weights/*=true*/,
        @Const @ByRef(nullValue = "at::Tensor{}") Tensor attn_mask,
        @Cast("bool") boolean average_attn_weights/*=true*/);
  public native @ByVal TensorTensorTuple forward(
        @Const @ByRef Tensor query,
        @Const @ByRef Tensor key,
        @Const @ByRef Tensor value);
  public native void reset();

  public native void _reset_parameters();

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef MultiheadAttentionOptions options(); public native MultiheadAttentionImpl options(MultiheadAttentionOptions setter);

  public native @Cast("bool") boolean _qkv_same_embed_dim(); public native MultiheadAttentionImpl _qkv_same_embed_dim(boolean setter);
  public native @ByRef Tensor in_proj_weight(); public native MultiheadAttentionImpl in_proj_weight(Tensor setter);
  public native @ByRef Tensor in_proj_bias(); public native MultiheadAttentionImpl in_proj_bias(Tensor setter);
  public native @ByRef Tensor bias_k(); public native MultiheadAttentionImpl bias_k(Tensor setter);
  public native @ByRef Tensor bias_v(); public native MultiheadAttentionImpl bias_v(Tensor setter);
  public native @ByRef Linear out_proj(); public native MultiheadAttentionImpl out_proj(Linear setter);
  public native @ByRef Tensor q_proj_weight(); public native MultiheadAttentionImpl q_proj_weight(Tensor setter);
  public native @ByRef Tensor k_proj_weight(); public native MultiheadAttentionImpl k_proj_weight(Tensor setter);
  public native @ByRef Tensor v_proj_weight(); public native MultiheadAttentionImpl v_proj_weight(Tensor setter);
  public native @Cast("int64_t") long head_dim(); public native MultiheadAttentionImpl head_dim(long setter);
}
