package StringDemo;

public class SplitExample3 {
    public static void main(String[] args) {
        String str = "I am an AI student and AIMing to master it since i am AI enthusiast";
        String[] stArr = str.split("AI");

        for (int i = 0; i < stArr.length; i++) {
            System.out.println(stArr[i]);
        }
    }
}
