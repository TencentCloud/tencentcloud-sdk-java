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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVirusManualScanEstimateTimeoutResponse extends AbstractModel{

    /**
    * 预估超时时间(h)
    */
    @SerializedName("Timeout")
    @Expose
    private Float Timeout;

    /**
    * 单台主机并行扫描容器数
    */
    @SerializedName("ContainerScanConcurrencyCount")
    @Expose
    private Long ContainerScanConcurrencyCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 预估超时时间(h) 
     * @return Timeout 预估超时时间(h)
     */
    public Float getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 预估超时时间(h)
     * @param Timeout 预估超时时间(h)
     */
    public void setTimeout(Float Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get 单台主机并行扫描容器数 
     * @return ContainerScanConcurrencyCount 单台主机并行扫描容器数
     */
    public Long getContainerScanConcurrencyCount() {
        return this.ContainerScanConcurrencyCount;
    }

    /**
     * Set 单台主机并行扫描容器数
     * @param ContainerScanConcurrencyCount 单台主机并行扫描容器数
     */
    public void setContainerScanConcurrencyCount(Long ContainerScanConcurrencyCount) {
        this.ContainerScanConcurrencyCount = ContainerScanConcurrencyCount;
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

    public DescribeVirusManualScanEstimateTimeoutResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVirusManualScanEstimateTimeoutResponse(DescribeVirusManualScanEstimateTimeoutResponse source) {
        if (source.Timeout != null) {
            this.Timeout = new Float(source.Timeout);
        }
        if (source.ContainerScanConcurrencyCount != null) {
            this.ContainerScanConcurrencyCount = new Long(source.ContainerScanConcurrencyCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "ContainerScanConcurrencyCount", this.ContainerScanConcurrencyCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

