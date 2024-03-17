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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigFileGroup extends AbstractModel {

    /**
    * 配置文件组id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 配置文件组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 命名空间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 创建者
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateBy")
    @Expose
    private String CreateBy;

    /**
    * 修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 修改者
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyBy")
    @Expose
    private String ModifyBy;

    /**
    * 文件数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileCount")
    @Expose
    private Long FileCount;

    /**
    * 关联用户，link_users
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserIds")
    @Expose
    private String [] UserIds;

    /**
    * 组id，link_groups
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupIds")
    @Expose
    private String [] GroupIds;

    /**
    * remove_link_users
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RemoveUserIds")
    @Expose
    private String [] RemoveUserIds;

    /**
    * remove_link_groups
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RemoveGroupIds")
    @Expose
    private String [] RemoveGroupIds;

    /**
    * 是否可编辑
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Editable")
    @Expose
    private Boolean Editable;

    /**
    * 归属者
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * 部门
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Department")
    @Expose
    private String Department;

    /**
    * 业务
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * 配置文件组标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigFileGroupTags")
    @Expose
    private ConfigFileGroupTag [] ConfigFileGroupTags;

    /**
     * Get 配置文件组id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 配置文件组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 配置文件组id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 配置文件组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 配置文件组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 配置文件组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 配置文件组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 配置文件组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 命名空间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Namespace 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Namespace 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Comment 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Comment 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 创建者
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateBy 创建者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateBy() {
        return this.CreateBy;
    }

    /**
     * Set 创建者
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateBy 创建者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateBy(String CreateBy) {
        this.CreateBy = CreateBy;
    }

    /**
     * Get 修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 修改者
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyBy 修改者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyBy() {
        return this.ModifyBy;
    }

    /**
     * Set 修改者
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyBy 修改者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyBy(String ModifyBy) {
        this.ModifyBy = ModifyBy;
    }

    /**
     * Get 文件数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileCount 文件数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFileCount() {
        return this.FileCount;
    }

    /**
     * Set 文件数
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileCount 文件数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileCount(Long FileCount) {
        this.FileCount = FileCount;
    }

    /**
     * Get 关联用户，link_users
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserIds 关联用户，link_users
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set 关联用户，link_users
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserIds 关联用户，link_users
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserIds(String [] UserIds) {
        this.UserIds = UserIds;
    }

    /**
     * Get 组id，link_groups
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupIds 组id，link_groups
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set 组id，link_groups
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupIds 组id，link_groups
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupIds(String [] GroupIds) {
        this.GroupIds = GroupIds;
    }

    /**
     * Get remove_link_users
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RemoveUserIds remove_link_users
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getRemoveUserIds() {
        return this.RemoveUserIds;
    }

    /**
     * Set remove_link_users
注意：此字段可能返回 null，表示取不到有效值。
     * @param RemoveUserIds remove_link_users
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemoveUserIds(String [] RemoveUserIds) {
        this.RemoveUserIds = RemoveUserIds;
    }

    /**
     * Get remove_link_groups
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RemoveGroupIds remove_link_groups
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getRemoveGroupIds() {
        return this.RemoveGroupIds;
    }

    /**
     * Set remove_link_groups
注意：此字段可能返回 null，表示取不到有效值。
     * @param RemoveGroupIds remove_link_groups
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemoveGroupIds(String [] RemoveGroupIds) {
        this.RemoveGroupIds = RemoveGroupIds;
    }

    /**
     * Get 是否可编辑
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Editable 是否可编辑
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEditable() {
        return this.Editable;
    }

    /**
     * Set 是否可编辑
注意：此字段可能返回 null，表示取不到有效值。
     * @param Editable 是否可编辑
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEditable(Boolean Editable) {
        this.Editable = Editable;
    }

    /**
     * Get 归属者
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Owner 归属者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set 归属者
注意：此字段可能返回 null，表示取不到有效值。
     * @param Owner 归属者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 部门
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Department 部门
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDepartment() {
        return this.Department;
    }

    /**
     * Set 部门
注意：此字段可能返回 null，表示取不到有效值。
     * @param Department 部门
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDepartment(String Department) {
        this.Department = Department;
    }

    /**
     * Get 业务
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Business 业务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set 业务
注意：此字段可能返回 null，表示取不到有效值。
     * @param Business 业务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get 配置文件组标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigFileGroupTags 配置文件组标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConfigFileGroupTag [] getConfigFileGroupTags() {
        return this.ConfigFileGroupTags;
    }

    /**
     * Set 配置文件组标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigFileGroupTags 配置文件组标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigFileGroupTags(ConfigFileGroupTag [] ConfigFileGroupTags) {
        this.ConfigFileGroupTags = ConfigFileGroupTags;
    }

    public ConfigFileGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigFileGroup(ConfigFileGroup source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.CreateBy != null) {
            this.CreateBy = new String(source.CreateBy);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.ModifyBy != null) {
            this.ModifyBy = new String(source.ModifyBy);
        }
        if (source.FileCount != null) {
            this.FileCount = new Long(source.FileCount);
        }
        if (source.UserIds != null) {
            this.UserIds = new String[source.UserIds.length];
            for (int i = 0; i < source.UserIds.length; i++) {
                this.UserIds[i] = new String(source.UserIds[i]);
            }
        }
        if (source.GroupIds != null) {
            this.GroupIds = new String[source.GroupIds.length];
            for (int i = 0; i < source.GroupIds.length; i++) {
                this.GroupIds[i] = new String(source.GroupIds[i]);
            }
        }
        if (source.RemoveUserIds != null) {
            this.RemoveUserIds = new String[source.RemoveUserIds.length];
            for (int i = 0; i < source.RemoveUserIds.length; i++) {
                this.RemoveUserIds[i] = new String(source.RemoveUserIds[i]);
            }
        }
        if (source.RemoveGroupIds != null) {
            this.RemoveGroupIds = new String[source.RemoveGroupIds.length];
            for (int i = 0; i < source.RemoveGroupIds.length; i++) {
                this.RemoveGroupIds[i] = new String(source.RemoveGroupIds[i]);
            }
        }
        if (source.Editable != null) {
            this.Editable = new Boolean(source.Editable);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.Department != null) {
            this.Department = new String(source.Department);
        }
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.ConfigFileGroupTags != null) {
            this.ConfigFileGroupTags = new ConfigFileGroupTag[source.ConfigFileGroupTags.length];
            for (int i = 0; i < source.ConfigFileGroupTags.length; i++) {
                this.ConfigFileGroupTags[i] = new ConfigFileGroupTag(source.ConfigFileGroupTags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "CreateBy", this.CreateBy);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "ModifyBy", this.ModifyBy);
        this.setParamSimple(map, prefix + "FileCount", this.FileCount);
        this.setParamArraySimple(map, prefix + "UserIds.", this.UserIds);
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);
        this.setParamArraySimple(map, prefix + "RemoveUserIds.", this.RemoveUserIds);
        this.setParamArraySimple(map, prefix + "RemoveGroupIds.", this.RemoveGroupIds);
        this.setParamSimple(map, prefix + "Editable", this.Editable);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "Department", this.Department);
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamArrayObj(map, prefix + "ConfigFileGroupTags.", this.ConfigFileGroupTags);

    }
}

