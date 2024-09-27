import java.util.Scanner;
 public class SelfLearning1 {
 
    public static void main(String[] args) {
        String username, password, correctUsername = "Admin", correctPassword = "Admin123";
        
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the username : ");
        username = input.next();
        System.out.print("Enter the password : ");
        password = input.next();
        
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login Successful ! Welcome in the system"); 
        } else {
            System.out.println("Incorrect username or password");
        } 
            
        }

    }
 

