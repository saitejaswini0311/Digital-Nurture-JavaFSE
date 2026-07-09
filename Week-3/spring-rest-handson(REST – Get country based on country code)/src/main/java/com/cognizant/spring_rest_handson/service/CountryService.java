package com.cognizant.spring_rest_handson.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.spring_rest_handson.model.Country;

@Service
public class CountryService {

    @Autowired
    private ApplicationContext context;

    @SuppressWarnings("unchecked")
    public Country getCountry(String code) {

        List<Country> countryList =
                (List<Country>) context.getBean("countryList");

        for (Country country : countryList) {

            if (country.getCode().equalsIgnoreCase(code)) {
                return country;
            }

        }

        return null;
    }
}