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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetFlowStatisticResponse extends AbstractModel{

    /**
    * 流量详细信息
    */
    @SerializedName("NetDetails")
    @Expose
    private NetDetails [] NetDetails;

    /**
    * 查找时间段流量使用最大值（单位：byte）
    */
    @SerializedName("MaxValue")
    @Expose
    private Float MaxValue;

    /**
    * 查找时间段流量使用平均值（单位：byte）
    */
    @SerializedName("AvgValue")
    @Expose
    private Float AvgValue;

    /**
    * 查找时间段流量使用总量（单位：byte）
    */
    @SerializedName("TotalValue")
    @Expose
    private Float TotalValue;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 流量详细信息 
     * @return NetDetails 流量详细信息
     */
    public NetDetails [] getNetDetails() {
        return this.NetDetails;
    }

    /**
     * Set 流量详细信息
     * @param NetDetails 流量详细信息
     */
    public void setNetDetails(NetDetails [] NetDetails) {
        this.NetDetails = NetDetails;
    }

    /**
     * Get 查找时间段流量使用最大值（单位：byte） 
     * @return MaxValue 查找时间段流量使用最大值（单位：byte）
     */
    public Float getMaxValue() {
        return this.MaxValue;
    }

    /**
     * Set 查找时间段流量使用最大值（单位：byte）
     * @param MaxValue 查找时间段流量使用最大值（单位：byte）
     */
    public void setMaxValue(Float MaxValue) {
        this.MaxValue = MaxValue;
    }

    /**
     * Get 查找时间段流量使用平均值（单位：byte） 
     * @return AvgValue 查找时间段流量使用平均值（单位：byte）
     */
    public Float getAvgValue() {
        return this.AvgValue;
    }

    /**
     * Set 查找时间段流量使用平均值（单位：byte）
     * @param AvgValue 查找时间段流量使用平均值（单位：byte）
     */
    public void setAvgValue(Float AvgValue) {
        this.AvgValue = AvgValue;
    }

    /**
     * Get 查找时间段流量使用总量（单位：byte） 
     * @return TotalValue 查找时间段流量使用总量（单位：byte）
     */
    public Float getTotalValue() {
        return this.TotalValue;
    }

    /**
     * Set 查找时间段流量使用总量（单位：byte）
     * @param TotalValue 查找时间段流量使用总量（单位：byte）
     */
    public void setTotalValue(Float TotalValue) {
        this.TotalValue = TotalValue;
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

    public GetFlowStatisticResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetFlowStatisticResponse(GetFlowStatisticResponse source) {
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

