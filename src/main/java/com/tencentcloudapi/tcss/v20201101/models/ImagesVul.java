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

public class ImagesVul extends AbstractModel{

    /**
    * 漏洞id
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
    * 组件
    */
    @SerializedName("Component")
    @Expose
    private String Component;

    /**
    * 版本
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 分类
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * 分类2
    */
    @SerializedName("CategoryType")
    @Expose
    private String CategoryType;

    /**
    * 风险等级
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 描述
    */
    @SerializedName("Des")
    @Expose
    private String Des;

    /**
    * 解决方案
    */
    @SerializedName("OfficialSolution")
    @Expose
    private String OfficialSolution;

    /**
    * 引用
    */
    @SerializedName("Reference")
    @Expose
    private String Reference;

    /**
    * 防御方案
    */
    @SerializedName("DefenseSolution")
    @Expose
    private String DefenseSolution;

    /**
    * 提交时间
    */
    @SerializedName("SubmitTime")
    @Expose
    private String SubmitTime;

    /**
    * CVSS V3分数
    */
    @SerializedName("CVSSV3Score")
    @Expose
    private Float CVSSV3Score;

    /**
    * CVSS V3描述
    */
    @SerializedName("CVSSV3Desc")
    @Expose
    private String CVSSV3Desc;

    /**
    * 是否是重点关注：true：是，false：不是
    */
    @SerializedName("IsSuggest")
    @Expose
    private Boolean IsSuggest;

    /**
    * 修复版本号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FixedVersions")
    @Expose
    private String FixedVersions;

    /**
    * 漏洞标签:"CanBeFixed","DynamicLevelPoc","DynamicLevelExp"
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tag")
    @Expose
    private String [] Tag;

    /**
     * Get 漏洞id 
     * @return CVEID 漏洞id
     */
    public String getCVEID() {
        return this.CVEID;
    }

    /**
     * Set 漏洞id
     * @param CVEID 漏洞id
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
     * Get 组件 
     * @return Component 组件
     */
    public String getComponent() {
        return this.Component;
    }

    /**
     * Set 组件
     * @param Component 组件
     */
    public void setComponent(String Component) {
        this.Component = Component;
    }

    /**
     * Get 版本 
     * @return Version 版本
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 版本
     * @param Version 版本
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 分类 
     * @return Category 分类
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 分类
     * @param Category 分类
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get 分类2 
     * @return CategoryType 分类2
     */
    public String getCategoryType() {
        return this.CategoryType;
    }

    /**
     * Set 分类2
     * @param CategoryType 分类2
     */
    public void setCategoryType(String CategoryType) {
        this.CategoryType = CategoryType;
    }

    /**
     * Get 风险等级 
     * @return Level 风险等级
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 风险等级
     * @param Level 风险等级
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 描述 
     * @return Des 描述
     */
    public String getDes() {
        return this.Des;
    }

    /**
     * Set 描述
     * @param Des 描述
     */
    public void setDes(String Des) {
        this.Des = Des;
    }

    /**
     * Get 解决方案 
     * @return OfficialSolution 解决方案
     */
    public String getOfficialSolution() {
        return this.OfficialSolution;
    }

    /**
     * Set 解决方案
     * @param OfficialSolution 解决方案
     */
    public void setOfficialSolution(String OfficialSolution) {
        this.OfficialSolution = OfficialSolution;
    }

    /**
     * Get 引用 
     * @return Reference 引用
     */
    public String getReference() {
        return this.Reference;
    }

    /**
     * Set 引用
     * @param Reference 引用
     */
    public void setReference(String Reference) {
        this.Reference = Reference;
    }

    /**
     * Get 防御方案 
     * @return DefenseSolution 防御方案
     */
    public String getDefenseSolution() {
        return this.DefenseSolution;
    }

    /**
     * Set 防御方案
     * @param DefenseSolution 防御方案
     */
    public void setDefenseSolution(String DefenseSolution) {
        this.DefenseSolution = DefenseSolution;
    }

    /**
     * Get 提交时间 
     * @return SubmitTime 提交时间
     */
    public String getSubmitTime() {
        return this.SubmitTime;
    }

    /**
     * Set 提交时间
     * @param SubmitTime 提交时间
     */
    public void setSubmitTime(String SubmitTime) {
        this.SubmitTime = SubmitTime;
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
     * Get 是否是重点关注：true：是，false：不是 
     * @return IsSuggest 是否是重点关注：true：是，false：不是
     */
    public Boolean getIsSuggest() {
        return this.IsSuggest;
    }

    /**
     * Set 是否是重点关注：true：是，false：不是
     * @param IsSuggest 是否是重点关注：true：是，false：不是
     */
    public void setIsSuggest(Boolean IsSuggest) {
        this.IsSuggest = IsSuggest;
    }

    /**
     * Get 修复版本号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FixedVersions 修复版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFixedVersions() {
        return this.FixedVersions;
    }

    /**
     * Set 修复版本号
注意：此字段可能返回 null，表示取不到有效值。
     * @param FixedVersions 修复版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFixedVersions(String FixedVersions) {
        this.FixedVersions = FixedVersions;
    }

    /**
     * Get 漏洞标签:"CanBeFixed","DynamicLevelPoc","DynamicLevelExp"
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tag 漏洞标签:"CanBeFixed","DynamicLevelPoc","DynamicLevelExp"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTag() {
        return this.Tag;
    }

    /**
     * Set 漏洞标签:"CanBeFixed","DynamicLevelPoc","DynamicLevelExp"
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tag 漏洞标签:"CanBeFixed","DynamicLevelPoc","DynamicLevelExp"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTag(String [] Tag) {
        this.Tag = Tag;
    }

    public ImagesVul() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImagesVul(ImagesVul source) {
        if (source.CVEID != null) {
            this.CVEID = new String(source.CVEID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Component != null) {
            this.Component = new String(source.Component);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.CategoryType != null) {
            this.CategoryType = new String(source.CategoryType);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Des != null) {
            this.Des = new String(source.Des);
        }
        if (source.OfficialSolution != null) {
            this.OfficialSolution = new String(source.OfficialSolution);
        }
        if (source.Reference != null) {
            this.Reference = new String(source.Reference);
        }
        if (source.DefenseSolution != null) {
            this.DefenseSolution = new String(source.DefenseSolution);
        }
        if (source.SubmitTime != null) {
            this.SubmitTime = new String(source.SubmitTime);
        }
        if (source.CVSSV3Score != null) {
            this.CVSSV3Score = new Float(source.CVSSV3Score);
        }
        if (source.CVSSV3Desc != null) {
            this.CVSSV3Desc = new String(source.CVSSV3Desc);
        }
        if (source.IsSuggest != null) {
            this.IsSuggest = new Boolean(source.IsSuggest);
        }
        if (source.FixedVersions != null) {
            this.FixedVersions = new String(source.FixedVersions);
        }
        if (source.Tag != null) {
            this.Tag = new String[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new String(source.Tag[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CVEID", this.CVEID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Component", this.Component);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "CategoryType", this.CategoryType);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Des", this.Des);
        this.setParamSimple(map, prefix + "OfficialSolution", this.OfficialSolution);
        this.setParamSimple(map, prefix + "Reference", this.Reference);
        this.setParamSimple(map, prefix + "DefenseSolution", this.DefenseSolution);
        this.setParamSimple(map, prefix + "SubmitTime", this.SubmitTime);
        this.setParamSimple(map, prefix + "CVSSV3Score", this.CVSSV3Score);
        this.setParamSimple(map, prefix + "CVSSV3Desc", this.CVSSV3Desc);
        this.setParamSimple(map, prefix + "IsSuggest", this.IsSuggest);
        this.setParamSimple(map, prefix + "FixedVersions", this.FixedVersions);
        this.setParamArraySimple(map, prefix + "Tag.", this.Tag);

    }
}

