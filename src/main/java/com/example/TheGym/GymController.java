package com.example.TheGym;

import org.springframework.util.ReflectionUtils;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Field;
import java.util.Map;

@RestController
public class GymController {

    private Gym gym = new Gym();
    private  GymInformation gymInformation = new GymInformation();

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
    public GymInformation patchMember(@RequestBody Map<String, Object> updateGym) {
        GymInformation gymInformation = gym.gymInfo;

        updateGym.forEach((k, v) -> {
            Field field = ReflectionUtils.findField(Member.class, k);
            ReflectionUtils.setField(field, gymInformation, v);
        });

        return null;
    }
}
