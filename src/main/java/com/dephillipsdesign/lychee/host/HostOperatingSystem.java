package com.dephillipsdesign.lychee.host;

public class HostOperatingSystem {

  private HostOperatingSystem() {
  }

  public static OS getHostOS() {
    OS detectedOS = OS.UNKNOWN;
    String osName = System.getProperty("os.name");
    if (osName.equalsIgnoreCase("linux")) {
      detectedOS = OS.LINUX;
    }
    return detectedOS;

  }
}
