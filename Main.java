import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        min();
        check();
        pass();
    }
    public static void min(){
        Scanner s =new Scanner(System.in);
        System.out.println("Input the first number");
        double num =s.nextDouble();
        System.out.println("Input the Second number");
        double num2 =s.nextDouble();
        System.out.println("Input the Third number");
        double num3 =s.nextDouble();
       if (num<num2 && num<num3){
           System.out.println("The smallest value is"+num);
       } else if (num2<num3) {
           System.out.println("The smallest value is"+ num2);
       }else System.out.println("The smallest value is"+num3);
    }
    public static void check() {
        Scanner s =new Scanner(System.in);
        System.out.println("Input the first number");
        int num =s.nextInt();
        for (int i = 0; i >=0 ; i++) {
            if (num>0){
                System.out.println("positive");
            }else   if (num<0) {
                System.out.println("negative");
            }else  System.out.println("Zero");
            System.out.println("Input the first number");
             num =s.nextInt();
            if (num== -1) {
                break;
            }
        }
    }
    public static void pass() {
        Scanner s =new Scanner(System.in);
        Random rand =new Random();
        System.out.println("1.A password must have at least eight characters");
        System.out.println("2. A password consists of only letters and digits.");
        System.out.println("3. A password must contain at least two digits ");
        System.out.println("Input the password");
       String pas =s.nextLine();
       int tst =pas.length();
       if(pas.length()>9 &&pas.matches(".*\\d. *\\d.*")){
           System.out.println("A password has been created ");
       }else System.out.println("Please enter a new password that consists of 10 characters and consists of at least two numbers");
    }



    }