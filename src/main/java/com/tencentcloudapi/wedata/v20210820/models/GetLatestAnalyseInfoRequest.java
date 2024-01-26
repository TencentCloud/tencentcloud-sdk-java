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

public class GetLatestAnalyseInfoRequest extends AbstractModel {

    /**
    * 项目编号
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 脚本编号
    */
    @SerializedName("ScriptId")
    @Expose
    private String ScriptId;

    /**
    * 是否只显示当前用户的
    */
    @SerializedName("IsOnlyCurrUser")
    @Expose
    private Boolean IsOnlyCurrUser;

    /**
     * Get 项目编号 
     * @return ProjectId 项目编号
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目编号
     * @param ProjectId 项目编号
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 脚本编号 
     * @return ScriptId 脚本编号
     */
    public String getScriptId() {
        return this.ScriptId;
    }

    /**
     * Set 脚本编号
     * @param ScriptId 脚本编号
     */
    public void setScriptId(String ScriptId) {
        this.ScriptId = ScriptId;
    }

    /**
     * Get 是否只显示当前用户的 
     * @return IsOnlyCurrUser 是否只显示当前用户的
     */
    public Boolean getIsOnlyCurrUser() {
        return this.IsOnlyCurrUser;
    }

    /**
     * Set 是否只显示当前用户的
     * @param IsOnlyCurrUser 是否只显示当前用户的
     */
    public void setIsOnlyCurrUser(Boolean IsOnlyCurrUser) {
        this.IsOnlyCurrUser = IsOnlyCurrUser;
    }

    public GetLatestAnalyseInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetLatestAnalyseInfoRequest(GetLatestAnalyseInfoRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ScriptId != null) {
            this.ScriptId = new String(source.ScriptId);
        }
        if (source.IsOnlyCurrUser != null) {
            this.IsOnlyCurrUser = new Boolean(source.IsOnlyCurrUser);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ScriptId", this.ScriptId);
        this.setParamSimple(map, prefix + "IsOnlyCurrUser", this.IsOnlyCurrUser);

    }
}

