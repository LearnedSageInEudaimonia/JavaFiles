package Interfaces.DefaultInterfaces;

public interface MyIf {
    int getNumber();
    default String getString(){
        return "Default String";
    }

}
