package commands.consoleCommands;

import parameters.MusicBand;
import parameters.MusicGenre;

import java.util.ArrayList;
import java.util.Objects;

public class PrintGenre implements Command{

    public final static String[] args = new String[0];

    public ArrayList<MusicBand> execute(ArrayList<MusicBand> list, String[] arguments, String path){
        MusicGenre[] genres = MusicGenre.values();
        if (list.size() == 0){
            System.out.println("Коллекция пуста.");
        } else {
            for (int k = 0; k < genres.length; k++) {
                for (int i = 0; i < list.size(); i++) {
                    if (Objects.equals(list.get(i).getGenre(), genres[k])) {
                        System.out.println("ID: " + list.get(i).getId() + "\nИмя: " + list.get(i).getName() + "\nЖанр: " + list.get(i).getGenre());
                        System.out.println("");
                    }
                }
            }
        }

        return list;
    }

    @Override
    public String[] args() {
        return args;
    }
}
