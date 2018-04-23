package com.daneking.rest.task;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("task")
public class TaskController {
    @RequestMapping
    public String get(){
        return "task";
    }


}
