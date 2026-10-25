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

public class Volume extends AbstractModel {

    /**
    * <p>名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>catalog信息</p>
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
    * <p>schema 信息</p>
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * <p>模型描述</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>存储位置</p>
    */
    @SerializedName("StorageLocation")
    @Expose
    private String StorageLocation;

    /**
    * <p>扩展数据</p>
    */
    @SerializedName("Properties")
    @Expose
    private KVPair [] Properties;

    /**
    * <p>审计数据</p>
    */
    @SerializedName("Audit")
    @Expose
    private Audit Audit;

    /**
    * 数据卷类型，取值：MANAGED(内部管理)、EXTERNAL(外部存储)
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>责任人信息</p>
    */
    @SerializedName("MetaOwner")
    @Expose
    private MetaOwner MetaOwner;

    /**
    * <p>资产全局唯一ID</p>
    */
    @SerializedName("AssetGuid")
    @Expose
    private String AssetGuid;

    /**
    * <p>当前用户对该实体的权限信息</p>
    */
    @SerializedName("PermissionDetail")
    @Expose
    private PermissionDetail PermissionDetail;

    /**
    * <p>标签信息列表。注意：仅当请求中 FetchTags=true 时返回，默认不返回</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private CommonTagInfo [] Tags;

    /**
     * Get <p>名称</p> 
     * @return Name <p>名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>名称</p>
     * @param Name <p>名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>catalog信息</p> 
     * @return CatalogName <p>catalog信息</p>
     */
    public String getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set <p>catalog信息</p>
     * @param CatalogName <p>catalog信息</p>
     */
    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }

    /**
     * Get <p>schema 信息</p> 
     * @return SchemaName <p>schema 信息</p>
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set <p>schema 信息</p>
     * @param SchemaName <p>schema 信息</p>
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get <p>模型描述</p> 
     * @return Comment <p>模型描述</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>模型描述</p>
     * @param Comment <p>模型描述</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>存储位置</p> 
     * @return StorageLocation <p>存储位置</p>
     */
    public String getStorageLocation() {
        return this.StorageLocation;
    }

    /**
     * Set <p>存储位置</p>
     * @param StorageLocation <p>存储位置</p>
     */
    public void setStorageLocation(String StorageLocation) {
        this.StorageLocation = StorageLocation;
    }

    /**
     * Get <p>扩展数据</p> 
     * @return Properties <p>扩展数据</p>
     */
    public KVPair [] getProperties() {
        return this.Properties;
    }

    /**
     * Set <p>扩展数据</p>
     * @param Properties <p>扩展数据</p>
     */
    public void setProperties(KVPair [] Properties) {
        this.Properties = Properties;
    }

    /**
     * Get <p>审计数据</p> 
     * @return Audit <p>审计数据</p>
     */
    public Audit getAudit() {
        return this.Audit;
    }

    /**
     * Set <p>审计数据</p>
     * @param Audit <p>审计数据</p>
     */
    public void setAudit(Audit Audit) {
        this.Audit = Audit;
    }

    /**
     * Get 数据卷类型，取值：MANAGED(内部管理)、EXTERNAL(外部存储) 
     * @return Type 数据卷类型，取值：MANAGED(内部管理)、EXTERNAL(外部存储)
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 数据卷类型，取值：MANAGED(内部管理)、EXTERNAL(外部存储)
     * @param Type 数据卷类型，取值：MANAGED(内部管理)、EXTERNAL(外部存储)
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>责任人信息</p> 
     * @return MetaOwner <p>责任人信息</p>
     */
    public MetaOwner getMetaOwner() {
        return this.MetaOwner;
    }

    /**
     * Set <p>责任人信息</p>
     * @param MetaOwner <p>责任人信息</p>
     */
    public void setMetaOwner(MetaOwner MetaOwner) {
        this.MetaOwner = MetaOwner;
    }

    /**
     * Get <p>资产全局唯一ID</p> 
     * @return AssetGuid <p>资产全局唯一ID</p>
     */
    public String getAssetGuid() {
        return this.AssetGuid;
    }

    /**
     * Set <p>资产全局唯一ID</p>
     * @param AssetGuid <p>资产全局唯一ID</p>
     */
    public void setAssetGuid(String AssetGuid) {
        this.AssetGuid = AssetGuid;
    }

    /**
     * Get <p>当前用户对该实体的权限信息</p> 
     * @return PermissionDetail <p>当前用户对该实体的权限信息</p>
     */
    public PermissionDetail getPermissionDetail() {
        return this.PermissionDetail;
    }

    /**
     * Set <p>当前用户对该实体的权限信息</p>
     * @param PermissionDetail <p>当前用户对该实体的权限信息</p>
     */
    public void setPermissionDetail(PermissionDetail PermissionDetail) {
        this.PermissionDetail = PermissionDetail;
    }

    /**
     * Get <p>标签信息列表。注意：仅当请求中 FetchTags=true 时返回，默认不返回</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags <p>标签信息列表。注意：仅当请求中 FetchTags=true 时返回，默认不返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CommonTagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签信息列表。注意：仅当请求中 FetchTags=true 时返回，默认不返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags <p>标签信息列表。注意：仅当请求中 FetchTags=true 时返回，默认不返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(CommonTagInfo [] Tags) {
        this.Tags = Tags;
    }

    public Volume() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Volume(Volume source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CatalogName != null) {
            this.CatalogName = new String(source.CatalogName);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.StorageLocation != null) {
            this.StorageLocation = new String(source.StorageLocation);
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
        if (source.Type != null) {
            this.Type = new String(source.Type);
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
        this.setParamSimple(map, prefix + "CatalogName", this.CatalogName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "StorageLocation", this.StorageLocation);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);
        this.setParamObj(map, prefix + "Audit.", this.Audit);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "MetaOwner.", this.MetaOwner);
        this.setParamSimple(map, prefix + "AssetGuid", this.AssetGuid);
        this.setParamObj(map, prefix + "PermissionDetail.", this.PermissionDetail);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

