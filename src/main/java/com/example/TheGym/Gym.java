package com.example.TheGym;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Gym {

    GymInformation gymInfo = new GymInformation();
    ObjectMapper mapper = new ObjectMapper();

    public Gym() {
        readFromFile();
    }

    public GymInformation getGymInfo() {
        return gymInfo;
    }

    public void patchGymInfo(GymInformation gymInformation) {
        //Optional<GymInformation> optGymInfo =


    }

    private void writeToFile() {
        try {
            // Java object to json file
            mapper.writeValue(new File("gymInfo.json"), gymInfo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readFromFile() {
        try {
            String resourceMembers = "gymInfo.json";
            InputStream fileStream = new FileInputStream(resourceMembers);
            GymInformation membersList =  mapper.readValue(fileStream, GymInformation.class);

            gymInfo = membersList;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
