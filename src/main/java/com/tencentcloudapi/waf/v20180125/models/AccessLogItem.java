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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessLogItem extends AbstractModel {

    /**
    * 日记Key
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 日志Value
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 日记Key 
     * @return Key 日记Key
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 日记Key
     * @param Key 日记Key
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 日志Value 
     * @return Value 日志Value
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 日志Value
     * @param Value 日志Value
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public AccessLogItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessLogItem(AccessLogItem source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

