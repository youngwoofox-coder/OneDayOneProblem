import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String A = sc.next();
        // Please write your code here.

        int[] months = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int day=0;
        if(A=="Mon"){
            day=0;
        }else if(A=="Tue"){
            day=1;
        }else if(A=="Wed"){
            day=2;
        }else if(A=="Thu"){
            day=3;
        }else if(A=="Fri"){
            day=4;
        }else if(A=="Sat"){
            day=5;
        }else if(A=="Sun"){
            day=6;
        }

        int md1=0;
        int md2=0;

        for(int i=1;i<12;i++){
            if(i<m1){
                md1 += months[i];
            }
            if(i<m2){
                md2 += months[i];
            }
        }
        md1 += d1;
        md2 += d2;
        
        int result =md2-md1;
        result = result%7;
        if(result>=day){result++;}

        System.out.print(result);
    
    }
}