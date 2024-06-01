package fuch.lol.maximizer.data.util;

import java.util.ArrayList;

public class Constants {
    public final static String API_BASE_URL = "https://ddragon.leagueoflegends.com/cdn/";
    public final static String VERSION = "14.11.1";
    public final static String DATA_NODE = "data";
    public final static String LANGUAGE = "en_US";
    public final static String CHAMPION = "champion";
    public final static String JSON_EXTENSION = ".json";

    public static final ArrayList<String> getApiBaseConstants() {
        ArrayList<String> apiBaseConstants = new ArrayList<>();
        apiBaseConstants.add(API_BASE_URL);
        apiBaseConstants.add(VERSION);
        apiBaseConstants.add(DATA_NODE);
        apiBaseConstants.add(LANGUAGE);
        apiBaseConstants.add(CHAMPION);
        return apiBaseConstants;
    }
}