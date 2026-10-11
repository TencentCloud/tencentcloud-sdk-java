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

public class Catalog extends AbstractModel {

    /**
    * <p>数据目录唯一id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>数据目录名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>数据目录类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>数据目录描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>状态信息：注册中0，待测试1，连接成功2，连接失败3，删除中4，已删除5</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>数据目录属性</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Properties")
    @Expose
    private KVPair [] Properties;

    /**
    * <p>操作人</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * <p>责任人信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetaOwner")
    @Expose
    private MetaOwner MetaOwner;

    /**
    * <p>审计信息</p>
    */
    @SerializedName("Audit")
    @Expose
    private Audit Audit;

    /**
    * <p>资产全局唯一ID</p>
    */
    @SerializedName("AssetGuid")
    @Expose
    private String AssetGuid;

    /**
    * <p>当前workspace权限级别，取值对应PermissionLevel，0-无权限，1-只读，2-读写</p>
    */
    @SerializedName("CurrentWorkspacePermissionLevel")
    @Expose
    private Long CurrentWorkspacePermissionLevel;

    /**
    * <p>tccatalog属性中的tccatalog.identifier</p>
    */
    @SerializedName("Identifier")
    @Expose
    private String Identifier;

    /**
    * <p>当前用户对该实体的权限信息</p>
    */
    @SerializedName("PermissionDetail")
    @Expose
    private PermissionDetail PermissionDetail;

    /**
    * <p>是否为外部数据目录（基于数据源连接创建的Catalog，如MYSQL、EMR_HIVE、TCHOUSE_D、POSTGRESQL、DLC等）。true:外部目录, false:内置目录（TABLE/MODEL/VOLUME）</p>
    */
    @SerializedName("IsExternal")
    @Expose
    private Boolean IsExternal;

    /**
    * <p>标签信息列表。注意：仅当请求中 FetchTags=true 时返回，默认不返回</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private CommonTagInfo [] Tags;

    /**
    * <p>数据目录来源</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CatalogSource")
    @Expose
    private String CatalogSource;

    /**
    * <p>连接侧数据目录名或数据库名（仅分析版三段式数据源有值，二段式数据源为空字符串）。Doris/StarRocks/TChouse-D 等 MySQL 内核三段式数据源：external catalog 名称；PostgreSQL/Tencent PG/GaussDB/Hologres 等 PG 内核三段式数据源：databaseName；MySQL 等二段式数据源：空字符串。注意：此字段仅分析版（CatalogSource=CONNECTION）有效，专业版（METALAKE）不填充。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConnectionCatalogName")
    @Expose
    private String ConnectionCatalogName;

    /**
     * Get <p>数据目录唯一id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id <p>数据目录唯一id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>数据目录唯一id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id <p>数据目录唯一id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>数据目录名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>数据目录名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>数据目录名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>数据目录名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>数据目录类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type <p>数据目录类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>数据目录类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type <p>数据目录类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>数据目录描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Comment <p>数据目录描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>数据目录描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Comment <p>数据目录描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>状态信息：注册中0，待测试1，连接成功2，连接失败3，删除中4，已删除5</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>状态信息：注册中0，待测试1，连接成功2，连接失败3，删除中4，已删除5</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态信息：注册中0，待测试1，连接成功2，连接失败3，删除中4，已删除5</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>状态信息：注册中0，待测试1，连接成功2，连接失败3，删除中4，已删除5</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>数据目录属性</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Properties <p>数据目录属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KVPair [] getProperties() {
        return this.Properties;
    }

    /**
     * Set <p>数据目录属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Properties <p>数据目录属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProperties(KVPair [] Properties) {
        this.Properties = Properties;
    }

    /**
     * Get <p>操作人</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Operator <p>操作人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>操作人</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Operator <p>操作人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>责任人信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetaOwner <p>责任人信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MetaOwner getMetaOwner() {
        return this.MetaOwner;
    }

    /**
     * Set <p>责任人信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetaOwner <p>责任人信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetaOwner(MetaOwner MetaOwner) {
        this.MetaOwner = MetaOwner;
    }

    /**
     * Get <p>审计信息</p> 
     * @return Audit <p>审计信息</p>
     */
    public Audit getAudit() {
        return this.Audit;
    }

    /**
     * Set <p>审计信息</p>
     * @param Audit <p>审计信息</p>
     */
    public void setAudit(Audit Audit) {
        this.Audit = Audit;
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
     * Get <p>当前workspace权限级别，取值对应PermissionLevel，0-无权限，1-只读，2-读写</p> 
     * @return CurrentWorkspacePermissionLevel <p>当前workspace权限级别，取值对应PermissionLevel，0-无权限，1-只读，2-读写</p>
     */
    public Long getCurrentWorkspacePermissionLevel() {
        return this.CurrentWorkspacePermissionLevel;
    }

    /**
     * Set <p>当前workspace权限级别，取值对应PermissionLevel，0-无权限，1-只读，2-读写</p>
     * @param CurrentWorkspacePermissionLevel <p>当前workspace权限级别，取值对应PermissionLevel，0-无权限，1-只读，2-读写</p>
     */
    public void setCurrentWorkspacePermissionLevel(Long CurrentWorkspacePermissionLevel) {
        this.CurrentWorkspacePermissionLevel = CurrentWorkspacePermissionLevel;
    }

    /**
     * Get <p>tccatalog属性中的tccatalog.identifier</p> 
     * @return Identifier <p>tccatalog属性中的tccatalog.identifier</p>
     */
    public String getIdentifier() {
        return this.Identifier;
    }

    /**
     * Set <p>tccatalog属性中的tccatalog.identifier</p>
     * @param Identifier <p>tccatalog属性中的tccatalog.identifier</p>
     */
    public void setIdentifier(String Identifier) {
        this.Identifier = Identifier;
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
     * Get <p>是否为外部数据目录（基于数据源连接创建的Catalog，如MYSQL、EMR_HIVE、TCHOUSE_D、POSTGRESQL、DLC等）。true:外部目录, false:内置目录（TABLE/MODEL/VOLUME）</p> 
     * @return IsExternal <p>是否为外部数据目录（基于数据源连接创建的Catalog，如MYSQL、EMR_HIVE、TCHOUSE_D、POSTGRESQL、DLC等）。true:外部目录, false:内置目录（TABLE/MODEL/VOLUME）</p>
     */
    public Boolean getIsExternal() {
        return this.IsExternal;
    }

    /**
     * Set <p>是否为外部数据目录（基于数据源连接创建的Catalog，如MYSQL、EMR_HIVE、TCHOUSE_D、POSTGRESQL、DLC等）。true:外部目录, false:内置目录（TABLE/MODEL/VOLUME）</p>
     * @param IsExternal <p>是否为外部数据目录（基于数据源连接创建的Catalog，如MYSQL、EMR_HIVE、TCHOUSE_D、POSTGRESQL、DLC等）。true:外部目录, false:内置目录（TABLE/MODEL/VOLUME）</p>
     */
    public void setIsExternal(Boolean IsExternal) {
        this.IsExternal = IsExternal;
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

    /**
     * Get <p>数据目录来源</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CatalogSource <p>数据目录来源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCatalogSource() {
        return this.CatalogSource;
    }

    /**
     * Set <p>数据目录来源</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CatalogSource <p>数据目录来源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCatalogSource(String CatalogSource) {
        this.CatalogSource = CatalogSource;
    }

    /**
     * Get <p>连接侧数据目录名或数据库名（仅分析版三段式数据源有值，二段式数据源为空字符串）。Doris/StarRocks/TChouse-D 等 MySQL 内核三段式数据源：external catalog 名称；PostgreSQL/Tencent PG/GaussDB/Hologres 等 PG 内核三段式数据源：databaseName；MySQL 等二段式数据源：空字符串。注意：此字段仅分析版（CatalogSource=CONNECTION）有效，专业版（METALAKE）不填充。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConnectionCatalogName <p>连接侧数据目录名或数据库名（仅分析版三段式数据源有值，二段式数据源为空字符串）。Doris/StarRocks/TChouse-D 等 MySQL 内核三段式数据源：external catalog 名称；PostgreSQL/Tencent PG/GaussDB/Hologres 等 PG 内核三段式数据源：databaseName；MySQL 等二段式数据源：空字符串。注意：此字段仅分析版（CatalogSource=CONNECTION）有效，专业版（METALAKE）不填充。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConnectionCatalogName() {
        return this.ConnectionCatalogName;
    }

    /**
     * Set <p>连接侧数据目录名或数据库名（仅分析版三段式数据源有值，二段式数据源为空字符串）。Doris/StarRocks/TChouse-D 等 MySQL 内核三段式数据源：external catalog 名称；PostgreSQL/Tencent PG/GaussDB/Hologres 等 PG 内核三段式数据源：databaseName；MySQL 等二段式数据源：空字符串。注意：此字段仅分析版（CatalogSource=CONNECTION）有效，专业版（METALAKE）不填充。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConnectionCatalogName <p>连接侧数据目录名或数据库名（仅分析版三段式数据源有值，二段式数据源为空字符串）。Doris/StarRocks/TChouse-D 等 MySQL 内核三段式数据源：external catalog 名称；PostgreSQL/Tencent PG/GaussDB/Hologres 等 PG 内核三段式数据源：databaseName；MySQL 等二段式数据源：空字符串。注意：此字段仅分析版（CatalogSource=CONNECTION）有效，专业版（METALAKE）不填充。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConnectionCatalogName(String ConnectionCatalogName) {
        this.ConnectionCatalogName = ConnectionCatalogName;
    }

    public Catalog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Catalog(Catalog source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Properties != null) {
            this.Properties = new KVPair[source.Properties.length];
            for (int i = 0; i < source.Properties.length; i++) {
                this.Properties[i] = new KVPair(source.Properties[i]);
            }
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.MetaOwner != null) {
            this.MetaOwner = new MetaOwner(source.MetaOwner);
        }
        if (source.Audit != null) {
            this.Audit = new Audit(source.Audit);
        }
        if (source.AssetGuid != null) {
            this.AssetGuid = new String(source.AssetGuid);
        }
        if (source.CurrentWorkspacePermissionLevel != null) {
            this.CurrentWorkspacePermissionLevel = new Long(source.CurrentWorkspacePermissionLevel);
        }
        if (source.Identifier != null) {
            this.Identifier = new String(source.Identifier);
        }
        if (source.PermissionDetail != null) {
            this.PermissionDetail = new PermissionDetail(source.PermissionDetail);
        }
        if (source.IsExternal != null) {
            this.IsExternal = new Boolean(source.IsExternal);
        }
        if (source.Tags != null) {
            this.Tags = new CommonTagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new CommonTagInfo(source.Tags[i]);
            }
        }
        if (source.CatalogSource != null) {
            this.CatalogSource = new String(source.CatalogSource);
        }
        if (source.ConnectionCatalogName != null) {
            this.ConnectionCatalogName = new String(source.ConnectionCatalogName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamObj(map, prefix + "MetaOwner.", this.MetaOwner);
        this.setParamObj(map, prefix + "Audit.", this.Audit);
        this.setParamSimple(map, prefix + "AssetGuid", this.AssetGuid);
        this.setParamSimple(map, prefix + "CurrentWorkspacePermissionLevel", this.CurrentWorkspacePermissionLevel);
        this.setParamSimple(map, prefix + "Identifier", this.Identifier);
        this.setParamObj(map, prefix + "PermissionDetail.", this.PermissionDetail);
        this.setParamSimple(map, prefix + "IsExternal", this.IsExternal);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "CatalogSource", this.CatalogSource);
        this.setParamSimple(map, prefix + "ConnectionCatalogName", this.ConnectionCatalogName);

    }
}

