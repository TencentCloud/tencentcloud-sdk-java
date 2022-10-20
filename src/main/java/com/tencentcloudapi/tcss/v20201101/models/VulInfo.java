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

public class VulInfo extends AbstractModel{

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
    * CVSS V3分数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CVSSV3Score")
    @Expose
    private Float CVSSV3Score;

    /**
    * 风险等级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * CVE编号
    */
    @SerializedName("CVEID")
    @Expose
    private String CVEID;

    /**
    * 漏洞子类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * 首次发现时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FoundTime")
    @Expose
    private String FoundTime;

    /**
    * 最近发现时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestFoundTime")
    @Expose
    private String LatestFoundTime;

    /**
    * 漏洞ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 影响本地镜像数
    */
    @SerializedName("LocalImageCount")
    @Expose
    private Long LocalImageCount;

    /**
    * 影响容器数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContainerCount")
    @Expose
    private Long ContainerCount;

    /**
    * 影响仓库镜像数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegistryImageCount")
    @Expose
    private Long RegistryImageCount;

    /**
    * 漏洞PocID
注意：此字段可能返回 null，表示取不到有效值。
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
     * Get CVSS V3分数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CVSSV3Score CVSS V3分数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getCVSSV3Score() {
        return this.CVSSV3Score;
    }

    /**
     * Set CVSS V3分数
注意：此字段可能返回 null，表示取不到有效值。
     * @param CVSSV3Score CVSS V3分数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCVSSV3Score(Float CVSSV3Score) {
        this.CVSSV3Score = CVSSV3Score;
    }

    /**
     * Get 风险等级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Level 风险等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 风险等级
注意：此字段可能返回 null，表示取不到有效值。
     * @param Level 风险等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

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
     * Get 漏洞子类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Category 漏洞子类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 漏洞子类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Category 漏洞子类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get 首次发现时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FoundTime 首次发现时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFoundTime() {
        return this.FoundTime;
    }

    /**
     * Set 首次发现时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param FoundTime 首次发现时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFoundTime(String FoundTime) {
        this.FoundTime = FoundTime;
    }

    /**
     * Get 最近发现时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestFoundTime 最近发现时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestFoundTime() {
        return this.LatestFoundTime;
    }

    /**
     * Set 最近发现时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestFoundTime 最近发现时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestFoundTime(String LatestFoundTime) {
        this.LatestFoundTime = LatestFoundTime;
    }

    /**
     * Get 漏洞ID 
     * @return ID 漏洞ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 漏洞ID
     * @param ID 漏洞ID
     */
    public void setID(Long ID) {
        this.ID = ID;
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContainerCount 影响容器数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getContainerCount() {
        return this.ContainerCount;
    }

    /**
     * Set 影响容器数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContainerCount 影响容器数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContainerCount(Long ContainerCount) {
        this.ContainerCount = ContainerCount;
    }

    /**
     * Get 影响仓库镜像数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegistryImageCount 影响仓库镜像数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRegistryImageCount() {
        return this.RegistryImageCount;
    }

    /**
     * Set 影响仓库镜像数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegistryImageCount 影响仓库镜像数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegistryImageCount(Long RegistryImageCount) {
        this.RegistryImageCount = RegistryImageCount;
    }

    /**
     * Get 漏洞PocID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PocID 漏洞PocID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPocID() {
        return this.PocID;
    }

    /**
     * Set 漏洞PocID
注意：此字段可能返回 null，表示取不到有效值。
     * @param PocID 漏洞PocID
注意：此字段可能返回 null，表示取不到有效值。
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

    public VulInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulInfo(VulInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.CVSSV3Score != null) {
            this.CVSSV3Score = new Float(source.CVSSV3Score);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.CVEID != null) {
            this.CVEID = new String(source.CVEID);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.FoundTime != null) {
            this.FoundTime = new String(source.FoundTime);
        }
        if (source.LatestFoundTime != null) {
            this.LatestFoundTime = new String(source.LatestFoundTime);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "CVSSV3Score", this.CVSSV3Score);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "CVEID", this.CVEID);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "FoundTime", this.FoundTime);
        this.setParamSimple(map, prefix + "LatestFoundTime", this.LatestFoundTime);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "LocalImageCount", this.LocalImageCount);
        this.setParamSimple(map, prefix + "ContainerCount", this.ContainerCount);
        this.setParamSimple(map, prefix + "RegistryImageCount", this.RegistryImageCount);
        this.setParamSimple(map, prefix + "PocID", this.PocID);
        this.setParamSimple(map, prefix + "DefenceStatus", this.DefenceStatus);
        this.setParamSimple(map, prefix + "DefenceScope", this.DefenceScope);
        this.setParamSimple(map, prefix + "DefenceHostCount", this.DefenceHostCount);
        this.setParamSimple(map, prefix + "DefendedCount", this.DefendedCount);

    }
}

