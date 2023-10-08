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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeReservedInstancesRequest extends AbstractModel{

    /**
    * 偏移量，默认0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为20，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * status
按照**【状态**】进行过滤。状态：Creating、Active、Expired、Refunded。
类型：String
必选：否

resource-type
按照**【资源类型**】进行过滤。资源类型：common、amd、v100、t4、a10\*gnv4、a10\*gnv4v等，common表示通用类型。
类型：String
必选：否

cpu
按照**【核数**】进行过滤。
类型：String
必选：否

memory
按照**【内存**】进行过滤。
类型：String
必选：否

gpu
按照**【GPU卡数**】进行过滤，取值有0.25、0.5、1、2、4等。
类型：String
必选：否

cluster-id
按照**【集群ID**】进行过滤。
类型：String
必选：否

node-name
按照**【节点名称**】进行过滤。
类型：String
必选：否

scope
按照**【可用区**】进行过滤。比如：ap-guangzhou-2，为空字符串表示地域抵扣范围。如果只过滤可用区抵扣范围，需要同时将cluster-id、node-name设置为空字符串。
类型：String
必选：否

reserved-instance-id
按照**【预留实例ID**】进行过滤。预留实例ID形如：eksri-xxxxxxxx。
类型：String
必选：否

reserved-instance-name
按照**【预留实例名称**】进行过滤。
类型：String
必选：否

reserved-instance-deduct
按照**【上个周期抵扣的预留券**】进行过滤。Values可不设置。
必选：否

reserved-instance-not-deduct
按照**【上个周期未抵扣的预留券**】进行过滤。Values可不设置。
必选：否
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 排序字段。支持CreatedAt、ActiveAt、ExpireAt。默认值CreatedAt。
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 排序方法。顺序：ASC，倒序：DESC。默认值DESC。
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
     * Get 偏移量，默认0。 
     * @return Offset 偏移量，默认0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认0。
     * @param Offset 偏移量，默认0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为20，最大值为100。 
     * @return Limit 返回数量，默认为20，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。
     * @param Limit 返回数量，默认为20，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get status
按照**【状态**】进行过滤。状态：Creating、Active、Expired、Refunded。
类型：String
必选：否

resource-type
按照**【资源类型**】进行过滤。资源类型：common、amd、v100、t4、a10\*gnv4、a10\*gnv4v等，common表示通用类型。
类型：String
必选：否

cpu
按照**【核数**】进行过滤。
类型：String
必选：否

memory
按照**【内存**】进行过滤。
类型：String
必选：否

gpu
按照**【GPU卡数**】进行过滤，取值有0.25、0.5、1、2、4等。
类型：String
必选：否

cluster-id
按照**【集群ID**】进行过滤。
类型：String
必选：否

node-name
按照**【节点名称**】进行过滤。
类型：String
必选：否

scope
按照**【可用区**】进行过滤。比如：ap-guangzhou-2，为空字符串表示地域抵扣范围。如果只过滤可用区抵扣范围，需要同时将cluster-id、node-name设置为空字符串。
类型：String
必选：否

reserved-instance-id
按照**【预留实例ID**】进行过滤。预留实例ID形如：eksri-xxxxxxxx。
类型：String
必选：否

reserved-instance-name
按照**【预留实例名称**】进行过滤。
类型：String
必选：否

reserved-instance-deduct
按照**【上个周期抵扣的预留券**】进行过滤。Values可不设置。
必选：否

reserved-instance-not-deduct
按照**【上个周期未抵扣的预留券**】进行过滤。Values可不设置。
必选：否 
     * @return Filters status
按照**【状态**】进行过滤。状态：Creating、Active、Expired、Refunded。
类型：String
必选：否

resource-type
按照**【资源类型**】进行过滤。资源类型：common、amd、v100、t4、a10\*gnv4、a10\*gnv4v等，common表示通用类型。
类型：String
必选：否

cpu
按照**【核数**】进行过滤。
类型：String
必选：否

memory
按照**【内存**】进行过滤。
类型：String
必选：否

gpu
按照**【GPU卡数**】进行过滤，取值有0.25、0.5、1、2、4等。
类型：String
必选：否

cluster-id
按照**【集群ID**】进行过滤。
类型：String
必选：否

node-name
按照**【节点名称**】进行过滤。
类型：String
必选：否

scope
按照**【可用区**】进行过滤。比如：ap-guangzhou-2，为空字符串表示地域抵扣范围。如果只过滤可用区抵扣范围，需要同时将cluster-id、node-name设置为空字符串。
类型：String
必选：否

reserved-instance-id
按照**【预留实例ID**】进行过滤。预留实例ID形如：eksri-xxxxxxxx。
类型：String
必选：否

reserved-instance-name
按照**【预留实例名称**】进行过滤。
类型：String
必选：否

reserved-instance-deduct
按照**【上个周期抵扣的预留券**】进行过滤。Values可不设置。
必选：否

reserved-instance-not-deduct
按照**【上个周期未抵扣的预留券**】进行过滤。Values可不设置。
必选：否
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set status
按照**【状态**】进行过滤。状态：Creating、Active、Expired、Refunded。
类型：String
必选：否

resource-type
按照**【资源类型**】进行过滤。资源类型：common、amd、v100、t4、a10\*gnv4、a10\*gnv4v等，common表示通用类型。
类型：String
必选：否

cpu
按照**【核数**】进行过滤。
类型：String
必选：否

memory
按照**【内存**】进行过滤。
类型：String
必选：否

gpu
按照**【GPU卡数**】进行过滤，取值有0.25、0.5、1、2、4等。
类型：String
必选：否

cluster-id
按照**【集群ID**】进行过滤。
类型：String
必选：否

node-name
按照**【节点名称**】进行过滤。
类型：String
必选：否

scope
按照**【可用区**】进行过滤。比如：ap-guangzhou-2，为空字符串表示地域抵扣范围。如果只过滤可用区抵扣范围，需要同时将cluster-id、node-name设置为空字符串。
类型：String
必选：否

reserved-instance-id
按照**【预留实例ID**】进行过滤。预留实例ID形如：eksri-xxxxxxxx。
类型：String
必选：否

reserved-instance-name
按照**【预留实例名称**】进行过滤。
类型：String
必选：否

reserved-instance-deduct
按照**【上个周期抵扣的预留券**】进行过滤。Values可不设置。
必选：否

reserved-instance-not-deduct
按照**【上个周期未抵扣的预留券**】进行过滤。Values可不设置。
必选：否
     * @param Filters status
按照**【状态**】进行过滤。状态：Creating、Active、Expired、Refunded。
类型：String
必选：否

resource-type
按照**【资源类型**】进行过滤。资源类型：common、amd、v100、t4、a10\*gnv4、a10\*gnv4v等，common表示通用类型。
类型：String
必选：否

cpu
按照**【核数**】进行过滤。
类型：String
必选：否

memory
按照**【内存**】进行过滤。
类型：String
必选：否

gpu
按照**【GPU卡数**】进行过滤，取值有0.25、0.5、1、2、4等。
类型：String
必选：否

cluster-id
按照**【集群ID**】进行过滤。
类型：String
必选：否

node-name
按照**【节点名称**】进行过滤。
类型：String
必选：否

scope
按照**【可用区**】进行过滤。比如：ap-guangzhou-2，为空字符串表示地域抵扣范围。如果只过滤可用区抵扣范围，需要同时将cluster-id、node-name设置为空字符串。
类型：String
必选：否

reserved-instance-id
按照**【预留实例ID**】进行过滤。预留实例ID形如：eksri-xxxxxxxx。
类型：String
必选：否

reserved-instance-name
按照**【预留实例名称**】进行过滤。
类型：String
必选：否

reserved-instance-deduct
按照**【上个周期抵扣的预留券**】进行过滤。Values可不设置。
必选：否

reserved-instance-not-deduct
按照**【上个周期未抵扣的预留券**】进行过滤。Values可不设置。
必选：否
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序字段。支持CreatedAt、ActiveAt、ExpireAt。默认值CreatedAt。 
     * @return OrderField 排序字段。支持CreatedAt、ActiveAt、ExpireAt。默认值CreatedAt。
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set 排序字段。支持CreatedAt、ActiveAt、ExpireAt。默认值CreatedAt。
     * @param OrderField 排序字段。支持CreatedAt、ActiveAt、ExpireAt。默认值CreatedAt。
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get 排序方法。顺序：ASC，倒序：DESC。默认值DESC。 
     * @return OrderDirection 排序方法。顺序：ASC，倒序：DESC。默认值DESC。
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set 排序方法。顺序：ASC，倒序：DESC。默认值DESC。
     * @param OrderDirection 排序方法。顺序：ASC，倒序：DESC。默认值DESC。
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    public DescribeReservedInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReservedInstancesRequest(DescribeReservedInstancesRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
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
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);

    }
}

