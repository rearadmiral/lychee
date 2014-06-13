package com.dephillipsdesign.lychee.io;

import java.io.File;

public class Filesystem {
  public static void rm_rf(File dir) {
    if (dir.isDirectory()) {
      for (File children : dir.listFiles()) {
        rm_rf(children);
      }
    }
    dir.delete();
  }
}
