package com.blueprint.web.controllers.rest;

import com.blueprint.config.AppConfig;
import com.blueprint.filters.CORSFilter;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@WebAppConfiguration
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class IndexRestControllerTest {

    private MockMvc mockMvc;

    @Autowired
    private IndexRestController indexRestController;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders
                .standaloneSetup(indexRestController)
                .addFilters(new CORSFilter())
                .build();
    }

    @Test
    public void test_cors_headers() throws Exception {
        mockMvc.perform(get("/api/"))
                .andExpect(header().string("Access-Control-Allow-Origin", "*"))
                .andExpect(header().string("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE"))
                .andExpect(header().string("Access-Control-Allow-Headers", "*"))
                .andExpect(header().string("Access-Control-Max-Age", "3600"));
    }

}
