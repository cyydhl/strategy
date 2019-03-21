
        需重构的if else的例子,用策略模式重构
        public class UseIfElse {
            public static void main(String args[]){
                MyPaper myPaper = new MyPaper(PaperColor.RED);
                if(myPaper.getMyPaperColor() == PaperColor.BLACK){
                    System.out.println("You need a black pen!");
                }else if(myPaper.getMyPaperColor() == PaperColor.BLUE){
                    System.out.println("You need a blue pen!");
                }else if(myPaper.getMyPaperColor() == PaperColor.RED){
                    System.out.println("You need a red pen!");
                }else if(myPaper.getMyPaperColor() == PaperColor.WHITE){
                    System.out.println("You need a white pen!");
                }
           }
       }
       class MyPaper{
           private PaperColor paperColor;
           public MyPaper(PaperColor paperColor){
               this.paperColor = paperColor;
           }
           public PaperColor getMyPaperColor(){
               return this.paperColor;
           }
       }
       enum PaperColor{
           WHITE, BLACK, BLUE, RED
       }
