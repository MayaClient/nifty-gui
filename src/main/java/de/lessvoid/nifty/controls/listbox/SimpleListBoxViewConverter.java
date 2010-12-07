package de.lessvoid.nifty.controls.listbox;

import de.lessvoid.nifty.elements.Element;
import de.lessvoid.nifty.elements.render.TextRenderer;

/**
 * A simple implementation of ListBoxViewConverter that will just use item.toString().
 * This is the default SimpleListBoxViewConverter used when you don't set a different implementation.
 * @author void
 *
 * @param <T>
 */
public class SimpleListBoxViewConverter<T> implements ListBoxViewConverter<T> {

  @Override
  public void display(final Element element, final T item) {
    if (item != null) {
      element.getRenderer(TextRenderer.class).setText(item.toString());
    } else {
      element.getRenderer(TextRenderer.class).setText("");
    }
  }
}
