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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataSource extends AbstractModel {

    /**
    * 归属项目ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 数据源类型:枚举值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 数据源展示名，为了可视化查看
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 数据源描述信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 归属项目Name
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 数据源创建人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateUser")
    @Expose
    private String CreateUser;

    /**
    * 时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyUser")
    @Expose
    private String ModifyUser;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 数据源的配置信息，以JSON KV存储，根据每个数据源类型不同，而KV存储信息不同
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProdConProperties")
    @Expose
    private String ProdConProperties;

    /**
    * 同params 内容为开发数据源的数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DevConProperties")
    @Expose
    private String DevConProperties;

    /**
    * 数据源类别：

- DB ---自定义源
- CLUSTER --- 系统源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
     * Get 归属项目ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 归属项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 归属项目ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 归属项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 数据源ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 数据源类型:枚举值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 数据源类型:枚举值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 数据源类型:枚举值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 数据源类型:枚举值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 数据源名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 数据源展示名，为了可视化查看
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisplayName 数据源展示名，为了可视化查看
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 数据源展示名，为了可视化查看
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisplayName 数据源展示名，为了可视化查看
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 数据源描述信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 数据源描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 数据源描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 数据源描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 归属项目Name
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectName 归属项目Name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 归属项目Name
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectName 归属项目Name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 数据源创建人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateUser 数据源创建人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateUser() {
        return this.CreateUser;
    }

    /**
     * Set 数据源创建人
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateUser 数据源创建人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateUser(String CreateUser) {
        this.CreateUser = CreateUser;
    }

    /**
     * Get 时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyUser 更新人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyUser() {
        return this.ModifyUser;
    }

    /**
     * Set 更新人
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyUser 更新人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyUser(String ModifyUser) {
        this.ModifyUser = ModifyUser;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 数据源的配置信息，以JSON KV存储，根据每个数据源类型不同，而KV存储信息不同
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProdConProperties 数据源的配置信息，以JSON KV存储，根据每个数据源类型不同，而KV存储信息不同
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProdConProperties() {
        return this.ProdConProperties;
    }

    /**
     * Set 数据源的配置信息，以JSON KV存储，根据每个数据源类型不同，而KV存储信息不同
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProdConProperties 数据源的配置信息，以JSON KV存储，根据每个数据源类型不同，而KV存储信息不同
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProdConProperties(String ProdConProperties) {
        this.ProdConProperties = ProdConProperties;
    }

    /**
     * Get 同params 内容为开发数据源的数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DevConProperties 同params 内容为开发数据源的数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDevConProperties() {
        return this.DevConProperties;
    }

    /**
     * Set 同params 内容为开发数据源的数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param DevConProperties 同params 内容为开发数据源的数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDevConProperties(String DevConProperties) {
        this.DevConProperties = DevConProperties;
    }

    /**
     * Get 数据源类别：

- DB ---自定义源
- CLUSTER --- 系统源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Category 数据源类别：

- DB ---自定义源
- CLUSTER --- 系统源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 数据源类别：

- DB ---自定义源
- CLUSTER --- 系统源
注意：此字段可能返回 null，表示取不到有效值。
     * @param Category 数据源类别：

- DB ---自定义源
- CLUSTER --- 系统源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    public DataSource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataSource(DataSource source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.CreateUser != null) {
            this.CreateUser = new String(source.CreateUser);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyUser != null) {
            this.ModifyUser = new String(source.ModifyUser);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.ProdConProperties != null) {
            this.ProdConProperties = new String(source.ProdConProperties);
        }
        if (source.DevConProperties != null) {
            this.DevConProperties = new String(source.DevConProperties);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "CreateUser", this.CreateUser);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyUser", this.ModifyUser);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "ProdConProperties", this.ProdConProperties);
        this.setParamSimple(map, prefix + "DevConProperties", this.DevConProperties);
        this.setParamSimple(map, prefix + "Category", this.Category);

    }
}

