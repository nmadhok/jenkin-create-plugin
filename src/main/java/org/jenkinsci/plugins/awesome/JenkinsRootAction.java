package org.jenkinsci.plugins.awesome;

import hudson.Extension;
import hudson.model.RootAction;

@Extension
public class JenkinsRootAction implements RootAction {
  public String getIconFileName() {
    return "images/icon.png";
  }
  public String getDisplayName() {
    return "TestPlugin";
  }
  public String getUrlName() {
    return "http://130.127.193.80:8080";
  }
}
