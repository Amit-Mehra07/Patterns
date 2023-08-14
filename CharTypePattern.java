package JavaProgram.PatternsPrograms;
/*
pattern1   pattern2    pattern3      pattern4

A          ABCDE      A              A
AB         ABCD       BB            ABA
ABC        ABC        CCC          ABCBA
ABCD       AB         DDDD        ABCDCBA
ABCDE      A          EEEEE      ABCDEDCBA

*/



public class CharTypePattern {
    public static void main(String[] args) {
//        pattern1(5);
//        pattern2(5);
//        pattern3(5);
        pattern4(5);


    }

//                      pattern1
    /*public static void pattern1(int n){
        for (int row = 1; row <= n ; row++) {
            //char ch continues from ASCII char numbers
            for (char ch = 'A'; ch < 'A'+row; ch++) {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }*/
    //                  pattern2
   /* private static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (char ch = 'A'; ch<'A'+n-(row-1) ; ch++) {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }*/

    //                  pattern3

    /*private static void pattern3(int n){
        for (int row = 1; row <=n ; row++) {
             char ch = (char) ('A' +  row-1);//In java type casting is necessary here, bcz we want character in returning
            for (int col = 1; col <= row ; col++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }*/

    //                  pattern4

    private static void pattern4(int n){
        for (int row = 1; row <=n ; row++) {
            //space
            for (int space = 1; space <= n-row ; space++) {
                System.out.print("  ");
            }
            char ch = 'A';
            int breakpoint = (2*row +1) /2;
            //columns

            for (int col = 1; col <=(2*row)-1 ; col++) {
                System.out.print(ch+" ");
                if(col<breakpoint) {ch++;}
                        else {ch--;}
            }
            System.out.println();
        }
    }
}
