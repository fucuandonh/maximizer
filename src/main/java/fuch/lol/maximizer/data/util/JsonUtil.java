package fuch.lol.maximizer.data.util;

import org.json.JSONObject;

public class JsonUtil {
    public static JSONObject getNode(JSONObject json, String key) {
        return json.getJSONObject(key);
    }
}