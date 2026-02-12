import java.util.Scanner;
public class Agechecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter AGE : ");
        if(sc.hasNextInt()){
            int age=sc.nextInt();
            System.out.println("valid integer entered");

        }else{
            System.out.println("no valid integer entered");
        }
    }
    
}
