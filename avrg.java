
import java.util.Scanner;

class avrg{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the number 1:");
        int a=sc.nextInt();
        System.out.println("ENter the number 2:");
        int b=sc.nextInt();
        System.out.println("ENter the number 3:");
        int c=sc.nextInt();

        System.out.println("\nThe avrage value is:"+(a+b+c)/3);
    }
}