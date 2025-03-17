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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProjectInfo extends AbstractModel {

    /**
    * 项目名称。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 项目创建用户 UIN。
    */
    @SerializedName("ProjectCreatorUin")
    @Expose
    private Long ProjectCreatorUin;

    /**
    * 项目创建时间。
    */
    @SerializedName("ProjectCreateTime")
    @Expose
    private String ProjectCreateTime;

    /**
    * 项目信息简述。
    */
    @SerializedName("ProjectResume")
    @Expose
    private String ProjectResume;

    /**
    * 用户 UIN。
    */
    @SerializedName("OwnerUin")
    @Expose
    private Long OwnerUin;

    /**
    * 项目 ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get 项目名称。 
     * @return ProjectName 项目名称。
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名称。
     * @param ProjectName 项目名称。
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 项目创建用户 UIN。 
     * @return ProjectCreatorUin 项目创建用户 UIN。
     */
    public Long getProjectCreatorUin() {
        return this.ProjectCreatorUin;
    }

    /**
     * Set 项目创建用户 UIN。
     * @param ProjectCreatorUin 项目创建用户 UIN。
     */
    public void setProjectCreatorUin(Long ProjectCreatorUin) {
        this.ProjectCreatorUin = ProjectCreatorUin;
    }

    /**
     * Get 项目创建时间。 
     * @return ProjectCreateTime 项目创建时间。
     */
    public String getProjectCreateTime() {
        return this.ProjectCreateTime;
    }

    /**
     * Set 项目创建时间。
     * @param ProjectCreateTime 项目创建时间。
     */
    public void setProjectCreateTime(String ProjectCreateTime) {
        this.ProjectCreateTime = ProjectCreateTime;
    }

    /**
     * Get 项目信息简述。 
     * @return ProjectResume 项目信息简述。
     */
    public String getProjectResume() {
        return this.ProjectResume;
    }

    /**
     * Set 项目信息简述。
     * @param ProjectResume 项目信息简述。
     */
    public void setProjectResume(String ProjectResume) {
        this.ProjectResume = ProjectResume;
    }

    /**
     * Get 用户 UIN。 
     * @return OwnerUin 用户 UIN。
     */
    public Long getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 用户 UIN。
     * @param OwnerUin 用户 UIN。
     */
    public void setOwnerUin(Long OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 项目 ID。 
     * @return ProjectId 项目 ID。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 ID。
     * @param ProjectId 项目 ID。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    public ProjectInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProjectInfo(ProjectInfo source) {
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.ProjectCreatorUin != null) {
            this.ProjectCreatorUin = new Long(source.ProjectCreatorUin);
        }
        if (source.ProjectCreateTime != null) {
            this.ProjectCreateTime = new String(source.ProjectCreateTime);
        }
        if (source.ProjectResume != null) {
            this.ProjectResume = new String(source.ProjectResume);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new Long(source.OwnerUin);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "ProjectCreatorUin", this.ProjectCreatorUin);
        this.setParamSimple(map, prefix + "ProjectCreateTime", this.ProjectCreateTime);
        this.setParamSimple(map, prefix + "ProjectResume", this.ProjectResume);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

