package com.kgisl.restcli;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class RestcliApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestcliApplication.class, args);
	}
    // public void run(String... args) throws Exception {
    //     WebClient webClient = WebClient.create("http://localhost:9090/person");

    //     String response = webClient.get()
    //             .uri("/details")
    //             .retrieve()
    //             .bodyToMono(String.class)
    //             .block(); 

    //     System.out.println("Response: " + response);
    // }
//    public void run(String... args) throws Exception {
//         RestTemplate restTemplate = new RestTemplate();
//         String url = "http://localhost:9090/person/details";
//         String result = restTemplate.getForObject(url, String.class);
//         System.out.println("Response: " + result);
//     }
}
