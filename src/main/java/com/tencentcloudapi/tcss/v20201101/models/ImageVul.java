/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageVul extends AbstractModel {

    /**
    * 漏洞id
    */
    @SerializedName("CVEID")
    @Expose
    private String CVEID;

    /**
    * 观点验证程序id
    */
    @SerializedName("POCID")
    @Expose
    private String POCID;

    /**
    * 漏洞名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 涉及组件信息
    */
    @SerializedName("Components")
    @Expose
    private ComponentsInfo [] Components;

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
    private String Level;

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
    * Cvss分数
    */
    @SerializedName("CvssScore")
    @Expose
    private String CvssScore;

    /**
    * Cvss信息
    */
    @SerializedName("CvssVector")
    @Expose
    private String CvssVector;

    /**
    * 是否建议修复
    */
    @SerializedName("IsSuggest")
    @Expose
    private String IsSuggest;

    /**
    * 修复版本号
    */
    @SerializedName("FixedVersions")
    @Expose
    private String FixedVersions;

    /**
    * 漏洞标签:"CanBeFixed","DynamicLevelPoc","DynamicLevelExp"
    */
    @SerializedName("Tag")
    @Expose
    private String [] Tag;

    /**
    * 组件名
    */
    @SerializedName("Component")
    @Expose
    private String Component;

    /**
    * 组件版本
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 攻击热度 0-3
    */
    @SerializedName("AttackLevel")
    @Expose
    private Long AttackLevel;

    /**
    * 镜像层信息列表
    */
    @SerializedName("LayerInfos")
    @Expose
    private ImageVulLayerInfo [] LayerInfos;

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
     * Get 观点验证程序id 
     * @return POCID 观点验证程序id
     */
    public String getPOCID() {
        return this.POCID;
    }

    /**
     * Set 观点验证程序id
     * @param POCID 观点验证程序id
     */
    public void setPOCID(String POCID) {
        this.POCID = POCID;
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
     * Get 涉及组件信息 
     * @return Components 涉及组件信息
     */
    public ComponentsInfo [] getComponents() {
        return this.Components;
    }

    /**
     * Set 涉及组件信息
     * @param Components 涉及组件信息
     */
    public void setComponents(ComponentsInfo [] Components) {
        this.Components = Components;
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
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 风险等级
     * @param Level 风险等级
     */
    public void setLevel(String Level) {
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
     * Get Cvss分数 
     * @return CvssScore Cvss分数
     */
    public String getCvssScore() {
        return this.CvssScore;
    }

    /**
     * Set Cvss分数
     * @param CvssScore Cvss分数
     */
    public void setCvssScore(String CvssScore) {
        this.CvssScore = CvssScore;
    }

    /**
     * Get Cvss信息 
     * @return CvssVector Cvss信息
     */
    public String getCvssVector() {
        return this.CvssVector;
    }

    /**
     * Set Cvss信息
     * @param CvssVector Cvss信息
     */
    public void setCvssVector(String CvssVector) {
        this.CvssVector = CvssVector;
    }

    /**
     * Get 是否建议修复 
     * @return IsSuggest 是否建议修复
     */
    public String getIsSuggest() {
        return this.IsSuggest;
    }

    /**
     * Set 是否建议修复
     * @param IsSuggest 是否建议修复
     */
    public void setIsSuggest(String IsSuggest) {
        this.IsSuggest = IsSuggest;
    }

    /**
     * Get 修复版本号 
     * @return FixedVersions 修复版本号
     */
    public String getFixedVersions() {
        return this.FixedVersions;
    }

    /**
     * Set 修复版本号
     * @param FixedVersions 修复版本号
     */
    public void setFixedVersions(String FixedVersions) {
        this.FixedVersions = FixedVersions;
    }

    /**
     * Get 漏洞标签:"CanBeFixed","DynamicLevelPoc","DynamicLevelExp" 
     * @return Tag 漏洞标签:"CanBeFixed","DynamicLevelPoc","DynamicLevelExp"
     */
    public String [] getTag() {
        return this.Tag;
    }

    /**
     * Set 漏洞标签:"CanBeFixed","DynamicLevelPoc","DynamicLevelExp"
     * @param Tag 漏洞标签:"CanBeFixed","DynamicLevelPoc","DynamicLevelExp"
     */
    public void setTag(String [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 组件名 
     * @return Component 组件名
     */
    public String getComponent() {
        return this.Component;
    }

    /**
     * Set 组件名
     * @param Component 组件名
     */
    public void setComponent(String Component) {
        this.Component = Component;
    }

    /**
     * Get 组件版本 
     * @return Version 组件版本
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 组件版本
     * @param Version 组件版本
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 攻击热度 0-3 
     * @return AttackLevel 攻击热度 0-3
     */
    public Long getAttackLevel() {
        return this.AttackLevel;
    }

    /**
     * Set 攻击热度 0-3
     * @param AttackLevel 攻击热度 0-3
     */
    public void setAttackLevel(Long AttackLevel) {
        this.AttackLevel = AttackLevel;
    }

    /**
     * Get 镜像层信息列表 
     * @return LayerInfos 镜像层信息列表
     */
    public ImageVulLayerInfo [] getLayerInfos() {
        return this.LayerInfos;
    }

    /**
     * Set 镜像层信息列表
     * @param LayerInfos 镜像层信息列表
     */
    public void setLayerInfos(ImageVulLayerInfo [] LayerInfos) {
        this.LayerInfos = LayerInfos;
    }

    public ImageVul() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageVul(ImageVul source) {
        if (source.CVEID != null) {
            this.CVEID = new String(source.CVEID);
        }
        if (source.POCID != null) {
            this.POCID = new String(source.POCID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Components != null) {
            this.Components = new ComponentsInfo[source.Components.length];
            for (int i = 0; i < source.Components.length; i++) {
                this.Components[i] = new ComponentsInfo(source.Components[i]);
            }
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.CategoryType != null) {
            this.CategoryType = new String(source.CategoryType);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
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
        if (source.CvssScore != null) {
            this.CvssScore = new String(source.CvssScore);
        }
        if (source.CvssVector != null) {
            this.CvssVector = new String(source.CvssVector);
        }
        if (source.IsSuggest != null) {
            this.IsSuggest = new String(source.IsSuggest);
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
        if (source.Component != null) {
            this.Component = new String(source.Component);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.AttackLevel != null) {
            this.AttackLevel = new Long(source.AttackLevel);
        }
        if (source.LayerInfos != null) {
            this.LayerInfos = new ImageVulLayerInfo[source.LayerInfos.length];
            for (int i = 0; i < source.LayerInfos.length; i++) {
                this.LayerInfos[i] = new ImageVulLayerInfo(source.LayerInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CVEID", this.CVEID);
        this.setParamSimple(map, prefix + "POCID", this.POCID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Components.", this.Components);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "CategoryType", this.CategoryType);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Des", this.Des);
        this.setParamSimple(map, prefix + "OfficialSolution", this.OfficialSolution);
        this.setParamSimple(map, prefix + "Reference", this.Reference);
        this.setParamSimple(map, prefix + "DefenseSolution", this.DefenseSolution);
        this.setParamSimple(map, prefix + "SubmitTime", this.SubmitTime);
        this.setParamSimple(map, prefix + "CvssScore", this.CvssScore);
        this.setParamSimple(map, prefix + "CvssVector", this.CvssVector);
        this.setParamSimple(map, prefix + "IsSuggest", this.IsSuggest);
        this.setParamSimple(map, prefix + "FixedVersions", this.FixedVersions);
        this.setParamArraySimple(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "Component", this.Component);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "AttackLevel", this.AttackLevel);
        this.setParamArrayObj(map, prefix + "LayerInfos.", this.LayerInfos);

    }
}

