package org.example.Adapter_Pattern;

import org.json.JSONObject;
import org.json.XML;

public class Adapter implements Target {

    @Override
    public String convert(String data) {
        try {
            // Kiểm tra nếu đầu vào là JSON, chuyển sang XML
            if (data.trim().startsWith("{")) {
                JSONObject jsonObject = new JSONObject(data);
                return XML.toString(jsonObject);
            }
            // Ngược lại, nếu đầu vào là XML, chuyển về JSON
            else {
                JSONObject jsonObject = XML.toJSONObject(data);
                return jsonObject.toString(4); // Format JSON với indent 4
            }
        } catch (Exception e) {
            return "Lỗi chuyển đổi: " + e.getMessage();
        }
    }
}
