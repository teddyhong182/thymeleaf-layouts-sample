package com.awesometeddy.web.userinterface

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping


@Controller
class HomeController {

    @GetMapping("/")
    fun index(): String {
        return "index"
    }

    @GetMapping("/home")
    fun home(): String {
        return "home"
    }
}