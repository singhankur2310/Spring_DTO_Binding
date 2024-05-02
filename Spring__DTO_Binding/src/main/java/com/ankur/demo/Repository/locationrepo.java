package com.ankur.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ankur.demo.model.location;
@Repository
public interface locationrepo extends JpaRepository<location, Integer>{

}
