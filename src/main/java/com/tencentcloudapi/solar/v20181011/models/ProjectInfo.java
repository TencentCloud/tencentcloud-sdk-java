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
package com.tencentcloudapi.solar.v20181011.models;

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
    * 项目所属机构
    */
    @SerializedName("ProjectOrg")
    @Expose
    private String ProjectOrg;

    /**
    * 项目预算
    */
    @SerializedName("ProjectBudget")
    @Expose
    private Float ProjectBudget;

    /**
    * 项目状态
    */
    @SerializedName("ProjectStatus")
    @Expose
    private String ProjectStatus;

    /**
    * 项目创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 项目简介
    */
    @SerializedName("ProjectIntroduction")
    @Expose
    private String ProjectIntroduction;

    /**
    * 项目所属机构Id
注意：此字段可能返回 null，表示取不到有效值。
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
     * Get 项目所属机构 
     * @return ProjectOrg 项目所属机构
     */
    public String getProjectOrg() {
        return this.ProjectOrg;
    }

    /**
     * Set 项目所属机构
     * @param ProjectOrg 项目所属机构
     */
    public void setProjectOrg(String ProjectOrg) {
        this.ProjectOrg = ProjectOrg;
    }

    /**
     * Get 项目预算 
     * @return ProjectBudget 项目预算
     */
    public Float getProjectBudget() {
        return this.ProjectBudget;
    }

    /**
     * Set 项目预算
     * @param ProjectBudget 项目预算
     */
    public void setProjectBudget(Float ProjectBudget) {
        this.ProjectBudget = ProjectBudget;
    }

    /**
     * Get 项目状态 
     * @return ProjectStatus 项目状态
     */
    public String getProjectStatus() {
        return this.ProjectStatus;
    }

    /**
     * Set 项目状态
     * @param ProjectStatus 项目状态
     */
    public void setProjectStatus(String ProjectStatus) {
        this.ProjectStatus = ProjectStatus;
    }

    /**
     * Get 项目创建时间 
     * @return CreateTime 项目创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 项目创建时间
     * @param CreateTime 项目创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
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
     * Get 项目所属机构Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectOrgId 项目所属机构Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectOrgId() {
        return this.ProjectOrgId;
    }

    /**
     * Set 项目所属机构Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectOrgId 项目所属机构Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectOrgId(String ProjectOrgId) {
        this.ProjectOrgId = ProjectOrgId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "ProjectOrg", this.ProjectOrg);
        this.setParamSimple(map, prefix + "ProjectBudget", this.ProjectBudget);
        this.setParamSimple(map, prefix + "ProjectStatus", this.ProjectStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ProjectIntroduction", this.ProjectIntroduction);
        this.setParamSimple(map, prefix + "ProjectOrgId", this.ProjectOrgId);

    }
}

