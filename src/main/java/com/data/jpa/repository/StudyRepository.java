package com.data.jpa.repository;

import com.data.jpa.entity.Study;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudyRepository extends JpaRepository<Study, Long> {

}
