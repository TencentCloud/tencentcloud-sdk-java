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
package com.tencentcloudapi.fwm.v20250611.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRiskAnalysisDetailsResponse extends AbstractModel {

    /**
    * 风险企业安全组规则列表
    */
    @SerializedName("EnterpriseSecurityGroupRule")
    @Expose
    private AnalysisSgRuleInfoResp [] EnterpriseSecurityGroupRule;

    /**
    * 风险安全组规则列表
    */
    @SerializedName("SecurityGroupPolicy")
    @Expose
    private SecurityGroupRiskPolicy [] SecurityGroupPolicy;

    /**
    * 实时分析状态，1分析执行中请轮询，0分析已结束
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 风险企业安全组IPV6规则列表
    */
    @SerializedName("EnterpriseSecurityGroupRuleIPV6")
    @Expose
    private AnalysisSgRuleInfoResp [] EnterpriseSecurityGroupRuleIPV6;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 风险企业安全组规则列表 
     * @return EnterpriseSecurityGroupRule 风险企业安全组规则列表
     */
    public AnalysisSgRuleInfoResp [] getEnterpriseSecurityGroupRule() {
        return this.EnterpriseSecurityGroupRule;
    }

    /**
     * Set 风险企业安全组规则列表
     * @param EnterpriseSecurityGroupRule 风险企业安全组规则列表
     */
    public void setEnterpriseSecurityGroupRule(AnalysisSgRuleInfoResp [] EnterpriseSecurityGroupRule) {
        this.EnterpriseSecurityGroupRule = EnterpriseSecurityGroupRule;
    }

    /**
     * Get 风险安全组规则列表 
     * @return SecurityGroupPolicy 风险安全组规则列表
     */
    public SecurityGroupRiskPolicy [] getSecurityGroupPolicy() {
        return this.SecurityGroupPolicy;
    }

    /**
     * Set 风险安全组规则列表
     * @param SecurityGroupPolicy 风险安全组规则列表
     */
    public void setSecurityGroupPolicy(SecurityGroupRiskPolicy [] SecurityGroupPolicy) {
        this.SecurityGroupPolicy = SecurityGroupPolicy;
    }

    /**
     * Get 实时分析状态，1分析执行中请轮询，0分析已结束 
     * @return Status 实时分析状态，1分析执行中请轮询，0分析已结束
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 实时分析状态，1分析执行中请轮询，0分析已结束
     * @param Status 实时分析状态，1分析执行中请轮询，0分析已结束
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 风险企业安全组IPV6规则列表 
     * @return EnterpriseSecurityGroupRuleIPV6 风险企业安全组IPV6规则列表
     */
    public AnalysisSgRuleInfoResp [] getEnterpriseSecurityGroupRuleIPV6() {
        return this.EnterpriseSecurityGroupRuleIPV6;
    }

    /**
     * Set 风险企业安全组IPV6规则列表
     * @param EnterpriseSecurityGroupRuleIPV6 风险企业安全组IPV6规则列表
     */
    public void setEnterpriseSecurityGroupRuleIPV6(AnalysisSgRuleInfoResp [] EnterpriseSecurityGroupRuleIPV6) {
        this.EnterpriseSecurityGroupRuleIPV6 = EnterpriseSecurityGroupRuleIPV6;
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

    public DescribeRiskAnalysisDetailsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRiskAnalysisDetailsResponse(DescribeRiskAnalysisDetailsResponse source) {
        if (source.EnterpriseSecurityGroupRule != null) {
            this.EnterpriseSecurityGroupRule = new AnalysisSgRuleInfoResp[source.EnterpriseSecurityGroupRule.length];
            for (int i = 0; i < source.EnterpriseSecurityGroupRule.length; i++) {
                this.EnterpriseSecurityGroupRule[i] = new AnalysisSgRuleInfoResp(source.EnterpriseSecurityGroupRule[i]);
            }
        }
        if (source.SecurityGroupPolicy != null) {
            this.SecurityGroupPolicy = new SecurityGroupRiskPolicy[source.SecurityGroupPolicy.length];
            for (int i = 0; i < source.SecurityGroupPolicy.length; i++) {
                this.SecurityGroupPolicy[i] = new SecurityGroupRiskPolicy(source.SecurityGroupPolicy[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.EnterpriseSecurityGroupRuleIPV6 != null) {
            this.EnterpriseSecurityGroupRuleIPV6 = new AnalysisSgRuleInfoResp[source.EnterpriseSecurityGroupRuleIPV6.length];
            for (int i = 0; i < source.EnterpriseSecurityGroupRuleIPV6.length; i++) {
                this.EnterpriseSecurityGroupRuleIPV6[i] = new AnalysisSgRuleInfoResp(source.EnterpriseSecurityGroupRuleIPV6[i]);
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
        this.setParamArrayObj(map, prefix + "EnterpriseSecurityGroupRule.", this.EnterpriseSecurityGroupRule);
        this.setParamArrayObj(map, prefix + "SecurityGroupPolicy.", this.SecurityGroupPolicy);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "EnterpriseSecurityGroupRuleIPV6.", this.EnterpriseSecurityGroupRuleIPV6);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

