package main.java.com.itcast.strategy;

class Red implements PaperColor{
    public void getPenColor(){
        System.out.println("You need a white pen!");
    }
}
