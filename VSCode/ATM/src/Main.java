import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int bakiye = 1000;
        String işlemler = "1. işlem: Bakiye Öğrenme\n2. İşlem Para Çekme\n3. İşlem Para Yatırma\n   Çıkmak için q'ya basın.";
        System.out.println("*************************************************");
        System.out.println(işlemler);
        System.out.println("*************************************************");

        while(true) {

            System.out.println("İşlemi seçiniz:");
            String işlem = scanner.nextLine();

            if (işlem.equals("q")) {
                
                System.out.println("Programdan Çıkılıyor...");
                break;

            }

            else if (işlem.equals("1")){

                System.out.println("Bakiyeniz: "+ bakiye);


            }
            else if (işlem.equals("2")){

                System.out.println("Çekmek istediğiniz tutar");
                int tutar = scanner.nextInt();
                scanner.nextLine();

                if ( tutar > bakiye) {

                 System.out.println("Yeterli Bakiye yok. Bakiyeniz: "+ bakiye);   
                    
                    
                }

                else {

                    bakiye -= tutar;
                    System.out.println("Yeni bakiyeniz: " + bakiye);

                }




            }
            else if (işlem.equals("3")){

                System.out.println("Yatırmak istediğiniz tutar: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();

                bakiye += tutar;

                System.out.println("Yeni bakiyeniz: "+ bakiye);


            }

            else {
                
                System.out.println("Geçersiz İşlem.");

            }



        }






        
        


    }
    
}
