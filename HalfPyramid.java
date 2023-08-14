package JavaProgram.PatternsPrograms;

public class HalfPyramid {
    public static void main(String[] args) {
 //HALF PYRAMID            USING NUMBERS       INVERTED HALF PY    SQUARE   REPEAT NUMBERS   INVERTBYNUMBER  PYRAMIDPRINT   REVERSEDPYRAMID
      /* *                          1          *****              *****      1              12345                *           *********
         **                         12         ****               *****      22             1234                ***           *******
         ***                        123        ***                *****      333            123                *****           *****
         ****                       1234       **                 *****      4444           12                *******           ***
         *****                      12345      *                  *****      55555          1                *********           *
         */

//        halfPyramid(5);
//        halfPyramidUsingNumbers(5);
//        invertedHalfPyramid(5);
//        squarePrinting(5);
//        repeatedNumbers(5);
//        invertByNumbers(5);
//        pyramidPrint(5);
//        reversePyramid(5);


    }

    private static void reversePyramid(int n) {
        for (int row = 1; row <= n ; row++) {
            //space
            for (int spaceL = 1; spaceL < row; spaceL++) {
                System.out.print("-");
            }
            for (int col = 2*n; col > 2*row-1 ; col--) { //Another formula you should try that = "col<= 2*n - (2*i+1)"
                System.out.print("*");
            }
            for (int spaceR = 1; spaceR < row; spaceR++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }

    /*private static void pyramidPrint(int n) {
        //actually it is like - [space, star, space] = [4,1,4] [3,3,3] [2,5,2] [1,7,1] [0,9,0]
        for (int i = 1; i <= n; i++) {//This loop will run for number of lines we're printing (printing rows)
            for (int space = 1; space<= n-i; space++) {// This loop will run for spaces that placed before the * i left
                System.out.print("-");
            }
            for (int col = 1; col <= 2*i-1; col++) {//In this loop we write logic to printing col with *(in each row how many stars print)
                System.out.print("*");
            }
            for (int space = 1; space<= n-i; space++) {// This loop will run for spaces that placed before the * in right
                System.out.print("-");
            }
            System.out.println();//After printing row we need to go to the next line that's why we put here this line of code
        }
    }
*/


}

//}

   /* private static void invertByNumbers(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n+1-row ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }*/

/*    private static void repeatedNumbers(int n) {
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row);;
            }
            System.out.println();
        }
    }*/

  /*    private static void squarePrinting(int n) {
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= n ; col++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }*/


    /*    private static void halfPyramid(int n) {
        for (int row = 1; row <= n; row++) {
            for(int col =1; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();

        }
    }*/

   /* private  static void halfPyramidUsingNumbers(int n ){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }*/

   /* private static void invertedHalfPyramid(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = n; col >= row; col--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }*/

