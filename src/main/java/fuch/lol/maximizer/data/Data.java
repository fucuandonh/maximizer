package fuch.lol.maximizer.data;

import java.util.HashSet;
import java.util.Set;

import org.json.JSONObject;

import fuch.lol.maximizer.data.api.ApiConsumer;
import fuch.lol.maximizer.data.builder.UrlBuilder;
import fuch.lol.maximizer.data.util.Constants;
import fuch.lol.maximizer.data.util.JsonUtil;

public class Data {
    private static JSONObject getDataFromApiUrl(String apiUrl) {
        return JsonUtil.getNode(ApiConsumer.getResponse(apiUrl), Constants.DATA_NODE);
    }

    private static Set<String> getChampionsNames() {
        return getDataFromApiUrl(UrlBuilder.getApiUrl()).keySet();
    }

    private static JSONObject getChampionData(String championName) {
        return getDataFromApiUrl(UrlBuilder.getApiUrl(championName));
        
    }
    public static Set<JSONObject> getChampionsData() {
        Set<JSONObject> championsData = new HashSet<>();
        for (String championName : getChampionsNames()) {
            championsData.add(getChampionData(championName).getJSONObject(championName));
        }
        return championsData;
    }
}