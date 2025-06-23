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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeScanStatisticResponse extends AbstractModel {

    /**
    * 端口服务数量
    */
    @SerializedName("PortServiceCount")
    @Expose
    private Long PortServiceCount;

    /**
    * Web服务数量
    */
    @SerializedName("WebAppCount")
    @Expose
    private Long WebAppCount;

    /**
    * 弱口令风险数量
    */
    @SerializedName("WeakPasswordCount")
    @Expose
    private Long WeakPasswordCount;

    /**
    * 漏洞风险数量
    */
    @SerializedName("VulCount")
    @Expose
    private Long VulCount;

    /**
    * 高危端口服务数量
    */
    @SerializedName("HighRiskPortServiceCount")
    @Expose
    private Long HighRiskPortServiceCount;

    /**
    * 风险Web服务数量
    */
    @SerializedName("RiskWebAppCount")
    @Expose
    private Long RiskWebAppCount;

    /**
    * 端口服务近7天新增数量
    */
    @SerializedName("PortServiceIncrement")
    @Expose
    private Long PortServiceIncrement;

    /**
    * Web服务近7天新增数量
    */
    @SerializedName("WebAppIncrement")
    @Expose
    private Long WebAppIncrement;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 端口服务数量 
     * @return PortServiceCount 端口服务数量
     */
    public Long getPortServiceCount() {
        return this.PortServiceCount;
    }

    /**
     * Set 端口服务数量
     * @param PortServiceCount 端口服务数量
     */
    public void setPortServiceCount(Long PortServiceCount) {
        this.PortServiceCount = PortServiceCount;
    }

    /**
     * Get Web服务数量 
     * @return WebAppCount Web服务数量
     */
    public Long getWebAppCount() {
        return this.WebAppCount;
    }

    /**
     * Set Web服务数量
     * @param WebAppCount Web服务数量
     */
    public void setWebAppCount(Long WebAppCount) {
        this.WebAppCount = WebAppCount;
    }

    /**
     * Get 弱口令风险数量 
     * @return WeakPasswordCount 弱口令风险数量
     */
    public Long getWeakPasswordCount() {
        return this.WeakPasswordCount;
    }

    /**
     * Set 弱口令风险数量
     * @param WeakPasswordCount 弱口令风险数量
     */
    public void setWeakPasswordCount(Long WeakPasswordCount) {
        this.WeakPasswordCount = WeakPasswordCount;
    }

    /**
     * Get 漏洞风险数量 
     * @return VulCount 漏洞风险数量
     */
    public Long getVulCount() {
        return this.VulCount;
    }

    /**
     * Set 漏洞风险数量
     * @param VulCount 漏洞风险数量
     */
    public void setVulCount(Long VulCount) {
        this.VulCount = VulCount;
    }

    /**
     * Get 高危端口服务数量 
     * @return HighRiskPortServiceCount 高危端口服务数量
     */
    public Long getHighRiskPortServiceCount() {
        return this.HighRiskPortServiceCount;
    }

    /**
     * Set 高危端口服务数量
     * @param HighRiskPortServiceCount 高危端口服务数量
     */
    public void setHighRiskPortServiceCount(Long HighRiskPortServiceCount) {
        this.HighRiskPortServiceCount = HighRiskPortServiceCount;
    }

    /**
     * Get 风险Web服务数量 
     * @return RiskWebAppCount 风险Web服务数量
     */
    public Long getRiskWebAppCount() {
        return this.RiskWebAppCount;
    }

    /**
     * Set 风险Web服务数量
     * @param RiskWebAppCount 风险Web服务数量
     */
    public void setRiskWebAppCount(Long RiskWebAppCount) {
        this.RiskWebAppCount = RiskWebAppCount;
    }

    /**
     * Get 端口服务近7天新增数量 
     * @return PortServiceIncrement 端口服务近7天新增数量
     */
    public Long getPortServiceIncrement() {
        return this.PortServiceIncrement;
    }

    /**
     * Set 端口服务近7天新增数量
     * @param PortServiceIncrement 端口服务近7天新增数量
     */
    public void setPortServiceIncrement(Long PortServiceIncrement) {
        this.PortServiceIncrement = PortServiceIncrement;
    }

    /**
     * Get Web服务近7天新增数量 
     * @return WebAppIncrement Web服务近7天新增数量
     */
    public Long getWebAppIncrement() {
        return this.WebAppIncrement;
    }

    /**
     * Set Web服务近7天新增数量
     * @param WebAppIncrement Web服务近7天新增数量
     */
    public void setWebAppIncrement(Long WebAppIncrement) {
        this.WebAppIncrement = WebAppIncrement;
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

    public DescribeScanStatisticResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScanStatisticResponse(DescribeScanStatisticResponse source) {
        if (source.PortServiceCount != null) {
            this.PortServiceCount = new Long(source.PortServiceCount);
        }
        if (source.WebAppCount != null) {
            this.WebAppCount = new Long(source.WebAppCount);
        }
        if (source.WeakPasswordCount != null) {
            this.WeakPasswordCount = new Long(source.WeakPasswordCount);
        }
        if (source.VulCount != null) {
            this.VulCount = new Long(source.VulCount);
        }
        if (source.HighRiskPortServiceCount != null) {
            this.HighRiskPortServiceCount = new Long(source.HighRiskPortServiceCount);
        }
        if (source.RiskWebAppCount != null) {
            this.RiskWebAppCount = new Long(source.RiskWebAppCount);
        }
        if (source.PortServiceIncrement != null) {
            this.PortServiceIncrement = new Long(source.PortServiceIncrement);
        }
        if (source.WebAppIncrement != null) {
            this.WebAppIncrement = new Long(source.WebAppIncrement);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PortServiceCount", this.PortServiceCount);
        this.setParamSimple(map, prefix + "WebAppCount", this.WebAppCount);
        this.setParamSimple(map, prefix + "WeakPasswordCount", this.WeakPasswordCount);
        this.setParamSimple(map, prefix + "VulCount", this.VulCount);
        this.setParamSimple(map, prefix + "HighRiskPortServiceCount", this.HighRiskPortServiceCount);
        this.setParamSimple(map, prefix + "RiskWebAppCount", this.RiskWebAppCount);
        this.setParamSimple(map, prefix + "PortServiceIncrement", this.PortServiceIncrement);
        this.setParamSimple(map, prefix + "WebAppIncrement", this.WebAppIncrement);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

