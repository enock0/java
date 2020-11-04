public class exo {
    public static void permuter_deux_variables(int x, int y) {
        System.out.printf("Avant l'échange: a = %d, b = %d",x,y);
        int temp = x;
        x = y;
        y = temp;
        System.out.printf("Après l'échange: a = %d, b = %d",x,y);
    }
    public static void main( String[] args ) {
        permuter_deux_variables(1,2);
    }
}