public class prime_or_not{
    public static void primeOrnot(int n){
        if(n/n == 1 && n/1 == n){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
        return;
    }
    public static void main(String[] args){
        primeOrnot(5);
    }
}