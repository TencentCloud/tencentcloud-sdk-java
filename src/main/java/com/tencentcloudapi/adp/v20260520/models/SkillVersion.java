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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SkillVersion extends AbstractModel {

    /**
    * 检测信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AnalysisInfo")
    @Expose
    private SkillAnalysisInfo AnalysisInfo;

    /**
    * 当前生效版本号
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 当前生效版本ID
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    *     Skill 版本发布流程状态：
      - 0 INITIALIZED      初始化（版本初始态）
      - 1 AUDITING         审核中（f_analysis_status ∈ {PENDING, RUNNING}）
      - 2 PENDING_RELEASE  待发布（低/中风险，等用户确认上架）
      - 3 RELEASED         已发布
      - 4 UNRELEASED       未发布（HIGH / UNAVAILABLE / FAILED / 用户放弃，含历史"不通过"语义）
    与 SkillAnalysisStatus 解耦：前者是用户视角发布生命周期，后者是安全检测阶段。
    */
    @SerializedName("VersionStatus")
    @Expose
    private Long VersionStatus;

    /**
    * Skill包的md5信息
    */
    @SerializedName("SkillMd5")
    @Expose
    private String SkillMd5;

    /**
    * 版本包地址
    */
    @SerializedName("SkillUrl")
    @Expose
    private String SkillUrl;

    /**
    * 版本创建时间（Unix秒）
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * skill md文档
    */
    @SerializedName("SkillMarkdownUrl")
    @Expose
    private String SkillMarkdownUrl;

    /**
    * 版本变更说明
    */
    @SerializedName("UpdateDesc")
    @Expose
    private String UpdateDesc;

    /**
     * Get 检测信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AnalysisInfo 检测信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SkillAnalysisInfo getAnalysisInfo() {
        return this.AnalysisInfo;
    }

    /**
     * Set 检测信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param AnalysisInfo 检测信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnalysisInfo(SkillAnalysisInfo AnalysisInfo) {
        this.AnalysisInfo = AnalysisInfo;
    }

    /**
     * Get 当前生效版本号 
     * @return Version 当前生效版本号
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 当前生效版本号
     * @param Version 当前生效版本号
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 当前生效版本ID 
     * @return VersionId 当前生效版本ID
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set 当前生效版本ID
     * @param VersionId 当前生效版本ID
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get     Skill 版本发布流程状态：
      - 0 INITIALIZED      初始化（版本初始态）
      - 1 AUDITING         审核中（f_analysis_status ∈ {PENDING, RUNNING}）
      - 2 PENDING_RELEASE  待发布（低/中风险，等用户确认上架）
      - 3 RELEASED         已发布
      - 4 UNRELEASED       未发布（HIGH / UNAVAILABLE / FAILED / 用户放弃，含历史"不通过"语义）
    与 SkillAnalysisStatus 解耦：前者是用户视角发布生命周期，后者是安全检测阶段。 
     * @return VersionStatus     Skill 版本发布流程状态：
      - 0 INITIALIZED      初始化（版本初始态）
      - 1 AUDITING         审核中（f_analysis_status ∈ {PENDING, RUNNING}）
      - 2 PENDING_RELEASE  待发布（低/中风险，等用户确认上架）
      - 3 RELEASED         已发布
      - 4 UNRELEASED       未发布（HIGH / UNAVAILABLE / FAILED / 用户放弃，含历史"不通过"语义）
    与 SkillAnalysisStatus 解耦：前者是用户视角发布生命周期，后者是安全检测阶段。
     */
    public Long getVersionStatus() {
        return this.VersionStatus;
    }

    /**
     * Set     Skill 版本发布流程状态：
      - 0 INITIALIZED      初始化（版本初始态）
      - 1 AUDITING         审核中（f_analysis_status ∈ {PENDING, RUNNING}）
      - 2 PENDING_RELEASE  待发布（低/中风险，等用户确认上架）
      - 3 RELEASED         已发布
      - 4 UNRELEASED       未发布（HIGH / UNAVAILABLE / FAILED / 用户放弃，含历史"不通过"语义）
    与 SkillAnalysisStatus 解耦：前者是用户视角发布生命周期，后者是安全检测阶段。
     * @param VersionStatus     Skill 版本发布流程状态：
      - 0 INITIALIZED      初始化（版本初始态）
      - 1 AUDITING         审核中（f_analysis_status ∈ {PENDING, RUNNING}）
      - 2 PENDING_RELEASE  待发布（低/中风险，等用户确认上架）
      - 3 RELEASED         已发布
      - 4 UNRELEASED       未发布（HIGH / UNAVAILABLE / FAILED / 用户放弃，含历史"不通过"语义）
    与 SkillAnalysisStatus 解耦：前者是用户视角发布生命周期，后者是安全检测阶段。
     */
    public void setVersionStatus(Long VersionStatus) {
        this.VersionStatus = VersionStatus;
    }

    /**
     * Get Skill包的md5信息 
     * @return SkillMd5 Skill包的md5信息
     */
    public String getSkillMd5() {
        return this.SkillMd5;
    }

    /**
     * Set Skill包的md5信息
     * @param SkillMd5 Skill包的md5信息
     */
    public void setSkillMd5(String SkillMd5) {
        this.SkillMd5 = SkillMd5;
    }

    /**
     * Get 版本包地址 
     * @return SkillUrl 版本包地址
     */
    public String getSkillUrl() {
        return this.SkillUrl;
    }

    /**
     * Set 版本包地址
     * @param SkillUrl 版本包地址
     */
    public void setSkillUrl(String SkillUrl) {
        this.SkillUrl = SkillUrl;
    }

    /**
     * Get 版本创建时间（Unix秒） 
     * @return CreateTime 版本创建时间（Unix秒）
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 版本创建时间（Unix秒）
     * @param CreateTime 版本创建时间（Unix秒）
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get skill md文档 
     * @return SkillMarkdownUrl skill md文档
     */
    public String getSkillMarkdownUrl() {
        return this.SkillMarkdownUrl;
    }

    /**
     * Set skill md文档
     * @param SkillMarkdownUrl skill md文档
     */
    public void setSkillMarkdownUrl(String SkillMarkdownUrl) {
        this.SkillMarkdownUrl = SkillMarkdownUrl;
    }

    /**
     * Get 版本变更说明 
     * @return UpdateDesc 版本变更说明
     */
    public String getUpdateDesc() {
        return this.UpdateDesc;
    }

    /**
     * Set 版本变更说明
     * @param UpdateDesc 版本变更说明
     */
    public void setUpdateDesc(String UpdateDesc) {
        this.UpdateDesc = UpdateDesc;
    }

    public SkillVersion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkillVersion(SkillVersion source) {
        if (source.AnalysisInfo != null) {
            this.AnalysisInfo = new SkillAnalysisInfo(source.AnalysisInfo);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.VersionStatus != null) {
            this.VersionStatus = new Long(source.VersionStatus);
        }
        if (source.SkillMd5 != null) {
            this.SkillMd5 = new String(source.SkillMd5);
        }
        if (source.SkillUrl != null) {
            this.SkillUrl = new String(source.SkillUrl);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.SkillMarkdownUrl != null) {
            this.SkillMarkdownUrl = new String(source.SkillMarkdownUrl);
        }
        if (source.UpdateDesc != null) {
            this.UpdateDesc = new String(source.UpdateDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AnalysisInfo.", this.AnalysisInfo);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "VersionStatus", this.VersionStatus);
        this.setParamSimple(map, prefix + "SkillMd5", this.SkillMd5);
        this.setParamSimple(map, prefix + "SkillUrl", this.SkillUrl);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "SkillMarkdownUrl", this.SkillMarkdownUrl);
        this.setParamSimple(map, prefix + "UpdateDesc", this.UpdateDesc);

    }
}

