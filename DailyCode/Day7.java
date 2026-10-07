public class arrays {
    public static void main(String[] args) {
         // indicisations starts from 0 to (n-1) where n is array length

         // int[] array = new int[4];

         // Direct assignation 

         /*array[1] = 101;
         array[2] = 102;
         array[3] = 103;
         array[0] = 100;

         System.out.println(array[3]);*/

            // Assigning using loops 

         /*int n = 100;
         for (int i = 0; i < array.length; i++) {
            array[i] = n;
            n++;
            System.out.print(array[i] + ", ");
         }*/

            // Assigning through a matrix 

           /* int[] array = {101, 102, 103, 104};

            for(int i = 0; i < array.length; i++) {
                System.out.print(array[i] + ", ");
            } System.out.println(array.length);*/

            // Multidimensional Arrays
            // first box displays numnber of rows while the second one displays numbers of columns 

            /*int[][] array = new int [3][4];

            int n = 100;
            for(int i = 0; i < array.length; i++) {
                for(int j = 0; j < array[i].length; j++){
                    array[i][j] = n;
                    n++;
                    System.out.print(array[i][j] + " ");
                }   System.out.println();
            }*/

           // Assignment through a matrix

           int[][] array = {
                    {10, 25, 68, 99},
                    {11, 26, 69, 100},
                    {9, 24,  67, 98},
                    {89, 35, 28, 44},
           };
            for(int i = 0; i < array.length; i++) {
                for(int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }   
                    System.out.println();
            }
    }
}