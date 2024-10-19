public class Shatkona  {
    public static void main(String[] args) {
        int row = 11;
        int col = 19;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(i+j == col/2 && i < row-2 || j-i == col/2 && i < row-2 || i== 2 && j>0 && j<col-1|| i == row-3  && j>0 && j<col-1 || i-j == 1 && i>2 || i+j == col && i>2  ){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
