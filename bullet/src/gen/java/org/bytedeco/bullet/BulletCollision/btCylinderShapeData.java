// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**do not change those serialization structures, it requires an updated sBulletDNAstr/sBulletDNAstr64 */
@Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btCylinderShapeData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btCylinderShapeData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btCylinderShapeData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btCylinderShapeData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btCylinderShapeData position(long position) {
        return (btCylinderShapeData)super.position(position);
    }
    @Override public btCylinderShapeData getPointer(long i) {
        return new btCylinderShapeData((Pointer)this).offsetAddress(i);
    }

	public native @ByRef btConvexInternalShapeData m_convexInternalShapeData(); public native btCylinderShapeData m_convexInternalShapeData(btConvexInternalShapeData setter);

	public native int m_upAxis(); public native btCylinderShapeData m_upAxis(int setter);

	public native @Cast("char") byte m_padding(int i); public native btCylinderShapeData m_padding(int i, byte setter);
	@MemberGetter public native @Cast("char*") BytePointer m_padding();
}