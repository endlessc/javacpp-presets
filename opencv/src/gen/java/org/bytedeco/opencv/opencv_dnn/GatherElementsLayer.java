// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_dnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.opencv.global.opencv_dnn.*;


    /** \brief GatherElements layer
    * GatherElements takes two inputs data and indices of the same rank r >= 1 and an optional attribute axis and works such that:
    *   output[i][j][k] = data[index[i][j][k]][j][k] if axis = 0 and r = 3
    *   output[i][j][k] = data[i][index[i][j][k]][k] if axis = 1 and r = 3
    *   output[i][j][k] = data[i][j][index[i][j][k]] if axis = 2 and r = 3
    *
    * Gather, on the other hand, takes a data tensor of rank r >= 1, and indices tensor of rank q, and works such that:
    *   it gathers the enteries along axis dimension of the input data indexed by indices and concatenates them in an output tensor of rank q + (r - 1)
    *   e.g. If axis = 0, let k = indices[i_{0}, ..., i_{q-1}] then output[i_{0}, ..., i_{q-1}, j_{0}, ..., j_{r-2}] = input[k , j_{0}, ..., j_{r-2}]:
     **/
    @Namespace("cv::dnn") @Properties(inherit = org.bytedeco.opencv.presets.opencv_dnn.class)
public class GatherElementsLayer extends Layer {
        static { Loader.load(); }
        /** Default native constructor. */
        public GatherElementsLayer() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public GatherElementsLayer(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public GatherElementsLayer(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public GatherElementsLayer position(long position) {
            return (GatherElementsLayer)super.position(position);
        }
        @Override public GatherElementsLayer getPointer(long i) {
            return new GatherElementsLayer((Pointer)this).offsetAddress(i);
        }
    
        public static native @Ptr GatherElementsLayer create(@Const @ByRef LayerParams params);
    }