package com.example.jenkinstest.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("MainService")
class MainServiceTest {

    private MainService mainService = new MainService();

    @Test
    void getMessageTest() {
        String message =  mainService.getMessage();
        String correctMessage = "Hello Jenkins";
        assertThat(message).isEqualTo(correctMessage);
    }
}