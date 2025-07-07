/*
 * Copyright (c) 2018 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.tencentcloudapi.common;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * Abstract base class for all model objects in the Tencent Cloud SDK.
 * <p>This class provides utility methods for serializing to and deserializing from JSON,
 * managing customized parameters, and handling HTTP headers and requests.</p>
 */
public abstract class AbstractModel {

    /**
     * Stores HTTP headers for the request.
     */
    public Map<String, String> header = new HashMap<String, String>();

    /**
     * Flag to indicate whether to skip signing for this request. Defaults to false.
     */
    protected boolean skipSign = false;

    /**
     * Stores any custom parameters that are not part of the predefined model fields.
     * These can be added dynamically and should be serializable to JSON.
     */
    private HashMap<String, Object> customizedParams = new HashMap<String, Object>();

    /**
     * Convert an object of type O to its JSON string representation.
     *
     * @param obj The object to be serialized to JSON.
     * @param <O> The type of the object.
     * @return A JSON string representation of the object.
     */
    public static <O extends AbstractModel> String toJsonString(O obj) {
        return toJsonObject(obj).toString();
    }

    /**
     * Recursively generates a JSON object from the model object.
     * This method handles serialization for both custom parameters and regular fields.
     *
     * @param obj The object to be serialized.
     * @param <O> The type of the object.
     * @return A JSON object representation of the model.
     */
    private static <O extends AbstractModel> JsonObject toJsonObject(O obj) {
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        JsonObject joall = new JsonObject();

        // Serialize customized parameters
        JsonObject joadd = gson.toJsonTree(obj.any()).getAsJsonObject();
        for (Map.Entry<String, JsonElement> entry : joadd.entrySet()) {
            joall.add(entry.getKey(), entry.getValue());
        }

        // Serialize regular fields of the object
        JsonObject jopublic = gson.toJsonTree(obj).getAsJsonObject();
        for (Map.Entry<String, JsonElement> entry : jopublic.entrySet()) {
            Object fo = null;
            try {
                // Access each field using reflection
                Field f = obj.getClass().getDeclaredField(entry.getKey());
                f.setAccessible(true);
                fo = f.get(obj);
            } catch (Exception e) {
                // This should never happen
                e.printStackTrace();
            }
            if (fo instanceof AbstractModel) {
                // If the field is an AbstractModel, recursively serialize it
                joall.add(entry.getKey(), toJsonObject((AbstractModel) fo));
            } else {
                // Otherwise, directly add the value to the JSON object
                joall.add(entry.getKey(), entry.getValue());
            }
        }
        return joall;
    }

    /**
     * Deserialize a JSON string into an object of a subclass of AbstractModel.
     *
     * @param json The JSON string to be deserialized.
     * @param cls  The class of the target model type.
     * @param <O>  The type of the object to deserialize.
     * @return An object of type O.
     */
    public static <O> O fromJsonString(String json, Class<O> cls) {
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        return gson.fromJson(json, cls);
    }

    /**
     * Abstract method to be implemented by subclasses.
     * Used to convert the model into a map for HTTP requests.
     *
     * @param map    The map to populate with the model's parameters.
     * @param prefix A string prefix for the keys.
     */
    protected abstract void toMap(HashMap<String, String> map, String prefix);

    /**
     * Mark which parameters are binary type (for multipart requests).
     *
     * @return An array of parameter names that are binary.
     */
    protected String[] getBinaryParams() {
        return new String[0];
    }

    /**
     * Return the multipart request parameters (if any).
     *
     * @return A map of multipart parameters.
     */
    protected HashMap<String, byte[]> getMultipartRequestParams() {
        return new HashMap<String, byte[]>();
    }

    /**
     * Helper method to set a simple parameter in the map.
     * Converts the parameter name and value to a string.
     *
     * @param map   The map to put the parameter into.
     * @param key   The key for the parameter.
     * @param value The value of the parameter.
     * @param <V>   The type of the value.
     */
    protected <V> void setParamSimple(HashMap<String, String> map, String key, V value) {
        if (value != null) {
            key = key.substring(0, 1).toUpperCase() + key.substring(1);
            key = key.replace("_", ".");
            map.put(key, String.valueOf(value));
        }
    }

    /**
     * Helper method to set an array of simple parameters in the map.
     *
     * @param map    The map to put the parameters into.
     * @param prefix The prefix for each key.
     * @param array  The array of values.
     * @param <V>    The type of the values in the array.
     */
    protected <V> void setParamArraySimple(HashMap<String, String> map, String prefix, V[] array) {
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                this.setParamSimple(map, prefix + i, array[i]);
            }
        }
    }

    /**
     * Helper method to set an object parameter in the map.
     * Recursively calls toMap() for complex model objects.
     *
     * @param map    The map to put the parameter into.
     * @param prefix The prefix for the key.
     * @param obj    The object to add to the map.
     * @param <V>    The type of the object.
     */
    protected <V extends AbstractModel> void setParamObj(
            HashMap<String, String> map, String prefix, V obj) {
        if (obj != null) {
            obj.toMap(map, prefix);
        }
    }

    /**
     * Helper method to set an array of object parameters in the map.
     *
     * @param map    The map to put the parameters into.
     * @param prefix The prefix for each key.
     * @param array  The array of object values.
     * @param <V>    The type of the objects in the array.
     */
    protected <V extends AbstractModel> void setParamArrayObj(
            HashMap<String, String> map, String prefix, V[] array) {
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                this.setParamObj(map, prefix + i + ".", array[i]);
            }
        }
    }

    /**
     * Set any custom key-value pair to this model.
     *
     * @param key   The key to set.
     * @param value The value to set.
     */
    public void set(String key, Object value) {
        this.customizedParams.put(key, value);
    }

    /**
     * Get all custom key-value pairs from this model.
     *
     * @return A map of custom parameters.
     */
    public HashMap<String, Object> any() {
        return this.customizedParams;
    }

    /**
     * Get the flag indicating whether the sign should be skipped.
     *
     * @return True if the sign should be skipped; otherwise, false.
     */
    public boolean getSkipSign() {
        return skipSign;
    }

    /**
     * Set the flag indicating whether the sign should be skipped.
     *
     * @param skipSign True to skip the sign; false otherwise.
     */
    public void setSkipSign(boolean skipSign) {
        this.skipSign = skipSign;
    }

    /**
     * Get the HTTP request headers.
     *
     * @return A map of HTTP headers.
     */
    public Map<String, String> GetHeader() {
        return header;
    }

    /**
     * Set the HTTP request headers.
     *
     * @param header A map of HTTP headers to set.
     */
    public void SetHeader(Map<String, String> header) {
        this.header = header;
    }

    /**
     * Check if the model is a stream type.
     *
     * @return False, as this model is not a stream type.
     */
    public boolean isStream() {
        return false;
    }
}
