package com.rodolfo.springbootcucumber.config;

import com.rodolfo.springbootcucumber.SpringBootCucumberApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@CucumberContextConfiguration
@SpringBootTest(classes = SpringBootCucumberApplication.class)
public class CucumberSpringConfiguration {
}