package OOP.Interface;

public class EraserTool implements Tool {
    @Override
    public void rightClick() {
        System.out.println("right click pressed on EraserTool");
    }

    @Override
    public void leftClick() {
        System.out.println("left click pressed on EraserTool");
    }
    //1.EraserTool:    on rightClick() just print "right click pressed on EraserTool"
    //                 on leftClick()  just print "left click pressed on EraserTool"
}
