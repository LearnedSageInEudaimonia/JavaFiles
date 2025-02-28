package Test;

public class TribonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        if(n<0) System.out.println(0);
        else{
            int first=0 ;
            int second = 1;
            int third = 1;
            int fourth;
            System.out.print(first+" ");
            System.out.print(second + " ");
            System.out.print(third + " ");
            for(int i= 3; i<=n;i++){
                fourth = first + second+ third;
                System.out.print(fourth + " ");
                first = second;
                second = third;
                third = fourth;
            }
        }


    }
    public void tribonacciseries(){

    }

}
