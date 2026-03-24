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

public class DescribeCompliancePackResponse extends AbstractModel {

    /**
    * 合规包名称
    */
    @SerializedName("CompliancePackName")
    @Expose
    private String CompliancePackName;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 风险等级
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * 合规包规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigRules")
    @Expose
    private ComplianceConfigRule [] ConfigRules;

    /**
    * 合规包id
    */
    @SerializedName("CompliancePackId")
    @Expose
    private String CompliancePackId;

    /**
    * 合规包状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 合规包名称 
     * @return CompliancePackName 合规包名称
     */
    public String getCompliancePackName() {
        return this.CompliancePackName;
    }

    /**
     * Set 合规包名称
     * @param CompliancePackName 合规包名称
     */
    public void setCompliancePackName(String CompliancePackName) {
        this.CompliancePackName = CompliancePackName;
    }

    /**
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 风险等级 
     * @return RiskLevel 风险等级
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 风险等级
     * @param RiskLevel 风险等级
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 合规包规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigRules 合规包规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ComplianceConfigRule [] getConfigRules() {
        return this.ConfigRules;
    }

    /**
     * Set 合规包规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigRules 合规包规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigRules(ComplianceConfigRule [] ConfigRules) {
        this.ConfigRules = ConfigRules;
    }

    /**
     * Get 合规包id 
     * @return CompliancePackId 合规包id
     */
    public String getCompliancePackId() {
        return this.CompliancePackId;
    }

    /**
     * Set 合规包id
     * @param CompliancePackId 合规包id
     */
    public void setCompliancePackId(String CompliancePackId) {
        this.CompliancePackId = CompliancePackId;
    }

    /**
     * Get 合规包状态 
     * @return Status 合规包状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 合规包状态
     * @param Status 合规包状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
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

    public DescribeCompliancePackResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCompliancePackResponse(DescribeCompliancePackResponse source) {
        if (source.CompliancePackName != null) {
            this.CompliancePackName = new String(source.CompliancePackName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long(source.RiskLevel);
        }
        if (source.ConfigRules != null) {
            this.ConfigRules = new ComplianceConfigRule[source.ConfigRules.length];
            for (int i = 0; i < source.ConfigRules.length; i++) {
                this.ConfigRules[i] = new ComplianceConfigRule(source.ConfigRules[i]);
            }
        }
        if (source.CompliancePackId != null) {
            this.CompliancePackId = new String(source.CompliancePackId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompliancePackName", this.CompliancePackName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamArrayObj(map, prefix + "ConfigRules.", this.ConfigRules);
        this.setParamSimple(map, prefix + "CompliancePackId", this.CompliancePackId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

