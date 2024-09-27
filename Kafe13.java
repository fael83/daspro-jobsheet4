import java.util.Scanner;

public class Kafe13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan menu: ");
        String menu = sc.nextLine();
        System.out.print("Masukkan ukuran cup: ");
        char ukuranCup = sc.next().charAt(0);
        System.out.print("Masukkan jumlah: ");
        int jumlah = sc.nextInt();
        System.out.print("Masukkan keanggotaan (True/False): ");
        boolean keanggotaan = sc.nextBoolean();
        double hargaMenu = 0;
        switch (menu.toLowerCase()) {
            case "kopi":
                hargaMenu = 12000;
                break;
            case "teh":
                hargaMenu = 7000;
                break;
            case "coklat":
                hargaMenu = 20000;
                break;
               
        }
        double totalHarga = hargaMenu * jumlah;
        // System.out.println("total harga " + totalHarga );
        switch (ukuranCup) {
            case 'S':
                break;
            case 'M':
                totalHarga += 0.25 * totalHarga;
                break;
            case 'L':
                totalHarga += 0.4 * totalHarga;
                break;
            default:
                System.out.println("selected size is not available");
        }
        double diskon = keanggotaan ? 0.1 : 0;
        double nominalBayar =totalHarga - (diskon * totalHarga);

        System.out.println("Item pembelian: " + jumlah + " " + menu + " dengan ukuran cup " + ukuranCup);
        System.out.println("Nominal Bayar: " + nominalBayar);
    }   
}
