package main.java.com.itcast.strategy;

class MyPaper{
    private PaperColor paperColor;
    public MyPaper(PaperColor paperColor){
        this.paperColor = paperColor;
    }
    public PaperColor getPaperColor(){
        return this.paperColor;
    }
    public void choicePen(){
        this.paperColor.getPenColor();
    }
}
