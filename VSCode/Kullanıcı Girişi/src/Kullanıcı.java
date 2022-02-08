import java.util.Scanner;

public class Kullanıcı {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int girişhakkı = 3;
        
        String username = "Erdemtel";
        String password = "123456";

        System.out.println("****************************************");
        System.out.println("Kullanıcı Girişine Hoşgeldiniz ");
        System.out.println("****************************************");

        while (true) {

            System.out.println("Kullanıcı adı: ");
            String kullanıcı = scanner.nextLine();
            System.out.println("Parola: ");
            String parola = scanner.nextLine();

            if (kullanıcı.equals(username) && parola.equals(password)) {

                System.out.println("Hoşgeldiniz, " + username);
                break;

            }

            else if (kullanıcı.equals(username) && !parola.equals(password)) {

                System.out.println("Parolanız yanlış...");
                girişhakkı -=1;
                System.out.println("Giriş Hakkınız: " + girişhakkı);




            }
            else if (!kullanıcı.equals(username) && parola.equals(password)) {

                System.out.println("Kullanıcı adınız yanlış...");
                girişhakkı -=1;
                System.out.println("Giriş Hakkınız: " + girişhakkı);
                



            }
            else {
                
                System.out.println("Kullanıcı adı ve Parolanız yanlış.");
                girişhakkı -=1;
                System.out.println("Giriş Hakkınız: " + girişhakkı);

            }

            if (girişhakkı == 0) {
                
                System.out.println("Giriş hakkınız bitti, bir süre sonra tekrar deneyin");
                break;

                
            }











        }






    }





}