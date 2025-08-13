package StringDemo;

public class SplitExample {
    public static void main(String[] args) {
        String str = "This is Java class";
        String[] stArr = str.split(" ");

        for (int i = 0; i < stArr.length; i++) {
            System.out.println(stArr[i]);
        }
    }
}
