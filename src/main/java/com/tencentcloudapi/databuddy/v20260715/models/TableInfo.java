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

public class TableInfo extends AbstractModel {

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
    * 分区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Partitioning")
    @Expose
    private Partitioning [] Partitioning;

    /**
    * 索引
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Indexes")
    @Expose
    private Index [] Indexes;

    /**
    * 编辑者
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Audit")
    @Expose
    private Audit Audit;

    /**
    * 表版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableFormat")
    @Expose
    private String TableFormat;

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
    * 总文件数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FilesCount")
    @Expose
    private String FilesCount;

    /**
    * 总数据量大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FilesSize")
    @Expose
    private String FilesSize;

    /**
    * 表类型

- Managed 内部
- External 外部
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableType")
    @Expose
    private String TableType;

    /**
    * 特征表类型：Online-在线表 Offline-离线表 空字符串-非特征表
    */
    @SerializedName("FeatureTableType")
    @Expose
    private String FeatureTableType;

    /**
    * 特征表详细信息，仅当FeatureTableType不为空时有值
    */
    @SerializedName("FeatureTableDetail")
    @Expose
    private FeatureTableDetail FeatureTableDetail;

    /**
    * 当前用户对该实体的权限信息
    */
    @SerializedName("PermissionDetail")
    @Expose
    private PermissionDetail PermissionDetail;

    /**
    * 表级标签列表，仅当请求中FetchOption.FetchTags=true时返回，默认不返回
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
     * Get 分区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Partitioning 分区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Partitioning [] getPartitioning() {
        return this.Partitioning;
    }

    /**
     * Set 分区
注意：此字段可能返回 null，表示取不到有效值。
     * @param Partitioning 分区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPartitioning(Partitioning [] Partitioning) {
        this.Partitioning = Partitioning;
    }

    /**
     * Get 索引
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Indexes 索引
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Index [] getIndexes() {
        return this.Indexes;
    }

    /**
     * Set 索引
注意：此字段可能返回 null，表示取不到有效值。
     * @param Indexes 索引
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexes(Index [] Indexes) {
        this.Indexes = Indexes;
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
     * Get 表版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableFormat 表版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableFormat() {
        return this.TableFormat;
    }

    /**
     * Set 表版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableFormat 表版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableFormat(String TableFormat) {
        this.TableFormat = TableFormat;
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
     * Get 总文件数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FilesCount 总文件数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFilesCount() {
        return this.FilesCount;
    }

    /**
     * Set 总文件数
注意：此字段可能返回 null，表示取不到有效值。
     * @param FilesCount 总文件数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilesCount(String FilesCount) {
        this.FilesCount = FilesCount;
    }

    /**
     * Get 总数据量大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FilesSize 总数据量大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFilesSize() {
        return this.FilesSize;
    }

    /**
     * Set 总数据量大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param FilesSize 总数据量大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilesSize(String FilesSize) {
        this.FilesSize = FilesSize;
    }

    /**
     * Get 表类型

- Managed 内部
- External 外部
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableType 表类型

- Managed 内部
- External 外部
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableType() {
        return this.TableType;
    }

    /**
     * Set 表类型

- Managed 内部
- External 外部
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableType 表类型

- Managed 内部
- External 外部
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableType(String TableType) {
        this.TableType = TableType;
    }

    /**
     * Get 特征表类型：Online-在线表 Offline-离线表 空字符串-非特征表 
     * @return FeatureTableType 特征表类型：Online-在线表 Offline-离线表 空字符串-非特征表
     */
    public String getFeatureTableType() {
        return this.FeatureTableType;
    }

    /**
     * Set 特征表类型：Online-在线表 Offline-离线表 空字符串-非特征表
     * @param FeatureTableType 特征表类型：Online-在线表 Offline-离线表 空字符串-非特征表
     */
    public void setFeatureTableType(String FeatureTableType) {
        this.FeatureTableType = FeatureTableType;
    }

    /**
     * Get 特征表详细信息，仅当FeatureTableType不为空时有值 
     * @return FeatureTableDetail 特征表详细信息，仅当FeatureTableType不为空时有值
     */
    public FeatureTableDetail getFeatureTableDetail() {
        return this.FeatureTableDetail;
    }

    /**
     * Set 特征表详细信息，仅当FeatureTableType不为空时有值
     * @param FeatureTableDetail 特征表详细信息，仅当FeatureTableType不为空时有值
     */
    public void setFeatureTableDetail(FeatureTableDetail FeatureTableDetail) {
        this.FeatureTableDetail = FeatureTableDetail;
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
     * Get 表级标签列表，仅当请求中FetchOption.FetchTags=true时返回，默认不返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 表级标签列表，仅当请求中FetchOption.FetchTags=true时返回，默认不返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CommonTagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set 表级标签列表，仅当请求中FetchOption.FetchTags=true时返回，默认不返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 表级标签列表，仅当请求中FetchOption.FetchTags=true时返回，默认不返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(CommonTagInfo [] Tags) {
        this.Tags = Tags;
    }

    public TableInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableInfo(TableInfo source) {
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
        if (source.Partitioning != null) {
            this.Partitioning = new Partitioning[source.Partitioning.length];
            for (int i = 0; i < source.Partitioning.length; i++) {
                this.Partitioning[i] = new Partitioning(source.Partitioning[i]);
            }
        }
        if (source.Indexes != null) {
            this.Indexes = new Index[source.Indexes.length];
            for (int i = 0; i < source.Indexes.length; i++) {
                this.Indexes[i] = new Index(source.Indexes[i]);
            }
        }
        if (source.Audit != null) {
            this.Audit = new Audit(source.Audit);
        }
        if (source.TableFormat != null) {
            this.TableFormat = new String(source.TableFormat);
        }
        if (source.MetaOwner != null) {
            this.MetaOwner = new MetaOwner(source.MetaOwner);
        }
        if (source.AssetGuid != null) {
            this.AssetGuid = new String(source.AssetGuid);
        }
        if (source.FilesCount != null) {
            this.FilesCount = new String(source.FilesCount);
        }
        if (source.FilesSize != null) {
            this.FilesSize = new String(source.FilesSize);
        }
        if (source.TableType != null) {
            this.TableType = new String(source.TableType);
        }
        if (source.FeatureTableType != null) {
            this.FeatureTableType = new String(source.FeatureTableType);
        }
        if (source.FeatureTableDetail != null) {
            this.FeatureTableDetail = new FeatureTableDetail(source.FeatureTableDetail);
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
        this.setParamArrayObj(map, prefix + "Partitioning.", this.Partitioning);
        this.setParamArrayObj(map, prefix + "Indexes.", this.Indexes);
        this.setParamObj(map, prefix + "Audit.", this.Audit);
        this.setParamSimple(map, prefix + "TableFormat", this.TableFormat);
        this.setParamObj(map, prefix + "MetaOwner.", this.MetaOwner);
        this.setParamSimple(map, prefix + "AssetGuid", this.AssetGuid);
        this.setParamSimple(map, prefix + "FilesCount", this.FilesCount);
        this.setParamSimple(map, prefix + "FilesSize", this.FilesSize);
        this.setParamSimple(map, prefix + "TableType", this.TableType);
        this.setParamSimple(map, prefix + "FeatureTableType", this.FeatureTableType);
        this.setParamObj(map, prefix + "FeatureTableDetail.", this.FeatureTableDetail);
        this.setParamObj(map, prefix + "PermissionDetail.", this.PermissionDetail);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

