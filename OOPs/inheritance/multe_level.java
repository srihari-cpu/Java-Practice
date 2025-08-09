package OOPs.inheritance;

class middleChild extends parentUp {
  void hanuman() {

    System.out.println("hanumna");
  }
}

public class multe_level extends middleChild {
  void sitha() {

    System.out.println("sitha");
  }

  public static void main(String[] args) {
    multe_level m = new multe_level();
    m.ram();
    m.hanuman();
    m.sitha();
  }

}
