package com.dojosAndNinjas.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.dojosAndNinjas.models.NinjaModel;

@Repository
public interface NinjaRepository extends CrudRepository<NinjaModel, Long> {

}
