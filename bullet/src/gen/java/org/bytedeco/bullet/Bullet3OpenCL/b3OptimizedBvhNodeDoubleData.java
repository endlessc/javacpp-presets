// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3OpenCL;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;
import org.bytedeco.bullet.Bullet3Collision.*;
import static org.bytedeco.bullet.global.Bullet3Collision.*;
import org.bytedeco.bullet.Bullet3Dynamics.*;
import static org.bytedeco.bullet.global.Bullet3Dynamics.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.Bullet3OpenCL.*;


@Properties(inherit = org.bytedeco.bullet.presets.Bullet3OpenCL.class)
public class b3OptimizedBvhNodeDoubleData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b3OptimizedBvhNodeDoubleData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3OptimizedBvhNodeDoubleData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3OptimizedBvhNodeDoubleData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b3OptimizedBvhNodeDoubleData position(long position) {
        return (b3OptimizedBvhNodeDoubleData)super.position(position);
    }
    @Override public b3OptimizedBvhNodeDoubleData getPointer(long i) {
        return new b3OptimizedBvhNodeDoubleData((Pointer)this).offsetAddress(i);
    }

	public native @ByRef b3Vector3DoubleData m_aabbMinOrg(); public native b3OptimizedBvhNodeDoubleData m_aabbMinOrg(b3Vector3DoubleData setter);
	public native @ByRef b3Vector3DoubleData m_aabbMaxOrg(); public native b3OptimizedBvhNodeDoubleData m_aabbMaxOrg(b3Vector3DoubleData setter);
	public native int m_escapeIndex(); public native b3OptimizedBvhNodeDoubleData m_escapeIndex(int setter);
	public native int m_subPart(); public native b3OptimizedBvhNodeDoubleData m_subPart(int setter);
	public native int m_triangleIndex(); public native b3OptimizedBvhNodeDoubleData m_triangleIndex(int setter);
	public native @Cast("char") byte m_pad(int i); public native b3OptimizedBvhNodeDoubleData m_pad(int i, byte setter);
	@MemberGetter public native @Cast("char*") BytePointer m_pad();
}