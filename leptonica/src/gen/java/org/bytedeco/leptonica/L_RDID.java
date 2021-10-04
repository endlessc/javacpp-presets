// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.leptonica.global.lept.*;


/**
 *  Data used for decoding a line of characters.
 */
@Name("L_Rdid") @Properties(inherit = org.bytedeco.leptonica.presets.lept.class)
public class L_RDID extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public L_RDID() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public L_RDID(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public L_RDID(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public L_RDID position(long position) {
        return (L_RDID)super.position(position);
    }
    @Override public L_RDID getPointer(long i) {
        return new L_RDID((Pointer)this).offsetAddress(i);
    }

    /** clone of pix to be decoded             */
    public native PIX pixs(); public native L_RDID pixs(PIX setter);
    /** count array for each averaged template */
    public native @Cast("l_int32*") IntPointer counta(int i); public native L_RDID counta(int i, IntPointer setter);
    public native @Cast("l_int32**") PointerPointer counta(); public native L_RDID counta(PointerPointer setter);
    /** best y-shift array per average template */
    public native @Cast("l_int32*") IntPointer delya(int i); public native L_RDID delya(int i, IntPointer setter);
    public native @Cast("l_int32**") PointerPointer delya(); public native L_RDID delya(PointerPointer setter);
    /** number of averaged templates           */
    public native @Cast("l_int32") int narray(); public native L_RDID narray(int setter);
    /** size of count array (width of pixs)    */
    public native @Cast("l_int32") int size(); public native L_RDID size(int setter);
    /** setwidths for each template            */
    public native @Cast("l_int32*") IntPointer setwidth(); public native L_RDID setwidth(IntPointer setter);
    /** pixel count in pixs by column          */
    public native NUMA nasum(); public native L_RDID nasum(NUMA setter);
    /** first moment of pixels in pixs by cols */
    public native NUMA namoment(); public native L_RDID namoment(NUMA setter);
    /** 1 if full arrays are made; 0 otherwise */
    public native @Cast("l_int32") int fullarrays(); public native L_RDID fullarrays(int setter);
    /** channel coeffs for template fg term    */
    public native @Cast("l_float32*") FloatPointer beta(); public native L_RDID beta(FloatPointer setter);
    /** channel coeffs for bit-and term        */
    public native @Cast("l_float32*") FloatPointer gamma(); public native L_RDID gamma(FloatPointer setter);
    /** score on trellis                       */
    public native @Cast("l_float32*") FloatPointer trellisscore(); public native L_RDID trellisscore(FloatPointer setter);
    /** template on trellis (for backtrack)    */
    public native @Cast("l_int32*") IntPointer trellistempl(); public native L_RDID trellistempl(IntPointer setter);
    /** indices of best path templates         */
    public native NUMA natempl(); public native L_RDID natempl(NUMA setter);
    /** x locations of best path templates     */
    public native NUMA naxloc(); public native L_RDID naxloc(NUMA setter);
    /** y locations of best path templates     */
    public native NUMA nadely(); public native L_RDID nadely(NUMA setter);
    /** widths of best path templates          */
    public native NUMA nawidth(); public native L_RDID nawidth(NUMA setter);
    /** Viterbi result for splitting input pixs */
    public native BOXA boxa(); public native L_RDID boxa(BOXA setter);
    /** correlation scores: best path templates */
    public native NUMA nascore(); public native L_RDID nascore(NUMA setter);
    /** indices of best rescored templates     */
    public native NUMA natempl_r(); public native L_RDID natempl_r(NUMA setter);
    /** samples of best scored templates       */
    public native NUMA nasample_r(); public native L_RDID nasample_r(NUMA setter);
    /** x locations of best rescoredtemplates  */
    public native NUMA naxloc_r(); public native L_RDID naxloc_r(NUMA setter);
    /** y locations of best rescoredtemplates  */
    public native NUMA nadely_r(); public native L_RDID nadely_r(NUMA setter);
    /** widths of best rescoredtemplates       */
    public native NUMA nawidth_r(); public native L_RDID nawidth_r(NUMA setter);
    /** correlation scores: rescored templates */
    public native NUMA nascore_r(); public native L_RDID nascore_r(NUMA setter);
}
