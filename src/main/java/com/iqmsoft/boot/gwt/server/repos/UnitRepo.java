package com.iqmsoft.boot.gwt.server.repos;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.iqmsoft.boot.gwt.server.model.Unit;

@RepositoryRestResource
public interface UnitRepo extends CrudRepository<Unit, Long> {
    
    public List<Unit> findByCityNameOrderByBankName(String cityName);
    
}
