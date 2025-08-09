package OOPs.inheritance;

class first {
  void animal() {
    System.out.println("animal class");
  }
}

class second extends first {
  void dog() {
    System.out.println("dog");
  }
}

class third extends second {
  void jerry() {
    System.out.println("this is third class");
  }
}

class fourth extends second {
  void tom() {
    System.out.println("this is foutth class");
  }
}

public class hybrid {
  public static void main(String[] args) {
    fourth f = new fourth();
    f.animal();
    f.dog();
    f.tom();
  }

}
