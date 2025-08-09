package OOPs.polymorphism;

class first {
  void test() {
    System.out.println("this is first class test method");
  }
}

public class override extends first {
  void test() {
    System.out.println("this is second class overridden method");
  }

  public static void main(String[] args) {
    override o = new override();
    o.test();
  }

}
