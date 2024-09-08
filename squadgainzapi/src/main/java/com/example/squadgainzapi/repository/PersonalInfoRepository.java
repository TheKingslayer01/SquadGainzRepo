package com.example.squadgainzapi.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.squadgainzapi.EntityPojos.UserPersonalInfo;

@Repository
public interface PersonalInfoRepository extends JpaRepository<UserPersonalInfo, Long> {

    @Query("SELECT u FROM UserPersonalInfo u WHERE u.userId = :userId")
    List<UserPersonalInfo> findByUserid(@Param("userId") Long userId);

}
