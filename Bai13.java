public class Bai13 {
    public static void main(String[] args) {
        int h = 4, r = 10, u=6;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < r; j++) {
                System.out.print("*");
            }
            r--;
            System.out.println();
        }
        for (int i = 0; i < h - 1; i++) {
            for (int j = i; j < 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < u; j++) {
                System.out.print("*");
            }
            u+=2;
            System.out.println();
        }
    }
}
