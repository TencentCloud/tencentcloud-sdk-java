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

public class DescribeVirusAutoIsolateSampleDetailResponse extends AbstractModel{

    /**
    * 文件Md5值
    */
    @SerializedName("MD5")
    @Expose
    private String MD5;

    /**
    * 文件大小(B)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 病毒名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VirusName")
    @Expose
    private String VirusName;

    /**
    * 风险等级 RISK_CRITICAL, RISK_HIGH, RISK_MEDIUM, RISK_LOW, RISK_NOTICE。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * 查杀引擎
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KillEngine")
    @Expose
    private String [] KillEngine;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 事件描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HarmDescribe")
    @Expose
    private String HarmDescribe;

    /**
    * 建议方案
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuggestScheme")
    @Expose
    private String SuggestScheme;

    /**
    * 参考链接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReferenceLink")
    @Expose
    private String ReferenceLink;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 文件Md5值 
     * @return MD5 文件Md5值
     */
    public String getMD5() {
        return this.MD5;
    }

    /**
     * Set 文件Md5值
     * @param MD5 文件Md5值
     */
    public void setMD5(String MD5) {
        this.MD5 = MD5;
    }

    /**
     * Get 文件大小(B)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Size 文件大小(B)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 文件大小(B)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Size 文件大小(B)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 病毒名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VirusName 病毒名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVirusName() {
        return this.VirusName;
    }

    /**
     * Set 病毒名
注意：此字段可能返回 null，表示取不到有效值。
     * @param VirusName 病毒名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVirusName(String VirusName) {
        this.VirusName = VirusName;
    }

    /**
     * Get 风险等级 RISK_CRITICAL, RISK_HIGH, RISK_MEDIUM, RISK_LOW, RISK_NOTICE。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskLevel 风险等级 RISK_CRITICAL, RISK_HIGH, RISK_MEDIUM, RISK_LOW, RISK_NOTICE。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 风险等级 RISK_CRITICAL, RISK_HIGH, RISK_MEDIUM, RISK_LOW, RISK_NOTICE。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskLevel 风险等级 RISK_CRITICAL, RISK_HIGH, RISK_MEDIUM, RISK_LOW, RISK_NOTICE。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 查杀引擎
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KillEngine 查杀引擎
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getKillEngine() {
        return this.KillEngine;
    }

    /**
     * Set 查杀引擎
注意：此字段可能返回 null，表示取不到有效值。
     * @param KillEngine 查杀引擎
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKillEngine(String [] KillEngine) {
        this.KillEngine = KillEngine;
    }

    /**
     * Get 标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 事件描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HarmDescribe 事件描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHarmDescribe() {
        return this.HarmDescribe;
    }

    /**
     * Set 事件描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param HarmDescribe 事件描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHarmDescribe(String HarmDescribe) {
        this.HarmDescribe = HarmDescribe;
    }

    /**
     * Get 建议方案
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuggestScheme 建议方案
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSuggestScheme() {
        return this.SuggestScheme;
    }

    /**
     * Set 建议方案
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuggestScheme 建议方案
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuggestScheme(String SuggestScheme) {
        this.SuggestScheme = SuggestScheme;
    }

    /**
     * Get 参考链接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReferenceLink 参考链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReferenceLink() {
        return this.ReferenceLink;
    }

    /**
     * Set 参考链接
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReferenceLink 参考链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReferenceLink(String ReferenceLink) {
        this.ReferenceLink = ReferenceLink;
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

    public DescribeVirusAutoIsolateSampleDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVirusAutoIsolateSampleDetailResponse(DescribeVirusAutoIsolateSampleDetailResponse source) {
        if (source.MD5 != null) {
            this.MD5 = new String(source.MD5);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.VirusName != null) {
            this.VirusName = new String(source.VirusName);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.KillEngine != null) {
            this.KillEngine = new String[source.KillEngine.length];
            for (int i = 0; i < source.KillEngine.length; i++) {
                this.KillEngine[i] = new String(source.KillEngine[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.HarmDescribe != null) {
            this.HarmDescribe = new String(source.HarmDescribe);
        }
        if (source.SuggestScheme != null) {
            this.SuggestScheme = new String(source.SuggestScheme);
        }
        if (source.ReferenceLink != null) {
            this.ReferenceLink = new String(source.ReferenceLink);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MD5", this.MD5);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "VirusName", this.VirusName);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamArraySimple(map, prefix + "KillEngine.", this.KillEngine);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "HarmDescribe", this.HarmDescribe);
        this.setParamSimple(map, prefix + "SuggestScheme", this.SuggestScheme);
        this.setParamSimple(map, prefix + "ReferenceLink", this.ReferenceLink);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

