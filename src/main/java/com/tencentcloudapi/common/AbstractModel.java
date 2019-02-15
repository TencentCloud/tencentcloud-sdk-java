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

import java.util.HashMap;

/**
 * 抽象model类
 */
abstract public class AbstractModel {
	
	protected abstract void toMap(HashMap<String, String> map, String prefix);
	
	/*
	 * valid only when its a request object.
	 * some actions can only be posted in multipart format,
	 * this method is used to mark which parameters are binary type.
	 */
	protected String [] getBinaryParams() {
	    return new String[0];
	}

    protected <V> void setParamSimple(HashMap<String, String> map, String key, V value) {
    	if (value != null) {
    		
	        key = key.substring(0, 1).toUpperCase() + key.substring(1);
	        key = key.replace("_", ".");
	        map.put(key, String.valueOf(value));
    	}
    }
    
    protected <V> void setParamArraySimple(HashMap<String, String> map, String prefix, V [] array) {
    	if (array != null) {
            for (int i = 0; i < array.length; i++) {
                this.setParamSimple(map, prefix + i, array[i]);
            }   
    	}
    }
    
    protected <V extends AbstractModel> void setParamObj(HashMap<String, String> map, String prefix, V obj) {
    	if (obj != null) {
    		obj.toMap(map, prefix);
    	}
    }
    
    protected <V extends AbstractModel> void setParamArrayObj(HashMap<String, String> map, String prefix, V [] array) {
    	if (array != null) {
            for (int i = 0; i < array.length; i++) {
                this.setParamObj(map, prefix + i + ".", array[i]);
            }
    	}
    }
    
    /**
     * 序列化函数，将对象数据转化为json格式的string
     * @param obj 集成自AbstractModel的子类实例
     * @return json格式的string
     */
    public static <O extends AbstractModel> String toJsonString (O obj) {
    	Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
    	return gson.toJson(obj);
    }
    
    /**
     * 序列化函数，根据传入的json格式的string实例化一个cls对象返回
     * @param json  json格式的string
     * @param cls	与json匹配的类对象
     * @return		cls的实例
     */
    public static <O> O fromJsonString (String json, Class<O> cls) {
    	Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
    	return gson.fromJson(json, cls);
    	
    }
}

