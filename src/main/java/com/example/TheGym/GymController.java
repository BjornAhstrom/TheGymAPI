package com.example.TheGym;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class GymController {

    private Gym gym = new Gym();
    //private  GymInformation gymInformation = new GymInformation();

    @RequestMapping(value = "/gym", method = RequestMethod.GET)
    public GymInformation getGymInfo() {   //@RequestParam(value = "searchString", defaultValue = "") String searchString

        return  gym.getGymInfo();
    }

//    @RequestMapping(value = "/gym", method = RequestMethod.POST)
//    public GymInformation postGymInfo(@RequestBody GymInformation gymInfo) {
//        gym.addGym(gymInfo);
//        return gymInfo;
//    }

    @RequestMapping(value = "/gym", method = RequestMethod.PATCH)
    public GymInformation patchGymInformation(@RequestBody Map<String, String> updateGym) {

        return gym.patchGymInfo(updateGym);
    }
}
