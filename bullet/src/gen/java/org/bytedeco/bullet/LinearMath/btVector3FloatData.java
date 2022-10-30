// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.LinearMath;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.LinearMath.*;


@Properties(inherit = org.bytedeco.bullet.presets.LinearMath.class)
public class btVector3FloatData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btVector3FloatData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btVector3FloatData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btVector3FloatData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btVector3FloatData position(long position) {
        return (btVector3FloatData)super.position(position);
    }
    @Override public btVector3FloatData getPointer(long i) {
        return new btVector3FloatData((Pointer)this).offsetAddress(i);
    }

	public native float m_floats(int i); public native btVector3FloatData m_floats(int i, float setter);
	@MemberGetter public native FloatPointer m_floats();
}