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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MidQueryCondition extends AbstractModel{

    /**
    * 维度
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 操作符，支持等于(eq)、不等于(ne)，以及in
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 维度值，当Op是eq、ne时，只使用第一个元素
    */
    @SerializedName("Value")
    @Expose
    private String [] Value;

    /**
     * Get 维度 
     * @return Key 维度
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 维度
     * @param Key 维度
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 操作符，支持等于(eq)、不等于(ne)，以及in 
     * @return Operator 操作符，支持等于(eq)、不等于(ne)，以及in
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作符，支持等于(eq)、不等于(ne)，以及in
     * @param Operator 操作符，支持等于(eq)、不等于(ne)，以及in
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 维度值，当Op是eq、ne时，只使用第一个元素 
     * @return Value 维度值，当Op是eq、ne时，只使用第一个元素
     */
    public String [] getValue() {
        return this.Value;
    }

    /**
     * Set 维度值，当Op是eq、ne时，只使用第一个元素
     * @param Value 维度值，当Op是eq、ne时，只使用第一个元素
     */
    public void setValue(String [] Value) {
        this.Value = Value;
    }

    public MidQueryCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MidQueryCondition(MidQueryCondition source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Value != null) {
            this.Value = new String[source.Value.length];
            for (int i = 0; i < source.Value.length; i++) {
                this.Value[i] = new String(source.Value[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamArraySimple(map, prefix + "Value.", this.Value);

    }
}

