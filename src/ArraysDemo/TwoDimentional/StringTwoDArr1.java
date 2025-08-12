package ArraysDemo.TwoDimentional;

public class StringTwoDArr1 {


    public static void main(String[] args) {
// Create a 2D String array with 4 rows and 3 columns
        String[][] names = new String[4][3];

// Row 1
        names[0][0] = "Amit";
        names[0][1] = "Priya";
        names[0][2] = "Raj";

// Row 2
        names[1][0] = "Neha";
        names[1][1] = "Vikram";
        names[1][2] = "Kiran";

// Row 3
        names[2][0] = "Anjali";
        names[2][1] = "Rohit";
        names[2][2] = "Sunita";

// Row 4
        names[3][0] = "Manish";
        names[3][1] = "Pooja";
        names[3][2] = "Suresh";


        for(int i=0;i< names.length;i++)
        {
            for (int j=0;j<names[0].length;j++)
            {
                System.out.print(names[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
