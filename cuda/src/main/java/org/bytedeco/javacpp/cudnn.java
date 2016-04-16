// Targeted by JavaCPP version 1.2-SNAPSHOT

package org.bytedeco.javacpp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.cuda.*;

public class cudnn extends org.bytedeco.javacpp.presets.cudnn {
    static { Loader.load(); }

// Parsed from <cudnn.h>

/*
 * Copyright 1993-2015 NVIDIA Corporation.  All rights reserved.
 *
 * NOTICE TO LICENSEE:
 *
 * This source code and/or documentation ("Licensed Deliverables") are
 * subject to NVIDIA intellectual property rights under U.S. and
 * international Copyright laws.
 *
 * These Licensed Deliverables contained herein is PROPRIETARY and
 * CONFIDENTIAL to NVIDIA and is being provided under the terms and
 * conditions of a form of NVIDIA software license agreement by and
 * between NVIDIA and Licensee ("License Agreement") or electronically
 * accepted by Licensee.  Notwithstanding any terms or conditions to
 * the contrary in the License Agreement, reproduction or disclosure
 * of the Licensed Deliverables to any third party without the express
 * written consent of NVIDIA is prohibited.
 *
 * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE
 * LICENSE AGREEMENT, NVIDIA MAKES NO REPRESENTATION ABOUT THE
 * SUITABILITY OF THESE LICENSED DELIVERABLES FOR ANY PURPOSE.  IT IS
 * PROVIDED "AS IS" WITHOUT EXPRESS OR IMPLIED WARRANTY OF ANY KIND.
 * NVIDIA DISCLAIMS ALL WARRANTIES WITH REGARD TO THESE LICENSED
 * DELIVERABLES, INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY,
 * NONINFRINGEMENT, AND FITNESS FOR A PARTICULAR PURPOSE.
 * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE
 * LICENSE AGREEMENT, IN NO EVENT SHALL NVIDIA BE LIABLE FOR ANY
 * SPECIAL, INDIRECT, INCIDENTAL, OR CONSEQUENTIAL DAMAGES, OR ANY
 * DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS,
 * WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS
 * ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE
 * OF THESE LICENSED DELIVERABLES.
 *
 * U.S. Government End Users.  These Licensed Deliverables are a
 * "commercial item" as that term is defined at 48 C.F.R. 2.101 (OCT
 * 1995), consisting of "commercial computer software" and "commercial
 * computer software documentation" as such terms are used in 48
 * C.F.R. 12.212 (SEPT 1995) and is provided to the U.S. Government
 * only as a commercial end item.  Consistent with 48 C.F.R.12.212 and
 * 48 C.F.R. 227.7202-1 through 227.7202-4 (JUNE 1995), all
 * U.S. Government End Users acquire the Licensed Deliverables with
 * only those rights set forth herein.
 *
 * Any use of the Licensed Deliverables in individual and commercial
 * software must include, in the user documentation and internal
 * comments to the code, the above Disclaimer and U.S. Government End
 * Users Notice.
 */

 /*   cudnn : Neural Networks Library

 */

// #if !defined(CUDNN_H_)
// #define CUDNN_H_

public static final int CUDNN_MAJOR =      5;
public static final int CUDNN_MINOR =      0;
public static final int CUDNN_PATCHLEVEL = 4;

public static final int CUDNN_VERSION =    (CUDNN_MAJOR * 1000 + CUDNN_MINOR * 100 + CUDNN_PATCHLEVEL);

// #include "driver_types.h"
// #include <cuda_runtime.h>

// #ifndef CUDNNWINAPI
// #ifdef _WIN32
// #define CUDNNWINAPI __stdcall
// #else
// #define CUDNNWINAPI
// #endif
// #endif

// #if defined (__cplusplus)
// #endif

@Opaque public static class cudnnContext extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public cudnnContext() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudnnContext(Pointer p) { super(p); }
}

public static native @Cast("size_t") long cudnnGetVersion();

/*
 * CUDNN return codes
 */
/** enum cudnnStatus_t */
public static final int
    CUDNN_STATUS_SUCCESS          = 0,
    CUDNN_STATUS_NOT_INITIALIZED  = 1,
    CUDNN_STATUS_ALLOC_FAILED     = 2,
    CUDNN_STATUS_BAD_PARAM        = 3,
    CUDNN_STATUS_INTERNAL_ERROR   = 4,
    CUDNN_STATUS_INVALID_VALUE    = 5,
    CUDNN_STATUS_ARCH_MISMATCH    = 6,
    CUDNN_STATUS_MAPPING_ERROR    = 7,
    CUDNN_STATUS_EXECUTION_FAILED = 8,
    CUDNN_STATUS_NOT_SUPPORTED    = 9,
    CUDNN_STATUS_LICENSE_ERROR    = 10;

// human-readable error messages
public static native @Cast("const char*") BytePointer cudnnGetErrorString(@Cast("cudnnStatus_t") int status);

public static native @Cast("cudnnStatus_t") int cudnnCreate(@ByPtrPtr cudnnContext handle);
public static native @Cast("cudnnStatus_t") int cudnnDestroy(cudnnContext handle);
public static native @Cast("cudnnStatus_t") int cudnnSetStream(cudnnContext handle, CUstream_st streamId);
public static native @Cast("cudnnStatus_t") int cudnnGetStream(cudnnContext handle, @ByPtrPtr CUstream_st streamId);


/* Data structures to represent Image/Filter and the Neural Network Layer */
@Opaque public static class cudnnTensorStruct extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public cudnnTensorStruct() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudnnTensorStruct(Pointer p) { super(p); }
}
@Opaque public static class cudnnConvolutionStruct extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public cudnnConvolutionStruct() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudnnConvolutionStruct(Pointer p) { super(p); }
}
@Opaque public static class cudnnPoolingStruct extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public cudnnPoolingStruct() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudnnPoolingStruct(Pointer p) { super(p); }
}
@Opaque public static class cudnnFilterStruct extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public cudnnFilterStruct() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudnnFilterStruct(Pointer p) { super(p); }
}
@Opaque public static class cudnnLRNStruct extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public cudnnLRNStruct() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudnnLRNStruct(Pointer p) { super(p); }
}
@Opaque public static class cudnnActivationStruct extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public cudnnActivationStruct() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudnnActivationStruct(Pointer p) { super(p); }
}
@Opaque public static class cudnnSpatialTransformerStruct extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public cudnnSpatialTransformerStruct() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudnnSpatialTransformerStruct(Pointer p) { super(p); }
}
@Opaque public static class cudnnOpTensorStruct extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public cudnnOpTensorStruct() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudnnOpTensorStruct(Pointer p) { super(p); }
}
/*
* CUDNN data type
*/
/** enum cudnnDataType_t */
public static final int
    CUDNN_DATA_FLOAT  = 0,
    CUDNN_DATA_DOUBLE = 1,
    CUDNN_DATA_HALF   = 2;

/*
 * CUDNN propagate Nan
 */
/** enum cudnnNanPropagation_t */
public static final int
    CUDNN_NOT_PROPAGATE_NAN  = 0,
    CUDNN_PROPAGATE_NAN      = 1;

/* Maximum supported number of tensor dimensions */
public static final int CUDNN_DIM_MAX = 8;

/* Create an instance of a generic Tensor descriptor */
public static native @Cast("cudnnStatus_t") int cudnnCreateTensorDescriptor(
                                @Cast("cudnnTensorStruct**") @ByPtrPtr cudnnTensorStruct tensorDesc );

/** enum cudnnTensorFormat_t */
public static final int
    CUDNN_TENSOR_NCHW = 0,   /* row major (wStride = 1, hStride = w) */
    CUDNN_TENSOR_NHWC = 1;    /* feature maps interleaved ( cStride = 1 )*/

public static native @Cast("cudnnStatus_t") int cudnnSetTensor4dDescriptor(
                                cudnnTensorStruct tensorDesc,
                                @Cast("cudnnTensorFormat_t") int format,
                                @Cast("cudnnDataType_t") int dataType,
                                int n,
                                int c,
                                int h,
                                int w );       // width of input section


public static native @Cast("cudnnStatus_t") int cudnnSetTensor4dDescriptorEx(
                                cudnnTensorStruct tensorDesc,
                                @Cast("cudnnDataType_t") int dataType,
                                int n,
                                int c,
                                int h,
                                int w,
                                int nStride,
                                int cStride,
                                int hStride,
                                int wStride );

public static native @Cast("cudnnStatus_t") int cudnnGetTensor4dDescriptor(
                                cudnnTensorStruct tensorDesc,
                                @Cast("cudnnDataType_t*") IntPointer dataType,
                                IntPointer n,
                                IntPointer c,
                                IntPointer h,
                                IntPointer w,
                                IntPointer nStride,
                                IntPointer cStride,
                                IntPointer hStride,
                                IntPointer wStride );
public static native @Cast("cudnnStatus_t") int cudnnGetTensor4dDescriptor(
                                cudnnTensorStruct tensorDesc,
                                @Cast("cudnnDataType_t*") IntBuffer dataType,
                                IntBuffer n,
                                IntBuffer c,
                                IntBuffer h,
                                IntBuffer w,
                                IntBuffer nStride,
                                IntBuffer cStride,
                                IntBuffer hStride,
                                IntBuffer wStride );
public static native @Cast("cudnnStatus_t") int cudnnGetTensor4dDescriptor(
                                cudnnTensorStruct tensorDesc,
                                @Cast("cudnnDataType_t*") int[] dataType,
                                int[] n,
                                int[] c,
                                int[] h,
                                int[] w,
                                int[] nStride,
                                int[] cStride,
                                int[] hStride,
                                int[] wStride );

public static native @Cast("cudnnStatus_t") int cudnnSetTensorNdDescriptor(
                                cudnnTensorStruct tensorDesc,
                                @Cast("cudnnDataType_t") int dataType,
                                int nbDims,
                                @Const IntPointer dimA,
                                @Const IntPointer strideA );
public static native @Cast("cudnnStatus_t") int cudnnSetTensorNdDescriptor(
                                cudnnTensorStruct tensorDesc,
                                @Cast("cudnnDataType_t") int dataType,
                                int nbDims,
                                @Const IntBuffer dimA,
                                @Const IntBuffer strideA );
public static native @Cast("cudnnStatus_t") int cudnnSetTensorNdDescriptor(
                                cudnnTensorStruct tensorDesc,
                                @Cast("cudnnDataType_t") int dataType,
                                int nbDims,
                                @Const int[] dimA,
                                @Const int[] strideA );

public static native @Cast("cudnnStatus_t") int cudnnGetTensorNdDescriptor(
                                cudnnTensorStruct tensorDesc,
                                int nbDimsRequested,
                                @Cast("cudnnDataType_t*") IntPointer dataType,
                                IntPointer nbDims,
                                IntPointer dimA,
                                IntPointer strideA );
public static native @Cast("cudnnStatus_t") int cudnnGetTensorNdDescriptor(
                                cudnnTensorStruct tensorDesc,
                                int nbDimsRequested,
                                @Cast("cudnnDataType_t*") IntBuffer dataType,
                                IntBuffer nbDims,
                                IntBuffer dimA,
                                IntBuffer strideA );
public static native @Cast("cudnnStatus_t") int cudnnGetTensorNdDescriptor(
                                cudnnTensorStruct tensorDesc,
                                int nbDimsRequested,
                                @Cast("cudnnDataType_t*") int[] dataType,
                                int[] nbDims,
                                int[] dimA,
                                int[] strideA );

/* PixelOffset( n, c, h, w ) = n *input_stride + c * feature_stride + h * h_stride + w * w_stride

   1)Example of all images in row major order one batch of features after the other (with an optional padding on row)
   input_stride :  c x h x h_stride
   feature_stride : h x h_stride
   h_stride  :  >= w  ( h_stride = w if no padding)
   w_stride  : 1


   2)Example of all images in row major with features maps interleaved
   input_stride :  c x h x h_stride
   feature_stride : 1
   h_stride  :  w x c
   w_stride  : c

   3)Example of all images in column major order one batch of features after the other (with optional padding on column)
   input_stride :  c x w x w_stride
   feature_stride : w x w_stride
   h_stride  :  1
   w_stride  :  >= h

*/

/* Destroy an instance of Tensor4d descriptor */
public static native @Cast("cudnnStatus_t") int cudnnDestroyTensorDescriptor(
                                cudnnTensorStruct tensorDesc );


/* Tensor layout conversion helper (y = alpha * x + beta * y) */
public static native @Cast("cudnnStatus_t") int cudnnTransformTensor(
                                cudnnContext handle,
                                @Const Pointer alpha,
                                cudnnTensorStruct xDesc,
                                @Const Pointer x,
                                @Const Pointer beta,
                                cudnnTensorStruct yDesc,
                                Pointer y );


/* Tensor Bias addition : C = alpha * A + beta * C  */
public static native @Cast("cudnnStatus_t") int cudnnAddTensor(
                                cudnnContext handle,
                                @Const Pointer alpha,
                                cudnnTensorStruct aDesc,
                                @Const Pointer A,
                                @Const Pointer beta,
                                cudnnTensorStruct cDesc,
                                Pointer C );

/*
* CUDNN OpTensor op type
*/
/** enum cudnnOpTensorOp_t */
public static final int
    CUDNN_OP_TENSOR_ADD = 0,
    CUDNN_OP_TENSOR_MUL = 1,
    CUDNN_OP_TENSOR_MIN = 2,
    CUDNN_OP_TENSOR_MAX = 3;

public static native @Cast("cudnnStatus_t") int cudnnCreateOpTensorDescriptor(
                                @ByPtrPtr cudnnOpTensorStruct opTensorDesc );

public static native @Cast("cudnnStatus_t") int cudnnSetOpTensorDescriptor(
                                cudnnOpTensorStruct opTensorDesc,
                                @Cast("cudnnOpTensorOp_t") int opTensorOp,
                                @Cast("cudnnDataType_t") int opTensorCompType,
                                @Cast("cudnnNanPropagation_t") int opTensorNanOpt );

public static native @Cast("cudnnStatus_t") int cudnnGetOpTensorDescriptor(
                                cudnnOpTensorStruct opTensorDesc,
                                @Cast("cudnnOpTensorOp_t*") IntPointer opTensorOp,
                                @Cast("cudnnDataType_t*") IntPointer opTensorCompType,
                                @Cast("cudnnNanPropagation_t*") IntPointer opTensorNanOpt );
public static native @Cast("cudnnStatus_t") int cudnnGetOpTensorDescriptor(
                                cudnnOpTensorStruct opTensorDesc,
                                @Cast("cudnnOpTensorOp_t*") IntBuffer opTensorOp,
                                @Cast("cudnnDataType_t*") IntBuffer opTensorCompType,
                                @Cast("cudnnNanPropagation_t*") IntBuffer opTensorNanOpt );
public static native @Cast("cudnnStatus_t") int cudnnGetOpTensorDescriptor(
                                cudnnOpTensorStruct opTensorDesc,
                                @Cast("cudnnOpTensorOp_t*") int[] opTensorOp,
                                @Cast("cudnnDataType_t*") int[] opTensorCompType,
                                @Cast("cudnnNanPropagation_t*") int[] opTensorNanOpt );

public static native @Cast("cudnnStatus_t") int cudnnDestroyOpTensorDescriptor(
                                cudnnOpTensorStruct opTensorDesc );

/* Tensor Bias operation : C = op( alpha1 * A, alpha2 * B ) + beta * C */
public static native @Cast("cudnnStatus_t") int cudnnOpTensor(
                                cudnnContext handle,
                                cudnnOpTensorStruct opTensorDesc,
                                @Const Pointer alpha1,
                                cudnnTensorStruct aDesc,
                                @Const Pointer A,
                                @Const Pointer alpha2,
                                cudnnTensorStruct bDesc,
                                @Const Pointer B,
                                @Const Pointer beta,
                                cudnnTensorStruct cDesc,
                                Pointer C );

/* Set all values of a tensor to a given value : y[i] = value[0] */
public static native @Cast("cudnnStatus_t") int cudnnSetTensor(
                                cudnnContext handle,
                                cudnnTensorStruct yDesc,
                                Pointer y,
                                @Const Pointer valuePtr );

/* Scale all values of a tensor by a given factor : y[i] = alpha * y[i] */
public static native @Cast("cudnnStatus_t") int cudnnScaleTensor(
                                cudnnContext handle,
                                cudnnTensorStruct yDesc,
                                Pointer y,
                                @Const Pointer alpha );

/*
 *  convolution mode
 */
/** enum cudnnConvolutionMode_t */
public static final int
    CUDNN_CONVOLUTION       = 0,
    CUDNN_CROSS_CORRELATION = 1;


/* Create an instance of FilterStruct */
public static native @Cast("cudnnStatus_t") int cudnnCreateFilterDescriptor(
                                @ByPtrPtr cudnnFilterStruct filterDesc );


public static native @Cast("cudnnStatus_t") int cudnnSetFilter4dDescriptor(
                                cudnnFilterStruct filterDesc,
                                @Cast("cudnnDataType_t") int dataType,
                                @Cast("cudnnTensorFormat_t") int format,
                                int k,
                                int c,
                                int h,
                                int w );      // width of  each input filter


public static native @Cast("cudnnStatus_t") int cudnnGetFilter4dDescriptor(
                                cudnnFilterStruct filterDesc,
                                @Cast("cudnnDataType_t*") IntPointer dataType,
                                @Cast("cudnnTensorFormat_t*") IntPointer format,
                                IntPointer k,
                                IntPointer c,
                                IntPointer h,
                                IntPointer w );
public static native @Cast("cudnnStatus_t") int cudnnGetFilter4dDescriptor(
                                cudnnFilterStruct filterDesc,
                                @Cast("cudnnDataType_t*") IntBuffer dataType,
                                @Cast("cudnnTensorFormat_t*") IntBuffer format,
                                IntBuffer k,
                                IntBuffer c,
                                IntBuffer h,
                                IntBuffer w );
public static native @Cast("cudnnStatus_t") int cudnnGetFilter4dDescriptor(
                                cudnnFilterStruct filterDesc,
                                @Cast("cudnnDataType_t*") int[] dataType,
                                @Cast("cudnnTensorFormat_t*") int[] format,
                                int[] k,
                                int[] c,
                                int[] h,
                                int[] w );      // width of  each input filter


public static native @Cast("cudnnStatus_t") int cudnnSetFilterNdDescriptor(
                                cudnnFilterStruct filterDesc,
                                @Cast("cudnnDataType_t") int dataType,
                                @Cast("cudnnTensorFormat_t") int format,
                                int nbDims,
                                @Const IntPointer filterDimA );
public static native @Cast("cudnnStatus_t") int cudnnSetFilterNdDescriptor(
                                cudnnFilterStruct filterDesc,
                                @Cast("cudnnDataType_t") int dataType,
                                @Cast("cudnnTensorFormat_t") int format,
                                int nbDims,
                                @Const IntBuffer filterDimA );
public static native @Cast("cudnnStatus_t") int cudnnSetFilterNdDescriptor(
                                cudnnFilterStruct filterDesc,
                                @Cast("cudnnDataType_t") int dataType,
                                @Cast("cudnnTensorFormat_t") int format,
                                int nbDims,
                                @Const int[] filterDimA );

public static native @Cast("cudnnStatus_t") int cudnnGetFilterNdDescriptor(
                                cudnnFilterStruct filterDesc,
                                int nbDimsRequested,
                                @Cast("cudnnDataType_t*") IntPointer dataType,
                                @Cast("cudnnTensorFormat_t*") IntPointer format,
                                IntPointer nbDims,
                                IntPointer filterDimA );
public static native @Cast("cudnnStatus_t") int cudnnGetFilterNdDescriptor(
                                cudnnFilterStruct filterDesc,
                                int nbDimsRequested,
                                @Cast("cudnnDataType_t*") IntBuffer dataType,
                                @Cast("cudnnTensorFormat_t*") IntBuffer format,
                                IntBuffer nbDims,
                                IntBuffer filterDimA );
public static native @Cast("cudnnStatus_t") int cudnnGetFilterNdDescriptor(
                                cudnnFilterStruct filterDesc,
                                int nbDimsRequested,
                                @Cast("cudnnDataType_t*") int[] dataType,
                                @Cast("cudnnTensorFormat_t*") int[] format,
                                int[] nbDims,
                                int[] filterDimA );


public static native @Cast("cudnnStatus_t") int cudnnDestroyFilterDescriptor(
                                cudnnFilterStruct filterDesc );

/* Create an instance of convolution descriptor */
public static native @Cast("cudnnStatus_t") int cudnnCreateConvolutionDescriptor(
                                @ByPtrPtr cudnnConvolutionStruct convDesc );

public static native @Cast("cudnnStatus_t") int cudnnSetConvolution2dDescriptor(
                                cudnnConvolutionStruct convDesc,
                                int pad_h,
                                int pad_w,
                                int u,
                                int v,
                                int upscalex,
                                int upscaley,
                                @Cast("cudnnConvolutionMode_t") int mode );

public static native @Cast("cudnnStatus_t") int cudnnSetConvolution2dDescriptor_v5( cudnnConvolutionStruct convDesc,
                                                             int pad_h,
                                                             int pad_w,
                                                             int u,
                                                             int v,
                                                             int upscalex,
                                                             int upscaley,
                                                             @Cast("cudnnConvolutionMode_t") int mode,
                                                             @Cast("cudnnDataType_t") int dataType
                                                           );
                                                           
public static native @Cast("cudnnStatus_t") int cudnnGetConvolution2dDescriptor(
                                cudnnConvolutionStruct convDesc,
                                IntPointer pad_h,
                                IntPointer pad_w,
                                IntPointer u,
                                IntPointer v,
                                IntPointer upscalex,
                                IntPointer upscaley,
                                @Cast("cudnnConvolutionMode_t*") IntPointer mode );
public static native @Cast("cudnnStatus_t") int cudnnGetConvolution2dDescriptor(
                                cudnnConvolutionStruct convDesc,
                                IntBuffer pad_h,
                                IntBuffer pad_w,
                                IntBuffer u,
                                IntBuffer v,
                                IntBuffer upscalex,
                                IntBuffer upscaley,
                                @Cast("cudnnConvolutionMode_t*") IntBuffer mode );
public static native @Cast("cudnnStatus_t") int cudnnGetConvolution2dDescriptor(
                                cudnnConvolutionStruct convDesc,
                                int[] pad_h,
                                int[] pad_w,
                                int[] u,
                                int[] v,
                                int[] upscalex,
                                int[] upscaley,
                                @Cast("cudnnConvolutionMode_t*") int[] mode );

public static native @Cast("cudnnStatus_t") int cudnnGetConvolution2dDescriptor_v5(  cudnnConvolutionStruct convDesc,
                                                            IntPointer pad_h,
                                                            IntPointer pad_w,
                                                            IntPointer u,
                                                            IntPointer v,
                                                            IntPointer upscalex,
                                                            IntPointer upscaley,
                                                            @Cast("cudnnConvolutionMode_t*") IntPointer mode,
                                                            @Cast("cudnnDataType_t*") IntPointer dataType
                                                         );
public static native @Cast("cudnnStatus_t") int cudnnGetConvolution2dDescriptor_v5(  cudnnConvolutionStruct convDesc,
                                                            IntBuffer pad_h,
                                                            IntBuffer pad_w,
                                                            IntBuffer u,
                                                            IntBuffer v,
                                                            IntBuffer upscalex,
                                                            IntBuffer upscaley,
                                                            @Cast("cudnnConvolutionMode_t*") IntBuffer mode,
                                                            @Cast("cudnnDataType_t*") IntBuffer dataType
                                                         );
public static native @Cast("cudnnStatus_t") int cudnnGetConvolution2dDescriptor_v5(  cudnnConvolutionStruct convDesc,
                                                            int[] pad_h,
                                                            int[] pad_w,
                                                            int[] u,
                                                            int[] v,
                                                            int[] upscalex,
                                                            int[] upscaley,
                                                            @Cast("cudnnConvolutionMode_t*") int[] mode,
                                                            @Cast("cudnnDataType_t*") int[] dataType
                                                         );
                                                         
/* Helper function to return the dimensions of the output tensor given a convolution descriptor */
public static native @Cast("cudnnStatus_t") int cudnnGetConvolution2dForwardOutputDim(
                                cudnnConvolutionStruct convDesc,
                                cudnnTensorStruct inputTensorDesc,
                                cudnnFilterStruct filterDesc,
                                IntPointer n,
                                IntPointer c,
                                IntPointer h,
                                IntPointer w );
public static native @Cast("cudnnStatus_t") int cudnnGetConvolution2dForwardOutputDim(
                                cudnnConvolutionStruct convDesc,
                                cudnnTensorStruct inputTensorDesc,
                                cudnnFilterStruct filterDesc,
                                IntBuffer n,
                                IntBuffer c,
                                IntBuffer h,
                                IntBuffer w );
public static native @Cast("cudnnStatus_t") int cudnnGetConvolution2dForwardOutputDim(
                                cudnnConvolutionStruct convDesc,
                                cudnnTensorStruct inputTensorDesc,
                                cudnnFilterStruct filterDesc,
                                int[] n,
                                int[] c,
                                int[] h,
                                int[] w );


public static native @Cast("cudnnStatus_t") int cudnnSetConvolutionNdDescriptor(
                                cudnnConvolutionStruct convDesc,
                                int arrayLength,
                                @Const IntPointer padA,
                                @Const IntPointer filterStrideA,
                                @Const IntPointer upscaleA,
                                @Cast("cudnnConvolutionMode_t") int mode,
                                @Cast("cudnnDataType_t") int dataType );
public static native @Cast("cudnnStatus_t") int cudnnSetConvolutionNdDescriptor(
                                cudnnConvolutionStruct convDesc,
                                int arrayLength,
                                @Const IntBuffer padA,
                                @Const IntBuffer filterStrideA,
                                @Const IntBuffer upscaleA,
                                @Cast("cudnnConvolutionMode_t") int mode,
                                @Cast("cudnnDataType_t") int dataType );
public static native @Cast("cudnnStatus_t") int cudnnSetConvolutionNdDescriptor(
                                cudnnConvolutionStruct convDesc,
                                int arrayLength,
                                @Const int[] padA,
                                @Const int[] filterStrideA,
                                @Const int[] upscaleA,
                                @Cast("cudnnConvolutionMode_t") int mode,
                                @Cast("cudnnDataType_t") int dataType );  // convolution data type

public static native @Cast("cudnnStatus_t") int cudnnGetConvolutionNdDescriptor(
                                cudnnConvolutionStruct convDesc,
                                int arrayLengthRequested,
                                IntPointer arrayLength,
                                IntPointer padA,
                                IntPointer strideA,
                                IntPointer upscaleA,
                                @Cast("cudnnConvolutionMode_t*") IntPointer mode,
                                @Cast("cudnnDataType_t*") IntPointer dataType );
public static native @Cast("cudnnStatus_t") int cudnnGetConvolutionNdDescriptor(
                                cudnnConvolutionStruct convDesc,
                                int arrayLengthRequested,
                                IntBuffer arrayLength,
                                IntBuffer padA,
                                IntBuffer strideA,
                                IntBuffer upscaleA,
                                @Cast("cudnnConvolutionMode_t*") IntBuffer mode,
                                @Cast("cudnnDataType_t*") IntBuffer dataType );
public static native @Cast("cudnnStatus_t") int cudnnGetConvolutionNdDescriptor(
                                cudnnConvolutionStruct convDesc,
                                int arrayLengthRequested,
                                int[] arrayLength,
                                int[] padA,
                                int[] strideA,
                                int[] upscaleA,
                                @Cast("cudnnConvolutionMode_t*") int[] mode,
                                @Cast("cudnnDataType_t*") int[] dataType );   // convolution data type


/* Helper function to return the dimensions of the output tensor given a convolution descriptor */
public static native @Cast("cudnnStatus_t") int cudnnGetConvolutionNdForwardOutputDim(
                                cudnnConvolutionStruct convDesc,
                                cudnnTensorStruct inputTensorDesc,
                                cudnnFilterStruct filterDesc,
                                int nbDims,
                                IntPointer tensorOuputDimA );
public static native @Cast("cudnnStatus_t") int cudnnGetConvolutionNdForwardOutputDim(
                                cudnnConvolutionStruct convDesc,
                                cudnnTensorStruct inputTensorDesc,
                                cudnnFilterStruct filterDesc,
                                int nbDims,
                                IntBuffer tensorOuputDimA );
public static native @Cast("cudnnStatus_t") int cudnnGetConvolutionNdForwardOutputDim(
                                cudnnConvolutionStruct convDesc,
                                cudnnTensorStruct inputTensorDesc,
                                cudnnFilterStruct filterDesc,
                                int nbDims,
                                int[] tensorOuputDimA );

/* Destroy an instance of convolution descriptor */
public static native @Cast("cudnnStatus_t") int cudnnDestroyConvolutionDescriptor(
                                cudnnConvolutionStruct convDesc );


/* helper function to provide the convolution algo that fit best the requirement */
/** enum cudnnConvolutionFwdPreference_t */
public static final int
    CUDNN_CONVOLUTION_FWD_NO_WORKSPACE            = 0,
    CUDNN_CONVOLUTION_FWD_PREFER_FASTEST          = 1,
    CUDNN_CONVOLUTION_FWD_SPECIFY_WORKSPACE_LIMIT = 2;


/** enum cudnnConvolutionFwdAlgo_t */
public static final int
    CUDNN_CONVOLUTION_FWD_ALGO_IMPLICIT_GEMM         = 0,
    CUDNN_CONVOLUTION_FWD_ALGO_IMPLICIT_PRECOMP_GEMM = 1,
    CUDNN_CONVOLUTION_FWD_ALGO_GEMM                  = 2,
    CUDNN_CONVOLUTION_FWD_ALGO_DIRECT                = 3,
    CUDNN_CONVOLUTION_FWD_ALGO_FFT                   = 4,
    CUDNN_CONVOLUTION_FWD_ALGO_FFT_TILING            = 5,
    CUDNN_CONVOLUTION_FWD_ALGO_WINOGRAD              = 6;

public static class cudnnConvolutionFwdAlgoPerf_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudnnConvolutionFwdAlgoPerf_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudnnConvolutionFwdAlgoPerf_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudnnConvolutionFwdAlgoPerf_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudnnConvolutionFwdAlgoPerf_t position(long position) {
        return (cudnnConvolutionFwdAlgoPerf_t)super.position(position);
    }

    public native @Cast("cudnnConvolutionFwdAlgo_t") int algo(); public native cudnnConvolutionFwdAlgoPerf_t algo(int algo);
    public native @Cast("cudnnStatus_t") int status(); public native cudnnConvolutionFwdAlgoPerf_t status(int status);
    public native float time(); public native cudnnConvolutionFwdAlgoPerf_t time(float time);
    public native @Cast("size_t") long memory(); public native cudnnConvolutionFwdAlgoPerf_t memory(long memory);
}

public static native @Cast("cudnnStatus_t") int cudnnFindConvolutionForwardAlgorithm(
                                cudnnContext handle,
                                cudnnTensorStruct xDesc,
                                cudnnFilterStruct wDesc,
                                cudnnConvolutionStruct convDesc,
                                cudnnTensorStruct yDesc,
                                int requestedAlgoCount,
                                IntPointer returnedAlgoCount,
                                cudnnConvolutionFwdAlgoPerf_t perfResults );
public static native @Cast("cudnnStatus_t") int cudnnFindConvolutionForwardAlgorithm(
                                cudnnContext handle,
                                cudnnTensorStruct xDesc,
                                cudnnFilterStruct wDesc,
                                cudnnConvolutionStruct convDesc,
                                cudnnTensorStruct yDesc,
                                int requestedAlgoCount,
                                IntBuffer returnedAlgoCount,
                                cudnnConvolutionFwdAlgoPerf_t perfResults );
public static native @Cast("cudnnStatus_t") int cudnnFindConvolutionForwardAlgorithm(
                                cudnnContext handle,
                                cudnnTensorStruct xDesc,
                                cudnnFilterStruct wDesc,
                                cudnnConvolutionStruct convDesc,
                                cudnnTensorStruct yDesc,
                                int requestedAlgoCount,
                                int[] returnedAlgoCount,
                                cudnnConvolutionFwdAlgoPerf_t perfResults );

public static native @Cast("cudnnStatus_t") int cudnnFindConvolutionForwardAlgorithmEx(
                                cudnnContext handle,
                                cudnnTensorStruct xDesc,
                                @Const Pointer x,
                                cudnnFilterStruct wDesc,
                                @Const Pointer w,
                                cudnnConvolutionStruct convDesc,
                                cudnnTensorStruct yDesc,
                                Pointer y,
                                int requestedAlgoCount,
                                IntPointer returnedAlgoCount,
                                cudnnConvolutionFwdAlgoPerf_t perfResults,
                                Pointer workSpace,
                                @Cast("size_t") long workSpaceSizeInBytes );
public static native @Cast("cudnnStatus_t") int cudnnFindConvolutionForwardAlgorithmEx(
                                cudnnContext handle,
                                cudnnTensorStruct xDesc,
                                @Const Pointer x,
                                cudnnFilterStruct wDesc,
                                @Const Pointer w,
                                cudnnConvolutionStruct convDesc,
                                cudnnTensorStruct yDesc,
                                Pointer y,
                                int requestedAlgoCount,
                                IntBuffer returnedAlgoCount,
                                cudnnConvolutionFwdAlgoPerf_t perfResults,
                                Pointer workSpace,
                                @Cast("size_t") long workSpaceSizeInBytes );
public static native @Cast("cudnnStatus_t") int cudnnFindConvolutionForwardAlgorithmEx(
                                cudnnContext handle,
                                cudnnTensorStruct xDesc,
                                @Const Pointer x,
                                cudnnFilterStruct wDesc,
                                @Const Pointer w,
                                cudnnConvolutionStruct convDesc,
                                cudnnTensorStruct yDesc,
                                Pointer y,
                                int requestedAlgoCount,
                                int[] returnedAlgoCount,
                                cudnnConvolutionFwdAlgoPerf_t perfResults,
                                Pointer workSpace,
                                @Cast("size_t") long workSpaceSizeInBytes );


public static native @Cast("cudnnStatus_t") int cudnnGetConvolutionForwardAlgorithm(
                                cudnnContext handle,
                                cudnnTensorStruct xDesc,
                                cudnnFilterStruct wDesc,
                                cudnnConvolutionStruct convDesc,
                                cudnnTensorStruct yDesc,
                                @Cast("cudnnConvolutionFwdPreference_t") int preference,
                                @Cast("size_t") long memoryLimitInBytes,
                                @Cast("cudnnConvolutionFwdAlgo_t*") IntPointer algo );
public static native @Cast("cudnnStatus_t") int cudnnGetConvolutionForwardAlgorithm(
                                cudnnContext handle,
                                cudnnTensorStruct xDesc,
                                cudnnFilterStruct wDesc,
                                cudnnConvolutionStruct convDesc,
                                cudnnTensorStruct yDesc,
                                @Cast("cudnnConvolutionFwdPreference_t") int preference,
                                @Cast("size_t") long memoryLimitInBytes,
                                @Cast("cudnnConvolutionFwdAlgo_t*") IntBuffer algo );
public static native @Cast("cudnnStatus_t") int cudnnGetConvolutionForwardAlgorithm(
                                cudnnContext handle,
                                cudnnTensorStruct xDesc,
                                cudnnFilterStruct wDesc,
                                cudnnConvolutionStruct convDesc,
                                cudnnTensorStruct yDesc,
                                @Cast("cudnnConvolutionFwdPreference_t") int preference,
                                @Cast("size_t") long memoryLimitInBytes,
                                @Cast("cudnnConvolutionFwdAlgo_t*") int[] algo );

/*
 *  convolution algorithm (which requires potentially some workspace)
 */

 /* Helper function to return the minimum size of the workspace to be passed to the convolution given an algo*/
public static native @Cast("cudnnStatus_t") int cudnnGetConvolutionForwardWorkspaceSize(
                                cudnnContext handle,
                                cudnnTensorStruct xDesc,
                                cudnnFilterStruct wDesc,
                                cudnnConvolutionStruct convDesc,
                                cudnnTensorStruct yDesc,
                                @Cast("cudnnConvolutionFwdAlgo_t") int algo,
                                @Cast("size_t*") SizeTPointer sizeInBytes );


/* Convolution functions: All of the form "output = alpha * Op(inputs) + beta * output" */

/* Function to perform the forward pass for batch convolution */
public static native @Cast("cudnnStatus_t") int cudnnConvolutionForward(
                                cudnnContext handle,
                                @Const Pointer alpha,
                                cudnnTensorStruct xDesc,
                                @Const Pointer x,
                                cudnnFilterStruct wDesc,
                                @Const Pointer w,
                                cudnnConvolutionStruct convDesc,
                                @Cast("cudnnConvolutionFwdAlgo_t") int algo,
                                Pointer workSpace,
                                @Cast("size_t") long workSpaceSizeInBytes,
                                @Const Pointer beta,
                                cudnnTensorStruct yDesc,
                                Pointer y );

/* Function to compute the bias gradient for batch convolution */
public static native @Cast("cudnnStatus_t") int cudnnConvolutionBackwardBias(
                                cudnnContext handle,
                                @Const Pointer alpha,
                                cudnnTensorStruct dyDesc,
                                @Const Pointer dy,
                                @Const Pointer beta,
                                cudnnTensorStruct dbDesc,
                                Pointer db );


/* helper function to provide the convolution algo that fit best the requirement */
/** enum cudnnConvolutionBwdFilterPreference_t */
public static final int
    CUDNN_CONVOLUTION_BWD_FILTER_NO_WORKSPACE            = 0,
    CUDNN_CONVOLUTION_BWD_FILTER_PREFER_FASTEST          = 1,
    CUDNN_CONVOLUTION_BWD_FILTER_SPECIFY_WORKSPACE_LIMIT = 2;

/** enum cudnnConvolutionBwdFilterAlgo_t */
public static final int
    CUDNN_CONVOLUTION_BWD_FILTER_ALGO_0         = 0,  // non-deterministic
    CUDNN_CONVOLUTION_BWD_FILTER_ALGO_1         = 1,
    CUDNN_CONVOLUTION_BWD_FILTER_ALGO_FFT       = 2,
    CUDNN_CONVOLUTION_BWD_FILTER_ALGO_3         = 3;   // non-deterministic, algo0 with workspace


public static class cudnnConvolutionBwdFilterAlgoPerf_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudnnConvolutionBwdFilterAlgoPerf_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudnnConvolutionBwdFilterAlgoPerf_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudnnConvolutionBwdFilterAlgoPerf_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudnnConvolutionBwdFilterAlgoPerf_t position(long position) {
        return (cudnnConvolutionBwdFilterAlgoPerf_t)super.position(position);
    }

    public native @Cast("cudnnConvolutionBwdFilterAlgo_t") int algo(); public native cudnnConvolutionBwdFilterAlgoPerf_t algo(int algo);
    public native @Cast("cudnnStatus_t") int status(); public native cudnnConvolutionBwdFilterAlgoPerf_t status(int status);
    public native float time(); public native cudnnConvolutionBwdFilterAlgoPerf_t time(float time);
    public native @Cast("size_t") long memory(); public native cudnnConvolutionBwdFilterAlgoPerf_t memory(long memory);
}

public static native @Cast("cudnnStatus_t") int cudnnFindConvolutionBackwardFilterAlgorithm(
                                cudnnContext handle,
                                cudnnTensorStruct xDesc,
                                cudnnTensorStruct dyDesc,
                                cudnnConvolutionStruct convDesc,
                                cudnnFilterStruct dwDesc,
                                int requestedAlgoCount,
                                IntPointer returnedAlgoCount,
                                cudnnConvolutionBwdFilterAlgoPerf_t perfResults );
public static native @Cast("cudnnStatus_t") int cudnnFindConvolutionBackwardFilterAlgorithm(
                                cudnnContext handle,
                                cudnnTensorStruct xDesc,
                                cudnnTensorStruct dyDesc,
                                cudnnConvolutionStruct convDesc,
                                cudnnFilterStruct dwDesc,
                                int requestedAlgoCount,
                                IntBuffer returnedAlgoCount,
                                cudnnConvolutionBwdFilterAlgoPerf_t perfResults );
public static native @Cast("cudnnStatus_t") int cudnnFindConvolutionBackwardFilterAlgorithm(
                                cudnnContext handle,
                                cudnnTensorStruct xDesc,
                                cudnnTensorStruct dyDesc,
                                cudnnConvolutionStruct convDesc,
                                cudnnFilterStruct dwDesc,
                                int requestedAlgoCount,
                                int[] returnedAlgoCount,
                                cudnnConvolutionBwdFilterAlgoPerf_t perfResults );

public static native @Cast("cudnnStatus_t") int cudnnFindConvolutionBackwardFilterAlgorithmEx(
                                cudnnContext handle,
                                cudnnTensorStruct xDesc,
                                @Const Pointer x,
                                cudnnTensorStruct dyDesc,
                                @Const Pointer y,
                                cudnnConvolutionStruct convDesc,
                                cudnnFilterStruct dwDesc,
                                Pointer dw,
                                int requestedAlgoCount,
                                IntPointer returnedAlgoCount,
                                cudnnConvolutionBwdFilterAlgoPerf_t perfResults,
                                Pointer workSpace,
                                @Cast("size_t") long workSpaceSizeInBytes );
public static native @Cast("cudnnStatus_t") int cudnnFindConvolutionBackwardFilterAlgorithmEx(
                                cudnnContext handle,
                                cudnnTensorStruct xDesc,
                                @Const Pointer x,
                                cudnnTensorStruct dyDesc,
                                @Const Pointer y,
                                cudnnConvolutionStruct convDesc,
                                cudnnFilterStruct dwDesc,
                                Pointer dw,
                                int requestedAlgoCount,
                                IntBuffer returnedAlgoCount,
                                cudnnConvolutionBwdFilterAlgoPerf_t perfResults,
                                Pointer workSpace,
                                @Cast("size_t") long workSpaceSizeInBytes );
public static native @Cast("cudnnStatus_t") int cudnnFindConvolutionBackwardFilterAlgorithmEx(
                                cudnnContext handle,
                                cudnnTensorStruct xDesc,
                                @Const Pointer x,
                                cudnnTensorStruct dyDesc,
                                @Const Pointer y,
                                cudnnConvolutionStruct convDesc,
                                cudnnFilterStruct dwDesc,
                                Pointer dw,
                                int requestedAlgoCount,
                                int[] returnedAlgoCount,
                                cudnnConvolutionBwdFilterAlgoPerf_t perfResults,
                                Pointer workSpace,
                                @Cast("size_t") long workSpaceSizeInBytes );

public static native @Cast("cudnnStatus_t") int cudnnGetConvolutionBackwardFilterAlgorithm(
                                cudnnContext handle,
                                cudnnTensorStruct xDesc,
                                cudnnTensorStruct dyDesc,
                                cudnnConvolutionStruct convDesc,
                                cudnnFilterStruct dwDesc,
                                @Cast("cudnnConvolutionBwdFilterPreference_t") int preference,
                                @Cast("size_t") long memoryLimitInBytes,
                                @Cast("cudnnConvolutionBwdFilterAlgo_t*") IntPointer algo );
public static native @Cast("cudnnStatus_t") int cudnnGetConvolutionBackwardFilterAlgorithm(
                                cudnnContext handle,
                                cudnnTensorStruct xDesc,
                                cudnnTensorStruct dyDesc,
                                cudnnConvolutionStruct convDesc,
                                cudnnFilterStruct dwDesc,
                                @Cast("cudnnConvolutionBwdFilterPreference_t") int preference,
                                @Cast("size_t") long memoryLimitInBytes,
                                @Cast("cudnnConvolutionBwdFilterAlgo_t*") IntBuffer algo );
public static native @Cast("cudnnStatus_t") int cudnnGetConvolutionBackwardFilterAlgorithm(
                                cudnnContext handle,
                                cudnnTensorStruct xDesc,
                                cudnnTensorStruct dyDesc,
                                cudnnConvolutionStruct convDesc,
                                cudnnFilterStruct dwDesc,
                                @Cast("cudnnConvolutionBwdFilterPreference_t") int preference,
                                @Cast("size_t") long memoryLimitInBytes,
                                @Cast("cudnnConvolutionBwdFilterAlgo_t*") int[] algo );

/*
 *  convolution algorithm (which requires potentially some workspace)
 */

 /* Helper function to return the minimum size of the workspace to be passed to the convolution given an algo*/
public static native @Cast("cudnnStatus_t") int cudnnGetConvolutionBackwardFilterWorkspaceSize(
                                cudnnContext handle,
                                cudnnTensorStruct xDesc,
                                cudnnTensorStruct dyDesc,
                                cudnnConvolutionStruct convDesc,
                                cudnnFilterStruct gradDesc,
                                @Cast("cudnnConvolutionBwdFilterAlgo_t") int algo,
                                @Cast("size_t*") SizeTPointer sizeInBytes );

public static native @Cast("cudnnStatus_t") int cudnnConvolutionBackwardFilter(
                                cudnnContext handle,
                                @Const Pointer alpha,
                                cudnnTensorStruct xDesc,
                                @Const Pointer x,
                                cudnnTensorStruct dyDesc,
                                @Const Pointer dy,
                                cudnnConvolutionStruct convDesc,
                                @Cast("cudnnConvolutionBwdFilterAlgo_t") int algo,
                                Pointer workSpace,
                                @Cast("size_t") long workSpaceSizeInBytes,
                                @Const Pointer beta,
                                cudnnFilterStruct dwDesc,
                                Pointer dw );
                                                           
/*********************************************************/
/* helper function to provide the convolution algo that fit best the requirement */
/** enum cudnnConvolutionBwdDataPreference_t */
public static final int
    CUDNN_CONVOLUTION_BWD_DATA_NO_WORKSPACE             = 0,
    CUDNN_CONVOLUTION_BWD_DATA_PREFER_FASTEST           = 1,
    CUDNN_CONVOLUTION_BWD_DATA_SPECIFY_WORKSPACE_LIMIT  = 2;

/** enum cudnnConvolutionBwdDataAlgo_t */
public static final int
    CUDNN_CONVOLUTION_BWD_DATA_ALGO_0          = 0, // non-deterministic
    CUDNN_CONVOLUTION_BWD_DATA_ALGO_1          = 1,
    CUDNN_CONVOLUTION_BWD_DATA_ALGO_FFT        = 2,
    CUDNN_CONVOLUTION_BWD_DATA_ALGO_FFT_TILING = 3,
    CUDNN_CONVOLUTION_BWD_DATA_ALGO_WINOGRAD   = 4;

public static class cudnnConvolutionBwdDataAlgoPerf_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudnnConvolutionBwdDataAlgoPerf_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudnnConvolutionBwdDataAlgoPerf_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudnnConvolutionBwdDataAlgoPerf_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudnnConvolutionBwdDataAlgoPerf_t position(long position) {
        return (cudnnConvolutionBwdDataAlgoPerf_t)super.position(position);
    }

    public native @Cast("cudnnConvolutionBwdDataAlgo_t") int algo(); public native cudnnConvolutionBwdDataAlgoPerf_t algo(int algo);
    public native @Cast("cudnnStatus_t") int status(); public native cudnnConvolutionBwdDataAlgoPerf_t status(int status);
    public native float time(); public native cudnnConvolutionBwdDataAlgoPerf_t time(float time);
    public native @Cast("size_t") long memory(); public native cudnnConvolutionBwdDataAlgoPerf_t memory(long memory);
}


public static native @Cast("cudnnStatus_t") int cudnnFindConvolutionBackwardDataAlgorithm(
                                cudnnContext handle,
                                cudnnFilterStruct wDesc,
                                cudnnTensorStruct dyDesc,
                                cudnnConvolutionStruct convDesc,
                                cudnnTensorStruct dxDesc,
                                int requestedAlgoCount,
                                IntPointer returnedAlgoCount,
                                cudnnConvolutionBwdDataAlgoPerf_t perfResults );
public static native @Cast("cudnnStatus_t") int cudnnFindConvolutionBackwardDataAlgorithm(
                                cudnnContext handle,
                                cudnnFilterStruct wDesc,
                                cudnnTensorStruct dyDesc,
                                cudnnConvolutionStruct convDesc,
                                cudnnTensorStruct dxDesc,
                                int requestedAlgoCount,
                                IntBuffer returnedAlgoCount,
                                cudnnConvolutionBwdDataAlgoPerf_t perfResults );
public static native @Cast("cudnnStatus_t") int cudnnFindConvolutionBackwardDataAlgorithm(
                                cudnnContext handle,
                                cudnnFilterStruct wDesc,
                                cudnnTensorStruct dyDesc,
                                cudnnConvolutionStruct convDesc,
                                cudnnTensorStruct dxDesc,
                                int requestedAlgoCount,
                                int[] returnedAlgoCount,
                                cudnnConvolutionBwdDataAlgoPerf_t perfResults );

public static native @Cast("cudnnStatus_t") int cudnnFindConvolutionBackwardDataAlgorithmEx(
                                cudnnContext handle,
                                cudnnFilterStruct wDesc,
                                @Const Pointer w,
                                cudnnTensorStruct dyDesc,
                                @Const Pointer dy,
                                cudnnConvolutionStruct convDesc,
                                cudnnTensorStruct dxDesc,
                                Pointer dx,
                                int requestedAlgoCount,
                                IntPointer returnedAlgoCount,
                                cudnnConvolutionBwdDataAlgoPerf_t perfResults,
                                Pointer workSpace,
                                @Cast("size_t") long workSpaceSizeInBytes );
public static native @Cast("cudnnStatus_t") int cudnnFindConvolutionBackwardDataAlgorithmEx(
                                cudnnContext handle,
                                cudnnFilterStruct wDesc,
                                @Const Pointer w,
                                cudnnTensorStruct dyDesc,
                                @Const Pointer dy,
                                cudnnConvolutionStruct convDesc,
                                cudnnTensorStruct dxDesc,
                                Pointer dx,
                                int requestedAlgoCount,
                                IntBuffer returnedAlgoCount,
                                cudnnConvolutionBwdDataAlgoPerf_t perfResults,
                                Pointer workSpace,
                                @Cast("size_t") long workSpaceSizeInBytes );
public static native @Cast("cudnnStatus_t") int cudnnFindConvolutionBackwardDataAlgorithmEx(
                                cudnnContext handle,
                                cudnnFilterStruct wDesc,
                                @Const Pointer w,
                                cudnnTensorStruct dyDesc,
                                @Const Pointer dy,
                                cudnnConvolutionStruct convDesc,
                                cudnnTensorStruct dxDesc,
                                Pointer dx,
                                int requestedAlgoCount,
                                int[] returnedAlgoCount,
                                cudnnConvolutionBwdDataAlgoPerf_t perfResults,
                                Pointer workSpace,
                                @Cast("size_t") long workSpaceSizeInBytes );

public static native @Cast("cudnnStatus_t") int cudnnGetConvolutionBackwardDataAlgorithm(
                                cudnnContext handle,
                                cudnnFilterStruct wDesc,
                                cudnnTensorStruct dyDesc,
                                cudnnConvolutionStruct convDesc,
                                cudnnTensorStruct dxDesc,
                                @Cast("cudnnConvolutionBwdDataPreference_t") int preference,
                                @Cast("size_t") long memoryLimitInBytes,
                                @Cast("cudnnConvolutionBwdDataAlgo_t*") IntPointer algo );
public static native @Cast("cudnnStatus_t") int cudnnGetConvolutionBackwardDataAlgorithm(
                                cudnnContext handle,
                                cudnnFilterStruct wDesc,
                                cudnnTensorStruct dyDesc,
                                cudnnConvolutionStruct convDesc,
                                cudnnTensorStruct dxDesc,
                                @Cast("cudnnConvolutionBwdDataPreference_t") int preference,
                                @Cast("size_t") long memoryLimitInBytes,
                                @Cast("cudnnConvolutionBwdDataAlgo_t*") IntBuffer algo );
public static native @Cast("cudnnStatus_t") int cudnnGetConvolutionBackwardDataAlgorithm(
                                cudnnContext handle,
                                cudnnFilterStruct wDesc,
                                cudnnTensorStruct dyDesc,
                                cudnnConvolutionStruct convDesc,
                                cudnnTensorStruct dxDesc,
                                @Cast("cudnnConvolutionBwdDataPreference_t") int preference,
                                @Cast("size_t") long memoryLimitInBytes,
                                @Cast("cudnnConvolutionBwdDataAlgo_t*") int[] algo );

 /* Helper function to return the minimum size of the workspace to be passed to the convolution given an algo*/
public static native @Cast("cudnnStatus_t") int cudnnGetConvolutionBackwardDataWorkspaceSize(
                                cudnnContext handle,
                                cudnnFilterStruct wDesc,
                                cudnnTensorStruct dyDesc,
                                cudnnConvolutionStruct convDesc,
                                cudnnTensorStruct dxDesc,
                                @Cast("cudnnConvolutionBwdDataAlgo_t") int algo,
                                @Cast("size_t*") SizeTPointer sizeInBytes );


public static native @Cast("cudnnStatus_t") int cudnnConvolutionBackwardData(
                                cudnnContext handle,
                                @Const Pointer alpha,
                                cudnnFilterStruct wDesc,
                                @Const Pointer w,
                                cudnnTensorStruct dyDesc,
                                @Const Pointer dy,
                                cudnnConvolutionStruct convDesc,
                                @Cast("cudnnConvolutionBwdDataAlgo_t") int algo,
                                Pointer workSpace,
                                @Cast("size_t") long workSpaceSizeInBytes,
                                @Const Pointer beta,
                                cudnnTensorStruct dxDesc,
                                Pointer dx );


public static native @Cast("cudnnStatus_t") int cudnnIm2Col(
                                cudnnContext handle,
                                cudnnTensorStruct xDesc,
                                @Const Pointer x,
                                cudnnFilterStruct wDesc,
                                cudnnConvolutionStruct convDesc,
                                Pointer colBuffer );


/*
 *  softmax algorithm
 */
/** enum cudnnSoftmaxAlgorithm_t */
public static final int
    CUDNN_SOFTMAX_FAST     = 0,         /* straightforward implementation */
    CUDNN_SOFTMAX_ACCURATE = 1,         /* subtract max from every point to avoid overflow */
    CUDNN_SOFTMAX_LOG      = 2;

/** enum cudnnSoftmaxMode_t */
public static final int
    CUDNN_SOFTMAX_MODE_INSTANCE = 0,   /* compute the softmax over all C, H, W for each N */
    CUDNN_SOFTMAX_MODE_CHANNEL = 1;     /* compute the softmax over all C for each H, W, N */

/* Softmax functions: All of the form "output = alpha * Op(inputs) + beta * output" */

/* Function to perform forward softmax */
public static native @Cast("cudnnStatus_t") int cudnnSoftmaxForward(
                                cudnnContext handle,
                                @Cast("cudnnSoftmaxAlgorithm_t") int algo,
                                @Cast("cudnnSoftmaxMode_t") int mode,
                                @Const Pointer alpha,
                                cudnnTensorStruct xDesc,
                                @Const Pointer x,
                                @Const Pointer beta,
                                cudnnTensorStruct yDesc,
                                Pointer y );

/* Function to perform backward softmax */
public static native @Cast("cudnnStatus_t") int cudnnSoftmaxBackward(
                                cudnnContext handle,
                                @Cast("cudnnSoftmaxAlgorithm_t") int algo,
                                @Cast("cudnnSoftmaxMode_t") int mode,
                                @Const Pointer alpha,
                                cudnnTensorStruct yDesc,
                                @Const Pointer y,
                                cudnnTensorStruct dyDesc,
                                @Const Pointer dy,
                                @Const Pointer beta,
                                cudnnTensorStruct dxDesc,
                                Pointer dx );

/*
 *  pooling mode
 */
/** enum cudnnPoolingMode_t */
public static final int
    CUDNN_POOLING_MAX     = 0,
    CUDNN_POOLING_AVERAGE_COUNT_INCLUDE_PADDING = 1, // count for average includes padded values
    CUDNN_POOLING_AVERAGE_COUNT_EXCLUDE_PADDING = 2; // count for average does not include padded values

/* Create an instance of pooling descriptor */
public static native @Cast("cudnnStatus_t") int cudnnCreatePoolingDescriptor(
                                @ByPtrPtr cudnnPoolingStruct poolingDesc );

public static native @Cast("cudnnStatus_t") int cudnnSetPooling2dDescriptor(
                                cudnnPoolingStruct poolingDesc,
                                @Cast("cudnnPoolingMode_t") int mode,
                                @Cast("cudnnNanPropagation_t") int maxpoolingNanOpt,
                                int windowHeight,
                                int windowWidth,
                                int verticalPadding,
                                int horizontalPadding,
                                int verticalStride,
                                int horizontalStride );

public static native @Cast("cudnnStatus_t") int cudnnGetPooling2dDescriptor(
                                cudnnPoolingStruct poolingDesc,
                                @Cast("cudnnPoolingMode_t*") IntPointer mode,
                                @Cast("cudnnNanPropagation_t*") IntPointer maxpoolingNanOpt,
                                IntPointer windowHeight,
                                IntPointer windowWidth,
                                IntPointer verticalPadding,
                                IntPointer horizontalPadding,
                                IntPointer verticalStride,
                                IntPointer horizontalStride );
public static native @Cast("cudnnStatus_t") int cudnnGetPooling2dDescriptor(
                                cudnnPoolingStruct poolingDesc,
                                @Cast("cudnnPoolingMode_t*") IntBuffer mode,
                                @Cast("cudnnNanPropagation_t*") IntBuffer maxpoolingNanOpt,
                                IntBuffer windowHeight,
                                IntBuffer windowWidth,
                                IntBuffer verticalPadding,
                                IntBuffer horizontalPadding,
                                IntBuffer verticalStride,
                                IntBuffer horizontalStride );
public static native @Cast("cudnnStatus_t") int cudnnGetPooling2dDescriptor(
                                cudnnPoolingStruct poolingDesc,
                                @Cast("cudnnPoolingMode_t*") int[] mode,
                                @Cast("cudnnNanPropagation_t*") int[] maxpoolingNanOpt,
                                int[] windowHeight,
                                int[] windowWidth,
                                int[] verticalPadding,
                                int[] horizontalPadding,
                                int[] verticalStride,
                                int[] horizontalStride );

public static native @Cast("cudnnStatus_t") int cudnnSetPoolingNdDescriptor(
                                cudnnPoolingStruct poolingDesc,
                                @Cast("const cudnnPoolingMode_t") int mode,
                                @Cast("const cudnnNanPropagation_t") int maxpoolingNanOpt,
                                int nbDims,
                                @Const IntPointer windowDimA,
                                @Const IntPointer paddingA,
                                @Const IntPointer strideA );
public static native @Cast("cudnnStatus_t") int cudnnSetPoolingNdDescriptor(
                                cudnnPoolingStruct poolingDesc,
                                @Cast("const cudnnPoolingMode_t") int mode,
                                @Cast("const cudnnNanPropagation_t") int maxpoolingNanOpt,
                                int nbDims,
                                @Const IntBuffer windowDimA,
                                @Const IntBuffer paddingA,
                                @Const IntBuffer strideA );
public static native @Cast("cudnnStatus_t") int cudnnSetPoolingNdDescriptor(
                                cudnnPoolingStruct poolingDesc,
                                @Cast("const cudnnPoolingMode_t") int mode,
                                @Cast("const cudnnNanPropagation_t") int maxpoolingNanOpt,
                                int nbDims,
                                @Const int[] windowDimA,
                                @Const int[] paddingA,
                                @Const int[] strideA );

public static native @Cast("cudnnStatus_t") int cudnnGetPoolingNdDescriptor(
                                cudnnPoolingStruct poolingDesc,
                                int nbDimsRequested,
                                @Cast("cudnnPoolingMode_t*") IntPointer mode,
                                @Cast("cudnnNanPropagation_t*") IntPointer maxpoolingNanOpt,
                                IntPointer nbDims,
                                IntPointer windowDimA,
                                IntPointer paddingA,
                                IntPointer strideA );
public static native @Cast("cudnnStatus_t") int cudnnGetPoolingNdDescriptor(
                                cudnnPoolingStruct poolingDesc,
                                int nbDimsRequested,
                                @Cast("cudnnPoolingMode_t*") IntBuffer mode,
                                @Cast("cudnnNanPropagation_t*") IntBuffer maxpoolingNanOpt,
                                IntBuffer nbDims,
                                IntBuffer windowDimA,
                                IntBuffer paddingA,
                                IntBuffer strideA );
public static native @Cast("cudnnStatus_t") int cudnnGetPoolingNdDescriptor(
                                cudnnPoolingStruct poolingDesc,
                                int nbDimsRequested,
                                @Cast("cudnnPoolingMode_t*") int[] mode,
                                @Cast("cudnnNanPropagation_t*") int[] maxpoolingNanOpt,
                                int[] nbDims,
                                int[] windowDimA,
                                int[] paddingA,
                                int[] strideA );






/* Destroy an instance of pooling descriptor */
public static native @Cast("cudnnStatus_t") int cudnnDestroyPoolingDescriptor(
                                cudnnPoolingStruct poolingDesc );

/* Pooling functions: All of the form "output = alpha * Op(inputs) + beta * output" */

/* Function to perform forward pooling */
public static native @Cast("cudnnStatus_t") int cudnnPoolingForward(
                                cudnnContext handle,
                                cudnnPoolingStruct poolingDesc,
                                @Const Pointer alpha,
                                cudnnTensorStruct xDesc,
                                @Const Pointer x,
                                @Const Pointer beta,
                                cudnnTensorStruct yDesc,
                                Pointer y );

/* Function to perform backward pooling */
public static native @Cast("cudnnStatus_t") int cudnnPoolingBackward(
                                cudnnContext handle,
                                cudnnPoolingStruct poolingDesc,
                                @Const Pointer alpha,
                                cudnnTensorStruct yDesc,
                                @Const Pointer y,
                                cudnnTensorStruct dyDesc,
                                @Const Pointer dy,
                                cudnnTensorStruct xDesc,
                                @Const Pointer x,
                                @Const Pointer beta,
                                cudnnTensorStruct dxDesc,
                                Pointer dx );

/*
 * activation mode
 */
/** enum cudnnActivationMode_t */
public static final int
    CUDNN_ACTIVATION_SIGMOID      = 0,
    CUDNN_ACTIVATION_RELU         = 1,
    CUDNN_ACTIVATION_TANH         = 2,
    CUDNN_ACTIVATION_CLIPPED_RELU = 3;

/* Activation functions: All of the form "output = alpha * Op(inputs) + beta * output" */
public static native @Cast("cudnnStatus_t") int cudnnCreateActivationDescriptor(
                                @ByPtrPtr cudnnActivationStruct activationDesc);

public static native @Cast("cudnnStatus_t") int cudnnSetActivationDescriptor(
                                cudnnActivationStruct activationDesc,
                                @Cast("cudnnActivationMode_t") int mode,
                                @Cast("cudnnNanPropagation_t") int reluNanOpt,
                                double reluCeiling );

public static native @Cast("cudnnStatus_t") int cudnnGetActivationDescriptor(
                                cudnnActivationStruct activationDesc,
                                @Cast("cudnnActivationMode_t*") IntPointer mode,
                                @Cast("cudnnNanPropagation_t*") IntPointer reluNanOpt,
                                DoublePointer reluCeiling );
public static native @Cast("cudnnStatus_t") int cudnnGetActivationDescriptor(
                                cudnnActivationStruct activationDesc,
                                @Cast("cudnnActivationMode_t*") IntBuffer mode,
                                @Cast("cudnnNanPropagation_t*") IntBuffer reluNanOpt,
                                DoubleBuffer reluCeiling );
public static native @Cast("cudnnStatus_t") int cudnnGetActivationDescriptor(
                                cudnnActivationStruct activationDesc,
                                @Cast("cudnnActivationMode_t*") int[] mode,
                                @Cast("cudnnNanPropagation_t*") int[] reluNanOpt,
                                double[] reluCeiling );

public static native @Cast("cudnnStatus_t") int cudnnDestroyActivationDescriptor(
                                cudnnActivationStruct activationDesc);

/* Function to perform forward activation  */
public static native @Cast("cudnnStatus_t") int cudnnActivationForward(
                                cudnnContext handle,
                                cudnnActivationStruct activationDesc,
                                @Const Pointer alpha,
                                cudnnTensorStruct xDesc,
                                @Const Pointer x,
                                @Const Pointer beta,
                                cudnnTensorStruct yDesc,
                                Pointer y );

/* Function to perform backward activation  */
public static native @Cast("cudnnStatus_t") int cudnnActivationBackward(
                                cudnnContext handle,
                                cudnnActivationStruct activationDesc,
                                @Const Pointer alpha,
                                cudnnTensorStruct yDesc,
                                @Const Pointer y,
                                cudnnTensorStruct dyDesc,
                                @Const Pointer dy,
                                cudnnTensorStruct xDesc,
                                @Const Pointer x,
                                @Const Pointer beta,
                                cudnnTensorStruct dxDesc,
                                Pointer dx );

/* 
* Create an instance of LRN (Local Response Normalization) descriptor
* Uses lrnN=5, lrnAlpha=1e-4, lrnBeta=0.75, lrnK=2.0 as defaults from Krizhevsky'12 ImageNet paper
*/
public static native @Cast("cudnnStatus_t") int cudnnCreateLRNDescriptor(
                                @ByPtrPtr cudnnLRNStruct normDesc );

public static final int CUDNN_LRN_MIN_N =     1;       // minimum allowed lrnN
public static final int CUDNN_LRN_MAX_N =     16;      // maximum allowed lrnN
public static final double CUDNN_LRN_MIN_K =     1e-5;    // minimum allowed lrnK
public static final double CUDNN_LRN_MIN_BETA =  0.01;    // minimum allowed lrnBeta

/* LRN layer mode */
/** enum cudnnLRNMode_t */
public static final int
    CUDNN_LRN_CROSS_CHANNEL_DIM1 = 0;// Normalize across tensor's dimA[1] dimension

/*
* Uses a window [center-lookBehind, center+lookAhead], where
* lookBehind = floor( (lrnN-1)/2 ), lookAhead = lrnN-lookBehind-1.
* Values of double parameters cast to tensor data type.
*/
public static native @Cast("cudnnStatus_t") int cudnnSetLRNDescriptor(
                                cudnnLRNStruct normDesc,
                                @Cast("unsigned") int lrnN,
                                double lrnAlpha,
                                double lrnBeta,
                                double lrnK );
/*
* Retrieve the settings currently stored in an LRN layer descriptor
* Any of the provided pointers can be NULL (no corresponding value will be returned)
*/
public static native @Cast("cudnnStatus_t") int cudnnGetLRNDescriptor(
                                cudnnLRNStruct normDesc,
                                @Cast("unsigned*") IntPointer lrnN,
                                DoublePointer lrnAlpha,
                                DoublePointer lrnBeta,
                                DoublePointer lrnK );
public static native @Cast("cudnnStatus_t") int cudnnGetLRNDescriptor(
                                cudnnLRNStruct normDesc,
                                @Cast("unsigned*") IntBuffer lrnN,
                                DoubleBuffer lrnAlpha,
                                DoubleBuffer lrnBeta,
                                DoubleBuffer lrnK );
public static native @Cast("cudnnStatus_t") int cudnnGetLRNDescriptor(
                                cudnnLRNStruct normDesc,
                                @Cast("unsigned*") int[] lrnN,
                                double[] lrnAlpha,
                                double[] lrnBeta,
                                double[] lrnK );

/* Destroy an instance of LRN descriptor */
public static native @Cast("cudnnStatus_t") int cudnnDestroyLRNDescriptor( cudnnLRNStruct lrnDesc );

/* LRN functions: output = alpha * normalize(x) + beta * old_y */

/* LRN cross-channel forward computation. Double parameters cast to tensor data type */
public static native @Cast("cudnnStatus_t") int cudnnLRNCrossChannelForward(
                                cudnnContext handle,
                                cudnnLRNStruct normDesc,
                                @Cast("cudnnLRNMode_t") int lrnMode,
                                @Const Pointer alpha,
                                cudnnTensorStruct xDesc,
                                @Const Pointer x,
                                @Const Pointer beta,
                                cudnnTensorStruct yDesc,
                                Pointer y );

/* LRN cross-channel backward computation. Double parameters cast to tensor data type */
public static native @Cast("cudnnStatus_t") int cudnnLRNCrossChannelBackward(
                                cudnnContext handle,
                                cudnnLRNStruct normDesc,
                                @Cast("cudnnLRNMode_t") int lrnMode,
                                @Const Pointer alpha,
                                cudnnTensorStruct yDesc,
                                @Const Pointer y,
                                cudnnTensorStruct dyDesc,
                                @Const Pointer dy,
                                cudnnTensorStruct xDesc,
                                @Const Pointer x,
                                @Const Pointer beta,
                                cudnnTensorStruct dxDesc,
                                Pointer dx);

/** enum cudnnDivNormMode_t */
public static final int
    CUDNN_DIVNORM_PRECOMPUTED_MEANS = 0;

/* LCN/divisive normalization functions: y = alpha * normalize(x) + beta * y */
public static native @Cast("cudnnStatus_t") int cudnnDivisiveNormalizationForward(
                                cudnnContext handle,
                                cudnnLRNStruct normDesc,
                                @Cast("cudnnDivNormMode_t") int mode,
                                @Const Pointer alpha,
                                cudnnTensorStruct xDesc,
                                @Const Pointer x,
                                @Const Pointer means,
                                Pointer temp,
                                Pointer temp2,
                                @Const Pointer beta,
                                cudnnTensorStruct yDesc,
                                Pointer y );

public static native @Cast("cudnnStatus_t") int cudnnDivisiveNormalizationBackward(
                                cudnnContext handle,
                                cudnnLRNStruct normDesc,
                                @Cast("cudnnDivNormMode_t") int mode,
                                @Const Pointer alpha,
                                cudnnTensorStruct xDesc,
                                @Const Pointer x,
                                @Const Pointer means,
                                @Const Pointer dy,
                                Pointer temp,
                                Pointer temp2,
                                @Const Pointer beta,
                                cudnnTensorStruct dXdMeansDesc,
                                Pointer dx,
                                Pointer dMeans ); // output means differential, can be NULL

/** enum cudnnBatchNormMode_t */
public static final int
    // bnScale, bnBias tensor dims are 1xCxHxWx.. (one value per CHW...-slice, normalized over N slice)
    CUDNN_BATCHNORM_PER_ACTIVATION = 0,

    //bnScale, bnBias tensor dims are 1xCx1x1 (one value per C-dim normalized over Nx1xHxW subtensors)
    CUDNN_BATCHNORM_SPATIAL        = 1;

public static final double CUDNN_BN_MIN_EPSILON = 1e-5; // Minimum epsilon allowed to be used in the Batch Normalization formula

/*
* Derives a tensor descriptor from layer data descriptor for BatchNormalization 
* scale, invVariance, bnBias, bnScale tensors. Use this tensor desc for 
* bnScaleBiasMeanVarDesc and bnScaleBiasDiffDesc in Batch Normalization forward and backward functions.
*/
public static native @Cast("cudnnStatus_t") int cudnnDeriveBNTensorDescriptor(
                                cudnnTensorStruct derivedBnDesc,
                                cudnnTensorStruct xDesc,
                                @Cast("cudnnBatchNormMode_t") int mode );

/* Computes y = BN(x). Also accumulates moving averages of mean and inverse variances */
public static native @Cast("cudnnStatus_t") int cudnnBatchNormalizationForwardTraining(
                                cudnnContext handle,
                                @Cast("cudnnBatchNormMode_t") int mode,

                                @Const Pointer alpha,
                                @Const Pointer beta,

                                cudnnTensorStruct xDesc,
                                @Const Pointer x,
                                cudnnTensorStruct yDesc,
                                Pointer y,
                                cudnnTensorStruct bnScaleBiasMeanVarDesc,
                                @Const Pointer bnScale,
                                @Const Pointer bnBias,
                                double exponentialAverageFactor,
                                Pointer resultRunningMean,
                                Pointer resultRunningVariance,
                                double epsilon,
                                Pointer resultSaveMean,
                                Pointer resultSaveInvVariance );

/*
* Performs Batch Normalization during Inference: 
* y[i] = bnScale[k]*(x[i]-estimatedMean[k])/sqrt(epsilon+estimatedVariance[k]) + bnBias[k]
* with bnScale, bnBias, runningMean, runningInvVariance tensors indexed
* according to spatial or per-activation mode. Refer to cudnnBatchNormalizationForwardTraining
* above for notes on function arguments.
*/
public static native @Cast("cudnnStatus_t") int cudnnBatchNormalizationForwardInference(
                                cudnnContext handle,
                                @Cast("cudnnBatchNormMode_t") int mode,
                                @Const Pointer alpha,
                                @Const Pointer beta,
                                cudnnTensorStruct xDesc,
                                @Const Pointer x,
                                cudnnTensorStruct yDesc,
                                Pointer y,
                                cudnnTensorStruct bnScaleBiasMeanVarDesc,
                                @Const Pointer bnScale,
                                @Const Pointer bnBias,
                                @Const Pointer estimatedMean,
                                @Const Pointer estimatedVariance,
                                double epsilon );

/* Performs backward pass of Batch Normalization layer. Returns x gradient,
* bnScale gradient and bnBias gradient */
public static native @Cast("cudnnStatus_t") int cudnnBatchNormalizationBackward(
                                cudnnContext handle,
                                @Cast("cudnnBatchNormMode_t") int mode,
                                @Const Pointer alphaDataDiff,
                                @Const Pointer betaDataDiff,
                                @Const Pointer alphaParamDiff,
                                @Const Pointer betaParamDiff,
                                cudnnTensorStruct xDesc,
                                @Const Pointer x,
                                cudnnTensorStruct dyDesc,
                                @Const Pointer dy,
                                cudnnTensorStruct dxDesc,
                                Pointer dx,
                                cudnnTensorStruct dBnScaleBiasDesc,
                                @Const Pointer bnScale,
                                Pointer dBnScaleResult,
                                Pointer dBnBiasResult,
                                double epsilon,
                                @Const Pointer savedMean,
                                @Const Pointer savedInvVariance );

                                
/* APIs for spatial transformer network*/
/** enum cudnnSamplerType_t */
public static final int
    CUDNN_SAMPLER_BILINEAR= 0;
 
public static native @Cast("cudnnStatus_t") int cudnnCreateSpatialTransformerDescriptor( 

                               @ByPtrPtr cudnnSpatialTransformerStruct stDesc);
 
public static native @Cast("cudnnStatus_t") int cudnnSetSpatialTransformerNdDescriptor(
                                cudnnSpatialTransformerStruct stDesc,
                                @Cast("cudnnSamplerType_t") int samplerType, 
                                @Cast("cudnnDataType_t") int dataType,
                                int nbDims,
                                @Const IntPointer dimA);
public static native @Cast("cudnnStatus_t") int cudnnSetSpatialTransformerNdDescriptor(
                                cudnnSpatialTransformerStruct stDesc,
                                @Cast("cudnnSamplerType_t") int samplerType, 
                                @Cast("cudnnDataType_t") int dataType,
                                int nbDims,
                                @Const IntBuffer dimA);
public static native @Cast("cudnnStatus_t") int cudnnSetSpatialTransformerNdDescriptor(
                                cudnnSpatialTransformerStruct stDesc,
                                @Cast("cudnnSamplerType_t") int samplerType, 
                                @Cast("cudnnDataType_t") int dataType,
                                int nbDims,
                                @Const int[] dimA);

public static native @Cast("cudnnStatus_t") int cudnnDestroySpatialTransformerDescriptor(
                                 cudnnSpatialTransformerStruct stDesc);

public static native @Cast("cudnnStatus_t") int cudnnSpatialTfGridGeneratorForward(
                                 cudnnContext handle,
                                 cudnnSpatialTransformerStruct stDesc,
                                 @Const Pointer theta,
                                 Pointer grid);

public static native @Cast("cudnnStatus_t") int cudnnSpatialTfGridGeneratorBackward(
                                 cudnnContext handle,
                                 cudnnSpatialTransformerStruct stDesc,
                                 @Const Pointer dgrid,
                                 Pointer dtheta);

public static native @Cast("cudnnStatus_t") int cudnnSpatialTfSamplerForward(
                                 cudnnContext handle,
                                 cudnnSpatialTransformerStruct stDesc,
                                 @Const Pointer alpha,                                    
                                 cudnnTensorStruct xDesc,
                                 @Const Pointer x,
                                 @Const Pointer grid,
                                 @Const Pointer beta,
                                 cudnnTensorStruct yDesc,
                                 Pointer y);

public static native @Cast("cudnnStatus_t") int cudnnSpatialTfSamplerBackward(
                                 cudnnContext handle,
                                 cudnnSpatialTransformerStruct stDesc,
                                 @Const Pointer alpha,
                                 cudnnTensorStruct xDesc,
                                 @Const Pointer x,
                                 @Const Pointer beta,
                                 cudnnTensorStruct dxDesc,
                                 Pointer dx,
                                 @Const Pointer alphaDgrid,
                                 cudnnTensorStruct dyDesc,
                                 @Const Pointer dy,
                                 @Const Pointer grid,
                                 @Const Pointer betaDgrid,
                                 Pointer dgrid);
                              
@Opaque public static class cudnnDropoutStruct extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public cudnnDropoutStruct() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudnnDropoutStruct(Pointer p) { super(p); }
}

public static native @Cast("cudnnStatus_t") int cudnnCreateDropoutDescriptor(@ByPtrPtr cudnnDropoutStruct dropoutDesc);

public static native @Cast("cudnnStatus_t") int cudnnDestroyDropoutDescriptor(cudnnDropoutStruct dropoutDesc);

/*helper function to determine size of the states to be passed to cudnnSetDropoutDescriptor */
public static native @Cast("cudnnStatus_t") int cudnnDropoutGetStatesSize(cudnnContext handle, @Cast("size_t*") SizeTPointer sizeInBytes);

/*helper function to determine size of the reserve space to be passed to dropout forward/backward calls */
public static native @Cast("cudnnStatus_t") int cudnnDropoutGetReserveSpaceSize(cudnnTensorStruct xdesc, @Cast("size_t*") SizeTPointer sizeInBytes);

public static native @Cast("cudnnStatus_t") int cudnnSetDropoutDescriptor(cudnnDropoutStruct dropoutDesc, 
                                                    cudnnContext handle,
                                                    float dropout, 
                                                    Pointer states, 
                                                    @Cast("size_t") long stateSizeInBytes, 
                                                    @Cast("unsigned long long") long seed);

public static native @Cast("cudnnStatus_t") int cudnnDropoutForward(cudnnContext handle, 
                                                      cudnnDropoutStruct dropoutDesc,
                                                      cudnnTensorStruct xdesc, 
                                                      @Const Pointer x,
                                                      cudnnTensorStruct ydesc,
                                                      Pointer y,
                                                      Pointer reserveSpace,
                                                      @Cast("size_t") long reserveSpaceSizeInBytes);

public static native @Cast("cudnnStatus_t") int cudnnDropoutBackward(cudnnContext handle, 
                                               cudnnDropoutStruct dropoutDesc,
                                               cudnnTensorStruct dydesc, 
                                               @Const Pointer dy,
                                               cudnnTensorStruct dxdesc,
                                               Pointer dx,
                                               Pointer reserveSpace,
                                               @Cast("size_t") long reserveSpaceSizeInBytes);

/* RNN API */
/** enum cudnnRNNMode_t */
public static final int
    CUDNN_RNN_RELU = 0, // Stock RNN with ReLu activation
    CUDNN_RNN_TANH = 1, // Stock RNN with tanh activation
    CUDNN_LSTM = 2,     // LSTM with no peephole connections
    CUDNN_GRU = 3;       // Using h' = tanh(r * Uh(t-1) + Wx) and h = (1 - z) * h' + z * h(t-1);

/** enum cudnnDirectionMode_t */
public static final int
   CUDNN_UNIDIRECTIONAL = 0,
   CUDNN_BIDIRECTIONAL = 1;      // Using output concatination at each step. Do we also want to support output sum?

/** enum cudnnRNNInputMode_t */
public static final int
   CUDNN_LINEAR_INPUT = 0,
   CUDNN_SKIP_INPUT = 1;  
    
  
@Opaque public static class cudnnRNNStruct extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public cudnnRNNStruct() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudnnRNNStruct(Pointer p) { super(p); }
}

public static native @Cast("cudnnStatus_t") int cudnnCreateRNNDescriptor(@ByPtrPtr cudnnRNNStruct rnnDesc);
public static native @Cast("cudnnStatus_t") int cudnnDestroyRNNDescriptor(cudnnRNNStruct rnnDesc);

public static native @Cast("cudnnStatus_t") int cudnnSetRNNDescriptor(cudnnRNNStruct rnnDesc,
                                                int hiddenSize, 
                                                int seqLength, 
                                                int numLayers, 
                                                cudnnDropoutStruct dropoutDesc,
                                                @Cast("cudnnRNNInputMode_t") int inputMode,                                                 
                                                @Cast("cudnnDirectionMode_t") int direction, 
                                                @Cast("cudnnRNNMode_t") int mode, 
                                                @Cast("cudnnDataType_t") int dataType);


// dataType in the RNN descriptor is used to determine math precision
// dataType in weight descriptors and input descriptors is used to describe storage

public static native @Cast("cudnnStatus_t") int cudnnGetRNNWorkspaceSize( cudnnContext handle,
                                                    cudnnRNNStruct rnnDesc,  
                                                    @Cast("cudnnTensorStruct**") @ByPtrPtr cudnnTensorStruct xDesc,
                                                    @Cast("size_t*") SizeTPointer sizeInBytes
                                                    );
                                                      
public static native @Cast("cudnnStatus_t") int cudnnGetRNNTrainingReserveSize( cudnnContext handle,
                                                          cudnnRNNStruct rnnDesc,  
                                                          @Cast("cudnnTensorStruct**") @ByPtrPtr cudnnTensorStruct xDesc,
                                                          @Cast("size_t*") SizeTPointer sizeInBytes
                                                    );

                                                    
public static native @Cast("cudnnStatus_t") int cudnnGetRNNParamsSize( cudnnContext handle,
                                                 cudnnRNNStruct rnnDesc,  
                                                 @Cast("cudnnTensorStruct**") @ByPtrPtr cudnnTensorStruct xDesc,                                                    
                                                 @Cast("size_t*") SizeTPointer sizeInBytes
                                                    );

public static native @Cast("cudnnStatus_t") int cudnnGetRNNLinLayerMatrixParams( cudnnContext handle,
                             cudnnRNNStruct rnnDesc,  
                             int layer,
                             @Cast("cudnnTensorStruct**") @ByPtrPtr cudnnTensorStruct xDesc, 
                             cudnnFilterStruct wDesc, 
                             @Const Pointer w, 
                             int linLayerID,  
                             cudnnFilterStruct linLayerMatDesc, 
                             @Cast("void**") PointerPointer linLayerMat
                             );
public static native @Cast("cudnnStatus_t") int cudnnGetRNNLinLayerMatrixParams( cudnnContext handle,
                             cudnnRNNStruct rnnDesc,  
                             int layer,
                             @Cast("cudnnTensorStruct**") @ByPtrPtr cudnnTensorStruct xDesc, 
                             cudnnFilterStruct wDesc, 
                             @Const Pointer w, 
                             int linLayerID,  
                             cudnnFilterStruct linLayerMatDesc, 
                             @Cast("void**") @ByPtrPtr Pointer linLayerMat
                             );

public static native @Cast("cudnnStatus_t") int cudnnGetRNNLinLayerBiasParams( cudnnContext handle,
                             cudnnRNNStruct rnnDesc,  
                             int layer,
                             @Cast("cudnnTensorStruct**") @ByPtrPtr cudnnTensorStruct xDesc, 
                             cudnnFilterStruct wDesc, 
                             @Const Pointer w, 
                             int linLayerID, 
                             cudnnFilterStruct linLayerBiasDesc, 
                             @Cast("void**") PointerPointer linLayerBias                       
                             );
public static native @Cast("cudnnStatus_t") int cudnnGetRNNLinLayerBiasParams( cudnnContext handle,
                             cudnnRNNStruct rnnDesc,  
                             int layer,
                             @Cast("cudnnTensorStruct**") @ByPtrPtr cudnnTensorStruct xDesc, 
                             cudnnFilterStruct wDesc, 
                             @Const Pointer w, 
                             int linLayerID, 
                             cudnnFilterStruct linLayerBiasDesc, 
                             @Cast("void**") @ByPtrPtr Pointer linLayerBias                       
                             );


public static native @Cast("cudnnStatus_t") int cudnnRNNForwardInference( cudnnContext handle, 
                                                    cudnnRNNStruct rnnDesc, 
                                                    @Cast("cudnnTensorStruct**") @ByPtrPtr cudnnTensorStruct xDesc, 
                                                    @Const Pointer x, 
                                                    cudnnTensorStruct hxDesc, 
                                                    @Const Pointer hx, 
                                                    cudnnTensorStruct cxDesc, 
                                                    @Const Pointer cx, 
                                                    cudnnFilterStruct wDesc, 
                                                    @Const Pointer w, 
                                                    @Cast("cudnnTensorStruct**") @ByPtrPtr cudnnTensorStruct yDesc,  
                                                    Pointer y, 
                                                    cudnnTensorStruct hyDesc, 
                                                    Pointer hy, 
                                                    cudnnTensorStruct cyDesc, 
                                                    Pointer cy, 
                                                    Pointer workspace, 
                                                    @Cast("size_t") long workSpaceSizeInBytes);             

                                           

public static native @Cast("cudnnStatus_t") int cudnnRNNForwardTraining( cudnnContext handle, 
                                                   cudnnRNNStruct rnnDesc, 
                                                   @Cast("cudnnTensorStruct**") @ByPtrPtr cudnnTensorStruct xDesc, 
                                                   @Const Pointer x, 
                                                   cudnnTensorStruct hxDesc, 
                                                   @Const Pointer hx, 
                                                   cudnnTensorStruct cxDesc, 
                                                   @Const Pointer cx, 
                                                   cudnnFilterStruct wDesc, 
                                                   @Const Pointer w, 
                                                   @Cast("cudnnTensorStruct**") @ByPtrPtr cudnnTensorStruct yDesc,  
                                                   Pointer y, 
                                                   cudnnTensorStruct hyDesc, 
                                                   Pointer hy, 
                                                   cudnnTensorStruct cyDesc, 
                                                   Pointer cy, 
                                                   Pointer workspace, 
                                                   @Cast("size_t") long workSpaceSizeInBytes,
                                                   Pointer reserveSpace, 
                                                   @Cast("size_t") long reserveSpaceSizeInBytes);

public static native @Cast("cudnnStatus_t") int cudnnRNNBackwardData( cudnnContext handle, 
                                                cudnnRNNStruct rnnDesc, 
                                                @Cast("cudnnTensorStruct**") @ByPtrPtr cudnnTensorStruct yDesc, 
                                                @Const Pointer y,                                                
                                                @Cast("cudnnTensorStruct**") @ByPtrPtr cudnnTensorStruct dyDesc, 
                                                @Const Pointer dy, 
                                                cudnnTensorStruct dhyDesc, 
                                                @Const Pointer dhy, 
                                                cudnnTensorStruct dcyDesc, 
                                                @Const Pointer dcy, 
                                                cudnnFilterStruct wDesc, 
                                                @Const Pointer w, 
                                                cudnnTensorStruct hxDesc, 
                                                @Const Pointer hx,                                                                  
                                                cudnnTensorStruct cxDesc, 
                                                @Const Pointer cx,                                                 
                                                @Cast("cudnnTensorStruct**") @ByPtrPtr cudnnTensorStruct dxDesc, 
                                                Pointer dx, 
                                                cudnnTensorStruct dhxDesc,
                                                Pointer dhx,
                                                cudnnTensorStruct dcxDesc,
                                                Pointer dcx,
                                                Pointer workspace,
                                                @Cast("size_t") long workSpaceSizeInBytes,
                                                @Const Pointer reserveSpace, 
                                                @Cast("size_t") long reserveSpaceSizeInBytes );


public static native @Cast("cudnnStatus_t") int cudnnRNNBackwardWeights( cudnnContext handle, 
                                                   cudnnRNNStruct rnnDesc, 
                                                   @Cast("cudnnTensorStruct**") @ByPtrPtr cudnnTensorStruct xDesc, 
                                                   @Const Pointer x, 
                                                   cudnnTensorStruct hxDesc, 
                                                   @Const Pointer hx,                                                   
                                                   @Cast("cudnnTensorStruct**") @ByPtrPtr cudnnTensorStruct yDesc, 
                                                   @Const Pointer y,
                                                   @Const Pointer workspace, 
                                                   @Cast("size_t") long workSpaceSizeInBytes, 
                                                   cudnnFilterStruct dwDesc, 
                                                   Pointer dw,
                                                   @Const Pointer reserveSpace, 
                                                   @Cast("size_t") long reserveSpaceSizeInBytes );
                                
                                
                                                                                                                        
/* DEPRECATED routines to be removed next release : 
   User should use the non-suffixed version (which has the API and functionality of _v4 version)
   Routines with _v3 suffix has the functionality of the non-suffixed routines in the CUDNN V4
 */
   
public static native @Cast("cudnnStatus_t") int cudnnSetFilter4dDescriptor_v3(
                                cudnnFilterStruct filterDesc,
                                @Cast("cudnnDataType_t") int dataType,
                                int k,
                                int c,
                                int h,
                                int w );      // width of  each input filter

public static native @Cast("cudnnStatus_t") int cudnnSetFilter4dDescriptor_v4(
                                cudnnFilterStruct filterDesc,
                                @Cast("cudnnDataType_t") int dataType,
                                @Cast("cudnnTensorFormat_t") int format,
                                int k,
                                int c,
                                int h,
                                int w );      // width of  each input filter
                                
public static native @Cast("cudnnStatus_t") int cudnnGetFilter4dDescriptor_v3(
                                cudnnFilterStruct filterDesc,
                                @Cast("cudnnDataType_t*") IntPointer dataType,
                                IntPointer k,
                                IntPointer c,
                                IntPointer h,
                                IntPointer w );
public static native @Cast("cudnnStatus_t") int cudnnGetFilter4dDescriptor_v3(
                                cudnnFilterStruct filterDesc,
                                @Cast("cudnnDataType_t*") IntBuffer dataType,
                                IntBuffer k,
                                IntBuffer c,
                                IntBuffer h,
                                IntBuffer w );
public static native @Cast("cudnnStatus_t") int cudnnGetFilter4dDescriptor_v3(
                                cudnnFilterStruct filterDesc,
                                @Cast("cudnnDataType_t*") int[] dataType,
                                int[] k,
                                int[] c,
                                int[] h,
                                int[] w );      // width of  each input filter

public static native @Cast("cudnnStatus_t") int cudnnGetFilter4dDescriptor_v4(
                                cudnnFilterStruct filterDesc,
                                @Cast("cudnnDataType_t*") IntPointer dataType,
                                @Cast("cudnnTensorFormat_t*") IntPointer format,
                                IntPointer k,
                                IntPointer c,
                                IntPointer h,
                                IntPointer w );
public static native @Cast("cudnnStatus_t") int cudnnGetFilter4dDescriptor_v4(
                                cudnnFilterStruct filterDesc,
                                @Cast("cudnnDataType_t*") IntBuffer dataType,
                                @Cast("cudnnTensorFormat_t*") IntBuffer format,
                                IntBuffer k,
                                IntBuffer c,
                                IntBuffer h,
                                IntBuffer w );
public static native @Cast("cudnnStatus_t") int cudnnGetFilter4dDescriptor_v4(
                                cudnnFilterStruct filterDesc,
                                @Cast("cudnnDataType_t*") int[] dataType,
                                @Cast("cudnnTensorFormat_t*") int[] format,
                                int[] k,
                                int[] c,
                                int[] h,
                                int[] w );      // width of  each input filter      
                                
public static native @Cast("cudnnStatus_t") int cudnnSetFilterNdDescriptor_v3(
                                cudnnFilterStruct filterDesc,
                                @Cast("cudnnDataType_t") int dataType,
                                int nbDims,
                                @Const IntPointer filterDimA );
public static native @Cast("cudnnStatus_t") int cudnnSetFilterNdDescriptor_v3(
                                cudnnFilterStruct filterDesc,
                                @Cast("cudnnDataType_t") int dataType,
                                int nbDims,
                                @Const IntBuffer filterDimA );
public static native @Cast("cudnnStatus_t") int cudnnSetFilterNdDescriptor_v3(
                                cudnnFilterStruct filterDesc,
                                @Cast("cudnnDataType_t") int dataType,
                                int nbDims,
                                @Const int[] filterDimA );


public static native @Cast("cudnnStatus_t") int cudnnSetFilterNdDescriptor_v4(
                                cudnnFilterStruct filterDesc,
                                @Cast("cudnnDataType_t") int dataType,
                                @Cast("cudnnTensorFormat_t") int format,
                                int nbDims,
                                @Const IntPointer filterDimA );
public static native @Cast("cudnnStatus_t") int cudnnSetFilterNdDescriptor_v4(
                                cudnnFilterStruct filterDesc,
                                @Cast("cudnnDataType_t") int dataType,
                                @Cast("cudnnTensorFormat_t") int format,
                                int nbDims,
                                @Const IntBuffer filterDimA );
public static native @Cast("cudnnStatus_t") int cudnnSetFilterNdDescriptor_v4(
                                cudnnFilterStruct filterDesc,
                                @Cast("cudnnDataType_t") int dataType,
                                @Cast("cudnnTensorFormat_t") int format,
                                int nbDims,
                                @Const int[] filterDimA );   
                                
public static native @Cast("cudnnStatus_t") int cudnnGetFilterNdDescriptor_v3(
                                cudnnFilterStruct filterDesc,
                                int nbDimsRequested,
                                @Cast("cudnnDataType_t*") IntPointer dataType,
                                IntPointer nbDims,
                                IntPointer filterDimA );
public static native @Cast("cudnnStatus_t") int cudnnGetFilterNdDescriptor_v3(
                                cudnnFilterStruct filterDesc,
                                int nbDimsRequested,
                                @Cast("cudnnDataType_t*") IntBuffer dataType,
                                IntBuffer nbDims,
                                IntBuffer filterDimA );
public static native @Cast("cudnnStatus_t") int cudnnGetFilterNdDescriptor_v3(
                                cudnnFilterStruct filterDesc,
                                int nbDimsRequested,
                                @Cast("cudnnDataType_t*") int[] dataType,
                                int[] nbDims,
                                int[] filterDimA );

public static native @Cast("cudnnStatus_t") int cudnnGetFilterNdDescriptor_v4(
                                cudnnFilterStruct filterDesc,
                                int nbDimsRequested,
                                @Cast("cudnnDataType_t*") IntPointer dataType,
                                @Cast("cudnnTensorFormat_t*") IntPointer format,
                                IntPointer nbDims,
                                IntPointer filterDimA );
public static native @Cast("cudnnStatus_t") int cudnnGetFilterNdDescriptor_v4(
                                cudnnFilterStruct filterDesc,
                                int nbDimsRequested,
                                @Cast("cudnnDataType_t*") IntBuffer dataType,
                                @Cast("cudnnTensorFormat_t*") IntBuffer format,
                                IntBuffer nbDims,
                                IntBuffer filterDimA );
public static native @Cast("cudnnStatus_t") int cudnnGetFilterNdDescriptor_v4(
                                cudnnFilterStruct filterDesc,
                                int nbDimsRequested,
                                @Cast("cudnnDataType_t*") int[] dataType,
                                @Cast("cudnnTensorFormat_t*") int[] format,
                                int[] nbDims,
                                int[] filterDimA );  
                                
public static native @Cast("cudnnStatus_t") int cudnnSetPooling2dDescriptor_v3(
                                cudnnPoolingStruct poolingDesc,
                                @Cast("cudnnPoolingMode_t") int mode,
                                int windowHeight,
                                int windowWidth,
                                int verticalPadding,
                                int horizontalPadding,
                                int verticalStride,
                                int horizontalStride );

public static native @Cast("cudnnStatus_t") int cudnnSetPooling2dDescriptor_v4(
                                cudnnPoolingStruct poolingDesc,
                                @Cast("cudnnPoolingMode_t") int mode,
                                @Cast("cudnnNanPropagation_t") int maxpoolingNanOpt,
                                int windowHeight,
                                int windowWidth,
                                int verticalPadding,
                                int horizontalPadding,
                                int verticalStride,
                                int horizontalStride );                                                                                                              
public static native @Cast("cudnnStatus_t") int cudnnGetPooling2dDescriptor_v3(
                                cudnnPoolingStruct poolingDesc,
                                @Cast("cudnnPoolingMode_t*") IntPointer mode,
                                IntPointer windowHeight,
                                IntPointer windowWidth,
                                IntPointer verticalPadding,
                                IntPointer horizontalPadding,
                                IntPointer verticalStride,
                                IntPointer horizontalStride );
public static native @Cast("cudnnStatus_t") int cudnnGetPooling2dDescriptor_v3(
                                cudnnPoolingStruct poolingDesc,
                                @Cast("cudnnPoolingMode_t*") IntBuffer mode,
                                IntBuffer windowHeight,
                                IntBuffer windowWidth,
                                IntBuffer verticalPadding,
                                IntBuffer horizontalPadding,
                                IntBuffer verticalStride,
                                IntBuffer horizontalStride );
public static native @Cast("cudnnStatus_t") int cudnnGetPooling2dDescriptor_v3(
                                cudnnPoolingStruct poolingDesc,
                                @Cast("cudnnPoolingMode_t*") int[] mode,
                                int[] windowHeight,
                                int[] windowWidth,
                                int[] verticalPadding,
                                int[] horizontalPadding,
                                int[] verticalStride,
                                int[] horizontalStride );

public static native @Cast("cudnnStatus_t") int cudnnGetPooling2dDescriptor_v4(
                                cudnnPoolingStruct poolingDesc,
                                @Cast("cudnnPoolingMode_t*") IntPointer mode,
                                @Cast("cudnnNanPropagation_t*") IntPointer maxpoolingNanOpt,
                                IntPointer windowHeight,
                                IntPointer windowWidth,
                                IntPointer verticalPadding,
                                IntPointer horizontalPadding,
                                IntPointer verticalStride,
                                IntPointer horizontalStride );
public static native @Cast("cudnnStatus_t") int cudnnGetPooling2dDescriptor_v4(
                                cudnnPoolingStruct poolingDesc,
                                @Cast("cudnnPoolingMode_t*") IntBuffer mode,
                                @Cast("cudnnNanPropagation_t*") IntBuffer maxpoolingNanOpt,
                                IntBuffer windowHeight,
                                IntBuffer windowWidth,
                                IntBuffer verticalPadding,
                                IntBuffer horizontalPadding,
                                IntBuffer verticalStride,
                                IntBuffer horizontalStride );
public static native @Cast("cudnnStatus_t") int cudnnGetPooling2dDescriptor_v4(
                                cudnnPoolingStruct poolingDesc,
                                @Cast("cudnnPoolingMode_t*") int[] mode,
                                @Cast("cudnnNanPropagation_t*") int[] maxpoolingNanOpt,
                                int[] windowHeight,
                                int[] windowWidth,
                                int[] verticalPadding,
                                int[] horizontalPadding,
                                int[] verticalStride,
                                int[] horizontalStride );   

public static native @Cast("cudnnStatus_t") int cudnnSetPoolingNdDescriptor_v3(
                                cudnnPoolingStruct poolingDesc,
                                @Cast("const cudnnPoolingMode_t") int mode,
                                int nbDims,
                                @Const IntPointer windowDimA,
                                @Const IntPointer paddingA,
                                @Const IntPointer strideA );
public static native @Cast("cudnnStatus_t") int cudnnSetPoolingNdDescriptor_v3(
                                cudnnPoolingStruct poolingDesc,
                                @Cast("const cudnnPoolingMode_t") int mode,
                                int nbDims,
                                @Const IntBuffer windowDimA,
                                @Const IntBuffer paddingA,
                                @Const IntBuffer strideA );
public static native @Cast("cudnnStatus_t") int cudnnSetPoolingNdDescriptor_v3(
                                cudnnPoolingStruct poolingDesc,
                                @Cast("const cudnnPoolingMode_t") int mode,
                                int nbDims,
                                @Const int[] windowDimA,
                                @Const int[] paddingA,
                                @Const int[] strideA );

public static native @Cast("cudnnStatus_t") int cudnnSetPoolingNdDescriptor_v4(
                                cudnnPoolingStruct poolingDesc,
                                @Cast("const cudnnPoolingMode_t") int mode,
                                @Cast("const cudnnNanPropagation_t") int maxpoolingNanOpt,
                                int nbDims,
                                @Const IntPointer windowDimA,
                                @Const IntPointer paddingA,
                                @Const IntPointer strideA );
public static native @Cast("cudnnStatus_t") int cudnnSetPoolingNdDescriptor_v4(
                                cudnnPoolingStruct poolingDesc,
                                @Cast("const cudnnPoolingMode_t") int mode,
                                @Cast("const cudnnNanPropagation_t") int maxpoolingNanOpt,
                                int nbDims,
                                @Const IntBuffer windowDimA,
                                @Const IntBuffer paddingA,
                                @Const IntBuffer strideA );
public static native @Cast("cudnnStatus_t") int cudnnSetPoolingNdDescriptor_v4(
                                cudnnPoolingStruct poolingDesc,
                                @Cast("const cudnnPoolingMode_t") int mode,
                                @Cast("const cudnnNanPropagation_t") int maxpoolingNanOpt,
                                int nbDims,
                                @Const int[] windowDimA,
                                @Const int[] paddingA,
                                @Const int[] strideA );

public static native @Cast("cudnnStatus_t") int cudnnGetPoolingNdDescriptor_v3(
                                cudnnPoolingStruct poolingDesc,
                                int nbDimsRequested,
                                @Cast("cudnnPoolingMode_t*") IntPointer mode,
                                IntPointer nbDims,
                                IntPointer windowDimA,
                                IntPointer paddingA,
                                IntPointer strideA );
public static native @Cast("cudnnStatus_t") int cudnnGetPoolingNdDescriptor_v3(
                                cudnnPoolingStruct poolingDesc,
                                int nbDimsRequested,
                                @Cast("cudnnPoolingMode_t*") IntBuffer mode,
                                IntBuffer nbDims,
                                IntBuffer windowDimA,
                                IntBuffer paddingA,
                                IntBuffer strideA );
public static native @Cast("cudnnStatus_t") int cudnnGetPoolingNdDescriptor_v3(
                                cudnnPoolingStruct poolingDesc,
                                int nbDimsRequested,
                                @Cast("cudnnPoolingMode_t*") int[] mode,
                                int[] nbDims,
                                int[] windowDimA,
                                int[] paddingA,
                                int[] strideA );

public static native @Cast("cudnnStatus_t") int cudnnGetPoolingNdDescriptor_v4(
                                cudnnPoolingStruct poolingDesc,
                                int nbDimsRequested,
                                @Cast("cudnnPoolingMode_t*") IntPointer mode,
                                @Cast("cudnnNanPropagation_t*") IntPointer maxpoolingNanOpt,
                                IntPointer nbDims,
                                IntPointer windowDimA,
                                IntPointer paddingA,
                                IntPointer strideA );
public static native @Cast("cudnnStatus_t") int cudnnGetPoolingNdDescriptor_v4(
                                cudnnPoolingStruct poolingDesc,
                                int nbDimsRequested,
                                @Cast("cudnnPoolingMode_t*") IntBuffer mode,
                                @Cast("cudnnNanPropagation_t*") IntBuffer maxpoolingNanOpt,
                                IntBuffer nbDims,
                                IntBuffer windowDimA,
                                IntBuffer paddingA,
                                IntBuffer strideA );
public static native @Cast("cudnnStatus_t") int cudnnGetPoolingNdDescriptor_v4(
                                cudnnPoolingStruct poolingDesc,
                                int nbDimsRequested,
                                @Cast("cudnnPoolingMode_t*") int[] mode,
                                @Cast("cudnnNanPropagation_t*") int[] maxpoolingNanOpt,
                                int[] nbDims,
                                int[] windowDimA,
                                int[] paddingA,
                                int[] strideA );

public static native @Cast("cudnnStatus_t") int cudnnActivationForward_v3(
                                cudnnContext handle,
                                @Cast("cudnnActivationMode_t") int mode,
                                @Const Pointer alpha,
                                cudnnTensorStruct xDesc,
                                @Const Pointer x,
                                @Const Pointer beta,
                                cudnnTensorStruct yDesc,
                                Pointer y );

public static native @Cast("cudnnStatus_t") int cudnnActivationForward_v4(
                                cudnnContext handle,
                                cudnnActivationStruct activationDesc,
                                @Const Pointer alpha,
                                cudnnTensorStruct xDesc,
                                @Const Pointer x,
                                @Const Pointer beta,
                                cudnnTensorStruct yDesc,
                                Pointer y ); 
                                
public static native @Cast("cudnnStatus_t") int cudnnActivationBackward_v3(
                                cudnnContext handle,
                                @Cast("cudnnActivationMode_t") int mode,
                                @Const Pointer alpha,
                                cudnnTensorStruct yDesc,
                                @Const Pointer y,
                                cudnnTensorStruct dyDesc,
                                @Const Pointer dy,
                                cudnnTensorStruct xDesc,
                                @Const Pointer x,
                                @Const Pointer beta,
                                cudnnTensorStruct dxDesc,
                                Pointer dx );

public static native @Cast("cudnnStatus_t") int cudnnActivationBackward_v4(
                                cudnnContext handle,
                                cudnnActivationStruct activationDesc,
                                @Const Pointer alpha,
                                cudnnTensorStruct yDesc,
                                @Const Pointer y,
                                cudnnTensorStruct dyDesc,
                                @Const Pointer dy,
                                cudnnTensorStruct xDesc,
                                @Const Pointer x,
                                @Const Pointer beta,
                                cudnnTensorStruct dxDesc,
                                Pointer dx );
                                                                                                   

// #if defined (__cplusplus)
// #endif

// #endif /* CUDNN_H_ */


}
