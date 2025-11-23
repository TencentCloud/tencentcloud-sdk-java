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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApiSecSceneRuleEntry extends AbstractModel {

    /**
    * 匹配字段
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 匹配值
    */
    @SerializedName("Value")
    @Expose
    private String [] Value;

    /**
    * 操作符
    */
    @SerializedName("Operate")
    @Expose
    private String Operate;

    /**
    * 当匹配字段是get参数值，post参数值，cookie参数值，header参数值，rsp参数值的时候，可填充此字段
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 匹配字段 
     * @return Key 匹配字段
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 匹配字段
     * @param Key 匹配字段
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 匹配值 
     * @return Value 匹配值
     */
    public String [] getValue() {
        return this.Value;
    }

    /**
     * Set 匹配值
     * @param Value 匹配值
     */
    public void setValue(String [] Value) {
        this.Value = Value;
    }

    /**
     * Get 操作符 
     * @return Operate 操作符
     */
    public String getOperate() {
        return this.Operate;
    }

    /**
     * Set 操作符
     * @param Operate 操作符
     */
    public void setOperate(String Operate) {
        this.Operate = Operate;
    }

    /**
     * Get 当匹配字段是get参数值，post参数值，cookie参数值，header参数值，rsp参数值的时候，可填充此字段 
     * @return Name 当匹配字段是get参数值，post参数值，cookie参数值，header参数值，rsp参数值的时候，可填充此字段
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 当匹配字段是get参数值，post参数值，cookie参数值，header参数值，rsp参数值的时候，可填充此字段
     * @param Name 当匹配字段是get参数值，post参数值，cookie参数值，header参数值，rsp参数值的时候，可填充此字段
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public ApiSecSceneRuleEntry() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiSecSceneRuleEntry(ApiSecSceneRuleEntry source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String[source.Value.length];
            for (int i = 0; i < source.Value.length; i++) {
                this.Value[i] = new String(source.Value[i]);
            }
        }
        if (source.Operate != null) {
            this.Operate = new String(source.Operate);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamArraySimple(map, prefix + "Value.", this.Value);
        this.setParamSimple(map, prefix + "Operate", this.Operate);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

