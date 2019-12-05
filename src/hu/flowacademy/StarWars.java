package hu.flowacademy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.IOException;

public class StarWars {
    private ArrayList<String> listOfPlayers = new ArrayList<>();

    public StarWars() throws IOException {
    }


    public void actors() throws IOException {

        BufferedReader bufReader = new BufferedReader(new FileReader("./players.txt"));
        String line = bufReader.readLine();
        while (line != null) {
            listOfPlayers.add(line);
            line = bufReader.readLine();
        }
        bufReader.close();

    }
}
