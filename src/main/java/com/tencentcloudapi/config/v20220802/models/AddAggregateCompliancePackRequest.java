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

public class AddAggregateCompliancePackRequest extends AbstractModel {

    /**
    * <p>合规包规则</p>
    */
    @SerializedName("ConfigRules")
    @Expose
    private CompliancePackRule [] ConfigRules;

    /**
    * <p>风险等级<br>1：高风险。<br>2：中风险。<br>3：低风险。</p>
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * <p>合规包名称</p>
    */
    @SerializedName("CompliancePackName")
    @Expose
    private String CompliancePackName;

    /**
    * <p>账号组ID</p>
    */
    @SerializedName("AccountGroupId")
    @Expose
    private String AccountGroupId;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <p>合规包规则</p> 
     * @return ConfigRules <p>合规包规则</p>
     */
    public CompliancePackRule [] getConfigRules() {
        return this.ConfigRules;
    }

    /**
     * Set <p>合规包规则</p>
     * @param ConfigRules <p>合规包规则</p>
     */
    public void setConfigRules(CompliancePackRule [] ConfigRules) {
        this.ConfigRules = ConfigRules;
    }

    /**
     * Get <p>风险等级<br>1：高风险。<br>2：中风险。<br>3：低风险。</p> 
     * @return RiskLevel <p>风险等级<br>1：高风险。<br>2：中风险。<br>3：低风险。</p>
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>风险等级<br>1：高风险。<br>2：中风险。<br>3：低风险。</p>
     * @param RiskLevel <p>风险等级<br>1：高风险。<br>2：中风险。<br>3：低风险。</p>
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
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
     * Get <p>账号组ID</p> 
     * @return AccountGroupId <p>账号组ID</p>
     */
    public String getAccountGroupId() {
        return this.AccountGroupId;
    }

    /**
     * Set <p>账号组ID</p>
     * @param AccountGroupId <p>账号组ID</p>
     */
    public void setAccountGroupId(String AccountGroupId) {
        this.AccountGroupId = AccountGroupId;
    }

    /**
     * Get <p>描述</p> 
     * @return Description <p>描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
     * @param Description <p>描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public AddAggregateCompliancePackRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddAggregateCompliancePackRequest(AddAggregateCompliancePackRequest source) {
        if (source.ConfigRules != null) {
            this.ConfigRules = new CompliancePackRule[source.ConfigRules.length];
            for (int i = 0; i < source.ConfigRules.length; i++) {
                this.ConfigRules[i] = new CompliancePackRule(source.ConfigRules[i]);
            }
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long(source.RiskLevel);
        }
        if (source.CompliancePackName != null) {
            this.CompliancePackName = new String(source.CompliancePackName);
        }
        if (source.AccountGroupId != null) {
            this.AccountGroupId = new String(source.AccountGroupId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ConfigRules.", this.ConfigRules);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "CompliancePackName", this.CompliancePackName);
        this.setParamSimple(map, prefix + "AccountGroupId", this.AccountGroupId);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

