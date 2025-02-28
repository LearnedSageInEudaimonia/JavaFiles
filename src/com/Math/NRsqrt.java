package Math;

public class NRsqrt {
    public static void main(String[] args) {
        System.out.println(sqrt(10));

    }
    static  double sqrt(double n){
        double x = n;
        double root;
        while(true){
            root = 0.5 *(x+n/x);
            System.out.println(root);
            if(Math.abs(root -x)<0.00001){
                break;
            }
            x = root;
        }
        return  root;
    }

}
