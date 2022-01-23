package com.oops.practice;


interface Drinkable{
    default void breakTime() {
        coffee();
    }
    private void coffee() {
        System.out.println("Let's have a Coffee");
    }
   
}
 
public class DisplayMessage implements Drinkable{
	
	
    public static void main(String[] args){
    	DisplayMessage main = new DisplayMessage();
        main.breakTime();
    }

}