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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FeatureTable extends AbstractModel {

    /**
    * 表名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 全称
    */
    @SerializedName("FullName")
    @Expose
    private String FullName;

    /**
    * 资产描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 修改时间，iso8601格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * 创建时间，iso8601格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 责任人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Owner")
    @Expose
    private Owner Owner;

    /**
    * 工作空间ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * 资产ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetGuid")
    @Expose
    private String AssetGuid;

    /**
     * Get 表名称 
     * @return Name 表名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 表名称
     * @param Name 表名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 全称 
     * @return FullName 全称
     */
    public String getFullName() {
        return this.FullName;
    }

    /**
     * Set 全称
     * @param FullName 全称
     */
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    /**
     * Get 资产描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Comment 资产描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 资产描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Comment 资产描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 数据库名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseName 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseName 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 修改时间，iso8601格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifiedTime 修改时间，iso8601格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set 修改时间，iso8601格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifiedTime 修改时间，iso8601格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get 创建时间，iso8601格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间，iso8601格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，iso8601格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间，iso8601格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 责任人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Owner 责任人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Owner getOwner() {
        return this.Owner;
    }

    /**
     * Set 责任人
注意：此字段可能返回 null，表示取不到有效值。
     * @param Owner 责任人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwner(Owner Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 工作空间ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkspaceId 工作空间ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set 工作空间ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkspaceId 工作空间ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get 资产ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetGuid 资产ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetGuid() {
        return this.AssetGuid;
    }

    /**
     * Set 资产ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetGuid 资产ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetGuid(String AssetGuid) {
        this.AssetGuid = AssetGuid;
    }

    public FeatureTable() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FeatureTable(FeatureTable source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.FullName != null) {
            this.FullName = new String(source.FullName);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Owner != null) {
            this.Owner = new Owner(source.Owner);
        }
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.AssetGuid != null) {
            this.AssetGuid = new String(source.AssetGuid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "FullName", this.FullName);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "Owner.", this.Owner);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "AssetGuid", this.AssetGuid);

    }
}

