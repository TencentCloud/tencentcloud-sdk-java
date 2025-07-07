/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SettingDetail extends AbstractModel {

    /**
    * 配置key
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 配置当前值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 配置处理建议
    */
    @SerializedName("Advise")
    @Expose
    private String Advise;

    /**
     * Get 配置key 
     * @return Key 配置key
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 配置key
     * @param Key 配置key
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 配置当前值 
     * @return Value 配置当前值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 配置当前值
     * @param Value 配置当前值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 配置处理建议 
     * @return Advise 配置处理建议
     */
    public String getAdvise() {
        return this.Advise;
    }

    /**
     * Set 配置处理建议
     * @param Advise 配置处理建议
     */
    public void setAdvise(String Advise) {
        this.Advise = Advise;
    }

    public SettingDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SettingDetail(SettingDetail source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Advise != null) {
            this.Advise = new String(source.Advise);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Advise", this.Advise);

    }
}

