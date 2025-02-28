public class Test {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7,8,8,9,10};


        System.out.println(insertElement(arr));


    }

    private static int insertElement(int[] arr)
    {
        int key = 20 ;
        int start = 0 ;
        int end = arr.length-1;
        while(start<= end){
            int mid = start + (end -start)/2;
            if(arr[mid]>key){
                end = mid -1;

            }
            else if(arr[mid]<key){
                start = mid +1;
            }
            else
                return arr[mid];
        }
        System.out.println(start % (arr.length-1));
        return  arr[end]% (arr.length-1);
    }

}

