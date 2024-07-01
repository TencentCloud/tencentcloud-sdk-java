package com.tencentcloudapi.common;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class CommonRequest extends AbstractModel {
    private static final Gson gson = new GsonBuilder().create();
    private static final Type typeToken = new TypeToken<HashMap<String, Object>>() {
    }.getType();

    public CommonRequest(String jsonReq) {
        HashMap<String, Object> body = gson.fromJson(jsonReq, typeToken);
        for (Map.Entry<String, Object> entry : body.entrySet()) {
            set(entry.getKey(), entry.getValue());
        }
    }

    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {
        toMapFromObject(map, prefix, any());
    }

    private void toMapFromObject(HashMap<String, String> map, String prefix, Object layer) {
        if (layer == null)
            return;

        if (layer instanceof List) {
            if (!prefix.isEmpty()) {
                prefix += ".";
            }
            int i = 0;
            for (Object entry : (List) layer) {
                toMapFromObject(map, prefix + i, entry);
                i++;
            }
        } else if (layer instanceof Map) {
            if (!prefix.isEmpty()) {
                prefix += ".";
            }
            for (Map.Entry<String, Object> entry : ((Map<String, Object>) layer).entrySet()) {
                String key = entry.getKey();
                Object val = entry.getValue();
                toMapFromObject(map, prefix + key, val);
            }
        } else {
            map.put(prefix, layer.toString());
        }
    }
}