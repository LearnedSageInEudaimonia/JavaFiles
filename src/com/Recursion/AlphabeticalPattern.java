package Recursion;

public class AlphabeticalPattern {

    static void A(){
        for(int i =0 ; i < 5; i++ ){
            for(int j =0 ; j< 4;j++){
                if(j==0||j==3||i==0||i==3){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    static void B(){
        for(int i =0 ; i < 5; i++ ){
            for(int j =0 ; j< 4;j++){
                if(j==0||((i==0||i==2||i==4)&& j<3)||(j==3&&i==1)||(j==3&&i==3)){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        } System.out.println();
    }
    static void C(){
        for(int i =0 ; i < 5; i++ ){
            for(int j =0 ; j< 4;j++){
                if(((i==0||i==4) && j!=0)||(j==0&&i!=0 &&i!=4)){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        } System.out.println();
    }
    static void D(){
        for(int i =0 ; i < 5; i++ ){
            for(int j =0 ; j< 4;j++){
                if(j==0||((i==0||i==4)&&j<3)||(j==3 &&(i==2 || i==3||i==1))){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        } System.out.println();
    }
    static void E(){
        for(int i =0 ; i < 5; i++ ){
            for(int j =0 ; j< 4;j++){
                if(i==0||(i==2 && j!=3)||i==4||j==0){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        } System.out.println();
    }
    static void F(){
        for(int i =0 ; i < 5; i++ ){
            for(int j =0 ; j< 4;j++){
                if(i==0||(i==2 && j!=3)||j==0){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        } System.out.println();
    }
    static void G(){
        for(int i =0 ; i < 5; i++ ){
            for(int j =0 ; j< 4;j++){
                if((i==0 && (j==2 ||j==1) ||(i==1 && j==0)||(i==2 && j!=1)||(i==3&&(j==0||j==3)||(i==4 &&(j==1||j==2))) )){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        } System.out.println();
    }
    static void H(){
        for(int i =0 ; i < 5; i++ ){
            for(int j =0 ; j< 4;j++){
                if((i==2||j==0||j==3)){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        } System.out.println();
    }
    static void I(){
        for(int i =0 ; i < 5; i++ ){
            for(int j =0 ; j< 5;j++){
                if((i==0||i==4||j==2)){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        } System.out.println();
    }
    static void J(){
        for(int i =0 ; i < 5; i++ ){
            for(int j =0 ; j< 5;j++){
                if((i==0||((i==3||i==4)&&(j==0))||j==2||(i==4&&j==1))){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        } System.out.println();
    }
    static void K(){
        for(int i =0 ; i < 5; i++ ){
            for(int j =0 ; j< 4;j++){
                if(j==0||(i==0&&j==3)||(i==1&&j==2)||(i==2&&j==1)||(i==3&&j==2)||(i==4&&j==3)){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        } System.out.println();
    }
    static void L(){
        for(int i =0 ; i < 5; i++ ){
            for(int j =0 ; j< 4;j++){
                if(j==0||i==4){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        } System.out.println();
    }
    static void M(){
        for(int i =0 ; i < 5; i++ ){
            for(int j =0 ; j< 5;j++){
                if(j==0||j==4||(i==1&&(j==1||j==3))||(i==2&&j==2)){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        } System.out.println();
    }
    static void N(){
        for(int i =0 ; i < 5; i++ ){
            for(int j =0 ; j< 5;j++){
                if(j==0||j==4||(i==1||i==2||i==3)&&j==i){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        } System.out.println();
    }
    static void O(){
        for(int i =0 ; i < 5; i++ ){
            for(int j =0 ; j< 4;j++){
                if((i==2||i==3||i==1)&&(j==0||j==3)||((i==0||i==4)&&(j==1||j==2))){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        } System.out.println();
    }
    static void P(){
        for(int i =0 ; i < 5; i++ ){
            for(int j =0 ; j< 4;j++){
                if(j==0||((i==0||i==2)&&(j==1||j==2))||(i==1&&j==3)){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        } System.out.println();
    }
    static void Q(){
        for(int i =0 ; i < 5; i++ ){
            for(int j =0 ; j< 5;j++){
                if((i==2||i==3||i==1)&&(j==0||j==3)||((i==0||i==4)&&(j==1||j==2))||(i==4&&j==4)||(i==2&&j==2)){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        } System.out.println();
    }
    static void R(){
        for(int i =0 ; i < 5; i++ ){
            for(int j =0 ; j< 4;j++){
                if(j==0||((i==0||i==2)&&(j==1||j==2))||(i==1&&j==3)||(i==3&&j==2)||(i==4&&j==3)){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        } System.out.println();
    }
    static void S(){
        for(int i =0 ; i < 5; i++ ){
            for(int j =0 ; j< 5;j++){
                if(((i==0||i==2||i==4)&&(j==2||j==3||j==1))||(i==1&&j==0)||(i==3&&j==4)){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        } System.out.println();
    }
    static void T(){
        for(int i =0 ; i < 5; i++ ){
            for(int j =0 ; j< 5;j++){
                if(i==0||j==2){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        } System.out.println();
    }
    static void U(){
        for(int i =0 ; i < 5; i++ ){
            for(int j =0 ; j< 4;j++){
                if((j==0||j==3) && (i!=4)||(i==4&&(j==1||j==2))){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        } System.out.println();
    }
    static void V(){
        for(int i =0 ; i < 5; i++ ){
            for(int j =0 ; j< 5;j++){
                if((j==0||j==4) && (i!=4&&i!=3)||(i==4&& j==2)||(i==3&&(j==1 ||j==3))){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        } System.out.println();
    }
    static void W(){
        for(int i =0 ; i < 5; i++ ){
            for(int j =0 ; j< 5;j++){
                if(j==0||j==4||(i==2 && j==2)||(i==3&&(j==1||j==3))){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        } System.out.println();
    }
    static void X(){
        for(int i =0 ; i < 5; i++ ){
            for(int j =0 ; j< 5;j++){
                if(i==j||j==4-i){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        } System.out.println();
    }
    static void Y(){
        for(int i =0 ; i < 5; i++ ){
            for(int j =0 ; j< 5;j++){
                if((j==2 && (i==2||i==3||i==4))||(i==0&&(j==0||j==4))||(i==1 &&(j==1||j==3))){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        } System.out.println();
    }
    static void Z(){
        for(int i =0 ; i < 5; i++ ){
            for(int j =0 ; j< 5;j++){
                if(j==4-i||i==0||i==4){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        H();E();L();L();O();
        System.out.println();
        W();O();R();L();D();
    }
}
