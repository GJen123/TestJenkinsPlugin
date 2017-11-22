package selab.myapp;

/**
 * Hello world!
 *
 */
public class App {

  String name = "";

  public App(String name) {
    this.name = name;
  }

  public String getName() {
    while (true) {
      System.out.println("infinite loop");
      return "Hello " + name;
    }
  }

  public static void main(String[] args) {
    while (true) {
      System.out.println("infinite loop");
    }
  }
}
