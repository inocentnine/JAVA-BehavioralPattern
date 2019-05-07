package lab4_2;

public class Client {
    public static void main(String[] args){
        Command redocommand,undocommand;

        redocommand=new redoCommand();
        undocommand=new undoCommand();

        CalculatorForm calculatorForm=new CalculatorForm(redocommand,undocommand);

        Command[] commands={redocommand,undocommand};

        CompositeCommand compositeCommand=new CompositeCommand(commands);
        compositeCommand.execute();
    }
}
