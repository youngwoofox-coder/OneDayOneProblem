import java.util.Scanner;

public class Main {
        static int[][] array = new int[2000][2000];
        static int point = 1000;
        static int size =0;

        static int min_x=10000;
        static int min_y=10000;
        static int max_x=0;
        static int max_y=0;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rect1_x1 = sc.nextInt()+point;
        int rect1_y1 = sc.nextInt()+point;
        int rect1_x2 = sc.nextInt()+point;
        int rect1_y2 = sc.nextInt()+point;

        int rect2_x1 = sc.nextInt()+point+1;
        int rect2_y1 = sc.nextInt()+point+1;
        int rect2_x2 = sc.nextInt()+point-1;
        int rect2_y2 = sc.nextInt()+point-1;
        // Please write your code here.

        function(rect1_x1,rect1_y1,rect1_x2,rect1_y2,true);
        function(rect2_x1,rect2_y1,rect2_x2,rect2_y2,false);

        function_2(rect1_x1,rect1_y1,rect1_x2,rect1_y2);

       
        //System.out.println(min_x);
        //System.out.println(min_y);
        //System.out.println(max_x);
        //System.out.println(max_y);
        if(max_x==0){
            System.out.print( 0 );
        }else{
        System.out.print( (max_x-min_x) * (max_y-min_y) );
        }
    }

    static void function(int x1,int y1,int x2,int y2, boolean t){
        for(int i=x1; i<=x2; i++){
                for(int j=y1; j<=y2; j++){
                    if( t ){
                        array[i][j]=1;
                    }else if( !t && array[i][j]==1){
                        array[i][j]=0;
                    }
                    
                }
            }
    }


    static void function_2 (int x1,int y1,int x2,int y2){
        for(int i=x1; i<=x2; i++){
                for(int j=y1; j<=y2; j++){
                    if(array[i][j]==1){
                        if(i<min_x){min_x=i;}
                        if(j<min_y){min_y=j;}
                        if(max_x<i){max_x=i;}
                        if(max_y<j){max_y=j;}
                    }
                }
            }
    }

}