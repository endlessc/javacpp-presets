// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ale;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.ale.global.ale.*;


/**
  This class provides an interface for accessing operating system specific
  functions.  It also comprises an overall parent object, to which all the
  other objects belong.
  <p>
  @author  Stephen Anthony
  @version $Id: OSystem.hxx,v 1.55 2007/08/12 23:05:12 stephena Exp $
*/
@NoOffset @Properties(inherit = org.bytedeco.ale.presets.ale.class)
public class OSystem extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OSystem(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OSystem(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public OSystem position(long position) {
        return (OSystem)super.position(position);
    }
    @Override public OSystem getPointer(long i) {
        return new OSystem((Pointer)this).offsetAddress(i);
    }

    /**
      Create a new OSystem abstract class
    */
    public OSystem() { super((Pointer)null); allocate(); }
    private native void allocate();

    /**
      Destructor
    */

    /**
      Create all child objects which belong to this OSystem
    */
    public native @Cast("bool") boolean create();
    /**
      Adds the specified settings object to the system.
      <p>
      @param settings The settings object to add 
    */
    public native void attach(Settings settings);

    /**  //ALE 
      Get the event object of the system  
      <p>
      @return The event object
    */
    public native Event event();

    /**
      Get the sound object of the system
      <p>
      @return The sound object
    */
    public native @ByRef Sound sound();

    /**
      Get the screen object of the system
      <p>
      @return The screen object
    */
    public native @ByRef Screen screen();

    /**
      Get the settings object of the system
      <p>
      @return The settings object
    */
    public native @ByRef Settings settings();

    /**
      Get the console of the system.
      <p>
      @return The console object
    */
    public native @ByRef Console console();

    /**
      Set the framerate for the video system.  It's placed in this class since
      the mainLoop() method is defined here.
      <p>
      @param framerate  The video framerate to use
    */
    public native void setFramerate(@Cast("uint32_t") int framerate);

    /**
      Get the current framerate for the video system.
      <p>
      @return  The video framerate currently in use
    */
    public native @Cast("uint32_t") int frameRate();

    /**
      This method should be called to get the full path of the currently
      loaded ROM.
      <p>
      @return String representing the full path of the ROM file.
    */
    public native @StdString BytePointer romFile();

    /**
      Creates a new game console from the specified romfile.
      <p>
      @param romfile  The full pathname of the ROM to use
      @return  True on successful creation, otherwise false
    */
    public native @Cast("bool") boolean createConsole(@Cast("const char*") BytePointer romfile/*=""*/);
    public native @Cast("bool") boolean createConsole();
    public native @Cast("bool") boolean createConsole(String romfile/*=""*/);

    /**
      Deletes the currently defined console, if it exists.
      Also prints some statistics (fps, total frames, etc).
    */
    public native void deleteConsole();

    /**
      Open the given ROM and return an array containing its contents.
      <p>
      @param rom    The absolute pathname of the ROM file
      @param md5    The md5 calculated from the ROM file
      @param image  A pointer to store the ROM data
                    Note, the calling method is responsible for deleting this
      @param size   The amount of data read into the image array
      @return  False on any errors, else true
    */
    public native @Cast("bool") boolean openROM(@Cast("const char*") BytePointer rom, @StdString @ByRef BytePointer md5, @Cast("uint8_t**") PointerPointer image, IntPointer size);
    public native @Cast("bool") boolean openROM(@Cast("const char*") BytePointer rom, @StdString @ByRef BytePointer md5, @Cast("uint8_t**") @ByPtrPtr BytePointer image, IntPointer size);
    public native @Cast("bool") boolean openROM(String rom, @StdString @ByRef BytePointer md5, @Cast("uint8_t**") @ByPtrPtr ByteBuffer image, IntBuffer size);
    public native @Cast("bool") boolean openROM(@Cast("const char*") BytePointer rom, @StdString @ByRef BytePointer md5, @Cast("uint8_t**") @ByPtrPtr byte[] image, int[] size);
    public native @Cast("bool") boolean openROM(String rom, @StdString @ByRef BytePointer md5, @Cast("uint8_t**") @ByPtrPtr BytePointer image, IntPointer size);
    public native @Cast("bool") boolean openROM(@Cast("const char*") BytePointer rom, @StdString @ByRef BytePointer md5, @Cast("uint8_t**") @ByPtrPtr ByteBuffer image, IntBuffer size);
    public native @Cast("bool") boolean openROM(String rom, @StdString @ByRef BytePointer md5, @Cast("uint8_t**") @ByPtrPtr byte[] image, int[] size); //ALE
    public native @ByRef ColourPalette colourPalette();
}
