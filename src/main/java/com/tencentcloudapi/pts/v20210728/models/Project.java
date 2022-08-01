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

public class Project extends AbstractModel{

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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 标签数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private TagSpec [] Tags;

    /**
    * 项目状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 修改时间
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * App ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 用户ID
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 子用户ID
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 项目描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 项目描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 项目描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 标签数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TagSpec [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(TagSpec [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 项目状态 
     * @return Status 项目状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 项目状态
     * @param Status 项目状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间 
     * @return CreatedAt 创建时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间
     * @param CreatedAt 创建时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 修改时间 
     * @return UpdatedAt 修改时间
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 修改时间
     * @param UpdatedAt 修改时间
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get App ID 
     * @return AppId App ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set App ID
     * @param AppId App ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 用户ID 
     * @return Uin 用户ID
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 用户ID
     * @param Uin 用户ID
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 子用户ID 
     * @return SubAccountUin 子用户ID
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set 子用户ID
     * @param SubAccountUin 子用户ID
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
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
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Tags != null) {
            this.Tags = new TagSpec[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagSpec(source.Tags[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);

    }
}

