public class Alok {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 0; i < n; i++) {
            //Loop for Printing 'A'
            for (int j = 0; j < n; j++) {
                if(i==0 && j > 0 && j < n-1 || j==0 && i > 0 || j==n-1 && i>0 || i==n/2){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            //Loop for Printing 'L'
            for (int j = 0; j < n; j++) {
                if(j==0 || i==n-1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            //Loop for Printing 'O'
            for (int j = 0; j < n; j++) {
                if(i==0 && j>0 && j<n-1 || i==n-1 && j>0 && j<n-1 || j==0 && i>0 && i<n-1 || j==n-1 && i>0 && i<n-1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            //Loop for Printing 'K'
            for (int j = 0; j < n; j++) {
                if(j==0 || i+j==n/2 || i-j==n/2){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
