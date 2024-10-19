import java.util.*;
public class Butterfly {
    public static void main(String[] args) {
        System.out.print("Enter the number of your choice:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j<=i && j<=(n-1)/2 && i<=(n-1)/2 || i>=(n-1)/2 && j<=(n-1)/2 && i+j<=n-1 || i+j>=(n-1) && j>(n-1)/2 && i<=(n-1)/2 || i>(n-1)/2 && j>(n-1)/2 && i<=j ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
