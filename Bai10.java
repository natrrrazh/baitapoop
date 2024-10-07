public class Bai10 {
    public static void main(String[] args) {
        int sum=0;
        for (int i=98; i%7==0 && i>=1; i-=7){
            sum+=i;
        }
        System.out.println("The sum is: "+sum);
    }
}
