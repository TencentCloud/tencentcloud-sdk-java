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

public class VulDetailInfo extends AbstractModel{

    /**
    * CVE编号
    */
    @SerializedName("CVEID")
    @Expose
    private String CVEID;

    /**
    * 漏洞名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 漏洞标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 漏洞类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CategoryType")
    @Expose
    private String CategoryType;

    /**
    * 漏洞威胁等级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 漏洞披露时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubmitTime")
    @Expose
    private String SubmitTime;

    /**
    * 漏洞描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * CVSS V3描述
    */
    @SerializedName("CVSSV3Desc")
    @Expose
    private String CVSSV3Desc;

    /**
    * 漏洞修复建议
    */
    @SerializedName("OfficialSolution")
    @Expose
    private String OfficialSolution;

    /**
    * 缓解措施
    */
    @SerializedName("DefenseSolution")
    @Expose
    private String DefenseSolution;

    /**
    * 参考链接
    */
    @SerializedName("Reference")
    @Expose
    private String [] Reference;

    /**
    * CVSS V3分数
    */
    @SerializedName("CVSSV3Score")
    @Expose
    private Float CVSSV3Score;

    /**
    * 受漏洞影响的组件列表
    */
    @SerializedName("ComponentList")
    @Expose
    private VulAffectedComponentInfo [] ComponentList;

    /**
    * 影响本地镜像数
    */
    @SerializedName("LocalImageCount")
    @Expose
    private Long LocalImageCount;

    /**
    * 影响容器数
    */
    @SerializedName("ContainerCount")
    @Expose
    private Long ContainerCount;

    /**
    * 影响仓库镜像数
    */
    @SerializedName("RegistryImageCount")
    @Expose
    private Long RegistryImageCount;

    /**
    * 漏洞子类型
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * 影响最新本地镜像数
    */
    @SerializedName("LocalNewestImageCount")
    @Expose
    private Long LocalNewestImageCount;

    /**
    * 影响最新仓库镜像数
    */
    @SerializedName("RegistryNewestImageCount")
    @Expose
    private Long RegistryNewestImageCount;

    /**
    * 漏洞PocID
    */
    @SerializedName("PocID")
    @Expose
    private String PocID;

    /**
    * 防御状态，NO_DEFENDED:未防御，DEFENDED:已防御
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefenceStatus")
    @Expose
    private String DefenceStatus;

    /**
    * 漏洞防御主机范围: MANUAL:自选主机节点，ALL:全部
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefenceScope")
    @Expose
    private String DefenceScope;

    /**
    * 漏洞防御主机数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefenceHostCount")
    @Expose
    private Long DefenceHostCount;

    /**
    * 已防御攻击次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefendedCount")
    @Expose
    private Long DefendedCount;

    /**
    * 是否已扫描，NOT_SCAN:未扫描,SCANNED:已扫描
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScanStatus")
    @Expose
    private String ScanStatus;

    /**
     * Get CVE编号 
     * @return CVEID CVE编号
     */
    public String getCVEID() {
        return this.CVEID;
    }

    /**
     * Set CVE编号
     * @param CVEID CVE编号
     */
    public void setCVEID(String CVEID) {
        this.CVEID = CVEID;
    }

    /**
     * Get 漏洞名称 
     * @return Name 漏洞名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 漏洞名称
     * @param Name 漏洞名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 漏洞标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 漏洞标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 漏洞标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 漏洞标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 漏洞类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CategoryType 漏洞类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCategoryType() {
        return this.CategoryType;
    }

    /**
     * Set 漏洞类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param CategoryType 漏洞类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCategoryType(String CategoryType) {
        this.CategoryType = CategoryType;
    }

    /**
     * Get 漏洞威胁等级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Level 漏洞威胁等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 漏洞威胁等级
注意：此字段可能返回 null，表示取不到有效值。
     * @param Level 漏洞威胁等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 漏洞披露时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubmitTime 漏洞披露时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubmitTime() {
        return this.SubmitTime;
    }

    /**
     * Set 漏洞披露时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubmitTime 漏洞披露时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubmitTime(String SubmitTime) {
        this.SubmitTime = SubmitTime;
    }

    /**
     * Get 漏洞描述 
     * @return Description 漏洞描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 漏洞描述
     * @param Description 漏洞描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get CVSS V3描述 
     * @return CVSSV3Desc CVSS V3描述
     */
    public String getCVSSV3Desc() {
        return this.CVSSV3Desc;
    }

    /**
     * Set CVSS V3描述
     * @param CVSSV3Desc CVSS V3描述
     */
    public void setCVSSV3Desc(String CVSSV3Desc) {
        this.CVSSV3Desc = CVSSV3Desc;
    }

    /**
     * Get 漏洞修复建议 
     * @return OfficialSolution 漏洞修复建议
     */
    public String getOfficialSolution() {
        return this.OfficialSolution;
    }

    /**
     * Set 漏洞修复建议
     * @param OfficialSolution 漏洞修复建议
     */
    public void setOfficialSolution(String OfficialSolution) {
        this.OfficialSolution = OfficialSolution;
    }

    /**
     * Get 缓解措施 
     * @return DefenseSolution 缓解措施
     */
    public String getDefenseSolution() {
        return this.DefenseSolution;
    }

    /**
     * Set 缓解措施
     * @param DefenseSolution 缓解措施
     */
    public void setDefenseSolution(String DefenseSolution) {
        this.DefenseSolution = DefenseSolution;
    }

    /**
     * Get 参考链接 
     * @return Reference 参考链接
     */
    public String [] getReference() {
        return this.Reference;
    }

    /**
     * Set 参考链接
     * @param Reference 参考链接
     */
    public void setReference(String [] Reference) {
        this.Reference = Reference;
    }

    /**
     * Get CVSS V3分数 
     * @return CVSSV3Score CVSS V3分数
     */
    public Float getCVSSV3Score() {
        return this.CVSSV3Score;
    }

    /**
     * Set CVSS V3分数
     * @param CVSSV3Score CVSS V3分数
     */
    public void setCVSSV3Score(Float CVSSV3Score) {
        this.CVSSV3Score = CVSSV3Score;
    }

    /**
     * Get 受漏洞影响的组件列表 
     * @return ComponentList 受漏洞影响的组件列表
     */
    public VulAffectedComponentInfo [] getComponentList() {
        return this.ComponentList;
    }

    /**
     * Set 受漏洞影响的组件列表
     * @param ComponentList 受漏洞影响的组件列表
     */
    public void setComponentList(VulAffectedComponentInfo [] ComponentList) {
        this.ComponentList = ComponentList;
    }

    /**
     * Get 影响本地镜像数 
     * @return LocalImageCount 影响本地镜像数
     */
    public Long getLocalImageCount() {
        return this.LocalImageCount;
    }

    /**
     * Set 影响本地镜像数
     * @param LocalImageCount 影响本地镜像数
     */
    public void setLocalImageCount(Long LocalImageCount) {
        this.LocalImageCount = LocalImageCount;
    }

    /**
     * Get 影响容器数 
     * @return ContainerCount 影响容器数
     */
    public Long getContainerCount() {
        return this.ContainerCount;
    }

    /**
     * Set 影响容器数
     * @param ContainerCount 影响容器数
     */
    public void setContainerCount(Long ContainerCount) {
        this.ContainerCount = ContainerCount;
    }

    /**
     * Get 影响仓库镜像数 
     * @return RegistryImageCount 影响仓库镜像数
     */
    public Long getRegistryImageCount() {
        return this.RegistryImageCount;
    }

    /**
     * Set 影响仓库镜像数
     * @param RegistryImageCount 影响仓库镜像数
     */
    public void setRegistryImageCount(Long RegistryImageCount) {
        this.RegistryImageCount = RegistryImageCount;
    }

    /**
     * Get 漏洞子类型 
     * @return Category 漏洞子类型
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 漏洞子类型
     * @param Category 漏洞子类型
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get 影响最新本地镜像数 
     * @return LocalNewestImageCount 影响最新本地镜像数
     */
    public Long getLocalNewestImageCount() {
        return this.LocalNewestImageCount;
    }

    /**
     * Set 影响最新本地镜像数
     * @param LocalNewestImageCount 影响最新本地镜像数
     */
    public void setLocalNewestImageCount(Long LocalNewestImageCount) {
        this.LocalNewestImageCount = LocalNewestImageCount;
    }

    /**
     * Get 影响最新仓库镜像数 
     * @return RegistryNewestImageCount 影响最新仓库镜像数
     */
    public Long getRegistryNewestImageCount() {
        return this.RegistryNewestImageCount;
    }

    /**
     * Set 影响最新仓库镜像数
     * @param RegistryNewestImageCount 影响最新仓库镜像数
     */
    public void setRegistryNewestImageCount(Long RegistryNewestImageCount) {
        this.RegistryNewestImageCount = RegistryNewestImageCount;
    }

    /**
     * Get 漏洞PocID 
     * @return PocID 漏洞PocID
     */
    public String getPocID() {
        return this.PocID;
    }

    /**
     * Set 漏洞PocID
     * @param PocID 漏洞PocID
     */
    public void setPocID(String PocID) {
        this.PocID = PocID;
    }

    /**
     * Get 防御状态，NO_DEFENDED:未防御，DEFENDED:已防御
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefenceStatus 防御状态，NO_DEFENDED:未防御，DEFENDED:已防御
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDefenceStatus() {
        return this.DefenceStatus;
    }

    /**
     * Set 防御状态，NO_DEFENDED:未防御，DEFENDED:已防御
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefenceStatus 防御状态，NO_DEFENDED:未防御，DEFENDED:已防御
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefenceStatus(String DefenceStatus) {
        this.DefenceStatus = DefenceStatus;
    }

    /**
     * Get 漏洞防御主机范围: MANUAL:自选主机节点，ALL:全部
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefenceScope 漏洞防御主机范围: MANUAL:自选主机节点，ALL:全部
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDefenceScope() {
        return this.DefenceScope;
    }

    /**
     * Set 漏洞防御主机范围: MANUAL:自选主机节点，ALL:全部
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefenceScope 漏洞防御主机范围: MANUAL:自选主机节点，ALL:全部
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefenceScope(String DefenceScope) {
        this.DefenceScope = DefenceScope;
    }

    /**
     * Get 漏洞防御主机数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefenceHostCount 漏洞防御主机数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDefenceHostCount() {
        return this.DefenceHostCount;
    }

    /**
     * Set 漏洞防御主机数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefenceHostCount 漏洞防御主机数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefenceHostCount(Long DefenceHostCount) {
        this.DefenceHostCount = DefenceHostCount;
    }

    /**
     * Get 已防御攻击次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefendedCount 已防御攻击次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDefendedCount() {
        return this.DefendedCount;
    }

    /**
     * Set 已防御攻击次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefendedCount 已防御攻击次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefendedCount(Long DefendedCount) {
        this.DefendedCount = DefendedCount;
    }

    /**
     * Get 是否已扫描，NOT_SCAN:未扫描,SCANNED:已扫描
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScanStatus 是否已扫描，NOT_SCAN:未扫描,SCANNED:已扫描
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScanStatus() {
        return this.ScanStatus;
    }

    /**
     * Set 是否已扫描，NOT_SCAN:未扫描,SCANNED:已扫描
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScanStatus 是否已扫描，NOT_SCAN:未扫描,SCANNED:已扫描
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScanStatus(String ScanStatus) {
        this.ScanStatus = ScanStatus;
    }

    public VulDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulDetailInfo(VulDetailInfo source) {
        if (source.CVEID != null) {
            this.CVEID = new String(source.CVEID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.CategoryType != null) {
            this.CategoryType = new String(source.CategoryType);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.SubmitTime != null) {
            this.SubmitTime = new String(source.SubmitTime);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CVSSV3Desc != null) {
            this.CVSSV3Desc = new String(source.CVSSV3Desc);
        }
        if (source.OfficialSolution != null) {
            this.OfficialSolution = new String(source.OfficialSolution);
        }
        if (source.DefenseSolution != null) {
            this.DefenseSolution = new String(source.DefenseSolution);
        }
        if (source.Reference != null) {
            this.Reference = new String[source.Reference.length];
            for (int i = 0; i < source.Reference.length; i++) {
                this.Reference[i] = new String(source.Reference[i]);
            }
        }
        if (source.CVSSV3Score != null) {
            this.CVSSV3Score = new Float(source.CVSSV3Score);
        }
        if (source.ComponentList != null) {
            this.ComponentList = new VulAffectedComponentInfo[source.ComponentList.length];
            for (int i = 0; i < source.ComponentList.length; i++) {
                this.ComponentList[i] = new VulAffectedComponentInfo(source.ComponentList[i]);
            }
        }
        if (source.LocalImageCount != null) {
            this.LocalImageCount = new Long(source.LocalImageCount);
        }
        if (source.ContainerCount != null) {
            this.ContainerCount = new Long(source.ContainerCount);
        }
        if (source.RegistryImageCount != null) {
            this.RegistryImageCount = new Long(source.RegistryImageCount);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.LocalNewestImageCount != null) {
            this.LocalNewestImageCount = new Long(source.LocalNewestImageCount);
        }
        if (source.RegistryNewestImageCount != null) {
            this.RegistryNewestImageCount = new Long(source.RegistryNewestImageCount);
        }
        if (source.PocID != null) {
            this.PocID = new String(source.PocID);
        }
        if (source.DefenceStatus != null) {
            this.DefenceStatus = new String(source.DefenceStatus);
        }
        if (source.DefenceScope != null) {
            this.DefenceScope = new String(source.DefenceScope);
        }
        if (source.DefenceHostCount != null) {
            this.DefenceHostCount = new Long(source.DefenceHostCount);
        }
        if (source.DefendedCount != null) {
            this.DefendedCount = new Long(source.DefendedCount);
        }
        if (source.ScanStatus != null) {
            this.ScanStatus = new String(source.ScanStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CVEID", this.CVEID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "CategoryType", this.CategoryType);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "SubmitTime", this.SubmitTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CVSSV3Desc", this.CVSSV3Desc);
        this.setParamSimple(map, prefix + "OfficialSolution", this.OfficialSolution);
        this.setParamSimple(map, prefix + "DefenseSolution", this.DefenseSolution);
        this.setParamArraySimple(map, prefix + "Reference.", this.Reference);
        this.setParamSimple(map, prefix + "CVSSV3Score", this.CVSSV3Score);
        this.setParamArrayObj(map, prefix + "ComponentList.", this.ComponentList);
        this.setParamSimple(map, prefix + "LocalImageCount", this.LocalImageCount);
        this.setParamSimple(map, prefix + "ContainerCount", this.ContainerCount);
        this.setParamSimple(map, prefix + "RegistryImageCount", this.RegistryImageCount);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "LocalNewestImageCount", this.LocalNewestImageCount);
        this.setParamSimple(map, prefix + "RegistryNewestImageCount", this.RegistryNewestImageCount);
        this.setParamSimple(map, prefix + "PocID", this.PocID);
        this.setParamSimple(map, prefix + "DefenceStatus", this.DefenceStatus);
        this.setParamSimple(map, prefix + "DefenceScope", this.DefenceScope);
        this.setParamSimple(map, prefix + "DefenceHostCount", this.DefenceHostCount);
        this.setParamSimple(map, prefix + "DefendedCount", this.DefendedCount);
        this.setParamSimple(map, prefix + "ScanStatus", this.ScanStatus);

    }
}

