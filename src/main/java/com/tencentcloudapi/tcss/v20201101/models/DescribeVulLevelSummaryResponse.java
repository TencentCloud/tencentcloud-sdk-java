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

public class DescribeVulLevelSummaryResponse extends AbstractModel{

    /**
    * 高危漏洞数
    */
    @SerializedName("HighLevelVulCount")
    @Expose
    private Long HighLevelVulCount;

    /**
    * 中危漏洞数
    */
    @SerializedName("MediumLevelVulCount")
    @Expose
    private Long MediumLevelVulCount;

    /**
    * 低危漏洞数
    */
    @SerializedName("LowLevelVulCount")
    @Expose
    private Long LowLevelVulCount;

    /**
    * 严重漏洞数
    */
    @SerializedName("CriticalLevelVulCount")
    @Expose
    private Long CriticalLevelVulCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 高危漏洞数 
     * @return HighLevelVulCount 高危漏洞数
     */
    public Long getHighLevelVulCount() {
        return this.HighLevelVulCount;
    }

    /**
     * Set 高危漏洞数
     * @param HighLevelVulCount 高危漏洞数
     */
    public void setHighLevelVulCount(Long HighLevelVulCount) {
        this.HighLevelVulCount = HighLevelVulCount;
    }

    /**
     * Get 中危漏洞数 
     * @return MediumLevelVulCount 中危漏洞数
     */
    public Long getMediumLevelVulCount() {
        return this.MediumLevelVulCount;
    }

    /**
     * Set 中危漏洞数
     * @param MediumLevelVulCount 中危漏洞数
     */
    public void setMediumLevelVulCount(Long MediumLevelVulCount) {
        this.MediumLevelVulCount = MediumLevelVulCount;
    }

    /**
     * Get 低危漏洞数 
     * @return LowLevelVulCount 低危漏洞数
     */
    public Long getLowLevelVulCount() {
        return this.LowLevelVulCount;
    }

    /**
     * Set 低危漏洞数
     * @param LowLevelVulCount 低危漏洞数
     */
    public void setLowLevelVulCount(Long LowLevelVulCount) {
        this.LowLevelVulCount = LowLevelVulCount;
    }

    /**
     * Get 严重漏洞数 
     * @return CriticalLevelVulCount 严重漏洞数
     */
    public Long getCriticalLevelVulCount() {
        return this.CriticalLevelVulCount;
    }

    /**
     * Set 严重漏洞数
     * @param CriticalLevelVulCount 严重漏洞数
     */
    public void setCriticalLevelVulCount(Long CriticalLevelVulCount) {
        this.CriticalLevelVulCount = CriticalLevelVulCount;
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

    public DescribeVulLevelSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulLevelSummaryResponse(DescribeVulLevelSummaryResponse source) {
        if (source.HighLevelVulCount != null) {
            this.HighLevelVulCount = new Long(source.HighLevelVulCount);
        }
        if (source.MediumLevelVulCount != null) {
            this.MediumLevelVulCount = new Long(source.MediumLevelVulCount);
        }
        if (source.LowLevelVulCount != null) {
            this.LowLevelVulCount = new Long(source.LowLevelVulCount);
        }
        if (source.CriticalLevelVulCount != null) {
            this.CriticalLevelVulCount = new Long(source.CriticalLevelVulCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HighLevelVulCount", this.HighLevelVulCount);
        this.setParamSimple(map, prefix + "MediumLevelVulCount", this.MediumLevelVulCount);
        this.setParamSimple(map, prefix + "LowLevelVulCount", this.LowLevelVulCount);
        this.setParamSimple(map, prefix + "CriticalLevelVulCount", this.CriticalLevelVulCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

