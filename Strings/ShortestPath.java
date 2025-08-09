package Strings;

public class ShortestPath {
  public static void main(String[] args) {
    String str = "WNEENESENNN";
    findShortestPath(str);
  }

  public static void findShortestPath(String str) {
    int x = 0;
    int y = 0;
    for (int i = 0; i < str.length(); i++) {
      char curr = str.charAt(i);// if we use string then use the curr.equals("W")
      if (curr == 'W') {// for charcater & sigle quotes only == id work
        x--;
      } else if (curr == 'E') {
        x++;
      } else if (curr == 'N') {
        y++;
      } else {
        y--;
      }
    }
    double distance = Math.sqrt(y * y - x * x);
    System.out.println("the distance is : " + distance);
  }
}
