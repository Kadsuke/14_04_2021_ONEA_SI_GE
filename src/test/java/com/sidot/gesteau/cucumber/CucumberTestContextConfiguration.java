package com.sidot.gesteau.cucumber;

import com.sidot.gesteau.GestionEauApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = GestionEauApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
