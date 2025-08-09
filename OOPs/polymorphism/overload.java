package OOPs.polymorphism;

class Sum {
  int add(int a, int b) {
    return a + b;
  }
}

public class overload extends Sum {
  int add(int a, int b, int c) {
    return a + b + c;
  }

  public static void main(String[] args) {
    overload o = new overload();
    System.out.println(o.add(1, 2, 3));
  }

}
