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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Application extends AbstractModel {

    /**
    * <p>应用ID</p>
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * <p>项目ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>类型</p><p>枚举值：</p><ul><li>WDL： WDL</li><li>NEXTFLOW： NEXTFLOW</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>代码入口</p>
    */
    @SerializedName("Entrypoint")
    @Expose
    private String Entrypoint;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>创建人</p>
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * <p>创建人ID</p>
    */
    @SerializedName("CreatorId")
    @Expose
    private String CreatorId;

    /**
    * <p>版本数量</p>
    */
    @SerializedName("VersionCount")
    @Expose
    private Long VersionCount;

    /**
    * <p>版本列表</p>
    */
    @SerializedName("Versions")
    @Expose
    private ApplicationVersion [] Versions;

    /**
    * <p>GIT信息</p>
    */
    @SerializedName("GitSource")
    @Expose
    private GitInfo GitSource;

    /**
    * <p>运行限制</p>
    */
    @SerializedName("RunConstraints")
    @Expose
    private RunConstraints RunConstraints;

    /**
    * <p>应用COS文件信息</p>
    */
    @SerializedName("CosSource")
    @Expose
    private CosFileInfo CosSource;

    /**
    * <p>排序顺序</p>
    */
    @SerializedName("SortOrder")
    @Expose
    private Long SortOrder;

    /**
     * Get <p>应用ID</p> 
     * @return ApplicationId <p>应用ID</p>
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set <p>应用ID</p>
     * @param ApplicationId <p>应用ID</p>
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get <p>项目ID</p> 
     * @return ProjectId <p>项目ID</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID</p>
     * @param ProjectId <p>项目ID</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>名称</p> 
     * @return Name <p>名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>名称</p>
     * @param Name <p>名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>描述</p> 
     * @return Description <p>描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
     * @param Description <p>描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>类型</p><p>枚举值：</p><ul><li>WDL： WDL</li><li>NEXTFLOW： NEXTFLOW</li></ul> 
     * @return Type <p>类型</p><p>枚举值：</p><ul><li>WDL： WDL</li><li>NEXTFLOW： NEXTFLOW</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>类型</p><p>枚举值：</p><ul><li>WDL： WDL</li><li>NEXTFLOW： NEXTFLOW</li></ul>
     * @param Type <p>类型</p><p>枚举值：</p><ul><li>WDL： WDL</li><li>NEXTFLOW： NEXTFLOW</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>代码入口</p> 
     * @return Entrypoint <p>代码入口</p>
     */
    public String getEntrypoint() {
        return this.Entrypoint;
    }

    /**
     * Set <p>代码入口</p>
     * @param Entrypoint <p>代码入口</p>
     */
    public void setEntrypoint(String Entrypoint) {
        this.Entrypoint = Entrypoint;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>创建人</p> 
     * @return Creator <p>创建人</p>
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set <p>创建人</p>
     * @param Creator <p>创建人</p>
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get <p>创建人ID</p> 
     * @return CreatorId <p>创建人ID</p>
     */
    public String getCreatorId() {
        return this.CreatorId;
    }

    /**
     * Set <p>创建人ID</p>
     * @param CreatorId <p>创建人ID</p>
     */
    public void setCreatorId(String CreatorId) {
        this.CreatorId = CreatorId;
    }

    /**
     * Get <p>版本数量</p> 
     * @return VersionCount <p>版本数量</p>
     */
    public Long getVersionCount() {
        return this.VersionCount;
    }

    /**
     * Set <p>版本数量</p>
     * @param VersionCount <p>版本数量</p>
     */
    public void setVersionCount(Long VersionCount) {
        this.VersionCount = VersionCount;
    }

    /**
     * Get <p>版本列表</p> 
     * @return Versions <p>版本列表</p>
     */
    public ApplicationVersion [] getVersions() {
        return this.Versions;
    }

    /**
     * Set <p>版本列表</p>
     * @param Versions <p>版本列表</p>
     */
    public void setVersions(ApplicationVersion [] Versions) {
        this.Versions = Versions;
    }

    /**
     * Get <p>GIT信息</p> 
     * @return GitSource <p>GIT信息</p>
     */
    public GitInfo getGitSource() {
        return this.GitSource;
    }

    /**
     * Set <p>GIT信息</p>
     * @param GitSource <p>GIT信息</p>
     */
    public void setGitSource(GitInfo GitSource) {
        this.GitSource = GitSource;
    }

    /**
     * Get <p>运行限制</p> 
     * @return RunConstraints <p>运行限制</p>
     */
    public RunConstraints getRunConstraints() {
        return this.RunConstraints;
    }

    /**
     * Set <p>运行限制</p>
     * @param RunConstraints <p>运行限制</p>
     */
    public void setRunConstraints(RunConstraints RunConstraints) {
        this.RunConstraints = RunConstraints;
    }

    /**
     * Get <p>应用COS文件信息</p> 
     * @return CosSource <p>应用COS文件信息</p>
     */
    public CosFileInfo getCosSource() {
        return this.CosSource;
    }

    /**
     * Set <p>应用COS文件信息</p>
     * @param CosSource <p>应用COS文件信息</p>
     */
    public void setCosSource(CosFileInfo CosSource) {
        this.CosSource = CosSource;
    }

    /**
     * Get <p>排序顺序</p> 
     * @return SortOrder <p>排序顺序</p>
     */
    public Long getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set <p>排序顺序</p>
     * @param SortOrder <p>排序顺序</p>
     */
    public void setSortOrder(Long SortOrder) {
        this.SortOrder = SortOrder;
    }

    public Application() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Application(Application source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Entrypoint != null) {
            this.Entrypoint = new String(source.Entrypoint);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.CreatorId != null) {
            this.CreatorId = new String(source.CreatorId);
        }
        if (source.VersionCount != null) {
            this.VersionCount = new Long(source.VersionCount);
        }
        if (source.Versions != null) {
            this.Versions = new ApplicationVersion[source.Versions.length];
            for (int i = 0; i < source.Versions.length; i++) {
                this.Versions[i] = new ApplicationVersion(source.Versions[i]);
            }
        }
        if (source.GitSource != null) {
            this.GitSource = new GitInfo(source.GitSource);
        }
        if (source.RunConstraints != null) {
            this.RunConstraints = new RunConstraints(source.RunConstraints);
        }
        if (source.CosSource != null) {
            this.CosSource = new CosFileInfo(source.CosSource);
        }
        if (source.SortOrder != null) {
            this.SortOrder = new Long(source.SortOrder);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Entrypoint", this.Entrypoint);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "CreatorId", this.CreatorId);
        this.setParamSimple(map, prefix + "VersionCount", this.VersionCount);
        this.setParamArrayObj(map, prefix + "Versions.", this.Versions);
        this.setParamObj(map, prefix + "GitSource.", this.GitSource);
        this.setParamObj(map, prefix + "RunConstraints.", this.RunConstraints);
        this.setParamObj(map, prefix + "CosSource.", this.CosSource);
        this.setParamSimple(map, prefix + "SortOrder", this.SortOrder);

    }
}

