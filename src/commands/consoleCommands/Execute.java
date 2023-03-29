package commands.consoleCommands;

import commands.Receiver;
import parameters.MusicBand;

import java.util.ArrayList;

/**
 * This command executes commands from the script file.
 */

public class Execute implements Command{

    public final static String[] args = {"имя файла"};
    public static String[] inputs = new String[0];
    public String[] getInputs() {
        return inputs;
    }

    public String[] getArgs() {
        return args;
    }

    public boolean complicated = false;

    public boolean isComplicated(){
        return complicated;
    }

    Receiver receiver;
    public Execute (Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute(String[] arguments, String path, boolean isScript){
        receiver.executeCommand(arguments, path, isScript);
    }

    @Override
    public String[] args() {
        return args;
    }
}
