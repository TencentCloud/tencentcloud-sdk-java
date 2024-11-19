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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplicationVersion extends AbstractModel {

    /**
    * 版本类型。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 版本ID。
    */
    @SerializedName("ApplicationVersionId")
    @Expose
    private String ApplicationVersionId;

    /**
    * 发布名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 发布描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 入口文件。
    */
    @SerializedName("Entrypoint")
    @Expose
    private String Entrypoint;

    /**
    * 创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 创建者名称。
    */
    @SerializedName("CreatorName")
    @Expose
    private String CreatorName;

    /**
    * 创建者ID。
    */
    @SerializedName("CreatorId")
    @Expose
    private String CreatorId;

    /**
    * Git信息。
    */
    @SerializedName("GitInfo")
    @Expose
    private String GitInfo;

    /**
    * Git信息。
    */
    @SerializedName("GitSource")
    @Expose
    private GitInfo GitSource;

    /**
    * COS信息。
    */
    @SerializedName("CosSource")
    @Expose
    private CosFileInfo CosSource;

    /**
     * Get 版本类型。 
     * @return Type 版本类型。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 版本类型。
     * @param Type 版本类型。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 版本ID。 
     * @return ApplicationVersionId 版本ID。
     */
    public String getApplicationVersionId() {
        return this.ApplicationVersionId;
    }

    /**
     * Set 版本ID。
     * @param ApplicationVersionId 版本ID。
     */
    public void setApplicationVersionId(String ApplicationVersionId) {
        this.ApplicationVersionId = ApplicationVersionId;
    }

    /**
     * Get 发布名称。 
     * @return Name 发布名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 发布名称。
     * @param Name 发布名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 发布描述。 
     * @return Description 发布描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 发布描述。
     * @param Description 发布描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 入口文件。 
     * @return Entrypoint 入口文件。
     */
    public String getEntrypoint() {
        return this.Entrypoint;
    }

    /**
     * Set 入口文件。
     * @param Entrypoint 入口文件。
     */
    public void setEntrypoint(String Entrypoint) {
        this.Entrypoint = Entrypoint;
    }

    /**
     * Get 创建时间。 
     * @return CreateTime 创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。
     * @param CreateTime 创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 创建者名称。 
     * @return CreatorName 创建者名称。
     */
    public String getCreatorName() {
        return this.CreatorName;
    }

    /**
     * Set 创建者名称。
     * @param CreatorName 创建者名称。
     */
    public void setCreatorName(String CreatorName) {
        this.CreatorName = CreatorName;
    }

    /**
     * Get 创建者ID。 
     * @return CreatorId 创建者ID。
     */
    public String getCreatorId() {
        return this.CreatorId;
    }

    /**
     * Set 创建者ID。
     * @param CreatorId 创建者ID。
     */
    public void setCreatorId(String CreatorId) {
        this.CreatorId = CreatorId;
    }

    /**
     * Get Git信息。 
     * @return GitInfo Git信息。
     * @deprecated
     */
    @Deprecated
    public String getGitInfo() {
        return this.GitInfo;
    }

    /**
     * Set Git信息。
     * @param GitInfo Git信息。
     * @deprecated
     */
    @Deprecated
    public void setGitInfo(String GitInfo) {
        this.GitInfo = GitInfo;
    }

    /**
     * Get Git信息。 
     * @return GitSource Git信息。
     */
    public GitInfo getGitSource() {
        return this.GitSource;
    }

    /**
     * Set Git信息。
     * @param GitSource Git信息。
     */
    public void setGitSource(GitInfo GitSource) {
        this.GitSource = GitSource;
    }

    /**
     * Get COS信息。 
     * @return CosSource COS信息。
     */
    public CosFileInfo getCosSource() {
        return this.CosSource;
    }

    /**
     * Set COS信息。
     * @param CosSource COS信息。
     */
    public void setCosSource(CosFileInfo CosSource) {
        this.CosSource = CosSource;
    }

    public ApplicationVersion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplicationVersion(ApplicationVersion source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ApplicationVersionId != null) {
            this.ApplicationVersionId = new String(source.ApplicationVersionId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Entrypoint != null) {
            this.Entrypoint = new String(source.Entrypoint);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.CreatorName != null) {
            this.CreatorName = new String(source.CreatorName);
        }
        if (source.CreatorId != null) {
            this.CreatorId = new String(source.CreatorId);
        }
        if (source.GitInfo != null) {
            this.GitInfo = new String(source.GitInfo);
        }
        if (source.GitSource != null) {
            this.GitSource = new GitInfo(source.GitSource);
        }
        if (source.CosSource != null) {
            this.CosSource = new CosFileInfo(source.CosSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ApplicationVersionId", this.ApplicationVersionId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Entrypoint", this.Entrypoint);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "CreatorName", this.CreatorName);
        this.setParamSimple(map, prefix + "CreatorId", this.CreatorId);
        this.setParamSimple(map, prefix + "GitInfo", this.GitInfo);
        this.setParamObj(map, prefix + "GitSource.", this.GitSource);
        this.setParamObj(map, prefix + "CosSource.", this.CosSource);

    }
}

