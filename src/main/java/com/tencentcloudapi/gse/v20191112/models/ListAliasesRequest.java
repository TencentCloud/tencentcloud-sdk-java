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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListAliasesRequest extends AbstractModel{

    /**
    * 名字，长度不小于1字符不超过1024字符
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 路由策略类型，有效值常规别名(SIMPLE)、终止别名(TERMINAL)
    */
    @SerializedName("RoutingStrategyType")
    @Expose
    private String RoutingStrategyType;

    /**
    * 要返回的最大结果数，最小值1
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移，默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 排序字段，例如CreationTime
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 排序方式，有效值asc|desc
    */
    @SerializedName("OrderWay")
    @Expose
    private String OrderWay;

    /**
     * Get 名字，长度不小于1字符不超过1024字符 
     * @return Name 名字，长度不小于1字符不超过1024字符
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名字，长度不小于1字符不超过1024字符
     * @param Name 名字，长度不小于1字符不超过1024字符
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 路由策略类型，有效值常规别名(SIMPLE)、终止别名(TERMINAL) 
     * @return RoutingStrategyType 路由策略类型，有效值常规别名(SIMPLE)、终止别名(TERMINAL)
     */
    public String getRoutingStrategyType() {
        return this.RoutingStrategyType;
    }

    /**
     * Set 路由策略类型，有效值常规别名(SIMPLE)、终止别名(TERMINAL)
     * @param RoutingStrategyType 路由策略类型，有效值常规别名(SIMPLE)、终止别名(TERMINAL)
     */
    public void setRoutingStrategyType(String RoutingStrategyType) {
        this.RoutingStrategyType = RoutingStrategyType;
    }

    /**
     * Get 要返回的最大结果数，最小值1 
     * @return Limit 要返回的最大结果数，最小值1
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 要返回的最大结果数，最小值1
     * @param Limit 要返回的最大结果数，最小值1
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移，默认0 
     * @return Offset 偏移，默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移，默认0
     * @param Offset 偏移，默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 排序字段，例如CreationTime 
     * @return OrderBy 排序字段，例如CreationTime
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序字段，例如CreationTime
     * @param OrderBy 排序字段，例如CreationTime
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 排序方式，有效值asc|desc 
     * @return OrderWay 排序方式，有效值asc|desc
     */
    public String getOrderWay() {
        return this.OrderWay;
    }

    /**
     * Set 排序方式，有效值asc|desc
     * @param OrderWay 排序方式，有效值asc|desc
     */
    public void setOrderWay(String OrderWay) {
        this.OrderWay = OrderWay;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RoutingStrategyType", this.RoutingStrategyType);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderWay", this.OrderWay);

    }
}

