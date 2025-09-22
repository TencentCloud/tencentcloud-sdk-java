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

public class ListSQLFolderContentsRequest extends AbstractModel {

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 父文件夹path，/aaa/bbb/ccc，路径头需带斜杠，查询根目录传/
    */
    @SerializedName("ParentFolderPath")
    @Expose
    private String ParentFolderPath;

    /**
    * 文件夹名称/脚本名称搜索
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 只查询文件夹
    */
    @SerializedName("OnlyFolderNode")
    @Expose
    private Boolean OnlyFolderNode;

    /**
    * 是否只查询用户自己创建的脚本
    */
    @SerializedName("OnlyUserSelfScript")
    @Expose
    private Boolean OnlyUserSelfScript;

    /**
    * 权限范围：SHARED, PRIVATE
    */
    @SerializedName("AccessScope")
    @Expose
    private String AccessScope;

    /**
     * Get 项目Id 
     * @return ProjectId 项目Id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 父文件夹path，/aaa/bbb/ccc，路径头需带斜杠，查询根目录传/ 
     * @return ParentFolderPath 父文件夹path，/aaa/bbb/ccc，路径头需带斜杠，查询根目录传/
     */
    public String getParentFolderPath() {
        return this.ParentFolderPath;
    }

    /**
     * Set 父文件夹path，/aaa/bbb/ccc，路径头需带斜杠，查询根目录传/
     * @param ParentFolderPath 父文件夹path，/aaa/bbb/ccc，路径头需带斜杠，查询根目录传/
     */
    public void setParentFolderPath(String ParentFolderPath) {
        this.ParentFolderPath = ParentFolderPath;
    }

    /**
     * Get 文件夹名称/脚本名称搜索 
     * @return Keyword 文件夹名称/脚本名称搜索
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 文件夹名称/脚本名称搜索
     * @param Keyword 文件夹名称/脚本名称搜索
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 只查询文件夹 
     * @return OnlyFolderNode 只查询文件夹
     */
    public Boolean getOnlyFolderNode() {
        return this.OnlyFolderNode;
    }

    /**
     * Set 只查询文件夹
     * @param OnlyFolderNode 只查询文件夹
     */
    public void setOnlyFolderNode(Boolean OnlyFolderNode) {
        this.OnlyFolderNode = OnlyFolderNode;
    }

    /**
     * Get 是否只查询用户自己创建的脚本 
     * @return OnlyUserSelfScript 是否只查询用户自己创建的脚本
     */
    public Boolean getOnlyUserSelfScript() {
        return this.OnlyUserSelfScript;
    }

    /**
     * Set 是否只查询用户自己创建的脚本
     * @param OnlyUserSelfScript 是否只查询用户自己创建的脚本
     */
    public void setOnlyUserSelfScript(Boolean OnlyUserSelfScript) {
        this.OnlyUserSelfScript = OnlyUserSelfScript;
    }

    /**
     * Get 权限范围：SHARED, PRIVATE 
     * @return AccessScope 权限范围：SHARED, PRIVATE
     */
    public String getAccessScope() {
        return this.AccessScope;
    }

    /**
     * Set 权限范围：SHARED, PRIVATE
     * @param AccessScope 权限范围：SHARED, PRIVATE
     */
    public void setAccessScope(String AccessScope) {
        this.AccessScope = AccessScope;
    }

    public ListSQLFolderContentsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListSQLFolderContentsRequest(ListSQLFolderContentsRequest source) {
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
        if (source.AccessScope != null) {
            this.AccessScope = new String(source.AccessScope);
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
        this.setParamSimple(map, prefix + "AccessScope", this.AccessScope);

    }
}

