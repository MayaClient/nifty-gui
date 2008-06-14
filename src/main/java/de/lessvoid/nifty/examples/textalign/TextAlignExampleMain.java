package de.lessvoid.nifty.examples.textalign;

import de.lessvoid.nifty.Nifty;
import de.lessvoid.nifty.examples.LwjglInitHelper;
import de.lessvoid.nifty.render.opengl.RenderDeviceLwjgl;
import de.lessvoid.nifty.sound.SoundSystem;
import de.lessvoid.nifty.sound.slick.SlickSoundLoader;
import de.lessvoid.nifty.tools.TimeProvider;

/**
 * Text Align Example.
 * @author void
 */
public final class TextAlignExampleMain {

  /**
   * Prevent instantiation of this class.
   */
  private TextAlignExampleMain() {
  }

  /**
   * Main method.
   * @param args arguments
   */
  public static void main(final String[] args) {
    if (!LwjglInitHelper.initSubSystems("Nifty Textalign Example")) {
      System.exit(0);
    }

    // create nifty
    Nifty nifty = new Nifty(
        new RenderDeviceLwjgl(),
        new SoundSystem(new SlickSoundLoader()),
        new TimeProvider());
    nifty.fromXml("textalign/textalign.xml");

    // render
    LwjglInitHelper.renderLoop(nifty);
    LwjglInitHelper.destroy();
  }
}
