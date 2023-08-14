package JavaProgram.PatternsPrograms;
//BinaryPrint  FloydsTriangle         NumberPyramid          leftTrianlgeKunal     DiamondSingleline     DiamondWithPyramid     numberDiamond
/*
   1          1                              1              *                          *                         *                    1
   01         2 3                          2 1 2            * *                       * *                       ***                 2 1 2
   101        4 5 6                      3 2 1 2 3          * * *                    * * *                     *****              3 2 1 2 3
   0101       7 8 9 10                 4 3 2 1 2 3 4        * * * *                 * * * *                   *******           4 3 2 1 2 3 4
   10101      11 12 13 14 15         5 4 3 2 1 2 3 4 5      * * * * *              * * * * *                 *********        5 4 3 2 1 2 3 4 5
                                                            * * * *                 * * * *                  *********          4 3 2 1 2 3 4
                                                            * * *                    * * *                   *********            3 2 1 2 3
                                                            * *                       * *                     *******               2 1 2
                                                            *                          *                       *****                  1
                                                                                                                ***
                                                                                                                 *
*/
public class DiamondPatterns {
    public static void main(String[] args) {
//1 - //binaryPrint(5);

//2 - //floydsTriangle(5);  //It is defined by filling the rows of the triangle with consecutive numbers,
                           // starting with a 1 in the top left corner: 1. 2.
//3 -
//numberPyramid(5);
//4 -
//leftTriangleByKunal(5);

//5 -
//diamondPrintSingleline(5);
//6 -
//leftTriangle(5);
//7 -
//diamondByKunal(5);

//8 -
//pyramidPrint(5);     //Combine both of pyramid
//reversePyramid(5);  // and  make a Diamond.

        //9 -
//numberDiamond(5);
            }


    //1. BinaryPrint
    /*private static void binaryPrint(int n) {
int start = 1;
        for (int row = 1; row <=n ; row++) {
            if(row%2 == 0) {
                start = 0;
            }
            else
            { start = 1;
            }
                for (int col = 1; col <= row ; col++) {
                    System.out.print(start+" ");
                    start = 1-start;
            }
            System.out.println();
        }


    }*/
                                            //2. Floyd's Triangle
    /*private static void floydsTriangle(int n) {
        int number = 1; // it is a counter variable.
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(number+" ");
                number++;// This will increment the counter each time and send it to the top.
            }
            System.out.println();
        }

    }*/
                                             //3. NumberPyramid
    /*private static void numberPyramid(int n) {
        for (int row = 1; row <= n ; row++) {
            //spaces
            for (int space = 0; space < n-row; space++) {
                System.out.print("  ");//here we added one extra space...
            }
            //left columns
            for (int col = row; col >=1 ; col--) {
                System.out.print(col+" ");
            }
            //right columns
            for (int col = 2; col <= row ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();


        }
    }*/

                                       //4. LeftTriangleByKunal
    /*private static void leftTriangleByKunal(int n) {
        for (int row = 0; row < 2*n; row++) {
                        //condition - if - else
            int totalColsInRow = row>n ? 2*n -row: row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }*/

                                      //5. Diamond print with single, long code .
        /*private static void diamondPrintSingleline ( int n){
            for (int row = 1; row <= 2 * n - 1; row++) {
                //when row goes 1 to 5
                if (row <= n) {
                    //Print space for the left of the star
                    for (int space = 1; space <= n - row; space++) {
                        System.out.print(" ");
                    }
                    //Actual printing in column...
                    for (int col = 1; col <= row; col++) {
                        System.out.print("* ");
                    }
                    //Print spaces for the right of the star
                    for (int space = 1; space <= n - row; space++) {
                        System.out.print(" ");
                    }
                    System.out.println();
                } else {
//row = 6,n = 5
                    //Print space for the left of the star
                    for (int space = 1; space <= row - n; space++) {
                        System.out.print(" ");
                    }
                    //Actual printing in column...
                    for (int column = 1; column <= 2 * n - row; column++) {
                        System.out.print("* ");
                    }
                    //Print spaces for the right of the star
                    for (int space = 1; space <= row - n; space++) {
                        System.out.print(" ");
                    }
                    System.out.println();
                }
            }
        }*/



                                       //6. LeftTriangle
   /* private static void leftTriangle(int n) {
        //Yeah i get this logic or code, woooh
        for (int row = 1; row <= 2*n-1; row++) {
            if(row<=n){
                for (int col = 1; col <=row; col++) {
                    System.out.print("* ");
                }System.out.println();
            }   else {
                for (int col = 1; col <=2*n-row ; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

        }
    }*/
                                          //7. Diamond print by kunal

       /* private static void diamondByKunal(int n){
            for (int row = 0; row < 2 * n; row++) {
                //total column in each row
                int totalColInRow = row > n ? 2 * n - row : row;
                // number of spaces in each row
                int noOfSpacesInRow = n - totalColInRow;
                //print spaces
                for (int space = 0; space < noOfSpacesInRow; space++) {
                    System.out.print(" ");
                }
                for (int col = 0; col < totalColInRow; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
*/
                                           //8. here created a pattern with together 2 individual program
/*private static void reversePyramid(int n) {
    for (int row = 1; row <= n ; row++) {
        //space
        for (int spaceL = 1; spaceL < row; spaceL++) {
            System.out.print(" ");
        }
        for (int col = 2*n; col > 2*row-1 ; col--) { //Another formula you should try that = "col<= 2*n - (2*i+1)"
            System.out.print("*");
        }
        for (int spaceR = 1; spaceR < row; spaceR++) {
            System.out.print(" ");
        }
        System.out.println();
    }
}

private static void pyramidPrint(int n) {
        //actually it is like - [space, star, space] = [4,1,4] [3,3,3] [2,5,2] [1,7,1] [0,9,0]
        for (int i = 1; i <= n; i++) {//This loop will run for number of lines we're printing (printing rows)
            for (int space = 1; space<= n-i; space++) {// This loop will run for spaces that placed before the * i left
                System.out.print(" ");
            }
            for (int col = 1; col <= 2*i-1; col++) {//In this loop we write logic to printing col with *(in each row how many stars print)
                System.out.print("*");
            }
            for (int space = 1; space<= n-i; space++) {// This loop will run for spaces that placed before the * in right
                System.out.print(" ");
            }
            System.out.println();//After printing row we need to go to the next line that's why we put here this line of code
        }
    }*/
                                   //9. Number Diamond print
    /*private static void numberDiamond(int n) {
        //row
        for (int row = 1; row <= 2*n ; row++) {
            int totalColInRow = row>n ? 2*n-row : row;
            //spaces
            for (int space = 0; space < n- totalColInRow; space++) {
                System.out.print("  ");
            }
            //left print
            for (int col = totalColInRow; col >=1 ; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <=totalColInRow; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }*/



}

