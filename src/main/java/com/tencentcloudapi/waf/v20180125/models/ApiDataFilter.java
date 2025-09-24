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

public class ApiDataFilter extends AbstractModel {

    /**
    * 数据标签，是否活跃，功能场景
    */
    @SerializedName("Entity")
    @Expose
    private String Entity;

    /**
    * 等于
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 日期，手机号，邮箱等
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 风险等级
    */
    @SerializedName("ValueList")
    @Expose
    private String [] ValueList;

    /**
     * Get 数据标签，是否活跃，功能场景 
     * @return Entity 数据标签，是否活跃，功能场景
     */
    public String getEntity() {
        return this.Entity;
    }

    /**
     * Set 数据标签，是否活跃，功能场景
     * @param Entity 数据标签，是否活跃，功能场景
     */
    public void setEntity(String Entity) {
        this.Entity = Entity;
    }

    /**
     * Get 等于 
     * @return Operator 等于
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 等于
     * @param Operator 等于
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 日期，手机号，邮箱等 
     * @return Value 日期，手机号，邮箱等
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 日期，手机号，邮箱等
     * @param Value 日期，手机号，邮箱等
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 风险等级 
     * @return ValueList 风险等级
     */
    public String [] getValueList() {
        return this.ValueList;
    }

    /**
     * Set 风险等级
     * @param ValueList 风险等级
     */
    public void setValueList(String [] ValueList) {
        this.ValueList = ValueList;
    }

    public ApiDataFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiDataFilter(ApiDataFilter source) {
        if (source.Entity != null) {
            this.Entity = new String(source.Entity);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.ValueList != null) {
            this.ValueList = new String[source.ValueList.length];
            for (int i = 0; i < source.ValueList.length; i++) {
                this.ValueList[i] = new String(source.ValueList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Entity", this.Entity);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamArraySimple(map, prefix + "ValueList.", this.ValueList);

    }
}

