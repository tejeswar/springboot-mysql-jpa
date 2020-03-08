package com.mysql.springbootmysqljpa.entity;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepo extends CrudRepository<Person, Long>{

}
