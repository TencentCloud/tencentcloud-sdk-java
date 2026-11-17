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

public class CreateDeploymentRequest extends AbstractModel {

    /**
    * <p>Makers 站点 ID</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>项目 ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>触发来源。Github、ReDeploy、Api、Webhook、Upload、Coding、Gitee、Gitlab</p>
    */
    @SerializedName("ViaMeta")
    @Expose
    private String ViaMeta;

    /**
    * <p>环境 slug。Production、Preview 或自定义环境</p>
    */
    @SerializedName("Env")
    @Expose
    private String Env;

    /**
    * <p>代码来源。上传制品传 Upload</p>
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * <p>制品类型。Zip 或 Folder</p>
    */
    @SerializedName("DistType")
    @Expose
    private String DistType;

    /**
    * <p>已上传制品在临时桶中的对象路径</p>
    */
    @SerializedName("TempBucketPath")
    @Expose
    private String TempBucketPath;

    /**
    * <p>构建分支</p>
    */
    @SerializedName("RepoBranch")
    @Expose
    private String RepoBranch;

    /**
    * <p>提交哈希</p>
    */
    @SerializedName("RepoCommitHash")
    @Expose
    private String RepoCommitHash;

    /**
    * <p>提交说明</p>
    */
    @SerializedName("RepoCommitMsg")
    @Expose
    private String RepoCommitMsg;

    /**
    * <p>构建来源</p>
    */
    @SerializedName("BuildFrom")
    @Expose
    private String BuildFrom;

    /**
    * <p>模板 ID</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * <p>构建规格。当前服务端仍从 edgeone.json 读取，此字段先保留</p>
    */
    @SerializedName("CiSpec")
    @Expose
    private String CiSpec;

    /**
     * Get <p>Makers 站点 ID</p> 
     * @return ZoneId <p>Makers 站点 ID</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Makers 站点 ID</p>
     * @param ZoneId <p>Makers 站点 ID</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>项目 ID</p> 
     * @return ProjectId <p>项目 ID</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目 ID</p>
     * @param ProjectId <p>项目 ID</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>触发来源。Github、ReDeploy、Api、Webhook、Upload、Coding、Gitee、Gitlab</p> 
     * @return ViaMeta <p>触发来源。Github、ReDeploy、Api、Webhook、Upload、Coding、Gitee、Gitlab</p>
     */
    public String getViaMeta() {
        return this.ViaMeta;
    }

    /**
     * Set <p>触发来源。Github、ReDeploy、Api、Webhook、Upload、Coding、Gitee、Gitlab</p>
     * @param ViaMeta <p>触发来源。Github、ReDeploy、Api、Webhook、Upload、Coding、Gitee、Gitlab</p>
     */
    public void setViaMeta(String ViaMeta) {
        this.ViaMeta = ViaMeta;
    }

    /**
     * Get <p>环境 slug。Production、Preview 或自定义环境</p> 
     * @return Env <p>环境 slug。Production、Preview 或自定义环境</p>
     */
    public String getEnv() {
        return this.Env;
    }

    /**
     * Set <p>环境 slug。Production、Preview 或自定义环境</p>
     * @param Env <p>环境 slug。Production、Preview 或自定义环境</p>
     */
    public void setEnv(String Env) {
        this.Env = Env;
    }

    /**
     * Get <p>代码来源。上传制品传 Upload</p> 
     * @return Provider <p>代码来源。上传制品传 Upload</p>
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set <p>代码来源。上传制品传 Upload</p>
     * @param Provider <p>代码来源。上传制品传 Upload</p>
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get <p>制品类型。Zip 或 Folder</p> 
     * @return DistType <p>制品类型。Zip 或 Folder</p>
     */
    public String getDistType() {
        return this.DistType;
    }

    /**
     * Set <p>制品类型。Zip 或 Folder</p>
     * @param DistType <p>制品类型。Zip 或 Folder</p>
     */
    public void setDistType(String DistType) {
        this.DistType = DistType;
    }

    /**
     * Get <p>已上传制品在临时桶中的对象路径</p> 
     * @return TempBucketPath <p>已上传制品在临时桶中的对象路径</p>
     */
    public String getTempBucketPath() {
        return this.TempBucketPath;
    }

    /**
     * Set <p>已上传制品在临时桶中的对象路径</p>
     * @param TempBucketPath <p>已上传制品在临时桶中的对象路径</p>
     */
    public void setTempBucketPath(String TempBucketPath) {
        this.TempBucketPath = TempBucketPath;
    }

    /**
     * Get <p>构建分支</p> 
     * @return RepoBranch <p>构建分支</p>
     */
    public String getRepoBranch() {
        return this.RepoBranch;
    }

    /**
     * Set <p>构建分支</p>
     * @param RepoBranch <p>构建分支</p>
     */
    public void setRepoBranch(String RepoBranch) {
        this.RepoBranch = RepoBranch;
    }

    /**
     * Get <p>提交哈希</p> 
     * @return RepoCommitHash <p>提交哈希</p>
     */
    public String getRepoCommitHash() {
        return this.RepoCommitHash;
    }

    /**
     * Set <p>提交哈希</p>
     * @param RepoCommitHash <p>提交哈希</p>
     */
    public void setRepoCommitHash(String RepoCommitHash) {
        this.RepoCommitHash = RepoCommitHash;
    }

    /**
     * Get <p>提交说明</p> 
     * @return RepoCommitMsg <p>提交说明</p>
     */
    public String getRepoCommitMsg() {
        return this.RepoCommitMsg;
    }

    /**
     * Set <p>提交说明</p>
     * @param RepoCommitMsg <p>提交说明</p>
     */
    public void setRepoCommitMsg(String RepoCommitMsg) {
        this.RepoCommitMsg = RepoCommitMsg;
    }

    /**
     * Get <p>构建来源</p> 
     * @return BuildFrom <p>构建来源</p>
     */
    public String getBuildFrom() {
        return this.BuildFrom;
    }

    /**
     * Set <p>构建来源</p>
     * @param BuildFrom <p>构建来源</p>
     */
    public void setBuildFrom(String BuildFrom) {
        this.BuildFrom = BuildFrom;
    }

    /**
     * Get <p>模板 ID</p> 
     * @return TemplateId <p>模板 ID</p>
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>模板 ID</p>
     * @param TemplateId <p>模板 ID</p>
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>构建规格。当前服务端仍从 edgeone.json 读取，此字段先保留</p> 
     * @return CiSpec <p>构建规格。当前服务端仍从 edgeone.json 读取，此字段先保留</p>
     */
    public String getCiSpec() {
        return this.CiSpec;
    }

    /**
     * Set <p>构建规格。当前服务端仍从 edgeone.json 读取，此字段先保留</p>
     * @param CiSpec <p>构建规格。当前服务端仍从 edgeone.json 读取，此字段先保留</p>
     */
    public void setCiSpec(String CiSpec) {
        this.CiSpec = CiSpec;
    }

    public CreateDeploymentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDeploymentRequest(CreateDeploymentRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ViaMeta != null) {
            this.ViaMeta = new String(source.ViaMeta);
        }
        if (source.Env != null) {
            this.Env = new String(source.Env);
        }
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.DistType != null) {
            this.DistType = new String(source.DistType);
        }
        if (source.TempBucketPath != null) {
            this.TempBucketPath = new String(source.TempBucketPath);
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
        if (source.BuildFrom != null) {
            this.BuildFrom = new String(source.BuildFrom);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.CiSpec != null) {
            this.CiSpec = new String(source.CiSpec);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ViaMeta", this.ViaMeta);
        this.setParamSimple(map, prefix + "Env", this.Env);
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "DistType", this.DistType);
        this.setParamSimple(map, prefix + "TempBucketPath", this.TempBucketPath);
        this.setParamSimple(map, prefix + "RepoBranch", this.RepoBranch);
        this.setParamSimple(map, prefix + "RepoCommitHash", this.RepoCommitHash);
        this.setParamSimple(map, prefix + "RepoCommitMsg", this.RepoCommitMsg);
        this.setParamSimple(map, prefix + "BuildFrom", this.BuildFrom);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "CiSpec", this.CiSpec);

    }
}

