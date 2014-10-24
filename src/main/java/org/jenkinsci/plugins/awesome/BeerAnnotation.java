package org.jenkinsci.plugins.awesome;

import hudson.MarkupText;
import hudson.console.ConsoleAnnotator;
import hudson.console.ConsoleNote;

public class BeerAnnotation extends ConsoleNote {
  @Override
  public ConsoleAnnotator annotate(Object context, MarkupText markupText, int textLocation) {
    String returnValue = "<p color=\"red\">";
    returnValue = returnValue + markupText.getText();
    returnValue = returnValue + "</p>";
    markupText.addMarkup(textLocation, returnValue);
    return null;
  }
}
