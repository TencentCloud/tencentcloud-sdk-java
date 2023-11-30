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

public class RunWorkflowRequest extends AbstractModel {

    /**
    * 任务批次名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 投递环境ID。
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 工作流Git仓库信息。
    */
    @SerializedName("GitSource")
    @Expose
    private GitInfo GitSource;

    /**
    * 工作流类型。

支持类型：
- NEXTFLOW
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Nextflow选项。
    */
    @SerializedName("NFOption")
    @Expose
    private NFOption NFOption;

    /**
    * 项目ID。
（不填使用指定地域下的默认项目）
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 任务批次描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 任务输入JSON。需要进行base64编码。
（InputBase64和InputCosUri必选其一）
    */
    @SerializedName("InputBase64")
    @Expose
    private String InputBase64;

    /**
    * 任务输入COS地址。
（InputBase64和InputCosUri必选其一）
    */
    @SerializedName("InputCosUri")
    @Expose
    private String InputCosUri;

    /**
    * 任务缓存清理时间（小时）。不填表示不清理。
    */
    @SerializedName("CacheClearDelay")
    @Expose
    private Long CacheClearDelay;

    /**
     * Get 任务批次名称。 
     * @return Name 任务批次名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 任务批次名称。
     * @param Name 任务批次名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 投递环境ID。 
     * @return EnvironmentId 投递环境ID。
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 投递环境ID。
     * @param EnvironmentId 投递环境ID。
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get 工作流Git仓库信息。 
     * @return GitSource 工作流Git仓库信息。
     */
    public GitInfo getGitSource() {
        return this.GitSource;
    }

    /**
     * Set 工作流Git仓库信息。
     * @param GitSource 工作流Git仓库信息。
     */
    public void setGitSource(GitInfo GitSource) {
        this.GitSource = GitSource;
    }

    /**
     * Get 工作流类型。

支持类型：
- NEXTFLOW 
     * @return Type 工作流类型。

支持类型：
- NEXTFLOW
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 工作流类型。

支持类型：
- NEXTFLOW
     * @param Type 工作流类型。

支持类型：
- NEXTFLOW
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Nextflow选项。 
     * @return NFOption Nextflow选项。
     */
    public NFOption getNFOption() {
        return this.NFOption;
    }

    /**
     * Set Nextflow选项。
     * @param NFOption Nextflow选项。
     */
    public void setNFOption(NFOption NFOption) {
        this.NFOption = NFOption;
    }

    /**
     * Get 项目ID。
（不填使用指定地域下的默认项目） 
     * @return ProjectId 项目ID。
（不填使用指定地域下的默认项目）
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID。
（不填使用指定地域下的默认项目）
     * @param ProjectId 项目ID。
（不填使用指定地域下的默认项目）
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 任务批次描述。 
     * @return Description 任务批次描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 任务批次描述。
     * @param Description 任务批次描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 任务输入JSON。需要进行base64编码。
（InputBase64和InputCosUri必选其一） 
     * @return InputBase64 任务输入JSON。需要进行base64编码。
（InputBase64和InputCosUri必选其一）
     */
    public String getInputBase64() {
        return this.InputBase64;
    }

    /**
     * Set 任务输入JSON。需要进行base64编码。
（InputBase64和InputCosUri必选其一）
     * @param InputBase64 任务输入JSON。需要进行base64编码。
（InputBase64和InputCosUri必选其一）
     */
    public void setInputBase64(String InputBase64) {
        this.InputBase64 = InputBase64;
    }

    /**
     * Get 任务输入COS地址。
（InputBase64和InputCosUri必选其一） 
     * @return InputCosUri 任务输入COS地址。
（InputBase64和InputCosUri必选其一）
     */
    public String getInputCosUri() {
        return this.InputCosUri;
    }

    /**
     * Set 任务输入COS地址。
（InputBase64和InputCosUri必选其一）
     * @param InputCosUri 任务输入COS地址。
（InputBase64和InputCosUri必选其一）
     */
    public void setInputCosUri(String InputCosUri) {
        this.InputCosUri = InputCosUri;
    }

    /**
     * Get 任务缓存清理时间（小时）。不填表示不清理。 
     * @return CacheClearDelay 任务缓存清理时间（小时）。不填表示不清理。
     */
    public Long getCacheClearDelay() {
        return this.CacheClearDelay;
    }

    /**
     * Set 任务缓存清理时间（小时）。不填表示不清理。
     * @param CacheClearDelay 任务缓存清理时间（小时）。不填表示不清理。
     */
    public void setCacheClearDelay(Long CacheClearDelay) {
        this.CacheClearDelay = CacheClearDelay;
    }

    public RunWorkflowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunWorkflowRequest(RunWorkflowRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.GitSource != null) {
            this.GitSource = new GitInfo(source.GitSource);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.NFOption != null) {
            this.NFOption = new NFOption(source.NFOption);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.InputBase64 != null) {
            this.InputBase64 = new String(source.InputBase64);
        }
        if (source.InputCosUri != null) {
            this.InputCosUri = new String(source.InputCosUri);
        }
        if (source.CacheClearDelay != null) {
            this.CacheClearDelay = new Long(source.CacheClearDelay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamObj(map, prefix + "GitSource.", this.GitSource);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "NFOption.", this.NFOption);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "InputBase64", this.InputBase64);
        this.setParamSimple(map, prefix + "InputCosUri", this.InputCosUri);
        this.setParamSimple(map, prefix + "CacheClearDelay", this.CacheClearDelay);

    }
}

