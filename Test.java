import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String[][] items = {
                { "phone", "blue", "pixel" }, { "computer", "silver", "lenovo" }, { "phone", "gold", "iphone" } };
        String ruleKey = "type";// "color";
        String ruleValue = "phone";// "silver"
        int res = main(items, ruleKey, ruleValue);
        System.out.println(res);
    }

    static int main(String[][] items, String ruleKey, String ruleValue) {
        int indx = 0;
        int res = 0;
        if (ruleKey == "color") {
            indx = 1;
        } else if (ruleKey == "name") {
            indx = 2;
        }
        for (int i = 0; i < items.length; i++) {
            if (items[i][indx] == ruleValue) {
                res++;
            }
        }
        return res;
    }
}