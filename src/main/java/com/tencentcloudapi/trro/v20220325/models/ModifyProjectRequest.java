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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyProjectRequest extends AbstractModel{

    /**
    * 目标修改项目的项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 修改后的项目名称，不填则不修改
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 修改后的项目描述，不填则不修改
    */
    @SerializedName("ProjectDescription")
    @Expose
    private String ProjectDescription;

    /**
    * 修改后的权限模式，black为黑名单，white为白名单,不填则不修改
    */
    @SerializedName("PolicyMode")
    @Expose
    private String PolicyMode;

    /**
     * Get 目标修改项目的项目ID 
     * @return ProjectId 目标修改项目的项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 目标修改项目的项目ID
     * @param ProjectId 目标修改项目的项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 修改后的项目名称，不填则不修改 
     * @return ProjectName 修改后的项目名称，不填则不修改
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 修改后的项目名称，不填则不修改
     * @param ProjectName 修改后的项目名称，不填则不修改
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 修改后的项目描述，不填则不修改 
     * @return ProjectDescription 修改后的项目描述，不填则不修改
     */
    public String getProjectDescription() {
        return this.ProjectDescription;
    }

    /**
     * Set 修改后的项目描述，不填则不修改
     * @param ProjectDescription 修改后的项目描述，不填则不修改
     */
    public void setProjectDescription(String ProjectDescription) {
        this.ProjectDescription = ProjectDescription;
    }

    /**
     * Get 修改后的权限模式，black为黑名单，white为白名单,不填则不修改 
     * @return PolicyMode 修改后的权限模式，black为黑名单，white为白名单,不填则不修改
     */
    public String getPolicyMode() {
        return this.PolicyMode;
    }

    /**
     * Set 修改后的权限模式，black为黑名单，white为白名单,不填则不修改
     * @param PolicyMode 修改后的权限模式，black为黑名单，white为白名单,不填则不修改
     */
    public void setPolicyMode(String PolicyMode) {
        this.PolicyMode = PolicyMode;
    }

    public ModifyProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyProjectRequest(ModifyProjectRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.ProjectDescription != null) {
            this.ProjectDescription = new String(source.ProjectDescription);
        }
        if (source.PolicyMode != null) {
            this.PolicyMode = new String(source.PolicyMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "ProjectDescription", this.ProjectDescription);
        this.setParamSimple(map, prefix + "PolicyMode", this.PolicyMode);

    }
}

