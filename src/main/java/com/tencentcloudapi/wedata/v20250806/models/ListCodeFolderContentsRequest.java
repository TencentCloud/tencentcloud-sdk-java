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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListCodeFolderContentsRequest extends AbstractModel {

    /**
    * <p>项目ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>父文件夹path，例如/aaa/bbb/ccc，路径头需带斜杠，根目录传/</p>
    */
    @SerializedName("ParentFolderPath")
    @Expose
    private String ParentFolderPath;

    /**
    * <p>文件夹名称/代码文件名称搜索</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * <p>只查询文件夹</p>
    */
    @SerializedName("OnlyFolderNode")
    @Expose
    private Boolean OnlyFolderNode;

    /**
    * <p>是否只查询用户自己创建的代码文件</p>
    */
    @SerializedName("OnlyUserSelfScript")
    @Expose
    private Boolean OnlyUserSelfScript;

    /**
    * <p>是否只查询提交状态为提交成功的文件</p><p>默认值：false</p>
    */
    @SerializedName("SubmitStatusFilter")
    @Expose
    private Boolean SubmitStatusFilter;

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
     * Get <p>父文件夹path，例如/aaa/bbb/ccc，路径头需带斜杠，根目录传/</p> 
     * @return ParentFolderPath <p>父文件夹path，例如/aaa/bbb/ccc，路径头需带斜杠，根目录传/</p>
     */
    public String getParentFolderPath() {
        return this.ParentFolderPath;
    }

    /**
     * Set <p>父文件夹path，例如/aaa/bbb/ccc，路径头需带斜杠，根目录传/</p>
     * @param ParentFolderPath <p>父文件夹path，例如/aaa/bbb/ccc，路径头需带斜杠，根目录传/</p>
     */
    public void setParentFolderPath(String ParentFolderPath) {
        this.ParentFolderPath = ParentFolderPath;
    }

    /**
     * Get <p>文件夹名称/代码文件名称搜索</p> 
     * @return Keyword <p>文件夹名称/代码文件名称搜索</p>
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set <p>文件夹名称/代码文件名称搜索</p>
     * @param Keyword <p>文件夹名称/代码文件名称搜索</p>
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get <p>只查询文件夹</p> 
     * @return OnlyFolderNode <p>只查询文件夹</p>
     */
    public Boolean getOnlyFolderNode() {
        return this.OnlyFolderNode;
    }

    /**
     * Set <p>只查询文件夹</p>
     * @param OnlyFolderNode <p>只查询文件夹</p>
     */
    public void setOnlyFolderNode(Boolean OnlyFolderNode) {
        this.OnlyFolderNode = OnlyFolderNode;
    }

    /**
     * Get <p>是否只查询用户自己创建的代码文件</p> 
     * @return OnlyUserSelfScript <p>是否只查询用户自己创建的代码文件</p>
     */
    public Boolean getOnlyUserSelfScript() {
        return this.OnlyUserSelfScript;
    }

    /**
     * Set <p>是否只查询用户自己创建的代码文件</p>
     * @param OnlyUserSelfScript <p>是否只查询用户自己创建的代码文件</p>
     */
    public void setOnlyUserSelfScript(Boolean OnlyUserSelfScript) {
        this.OnlyUserSelfScript = OnlyUserSelfScript;
    }

    /**
     * Get <p>是否只查询提交状态为提交成功的文件</p><p>默认值：false</p> 
     * @return SubmitStatusFilter <p>是否只查询提交状态为提交成功的文件</p><p>默认值：false</p>
     */
    public Boolean getSubmitStatusFilter() {
        return this.SubmitStatusFilter;
    }

    /**
     * Set <p>是否只查询提交状态为提交成功的文件</p><p>默认值：false</p>
     * @param SubmitStatusFilter <p>是否只查询提交状态为提交成功的文件</p><p>默认值：false</p>
     */
    public void setSubmitStatusFilter(Boolean SubmitStatusFilter) {
        this.SubmitStatusFilter = SubmitStatusFilter;
    }

    public ListCodeFolderContentsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListCodeFolderContentsRequest(ListCodeFolderContentsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ParentFolderPath != null) {
            this.ParentFolderPath = new String(source.ParentFolderPath);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.OnlyFolderNode != null) {
            this.OnlyFolderNode = new Boolean(source.OnlyFolderNode);
        }
        if (source.OnlyUserSelfScript != null) {
            this.OnlyUserSelfScript = new Boolean(source.OnlyUserSelfScript);
        }
        if (source.SubmitStatusFilter != null) {
            this.SubmitStatusFilter = new Boolean(source.SubmitStatusFilter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ParentFolderPath", this.ParentFolderPath);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "OnlyFolderNode", this.OnlyFolderNode);
        this.setParamSimple(map, prefix + "OnlyUserSelfScript", this.OnlyUserSelfScript);
        this.setParamSimple(map, prefix + "SubmitStatusFilter", this.SubmitStatusFilter);

    }
}

