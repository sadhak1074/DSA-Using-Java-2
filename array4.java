import java.util.*;
public class array4 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String [] arr = new String[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextLine();
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
