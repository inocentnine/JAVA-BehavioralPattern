package lab4_2;

public class CalculatorForm {
    private Command redoCommand,undoCommand;

    public CalculatorForm(Command redoCommand,Command undoCommand) {
        this.redoCommand = redoCommand;
        this.undoCommand=undoCommand;

    }

    public void redo(){
        redoCommand.execute();
    }
    public void undo(){
        undoCommand.execute();
    }
}
