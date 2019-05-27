package com.example.TheGym;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public class Gym {

    Members members = new Members();
    GymInformation gymInfo = new GymInformation();
    ObjectMapper mapper = new ObjectMapper();

    public Gym() {
        readFromFile();
    }

    public GymInformation getGymInfo() {

        return gymInfo;
    }

    public GymInformation patchGymInfo(Map<String, String> updateGym) {
//        updateGym.forEach((key, value) -> {
//            switch (key) {
//                case "name":
//                    getGymInfo().setName(value);
//                    writeToFile();
//                    break;
//                case "adress":
//                    getGymInfo().setAdress(value);
//                    writeToFile();
//                    break;
//                case "phoneNumber":
//                    getGymInfo().setPhoneNumber(value);
//                    writeToFile();
//                    break;
//                case "mail":
//                    getGymInfo().setMail(value);
//                    writeToFile();
//                    break;
//                case "openingHours":
//                    getGymInfo().setOpeningHours(value);
//                    writeToFile();
//                    break;
//                case "closingHours":
//                    getGymInfo().setClosingHours(value);
//                    writeToFile();
//                    break;
//            }
//        });

        gymInfo.patch(updateGym);
        writeToFile();

        return gymInfo;
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
            String resourcegymInfo = "gymInfo.json";
            InputStream fileStream = new FileInputStream(resourcegymInfo);
            GymInformation gymInformation =  mapper.readValue(fileStream, GymInformation.class);

            gymInfo = gymInformation;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
