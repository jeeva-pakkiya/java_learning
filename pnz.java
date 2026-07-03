
import java.util.Scanner;

class pnz{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your value:");
        int value=sc.nextInt();
        if(value<0){
            System.out.println(value+" is - ve number");
        }
        else if(value>0){
            System.out.println(value+" is + ve number");
        }
        else{
            System.out.println("The number is '0'");
        }
    }
}