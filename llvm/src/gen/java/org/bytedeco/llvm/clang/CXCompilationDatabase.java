// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.clang;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;

import static org.bytedeco.llvm.global.clang.*;


/** \defgroup COMPILATIONDB CompilationDatabase functions
 * \ingroup CINDEX
 *
 * \{
 */

/**
 * A compilation database holds all information used to compile files in a
 * project. For each file in the database, it can be queried for the working
 * directory or the command line used for the compiler invocation.
 *
 * Must be freed by \c clang_CompilationDatabase_dispose
 */
@Namespace @Name("void") @Opaque @Properties(inherit = org.bytedeco.llvm.presets.clang.class)
public class CXCompilationDatabase extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CXCompilationDatabase() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXCompilationDatabase(Pointer p) { super(p); }
}
