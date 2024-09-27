import java.util.Scanner;

public class PemilihanBilangan13 {
    public static void main(String[] args) {
        String hasil;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        int angka = input.nextInt();
        
        // if (angka % 2 == 0) {
        //     System.out.println("Angka " + angka + " termasuk bilangan genap" );
        // } else {
        //     System.out.println("Angka " + angka + " termasuk bilangan ganjil");
        // }

        // operator ternary
        hasil = (angka % 2 == 0) ? "termasuk bilangan genap" : "termasuk bilangan ganjil";
        System.out.println("Angka " + angka  + " " + hasil);
        
    }
} 
    

