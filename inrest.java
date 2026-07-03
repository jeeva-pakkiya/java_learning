
import java.util.Scanner;

class inrest{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the principal amount");
        int amount =sc.nextInt();
        System.out.println("ENter the reate of interest");
        int interest =sc.nextInt();
        System.out.println("Enter the time in years");
        int time=sc.nextInt();
        int total=(amount*interest*time)/100;
        System.out.println("the total interest is "+total);
        System.out.println("the total amount is"+(total+amount));
}
}