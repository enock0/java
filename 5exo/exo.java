public class exo {
    static void calcul_multiplication(int x, int y) {
        System.out.printf("\n%d x %d = %d\n",x,y,x*y);
    }
    public static void main(String[] args) {
        for(int i=0; i<=10;i++) {
            calcul_multiplication(5,i);
        }
    }
}