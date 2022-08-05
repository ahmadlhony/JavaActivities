package OOP.Interface;

public class SelectionTool implements Tool {
    @Override
    public void rightClick() {
        System.out.println("right click pressed on SelectionTool");
    }

    @Override
    public void leftClick() {
        System.out.println("left click pressed on SelectionTool");
    }
    public void create(){}
    //3.SelectionTool: on rightClick() just print "right click pressed on SelectionTool"
    //                 on leftClick()  just print "left click pressed on SelectionTool"
}
