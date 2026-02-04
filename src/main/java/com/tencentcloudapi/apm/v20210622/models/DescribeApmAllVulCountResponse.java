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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApmAllVulCountResponse extends AbstractModel {

    /**
    * 包含漏洞指标以及业务系统个数	
    */
    @SerializedName("VulnerabilityList")
    @Expose
    private ApmMetricRecord [] VulnerabilityList;

    /**
    * 总漏洞个数
    */
    @SerializedName("VulnerabilityCount")
    @Expose
    private Long VulnerabilityCount;

    /**
    * 严重漏洞个数
    */
    @SerializedName("ImportantVulnerabilityCount")
    @Expose
    private Long ImportantVulnerabilityCount;

    /**
    * 高危漏洞个数
    */
    @SerializedName("CriticalVulnerabilityCount")
    @Expose
    private Long CriticalVulnerabilityCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 包含漏洞指标以及业务系统个数	 
     * @return VulnerabilityList 包含漏洞指标以及业务系统个数	
     */
    public ApmMetricRecord [] getVulnerabilityList() {
        return this.VulnerabilityList;
    }

    /**
     * Set 包含漏洞指标以及业务系统个数	
     * @param VulnerabilityList 包含漏洞指标以及业务系统个数	
     */
    public void setVulnerabilityList(ApmMetricRecord [] VulnerabilityList) {
        this.VulnerabilityList = VulnerabilityList;
    }

    /**
     * Get 总漏洞个数 
     * @return VulnerabilityCount 总漏洞个数
     */
    public Long getVulnerabilityCount() {
        return this.VulnerabilityCount;
    }

    /**
     * Set 总漏洞个数
     * @param VulnerabilityCount 总漏洞个数
     */
    public void setVulnerabilityCount(Long VulnerabilityCount) {
        this.VulnerabilityCount = VulnerabilityCount;
    }

    /**
     * Get 严重漏洞个数 
     * @return ImportantVulnerabilityCount 严重漏洞个数
     */
    public Long getImportantVulnerabilityCount() {
        return this.ImportantVulnerabilityCount;
    }

    /**
     * Set 严重漏洞个数
     * @param ImportantVulnerabilityCount 严重漏洞个数
     */
    public void setImportantVulnerabilityCount(Long ImportantVulnerabilityCount) {
        this.ImportantVulnerabilityCount = ImportantVulnerabilityCount;
    }

    /**
     * Get 高危漏洞个数 
     * @return CriticalVulnerabilityCount 高危漏洞个数
     */
    public Long getCriticalVulnerabilityCount() {
        return this.CriticalVulnerabilityCount;
    }

    /**
     * Set 高危漏洞个数
     * @param CriticalVulnerabilityCount 高危漏洞个数
     */
    public void setCriticalVulnerabilityCount(Long CriticalVulnerabilityCount) {
        this.CriticalVulnerabilityCount = CriticalVulnerabilityCount;
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

    public DescribeApmAllVulCountResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApmAllVulCountResponse(DescribeApmAllVulCountResponse source) {
        if (source.VulnerabilityList != null) {
            this.VulnerabilityList = new ApmMetricRecord[source.VulnerabilityList.length];
            for (int i = 0; i < source.VulnerabilityList.length; i++) {
                this.VulnerabilityList[i] = new ApmMetricRecord(source.VulnerabilityList[i]);
            }
        }
        if (source.VulnerabilityCount != null) {
            this.VulnerabilityCount = new Long(source.VulnerabilityCount);
        }
        if (source.ImportantVulnerabilityCount != null) {
            this.ImportantVulnerabilityCount = new Long(source.ImportantVulnerabilityCount);
        }
        if (source.CriticalVulnerabilityCount != null) {
            this.CriticalVulnerabilityCount = new Long(source.CriticalVulnerabilityCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "VulnerabilityList.", this.VulnerabilityList);
        this.setParamSimple(map, prefix + "VulnerabilityCount", this.VulnerabilityCount);
        this.setParamSimple(map, prefix + "ImportantVulnerabilityCount", this.ImportantVulnerabilityCount);
        this.setParamSimple(map, prefix + "CriticalVulnerabilityCount", this.CriticalVulnerabilityCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

