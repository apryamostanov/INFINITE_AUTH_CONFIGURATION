package com.a9ae0b01f0ffc.infinite_auth_configuration.base

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class T_mvc_controller {

    @RequestMapping(value = "/")
    String root_request_mapping() {
        System.out.println("in controller")
        return "index"
    }

}
