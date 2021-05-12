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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScdnEventLogConditions extends AbstractModel{

    /**
    * 匹配关键字，ip, attack_location
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 逻辑操作符，取值 exclude, include
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 匹配值，允许使用通配符(*)查询，匹配零个、单个、多个字符，例如 1.2.*
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 匹配关键字，ip, attack_location 
     * @return Key 匹配关键字，ip, attack_location
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 匹配关键字，ip, attack_location
     * @param Key 匹配关键字，ip, attack_location
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 逻辑操作符，取值 exclude, include 
     * @return Operator 逻辑操作符，取值 exclude, include
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 逻辑操作符，取值 exclude, include
     * @param Operator 逻辑操作符，取值 exclude, include
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 匹配值，允许使用通配符(*)查询，匹配零个、单个、多个字符，例如 1.2.* 
     * @return Value 匹配值，允许使用通配符(*)查询，匹配零个、单个、多个字符，例如 1.2.*
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 匹配值，允许使用通配符(*)查询，匹配零个、单个、多个字符，例如 1.2.*
     * @param Value 匹配值，允许使用通配符(*)查询，匹配零个、单个、多个字符，例如 1.2.*
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public ScdnEventLogConditions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScdnEventLogConditions(ScdnEventLogConditions source) {
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

