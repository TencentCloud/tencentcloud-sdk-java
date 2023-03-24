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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogFilter extends AbstractModel{

    /**
    * 过滤字段名称
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 运算符，全等 eq，不等 neq，相似 like，排除相似 not like,  小于 lt，小于且等于 lte，大于 gt，大于且等于 gte，在范围内 range，不在范围内 norange
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 过滤值,范围运算需要同时输入两个值，以英文逗号分隔

    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 该层级filters逻辑关系，取值 "AND" 或 "OR"
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * LogFilters数组
    */
    @SerializedName("Filters")
    @Expose
    private LogFilters [] Filters;

    /**
     * Get 过滤字段名称 
     * @return Key 过滤字段名称
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 过滤字段名称
     * @param Key 过滤字段名称
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 运算符，全等 eq，不等 neq，相似 like，排除相似 not like,  小于 lt，小于且等于 lte，大于 gt，大于且等于 gte，在范围内 range，不在范围内 norange 
     * @return Operator 运算符，全等 eq，不等 neq，相似 like，排除相似 not like,  小于 lt，小于且等于 lte，大于 gt，大于且等于 gte，在范围内 range，不在范围内 norange
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 运算符，全等 eq，不等 neq，相似 like，排除相似 not like,  小于 lt，小于且等于 lte，大于 gt，大于且等于 gte，在范围内 range，不在范围内 norange
     * @param Operator 运算符，全等 eq，不等 neq，相似 like，排除相似 not like,  小于 lt，小于且等于 lte，大于 gt，大于且等于 gte，在范围内 range，不在范围内 norange
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 过滤值,范围运算需要同时输入两个值，以英文逗号分隔
 
     * @return Value 过滤值,范围运算需要同时输入两个值，以英文逗号分隔

     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 过滤值,范围运算需要同时输入两个值，以英文逗号分隔

     * @param Value 过滤值,范围运算需要同时输入两个值，以英文逗号分隔

     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 该层级filters逻辑关系，取值 "AND" 或 "OR" 
     * @return Type 该层级filters逻辑关系，取值 "AND" 或 "OR"
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 该层级filters逻辑关系，取值 "AND" 或 "OR"
     * @param Type 该层级filters逻辑关系，取值 "AND" 或 "OR"
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get LogFilters数组 
     * @return Filters LogFilters数组
     */
    public LogFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set LogFilters数组
     * @param Filters LogFilters数组
     */
    public void setFilters(LogFilters [] Filters) {
        this.Filters = Filters;
    }

    public LogFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogFilter(LogFilter source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Filters != null) {
            this.Filters = new LogFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new LogFilters(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

