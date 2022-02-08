import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            
            Scanner scanner = new Scanner(System.in);

            System.out.println("Sayıyı girniz: ");
            int sayı = scanner.nextInt();
            System.out.println("Basamak sayısı: ");
            int basamak = scanner.nextInt();

            int geçsayı = sayı;

            int toplam = 0;
            

            do {

                int basamakdeger = geçsayı % 10;
                geçsayı /= 10;

                toplam += Math.pow(basamakdeger, basamak);

            } while (geçsayı >0);

            if (sayı == toplam) {

             System.out.println("Bu sayı bir Armstrong sayısıdır.");   
            }

            else {
                
                System.out.println("Bu sayı bir  Armstrong sayısı değildir.");

            }




            
            
    
            
     





        }




}