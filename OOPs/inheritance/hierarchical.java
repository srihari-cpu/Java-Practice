package OOPs.inheritance;

class parent {
  public void goodmrng() {
    System.out.println("Hello Good morning");
  }
}

class child extends parent {
  void bark() {
    System.out.println("Barking");
  }
}

public class hierarchical extends parent {
  void important() {
    System.out.println("this is important");
  }

  public static void main(String[] args) {
    hierarchical h = new hierarchical();
    child c = new child();
    h.important();
    h.goodmrng();
    c.bark();
    c.goodmrng();

  }
}
