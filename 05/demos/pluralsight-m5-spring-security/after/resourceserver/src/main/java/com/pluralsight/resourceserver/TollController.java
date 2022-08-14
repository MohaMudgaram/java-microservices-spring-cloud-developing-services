package com.pluralsight.resourceserver;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TollController {

    private List<TollData> tollData;

    public TollController() {

        tollData = new ArrayList<TollData>();
        tollData.add(new TollData("900", "1VB4GHA", "2021-09-21-2021T07:35:12"));
        tollData.add(new TollData("901", "BB40003", "2021-09-21-2021T07:35:40"));
        tollData.add(new TollData("902", "B200VV4", "2021-09-21-2021T07:36:02"));

    }

    @RequestMapping("/api/tolldata")
    public List<TollData> getTollData() {
        return tollData;
    }
    
}
