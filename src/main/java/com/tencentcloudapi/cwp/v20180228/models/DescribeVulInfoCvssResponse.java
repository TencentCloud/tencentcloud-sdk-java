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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulInfoCvssResponse extends AbstractModel{

    /**
    * 漏洞id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * 漏洞名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * 危害等级：1-低危；2-中危；3-高危；4-严重
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VulLevel")
    @Expose
    private Long VulLevel;

    /**
    * 漏洞分类 1: web-cms漏洞 2:应用漏洞  4: Linux软件漏洞 5: Windows系统漏洞
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VulType")
    @Expose
    private Long VulType;

    /**
    * 漏洞描述信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 修复方案
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RepairPlan")
    @Expose
    private String RepairPlan;

    /**
    * 漏洞CVEID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CveId")
    @Expose
    private String CveId;

    /**
    * 参考链接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Reference")
    @Expose
    private String Reference;

    /**
    * CVSS信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CVSS")
    @Expose
    private String CVSS;

    /**
    * 发布时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicDate")
    @Expose
    private String PublicDate;

    /**
    * Cvss分数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CvssScore")
    @Expose
    private Long CvssScore;

    /**
    * cvss详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CveInfo")
    @Expose
    private String CveInfo;

    /**
    * cvss 分数 浮点型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CvssScoreFloat")
    @Expose
    private Float CvssScoreFloat;

    /**
    * 漏洞标签 多个逗号分割
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Labels")
    @Expose
    private String Labels;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 漏洞id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VulId 漏洞id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set 漏洞id
注意：此字段可能返回 null，表示取不到有效值。
     * @param VulId 漏洞id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    /**
     * Get 漏洞名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VulName 漏洞名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set 漏洞名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param VulName 漏洞名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get 危害等级：1-低危；2-中危；3-高危；4-严重
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VulLevel 危害等级：1-低危；2-中危；3-高危；4-严重
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVulLevel() {
        return this.VulLevel;
    }

    /**
     * Set 危害等级：1-低危；2-中危；3-高危；4-严重
注意：此字段可能返回 null，表示取不到有效值。
     * @param VulLevel 危害等级：1-低危；2-中危；3-高危；4-严重
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVulLevel(Long VulLevel) {
        this.VulLevel = VulLevel;
    }

    /**
     * Get 漏洞分类 1: web-cms漏洞 2:应用漏洞  4: Linux软件漏洞 5: Windows系统漏洞
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VulType 漏洞分类 1: web-cms漏洞 2:应用漏洞  4: Linux软件漏洞 5: Windows系统漏洞
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVulType() {
        return this.VulType;
    }

    /**
     * Set 漏洞分类 1: web-cms漏洞 2:应用漏洞  4: Linux软件漏洞 5: Windows系统漏洞
注意：此字段可能返回 null，表示取不到有效值。
     * @param VulType 漏洞分类 1: web-cms漏洞 2:应用漏洞  4: Linux软件漏洞 5: Windows系统漏洞
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVulType(Long VulType) {
        this.VulType = VulType;
    }

    /**
     * Get 漏洞描述信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 漏洞描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 漏洞描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 漏洞描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 修复方案
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RepairPlan 修复方案
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRepairPlan() {
        return this.RepairPlan;
    }

    /**
     * Set 修复方案
注意：此字段可能返回 null，表示取不到有效值。
     * @param RepairPlan 修复方案
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepairPlan(String RepairPlan) {
        this.RepairPlan = RepairPlan;
    }

    /**
     * Get 漏洞CVEID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CveId 漏洞CVEID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCveId() {
        return this.CveId;
    }

    /**
     * Set 漏洞CVEID
注意：此字段可能返回 null，表示取不到有效值。
     * @param CveId 漏洞CVEID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCveId(String CveId) {
        this.CveId = CveId;
    }

    /**
     * Get 参考链接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Reference 参考链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReference() {
        return this.Reference;
    }

    /**
     * Set 参考链接
注意：此字段可能返回 null，表示取不到有效值。
     * @param Reference 参考链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReference(String Reference) {
        this.Reference = Reference;
    }

    /**
     * Get CVSS信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CVSS CVSS信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCVSS() {
        return this.CVSS;
    }

    /**
     * Set CVSS信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param CVSS CVSS信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCVSS(String CVSS) {
        this.CVSS = CVSS;
    }

    /**
     * Get 发布时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicDate 发布时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicDate() {
        return this.PublicDate;
    }

    /**
     * Set 发布时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicDate 发布时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicDate(String PublicDate) {
        this.PublicDate = PublicDate;
    }

    /**
     * Get Cvss分数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CvssScore Cvss分数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCvssScore() {
        return this.CvssScore;
    }

    /**
     * Set Cvss分数
注意：此字段可能返回 null，表示取不到有效值。
     * @param CvssScore Cvss分数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCvssScore(Long CvssScore) {
        this.CvssScore = CvssScore;
    }

    /**
     * Get cvss详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CveInfo cvss详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCveInfo() {
        return this.CveInfo;
    }

    /**
     * Set cvss详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param CveInfo cvss详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCveInfo(String CveInfo) {
        this.CveInfo = CveInfo;
    }

    /**
     * Get cvss 分数 浮点型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CvssScoreFloat cvss 分数 浮点型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getCvssScoreFloat() {
        return this.CvssScoreFloat;
    }

    /**
     * Set cvss 分数 浮点型
注意：此字段可能返回 null，表示取不到有效值。
     * @param CvssScoreFloat cvss 分数 浮点型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCvssScoreFloat(Float CvssScoreFloat) {
        this.CvssScoreFloat = CvssScoreFloat;
    }

    /**
     * Get 漏洞标签 多个逗号分割
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Labels 漏洞标签 多个逗号分割
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabels() {
        return this.Labels;
    }

    /**
     * Set 漏洞标签 多个逗号分割
注意：此字段可能返回 null，表示取不到有效值。
     * @param Labels 漏洞标签 多个逗号分割
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabels(String Labels) {
        this.Labels = Labels;
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

    public DescribeVulInfoCvssResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulInfoCvssResponse(DescribeVulInfoCvssResponse source) {
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.VulLevel != null) {
            this.VulLevel = new Long(source.VulLevel);
        }
        if (source.VulType != null) {
            this.VulType = new Long(source.VulType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RepairPlan != null) {
            this.RepairPlan = new String(source.RepairPlan);
        }
        if (source.CveId != null) {
            this.CveId = new String(source.CveId);
        }
        if (source.Reference != null) {
            this.Reference = new String(source.Reference);
        }
        if (source.CVSS != null) {
            this.CVSS = new String(source.CVSS);
        }
        if (source.PublicDate != null) {
            this.PublicDate = new String(source.PublicDate);
        }
        if (source.CvssScore != null) {
            this.CvssScore = new Long(source.CvssScore);
        }
        if (source.CveInfo != null) {
            this.CveInfo = new String(source.CveInfo);
        }
        if (source.CvssScoreFloat != null) {
            this.CvssScoreFloat = new Float(source.CvssScoreFloat);
        }
        if (source.Labels != null) {
            this.Labels = new String(source.Labels);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "VulLevel", this.VulLevel);
        this.setParamSimple(map, prefix + "VulType", this.VulType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RepairPlan", this.RepairPlan);
        this.setParamSimple(map, prefix + "CveId", this.CveId);
        this.setParamSimple(map, prefix + "Reference", this.Reference);
        this.setParamSimple(map, prefix + "CVSS", this.CVSS);
        this.setParamSimple(map, prefix + "PublicDate", this.PublicDate);
        this.setParamSimple(map, prefix + "CvssScore", this.CvssScore);
        this.setParamSimple(map, prefix + "CveInfo", this.CveInfo);
        this.setParamSimple(map, prefix + "CvssScoreFloat", this.CvssScoreFloat);
        this.setParamSimple(map, prefix + "Labels", this.Labels);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

