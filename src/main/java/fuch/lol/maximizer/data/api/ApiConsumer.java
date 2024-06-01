package fuch.lol.maximizer.data.api;

import org.json.JSONObject;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ApiConsumer {
    private static String getResponseFromUrl(String url) {
        return new RestTemplate().getForObject(url, String.class);
    }

    public static JSONObject getResponse(String url) {
        return new JSONObject(getResponseFromUrl(url));
    }
}