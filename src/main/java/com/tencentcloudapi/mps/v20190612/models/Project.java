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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Project extends AbstractModel {

    /**
    * <p>项目id</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>项目名称</p>
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * <p>项目描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>项目术语库</p>
    */
    @SerializedName("TermBase")
    @Expose
    private TermBase [] TermBase;

    /**
    * <p>角色列表</p>
    */
    @SerializedName("Speakers")
    @Expose
    private Speakers [] Speakers;

    /**
    * <p>创建时间（Unix 时间戳）</p>
    */
    @SerializedName("CreatedAt")
    @Expose
    private Long CreatedAt;

    /**
    * <p>更新时间（Unix 时间戳）</p>
    */
    @SerializedName("UpdatedAt")
    @Expose
    private Long UpdatedAt;

    /**
     * Get <p>项目id</p> 
     * @return ProjectId <p>项目id</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目id</p>
     * @param ProjectId <p>项目id</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>项目名称</p> 
     * @return ProjectName <p>项目名称</p>
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set <p>项目名称</p>
     * @param ProjectName <p>项目名称</p>
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get <p>项目描述</p> 
     * @return Description <p>项目描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>项目描述</p>
     * @param Description <p>项目描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>项目术语库</p> 
     * @return TermBase <p>项目术语库</p>
     */
    public TermBase [] getTermBase() {
        return this.TermBase;
    }

    /**
     * Set <p>项目术语库</p>
     * @param TermBase <p>项目术语库</p>
     */
    public void setTermBase(TermBase [] TermBase) {
        this.TermBase = TermBase;
    }

    /**
     * Get <p>角色列表</p> 
     * @return Speakers <p>角色列表</p>
     */
    public Speakers [] getSpeakers() {
        return this.Speakers;
    }

    /**
     * Set <p>角色列表</p>
     * @param Speakers <p>角色列表</p>
     */
    public void setSpeakers(Speakers [] Speakers) {
        this.Speakers = Speakers;
    }

    /**
     * Get <p>创建时间（Unix 时间戳）</p> 
     * @return CreatedAt <p>创建时间（Unix 时间戳）</p>
     */
    public Long getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>创建时间（Unix 时间戳）</p>
     * @param CreatedAt <p>创建时间（Unix 时间戳）</p>
     */
    public void setCreatedAt(Long CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get <p>更新时间（Unix 时间戳）</p> 
     * @return UpdatedAt <p>更新时间（Unix 时间戳）</p>
     */
    public Long getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set <p>更新时间（Unix 时间戳）</p>
     * @param UpdatedAt <p>更新时间（Unix 时间戳）</p>
     */
    public void setUpdatedAt(Long UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    public Project() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Project(Project source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.TermBase != null) {
            this.TermBase = new TermBase[source.TermBase.length];
            for (int i = 0; i < source.TermBase.length; i++) {
                this.TermBase[i] = new TermBase(source.TermBase[i]);
            }
        }
        if (source.Speakers != null) {
            this.Speakers = new Speakers[source.Speakers.length];
            for (int i = 0; i < source.Speakers.length; i++) {
                this.Speakers[i] = new Speakers(source.Speakers[i]);
            }
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new Long(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new Long(source.UpdatedAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "TermBase.", this.TermBase);
        this.setParamArrayObj(map, prefix + "Speakers.", this.Speakers);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);

    }
}

