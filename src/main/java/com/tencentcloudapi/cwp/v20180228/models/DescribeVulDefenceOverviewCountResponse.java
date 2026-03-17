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

public class DescribeVulDefenceOverviewCountResponse extends AbstractModel {

    /**
    * 策略数
    */
    @SerializedName("StrategyCount")
    @Expose
    private Long StrategyCount;

    /**
    * 开启的策略数
    */
    @SerializedName("StrategyOpenCount")
    @Expose
    private Long StrategyOpenCount;

    /**
    * 支持的防御漏洞个数
    */
    @SerializedName("SupportDefenceVulCount")
    @Expose
    private Long SupportDefenceVulCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 策略数 
     * @return StrategyCount 策略数
     */
    public Long getStrategyCount() {
        return this.StrategyCount;
    }

    /**
     * Set 策略数
     * @param StrategyCount 策略数
     */
    public void setStrategyCount(Long StrategyCount) {
        this.StrategyCount = StrategyCount;
    }

    /**
     * Get 开启的策略数 
     * @return StrategyOpenCount 开启的策略数
     */
    public Long getStrategyOpenCount() {
        return this.StrategyOpenCount;
    }

    /**
     * Set 开启的策略数
     * @param StrategyOpenCount 开启的策略数
     */
    public void setStrategyOpenCount(Long StrategyOpenCount) {
        this.StrategyOpenCount = StrategyOpenCount;
    }

    /**
     * Get 支持的防御漏洞个数 
     * @return SupportDefenceVulCount 支持的防御漏洞个数
     */
    public Long getSupportDefenceVulCount() {
        return this.SupportDefenceVulCount;
    }

    /**
     * Set 支持的防御漏洞个数
     * @param SupportDefenceVulCount 支持的防御漏洞个数
     */
    public void setSupportDefenceVulCount(Long SupportDefenceVulCount) {
        this.SupportDefenceVulCount = SupportDefenceVulCount;
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

    public DescribeVulDefenceOverviewCountResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulDefenceOverviewCountResponse(DescribeVulDefenceOverviewCountResponse source) {
        if (source.StrategyCount != null) {
            this.StrategyCount = new Long(source.StrategyCount);
        }
        if (source.StrategyOpenCount != null) {
            this.StrategyOpenCount = new Long(source.StrategyOpenCount);
        }
        if (source.SupportDefenceVulCount != null) {
            this.SupportDefenceVulCount = new Long(source.SupportDefenceVulCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyCount", this.StrategyCount);
        this.setParamSimple(map, prefix + "StrategyOpenCount", this.StrategyOpenCount);
        this.setParamSimple(map, prefix + "SupportDefenceVulCount", this.SupportDefenceVulCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

