package fuch.lol.maximizer.data.builder;

import fuch.lol.maximizer.data.util.Constants;

public class UrlBuilder {
    private static String getApiBaseUrl(){
        String apiBaseUrl = "";
        for (String constant : Constants.getApiBaseConstants()) {
            apiBaseUrl += constant;
            apiBaseUrl += (!constant.equals(Constants.CHAMPION)) ? "/" : "";
        }
        return apiBaseUrl;
    }

    public static String getApiUrl() {
        return getApiBaseUrl() + Constants.JSON_EXTENSION;
    }

    public static String getApiUrl(String champion) {
        return getApiBaseUrl() + "/" + champion + Constants.JSON_EXTENSION;
    }
}