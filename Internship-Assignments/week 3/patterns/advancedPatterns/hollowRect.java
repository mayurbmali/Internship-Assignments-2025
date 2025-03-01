public class hollowRect {
    public static void main(String[] args) {
        int totrows = 5;
        int totcols = 5;
        for (int i = 1; i <= totrows; i++) {
            for (int j = 1; j <= totcols; j++) {
                if(i == 1 || i == totrows || j == 1 || j==totcols){
                    System.out.print("*"+ " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println(); 
        }
    }
}
