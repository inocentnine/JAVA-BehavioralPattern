package lab4_2;

public class redoCommand extends Command{
    private Calculator calculator;
    public redoCommand(){
        calculator=new Calculator();
    }
    public void execute(){
        calculator.redo();
    }
}
