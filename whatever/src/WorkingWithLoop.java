
public class WorkingWithLoop {

    public static void main(String[] args) {
    
        int start = 9;
        System.out.println(" **   ** ");
        for (int i = 0; i< 9; i++) {
        if(i == start/2) {
            System.out.print(" ");
        }
            else {
                System.out.print("*");
            }
        }
        newLine();
        for (int round = 0; round < 5; round++) {
            generateSpace(round);
            generateStar(start);
           newLine();
           start -= 2;
        }
         
         
//         for (int i = 0; i < 9; i++) {
//             if( i > 0 && i < 8) {
//             System.out.print("*");
//             }
//             else System.out.print(" ");
//         }
          System.out.print("\n");
    }

    private static void newLine() {
        System.out.println();
    }

    private static void generateStar(int start) {
        for (int i = 0; i < start; i++) {
            System.out.print("*");
        }
    }

    private static void generateSpace(int round) {
        for (int a = 0; a < round; a++) {
            System.out.print(" ");
        }
    }
    
}
