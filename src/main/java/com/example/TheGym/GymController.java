package com.example.TheGym;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class GymController {

    private Gym gym = new Gym();

    @RequestMapping(value = "/gym", method = RequestMethod.GET)
    public GymInformation getGymInfo() {

        return  gym.getGymInfo();
    }

    @RequestMapping(value = "/gym", method = RequestMethod.PATCH)
    public GymInformation patchGymInformation(@RequestBody Map<String, String> updateGym) {

        return gym.patchGymInfo(updateGym);
    }
}
