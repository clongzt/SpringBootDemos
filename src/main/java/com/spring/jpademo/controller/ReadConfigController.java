package com.spring.jpademo.controller;

import com.spring.jpademo.model.Regeolayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ReadConfigController
 *
 * @author clong
 */
@RestController
@RequestMapping("api/config")
public class ReadConfigController {
    @Autowired
    private Regeolayer regeolayer;

    @GetMapping("/geocodeurl")
    public ResponseEntity<?> getgeoCodeurl(@RequestParam(value = "location") String location
    ) {
        Object result;

        try {
            result =regeolayer.getGeoCodeUrl();
        } catch (Exception e) {
            //log.error("逆地址报错", e);
            return ResponseEntity.status(222).body(e.getMessage());
        }

        return ResponseEntity.ok(result);
    }
}
