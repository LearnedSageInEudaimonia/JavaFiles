package Recursion.Array;

public class LinearSearch {
    private static boolean linearSearch(int[] arr, int target,int index){
        if(index>=arr.length) return false;
        return arr[index]== target || linearSearch(arr, target,index+1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2, 3,5,6,7,8,9,34,35};
        System.out.println(linearSearch(arr, 35,0));
    }
}
