package com.dephillipsdesign.lychee.base;

import com.google.common.base.Ascii;
import com.google.common.base.CaseFormat;

public class SentenceCaseFormat {

  public static String from(CaseFormat format, String original) {
    String camelized = format.to(CaseFormat.UPPER_CAMEL, original);
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < camelized.length(); i++) {
      char c = camelized.charAt(i);
      if (Ascii.isUpperCase(c)) {
        sb.append(" ");
      }
      sb.append(c);
    }

    return sb.toString().trim();
  }

}
