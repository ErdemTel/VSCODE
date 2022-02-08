import java.util.Scanner;

public class Main {


    public static int ebobbulma(int sayı1, int sayı2) {

        int ebob = 1;

        for (int i = 1; i <= sayı1 && i <=sayı2; i++) {

            if ((sayı1 % i == 0) && (sayı2 % i == 0)) {
                
                ebob = i;

            }
            
            
        }

        return ebob;
    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayı: ");
        int birincisayı = scanner.nextInt();
        System.out.print("İkinci sayı: ");
        int ikincisayı = scanner.nextInt();

        System.out.println("Bu iki sayının ebobu: " + ebobbulma(birincisayı, ikincisayı));

        






    }








}