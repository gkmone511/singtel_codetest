package com.singtel.animal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/animal")
public class AnimalRestController {


	/**
	 * This is the end point for testing
	 * @return
	 */
    @GetMapping(path = "/test")
    public String getTest() {
        return "Endpoint Testing";
    }


}
