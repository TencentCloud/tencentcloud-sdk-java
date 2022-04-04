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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulDetailResponse extends AbstractModel{

    /**
    * 漏洞类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VulType")
    @Expose
    private Long VulType;

    /**
    * 漏洞子类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubVulType")
    @Expose
    private String SubVulType;

    /**
    * cvss分数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CvssScore")
    @Expose
    private String CvssScore;

    /**
    * cvss值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cvss")
    @Expose
    private String Cvss;

    /**
    * cve编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cve")
    @Expose
    private String Cve;

    /**
    * cnvd编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cnvd")
    @Expose
    private String Cnvd;

    /**
    * cnnvd编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cnnvd")
    @Expose
    private String Cnnvd;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 参考
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Reference")
    @Expose
    private String Reference;

    /**
    * 修复意见
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Repair")
    @Expose
    private String Repair;

    /**
    * 披露时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReleaseTime")
    @Expose
    private String ReleaseTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 漏洞名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 等级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 受影响资产唯一标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImpactAsset")
    @Expose
    private String ImpactAsset;

    /**
    * 受影响资产名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImpactAssetName")
    @Expose
    private String ImpactAssetName;

    /**
    * 受影响资产是否已删除
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsAssetDeleted")
    @Expose
    private Boolean IsAssetDeleted;

    /**
    * 漏洞来源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 漏洞URL
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VulUrl")
    @Expose
    private String VulUrl;

    /**
    * 资产归属
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SsaAssetCategory")
    @Expose
    private Long SsaAssetCategory;

    /**
    * 资产文件路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VulPath")
    @Expose
    private String VulPath;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 漏洞类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VulType 漏洞类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVulType() {
        return this.VulType;
    }

    /**
     * Set 漏洞类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param VulType 漏洞类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVulType(Long VulType) {
        this.VulType = VulType;
    }

    /**
     * Get 漏洞子类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubVulType 漏洞子类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubVulType() {
        return this.SubVulType;
    }

    /**
     * Set 漏洞子类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubVulType 漏洞子类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubVulType(String SubVulType) {
        this.SubVulType = SubVulType;
    }

    /**
     * Get cvss分数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CvssScore cvss分数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCvssScore() {
        return this.CvssScore;
    }

    /**
     * Set cvss分数
注意：此字段可能返回 null，表示取不到有效值。
     * @param CvssScore cvss分数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCvssScore(String CvssScore) {
        this.CvssScore = CvssScore;
    }

    /**
     * Get cvss值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cvss cvss值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCvss() {
        return this.Cvss;
    }

    /**
     * Set cvss值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cvss cvss值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCvss(String Cvss) {
        this.Cvss = Cvss;
    }

    /**
     * Get cve编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cve cve编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCve() {
        return this.Cve;
    }

    /**
     * Set cve编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cve cve编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCve(String Cve) {
        this.Cve = Cve;
    }

    /**
     * Get cnvd编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cnvd cnvd编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCnvd() {
        return this.Cnvd;
    }

    /**
     * Set cnvd编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cnvd cnvd编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCnvd(String Cnvd) {
        this.Cnvd = Cnvd;
    }

    /**
     * Get cnnvd编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cnnvd cnnvd编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCnnvd() {
        return this.Cnnvd;
    }

    /**
     * Set cnnvd编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cnnvd cnnvd编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCnnvd(String Cnnvd) {
        this.Cnnvd = Cnnvd;
    }

    /**
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Desc 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Desc 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 参考
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Reference 参考
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReference() {
        return this.Reference;
    }

    /**
     * Set 参考
注意：此字段可能返回 null，表示取不到有效值。
     * @param Reference 参考
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReference(String Reference) {
        this.Reference = Reference;
    }

    /**
     * Get 修复意见
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Repair 修复意见
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRepair() {
        return this.Repair;
    }

    /**
     * Set 修复意见
注意：此字段可能返回 null，表示取不到有效值。
     * @param Repair 修复意见
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepair(String Repair) {
        this.Repair = Repair;
    }

    /**
     * Get 披露时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReleaseTime 披露时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReleaseTime() {
        return this.ReleaseTime;
    }

    /**
     * Set 披露时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReleaseTime 披露时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReleaseTime(String ReleaseTime) {
        this.ReleaseTime = ReleaseTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 漏洞名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 漏洞名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 漏洞名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 漏洞名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 等级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Level 等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 等级
注意：此字段可能返回 null，表示取不到有效值。
     * @param Level 等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 受影响资产唯一标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImpactAsset 受影响资产唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImpactAsset() {
        return this.ImpactAsset;
    }

    /**
     * Set 受影响资产唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImpactAsset 受影响资产唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImpactAsset(String ImpactAsset) {
        this.ImpactAsset = ImpactAsset;
    }

    /**
     * Get 受影响资产名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImpactAssetName 受影响资产名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImpactAssetName() {
        return this.ImpactAssetName;
    }

    /**
     * Set 受影响资产名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImpactAssetName 受影响资产名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImpactAssetName(String ImpactAssetName) {
        this.ImpactAssetName = ImpactAssetName;
    }

    /**
     * Get 受影响资产是否已删除
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsAssetDeleted 受影响资产是否已删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsAssetDeleted() {
        return this.IsAssetDeleted;
    }

    /**
     * Set 受影响资产是否已删除
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsAssetDeleted 受影响资产是否已删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsAssetDeleted(Boolean IsAssetDeleted) {
        this.IsAssetDeleted = IsAssetDeleted;
    }

    /**
     * Get 漏洞来源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Source 漏洞来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 漏洞来源
注意：此字段可能返回 null，表示取不到有效值。
     * @param Source 漏洞来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 漏洞URL
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VulUrl 漏洞URL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVulUrl() {
        return this.VulUrl;
    }

    /**
     * Set 漏洞URL
注意：此字段可能返回 null，表示取不到有效值。
     * @param VulUrl 漏洞URL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVulUrl(String VulUrl) {
        this.VulUrl = VulUrl;
    }

    /**
     * Get 资产归属
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SsaAssetCategory 资产归属
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSsaAssetCategory() {
        return this.SsaAssetCategory;
    }

    /**
     * Set 资产归属
注意：此字段可能返回 null，表示取不到有效值。
     * @param SsaAssetCategory 资产归属
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSsaAssetCategory(Long SsaAssetCategory) {
        this.SsaAssetCategory = SsaAssetCategory;
    }

    /**
     * Get 资产文件路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VulPath 资产文件路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVulPath() {
        return this.VulPath;
    }

    /**
     * Set 资产文件路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param VulPath 资产文件路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVulPath(String VulPath) {
        this.VulPath = VulPath;
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

    public DescribeVulDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulDetailResponse(DescribeVulDetailResponse source) {
        if (source.VulType != null) {
            this.VulType = new Long(source.VulType);
        }
        if (source.SubVulType != null) {
            this.SubVulType = new String(source.SubVulType);
        }
        if (source.CvssScore != null) {
            this.CvssScore = new String(source.CvssScore);
        }
        if (source.Cvss != null) {
            this.Cvss = new String(source.Cvss);
        }
        if (source.Cve != null) {
            this.Cve = new String(source.Cve);
        }
        if (source.Cnvd != null) {
            this.Cnvd = new String(source.Cnvd);
        }
        if (source.Cnnvd != null) {
            this.Cnnvd = new String(source.Cnnvd);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Reference != null) {
            this.Reference = new String(source.Reference);
        }
        if (source.Repair != null) {
            this.Repair = new String(source.Repair);
        }
        if (source.ReleaseTime != null) {
            this.ReleaseTime = new String(source.ReleaseTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ImpactAsset != null) {
            this.ImpactAsset = new String(source.ImpactAsset);
        }
        if (source.ImpactAssetName != null) {
            this.ImpactAssetName = new String(source.ImpactAssetName);
        }
        if (source.IsAssetDeleted != null) {
            this.IsAssetDeleted = new Boolean(source.IsAssetDeleted);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.VulUrl != null) {
            this.VulUrl = new String(source.VulUrl);
        }
        if (source.SsaAssetCategory != null) {
            this.SsaAssetCategory = new Long(source.SsaAssetCategory);
        }
        if (source.VulPath != null) {
            this.VulPath = new String(source.VulPath);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulType", this.VulType);
        this.setParamSimple(map, prefix + "SubVulType", this.SubVulType);
        this.setParamSimple(map, prefix + "CvssScore", this.CvssScore);
        this.setParamSimple(map, prefix + "Cvss", this.Cvss);
        this.setParamSimple(map, prefix + "Cve", this.Cve);
        this.setParamSimple(map, prefix + "Cnvd", this.Cnvd);
        this.setParamSimple(map, prefix + "Cnnvd", this.Cnnvd);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Reference", this.Reference);
        this.setParamSimple(map, prefix + "Repair", this.Repair);
        this.setParamSimple(map, prefix + "ReleaseTime", this.ReleaseTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ImpactAsset", this.ImpactAsset);
        this.setParamSimple(map, prefix + "ImpactAssetName", this.ImpactAssetName);
        this.setParamSimple(map, prefix + "IsAssetDeleted", this.IsAssetDeleted);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "VulUrl", this.VulUrl);
        this.setParamSimple(map, prefix + "SsaAssetCategory", this.SsaAssetCategory);
        this.setParamSimple(map, prefix + "VulPath", this.VulPath);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

