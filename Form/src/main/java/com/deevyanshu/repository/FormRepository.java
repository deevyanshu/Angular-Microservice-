package com.deevyanshu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deevyanshu.Entity.Form;

@Repository
public interface FormRepository extends JpaRepository<Form, Integer>{

}
