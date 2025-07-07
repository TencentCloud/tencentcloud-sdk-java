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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogFilterInfo extends AbstractModel {

    /**
    * 字段名
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 比较符号
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 字段值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 字段名 
     * @return Key 字段名
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 字段名
     * @param Key 字段名
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 比较符号 
     * @return Operator 比较符号
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 比较符号
     * @param Operator 比较符号
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 字段值 
     * @return Value 字段值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 字段值
     * @param Value 字段值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public LogFilterInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogFilterInfo(LogFilterInfo source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
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
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

