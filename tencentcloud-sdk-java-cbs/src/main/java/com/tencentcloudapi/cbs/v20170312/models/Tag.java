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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Tag extends AbstractModel{

    /**
    * 标签健。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 标签值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 标签健。 
     * @return Key 标签健。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 标签健。
     * @param Key 标签健。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 标签值。 
     * @return Value 标签值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 标签值。
     * @param Value 标签值。
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

