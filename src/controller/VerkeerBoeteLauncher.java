package controller;

import model.ParkeerBoete;
import model.SnelheidsBoete;
import model.VerkeersBoete;

import java.util.ArrayList;


public class VerkeerBoeteLauncher {
    public static void main(String[] args) {
        ArrayList<VerkeersBoete> verkeers = new ArrayList<>();
        verkeers.add(new ParkeerBoete("Jan", "31-NF-RL", 2));
        verkeers.add(new SnelheidsBoete("Irith", "54-ZK-673", 155, 130));
        verkeers.add(new SnelheidsBoete("Jaroen", "65-KJ-532", 62, 50));
        verkeers.add(new SnelheidsBoete("Geert", "43-JS-984", 50, 30));

        for (VerkeersBoete verkeer : verkeers) {
            System.out.println(verkeer.toString());

        }
    }


}
