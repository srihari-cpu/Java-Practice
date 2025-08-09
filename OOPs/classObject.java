package OOPs;

class classObject {
  public static void main(String[] args) {
    It i = new It();
    i.getName();
  }
}

class It {
  private int rollNo;
  private String name;
  private int mobile;

  It(int r, String n, int m) {
    this.rollNo = r;
    this.name = n;
    this.mobile = m;
  }

  It() {
    this.name = "empty";
    this.rollNo = 0;
    this.mobile = 0000;
  }

  public void getName() {
    System.out.println(rollNo);
    System.out.println(name);
    System.out.println(mobile);
  }
}