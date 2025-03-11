package org.example.Adapter_Pattern;

import org.json.JSONObject;

public class JSONData {
    private String jsonData;

    public JSONData(String jsonData) {
        this.jsonData = jsonData;
    }

    public String getJsonData() {
        return jsonData;
    }

    public JSONObject toJSONObject() {
        return new JSONObject(jsonData);
    }
}
