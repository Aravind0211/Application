package com.logicfocus.logicf.Service;

import com.logicfocus.logicf.Model.DevEntity;
import com.logicfocus.logicf.Repo.DevRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DevService {

    @Autowired
    DevRepo devRepo;

    public void saveDevOps(DevEntity devops) {
        devRepo.save(devops);
    }

    public List<DevEntity> get() {
        return devRepo.findAll();
    }

    public Optional<DevEntity> getbyId(long id) {
        return devRepo.findById(id);
    }

    public List<DevEntity> getbyName(String name) {
        return devRepo.getByName(name);
    }

    public void delete(long id) {
        devRepo.deleteById(id);

    }

    public void update(DevEntity devops) {
        devRepo.save(devops);
    }
}
