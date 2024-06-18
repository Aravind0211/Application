package com.logicfocus.logicf.Repo;

import com.logicfocus.logicf.Model.DevEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DevRepo extends JpaRepository<DevEntity, Long> {

    @Query("FROM DevEntity d WHERE d.name = :name AND d.id = 1")
    List<DevEntity> getByName(String name);
}
