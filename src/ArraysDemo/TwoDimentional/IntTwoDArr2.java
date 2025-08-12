package ArraysDemo.TwoDimentional;

public class IntTwoDArr2 {

    public static void main(String[] args) {
        int[][] a = {
                {34, 33, 32},
                {14, 23, 35},
                {15, 24, 36},
                {15, 24, 36}
        };

        int row = a.length;
        int col = a[0].length;

        System.out.println("row="+row);
        System.out.println("col="+col);

        for(int i=0;i<4;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
