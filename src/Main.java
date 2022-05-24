import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, toplam = 0;

        while (true) {
            System.out.print("Sayi giriniz: ");
            number = input.nextInt();

            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    toplam += i;
                }
            }

            if (number == toplam) {
                System.out.println(number + " mukemmel sayidir.");
            } else {
                System.out.println(number + " mukemmel sayi degildir.");
            }

            toplam = 0;
        }
    }
}
