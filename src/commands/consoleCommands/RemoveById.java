package commands.consoleCommands;

import commands.Receiver;
import parameters.MusicBand;

import java.util.ArrayList;
import java.util.Objects;

/**
 * This command removes element from main collection Stack<MusicBand> which ID value equals argument.
 */

public class RemoveById implements Command {

    public final static String[] args = {"id"};
    public static String[] inputs = new String[0];
    public String[] getInputs() {
        return inputs;
    }

    public String[] getArgs() {
        return args;
    }

    public ArrayList<MusicBand> execute(ArrayList<MusicBand> list, String[] arguments, String path, boolean isScript) {
        Receiver reciever = new Receiver(path);
        reciever.removeByIdCommand(list, arguments, path, isScript);
        return list;
    }

    public boolean confirm(String input){
        boolean start = false;
        if(Objects.equals(input, "y")) {
            start = true;
        } else if(Objects.equals(input, "n")){
            System.out.println("Операция отменена.");
        }
        return start;
    }

    @Override
    public String[] args() {
        return args;
    }
}
