package com.spring.jpademo.controller;

import com.spring.jpademo.model.dto.OrderInfoDto;
import org.jboss.logging.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * TestController
 *
 * @author clong
 */
@RestController
@RequestMapping("api/test")
public class TestController {
    @GetMapping("")
    public ResponseEntity<?> getGeofence( @RequestParam(value = "location") String location
                                                ) {
        Object result;

        try {
            result = getRegeo(location);
        } catch (Exception e) {
            //log.error("逆地址报错", e);
            return ResponseEntity.status(222).body(e.getMessage());
        }

        return ResponseEntity.ok(result);
    }

    private String getRegeo(String location){
        return location;
    }

    @PostMapping("")
    public ResponseEntity<?> getGeofence(@RequestBody OrderInfoDto orderDto) {
        Object result;
        try {
            result =getRegeo(orderDto.getAddress());
        } catch (Exception e) {
            //log.error("批量逆地址报错", e);
            return ResponseEntity.status(222).body(e.getMessage());
        }
        return ResponseEntity.ok(result);
    }
}
