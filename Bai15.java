public class Bai15 {
    public static void main(String[] args) {
        int h=4,k=1,l=6,e=2,o=5;
        for (int i=0; i<h; i++) {
            for (int j=0; j<l; j++){
                System.out.print(" ");
            }
            l-=2;
            for (int j=0; j<k; j++){
                System.out.print("* ");
            }
            k+=2;
            System.out.println();
        }
        for (int i=0; i<h-1; i++){
            for (int j=0; j<e; j++){
                System.out.print(" ");
            }
            e+=2;
            for (int j=0; j<o; j++){
                System.out.print("* ");
            }
            o-=2;
            System.out.println();
        }
    }
}
