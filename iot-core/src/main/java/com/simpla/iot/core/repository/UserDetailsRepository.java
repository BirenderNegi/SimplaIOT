package com.simpla.iot.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simpla.iot.core.model.UserDetails;

@Repository("userDetailsRepository")
public interface UserDetailsRepository extends JpaRepository<UserDetails, Integer>{

}
