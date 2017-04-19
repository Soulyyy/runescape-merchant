package com.merchant.runescape.controllers;

public class HelloControllerTest {

        @LocalServerPort
        private int port;

        private URL base;

        @Autowired
        private TestRestTemplate template;

        @Before
        public void setUp() throws Exception {
            this.base = new URL("http://localhost:" + port + "/");
        }

        @Test
        public void getHello() throws Exception {
            ResponseEntity<String> response = template.getForEntity(base.toString(),
                String.class);
            assertThat(response.getBody(), equalTo("Greetings from Spring Boot!"));
        }

    }

}
