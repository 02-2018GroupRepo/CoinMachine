package com;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.concurrent.ExecutionException;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class MachineControllerTest {


    private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(
                new MachineController()).build();
    }

    @Test
    public void moneyAmountTest() throws Exception {
        this.mockMvc
                .perform(
                        get("/requestMoneyAmount")
                                .accept(MediaType.parseMediaType(
                                        "application/html;charset=UTF-8"
                                )))
                .andExpect(status().isOk())
                .andExpect(content().contentType(
                        "application/html;charset=UTF-8"))
                .andExpect(content().string("0.0"));

    }
    @Test
    public void basicTest() throws Exception {
        this.mockMvc
                .perform(
                        get("/requestCoinAmount")
                                .accept(MediaType.parseMediaType(
                                        "application/html;charset=UTF-8"
                                )))
                .andExpect(status().isOk())
                .andExpect(content().contentType(
                        "application/html;charset=UTF-8"))
                .andExpect(content().string("{\"DIME\":4}"));

    }
}
