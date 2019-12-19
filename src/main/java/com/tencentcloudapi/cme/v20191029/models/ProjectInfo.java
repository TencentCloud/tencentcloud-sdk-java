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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProjectInfo extends AbstractModel{

    /**
    * 项目 Id。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 项目名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 画布宽高比。
    */
    @SerializedName("AspectRatio")
    @Expose
    private String AspectRatio;

    /**
    * 项目类别。
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * 归属者。
    */
    @SerializedName("Owner")
    @Expose
    private Entity Owner;

    /**
     * Get 项目 Id。 
     * @return ProjectId 项目 Id。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 Id。
     * @param ProjectId 项目 Id。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 项目名称。 
     * @return Name 项目名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 项目名称。
     * @param Name 项目名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 画布宽高比。 
     * @return AspectRatio 画布宽高比。
     */
    public String getAspectRatio() {
        return this.AspectRatio;
    }

    /**
     * Set 画布宽高比。
     * @param AspectRatio 画布宽高比。
     */
    public void setAspectRatio(String AspectRatio) {
        this.AspectRatio = AspectRatio;
    }

    /**
     * Get 项目类别。 
     * @return Category 项目类别。
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 项目类别。
     * @param Category 项目类别。
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get 归属者。 
     * @return Owner 归属者。
     */
    public Entity getOwner() {
        return this.Owner;
    }

    /**
     * Set 归属者。
     * @param Owner 归属者。
     */
    public void setOwner(Entity Owner) {
        this.Owner = Owner;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AspectRatio", this.AspectRatio);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamObj(map, prefix + "Owner.", this.Owner);

    }
}

