package com.dephillipsdesign.lychee.host;

import com.google.common.base.Optional;

public enum OS {
  LINUX("/var/www"), OSX(System.getProperty("user.home") + "/Sites"), WINDOWS(
      null), UNKNOWN(null);

  private String defaultDocRoot;

  public Optional<String> getDefaultDocRoot() {
    return Optional.fromNullable(defaultDocRoot);
  }

  private OS(String defaultDocRoot) {
    this.defaultDocRoot = defaultDocRoot;
  }
}