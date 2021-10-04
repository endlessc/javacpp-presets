// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.llvm.global.LLVM.*;


/*===-- Operations on memory managers -------------------------------------===*/

@Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class LLVMMemoryManagerAllocateCodeSectionCallback extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    LLVMMemoryManagerAllocateCodeSectionCallback(Pointer p) { super(p); }
    protected LLVMMemoryManagerAllocateCodeSectionCallback() { allocate(); }
    private native void allocate();
    public native @Cast("uint8_t*") BytePointer call(
  Pointer Opaque, @Cast("uintptr_t") long Size, @Cast("unsigned") int Alignment, @Cast("unsigned") int SectionID,
  @Cast("const char*") BytePointer SectionName);
}
