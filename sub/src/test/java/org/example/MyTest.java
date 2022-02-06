package org.example;

import org.junit.Assert;
import org.junit.Test;

public class MyTest {
  @Test
  public void testOne() {
    Assert.assertTrue(true);
  }

  @Test
  public void testTwo() {
    Assert.assertTrue(1 < 0);
  }
}
