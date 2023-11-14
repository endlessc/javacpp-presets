// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


// Callback to be invoked when a watched dict is cleared, dealloced, or modified.
// In clear/dealloc case, key and new_value will be NULL. Otherwise, new_value will be the
// new value for key, NULL if key is being deleted.
@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyDict_WatchCallback extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    PyDict_WatchCallback(Pointer p) { super(p); }
    protected PyDict_WatchCallback() { allocate(); }
    private native void allocate();
    public native int call(@Cast("PyDict_WatchEvent") int event, PyObject dict, PyObject key, PyObject new_value);
}