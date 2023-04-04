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

public class ProjectInfo extends AbstractModel{

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 项目名称
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 项目描述
    */
    @SerializedName("ProjectDescription")
    @Expose
    private String ProjectDescription;

    /**
    * 项目权限模式，black为黑名单，white为白名单
    */
    @SerializedName("PolicyMode")
    @Expose
    private String PolicyMode;

    /**
    * 项目信息修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 项目名称 
     * @return ProjectName 项目名称
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名称
     * @param ProjectName 项目名称
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 项目描述 
     * @return ProjectDescription 项目描述
     */
    public String getProjectDescription() {
        return this.ProjectDescription;
    }

    /**
     * Set 项目描述
     * @param ProjectDescription 项目描述
     */
    public void setProjectDescription(String ProjectDescription) {
        this.ProjectDescription = ProjectDescription;
    }

    /**
     * Get 项目权限模式，black为黑名单，white为白名单 
     * @return PolicyMode 项目权限模式，black为黑名单，white为白名单
     */
    public String getPolicyMode() {
        return this.PolicyMode;
    }

    /**
     * Set 项目权限模式，black为黑名单，white为白名单
     * @param PolicyMode 项目权限模式，black为黑名单，white为白名单
     */
    public void setPolicyMode(String PolicyMode) {
        this.PolicyMode = PolicyMode;
    }

    /**
     * Get 项目信息修改时间 
     * @return ModifyTime 项目信息修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 项目信息修改时间
     * @param ModifyTime 项目信息修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public ProjectInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProjectInfo(ProjectInfo source) {
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
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
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
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

