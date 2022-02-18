// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ale;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.ale.global.ale.*;


@Namespace("ale") @NoOffset @Properties(inherit = org.bytedeco.ale.presets.ale.class)
public class ALEState extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ALEState(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ALEState(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ALEState position(long position) {
        return (ALEState)super.position(position);
    }
    @Override public ALEState getPointer(long i) {
        return new ALEState((Pointer)this).offsetAddress(i);
    }

  public ALEState() { super((Pointer)null); allocate(); }
  private native void allocate();
  // Makes a copy of this state, also storing emulator information provided as a string
  public ALEState(@Const @ByRef ALEState rhs, @StdString BytePointer serialized) { super((Pointer)null); allocate(rhs, serialized); }
  private native void allocate(@Const @ByRef ALEState rhs, @StdString BytePointer serialized);
  public ALEState(@Const @ByRef ALEState rhs, @StdString String serialized) { super((Pointer)null); allocate(rhs, serialized); }
  private native void allocate(@Const @ByRef ALEState rhs, @StdString String serialized);

  // Restores a serialized ALEState
  public ALEState(@StdString BytePointer serialized) { super((Pointer)null); allocate(serialized); }
  private native void allocate(@StdString BytePointer serialized);
  public ALEState(@StdString String serialized) { super((Pointer)null); allocate(serialized); }
  private native void allocate(@StdString String serialized);

  /** Resets the system to its start state. numResetSteps 'RESET' actions are taken after the
   *  start. */
  

  /** Returns true if the two states contain the same saved information */
  public native @Cast("bool") boolean equals(@ByRef ALEState state);

  public native void resetPaddles(Event arg0);

  //Apply the special select action
  public native void pressSelect(Event event_obj);

  /** Applies paddle actions. This actually modifies the game state by updating the paddle
      *  resistances. */
  public native void applyActionPaddles(Event event_obj, int player_a_action,
                            int player_b_action);
  /** Sets the joystick events. No effect until the emulator is run forward. */
  public native void setActionJoysticks(Event event_obj, int player_a_action,
                            int player_b_action);

  public native void incrementFrame(int steps/*=1*/);
  public native void incrementFrame();

  public native void resetEpisodeFrameNumber();

  //Get the frames executed so far
  public native int getFrameNumber();

  //Get the number of frames executed this episode.
  public native int getEpisodeFrameNumber();

  /** set the difficulty according to the value.
   *  If the first bit is 1, then it will put the left difficulty switch to A (otherwise leave it on B)
   *  If the second bit is 1, then it will put the right difficulty switch to A (otherwise leave it on B)
   */
  public native void setDifficulty(@Cast("unsigned int") int value);

  // Returns the current difficulty setting.
  public native @Cast("unsigned int") int getDifficulty();

  //Save the current mode we are supposed to be in.
  public native void setCurrentMode(@Cast("ale::game_mode_t") int value);

  //Get the current mode we are in.
  public native @Cast("ale::game_mode_t") int getCurrentMode();

  public native @StdString BytePointer serialize();
}
