package com.example.demo.controller

import com.example.demo.model.User
import com.example.demo.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Controller

@Controller
class UserController : CommandLineRunner {
    @Autowired
    private lateinit var userRepository: UserRepository

    override fun run(vararg args: String?) {
        var user: User? = userRepository.findByEmail("jhlee@cufit.net")
        println(user.toString())
//        var user = userRepository.findByEmail("jhlee@cufit.net")!!
//        println(user.toString())

    }

}