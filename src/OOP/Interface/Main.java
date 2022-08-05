package OOP.Interface;

public class Main {
    //in this activity we will simulate creating Photoshop tool action
    //different tools in photoshop have different behavior(functionalities) when leftClick or rightClick pressed
    // like EraserTool, BrushTool SelectionTool ....
    //in this example whe have an interface named Tool (it is implemented by every tool)
    //Tool interface have 2 abstract methods(void) without any parameter rightClick() , leftClick()
    //we have 3 classes that implemented Tool interface:
    //1.EraserTool:    on rightClick() just print "right click pressed on EraserTool"
    //                 on leftClick()  just print "left click pressed on EraserTool"

    //2.BrushTool:     on rightClick() just print "right click pressed on BrushTool"
    //                 on leftClick()  just print "left click pressed on BrushTool"

    //3.SelectionTool: on rightClick() just print "right click pressed on SelectionTool"
    //                 on leftClick()  just print "left click pressed on SelectionTool"

    //create an other class named ToolAction
    //this class don't have constructor , have one field: Tool currentTool;(tool interface)
    //and three methods,
    //setTool(Tool tool): that sets currentTool(setter)
    //rightClickPressed() that calls currentTool's rightClick method(currentTool.rightClick())
    //leftClickPressed()  that calls currentTool's leftClick method(currentTool.leftClick())

    //in main method create object of BrushTool, EraserTool, SelectionTool, and ToolAction
    //test all objects in ToolAction by setting them and calling rightClickPressed(), leftClickPressed()


    public static void main(String[] args) {
        ToolAction toolAction = new ToolAction();
        var brushTool = new BrushTool();
        var eraserTool = new EraserTool();
        var selectionTool = new SelectionTool();

        toolAction.setTool(brushTool);
        toolAction.leftClickPressed();
        toolAction.rightClickPressed();
        toolAction.setTool(eraserTool);
        toolAction.leftClickPressed();
        toolAction.rightClickPressed();
        toolAction.setTool(selectionTool);
        toolAction.leftClickPressed();
        toolAction.rightClickPressed();
    }
}
