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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourceInstancesRequest extends AbstractModel{

    /**
    * 资源类别id数组，13624：加固专业版，12750：企业版。空数组表示返回全部资源。
    */
    @SerializedName("Pids")
    @Expose
    private Long [] Pids;

    /**
    * 支持通过资源id，pid进行查询
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 数量限制，默认为20，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 按某个字段排序，目前支持CreateTime、ExpireTime其中的一个排序。
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 升序（asc）还是降序（desc），默认：desc。
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
     * Get 资源类别id数组，13624：加固专业版，12750：企业版。空数组表示返回全部资源。 
     * @return Pids 资源类别id数组，13624：加固专业版，12750：企业版。空数组表示返回全部资源。
     */
    public Long [] getPids() {
        return this.Pids;
    }

    /**
     * Set 资源类别id数组，13624：加固专业版，12750：企业版。空数组表示返回全部资源。
     * @param Pids 资源类别id数组，13624：加固专业版，12750：企业版。空数组表示返回全部资源。
     */
    public void setPids(Long [] Pids) {
        this.Pids = Pids;
    }

    /**
     * Get 支持通过资源id，pid进行查询 
     * @return Filters 支持通过资源id，pid进行查询
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 支持通过资源id，pid进行查询
     * @param Filters 支持通过资源id，pid进行查询
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 偏移量，默认为0 
     * @return Offset 偏移量，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0
     * @param Offset 偏移量，默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 数量限制，默认为20，最大值为100。 
     * @return Limit 数量限制，默认为20，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 数量限制，默认为20，最大值为100。
     * @param Limit 数量限制，默认为20，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 按某个字段排序，目前支持CreateTime、ExpireTime其中的一个排序。 
     * @return OrderField 按某个字段排序，目前支持CreateTime、ExpireTime其中的一个排序。
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set 按某个字段排序，目前支持CreateTime、ExpireTime其中的一个排序。
     * @param OrderField 按某个字段排序，目前支持CreateTime、ExpireTime其中的一个排序。
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get 升序（asc）还是降序（desc），默认：desc。 
     * @return OrderDirection 升序（asc）还是降序（desc），默认：desc。
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set 升序（asc）还是降序（desc），默认：desc。
     * @param OrderDirection 升序（asc）还是降序（desc），默认：desc。
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Pids.", this.Pids);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);

    }
}

