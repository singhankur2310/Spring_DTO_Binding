package com.ankur.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ankur.demo.model.user;
@Repository
public interface user__repo extends JpaRepository<user, Integer> {

}
