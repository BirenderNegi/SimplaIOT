package com.simpla.iot.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simpla.iot.core.model.LoginDetails;

@Repository("loginDetailsRepository")
public interface LoginDetailsRepository  extends JpaRepository<LoginDetails, Integer> {

}
