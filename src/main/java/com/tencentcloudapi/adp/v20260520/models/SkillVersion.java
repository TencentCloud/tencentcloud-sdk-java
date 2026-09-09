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
    * <p>检测信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AnalysisInfo")
    @Expose
    private SkillAnalysisInfo AnalysisInfo;

    /**
    * <p>当前生效版本号</p>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>当前生效版本ID</p>
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * <p>Skill 版本发布流程状态：</p><pre><code>  - 0 INITIALIZED      初始化（版本初始态）  - 1 AUDITING         审核中（f_analysis_status ∈ {PENDING, RUNNING}）  - 2 PENDING_RELEASE  待发布（低/中风险，等用户确认上架）  - 3 RELEASED         已发布  - 4 UNRELEASED       未发布（HIGH / UNAVAILABLE / FAILED / 用户放弃，含历史&quot;不通过&quot;语义）与 SkillAnalysisStatus 解耦：前者是用户视角发布生命周期，后者是安全检测阶段。</code></pre>
    */
    @SerializedName("VersionStatus")
    @Expose
    private Long VersionStatus;

    /**
    * <p>Skill包的md5信息</p>
    */
    @SerializedName("SkillMd5")
    @Expose
    private String SkillMd5;

    /**
    * <p>版本包地址</p>
    */
    @SerializedName("SkillUrl")
    @Expose
    private String SkillUrl;

    /**
    * <p>版本创建时间（Unix秒）</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>skill md文档</p>
    */
    @SerializedName("SkillMarkdownUrl")
    @Expose
    private String SkillMarkdownUrl;

    /**
    * <p>版本变更说明</p>
    */
    @SerializedName("UpdateDesc")
    @Expose
    private String UpdateDesc;

    /**
    * <p>变更用户</p>
    */
    @SerializedName("Updater")
    @Expose
    private String Updater;

    /**
     * Get <p>检测信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AnalysisInfo <p>检测信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SkillAnalysisInfo getAnalysisInfo() {
        return this.AnalysisInfo;
    }

    /**
     * Set <p>检测信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AnalysisInfo <p>检测信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnalysisInfo(SkillAnalysisInfo AnalysisInfo) {
        this.AnalysisInfo = AnalysisInfo;
    }

    /**
     * Get <p>当前生效版本号</p> 
     * @return Version <p>当前生效版本号</p>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>当前生效版本号</p>
     * @param Version <p>当前生效版本号</p>
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>当前生效版本ID</p> 
     * @return VersionId <p>当前生效版本ID</p>
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set <p>当前生效版本ID</p>
     * @param VersionId <p>当前生效版本ID</p>
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get <p>Skill 版本发布流程状态：</p><pre><code>  - 0 INITIALIZED      初始化（版本初始态）  - 1 AUDITING         审核中（f_analysis_status ∈ {PENDING, RUNNING}）  - 2 PENDING_RELEASE  待发布（低/中风险，等用户确认上架）  - 3 RELEASED         已发布  - 4 UNRELEASED       未发布（HIGH / UNAVAILABLE / FAILED / 用户放弃，含历史&quot;不通过&quot;语义）与 SkillAnalysisStatus 解耦：前者是用户视角发布生命周期，后者是安全检测阶段。</code></pre> 
     * @return VersionStatus <p>Skill 版本发布流程状态：</p><pre><code>  - 0 INITIALIZED      初始化（版本初始态）  - 1 AUDITING         审核中（f_analysis_status ∈ {PENDING, RUNNING}）  - 2 PENDING_RELEASE  待发布（低/中风险，等用户确认上架）  - 3 RELEASED         已发布  - 4 UNRELEASED       未发布（HIGH / UNAVAILABLE / FAILED / 用户放弃，含历史&quot;不通过&quot;语义）与 SkillAnalysisStatus 解耦：前者是用户视角发布生命周期，后者是安全检测阶段。</code></pre>
     */
    public Long getVersionStatus() {
        return this.VersionStatus;
    }

    /**
     * Set <p>Skill 版本发布流程状态：</p><pre><code>  - 0 INITIALIZED      初始化（版本初始态）  - 1 AUDITING         审核中（f_analysis_status ∈ {PENDING, RUNNING}）  - 2 PENDING_RELEASE  待发布（低/中风险，等用户确认上架）  - 3 RELEASED         已发布  - 4 UNRELEASED       未发布（HIGH / UNAVAILABLE / FAILED / 用户放弃，含历史&quot;不通过&quot;语义）与 SkillAnalysisStatus 解耦：前者是用户视角发布生命周期，后者是安全检测阶段。</code></pre>
     * @param VersionStatus <p>Skill 版本发布流程状态：</p><pre><code>  - 0 INITIALIZED      初始化（版本初始态）  - 1 AUDITING         审核中（f_analysis_status ∈ {PENDING, RUNNING}）  - 2 PENDING_RELEASE  待发布（低/中风险，等用户确认上架）  - 3 RELEASED         已发布  - 4 UNRELEASED       未发布（HIGH / UNAVAILABLE / FAILED / 用户放弃，含历史&quot;不通过&quot;语义）与 SkillAnalysisStatus 解耦：前者是用户视角发布生命周期，后者是安全检测阶段。</code></pre>
     */
    public void setVersionStatus(Long VersionStatus) {
        this.VersionStatus = VersionStatus;
    }

    /**
     * Get <p>Skill包的md5信息</p> 
     * @return SkillMd5 <p>Skill包的md5信息</p>
     */
    public String getSkillMd5() {
        return this.SkillMd5;
    }

    /**
     * Set <p>Skill包的md5信息</p>
     * @param SkillMd5 <p>Skill包的md5信息</p>
     */
    public void setSkillMd5(String SkillMd5) {
        this.SkillMd5 = SkillMd5;
    }

    /**
     * Get <p>版本包地址</p> 
     * @return SkillUrl <p>版本包地址</p>
     */
    public String getSkillUrl() {
        return this.SkillUrl;
    }

    /**
     * Set <p>版本包地址</p>
     * @param SkillUrl <p>版本包地址</p>
     */
    public void setSkillUrl(String SkillUrl) {
        this.SkillUrl = SkillUrl;
    }

    /**
     * Get <p>版本创建时间（Unix秒）</p> 
     * @return CreateTime <p>版本创建时间（Unix秒）</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>版本创建时间（Unix秒）</p>
     * @param CreateTime <p>版本创建时间（Unix秒）</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>skill md文档</p> 
     * @return SkillMarkdownUrl <p>skill md文档</p>
     */
    public String getSkillMarkdownUrl() {
        return this.SkillMarkdownUrl;
    }

    /**
     * Set <p>skill md文档</p>
     * @param SkillMarkdownUrl <p>skill md文档</p>
     */
    public void setSkillMarkdownUrl(String SkillMarkdownUrl) {
        this.SkillMarkdownUrl = SkillMarkdownUrl;
    }

    /**
     * Get <p>版本变更说明</p> 
     * @return UpdateDesc <p>版本变更说明</p>
     */
    public String getUpdateDesc() {
        return this.UpdateDesc;
    }

    /**
     * Set <p>版本变更说明</p>
     * @param UpdateDesc <p>版本变更说明</p>
     */
    public void setUpdateDesc(String UpdateDesc) {
        this.UpdateDesc = UpdateDesc;
    }

    /**
     * Get <p>变更用户</p> 
     * @return Updater <p>变更用户</p>
     */
    public String getUpdater() {
        return this.Updater;
    }

    /**
     * Set <p>变更用户</p>
     * @param Updater <p>变更用户</p>
     */
    public void setUpdater(String Updater) {
        this.Updater = Updater;
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
        if (source.Updater != null) {
            this.Updater = new String(source.Updater);
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
        this.setParamSimple(map, prefix + "Updater", this.Updater);

    }
}

