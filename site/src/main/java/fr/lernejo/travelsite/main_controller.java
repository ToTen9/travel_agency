package fr.lernejo.travelsite;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class main_controller {

    final ArrayList<inscription> inscriptions = new ArrayList<>();

    @PostMapping("api/inscription")
    public ArrayList<inscription> addto(@RequestBody inscription user){

        /*for(inscription inscription:inscriptions){
            if (inscription.userName().equals(user.userName()))
                return inscriptions;
        }*/
        inscriptions.add(user);
        return inscriptions;
    }
    @GetMapping("api/travels")
    public ArrayList<countries> getcountry(@RequestParam String userName){

        ArrayList<countries> count = new ArrayList<>();

        count.add(new countries("Japan", 25));
        count.add(new countries("Spain", 55));

        return count;
    }
}
