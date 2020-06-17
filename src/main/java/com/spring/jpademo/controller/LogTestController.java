package com.spring.jpademo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * LogTestController
 *
 * @author clong
 */
@RestController
@RequestMapping("api/log")
public class LogTestController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @GetMapping("")
    public ResponseEntity<?> getGeofence(@RequestParam(value = "location") String location
    ) {
        Object result;
        logger.error("this is a test erroe");
        logger.info("this ia e info");
        try {
            result = location;
        } catch (Exception e) {
            //log.error("逆地址报错", e);
            return ResponseEntity.status(222).body(e.getMessage());
        }

        return ResponseEntity.ok(result);
    }
}
