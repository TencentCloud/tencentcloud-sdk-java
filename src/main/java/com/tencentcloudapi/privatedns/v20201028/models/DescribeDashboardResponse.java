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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDashboardResponse extends AbstractModel{

    /**
    * 私有域解析总数
    */
    @SerializedName("ZoneTotal")
    @Expose
    private Long ZoneTotal;

    /**
    * 私有域关联VPC数量
    */
    @SerializedName("ZoneVpcCount")
    @Expose
    private Long ZoneVpcCount;

    /**
    * 历史请求量总数
    */
    @SerializedName("RequestTotalCount")
    @Expose
    private Long RequestTotalCount;

    /**
    * 流量包用量
    */
    @SerializedName("FlowUsage")
    @Expose
    private FlowUsage [] FlowUsage;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 私有域解析总数 
     * @return ZoneTotal 私有域解析总数
     */
    public Long getZoneTotal() {
        return this.ZoneTotal;
    }

    /**
     * Set 私有域解析总数
     * @param ZoneTotal 私有域解析总数
     */
    public void setZoneTotal(Long ZoneTotal) {
        this.ZoneTotal = ZoneTotal;
    }

    /**
     * Get 私有域关联VPC数量 
     * @return ZoneVpcCount 私有域关联VPC数量
     */
    public Long getZoneVpcCount() {
        return this.ZoneVpcCount;
    }

    /**
     * Set 私有域关联VPC数量
     * @param ZoneVpcCount 私有域关联VPC数量
     */
    public void setZoneVpcCount(Long ZoneVpcCount) {
        this.ZoneVpcCount = ZoneVpcCount;
    }

    /**
     * Get 历史请求量总数 
     * @return RequestTotalCount 历史请求量总数
     */
    public Long getRequestTotalCount() {
        return this.RequestTotalCount;
    }

    /**
     * Set 历史请求量总数
     * @param RequestTotalCount 历史请求量总数
     */
    public void setRequestTotalCount(Long RequestTotalCount) {
        this.RequestTotalCount = RequestTotalCount;
    }

    /**
     * Get 流量包用量 
     * @return FlowUsage 流量包用量
     */
    public FlowUsage [] getFlowUsage() {
        return this.FlowUsage;
    }

    /**
     * Set 流量包用量
     * @param FlowUsage 流量包用量
     */
    public void setFlowUsage(FlowUsage [] FlowUsage) {
        this.FlowUsage = FlowUsage;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDashboardResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDashboardResponse(DescribeDashboardResponse source) {
        if (source.ZoneTotal != null) {
            this.ZoneTotal = new Long(source.ZoneTotal);
        }
        if (source.ZoneVpcCount != null) {
            this.ZoneVpcCount = new Long(source.ZoneVpcCount);
        }
        if (source.RequestTotalCount != null) {
            this.RequestTotalCount = new Long(source.RequestTotalCount);
        }
        if (source.FlowUsage != null) {
            this.FlowUsage = new FlowUsage[source.FlowUsage.length];
            for (int i = 0; i < source.FlowUsage.length; i++) {
                this.FlowUsage[i] = new FlowUsage(source.FlowUsage[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneTotal", this.ZoneTotal);
        this.setParamSimple(map, prefix + "ZoneVpcCount", this.ZoneVpcCount);
        this.setParamSimple(map, prefix + "RequestTotalCount", this.RequestTotalCount);
        this.setParamArrayObj(map, prefix + "FlowUsage.", this.FlowUsage);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

