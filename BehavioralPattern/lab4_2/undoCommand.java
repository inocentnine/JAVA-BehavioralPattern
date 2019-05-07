package lab4_2;

public class undoCommand extends Command{
    private Calculator calculator;
    public undoCommand(){
        calculator=new Calculator();
    }
    public void execute(){
        calculator.undo();
    }
}
