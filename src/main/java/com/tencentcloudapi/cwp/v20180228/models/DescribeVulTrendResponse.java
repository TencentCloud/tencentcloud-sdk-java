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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulTrendResponse extends AbstractModel {

    /**
    * 近半年漏洞利用攻击事件数量
    */
    @SerializedName("VulEventCount")
    @Expose
    private Long VulEventCount;

    /**
    * 近半年新增漏洞利用攻击事件数量
    */
    @SerializedName("IncreaseVulEventCount")
    @Expose
    private Long IncreaseVulEventCount;

    /**
    * 近半年热点攻击漏洞
    */
    @SerializedName("HotVulCount")
    @Expose
    private Long HotVulCount;

    /**
    * 近半年新增热点攻击漏洞
    */
    @SerializedName("IncreaseHotVulCount")
    @Expose
    private Long IncreaseHotVulCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 近半年漏洞利用攻击事件数量 
     * @return VulEventCount 近半年漏洞利用攻击事件数量
     */
    public Long getVulEventCount() {
        return this.VulEventCount;
    }

    /**
     * Set 近半年漏洞利用攻击事件数量
     * @param VulEventCount 近半年漏洞利用攻击事件数量
     */
    public void setVulEventCount(Long VulEventCount) {
        this.VulEventCount = VulEventCount;
    }

    /**
     * Get 近半年新增漏洞利用攻击事件数量 
     * @return IncreaseVulEventCount 近半年新增漏洞利用攻击事件数量
     */
    public Long getIncreaseVulEventCount() {
        return this.IncreaseVulEventCount;
    }

    /**
     * Set 近半年新增漏洞利用攻击事件数量
     * @param IncreaseVulEventCount 近半年新增漏洞利用攻击事件数量
     */
    public void setIncreaseVulEventCount(Long IncreaseVulEventCount) {
        this.IncreaseVulEventCount = IncreaseVulEventCount;
    }

    /**
     * Get 近半年热点攻击漏洞 
     * @return HotVulCount 近半年热点攻击漏洞
     */
    public Long getHotVulCount() {
        return this.HotVulCount;
    }

    /**
     * Set 近半年热点攻击漏洞
     * @param HotVulCount 近半年热点攻击漏洞
     */
    public void setHotVulCount(Long HotVulCount) {
        this.HotVulCount = HotVulCount;
    }

    /**
     * Get 近半年新增热点攻击漏洞 
     * @return IncreaseHotVulCount 近半年新增热点攻击漏洞
     */
    public Long getIncreaseHotVulCount() {
        return this.IncreaseHotVulCount;
    }

    /**
     * Set 近半年新增热点攻击漏洞
     * @param IncreaseHotVulCount 近半年新增热点攻击漏洞
     */
    public void setIncreaseHotVulCount(Long IncreaseHotVulCount) {
        this.IncreaseHotVulCount = IncreaseHotVulCount;
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

    public DescribeVulTrendResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulTrendResponse(DescribeVulTrendResponse source) {
        if (source.VulEventCount != null) {
            this.VulEventCount = new Long(source.VulEventCount);
        }
        if (source.IncreaseVulEventCount != null) {
            this.IncreaseVulEventCount = new Long(source.IncreaseVulEventCount);
        }
        if (source.HotVulCount != null) {
            this.HotVulCount = new Long(source.HotVulCount);
        }
        if (source.IncreaseHotVulCount != null) {
            this.IncreaseHotVulCount = new Long(source.IncreaseHotVulCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulEventCount", this.VulEventCount);
        this.setParamSimple(map, prefix + "IncreaseVulEventCount", this.IncreaseVulEventCount);
        this.setParamSimple(map, prefix + "HotVulCount", this.HotVulCount);
        this.setParamSimple(map, prefix + "IncreaseHotVulCount", this.IncreaseHotVulCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

