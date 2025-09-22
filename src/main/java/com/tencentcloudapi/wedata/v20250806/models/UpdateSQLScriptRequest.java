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

public class UpdateSQLScriptRequest extends AbstractModel {

    /**
    * 探索脚本Id
    */
    @SerializedName("ScriptId")
    @Expose
    private String ScriptId;

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 数据探索脚本配置
    */
    @SerializedName("ScriptConfig")
    @Expose
    private SQLScriptConfig ScriptConfig;

    /**
    * 脚本内容, 需要用Base64编码
    */
    @SerializedName("ScriptContent")
    @Expose
    private String ScriptContent;

    /**
     * Get 探索脚本Id 
     * @return ScriptId 探索脚本Id
     */
    public String getScriptId() {
        return this.ScriptId;
    }

    /**
     * Set 探索脚本Id
     * @param ScriptId 探索脚本Id
     */
    public void setScriptId(String ScriptId) {
        this.ScriptId = ScriptId;
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
     * Get 脚本内容, 需要用Base64编码 
     * @return ScriptContent 脚本内容, 需要用Base64编码
     */
    public String getScriptContent() {
        return this.ScriptContent;
    }

    /**
     * Set 脚本内容, 需要用Base64编码
     * @param ScriptContent 脚本内容, 需要用Base64编码
     */
    public void setScriptContent(String ScriptContent) {
        this.ScriptContent = ScriptContent;
    }

    public UpdateSQLScriptRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateSQLScriptRequest(UpdateSQLScriptRequest source) {
        if (source.ScriptId != null) {
            this.ScriptId = new String(source.ScriptId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ScriptConfig != null) {
            this.ScriptConfig = new SQLScriptConfig(source.ScriptConfig);
        }
        if (source.ScriptContent != null) {
            this.ScriptContent = new String(source.ScriptContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScriptId", this.ScriptId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamObj(map, prefix + "ScriptConfig.", this.ScriptConfig);
        this.setParamSimple(map, prefix + "ScriptContent", this.ScriptContent);

    }
}

