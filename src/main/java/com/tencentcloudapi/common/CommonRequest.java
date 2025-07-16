package com.tencentcloudapi.common;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.ToNumberPolicy;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class CommonRequest extends AbstractModel {

    // Gson instance for JSON processing
    private static final Gson gson =
            new GsonBuilder().setObjectToNumberStrategy(ToNumberPolicy.LONG_OR_DOUBLE).create();

    // Type token to specify the type for Gson deserialization (HashMap<String, Object>)
    private static final Type typeToken = new TypeToken<HashMap<String, Object>>() {
    }.getType();

    /**
     * Constructor that initializes the CommonRequest object from a JSON string.
     * It deserializes the JSON string into a HashMap and sets the corresponding fields.
     *
     * @param jsonReq The JSON string representing the request body.
     */
    public CommonRequest(String jsonReq) {
        // Deserialize the JSON request string into a HashMap
        HashMap<String, Object> body = gson.fromJson(jsonReq, typeToken);

        // Set the fields of the object from the HashMap entries
        for (Map.Entry<String, Object> entry : body.entrySet()) {
            set(entry.getKey(), entry.getValue());
        }
    }

    /**
     * Converts the fields of this object into a map representation.
     * This map can then be used for API requests or other purposes.
     *
     * @param map    The map to store the key-value pairs.
     * @param prefix The prefix to be added to each key in the map.
     */
    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {
        // Convert the object fields into the map
        toMapFromObject(map, prefix, any());
    }

    /**
     * Recursively converts an object (which may contain nested lists or maps) to a map.
     *
     * @param map    The map to store the converted values.
     * @param prefix The prefix for the map keys.
     * @param layer  The current layer of the object to convert.
     */
    private void toMapFromObject(HashMap<String, String> map, String prefix, Object layer) {
        if (layer == null)
            return;

        // If the current layer is a list, process each element
        if (layer instanceof List) {
            if (!prefix.isEmpty()) {
                prefix += ".";
            }
            int i = 0;
            for (Object entry : (List) layer) {
                // Recursively process each element in the list
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
                // Recursively process each key-value pair in the map
                toMapFromObject(map, prefix + key, val);
            }
        } else {
            map.put(prefix, layer.toString());
        }
    }
}
