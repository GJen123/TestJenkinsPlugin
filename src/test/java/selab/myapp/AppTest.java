package selab.myapp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

  App app = new App("James");

  @Test
  public void testGetName() {
    assertEquals("Hello James", app.getName());
  }
}
