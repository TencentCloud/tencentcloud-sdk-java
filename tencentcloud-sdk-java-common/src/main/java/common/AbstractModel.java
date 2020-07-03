/*
 * Copyright (c) 2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public abstract class AbstractModel {
  /**
   * Any stores customized parameters which are not documented. You should make sure it can be
   * correctly serialized to json string.
   */
  private HashMap<String, Object> customizedParams = new HashMap<String, Object>();

  protected abstract void toMap(HashMap<String, String> map, String prefix);

  /**
   * Valid only when it's a request object.
   * Some actions can only be posted in multipart format,
   * this method is used to mark which parameters are binary type.
   */
  protected String[] getBinaryParams() {
    return new String[0];
  }

  /**
   * Valid only when it's a multipart request object.
   */
  protected HashMap<String, byte[]> getMultipartRequestParams() {
    return new HashMap<String, byte[]>();
  }

  protected <V> void setParamSimple(HashMap<String, String> map, String key, V value) {
    if (value != null) {

      key = key.substring(0, 1).toUpperCase() + key.substring(1);
      key = key.replace("_", ".");
      map.put(key, String.valueOf(value));
    }
  }

  protected <V> void setParamArraySimple(HashMap<String, String> map, String prefix, V[] array) {
    if (array != null) {
      for (int i = 0; i < array.length; i++) {
        this.setParamSimple(map, prefix + i, array[i]);
      }
    }
  }

  protected <V extends AbstractModel> void setParamObj(
      HashMap<String, String> map, String prefix, V obj) {
    if (obj != null) {
      obj.toMap(map, prefix);
    }
  }

  protected <V extends AbstractModel> void setParamArrayObj(
      HashMap<String, String> map, String prefix, V[] array) {
    if (array != null) {
      for (int i = 0; i < array.length; i++) {
        this.setParamObj(map, prefix + i + ".", array[i]);
      }
    }
  }

  public static <O extends AbstractModel> String toJsonString(O obj) {
    return toJsonObject(obj).toString();
  }

  /**
   * Recursively generate obj's JSON object. Even if obj.any() is empty, this recursive progress
   * cannot be skipped because customized additional parameter might be hidden in lower data
   * structure.
   *
   * @param obj
   * @return
   */
  private static <O extends AbstractModel> JsonObject toJsonObject(O obj) {
    Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
    JsonObject joall = new JsonObject();
    JsonObject joadd = gson.toJsonTree(obj.any()).getAsJsonObject();
    for (Map.Entry<String, JsonElement> entry : joadd.entrySet()) {
      joall.add(entry.getKey(), entry.getValue());
    }
    // jopublic will override joadd if key conflict exists
    JsonObject jopublic = gson.toJsonTree(obj).getAsJsonObject();
    for (Map.Entry<String, JsonElement> entry : jopublic.entrySet()) {
      Object fo = null;
      try {
        Field f = obj.getClass().getDeclaredField(entry.getKey());
        f.setAccessible(true);
        fo = f.get(obj);
      } catch (Exception e) {
        // this should never happen
        e.printStackTrace();
      }
      if (fo instanceof AbstractModel) {
        joall.add(entry.getKey(), toJsonObject((AbstractModel) fo));
      } else {
        joall.add(entry.getKey(), entry.getValue());
      }
    }
    return joall;
  }

  /**
   * Deserialize a JSON string into an object of the Class inherited from AbstractModel.
   *
   * @param json JSON formatted string.
   * @param cls A class which inherited from AbstractModel.
   * @return An object of cls.
   */
  public static <O> O fromJsonString(String json, Class<O> cls) {
    Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
    return gson.fromJson(json, cls);
  }

  /**
   * Set any key value pair to this model.
   *
   * @param key
   * @param value
   */
  public void set(String key, Object value) {
    this.customizedParams.put(key, value);
  }

  /**
   * Get customized key value pairs from this model.
   *
   * @return
   */
  public HashMap<String, Object> any() {
    return this.customizedParams;
  }
}
