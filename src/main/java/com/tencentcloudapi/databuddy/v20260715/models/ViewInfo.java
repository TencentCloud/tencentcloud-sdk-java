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

public class ViewInfo extends AbstractModel {

    /**
    * 表名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 字段信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Columns")
    @Expose
    private ColumnInfo [] Columns;

    /**
    * 属性值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Properties")
    @Expose
    private KVPair [] Properties;

    /**
    * 编辑者
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Audit")
    @Expose
    private Audit Audit;

    /**
    * owner信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetaOwner")
    @Expose
    private MetaOwner MetaOwner;

    /**
    * 资产全局唯一ID
    */
    @SerializedName("AssetGuid")
    @Expose
    private String AssetGuid;

    /**
    * 当前用户对该实体的权限信息
    */
    @SerializedName("PermissionDetail")
    @Expose
    private PermissionDetail PermissionDetail;

    /**
    * 标签信息列表。注意：仅当请求中 FetchTags=true 时返回，默认不返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private CommonTagInfo [] Tags;

    /**
     * Get 表名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 表名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Comment 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Comment 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 字段信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Columns 字段信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ColumnInfo [] getColumns() {
        return this.Columns;
    }

    /**
     * Set 字段信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Columns 字段信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumns(ColumnInfo [] Columns) {
        this.Columns = Columns;
    }

    /**
     * Get 属性值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Properties 属性值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KVPair [] getProperties() {
        return this.Properties;
    }

    /**
     * Set 属性值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Properties 属性值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProperties(KVPair [] Properties) {
        this.Properties = Properties;
    }

    /**
     * Get 编辑者
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Audit 编辑者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Audit getAudit() {
        return this.Audit;
    }

    /**
     * Set 编辑者
注意：此字段可能返回 null，表示取不到有效值。
     * @param Audit 编辑者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAudit(Audit Audit) {
        this.Audit = Audit;
    }

    /**
     * Get owner信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetaOwner owner信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MetaOwner getMetaOwner() {
        return this.MetaOwner;
    }

    /**
     * Set owner信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetaOwner owner信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetaOwner(MetaOwner MetaOwner) {
        this.MetaOwner = MetaOwner;
    }

    /**
     * Get 资产全局唯一ID 
     * @return AssetGuid 资产全局唯一ID
     */
    public String getAssetGuid() {
        return this.AssetGuid;
    }

    /**
     * Set 资产全局唯一ID
     * @param AssetGuid 资产全局唯一ID
     */
    public void setAssetGuid(String AssetGuid) {
        this.AssetGuid = AssetGuid;
    }

    /**
     * Get 当前用户对该实体的权限信息 
     * @return PermissionDetail 当前用户对该实体的权限信息
     */
    public PermissionDetail getPermissionDetail() {
        return this.PermissionDetail;
    }

    /**
     * Set 当前用户对该实体的权限信息
     * @param PermissionDetail 当前用户对该实体的权限信息
     */
    public void setPermissionDetail(PermissionDetail PermissionDetail) {
        this.PermissionDetail = PermissionDetail;
    }

    /**
     * Get 标签信息列表。注意：仅当请求中 FetchTags=true 时返回，默认不返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签信息列表。注意：仅当请求中 FetchTags=true 时返回，默认不返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CommonTagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签信息列表。注意：仅当请求中 FetchTags=true 时返回，默认不返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签信息列表。注意：仅当请求中 FetchTags=true 时返回，默认不返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(CommonTagInfo [] Tags) {
        this.Tags = Tags;
    }

    public ViewInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ViewInfo(ViewInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Columns != null) {
            this.Columns = new ColumnInfo[source.Columns.length];
            for (int i = 0; i < source.Columns.length; i++) {
                this.Columns[i] = new ColumnInfo(source.Columns[i]);
            }
        }
        if (source.Properties != null) {
            this.Properties = new KVPair[source.Properties.length];
            for (int i = 0; i < source.Properties.length; i++) {
                this.Properties[i] = new KVPair(source.Properties[i]);
            }
        }
        if (source.Audit != null) {
            this.Audit = new Audit(source.Audit);
        }
        if (source.MetaOwner != null) {
            this.MetaOwner = new MetaOwner(source.MetaOwner);
        }
        if (source.AssetGuid != null) {
            this.AssetGuid = new String(source.AssetGuid);
        }
        if (source.PermissionDetail != null) {
            this.PermissionDetail = new PermissionDetail(source.PermissionDetail);
        }
        if (source.Tags != null) {
            this.Tags = new CommonTagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new CommonTagInfo(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamArrayObj(map, prefix + "Columns.", this.Columns);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);
        this.setParamObj(map, prefix + "Audit.", this.Audit);
        this.setParamObj(map, prefix + "MetaOwner.", this.MetaOwner);
        this.setParamSimple(map, prefix + "AssetGuid", this.AssetGuid);
        this.setParamObj(map, prefix + "PermissionDetail.", this.PermissionDetail);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

