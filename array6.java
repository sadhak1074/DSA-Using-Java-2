import java.util.Scanner;
public class array6 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        boolean isAscending = true;
        for(int i=0; i<arr.length-1; i++) { // NOTICE numbers.length - 1 as
            
            if(arr[i] > arr[i+1]) { // This is the condition for
            
            isAscending = false; } }
        if(isAscending = true){
            System.out.println("Ascending");
        }
        else{
            System.out.println("Not Ascending");
        }
  
    }
}
