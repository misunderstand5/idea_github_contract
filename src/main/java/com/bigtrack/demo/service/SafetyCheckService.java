package com.bigtrack.demo.service;

import com.bigtrack.demo.entity.SafetyCheck;
import com.bigtrack.demo.mapper.SafetyCheckMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SafetyCheckService {
    @Autowired
    private SafetyCheckMapper safetyCheckMapper;
    public List<SafetyCheck> trackSafetySystemList(){
        List<SafetyCheck> list=null;

//        list = bysVerifyMapper.queryListBysVerifyInfo();
        System.out.println("trackSafetySystemList():"+list);
        list =safetyCheckMapper.trackSafetySystemList();

        System.out.println("trackSafetySystemList():"+list);
        System.out.println("List:"+list);
        if (list ==null){
            list =new ArrayList<SafetyCheck>();
            System.out.println("没有从数据库获取到数据....");
        }else {
            System.out.println("成功从数据库获取数据");
        }
        return list;
    }
    public String trackSafetySystem() {
        String track =null;
        track =safetyCheckMapper.trackSafetySystem();
        System.out.println("track:"+track);
        System.out.println("track2:"+track);
        return track;
    }
}
