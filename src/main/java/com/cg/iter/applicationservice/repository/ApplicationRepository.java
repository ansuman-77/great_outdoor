 package com.cg.iter.applicationservice.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.iter.applicationservice.entity.Application;
@Repository
public interface ApplicationRepository extends CrudRepository<Application, String> {


	

}
