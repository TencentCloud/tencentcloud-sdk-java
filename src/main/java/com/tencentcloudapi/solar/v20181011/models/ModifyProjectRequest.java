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
package com.tencentcloudapi.solar.v20181011.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyProjectRequest extends AbstractModel {

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
    * 项目预算
    */
    @SerializedName("ProjectBudget")
    @Expose
    private String ProjectBudget;

    /**
    * 项目机构
    */
    @SerializedName("ProjectOrg")
    @Expose
    private String ProjectOrg;

    /**
    * 项目简介
    */
    @SerializedName("ProjectIntroduction")
    @Expose
    private String ProjectIntroduction;

    /**
    * 项目机构Id
    */
    @SerializedName("ProjectOrgId")
    @Expose
    private String ProjectOrgId;

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
     * Get 项目预算 
     * @return ProjectBudget 项目预算
     */
    public String getProjectBudget() {
        return this.ProjectBudget;
    }

    /**
     * Set 项目预算
     * @param ProjectBudget 项目预算
     */
    public void setProjectBudget(String ProjectBudget) {
        this.ProjectBudget = ProjectBudget;
    }

    /**
     * Get 项目机构 
     * @return ProjectOrg 项目机构
     */
    public String getProjectOrg() {
        return this.ProjectOrg;
    }

    /**
     * Set 项目机构
     * @param ProjectOrg 项目机构
     */
    public void setProjectOrg(String ProjectOrg) {
        this.ProjectOrg = ProjectOrg;
    }

    /**
     * Get 项目简介 
     * @return ProjectIntroduction 项目简介
     */
    public String getProjectIntroduction() {
        return this.ProjectIntroduction;
    }

    /**
     * Set 项目简介
     * @param ProjectIntroduction 项目简介
     */
    public void setProjectIntroduction(String ProjectIntroduction) {
        this.ProjectIntroduction = ProjectIntroduction;
    }

    /**
     * Get 项目机构Id 
     * @return ProjectOrgId 项目机构Id
     */
    public String getProjectOrgId() {
        return this.ProjectOrgId;
    }

    /**
     * Set 项目机构Id
     * @param ProjectOrgId 项目机构Id
     */
    public void setProjectOrgId(String ProjectOrgId) {
        this.ProjectOrgId = ProjectOrgId;
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
        if (source.ProjectBudget != null) {
            this.ProjectBudget = new String(source.ProjectBudget);
        }
        if (source.ProjectOrg != null) {
            this.ProjectOrg = new String(source.ProjectOrg);
        }
        if (source.ProjectIntroduction != null) {
            this.ProjectIntroduction = new String(source.ProjectIntroduction);
        }
        if (source.ProjectOrgId != null) {
            this.ProjectOrgId = new String(source.ProjectOrgId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "ProjectBudget", this.ProjectBudget);
        this.setParamSimple(map, prefix + "ProjectOrg", this.ProjectOrg);
        this.setParamSimple(map, prefix + "ProjectIntroduction", this.ProjectIntroduction);
        this.setParamSimple(map, prefix + "ProjectOrgId", this.ProjectOrgId);

    }
}

