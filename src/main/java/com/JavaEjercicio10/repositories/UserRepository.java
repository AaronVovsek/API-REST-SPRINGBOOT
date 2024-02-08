package com.JavaEjercicio10.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.JavaEjercicio10.models.UserModel;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Long>{
    
}
