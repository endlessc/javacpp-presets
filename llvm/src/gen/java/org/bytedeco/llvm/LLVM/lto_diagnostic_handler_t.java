// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.llvm.global.LLVM.*;


/**
 * Diagnostic handler type.
 * \p severity defines the severity.
 * \p diag is the actual diagnostic.
 * The diagnostic is not prefixed by any of severity keyword, e.g., 'error: '.
 * \p ctxt is used to pass the context set with the diagnostic handler.
 *
 * @since LTO_API_VERSION=7
 */
@Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class lto_diagnostic_handler_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    lto_diagnostic_handler_t(Pointer p) { super(p); }
    protected lto_diagnostic_handler_t() { allocate(); }
    private native void allocate();
    public native void call(
    @Cast("lto_codegen_diagnostic_severity_t") int severity, @Cast("const char*") BytePointer diag, Pointer ctxt);
}
