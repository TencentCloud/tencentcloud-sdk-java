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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourceInstancesRequest extends AbstractModel {

    /**
    * 支持CreateTime、ExpireTime、AppName、AppPkgName、BindValue、IsBind过滤
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
    * 资源类别id数组，13624：加固专业版，12750：企业版。空数组表示返回全部资源。
    */
    @SerializedName("Pids")
    @Expose
    private Long [] Pids;

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
     * Get 支持CreateTime、ExpireTime、AppName、AppPkgName、BindValue、IsBind过滤 
     * @return Filters 支持CreateTime、ExpireTime、AppName、AppPkgName、BindValue、IsBind过滤
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 支持CreateTime、ExpireTime、AppName、AppPkgName、BindValue、IsBind过滤
     * @param Filters 支持CreateTime、ExpireTime、AppName、AppPkgName、BindValue、IsBind过滤
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

    public DescribeResourceInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourceInstancesRequest(DescribeResourceInstancesRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Pids != null) {
            this.Pids = new Long[source.Pids.length];
            for (int i = 0; i < source.Pids.length; i++) {
                this.Pids[i] = new Long(source.Pids[i]);
            }
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.OrderDirection != null) {
            this.OrderDirection = new String(source.OrderDirection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "Pids.", this.Pids);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);

    }
}

