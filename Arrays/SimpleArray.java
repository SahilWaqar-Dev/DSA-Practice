import java.util.Arrays;

public class SimpleArray
{
    public static void main(String[] args)
    {
        int[] arr;
        //int[] a=new int[3];
        //int[] a={10,20,30};
        arr=new int[3];

        arr[0]=10;
        arr[1]=20;     
        arr[2]=30;

        for(int i=0;i<3;i++)
        {
            System.out.print(arr[i]+" ");
        }
    
    // elements accessing using for each loop for array
    System.err.println("\nby for each loop :");
    for(int b:arr)
    {
        System.out.print(b+" ");
    }
    System.out.println("\narray by to string ()");
    System.out.println(Arrays.toString(arr));

    //2d array

        int[][] arr2d=new int[2][3];
        arr2d[0][0]=10;
        arr2d[0][1]=20;
        arr2d[0][2]=30;
        arr2d[1][0]=40;
        arr2d[1][1]=50;
        arr2d[1][2]=60;

        System.out.println("\n2d array  :");
    
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr2d[i][j]+" ");
            }
            System.out.println();
        }
    
        //elements accessing using for each loop for 2d array
        System.err.println("by for each loop :");
        for(int[] a:arr2d)
        {
            for(int b:a)
            {
                System.out.print(b+" ");
            }
            System.out.println();
        }
        System.out.println("2d array by deep to string ()");
        System.out.println(Arrays.deepToString(arr2d));


    }
}