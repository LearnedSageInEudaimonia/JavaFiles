package Generics;

public class UsingNumberClass<T extends Number> {
    T[] nums;

    public UsingNumberClass(T[] nums) {
        this.nums = nums;
    }

    double average(){
        double sum = 0.0;
        for(int i =0 ; i< nums.length;i++){
            sum += nums[i].doubleValue();
        }
        return  sum/nums.length;
    }

}
