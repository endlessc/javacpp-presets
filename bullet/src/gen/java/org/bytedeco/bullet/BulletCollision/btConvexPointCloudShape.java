// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**The btConvexPointCloudShape implements an implicit convex hull of an array of vertices. */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btConvexPointCloudShape extends btPolyhedralConvexAabbCachingShape {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btConvexPointCloudShape(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btConvexPointCloudShape(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btConvexPointCloudShape position(long position) {
        return (btConvexPointCloudShape)super.position(position);
    }
    @Override public btConvexPointCloudShape getPointer(long i) {
        return new btConvexPointCloudShape((Pointer)this).offsetAddress(i);
    }


	public btConvexPointCloudShape() { super((Pointer)null); allocate(); }
	private native void allocate();

	public btConvexPointCloudShape(btVector3 points, int numPoints, @Const @ByRef btVector3 localScaling, @Cast("bool") boolean computeAabb/*=true*/) { super((Pointer)null); allocate(points, numPoints, localScaling, computeAabb); }
	private native void allocate(btVector3 points, int numPoints, @Const @ByRef btVector3 localScaling, @Cast("bool") boolean computeAabb/*=true*/);
	public btConvexPointCloudShape(btVector3 points, int numPoints, @Const @ByRef btVector3 localScaling) { super((Pointer)null); allocate(points, numPoints, localScaling); }
	private native void allocate(btVector3 points, int numPoints, @Const @ByRef btVector3 localScaling);

	public native void setPoints(btVector3 points, int numPoints, @Cast("bool") boolean computeAabb/*=true*/, @Const @ByRef(nullValue = "btVector3(1.f, 1.f, 1.f)") btVector3 localScaling);
	public native void setPoints(btVector3 points, int numPoints);

	public native btVector3 getUnscaledPoints();

	public native int getNumPoints();

	public native @ByVal btVector3 getScaledPoint(int index);

// #ifndef __SPU__
	public native @ByVal btVector3 localGetSupportingVertex(@Const @ByRef btVector3 vec);
	public native @ByVal btVector3 localGetSupportingVertexWithoutMargin(@Const @ByRef btVector3 vec);
	public native void batchedUnitVectorGetSupportingVertexWithoutMargin(@Const btVector3 vectors, btVector3 supportVerticesOut, int numVectors);
// #endif

	//debugging
	public native @Cast("const char*") BytePointer getName();

	public native int getNumVertices();
	public native int getNumEdges();
	public native void getEdge(int i, @ByRef btVector3 pa, @ByRef btVector3 pb);
	public native void getVertex(int i, @ByRef btVector3 vtx);
	public native int getNumPlanes();
	public native void getPlane(@ByRef btVector3 planeNormal, @ByRef btVector3 planeSupport, int i);
	public native @Cast("bool") boolean isInside(@Const @ByRef btVector3 pt, @Cast("btScalar") double tolerance);

	/**in case we receive negative scaling */
	public native void setLocalScaling(@Const @ByRef btVector3 scaling);
}