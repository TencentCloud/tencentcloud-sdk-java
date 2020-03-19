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

public class DescribeProjectResponse extends AbstractModel{

    /**
    * 项目id
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
    private Float ProjectBudget;

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
    * 子项目列表
    */
    @SerializedName("SubProjectList")
    @Expose
    private SubProjectInfo [] SubProjectList;

    /**
    * 项目状态
    */
    @SerializedName("ProjectStatus")
    @Expose
    private String ProjectStatus;

    /**
    * 项目机构Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectOrgId")
    @Expose
    private String ProjectOrgId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get 子项目列表 
     * @return SubProjectList 子项目列表
     */
    public SubProjectInfo [] getSubProjectList() {
        return this.SubProjectList;
    }

    /**
     * Set 子项目列表
     * @param SubProjectList 子项目列表
     */
    public void setSubProjectList(SubProjectInfo [] SubProjectList) {
        this.SubProjectList = SubProjectList;
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
     * Get 项目机构Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectOrgId 项目机构Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectOrgId() {
        return this.ProjectOrgId;
    }

    /**
     * Set 项目机构Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectOrgId 项目机构Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectOrgId(String ProjectOrgId) {
        this.ProjectOrgId = ProjectOrgId;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
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
        this.setParamArrayObj(map, prefix + "SubProjectList.", this.SubProjectList);
        this.setParamSimple(map, prefix + "ProjectStatus", this.ProjectStatus);
        this.setParamSimple(map, prefix + "ProjectOrgId", this.ProjectOrgId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

