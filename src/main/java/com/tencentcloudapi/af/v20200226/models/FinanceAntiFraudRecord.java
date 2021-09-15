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
package com.tencentcloudapi.af.v20200226.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FinanceAntiFraudRecord extends AbstractModel{

    /**
    * 表示该条记录能否查到：1为能查到，-1为查不到
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Found")
    @Expose
    private String Found;

    /**
    * 表示该条Id能否查到：1为能查到，-1为查不到
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdFound")
    @Expose
    private String IdFound;

    /**
    * 评分0~100;值越高 欺诈可能性越大
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskScore")
    @Expose
    private String RiskScore;

    /**
    * 扩展字段，对风险类型的说明
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskInfo")
    @Expose
    private RiskDetailInfo [] RiskInfo;

    /**
    * 多模型返回结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OtherModelScores")
    @Expose
    private FinanceOtherModelScores [] OtherModelScores;

    /**
    * 业务侧错误码。成功时返回0，错误时返回非0值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 业务侧错误信息。成功时返回Success，错误时返回具体业务错误原因。
注意：此字段可能返回 null，表示取不到有效值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get 表示该条记录能否查到：1为能查到，-1为查不到
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Found 表示该条记录能否查到：1为能查到，-1为查不到
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFound() {
        return this.Found;
    }

    /**
     * Set 表示该条记录能否查到：1为能查到，-1为查不到
注意：此字段可能返回 null，表示取不到有效值。
     * @param Found 表示该条记录能否查到：1为能查到，-1为查不到
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFound(String Found) {
        this.Found = Found;
    }

    /**
     * Get 表示该条Id能否查到：1为能查到，-1为查不到
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdFound 表示该条Id能否查到：1为能查到，-1为查不到
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdFound() {
        return this.IdFound;
    }

    /**
     * Set 表示该条Id能否查到：1为能查到，-1为查不到
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdFound 表示该条Id能否查到：1为能查到，-1为查不到
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdFound(String IdFound) {
        this.IdFound = IdFound;
    }

    /**
     * Get 评分0~100;值越高 欺诈可能性越大
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskScore 评分0~100;值越高 欺诈可能性越大
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRiskScore() {
        return this.RiskScore;
    }

    /**
     * Set 评分0~100;值越高 欺诈可能性越大
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskScore 评分0~100;值越高 欺诈可能性越大
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskScore(String RiskScore) {
        this.RiskScore = RiskScore;
    }

    /**
     * Get 扩展字段，对风险类型的说明
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskInfo 扩展字段，对风险类型的说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RiskDetailInfo [] getRiskInfo() {
        return this.RiskInfo;
    }

    /**
     * Set 扩展字段，对风险类型的说明
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskInfo 扩展字段，对风险类型的说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskInfo(RiskDetailInfo [] RiskInfo) {
        this.RiskInfo = RiskInfo;
    }

    /**
     * Get 多模型返回结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OtherModelScores 多模型返回结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FinanceOtherModelScores [] getOtherModelScores() {
        return this.OtherModelScores;
    }

    /**
     * Set 多模型返回结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param OtherModelScores 多模型返回结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOtherModelScores(FinanceOtherModelScores [] OtherModelScores) {
        this.OtherModelScores = OtherModelScores;
    }

    /**
     * Get 业务侧错误码。成功时返回0，错误时返回非0值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Code 业务侧错误码。成功时返回0，错误时返回非0值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 业务侧错误码。成功时返回0，错误时返回非0值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Code 业务侧错误码。成功时返回0，错误时返回非0值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 业务侧错误信息。成功时返回Success，错误时返回具体业务错误原因。
注意：此字段可能返回 null，表示取不到有效值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message 业务侧错误信息。成功时返回Success，错误时返回具体业务错误原因。
注意：此字段可能返回 null，表示取不到有效值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 业务侧错误信息。成功时返回Success，错误时返回具体业务错误原因。
注意：此字段可能返回 null，表示取不到有效值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 业务侧错误信息。成功时返回Success，错误时返回具体业务错误原因。
注意：此字段可能返回 null，表示取不到有效值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public FinanceAntiFraudRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FinanceAntiFraudRecord(FinanceAntiFraudRecord source) {
        if (source.Found != null) {
            this.Found = new String(source.Found);
        }
        if (source.IdFound != null) {
            this.IdFound = new String(source.IdFound);
        }
        if (source.RiskScore != null) {
            this.RiskScore = new String(source.RiskScore);
        }
        if (source.RiskInfo != null) {
            this.RiskInfo = new RiskDetailInfo[source.RiskInfo.length];
            for (int i = 0; i < source.RiskInfo.length; i++) {
                this.RiskInfo[i] = new RiskDetailInfo(source.RiskInfo[i]);
            }
        }
        if (source.OtherModelScores != null) {
            this.OtherModelScores = new FinanceOtherModelScores[source.OtherModelScores.length];
            for (int i = 0; i < source.OtherModelScores.length; i++) {
                this.OtherModelScores[i] = new FinanceOtherModelScores(source.OtherModelScores[i]);
            }
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Found", this.Found);
        this.setParamSimple(map, prefix + "IdFound", this.IdFound);
        this.setParamSimple(map, prefix + "RiskScore", this.RiskScore);
        this.setParamArrayObj(map, prefix + "RiskInfo.", this.RiskInfo);
        this.setParamArrayObj(map, prefix + "OtherModelScores.", this.OtherModelScores);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

