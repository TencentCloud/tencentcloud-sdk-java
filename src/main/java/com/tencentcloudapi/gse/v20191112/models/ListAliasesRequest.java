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
    * 资源过滤字段，可以按照资源名称和标签进行过滤- 资源名称过滤    - Key: 固定字符串 "resource:name"    - Values: 资源名称数组（舰队当前仅支持单个名称的过滤）- 标签过滤    - 通过标签键过滤        - Key: 固定字符串 "tag:key"        - Values 不传    - 通过标签键值过滤        - Key: 固定字符串 "tag:key-value"        - Values: 标签键值对数组，例如 ["key1:value1", "key1:value2", "key2:value2"]
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

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
     * Get 资源过滤字段，可以按照资源名称和标签进行过滤- 资源名称过滤    - Key: 固定字符串 "resource:name"    - Values: 资源名称数组（舰队当前仅支持单个名称的过滤）- 标签过滤    - 通过标签键过滤        - Key: 固定字符串 "tag:key"        - Values 不传    - 通过标签键值过滤        - Key: 固定字符串 "tag:key-value"        - Values: 标签键值对数组，例如 ["key1:value1", "key1:value2", "key2:value2"] 
     * @return Filters 资源过滤字段，可以按照资源名称和标签进行过滤- 资源名称过滤    - Key: 固定字符串 "resource:name"    - Values: 资源名称数组（舰队当前仅支持单个名称的过滤）- 标签过滤    - 通过标签键过滤        - Key: 固定字符串 "tag:key"        - Values 不传    - 通过标签键值过滤        - Key: 固定字符串 "tag:key-value"        - Values: 标签键值对数组，例如 ["key1:value1", "key1:value2", "key2:value2"]
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 资源过滤字段，可以按照资源名称和标签进行过滤- 资源名称过滤    - Key: 固定字符串 "resource:name"    - Values: 资源名称数组（舰队当前仅支持单个名称的过滤）- 标签过滤    - 通过标签键过滤        - Key: 固定字符串 "tag:key"        - Values 不传    - 通过标签键值过滤        - Key: 固定字符串 "tag:key-value"        - Values: 标签键值对数组，例如 ["key1:value1", "key1:value2", "key2:value2"]
     * @param Filters 资源过滤字段，可以按照资源名称和标签进行过滤- 资源名称过滤    - Key: 固定字符串 "resource:name"    - Values: 资源名称数组（舰队当前仅支持单个名称的过滤）- 标签过滤    - 通过标签键过滤        - Key: 固定字符串 "tag:key"        - Values 不传    - 通过标签键值过滤        - Key: 固定字符串 "tag:key-value"        - Values: 标签键值对数组，例如 ["key1:value1", "key1:value2", "key2:value2"]
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public ListAliasesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAliasesRequest(ListAliasesRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RoutingStrategyType != null) {
            this.RoutingStrategyType = new String(source.RoutingStrategyType);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderWay != null) {
            this.OrderWay = new String(source.OrderWay);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
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
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

