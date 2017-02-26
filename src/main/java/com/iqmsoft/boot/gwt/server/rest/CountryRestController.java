
package com.iqmsoft.boot.gwt.server.rest;

//import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iqmsoft.boot.gwt.server.model.Country;
import com.iqmsoft.boot.gwt.server.repos.CountryRepo;


@RestController
public class CountryRestController {
    
    @Autowired
    private CountryRepo countryRepo;
    
    @RequestMapping(value = "/countries", method = RequestMethod.GET)
    public List<Country> getCountries(){
        Iterable<Country> allCountries = countryRepo.findAll();
        
//        ArrayList list = new ArrayList();
//        for(Country c : allCountries){
//            list.add(c);
//        }
        
        List list = createList(allCountries);        
        return list;
    }
    
    private List createList(Iterable it){
        
        ArrayList list = new ArrayList();
        for(Object o : it){
            list.add(o);
        }
        
        return list;
    }
    
}
