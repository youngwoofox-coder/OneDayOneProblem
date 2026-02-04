import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[10000];
        int point =5000, min =5000, max =5;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);

            while(0 < x--){
                if(d=='L'){
                    array[point]=1;
                    point--;
                    //System.out.print("W");
                }
                else{
                    array[point]=-1;
                    point++;
                    //System.out.print("B");
                }
                if(point<min)min=point;
                if(max<point)max=point;
            }
            if(d=='L'){point++;}
            else{point--;}
        }
        // Please write your code here.

        int W_result=0;
        int B_result=0;
        for(int i=min;i<=max;i++){
            if(array[i]== 1){ W_result++;}
            if(array[i]==-1){ B_result++;}
            //System.out.print(array[i]);
        }
        System.out.print(W_result+" "+B_result);
    }
}