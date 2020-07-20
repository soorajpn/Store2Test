package com.sooraj.study.web.rest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class UnitTest {

    @DisplayName("###############unt test#################")
    @Test
    public void unitTest(){

        System.out.println("==> Unit test running ==>");
        assertThat(true).isTrue();

    }

}
