/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iqmsoft.boot.gwt.client.service;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.fusesource.restygwt.client.MethodCallback;
import org.fusesource.restygwt.client.RestService;

import com.iqmsoft.boot.gwt.client.model.Country;


@Path("countries")
public interface CountryService extends RestService { 
    
    @GET
    public void getCountries( MethodCallback<List<Country>> callback);
    
}
