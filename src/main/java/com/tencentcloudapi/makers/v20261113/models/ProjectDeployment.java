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
package com.tencentcloudapi.makers.v20261113.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProjectDeployment extends AbstractModel {

    /**
    * <p>部署 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeploymentId")
    @Expose
    private String DeploymentId;

    /**
    * <p>项目 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>部署状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>构建耗时，单位毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BuildCost")
    @Expose
    private String BuildCost;

    /**
    * <p>触发来源</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ViaMeta")
    @Expose
    private String ViaMeta;

    /**
    * <p>环境 slug</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Env")
    @Expose
    private String Env;

    /**
    * <p>分支</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RepoBranch")
    @Expose
    private String RepoBranch;

    /**
    * <p>提交哈希</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RepoCommitHash")
    @Expose
    private String RepoCommitHash;

    /**
    * <p>提交说明</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RepoCommitMsg")
    @Expose
    private String RepoCommitMsg;

    /**
    * <p>预览地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PreviewUrl")
    @Expose
    private String PreviewUrl;

    /**
    * <p>封面地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CoverUrl")
    @Expose
    private String CoverUrl;

    /**
    * <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifiedOn")
    @Expose
    private String ModifiedOn;

    /**
    * <p>本次部署使用的仓库地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DplRepoUrl")
    @Expose
    private String DplRepoUrl;

    /**
     * Get <p>部署 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeploymentId <p>部署 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeploymentId() {
        return this.DeploymentId;
    }

    /**
     * Set <p>部署 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeploymentId <p>部署 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeploymentId(String DeploymentId) {
        this.DeploymentId = DeploymentId;
    }

    /**
     * Get <p>项目 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId <p>项目 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId <p>项目 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>部署状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>部署状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>部署状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>部署状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>构建耗时，单位毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BuildCost <p>构建耗时，单位毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBuildCost() {
        return this.BuildCost;
    }

    /**
     * Set <p>构建耗时，单位毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BuildCost <p>构建耗时，单位毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBuildCost(String BuildCost) {
        this.BuildCost = BuildCost;
    }

    /**
     * Get <p>触发来源</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ViaMeta <p>触发来源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getViaMeta() {
        return this.ViaMeta;
    }

    /**
     * Set <p>触发来源</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ViaMeta <p>触发来源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setViaMeta(String ViaMeta) {
        this.ViaMeta = ViaMeta;
    }

    /**
     * Get <p>环境 slug</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Env <p>环境 slug</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnv() {
        return this.Env;
    }

    /**
     * Set <p>环境 slug</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Env <p>环境 slug</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnv(String Env) {
        this.Env = Env;
    }

    /**
     * Get <p>分支</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RepoBranch <p>分支</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRepoBranch() {
        return this.RepoBranch;
    }

    /**
     * Set <p>分支</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RepoBranch <p>分支</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepoBranch(String RepoBranch) {
        this.RepoBranch = RepoBranch;
    }

    /**
     * Get <p>提交哈希</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RepoCommitHash <p>提交哈希</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRepoCommitHash() {
        return this.RepoCommitHash;
    }

    /**
     * Set <p>提交哈希</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RepoCommitHash <p>提交哈希</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepoCommitHash(String RepoCommitHash) {
        this.RepoCommitHash = RepoCommitHash;
    }

    /**
     * Get <p>提交说明</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RepoCommitMsg <p>提交说明</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRepoCommitMsg() {
        return this.RepoCommitMsg;
    }

    /**
     * Set <p>提交说明</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RepoCommitMsg <p>提交说明</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepoCommitMsg(String RepoCommitMsg) {
        this.RepoCommitMsg = RepoCommitMsg;
    }

    /**
     * Get <p>预览地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PreviewUrl <p>预览地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPreviewUrl() {
        return this.PreviewUrl;
    }

    /**
     * Set <p>预览地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PreviewUrl <p>预览地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPreviewUrl(String PreviewUrl) {
        this.PreviewUrl = PreviewUrl;
    }

    /**
     * Get <p>封面地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CoverUrl <p>封面地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCoverUrl() {
        return this.CoverUrl;
    }

    /**
     * Set <p>封面地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CoverUrl <p>封面地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoverUrl(String CoverUrl) {
        this.CoverUrl = CoverUrl;
    }

    /**
     * Get <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedOn <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedOn <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifiedOn <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifiedOn() {
        return this.ModifiedOn;
    }

    /**
     * Set <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifiedOn <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifiedOn(String ModifiedOn) {
        this.ModifiedOn = ModifiedOn;
    }

    /**
     * Get <p>本次部署使用的仓库地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DplRepoUrl <p>本次部署使用的仓库地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDplRepoUrl() {
        return this.DplRepoUrl;
    }

    /**
     * Set <p>本次部署使用的仓库地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DplRepoUrl <p>本次部署使用的仓库地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDplRepoUrl(String DplRepoUrl) {
        this.DplRepoUrl = DplRepoUrl;
    }

    public ProjectDeployment() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProjectDeployment(ProjectDeployment source) {
        if (source.DeploymentId != null) {
            this.DeploymentId = new String(source.DeploymentId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.BuildCost != null) {
            this.BuildCost = new String(source.BuildCost);
        }
        if (source.ViaMeta != null) {
            this.ViaMeta = new String(source.ViaMeta);
        }
        if (source.Env != null) {
            this.Env = new String(source.Env);
        }
        if (source.RepoBranch != null) {
            this.RepoBranch = new String(source.RepoBranch);
        }
        if (source.RepoCommitHash != null) {
            this.RepoCommitHash = new String(source.RepoCommitHash);
        }
        if (source.RepoCommitMsg != null) {
            this.RepoCommitMsg = new String(source.RepoCommitMsg);
        }
        if (source.PreviewUrl != null) {
            this.PreviewUrl = new String(source.PreviewUrl);
        }
        if (source.CoverUrl != null) {
            this.CoverUrl = new String(source.CoverUrl);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.ModifiedOn != null) {
            this.ModifiedOn = new String(source.ModifiedOn);
        }
        if (source.DplRepoUrl != null) {
            this.DplRepoUrl = new String(source.DplRepoUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeploymentId", this.DeploymentId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BuildCost", this.BuildCost);
        this.setParamSimple(map, prefix + "ViaMeta", this.ViaMeta);
        this.setParamSimple(map, prefix + "Env", this.Env);
        this.setParamSimple(map, prefix + "RepoBranch", this.RepoBranch);
        this.setParamSimple(map, prefix + "RepoCommitHash", this.RepoCommitHash);
        this.setParamSimple(map, prefix + "RepoCommitMsg", this.RepoCommitMsg);
        this.setParamSimple(map, prefix + "PreviewUrl", this.PreviewUrl);
        this.setParamSimple(map, prefix + "CoverUrl", this.CoverUrl);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "ModifiedOn", this.ModifiedOn);
        this.setParamSimple(map, prefix + "DplRepoUrl", this.DplRepoUrl);

    }
}

