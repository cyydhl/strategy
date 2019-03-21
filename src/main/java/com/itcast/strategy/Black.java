package main.java.com.itcast.strategy;

class Black implements PaperColor{
    public void getPenColor(){
        System.out.println("You need a white pen!");
    }
}
