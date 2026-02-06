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

public class BotDataFilter extends AbstractModel {

    /**
    * 查询维度
    */
    @SerializedName("Entity")
    @Expose
    private String Entity;

    /**
    * 操作符
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 操作值，多个值用
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 查询维度 
     * @return Entity 查询维度
     */
    public String getEntity() {
        return this.Entity;
    }

    /**
     * Set 查询维度
     * @param Entity 查询维度
     */
    public void setEntity(String Entity) {
        this.Entity = Entity;
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
     * Get 操作值，多个值用 
     * @return Value 操作值，多个值用
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 操作值，多个值用
     * @param Value 操作值，多个值用
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public BotDataFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotDataFilter(BotDataFilter source) {
        if (source.Entity != null) {
            this.Entity = new String(source.Entity);
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
        this.setParamSimple(map, prefix + "Entity", this.Entity);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

