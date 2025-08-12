package ArraysDemo.TwoDimentional;

public class StringTwoDArr2 {


    public static void main(String[] args) {
        String[][] names = {
                {"Amit", "Priya", "Raj"},
                {"Neha", "Vikram", "Kiran"},
                {"Anjali", "Rohit", "Sunita"},
                {"Manish", "Pooja", "Suresh"}
        };


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
