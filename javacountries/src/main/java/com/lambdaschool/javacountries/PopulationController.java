package com.lambdaschool.javacountries;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.lambdaschool.javacountries.JavacountriesApplication.ourCountryList;

import java.util.ArrayList;

@RestController
@RequestMapping("/population")
public class PopulationController {

    //localhost:8080/population/size/{people}
    //return the countries that have a population equal to or greater than a given population
    @GetMapping( value = "/size/{pop}",
            produces = "application/json")

    public ResponseEntity<?> comparePop(
            @PathVariable
                    int pop)
    {
        ArrayList<Country> rtnPop = JavacountriesApplication.ourCountryList.
                findCountries(c -> c.getPopulation() >= pop);
        rtnPop.sort((c1, c2) -> c1.getName().compareToIgnoreCase(c2.getName()));
        return new ResponseEntity<>(rtnPop, HttpStatus.OK);
    }
    //localhost:8080/population/min
    // return the country with the smallest population
    @GetMapping(value = "/min",
            produces = {"application/json"})
    public ResponseEntity<?> popMin()
    {
        JavacountriesApplication.ourCountryList.countryList.sort((c1, c2) -> c1.getPopulation() - c2.getPopulation());
        return new ResponseEntity<>(ourCountryList.countryList.get(0), HttpStatus.OK);
    }
    //localhost:8080/population/max
    //return the country with the largest population
    @GetMapping(value = "/max",
            produces = {"application/json"})
    public ResponseEntity<?> popMax()
    {
        JavacountriesApplication.ourCountryList.countryList.sort((c1, c2) -> c2.getPopulation() - c1.getPopulation());
        return new ResponseEntity<>(ourCountryList.countryList.get(0), HttpStatus.OK);
    }

}
