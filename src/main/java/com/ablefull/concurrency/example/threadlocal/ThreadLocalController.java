package com.ablefull.concurrency.example.threadlocal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author Created by D-l
 */

@Controller
@RequestMapping("/threadlocal")
public class ThreadLocalController {

    @RequestMapping("/test")
    @ResponseBody
    public long test(){
        return RequestHolder.getId();
    }
}
