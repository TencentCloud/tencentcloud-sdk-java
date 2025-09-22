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

public class CreateSQLScriptRequest extends AbstractModel {

    /**
    * 脚本名称
    */
    @SerializedName("ScriptName")
    @Expose
    private String ScriptName;

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 父文件夹path，/aaa/bbb/ccc，根目录为空字符串或/
    */
    @SerializedName("ParentFolderPath")
    @Expose
    private String ParentFolderPath;

    /**
    * 数据探索脚本配置
    */
    @SerializedName("ScriptConfig")
    @Expose
    private SQLScriptConfig ScriptConfig;

    /**
    * 脚本内容，如有值，则要将内容进行base64编码
    */
    @SerializedName("ScriptContent")
    @Expose
    private String ScriptContent;

    /**
    * 权限范围：SHARED, PRIVATE
    */
    @SerializedName("AccessScope")
    @Expose
    private String AccessScope;

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
     * Get 父文件夹path，/aaa/bbb/ccc，根目录为空字符串或/ 
     * @return ParentFolderPath 父文件夹path，/aaa/bbb/ccc，根目录为空字符串或/
     */
    public String getParentFolderPath() {
        return this.ParentFolderPath;
    }

    /**
     * Set 父文件夹path，/aaa/bbb/ccc，根目录为空字符串或/
     * @param ParentFolderPath 父文件夹path，/aaa/bbb/ccc，根目录为空字符串或/
     */
    public void setParentFolderPath(String ParentFolderPath) {
        this.ParentFolderPath = ParentFolderPath;
    }

    /**
     * Get 数据探索脚本配置 
     * @return ScriptConfig 数据探索脚本配置
     */
    public SQLScriptConfig getScriptConfig() {
        return this.ScriptConfig;
    }

    /**
     * Set 数据探索脚本配置
     * @param ScriptConfig 数据探索脚本配置
     */
    public void setScriptConfig(SQLScriptConfig ScriptConfig) {
        this.ScriptConfig = ScriptConfig;
    }

    /**
     * Get 脚本内容，如有值，则要将内容进行base64编码 
     * @return ScriptContent 脚本内容，如有值，则要将内容进行base64编码
     */
    public String getScriptContent() {
        return this.ScriptContent;
    }

    /**
     * Set 脚本内容，如有值，则要将内容进行base64编码
     * @param ScriptContent 脚本内容，如有值，则要将内容进行base64编码
     */
    public void setScriptContent(String ScriptContent) {
        this.ScriptContent = ScriptContent;
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

    public CreateSQLScriptRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSQLScriptRequest(CreateSQLScriptRequest source) {
        if (source.ScriptName != null) {
            this.ScriptName = new String(source.ScriptName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ParentFolderPath != null) {
            this.ParentFolderPath = new String(source.ParentFolderPath);
        }
        if (source.ScriptConfig != null) {
            this.ScriptConfig = new SQLScriptConfig(source.ScriptConfig);
        }
        if (source.ScriptContent != null) {
            this.ScriptContent = new String(source.ScriptContent);
        }
        if (source.AccessScope != null) {
            this.AccessScope = new String(source.AccessScope);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScriptName", this.ScriptName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ParentFolderPath", this.ParentFolderPath);
        this.setParamObj(map, prefix + "ScriptConfig.", this.ScriptConfig);
        this.setParamSimple(map, prefix + "ScriptContent", this.ScriptContent);
        this.setParamSimple(map, prefix + "AccessScope", this.AccessScope);

    }
}

