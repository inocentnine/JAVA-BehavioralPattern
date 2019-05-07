package lab4_2;

import java.util.ArrayList;

public class CompositeCommand extends Command{
    private Command[] commands;

    public CompositeCommand(Command[] commands){
        this.commands=commands;
    }

    public void execute(){
        for(int i=0;i<commands.length;++i){
            commands[i].execute();
        }
    }
}
