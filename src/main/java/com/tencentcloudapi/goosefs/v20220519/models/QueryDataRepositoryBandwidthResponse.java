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
package com.tencentcloudapi.goosefs.v20220519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryDataRepositoryBandwidthResponse extends AbstractModel{

    /**
    * 数据流动带宽, 单位MB/s
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 带宽状态。1:待扩容;2:运行中;3:扩容中
    */
    @SerializedName("BandwidthStatus")
    @Expose
    private Long BandwidthStatus;

    /**
    * 能设置的最小带宽, 单位MB/s
    */
    @SerializedName("MinBandwidth")
    @Expose
    private Long MinBandwidth;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 数据流动带宽, 单位MB/s 
     * @return Bandwidth 数据流动带宽, 单位MB/s
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 数据流动带宽, 单位MB/s
     * @param Bandwidth 数据流动带宽, 单位MB/s
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 带宽状态。1:待扩容;2:运行中;3:扩容中 
     * @return BandwidthStatus 带宽状态。1:待扩容;2:运行中;3:扩容中
     */
    public Long getBandwidthStatus() {
        return this.BandwidthStatus;
    }

    /**
     * Set 带宽状态。1:待扩容;2:运行中;3:扩容中
     * @param BandwidthStatus 带宽状态。1:待扩容;2:运行中;3:扩容中
     */
    public void setBandwidthStatus(Long BandwidthStatus) {
        this.BandwidthStatus = BandwidthStatus;
    }

    /**
     * Get 能设置的最小带宽, 单位MB/s 
     * @return MinBandwidth 能设置的最小带宽, 单位MB/s
     */
    public Long getMinBandwidth() {
        return this.MinBandwidth;
    }

    /**
     * Set 能设置的最小带宽, 单位MB/s
     * @param MinBandwidth 能设置的最小带宽, 单位MB/s
     */
    public void setMinBandwidth(Long MinBandwidth) {
        this.MinBandwidth = MinBandwidth;
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

    public QueryDataRepositoryBandwidthResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryDataRepositoryBandwidthResponse(QueryDataRepositoryBandwidthResponse source) {
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.BandwidthStatus != null) {
            this.BandwidthStatus = new Long(source.BandwidthStatus);
        }
        if (source.MinBandwidth != null) {
            this.MinBandwidth = new Long(source.MinBandwidth);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "BandwidthStatus", this.BandwidthStatus);
        this.setParamSimple(map, prefix + "MinBandwidth", this.MinBandwidth);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

