// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.llvm.global.LLVM.*;


/**
 * Represents an evaluated symbol address and flags.
 */
@Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class LLVMJITEvaluatedSymbol extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public LLVMJITEvaluatedSymbol() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public LLVMJITEvaluatedSymbol(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LLVMJITEvaluatedSymbol(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public LLVMJITEvaluatedSymbol position(long position) {
        return (LLVMJITEvaluatedSymbol)super.position(position);
    }
    @Override public LLVMJITEvaluatedSymbol getPointer(long i) {
        return new LLVMJITEvaluatedSymbol((Pointer)this).offsetAddress(i);
    }

  public native @Cast("LLVMOrcExecutorAddress") long Address(); public native LLVMJITEvaluatedSymbol Address(long setter);
  public native @ByRef LLVMJITSymbolFlags Flags(); public native LLVMJITEvaluatedSymbol Flags(LLVMJITSymbolFlags setter);
}
