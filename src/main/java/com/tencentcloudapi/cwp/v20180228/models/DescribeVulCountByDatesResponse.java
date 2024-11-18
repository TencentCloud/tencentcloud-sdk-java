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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulCountByDatesResponse extends AbstractModel {

    /**
    * 批量获得对应天数的漏洞数量
    */
    @SerializedName("VulCount")
    @Expose
    private Long [] VulCount;

    /**
    * 批量获得对应天数的主机数量
    */
    @SerializedName("HostCount")
    @Expose
    private Long [] HostCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 批量获得对应天数的漏洞数量 
     * @return VulCount 批量获得对应天数的漏洞数量
     */
    public Long [] getVulCount() {
        return this.VulCount;
    }

    /**
     * Set 批量获得对应天数的漏洞数量
     * @param VulCount 批量获得对应天数的漏洞数量
     */
    public void setVulCount(Long [] VulCount) {
        this.VulCount = VulCount;
    }

    /**
     * Get 批量获得对应天数的主机数量 
     * @return HostCount 批量获得对应天数的主机数量
     */
    public Long [] getHostCount() {
        return this.HostCount;
    }

    /**
     * Set 批量获得对应天数的主机数量
     * @param HostCount 批量获得对应天数的主机数量
     */
    public void setHostCount(Long [] HostCount) {
        this.HostCount = HostCount;
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

    public DescribeVulCountByDatesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulCountByDatesResponse(DescribeVulCountByDatesResponse source) {
        if (source.VulCount != null) {
            this.VulCount = new Long[source.VulCount.length];
            for (int i = 0; i < source.VulCount.length; i++) {
                this.VulCount[i] = new Long(source.VulCount[i]);
            }
        }
        if (source.HostCount != null) {
            this.HostCount = new Long[source.HostCount.length];
            for (int i = 0; i < source.HostCount.length; i++) {
                this.HostCount[i] = new Long(source.HostCount[i]);
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
        this.setParamArraySimple(map, prefix + "VulCount.", this.VulCount);
        this.setParamArraySimple(map, prefix + "HostCount.", this.HostCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

