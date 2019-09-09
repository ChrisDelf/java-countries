package com.lambdaschool.javacountries;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/names")
public class CountryController {


    //localhost:8080/names/all
    @GetMapping(value= "/all",
            produces = {"application/json"})
    public ResponseEntity<?> getAllCountries()

    {

        JavacountriesApplication.ourCountryList.countryList.sort((c1, c2) -> c1.getName().compareToIgnoreCase(c2.getName()));
        return new ResponseEntity<>(JavacountriesApplication.ourCountryList.countryList, HttpStatus.OK);
    }
    //localhost:8080/start/{letter}
    @GetMapping(value = "/start/{letter}",
            produces = {"application/json"})
    public ResponseEntity<?> getCountry(
            @PathVariable
                    char letter)
    {
        ArrayList<Country> rtnCountries = JavacountriesApplication.ourCountryList.
                findCountires(e -> e.getName().toUpperCase().charAt(0) == Character.toUpperCase(letter));
        return new ResponseEntity<>(rtnCountries, HttpStatus.OK);
    }
}
