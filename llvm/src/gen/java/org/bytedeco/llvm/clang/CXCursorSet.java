// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.clang;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;

import static org.bytedeco.llvm.global.clang.*;


/**
 * A fast container representing a set of CXCursors.
 */
@Name("CXCursorSetImpl") @Opaque @Properties(inherit = org.bytedeco.llvm.presets.clang.class)
public class CXCursorSet extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CXCursorSet() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXCursorSet(Pointer p) { super(p); }
}
