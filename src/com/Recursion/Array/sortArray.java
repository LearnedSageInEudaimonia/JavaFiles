package Recursion.Array;

public class sortArray {
      private static boolean sorted(int[] arr, int index ){
          if(index == arr.length-1){
              return true;
          }
          return arr[index] < arr[index + 1] && sorted(arr,index+1);
      }

    public static void main(String[] args) {
        int[] arr = {1,2,4,3,5,6,7};
        System.out.println(sorted(arr, 0));
    }
}
