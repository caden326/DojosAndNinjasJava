package com.dojosAndNinjas.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dojosAndNinjas.models.DojoModel;

@Repository
public interface DojoRepository extends CrudRepository<DojoModel,Long>{

}
