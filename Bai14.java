public class Bai14 {
    public static void main(String[] args) {
        int h=4,u=1,e=6;
        for (int i=0; i<h; i++) {
            for (int j=0; j<e; j++){
                System.out.print(" ");
            }
            e-=2;
            for (int j=0; j<u; j++){
                System.out.print("* ");
            }
            u+=2;
            System.out.println();
        }
    }
}
