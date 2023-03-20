public class Factorial_function {
    public static int factorial(int n){
        int factorial = 1;
        for(int i = 1; i <= n; i++){
            factorial = factorial * i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        int n = 5;
        int factorial = factorial(n);
        System.out.println(factorial);
    }
}
