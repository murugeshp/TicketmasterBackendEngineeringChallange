package com.murugesh1996.ticketmasterprogram;

import com.murugesh1996.ticketmasterprogram.services.LoadJson;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@AutoConfigureMockMvc
@SpringBootTest(classes = TicketmasterprogramApplication.class)
public class RestApiTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getArtistHttpRequest() throws Exception{

        mockMvc.perform(MockMvcRequestBuilders.get("/api/21"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.id", is(21)))
                .andExpect(jsonPath("$.name", is("HRH Prog")));
    }

    @Test
    public void getArtistNotFoundHttpRequest() throws Exception{

        mockMvc.perform(MockMvcRequestBuilders.get("/api/2123"))
                .andExpect(status().is4xxClientError())
                .andExpect(jsonPath("$.status", is(404)))
                .andExpect(jsonPath("$.message", is("Artist not Found")));
    }

}
