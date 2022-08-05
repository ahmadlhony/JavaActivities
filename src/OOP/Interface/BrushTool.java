package OOP.Interface;

public class BrushTool implements Tool{
    @Override
    public void rightClick() {
        System.out.println("right click pressed on BrushTool");
    }

    @Override
    public void leftClick() {
        System.out.println("left click pressed on BrushTool");
    }
    //2.BrushTool:     on rightClick() just print "right click pressed on BrushTool"
    //                 on leftClick()  just print "left click pressed on BrushTool"

}
