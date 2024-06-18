package com.logicfocus.logicf.Controller;

import com.logicfocus.logicf.Model.DevEntity;
import com.logicfocus.logicf.Service.DevService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api") // Optional: base URL for all API endpoints
public class DevController {

    @Autowired
    DevService service;

    @PostMapping("/post")
    public void saveDevOps(@RequestBody DevEntity devops) {
        service.saveDevOps(devops);
    }

    @GetMapping("/get")
    private List<DevEntity> get() {
        return service.get();
    }

    @GetMapping("/get/{id}")
    private Optional<DevEntity> getbyId(@PathVariable long id) {
        return service.getbyId(id);
    }

    @GetMapping("/name/{name}")
    private List<DevEntity> getbyName(@PathVariable String name) {
        return service.getbyName(name);
    }
    @PutMapping("/update/")
    private void update(@RequestBody DevEntity devops){
        service.update(devops);
    }

    @DeleteMapping("/delete/{id}")
    private void delete(@PathVariable long id) {
        service.delete(id);
    }
}

