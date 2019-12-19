package com.zking.ssm.controller;

import com.zking.ssm.service.IXmeetingService;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class MeetingController {
    
    @Resource
    private IXmeetingService xmeetingService;
    
    
    
}
