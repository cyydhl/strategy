package main.java.com.itcast.strategy;

public class Main {
    public static void main(String args[]){
      MyPaper myPaper = new MyPaper(new White());
        myPaper.choicePen();
    }
}
