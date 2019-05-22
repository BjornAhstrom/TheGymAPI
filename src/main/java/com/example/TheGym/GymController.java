package com.example.TheGym;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GymController {

    private Gym gym = new Gym();
    private  GymInformation gymInformation = new GymInformation("The Gym", "Tomtebodavägen 3", "08123456","gym@gym.se", "09:00", "21:00");

    @RequestMapping(value = "/gym", method = RequestMethod.GET)
    public GymInformation getGymInfo() {   //@RequestParam(value = "searchString", defaultValue = "") String searchString

        return  gymInformation;
    }

    @RequestMapping(value = "/gym", method = RequestMethod.POST)
    public GymInformation postGymInfo(@RequestBody GymInformation gymInfo) {

        return gymInfo;
    }
}
