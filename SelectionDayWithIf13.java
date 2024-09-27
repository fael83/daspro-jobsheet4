import java.util.Scanner;
public class SelectionDayWithIf13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dayName;
        System.out.print("Input day name : ");
        dayName =sc.nextInt();
        if (dayName >= 1 && dayName <=5) {
            System.out.print("Weekday ");
        } else if (dayName == 6 || dayName ==7 ) {
            System.out.print("Weekend ");
        } else {
            System.out.print("invalid number ");
        }
        // System.out.println(dayName);
    }
}
