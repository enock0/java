// import java.util.*;
import java.lang.Math;
public class exo {
    public static void calculer_aire_per(double rayon) {
        System.out.printf("\nLe périmètre est = %f\n", 2 * Math.PI * rayon);
        System.out.printf("\nL' aire est = %f\n", Math.PI * rayon * rayon);
    }
    public static void main(String[] args) {
        calculer_aire_per(4.2);
    }
}