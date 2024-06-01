package fuch.lol.maximizer;

import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fuch.lol.maximizer.data.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class Init {
	public static void main(String[] args) {
		SpringApplication.run(Init.class, args);
		for (JSONObject championData : Data.getChampionsData()) {
			log.info("Champion: {}", championData.get("name"));	
		}
	}
}
