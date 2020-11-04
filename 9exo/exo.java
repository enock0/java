public class exo {
    public static int factorial(int n) {
        int i = 2;
        int fact = 1;
        // n*n-1*n-2*...*n-n
        while (i<=n) {
           fact = fact * i;
           i++;
        }
        return fact;
    }
    public static void main(String[] args) {
        int f = factorial(3);
        System.out.print(f);
    }
}