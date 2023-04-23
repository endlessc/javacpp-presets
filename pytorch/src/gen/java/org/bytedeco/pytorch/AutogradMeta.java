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
 // namespace impl

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//                            AutogradMeta
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Each {@code Variable} has one unique {@code AutogradMeta} struct, which stores autograd
 *  metadata fields that are necessary for tracking the Variable's autograd
 *  history. As an optimization, a Variable may store a nullptr, in lieu of a
 *  default constructed AutogradMeta. */

@Namespace("torch::autograd") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class AutogradMeta extends AutogradMetaInterface {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AutogradMeta(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AutogradMeta(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public AutogradMeta position(long position) {
        return (AutogradMeta)super.position(position);
    }
    @Override public AutogradMeta getPointer(long i) {
        return new AutogradMeta((Pointer)this).offsetAddress(i);
    }

  public native @StdString BytePointer name_(); public native AutogradMeta name_(BytePointer setter);

  public native @ByRef @Cast("torch::autograd::Variable*") Tensor grad_(); public native AutogradMeta grad_(Tensor setter);
  public native @SharedPtr Node grad_fn_(); public native AutogradMeta grad_fn_(Node setter);

  // This field is used to store all the forward AD gradients
  // associated with this AutogradMeta (and the Tensor it corresponds to)
  // There is a semantic 1:1 correspondence between AutogradMeta and
  // ForwardGrad but:
  //   - This field is lazily populated.
  //   - This field is a shared_ptr but it must never be
  //     shared by multiple Tensors. See Note [ Using ForwardGrad ]
  // Any transition from not_initialized to initialized
  // must be protected by mutex_
  public native @SharedPtr ForwardGrad fw_grad_(); public native AutogradMeta fw_grad_(ForwardGrad setter);

  // The hooks_ field is actually reused by both python and cpp logic
  // For both cases, we have a data structure, cpp_hooks_list_ (cpp)
  // or dict (python) which is the canonical copy.
  // Then, for both cases, we always register a single hook to
  // hooks_ which wraps all the hooks in the list/dict.
  // And, again in both cases, if the grad_fn exists on that tensor
  // we will additionally register a single hook to the grad_fn.
  //
  // Note that the cpp and python use cases aren't actually aware of
  // each other, so using both is not defined behavior.
  
  

  // Only meaningful on leaf variables (must be false otherwise)
  public native @Cast("bool") boolean requires_grad_(); public native AutogradMeta requires_grad_(boolean setter);

  // Only meaningful on non-leaf variables (must be false otherwise)
  public native @Cast("bool") boolean retains_grad_(); public native AutogradMeta retains_grad_(boolean setter);

  public native @Cast("bool") boolean is_view_(); public native AutogradMeta is_view_(boolean setter);

  // The "output number" of this variable; e.g., if this variable
  // was the second output of a function, then output_nr == 1.
  // We use this to make sure we can setup the backwards trace
  // correctly when this variable is passed to another function.
  public native @Cast("uint32_t") int output_nr_(); public native AutogradMeta output_nr_(int setter);

  // Mutex to ensure that concurrent read operations that modify internal
  // state are still thread-safe. Used by grad_fn(), grad_accumulator(),
  // fw_grad() and set_fw_grad()
  // This is mutable because we need to be able to acquire this from const
  // version of this class for the functions above

  /** Sets the {@code requires_grad} property of {@code Variable}. This should be true for
   *  leaf variables that want to accumulate gradients, and false for all other
   *  variables. */
  public native void set_requires_grad(@Cast("bool") boolean requires_grad, TensorImpl self_impl);

  public native @Cast("bool") boolean requires_grad();

  /** Accesses the gradient {@code Variable} of this {@code Variable}. */
  public native @Cast("torch::autograd::Variable*") @ByRef Tensor mutable_grad();

  public native @Cast("const torch::autograd::Variable*") @ByRef Tensor grad();

  public native @Cast("const torch::autograd::Variable*") @ByRef Tensor fw_grad(@Cast("uint64_t") long level, @Const @ByRef TensorBase self);

  public native void set_fw_grad(
        @Const @ByRef TensorBase new_grad,
        @Const @ByRef TensorBase self,
        @Cast("uint64_t") long level,
        @Cast("bool") boolean is_inplace_op);

  public AutogradMeta(
        TensorImpl self_impl/*=nullptr*/,
        @Cast("bool") boolean requires_grad/*=false*/,
        @ByVal(nullValue = "torch::autograd::Edge()") Edge gradient_edge) { super((Pointer)null); allocate(self_impl, requires_grad, gradient_edge); }
  private native void allocate(
        TensorImpl self_impl/*=nullptr*/,
        @Cast("bool") boolean requires_grad/*=false*/,
        @ByVal(nullValue = "torch::autograd::Edge()") Edge gradient_edge);
  public AutogradMeta() { super((Pointer)null); allocate(); }
  private native void allocate();
}
