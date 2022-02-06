package org.example;

import org.junit.Assert;
import org.junit.Test;

public class MyOtherTest {
  @Test
  public void testA() {
    Assert.assertTrue(true);
  }

  @Test
  public void testB() {
    Assert.assertTrue(1 < 0);
  }
}
