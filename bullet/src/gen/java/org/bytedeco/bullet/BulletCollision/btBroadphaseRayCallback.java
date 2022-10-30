// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btBroadphaseRayCallback extends btBroadphaseAabbCallback {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btBroadphaseRayCallback(Pointer p) { super(p); }

	/**added some cached data to accelerate ray-AABB tests */
	public native @ByRef btVector3 m_rayDirectionInverse(); public native btBroadphaseRayCallback m_rayDirectionInverse(btVector3 setter);
	public native @Cast("unsigned int") int m_signs(int i); public native btBroadphaseRayCallback m_signs(int i, int setter);
	@MemberGetter public native @Cast("unsigned int*") IntPointer m_signs();
	public native @Cast("btScalar") double m_lambda_max(); public native btBroadphaseRayCallback m_lambda_max(double setter);
}