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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDedicatedClusterOrdersRequest extends AbstractModel{

    /**
    * 按照专用集群id过滤
    */
    @SerializedName("DedicatedClusterIds")
    @Expose
    private String [] DedicatedClusterIds;

    /**
    * 按照专用集群订单id过滤
    */
    @SerializedName("DedicatedClusterOrderIds")
    @Expose
    private String DedicatedClusterOrderIds;

    /**
    * 偏移量，默认为0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 订单状态为过滤条件：PENDING INCONSTRUCTION DELIVERING DELIVERED EXPIRED CANCELLED  OFFLINE
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 订单类型为过滤条件：CREATE  EXTEND
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
     * Get 按照专用集群id过滤 
     * @return DedicatedClusterIds 按照专用集群id过滤
     */
    public String [] getDedicatedClusterIds() {
        return this.DedicatedClusterIds;
    }

    /**
     * Set 按照专用集群id过滤
     * @param DedicatedClusterIds 按照专用集群id过滤
     */
    public void setDedicatedClusterIds(String [] DedicatedClusterIds) {
        this.DedicatedClusterIds = DedicatedClusterIds;
    }

    /**
     * Get 按照专用集群订单id过滤 
     * @return DedicatedClusterOrderIds 按照专用集群订单id过滤
     */
    public String getDedicatedClusterOrderIds() {
        return this.DedicatedClusterOrderIds;
    }

    /**
     * Set 按照专用集群订单id过滤
     * @param DedicatedClusterOrderIds 按照专用集群订单id过滤
     */
    public void setDedicatedClusterOrderIds(String DedicatedClusterOrderIds) {
        this.DedicatedClusterOrderIds = DedicatedClusterOrderIds;
    }

    /**
     * Get 偏移量，默认为0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。 
     * @return Offset 偏移量，默认为0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     * @param Offset 偏移量，默认为0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。 
     * @return Limit 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     * @param Limit 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 订单状态为过滤条件：PENDING INCONSTRUCTION DELIVERING DELIVERED EXPIRED CANCELLED  OFFLINE 
     * @return Status 订单状态为过滤条件：PENDING INCONSTRUCTION DELIVERING DELIVERED EXPIRED CANCELLED  OFFLINE
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 订单状态为过滤条件：PENDING INCONSTRUCTION DELIVERING DELIVERED EXPIRED CANCELLED  OFFLINE
     * @param Status 订单状态为过滤条件：PENDING INCONSTRUCTION DELIVERING DELIVERED EXPIRED CANCELLED  OFFLINE
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 订单类型为过滤条件：CREATE  EXTEND 
     * @return ActionType 订单类型为过滤条件：CREATE  EXTEND
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set 订单类型为过滤条件：CREATE  EXTEND
     * @param ActionType 订单类型为过滤条件：CREATE  EXTEND
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    public DescribeDedicatedClusterOrdersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDedicatedClusterOrdersRequest(DescribeDedicatedClusterOrdersRequest source) {
        if (source.DedicatedClusterIds != null) {
            this.DedicatedClusterIds = new String[source.DedicatedClusterIds.length];
            for (int i = 0; i < source.DedicatedClusterIds.length; i++) {
                this.DedicatedClusterIds[i] = new String(source.DedicatedClusterIds[i]);
            }
        }
        if (source.DedicatedClusterOrderIds != null) {
            this.DedicatedClusterOrderIds = new String(source.DedicatedClusterOrderIds);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DedicatedClusterIds.", this.DedicatedClusterIds);
        this.setParamSimple(map, prefix + "DedicatedClusterOrderIds", this.DedicatedClusterOrderIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);

    }
}

