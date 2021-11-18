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

public class AntiFraudRecord extends AbstractModel{

    /**
    * 公共错误码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 业务侧错误码。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CodeDesc")
    @Expose
    private String CodeDesc;

    /**
    * 业务侧错误信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 表示该条记录能否查到：1 为能查到；-1 为查不到，此时 RiskScore 返回-1；
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Found")
    @Expose
    private String Found;

    /**
    * 表示该条记录中的身份 ID 能否查到
1 为能查到
-1 为查不到
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdFound")
    @Expose
    private String IdFound;

    /**
    * 当可查到时，返回 0~100 区间，值越高 欺诈可
能性越大。
当查不到时（即 found=-1），返回-1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskScore")
    @Expose
    private String RiskScore;

    /**
    * 扩展字段，对风险类型的说明。扩展字段并非必
然出现。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskInfo")
    @Expose
    private SimpleKindRiskDetail [] RiskInfo;

    /**
    * 默认出现，提供模型版本号说明及多模型返回需
要时用到；
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OtherModelScores")
    @Expose
    private OtherModelScoresDetail [] OtherModelScores;

    /**
    * 表示请求时间，标准 sunix 时间戳，非必然出现
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PostTime")
    @Expose
    private String PostTime;

    /**
    * 拓展字段，非必然出现，和 ExtensionIn 对应；
注：非必然出现，需要返回时天御侧将说明；
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtensionOut")
    @Expose
    private String ExtensionOut;

    /**
     * Get 公共错误码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Code 公共错误码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 公共错误码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Code 公共错误码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 业务侧错误码。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CodeDesc 业务侧错误码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCodeDesc() {
        return this.CodeDesc;
    }

    /**
     * Set 业务侧错误码。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CodeDesc 业务侧错误码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodeDesc(String CodeDesc) {
        this.CodeDesc = CodeDesc;
    }

    /**
     * Get 业务侧错误信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message 业务侧错误信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 业务侧错误信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 业务侧错误信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 表示该条记录能否查到：1 为能查到；-1 为查不到，此时 RiskScore 返回-1；
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Found 表示该条记录能否查到：1 为能查到；-1 为查不到，此时 RiskScore 返回-1；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFound() {
        return this.Found;
    }

    /**
     * Set 表示该条记录能否查到：1 为能查到；-1 为查不到，此时 RiskScore 返回-1；
注意：此字段可能返回 null，表示取不到有效值。
     * @param Found 表示该条记录能否查到：1 为能查到；-1 为查不到，此时 RiskScore 返回-1；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFound(String Found) {
        this.Found = Found;
    }

    /**
     * Get 表示该条记录中的身份 ID 能否查到
1 为能查到
-1 为查不到
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdFound 表示该条记录中的身份 ID 能否查到
1 为能查到
-1 为查不到
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdFound() {
        return this.IdFound;
    }

    /**
     * Set 表示该条记录中的身份 ID 能否查到
1 为能查到
-1 为查不到
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdFound 表示该条记录中的身份 ID 能否查到
1 为能查到
-1 为查不到
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdFound(String IdFound) {
        this.IdFound = IdFound;
    }

    /**
     * Get 当可查到时，返回 0~100 区间，值越高 欺诈可
能性越大。
当查不到时（即 found=-1），返回-1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskScore 当可查到时，返回 0~100 区间，值越高 欺诈可
能性越大。
当查不到时（即 found=-1），返回-1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRiskScore() {
        return this.RiskScore;
    }

    /**
     * Set 当可查到时，返回 0~100 区间，值越高 欺诈可
能性越大。
当查不到时（即 found=-1），返回-1
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskScore 当可查到时，返回 0~100 区间，值越高 欺诈可
能性越大。
当查不到时（即 found=-1），返回-1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskScore(String RiskScore) {
        this.RiskScore = RiskScore;
    }

    /**
     * Get 扩展字段，对风险类型的说明。扩展字段并非必
然出现。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskInfo 扩展字段，对风险类型的说明。扩展字段并非必
然出现。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SimpleKindRiskDetail [] getRiskInfo() {
        return this.RiskInfo;
    }

    /**
     * Set 扩展字段，对风险类型的说明。扩展字段并非必
然出现。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskInfo 扩展字段，对风险类型的说明。扩展字段并非必
然出现。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskInfo(SimpleKindRiskDetail [] RiskInfo) {
        this.RiskInfo = RiskInfo;
    }

    /**
     * Get 默认出现，提供模型版本号说明及多模型返回需
要时用到；
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OtherModelScores 默认出现，提供模型版本号说明及多模型返回需
要时用到；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OtherModelScoresDetail [] getOtherModelScores() {
        return this.OtherModelScores;
    }

    /**
     * Set 默认出现，提供模型版本号说明及多模型返回需
要时用到；
注意：此字段可能返回 null，表示取不到有效值。
     * @param OtherModelScores 默认出现，提供模型版本号说明及多模型返回需
要时用到；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOtherModelScores(OtherModelScoresDetail [] OtherModelScores) {
        this.OtherModelScores = OtherModelScores;
    }

    /**
     * Get 表示请求时间，标准 sunix 时间戳，非必然出现
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PostTime 表示请求时间，标准 sunix 时间戳，非必然出现
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPostTime() {
        return this.PostTime;
    }

    /**
     * Set 表示请求时间，标准 sunix 时间戳，非必然出现
注意：此字段可能返回 null，表示取不到有效值。
     * @param PostTime 表示请求时间，标准 sunix 时间戳，非必然出现
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPostTime(String PostTime) {
        this.PostTime = PostTime;
    }

    /**
     * Get 拓展字段，非必然出现，和 ExtensionIn 对应；
注：非必然出现，需要返回时天御侧将说明；
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtensionOut 拓展字段，非必然出现，和 ExtensionIn 对应；
注：非必然出现，需要返回时天御侧将说明；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtensionOut() {
        return this.ExtensionOut;
    }

    /**
     * Set 拓展字段，非必然出现，和 ExtensionIn 对应；
注：非必然出现，需要返回时天御侧将说明；
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtensionOut 拓展字段，非必然出现，和 ExtensionIn 对应；
注：非必然出现，需要返回时天御侧将说明；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtensionOut(String ExtensionOut) {
        this.ExtensionOut = ExtensionOut;
    }

    public AntiFraudRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AntiFraudRecord(AntiFraudRecord source) {
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.CodeDesc != null) {
            this.CodeDesc = new String(source.CodeDesc);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
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
            this.RiskInfo = new SimpleKindRiskDetail[source.RiskInfo.length];
            for (int i = 0; i < source.RiskInfo.length; i++) {
                this.RiskInfo[i] = new SimpleKindRiskDetail(source.RiskInfo[i]);
            }
        }
        if (source.OtherModelScores != null) {
            this.OtherModelScores = new OtherModelScoresDetail[source.OtherModelScores.length];
            for (int i = 0; i < source.OtherModelScores.length; i++) {
                this.OtherModelScores[i] = new OtherModelScoresDetail(source.OtherModelScores[i]);
            }
        }
        if (source.PostTime != null) {
            this.PostTime = new String(source.PostTime);
        }
        if (source.ExtensionOut != null) {
            this.ExtensionOut = new String(source.ExtensionOut);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "CodeDesc", this.CodeDesc);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Found", this.Found);
        this.setParamSimple(map, prefix + "IdFound", this.IdFound);
        this.setParamSimple(map, prefix + "RiskScore", this.RiskScore);
        this.setParamArrayObj(map, prefix + "RiskInfo.", this.RiskInfo);
        this.setParamArrayObj(map, prefix + "OtherModelScores.", this.OtherModelScores);
        this.setParamSimple(map, prefix + "PostTime", this.PostTime);
        this.setParamSimple(map, prefix + "ExtensionOut", this.ExtensionOut);

    }
}

