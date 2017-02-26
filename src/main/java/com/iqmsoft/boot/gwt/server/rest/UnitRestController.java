
package com.iqmsoft.boot.gwt.server.rest;


import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iqmsoft.boot.gwt.server.model.Unit;
import com.iqmsoft.boot.gwt.server.repos.UnitRepo;


@RestController
public class UnitRestController {
    
    @Autowired
    private UnitRepo unitRepo;
    
    @RequestMapping(value = "/units/{cityname}", method = RequestMethod.GET)
    public List<Unit> getUnits(@PathVariable(name = "cityname") String cityName){

        if(cityName == null){
            Iterable<Unit> allUnits = unitRepo.findAll();
            List list = createList(allUnits);

            return list;
        } else {
            return unitRepo.findByCityNameOrderByBankName(cityName);
        }


    }
    
    private List createList(Iterable it){
        
        ArrayList list = new ArrayList();
        for(Object o : it){
            list.add(o);
        }
        
        return list;
    }
    
}
