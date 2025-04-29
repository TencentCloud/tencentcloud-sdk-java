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
package com.tencentcloudapi.dc.v20180410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDirectConnectsRequest extends AbstractModel {

    /**
    * 过滤条件。direct-connect-id：物理专线ID，states：物理专线状态（AVAILABLE-就绪，PENDING-申请中，REJECTED-申请被拒绝，PENDINGPAY-待付款，PAID-付款完成，BUILDING-建设中，STOPED-建设终止，DELETED-删除完成）。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 物理专线 ID数组。
    */
    @SerializedName("DirectConnectIds")
    @Expose
    private String [] DirectConnectIds;

    /**
    * 偏移量，默认为0。
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
     * Get 过滤条件。direct-connect-id：物理专线ID，states：物理专线状态（AVAILABLE-就绪，PENDING-申请中，REJECTED-申请被拒绝，PENDINGPAY-待付款，PAID-付款完成，BUILDING-建设中，STOPED-建设终止，DELETED-删除完成）。 
     * @return Filters 过滤条件。direct-connect-id：物理专线ID，states：物理专线状态（AVAILABLE-就绪，PENDING-申请中，REJECTED-申请被拒绝，PENDINGPAY-待付款，PAID-付款完成，BUILDING-建设中，STOPED-建设终止，DELETED-删除完成）。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。direct-connect-id：物理专线ID，states：物理专线状态（AVAILABLE-就绪，PENDING-申请中，REJECTED-申请被拒绝，PENDINGPAY-待付款，PAID-付款完成，BUILDING-建设中，STOPED-建设终止，DELETED-删除完成）。
     * @param Filters 过滤条件。direct-connect-id：物理专线ID，states：物理专线状态（AVAILABLE-就绪，PENDING-申请中，REJECTED-申请被拒绝，PENDINGPAY-待付款，PAID-付款完成，BUILDING-建设中，STOPED-建设终止，DELETED-删除完成）。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 物理专线 ID数组。 
     * @return DirectConnectIds 物理专线 ID数组。
     */
    public String [] getDirectConnectIds() {
        return this.DirectConnectIds;
    }

    /**
     * Set 物理专线 ID数组。
     * @param DirectConnectIds 物理专线 ID数组。
     */
    public void setDirectConnectIds(String [] DirectConnectIds) {
        this.DirectConnectIds = DirectConnectIds;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
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

    public DescribeDirectConnectsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDirectConnectsRequest(DescribeDirectConnectsRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.DirectConnectIds != null) {
            this.DirectConnectIds = new String[source.DirectConnectIds.length];
            for (int i = 0; i < source.DirectConnectIds.length; i++) {
                this.DirectConnectIds[i] = new String(source.DirectConnectIds[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "DirectConnectIds.", this.DirectConnectIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

