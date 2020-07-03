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
package com.tencentcloudapi.afc.v20200226.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryAntiFraudVipResponse extends AbstractModel{

    /**
    * 表示该条记录能否查到：1为能查到，-1为查不到
    */
    @SerializedName("Found")
    @Expose
    private Long Found;

    /**
    * 表示该条Id能否查到：1为能查到，-1为查不到
    */
    @SerializedName("IdFound")
    @Expose
    private Long IdFound;

    /**
    * 0~100;值越高 欺诈可能性越大
    */
    @SerializedName("RiskScore")
    @Expose
    private Long RiskScore;

    /**
    * 扩展字段，对风险类型的说明
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskInfo")
    @Expose
    private RiskDetail [] RiskInfo;

    /**
    * 业务侧错误码。成功时返回Success，错误时返回具体业务错误原因。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CodeDesc")
    @Expose
    private String CodeDesc;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 表示该条记录能否查到：1为能查到，-1为查不到 
     * @return Found 表示该条记录能否查到：1为能查到，-1为查不到
     */
    public Long getFound() {
        return this.Found;
    }

    /**
     * Set 表示该条记录能否查到：1为能查到，-1为查不到
     * @param Found 表示该条记录能否查到：1为能查到，-1为查不到
     */
    public void setFound(Long Found) {
        this.Found = Found;
    }

    /**
     * Get 表示该条Id能否查到：1为能查到，-1为查不到 
     * @return IdFound 表示该条Id能否查到：1为能查到，-1为查不到
     */
    public Long getIdFound() {
        return this.IdFound;
    }

    /**
     * Set 表示该条Id能否查到：1为能查到，-1为查不到
     * @param IdFound 表示该条Id能否查到：1为能查到，-1为查不到
     */
    public void setIdFound(Long IdFound) {
        this.IdFound = IdFound;
    }

    /**
     * Get 0~100;值越高 欺诈可能性越大 
     * @return RiskScore 0~100;值越高 欺诈可能性越大
     */
    public Long getRiskScore() {
        return this.RiskScore;
    }

    /**
     * Set 0~100;值越高 欺诈可能性越大
     * @param RiskScore 0~100;值越高 欺诈可能性越大
     */
    public void setRiskScore(Long RiskScore) {
        this.RiskScore = RiskScore;
    }

    /**
     * Get 扩展字段，对风险类型的说明
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskInfo 扩展字段，对风险类型的说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RiskDetail [] getRiskInfo() {
        return this.RiskInfo;
    }

    /**
     * Set 扩展字段，对风险类型的说明
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskInfo 扩展字段，对风险类型的说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskInfo(RiskDetail [] RiskInfo) {
        this.RiskInfo = RiskInfo;
    }

    /**
     * Get 业务侧错误码。成功时返回Success，错误时返回具体业务错误原因。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CodeDesc 业务侧错误码。成功时返回Success，错误时返回具体业务错误原因。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCodeDesc() {
        return this.CodeDesc;
    }

    /**
     * Set 业务侧错误码。成功时返回Success，错误时返回具体业务错误原因。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CodeDesc 业务侧错误码。成功时返回Success，错误时返回具体业务错误原因。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodeDesc(String CodeDesc) {
        this.CodeDesc = CodeDesc;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Found", this.Found);
        this.setParamSimple(map, prefix + "IdFound", this.IdFound);
        this.setParamSimple(map, prefix + "RiskScore", this.RiskScore);
        this.setParamArrayObj(map, prefix + "RiskInfo.", this.RiskInfo);
        this.setParamSimple(map, prefix + "CodeDesc", this.CodeDesc);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

