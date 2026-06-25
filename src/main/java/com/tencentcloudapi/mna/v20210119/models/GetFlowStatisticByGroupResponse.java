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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetFlowStatisticByGroupResponse extends AbstractModel {

    /**
    * <p>流量详细信息</p>
    */
    @SerializedName("NetDetails")
    @Expose
    private NetDetails [] NetDetails;

    /**
    * <p>查找时间段流量使用最大值（单位：byte）</p>
    */
    @SerializedName("MaxValue")
    @Expose
    private Float MaxValue;

    /**
    * <p>查找时间段流量使用平均值（单位：byte）</p>
    */
    @SerializedName("AvgValue")
    @Expose
    private Float AvgValue;

    /**
    * <p>查找时间段流量使用总量（单位：byte）</p>
    */
    @SerializedName("TotalValue")
    @Expose
    private Float TotalValue;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>流量详细信息</p> 
     * @return NetDetails <p>流量详细信息</p>
     */
    public NetDetails [] getNetDetails() {
        return this.NetDetails;
    }

    /**
     * Set <p>流量详细信息</p>
     * @param NetDetails <p>流量详细信息</p>
     */
    public void setNetDetails(NetDetails [] NetDetails) {
        this.NetDetails = NetDetails;
    }

    /**
     * Get <p>查找时间段流量使用最大值（单位：byte）</p> 
     * @return MaxValue <p>查找时间段流量使用最大值（单位：byte）</p>
     */
    public Float getMaxValue() {
        return this.MaxValue;
    }

    /**
     * Set <p>查找时间段流量使用最大值（单位：byte）</p>
     * @param MaxValue <p>查找时间段流量使用最大值（单位：byte）</p>
     */
    public void setMaxValue(Float MaxValue) {
        this.MaxValue = MaxValue;
    }

    /**
     * Get <p>查找时间段流量使用平均值（单位：byte）</p> 
     * @return AvgValue <p>查找时间段流量使用平均值（单位：byte）</p>
     */
    public Float getAvgValue() {
        return this.AvgValue;
    }

    /**
     * Set <p>查找时间段流量使用平均值（单位：byte）</p>
     * @param AvgValue <p>查找时间段流量使用平均值（单位：byte）</p>
     */
    public void setAvgValue(Float AvgValue) {
        this.AvgValue = AvgValue;
    }

    /**
     * Get <p>查找时间段流量使用总量（单位：byte）</p> 
     * @return TotalValue <p>查找时间段流量使用总量（单位：byte）</p>
     */
    public Float getTotalValue() {
        return this.TotalValue;
    }

    /**
     * Set <p>查找时间段流量使用总量（单位：byte）</p>
     * @param TotalValue <p>查找时间段流量使用总量（单位：byte）</p>
     */
    public void setTotalValue(Float TotalValue) {
        this.TotalValue = TotalValue;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetFlowStatisticByGroupResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetFlowStatisticByGroupResponse(GetFlowStatisticByGroupResponse source) {
        if (source.NetDetails != null) {
            this.NetDetails = new NetDetails[source.NetDetails.length];
            for (int i = 0; i < source.NetDetails.length; i++) {
                this.NetDetails[i] = new NetDetails(source.NetDetails[i]);
            }
        }
        if (source.MaxValue != null) {
            this.MaxValue = new Float(source.MaxValue);
        }
        if (source.AvgValue != null) {
            this.AvgValue = new Float(source.AvgValue);
        }
        if (source.TotalValue != null) {
            this.TotalValue = new Float(source.TotalValue);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "NetDetails.", this.NetDetails);
        this.setParamSimple(map, prefix + "MaxValue", this.MaxValue);
        this.setParamSimple(map, prefix + "AvgValue", this.AvgValue);
        this.setParamSimple(map, prefix + "TotalValue", this.TotalValue);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

