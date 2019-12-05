package hu.flowacademy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.IOException;
import java.util.List;

public class StarWars {
    public static ArrayList<ForceSensitive> listOfPlayers = new ArrayList<>();

    public StarWars() throws IOException {
    }

    public static void actors() throws IOException {

        BufferedReader bufReader = new BufferedReader(new FileReader("./players.txt"));
        String line = bufReader.readLine();
        while (line != null) {
            listOfPlayers.add(objectMaker(line));
            line = bufReader.readLine();
        }
        bufReader.close();
    }

    private static ForceSensitive objectMaker(String line) {
        String[] arr = line.split(" ");
        if (arr[0].equals("anakin")) {
            AnakinSkywalker anakin = new AnakinSkywalker();
            wraithMaker(anakin, Integer.parseInt(arr[1]));
            return anakin;
        } else {
            Emperor empy = new Emperor();
            wraithMaker(empy, Integer.parseInt(arr[1]));
            return empy;
        }
    }

    private static void wraithMaker(ForceSensitive person, int num) {
        if (!(person instanceof Sith)) {
            return;
        }
        for (int i = 0; i < num; i++) {
            ((Sith) person).letOutYourWraith();
        }
    }


}
