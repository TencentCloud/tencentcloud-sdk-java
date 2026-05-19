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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSystemCompliancePackResponse extends AbstractModel {

    /**
    * <p>合规包ID</p>
    */
    @SerializedName("CompliancePackId")
    @Expose
    private String CompliancePackId;

    /**
    * <p>合规包名称</p>
    */
    @SerializedName("CompliancePackName")
    @Expose
    private String CompliancePackName;

    /**
    * <p>合规包描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>风险等级</p>
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * <p>合规包规则列表</p>
    */
    @SerializedName("ConfigRules")
    @Expose
    private CompliancePackRuleForManage [] ConfigRules;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>合规包ID</p> 
     * @return CompliancePackId <p>合规包ID</p>
     */
    public String getCompliancePackId() {
        return this.CompliancePackId;
    }

    /**
     * Set <p>合规包ID</p>
     * @param CompliancePackId <p>合规包ID</p>
     */
    public void setCompliancePackId(String CompliancePackId) {
        this.CompliancePackId = CompliancePackId;
    }

    /**
     * Get <p>合规包名称</p> 
     * @return CompliancePackName <p>合规包名称</p>
     */
    public String getCompliancePackName() {
        return this.CompliancePackName;
    }

    /**
     * Set <p>合规包名称</p>
     * @param CompliancePackName <p>合规包名称</p>
     */
    public void setCompliancePackName(String CompliancePackName) {
        this.CompliancePackName = CompliancePackName;
    }

    /**
     * Get <p>合规包描述</p> 
     * @return Description <p>合规包描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>合规包描述</p>
     * @param Description <p>合规包描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>风险等级</p> 
     * @return RiskLevel <p>风险等级</p>
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>风险等级</p>
     * @param RiskLevel <p>风险等级</p>
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get <p>合规包规则列表</p> 
     * @return ConfigRules <p>合规包规则列表</p>
     */
    public CompliancePackRuleForManage [] getConfigRules() {
        return this.ConfigRules;
    }

    /**
     * Set <p>合规包规则列表</p>
     * @param ConfigRules <p>合规包规则列表</p>
     */
    public void setConfigRules(CompliancePackRuleForManage [] ConfigRules) {
        this.ConfigRules = ConfigRules;
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

    public DescribeSystemCompliancePackResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSystemCompliancePackResponse(DescribeSystemCompliancePackResponse source) {
        if (source.CompliancePackId != null) {
            this.CompliancePackId = new String(source.CompliancePackId);
        }
        if (source.CompliancePackName != null) {
            this.CompliancePackName = new String(source.CompliancePackName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long(source.RiskLevel);
        }
        if (source.ConfigRules != null) {
            this.ConfigRules = new CompliancePackRuleForManage[source.ConfigRules.length];
            for (int i = 0; i < source.ConfigRules.length; i++) {
                this.ConfigRules[i] = new CompliancePackRuleForManage(source.ConfigRules[i]);
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
        this.setParamSimple(map, prefix + "CompliancePackId", this.CompliancePackId);
        this.setParamSimple(map, prefix + "CompliancePackName", this.CompliancePackName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamArrayObj(map, prefix + "ConfigRules.", this.ConfigRules);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

