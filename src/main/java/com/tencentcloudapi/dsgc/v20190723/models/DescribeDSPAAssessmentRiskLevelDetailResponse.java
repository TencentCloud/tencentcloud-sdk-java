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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDSPAAssessmentRiskLevelDetailResponse extends AbstractModel {

    /**
    * 风险级别名称
    */
    @SerializedName("RiskLevelName")
    @Expose
    private String RiskLevelName;

    /**
    * 风险级别描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskLevelDescription")
    @Expose
    private String RiskLevelDescription;

    /**
    * 分类分级id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdentifyComplianceId")
    @Expose
    private Long IdentifyComplianceId;

    /**
    * 分类分级模板名称
    */
    @SerializedName("IdentifyComplianceName")
    @Expose
    private String IdentifyComplianceName;

    /**
    * 风险数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskLevelMatrix")
    @Expose
    private RiskLevelMatrix [] RiskLevelMatrix;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 风险级别名称 
     * @return RiskLevelName 风险级别名称
     */
    public String getRiskLevelName() {
        return this.RiskLevelName;
    }

    /**
     * Set 风险级别名称
     * @param RiskLevelName 风险级别名称
     */
    public void setRiskLevelName(String RiskLevelName) {
        this.RiskLevelName = RiskLevelName;
    }

    /**
     * Get 风险级别描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskLevelDescription 风险级别描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRiskLevelDescription() {
        return this.RiskLevelDescription;
    }

    /**
     * Set 风险级别描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskLevelDescription 风险级别描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskLevelDescription(String RiskLevelDescription) {
        this.RiskLevelDescription = RiskLevelDescription;
    }

    /**
     * Get 分类分级id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdentifyComplianceId 分类分级id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIdentifyComplianceId() {
        return this.IdentifyComplianceId;
    }

    /**
     * Set 分类分级id
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdentifyComplianceId 分类分级id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdentifyComplianceId(Long IdentifyComplianceId) {
        this.IdentifyComplianceId = IdentifyComplianceId;
    }

    /**
     * Get 分类分级模板名称 
     * @return IdentifyComplianceName 分类分级模板名称
     */
    public String getIdentifyComplianceName() {
        return this.IdentifyComplianceName;
    }

    /**
     * Set 分类分级模板名称
     * @param IdentifyComplianceName 分类分级模板名称
     */
    public void setIdentifyComplianceName(String IdentifyComplianceName) {
        this.IdentifyComplianceName = IdentifyComplianceName;
    }

    /**
     * Get 风险数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskLevelMatrix 风险数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RiskLevelMatrix [] getRiskLevelMatrix() {
        return this.RiskLevelMatrix;
    }

    /**
     * Set 风险数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskLevelMatrix 风险数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskLevelMatrix(RiskLevelMatrix [] RiskLevelMatrix) {
        this.RiskLevelMatrix = RiskLevelMatrix;
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

    public DescribeDSPAAssessmentRiskLevelDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDSPAAssessmentRiskLevelDetailResponse(DescribeDSPAAssessmentRiskLevelDetailResponse source) {
        if (source.RiskLevelName != null) {
            this.RiskLevelName = new String(source.RiskLevelName);
        }
        if (source.RiskLevelDescription != null) {
            this.RiskLevelDescription = new String(source.RiskLevelDescription);
        }
        if (source.IdentifyComplianceId != null) {
            this.IdentifyComplianceId = new Long(source.IdentifyComplianceId);
        }
        if (source.IdentifyComplianceName != null) {
            this.IdentifyComplianceName = new String(source.IdentifyComplianceName);
        }
        if (source.RiskLevelMatrix != null) {
            this.RiskLevelMatrix = new RiskLevelMatrix[source.RiskLevelMatrix.length];
            for (int i = 0; i < source.RiskLevelMatrix.length; i++) {
                this.RiskLevelMatrix[i] = new RiskLevelMatrix(source.RiskLevelMatrix[i]);
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
        this.setParamSimple(map, prefix + "RiskLevelName", this.RiskLevelName);
        this.setParamSimple(map, prefix + "RiskLevelDescription", this.RiskLevelDescription);
        this.setParamSimple(map, prefix + "IdentifyComplianceId", this.IdentifyComplianceId);
        this.setParamSimple(map, prefix + "IdentifyComplianceName", this.IdentifyComplianceName);
        this.setParamArrayObj(map, prefix + "RiskLevelMatrix.", this.RiskLevelMatrix);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

