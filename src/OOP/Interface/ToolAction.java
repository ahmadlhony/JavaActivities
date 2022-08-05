package OOP.Interface;

public class ToolAction {
    //create an other class named ToolAction
    //this class don't have constructor , have one field: Tool currentTool;(tool interface)
    //and three methods,
    //setTool(Tool tool): that sets currentTool(setter)
    //rightClickPressed() that calls currentTool's rightClick method(currentTool.rightClick())
    //leftClickPressed()  that calls currentTool's leftClick method(currentTool.leftClick())
    private Tool tool;

    public void setTool(Tool tool) {
        this.tool = tool;
    }

    public void rightClickPressed(){
        this.tool.rightClick();
    }

    public void leftClickPressed(){
        this.tool.leftClick();
    }
}
