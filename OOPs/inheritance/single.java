package OOPs.inheritance;


public class single extends parentUp {
  void messg() {
    System.out.println("this is child class messg method");
  }

  public static void main(String[] args) {
    single s = new single();
    s.ram();
    s.messg();

  }
}
