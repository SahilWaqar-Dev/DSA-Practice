public class DimensionalArray {
    public static void main(String[] args) {
        int[][] arr2d = new int[2][3];
        arr2d[0][0] = 10;
        arr2d[0][1] = 20;
        arr2d[0][2] = 30;
        arr2d[1][0] = 40;
        arr2d[1][1] = 50;
        arr2d[1][2] = 60;

        System.out.println("\n2d array  :");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }

        // elements accessing using for each loop for 2d array
        System.out.println("by for each loop :");
        for (int[] a : arr2d) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }


       

 // int[][] a=new int[3][];
// a[0]=new int[2];
// a[1]=new int[3];
// a[2]=new int[1];
// for(int c:a)
// {
//    System.out.println(c);
// }

        //Adrees of n element=base address+(index of n element*datatypesize)

        //for row major
        //address=base address+(row index*total columns+column index)*datatype size

        //for column major
        //address of n element= base address +(column index*total rows+row index)*datatype size


    }
    
}
