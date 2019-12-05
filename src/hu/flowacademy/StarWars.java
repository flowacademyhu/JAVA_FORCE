package hu.flowacademy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.IOException;
import java.util.List;

public class StarWars {
    private static List<ForceSensitive> listOfPlayers = new ArrayList<>();

    public StarWars() throws IOException {
    }


    public static void actors() throws IOException {

        BufferedReader bufReader = new BufferedReader(new FileReader("./players.txt"));
        String line = bufReader.readLine();
        while (line != null) {
            listOfPlayers.add(line);
            line = bufReader.readLine();
        }
        bufReader.close();

    }

    public static void siths() {
        for(ForceSensitive fs : listOfPlayers) {
            System.out.println(fs.toString());
        }
    }
}
