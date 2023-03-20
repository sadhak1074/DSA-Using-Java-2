public class even_or_odd{
    public static void even_or_not(int n){
        if(n%2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        return;
    }
    public static void main(String[] args){
        even_or_not(2);
    }
}