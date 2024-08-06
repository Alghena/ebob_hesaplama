

        import java.util.Scanner;

        public class EBOBHesapla {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("İlk sayıyı girin: ");
                int sayi1 = scanner.nextInt();

                System.out.print("İkinci sayıyı girin: ");
                int sayi2 = scanner.nextInt();

                int ebob = findEBOB(sayi1, sayi2);

                System.out.println("Girilen sayıların EBOB'u: " + ebob);
            }

            // EBOB'u hesaplamak için yardımcı fonksiyon
            public static int findEBOB(int a, int b) {
                while (b != 0) {
                    int temp = b;
                    b = a % b;
                    a = temp;
                }
                return a;
            }
        }
