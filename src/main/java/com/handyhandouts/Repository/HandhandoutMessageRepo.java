package com.handyhandouts.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.handyhandouts.model.HandyhandoutMessage;

@Repository
public interface HandhandoutMessageRepo extends JpaRepository<HandyhandoutMessage, Long>{

}
