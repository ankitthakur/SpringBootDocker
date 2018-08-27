package com.thakur.dockerdemo.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/docker/api")
class DockerController {

    @RequestMapping("/")
    fun home(): String {
        return "Welcome to Docker apis"
    }

    @RequestMapping("/hello")
    fun helloWorld(): String {
        return "Welcome to Docker apis, This is hello world in docker"
    }
}