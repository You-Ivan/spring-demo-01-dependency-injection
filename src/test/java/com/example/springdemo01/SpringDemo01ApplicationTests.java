package com.example.springdemo01;

import com.example.springdemo01.bean.Computer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class SpringDemo01ApplicationTests {
    @Autowired
    Computer c;

    @Test
    void contextLoads() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
    }

}
