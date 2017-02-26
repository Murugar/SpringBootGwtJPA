package com.iqmsoft.boot.gwt.server.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.iqmsoft.boot.gwt.server.model.Country;

@RepositoryRestResource
public interface CountryRepo extends CrudRepository<Country, Long> {


    public Country findByName(String countryName);

}
