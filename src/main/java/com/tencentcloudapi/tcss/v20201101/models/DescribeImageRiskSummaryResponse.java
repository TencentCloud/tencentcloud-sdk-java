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

public class DescribeImageRiskSummaryResponse extends AbstractModel{

    /**
    * 安全漏洞
    */
    @SerializedName("VulnerabilityCnt")
    @Expose
    private RunTimeRiskInfo [] VulnerabilityCnt;

    /**
    * 木马病毒
    */
    @SerializedName("MalwareVirusCnt")
    @Expose
    private RunTimeRiskInfo [] MalwareVirusCnt;

    /**
    * 敏感信息
    */
    @SerializedName("RiskCnt")
    @Expose
    private RunTimeRiskInfo [] RiskCnt;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 安全漏洞 
     * @return VulnerabilityCnt 安全漏洞
     */
    public RunTimeRiskInfo [] getVulnerabilityCnt() {
        return this.VulnerabilityCnt;
    }

    /**
     * Set 安全漏洞
     * @param VulnerabilityCnt 安全漏洞
     */
    public void setVulnerabilityCnt(RunTimeRiskInfo [] VulnerabilityCnt) {
        this.VulnerabilityCnt = VulnerabilityCnt;
    }

    /**
     * Get 木马病毒 
     * @return MalwareVirusCnt 木马病毒
     */
    public RunTimeRiskInfo [] getMalwareVirusCnt() {
        return this.MalwareVirusCnt;
    }

    /**
     * Set 木马病毒
     * @param MalwareVirusCnt 木马病毒
     */
    public void setMalwareVirusCnt(RunTimeRiskInfo [] MalwareVirusCnt) {
        this.MalwareVirusCnt = MalwareVirusCnt;
    }

    /**
     * Get 敏感信息 
     * @return RiskCnt 敏感信息
     */
    public RunTimeRiskInfo [] getRiskCnt() {
        return this.RiskCnt;
    }

    /**
     * Set 敏感信息
     * @param RiskCnt 敏感信息
     */
    public void setRiskCnt(RunTimeRiskInfo [] RiskCnt) {
        this.RiskCnt = RiskCnt;
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

    public DescribeImageRiskSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImageRiskSummaryResponse(DescribeImageRiskSummaryResponse source) {
        if (source.VulnerabilityCnt != null) {
            this.VulnerabilityCnt = new RunTimeRiskInfo[source.VulnerabilityCnt.length];
            for (int i = 0; i < source.VulnerabilityCnt.length; i++) {
                this.VulnerabilityCnt[i] = new RunTimeRiskInfo(source.VulnerabilityCnt[i]);
            }
        }
        if (source.MalwareVirusCnt != null) {
            this.MalwareVirusCnt = new RunTimeRiskInfo[source.MalwareVirusCnt.length];
            for (int i = 0; i < source.MalwareVirusCnt.length; i++) {
                this.MalwareVirusCnt[i] = new RunTimeRiskInfo(source.MalwareVirusCnt[i]);
            }
        }
        if (source.RiskCnt != null) {
            this.RiskCnt = new RunTimeRiskInfo[source.RiskCnt.length];
            for (int i = 0; i < source.RiskCnt.length; i++) {
                this.RiskCnt[i] = new RunTimeRiskInfo(source.RiskCnt[i]);
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
        this.setParamArrayObj(map, prefix + "VulnerabilityCnt.", this.VulnerabilityCnt);
        this.setParamArrayObj(map, prefix + "MalwareVirusCnt.", this.MalwareVirusCnt);
        this.setParamArrayObj(map, prefix + "RiskCnt.", this.RiskCnt);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

