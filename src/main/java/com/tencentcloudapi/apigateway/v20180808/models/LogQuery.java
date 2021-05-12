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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogQuery extends AbstractModel{

    /**
    * 检索字段
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 操作符
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 检索值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 检索字段 
     * @return Name 检索字段
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 检索字段
     * @param Name 检索字段
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 操作符 
     * @return Operator 操作符
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作符
     * @param Operator 操作符
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 检索值 
     * @return Value 检索值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 检索值
     * @param Value 检索值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public LogQuery() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogQuery(LogQuery source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

