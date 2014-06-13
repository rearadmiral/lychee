package com.dephillipsdesign.lychee.base;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import com.google.common.base.CaseFormat;

public class SentenceCaseFormatTest {

  @Test
  public void testFromUppperUnderscoreWorks() {
    Assert
        .assertThat(SentenceCaseFormat.from(CaseFormat.UPPER_UNDERSCORE, "OSITO_BEAR"), CoreMatchers.is("Osito Bear"));
  }

}
