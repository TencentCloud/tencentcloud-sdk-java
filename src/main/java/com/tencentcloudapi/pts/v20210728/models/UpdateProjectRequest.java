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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateProjectRequest extends AbstractModel{

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 项目名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 项目描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 项目状态，默认传递1
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 标签数组
    */
    @SerializedName("Tags")
    @Expose
    private TagSpec [] Tags;

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
     * Get 项目名 
     * @return Name 项目名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 项目名
     * @param Name 项目名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 项目描述 
     * @return Description 项目描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 项目描述
     * @param Description 项目描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 项目状态，默认传递1 
     * @return Status 项目状态，默认传递1
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 项目状态，默认传递1
     * @param Status 项目状态，默认传递1
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 标签数组 
     * @return Tags 标签数组
     */
    public TagSpec [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签数组
     * @param Tags 标签数组
     */
    public void setTags(TagSpec [] Tags) {
        this.Tags = Tags;
    }

    public UpdateProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateProjectRequest(UpdateProjectRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Tags != null) {
            this.Tags = new TagSpec[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagSpec(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

