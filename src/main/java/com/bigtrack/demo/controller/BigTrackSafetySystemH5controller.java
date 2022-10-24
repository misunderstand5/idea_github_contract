package com.bigtrack.demo.controller;

import com.bigtrack.demo.entity.SafetyCheck;
import com.bigtrack.demo.service.SafetyCheckService;
import org.apache.catalina.filters.CorsFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
@RestController//返回json数据给h5
public class BigTrackSafetySystemH5controller {
    @Autowired
    private SafetyCheckService safeCkeckService;
    @RequestMapping("track_safety_system_current")
    public String trackSafetySystemH5(HttpServletResponse response,HttpServletRequest request){
        return safeCkeckService.trackSafetySystem();
    }
    @RequestMapping("track_safety_system_list")
    public List<SafetyCheck> trackSafetySystemListH5(){
        return safeCkeckService.trackSafetySystemList();
    }
}
