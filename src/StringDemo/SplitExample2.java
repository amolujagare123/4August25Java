package StringDemo;

public class SplitExample2 {
    public static void main(String[] args) {
        String str = "This is Java class";
        String[] stArr = str.split("a");

        for (int i = 0; i < stArr.length; i++) {
            System.out.println(stArr[i]);
        }
    }
}
