/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Tag extends AbstractModel{

    /**
    * 云标签的key
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 云标签的值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 云标签的key 
     * @return Key 云标签的key
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 云标签的key
     * @param Key 云标签的key
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 云标签的值 
     * @return Value 云标签的值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 云标签的值
     * @param Value 云标签的值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

