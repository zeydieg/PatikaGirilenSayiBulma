import java.util.Scanner;
public class ciftsayibulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int k, i;
        double sum = 0;
        System.out.print("Sayı giriniz : ");
        k = inp.nextInt();
        for (i = 1; i <= k; i++ ) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                sum += i;
                k++;
                System.out.println("Sayıların ortalamaları : " + sum / k);
            }
        }
    }
}
