
class largestnum{
    public static void main(String[] args){
    
        int a=3;
        int b=4;
        int c=5;

        if(a<b){
            System.out.println(a);
        }
        else if(b<a) {
            System.out.println(b);
        }
        else if(c<a){
            System.out.println(c);
        }
        else if(b<c){
            System.out.println(b);
        }
        else if(a<c){
            System.out.println(a);
        }
        else if(c<b){
            System.out.println(c);
        }

    }
}