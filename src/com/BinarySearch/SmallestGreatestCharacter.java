package BinarySearch;

public class SmallestGreatestCharacter {
    public static void main(String[] args) {
        char[] ch = { 'c', 'f','j'};
        System.out.println(Ceil(ch,'z'));
    }
    public static  char Ceil(char[] a,int target){
        int start = 0 ;
        int end = a.length-1;

        while(start<= end){
            int mid = start + (end - start)/2;
             if(target<a[mid]) {
                end = mid -1;
            }
            else {
                start = mid+1;
            }

        }
        return a[start % a.length];

    }
}
