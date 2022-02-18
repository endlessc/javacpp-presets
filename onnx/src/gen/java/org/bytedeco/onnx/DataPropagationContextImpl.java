// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;


@Namespace("onnx::shape_inference") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class DataPropagationContextImpl extends DataPropagationContext {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DataPropagationContextImpl(Pointer p) { super(p); }

  public DataPropagationContextImpl(
        @ByRef NodeProto n,
        @Const @ByRef StringTypeProtoMap valueTypesByName,
        @Const @ByRef StringTensorProtoMap inputDataByName,
        @ByRef StringTensorShapeProtoMap generatedShapeData) { super((Pointer)null); allocate(n, valueTypesByName, inputDataByName, generatedShapeData); }
  private native void allocate(
        @ByRef NodeProto n,
        @Const @ByRef StringTypeProtoMap valueTypesByName,
        @Const @ByRef StringTensorProtoMap inputDataByName,
        @ByRef StringTensorShapeProtoMap generatedShapeData);

  public native @Const AttributeProto getAttribute(@StdString BytePointer name);
  public native @Const AttributeProto getAttribute(@StdString String name);

  public native @Cast("size_t") long getNumInputs();

  public native @Const TypeProto getInputType(@Cast("size_t") long index);

  public native @Cast("size_t") long getNumOutputs();

  public native @Const TypeProto getOutputType(@Cast("size_t") long index);

  // Convert integer vector into TensorShapeProto

  public native @Const TensorShapeProto getInputData(@Cast("size_t") long index);

  public native void addOutputData(@Cast("size_t") long index, @ByRef(true) TensorShapeProto tsp);

  public native @Cast("const onnx::TensorProto**") @StdVector PointerPointer allInputData_(); public native DataPropagationContextImpl allInputData_(PointerPointer setter);
  public native @ByRef SizeTStringMap inputIndexToNameMap_(); public native DataPropagationContextImpl inputIndexToNameMap_(SizeTStringMap setter);
  public native @ByRef SizeTStringMap outputIndexToNameMap_(); public native DataPropagationContextImpl outputIndexToNameMap_(SizeTStringMap setter);
  public native @Cast("const onnx::TypeProto**") @StdVector PointerPointer allInputTypes_(); public native DataPropagationContextImpl allInputTypes_(PointerPointer setter);
  public native @StdVector TypeProto allOutputTypes_(); public native DataPropagationContextImpl allOutputTypes_(TypeProto setter);
  public native @ByRef StringTensorShapeProtoMap generatedShapeData_(); public native DataPropagationContextImpl generatedShapeData_(StringTensorShapeProtoMap setter);
  public native @ByRef StringAttributeProtoMap attributesByName_(); public native DataPropagationContextImpl attributesByName_(StringAttributeProtoMap setter);
}
