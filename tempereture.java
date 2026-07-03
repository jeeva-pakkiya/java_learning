
import java.util.Scanner;

class tempereture{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int celsius=sc.nextInt();
        

        int value=(celsius*9/5+32);
        System.out.println("the fehrenheit value is:"+value);
    }
}