import java.util.Scanner;

public class PemilihanHari13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dayName, dayType;
        System.out.print("Input day name : ");
        dayName =sc.nextLine();
        switch (dayName.toLowerCase()) {
            case "Monday":
            case "Tuesday" :
            case "Wednesday" :
            case "Friday" :
                dayType = "Weekday" ;
                break;
            case "Saturday" :
            case "Sunday" :
                dayType = "Weekend" ;
                break;
            default:
                dayType = "Invalid day name" ;
        }
        System.out.println(dayName + "is a" + dayType);
    }
}
