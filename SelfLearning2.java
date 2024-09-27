import java.util.Scanner;

public class SelfLearning2 {
    public static void main(String[] args) {
        int distance;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance : ");
        distance = input.nextInt();

        if (distance >= 0 && distance <= 5) {
            System.out.print("use melee weapons");
        } else if (distance >= 5 && distance <= 1000) {
            System.out.print("use range weapons");
        } else {
            System.out.print("distance out of range");
        }
    }
}
