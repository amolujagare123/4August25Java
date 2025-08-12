package controlStructure;

public class Triangle {

    public static void main(String[] args) {
        int a = 90;
        int b = 90;
        int c = 0;

        if(a+b+c == 180 && a>0 && b>0 && c>0  ) {
            // Equilateral
            if (a == b && b == c) {
                System.out.println("Equilateral Triangle");
            }
            // Scalene
            if (a != b && b != c && a != c) {
                System.out.println("Scalene Triangle");
            }
            // Right Angled
            if (a == 90 || b == 90 || c == 90) {
                System.out.println("Right Angled Triangle");
            }
            // Isosceles
            if ((a == b && a != c) || (b == c && c != a) || (a == c && c != b)) {
                System.out.println("Isosceles Triangle");
            }
        }
        else
            System.out.println("This is not a triangle");

    }
}