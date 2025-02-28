package Test;

import java.util.Scanner;

public class PassThePillow {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int time = read.nextInt();
        int[] arr = new int[n];
        for(int i =0 ; i<n;i++){
            arr[i]= i+1;
        }
        System.out.println(arr.toString());

        System.out.println((time + arr[1])%n);

    }
}
