package Enumerations;

enum Apple{
    Jonathan(10),RedDel(12), GoldenDel(20), Winesap(15), Cortland(8);
    private  int price;

    Apple(int p){
        price= p;
    }
    int getPrice(){
        return price;
    }

}
public class EnumDemo
{
    public static void main(String[] args) {
        Apple ap;
        System.out.println(" Winesap costs "+ Apple.Winesap.getPrice()+ " Cents\n");
        System.out.println(" All apples prices : \n ");

        for(Apple a : Apple.values()){
            System.out.println(a + " costs "+ a.getPrice()+ " cents\n");
        }
    }
}

