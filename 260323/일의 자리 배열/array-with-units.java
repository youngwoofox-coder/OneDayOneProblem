import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        int[] arry = new int[10];

        Scanner scanner = new Scanner(System.in);
        
        arry[0] = scanner.nextInt();
        arry[1] = scanner.nextInt();

        for(int i=2;i<arry.length;i++){
            arry[i]=(arry[i-1]+arry[i-2]) %10;
        }

        for(int i: arry){
            System.out.print(i+" ");
        }
    }
}