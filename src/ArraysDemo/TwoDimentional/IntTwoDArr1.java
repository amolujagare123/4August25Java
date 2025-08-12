package ArraysDemo.TwoDimentional;

public class IntTwoDArr1 {

    public static void main(String[] args) {
        int[][] a = new int[4][3];

        a[0][0] =34;
        a[0][1] =33;
        a[0][2] =32;

        a[1][0] =14;
        a[1][1] =23;
        a[1][2] =35;

        a[2][0] =15;
        a[2][1] =24;
        a[2][2] =36;

        a[3][0] =15;
        a[3][1] =24;
        a[3][2] =36;

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
