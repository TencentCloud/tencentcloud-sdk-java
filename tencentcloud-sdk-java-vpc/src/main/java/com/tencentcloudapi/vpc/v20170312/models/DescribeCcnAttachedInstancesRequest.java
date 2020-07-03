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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCcnAttachedInstancesRequest extends AbstractModel{

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤条件：
<li>ccn-id - String -（过滤条件）CCN实例ID。</li>
<li>instance-type - String -（过滤条件）关联实例类型。</li>
<li>instance-region - String -（过滤条件）关联实例所属地域。</li>
<li>instance-id - String -（过滤条件）关联实例实例ID。</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 云联网实例ID
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * 排序字段。支持：`CcnId` `InstanceType` `InstanceId` `InstanceName` `InstanceRegion` `AttachedTime` `State`。
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 排序方法。顺序：`ASC`，倒序：`DESC`。
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量 
     * @return Limit 返回数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量
     * @param Limit 返回数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤条件：
<li>ccn-id - String -（过滤条件）CCN实例ID。</li>
<li>instance-type - String -（过滤条件）关联实例类型。</li>
<li>instance-region - String -（过滤条件）关联实例所属地域。</li>
<li>instance-id - String -（过滤条件）关联实例实例ID。</li> 
     * @return Filters 过滤条件：
<li>ccn-id - String -（过滤条件）CCN实例ID。</li>
<li>instance-type - String -（过滤条件）关联实例类型。</li>
<li>instance-region - String -（过滤条件）关联实例所属地域。</li>
<li>instance-id - String -（过滤条件）关联实例实例ID。</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件：
<li>ccn-id - String -（过滤条件）CCN实例ID。</li>
<li>instance-type - String -（过滤条件）关联实例类型。</li>
<li>instance-region - String -（过滤条件）关联实例所属地域。</li>
<li>instance-id - String -（过滤条件）关联实例实例ID。</li>
     * @param Filters 过滤条件：
<li>ccn-id - String -（过滤条件）CCN实例ID。</li>
<li>instance-type - String -（过滤条件）关联实例类型。</li>
<li>instance-region - String -（过滤条件）关联实例所属地域。</li>
<li>instance-id - String -（过滤条件）关联实例实例ID。</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 云联网实例ID 
     * @return CcnId 云联网实例ID
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set 云联网实例ID
     * @param CcnId 云联网实例ID
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get 排序字段。支持：`CcnId` `InstanceType` `InstanceId` `InstanceName` `InstanceRegion` `AttachedTime` `State`。 
     * @return OrderField 排序字段。支持：`CcnId` `InstanceType` `InstanceId` `InstanceName` `InstanceRegion` `AttachedTime` `State`。
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set 排序字段。支持：`CcnId` `InstanceType` `InstanceId` `InstanceName` `InstanceRegion` `AttachedTime` `State`。
     * @param OrderField 排序字段。支持：`CcnId` `InstanceType` `InstanceId` `InstanceName` `InstanceRegion` `AttachedTime` `State`。
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get 排序方法。顺序：`ASC`，倒序：`DESC`。 
     * @return OrderDirection 排序方法。顺序：`ASC`，倒序：`DESC`。
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set 排序方法。顺序：`ASC`，倒序：`DESC`。
     * @param OrderDirection 排序方法。顺序：`ASC`，倒序：`DESC`。
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);

    }
}

