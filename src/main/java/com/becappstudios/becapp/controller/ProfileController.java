package com.becappstudios.becapp.controller;


import com.becappstudios.becapp.domain.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("profile")
public class ProfileController {
    @GetMapping
    public Profile test() {
        return new Profile(1L, "Рабочий", "ФИО", "nick", "02.12.1999");
    }
}
