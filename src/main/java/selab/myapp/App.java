package selab.myapp;

/**
 * Hello world!
 *
 */
public class App {

  String name = "";

  public App(String name) {
    while (true) {
      System.out.println("test");
    }

  }

  public String getName() {
    return "Hello " + name;
  }

  public static void main(String[] args) {
    while (true) {
      System.out.println("infinite loop");
    }
  }
}
