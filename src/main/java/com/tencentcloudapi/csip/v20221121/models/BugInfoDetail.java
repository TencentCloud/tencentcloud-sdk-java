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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BugInfoDetail extends AbstractModel {

    /**
    * 漏洞编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 漏洞对应pocId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PatchId")
    @Expose
    private String PatchId;

    /**
    * 漏洞名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VULName")
    @Expose
    private String VULName;

    /**
    * 漏洞严重性：high,middle，low，info
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * cvss评分
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CVSSScore")
    @Expose
    private String CVSSScore;

    /**
    * cve编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CVEId")
    @Expose
    private String CVEId;

    /**
    * 漏洞标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * 漏洞种类，1:web应用，2:系统组件漏洞，3:配置风险
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VULCategory")
    @Expose
    private Long VULCategory;

    /**
    * 漏洞影响系统
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImpactOs")
    @Expose
    private String ImpactOs;

    /**
    * 漏洞影响组件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImpactCOMPENT")
    @Expose
    private String ImpactCOMPENT;

    /**
    * 漏洞影响版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImpactVersion")
    @Expose
    private String ImpactVersion;

    /**
    * 链接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Reference")
    @Expose
    private String Reference;

    /**
    * 漏洞描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VULDescribe")
    @Expose
    private String VULDescribe;

    /**
    * 修复建议
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Fix")
    @Expose
    private String Fix;

    /**
    * 产品支持状态，实时返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProSupport")
    @Expose
    private Long ProSupport;

    /**
    * 是否公开，0为未发布，1为发布
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsPublish")
    @Expose
    private Long IsPublish;

    /**
    * 释放时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReleaseTime")
    @Expose
    private String ReleaseTime;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 漏洞子类别
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubCategory")
    @Expose
    private String SubCategory;

    /**
     * Get 漏洞编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 漏洞编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 漏洞编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 漏洞编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 漏洞对应pocId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PatchId 漏洞对应pocId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPatchId() {
        return this.PatchId;
    }

    /**
     * Set 漏洞对应pocId
注意：此字段可能返回 null，表示取不到有效值。
     * @param PatchId 漏洞对应pocId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPatchId(String PatchId) {
        this.PatchId = PatchId;
    }

    /**
     * Get 漏洞名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VULName 漏洞名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVULName() {
        return this.VULName;
    }

    /**
     * Set 漏洞名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param VULName 漏洞名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVULName(String VULName) {
        this.VULName = VULName;
    }

    /**
     * Get 漏洞严重性：high,middle，low，info
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Level 漏洞严重性：high,middle，low，info
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 漏洞严重性：high,middle，low，info
注意：此字段可能返回 null，表示取不到有效值。
     * @param Level 漏洞严重性：high,middle，low，info
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get cvss评分
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CVSSScore cvss评分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCVSSScore() {
        return this.CVSSScore;
    }

    /**
     * Set cvss评分
注意：此字段可能返回 null，表示取不到有效值。
     * @param CVSSScore cvss评分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCVSSScore(String CVSSScore) {
        this.CVSSScore = CVSSScore;
    }

    /**
     * Get cve编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CVEId cve编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCVEId() {
        return this.CVEId;
    }

    /**
     * Set cve编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param CVEId cve编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCVEId(String CVEId) {
        this.CVEId = CVEId;
    }

    /**
     * Get 漏洞标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tag 漏洞标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set 漏洞标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tag 漏洞标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 漏洞种类，1:web应用，2:系统组件漏洞，3:配置风险
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VULCategory 漏洞种类，1:web应用，2:系统组件漏洞，3:配置风险
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVULCategory() {
        return this.VULCategory;
    }

    /**
     * Set 漏洞种类，1:web应用，2:系统组件漏洞，3:配置风险
注意：此字段可能返回 null，表示取不到有效值。
     * @param VULCategory 漏洞种类，1:web应用，2:系统组件漏洞，3:配置风险
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVULCategory(Long VULCategory) {
        this.VULCategory = VULCategory;
    }

    /**
     * Get 漏洞影响系统
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImpactOs 漏洞影响系统
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImpactOs() {
        return this.ImpactOs;
    }

    /**
     * Set 漏洞影响系统
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImpactOs 漏洞影响系统
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImpactOs(String ImpactOs) {
        this.ImpactOs = ImpactOs;
    }

    /**
     * Get 漏洞影响组件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImpactCOMPENT 漏洞影响组件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImpactCOMPENT() {
        return this.ImpactCOMPENT;
    }

    /**
     * Set 漏洞影响组件
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImpactCOMPENT 漏洞影响组件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImpactCOMPENT(String ImpactCOMPENT) {
        this.ImpactCOMPENT = ImpactCOMPENT;
    }

    /**
     * Get 漏洞影响版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImpactVersion 漏洞影响版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImpactVersion() {
        return this.ImpactVersion;
    }

    /**
     * Set 漏洞影响版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImpactVersion 漏洞影响版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImpactVersion(String ImpactVersion) {
        this.ImpactVersion = ImpactVersion;
    }

    /**
     * Get 链接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Reference 链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReference() {
        return this.Reference;
    }

    /**
     * Set 链接
注意：此字段可能返回 null，表示取不到有效值。
     * @param Reference 链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReference(String Reference) {
        this.Reference = Reference;
    }

    /**
     * Get 漏洞描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VULDescribe 漏洞描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVULDescribe() {
        return this.VULDescribe;
    }

    /**
     * Set 漏洞描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param VULDescribe 漏洞描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVULDescribe(String VULDescribe) {
        this.VULDescribe = VULDescribe;
    }

    /**
     * Get 修复建议
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Fix 修复建议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFix() {
        return this.Fix;
    }

    /**
     * Set 修复建议
注意：此字段可能返回 null，表示取不到有效值。
     * @param Fix 修复建议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFix(String Fix) {
        this.Fix = Fix;
    }

    /**
     * Get 产品支持状态，实时返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProSupport 产品支持状态，实时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProSupport() {
        return this.ProSupport;
    }

    /**
     * Set 产品支持状态，实时返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProSupport 产品支持状态，实时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProSupport(Long ProSupport) {
        this.ProSupport = ProSupport;
    }

    /**
     * Get 是否公开，0为未发布，1为发布
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsPublish 是否公开，0为未发布，1为发布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsPublish() {
        return this.IsPublish;
    }

    /**
     * Set 是否公开，0为未发布，1为发布
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsPublish 是否公开，0为未发布，1为发布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsPublish(Long IsPublish) {
        this.IsPublish = IsPublish;
    }

    /**
     * Get 释放时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReleaseTime 释放时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReleaseTime() {
        return this.ReleaseTime;
    }

    /**
     * Set 释放时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReleaseTime 释放时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReleaseTime(String ReleaseTime) {
        this.ReleaseTime = ReleaseTime;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
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
     * Get 漏洞子类别
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubCategory 漏洞子类别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubCategory() {
        return this.SubCategory;
    }

    /**
     * Set 漏洞子类别
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubCategory 漏洞子类别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubCategory(String SubCategory) {
        this.SubCategory = SubCategory;
    }

    public BugInfoDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BugInfoDetail(BugInfoDetail source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.PatchId != null) {
            this.PatchId = new String(source.PatchId);
        }
        if (source.VULName != null) {
            this.VULName = new String(source.VULName);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.CVSSScore != null) {
            this.CVSSScore = new String(source.CVSSScore);
        }
        if (source.CVEId != null) {
            this.CVEId = new String(source.CVEId);
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.VULCategory != null) {
            this.VULCategory = new Long(source.VULCategory);
        }
        if (source.ImpactOs != null) {
            this.ImpactOs = new String(source.ImpactOs);
        }
        if (source.ImpactCOMPENT != null) {
            this.ImpactCOMPENT = new String(source.ImpactCOMPENT);
        }
        if (source.ImpactVersion != null) {
            this.ImpactVersion = new String(source.ImpactVersion);
        }
        if (source.Reference != null) {
            this.Reference = new String(source.Reference);
        }
        if (source.VULDescribe != null) {
            this.VULDescribe = new String(source.VULDescribe);
        }
        if (source.Fix != null) {
            this.Fix = new String(source.Fix);
        }
        if (source.ProSupport != null) {
            this.ProSupport = new Long(source.ProSupport);
        }
        if (source.IsPublish != null) {
            this.IsPublish = new Long(source.IsPublish);
        }
        if (source.ReleaseTime != null) {
            this.ReleaseTime = new String(source.ReleaseTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.SubCategory != null) {
            this.SubCategory = new String(source.SubCategory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "PatchId", this.PatchId);
        this.setParamSimple(map, prefix + "VULName", this.VULName);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "CVSSScore", this.CVSSScore);
        this.setParamSimple(map, prefix + "CVEId", this.CVEId);
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "VULCategory", this.VULCategory);
        this.setParamSimple(map, prefix + "ImpactOs", this.ImpactOs);
        this.setParamSimple(map, prefix + "ImpactCOMPENT", this.ImpactCOMPENT);
        this.setParamSimple(map, prefix + "ImpactVersion", this.ImpactVersion);
        this.setParamSimple(map, prefix + "Reference", this.Reference);
        this.setParamSimple(map, prefix + "VULDescribe", this.VULDescribe);
        this.setParamSimple(map, prefix + "Fix", this.Fix);
        this.setParamSimple(map, prefix + "ProSupport", this.ProSupport);
        this.setParamSimple(map, prefix + "IsPublish", this.IsPublish);
        this.setParamSimple(map, prefix + "ReleaseTime", this.ReleaseTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "SubCategory", this.SubCategory);

    }
}

