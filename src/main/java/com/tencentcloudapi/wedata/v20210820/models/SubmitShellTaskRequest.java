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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubmitShellTaskRequest extends AbstractModel {

    /**
    * 执行资源组id
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 脚本内容
    */
    @SerializedName("ScriptContent")
    @Expose
    private String ScriptContent;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 脚本文件路径
    */
    @SerializedName("ScriptPath")
    @Expose
    private String ScriptPath;

    /**
    * 脚本类型
    */
    @SerializedName("ScriptType")
    @Expose
    private String ScriptType;

    /**
    * 脚本名称
    */
    @SerializedName("ScriptName")
    @Expose
    private String ScriptName;

    /**
    * 高级运行参数
    */
    @SerializedName("RunParams")
    @Expose
    private String RunParams;

    /**
    * 脚本Id
    */
    @SerializedName("ScriptId")
    @Expose
    private String ScriptId;

    /**
    * 脚本内容是否加密，默认不加膜
    */
    @SerializedName("ScriptEncryption")
    @Expose
    private Boolean ScriptEncryption;

    /**
     * Get 执行资源组id 
     * @return GroupId 执行资源组id
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 执行资源组id
     * @param GroupId 执行资源组id
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 脚本内容 
     * @return ScriptContent 脚本内容
     */
    public String getScriptContent() {
        return this.ScriptContent;
    }

    /**
     * Set 脚本内容
     * @param ScriptContent 脚本内容
     */
    public void setScriptContent(String ScriptContent) {
        this.ScriptContent = ScriptContent;
    }

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 脚本文件路径 
     * @return ScriptPath 脚本文件路径
     */
    public String getScriptPath() {
        return this.ScriptPath;
    }

    /**
     * Set 脚本文件路径
     * @param ScriptPath 脚本文件路径
     */
    public void setScriptPath(String ScriptPath) {
        this.ScriptPath = ScriptPath;
    }

    /**
     * Get 脚本类型 
     * @return ScriptType 脚本类型
     */
    public String getScriptType() {
        return this.ScriptType;
    }

    /**
     * Set 脚本类型
     * @param ScriptType 脚本类型
     */
    public void setScriptType(String ScriptType) {
        this.ScriptType = ScriptType;
    }

    /**
     * Get 脚本名称 
     * @return ScriptName 脚本名称
     */
    public String getScriptName() {
        return this.ScriptName;
    }

    /**
     * Set 脚本名称
     * @param ScriptName 脚本名称
     */
    public void setScriptName(String ScriptName) {
        this.ScriptName = ScriptName;
    }

    /**
     * Get 高级运行参数 
     * @return RunParams 高级运行参数
     */
    public String getRunParams() {
        return this.RunParams;
    }

    /**
     * Set 高级运行参数
     * @param RunParams 高级运行参数
     */
    public void setRunParams(String RunParams) {
        this.RunParams = RunParams;
    }

    /**
     * Get 脚本Id 
     * @return ScriptId 脚本Id
     */
    public String getScriptId() {
        return this.ScriptId;
    }

    /**
     * Set 脚本Id
     * @param ScriptId 脚本Id
     */
    public void setScriptId(String ScriptId) {
        this.ScriptId = ScriptId;
    }

    /**
     * Get 脚本内容是否加密，默认不加膜 
     * @return ScriptEncryption 脚本内容是否加密，默认不加膜
     */
    public Boolean getScriptEncryption() {
        return this.ScriptEncryption;
    }

    /**
     * Set 脚本内容是否加密，默认不加膜
     * @param ScriptEncryption 脚本内容是否加密，默认不加膜
     */
    public void setScriptEncryption(Boolean ScriptEncryption) {
        this.ScriptEncryption = ScriptEncryption;
    }

    public SubmitShellTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitShellTaskRequest(SubmitShellTaskRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.ScriptContent != null) {
            this.ScriptContent = new String(source.ScriptContent);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ScriptPath != null) {
            this.ScriptPath = new String(source.ScriptPath);
        }
        if (source.ScriptType != null) {
            this.ScriptType = new String(source.ScriptType);
        }
        if (source.ScriptName != null) {
            this.ScriptName = new String(source.ScriptName);
        }
        if (source.RunParams != null) {
            this.RunParams = new String(source.RunParams);
        }
        if (source.ScriptId != null) {
            this.ScriptId = new String(source.ScriptId);
        }
        if (source.ScriptEncryption != null) {
            this.ScriptEncryption = new Boolean(source.ScriptEncryption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "ScriptContent", this.ScriptContent);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ScriptPath", this.ScriptPath);
        this.setParamSimple(map, prefix + "ScriptType", this.ScriptType);
        this.setParamSimple(map, prefix + "ScriptName", this.ScriptName);
        this.setParamSimple(map, prefix + "RunParams", this.RunParams);
        this.setParamSimple(map, prefix + "ScriptId", this.ScriptId);
        this.setParamSimple(map, prefix + "ScriptEncryption", this.ScriptEncryption);

    }
}

