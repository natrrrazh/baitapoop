public class Bai17 {
    public static void main(String[] args) {
        int k=1,j=2;
        for (int i=0; i<=9; i++){
            System.out.print(k + " ");
            k=k+j;
            j=j*2;
        }
    }
}
