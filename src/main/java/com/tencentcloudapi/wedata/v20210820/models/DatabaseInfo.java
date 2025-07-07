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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DatabaseInfo extends AbstractModel {

    /**
    * 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceName")
    @Expose
    private String DatasourceName;

    /**
    * 数据源Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 数据库id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseId")
    @Expose
    private String DatabaseId;

    /**
    * 实例Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceType")
    @Expose
    private Long DatasourceType;

    /**
    * 数据库原始名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginDatabaseName")
    @Expose
    private String OriginDatabaseName;

    /**
    * schema名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginSchemaName")
    @Expose
    private String OriginSchemaName;

    /**
    * 0或者未返回.未定义，1.生产 2.开发
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DsEnvType")
    @Expose
    private Long DsEnvType;

    /**
    * EMR引擎部署方式：CVM/TKE
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterDeployType")
    @Expose
    private String ClusterDeployType;

    /**
    * 模式名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
     * Get 数据源名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceName 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceName() {
        return this.DatasourceName;
    }

    /**
     * Set 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceName 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceName(String DatasourceName) {
        this.DatasourceName = DatasourceName;
    }

    /**
     * Get 数据源Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceId 数据源Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据源Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceId 数据源Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
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
     * Get 数据库id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseId 数据库id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseId() {
        return this.DatabaseId;
    }

    /**
     * Set 数据库id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseId 数据库id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseId(String DatabaseId) {
        this.DatabaseId = DatabaseId;
    }

    /**
     * Get 实例Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 实例Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 实例Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 数据源类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceType 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDatasourceType() {
        return this.DatasourceType;
    }

    /**
     * Set 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceType 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceType(Long DatasourceType) {
        this.DatasourceType = DatasourceType;
    }

    /**
     * Get 数据库原始名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginDatabaseName 数据库原始名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOriginDatabaseName() {
        return this.OriginDatabaseName;
    }

    /**
     * Set 数据库原始名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginDatabaseName 数据库原始名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginDatabaseName(String OriginDatabaseName) {
        this.OriginDatabaseName = OriginDatabaseName;
    }

    /**
     * Get schema名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginSchemaName schema名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOriginSchemaName() {
        return this.OriginSchemaName;
    }

    /**
     * Set schema名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginSchemaName schema名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginSchemaName(String OriginSchemaName) {
        this.OriginSchemaName = OriginSchemaName;
    }

    /**
     * Get 0或者未返回.未定义，1.生产 2.开发
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DsEnvType 0或者未返回.未定义，1.生产 2.开发
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDsEnvType() {
        return this.DsEnvType;
    }

    /**
     * Set 0或者未返回.未定义，1.生产 2.开发
注意：此字段可能返回 null，表示取不到有效值。
     * @param DsEnvType 0或者未返回.未定义，1.生产 2.开发
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDsEnvType(Long DsEnvType) {
        this.DsEnvType = DsEnvType;
    }

    /**
     * Get EMR引擎部署方式：CVM/TKE
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterDeployType EMR引擎部署方式：CVM/TKE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterDeployType() {
        return this.ClusterDeployType;
    }

    /**
     * Set EMR引擎部署方式：CVM/TKE
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterDeployType EMR引擎部署方式：CVM/TKE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterDeployType(String ClusterDeployType) {
        this.ClusterDeployType = ClusterDeployType;
    }

    /**
     * Get 模式名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchemaName 模式名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set 模式名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchemaName 模式名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    public DatabaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DatabaseInfo(DatabaseInfo source) {
        if (source.DatasourceName != null) {
            this.DatasourceName = new String(source.DatasourceName);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.DatabaseId != null) {
            this.DatabaseId = new String(source.DatabaseId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DatasourceType != null) {
            this.DatasourceType = new Long(source.DatasourceType);
        }
        if (source.OriginDatabaseName != null) {
            this.OriginDatabaseName = new String(source.OriginDatabaseName);
        }
        if (source.OriginSchemaName != null) {
            this.OriginSchemaName = new String(source.OriginSchemaName);
        }
        if (source.DsEnvType != null) {
            this.DsEnvType = new Long(source.DsEnvType);
        }
        if (source.ClusterDeployType != null) {
            this.ClusterDeployType = new String(source.ClusterDeployType);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatasourceName", this.DatasourceName);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "DatabaseId", this.DatabaseId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DatasourceType", this.DatasourceType);
        this.setParamSimple(map, prefix + "OriginDatabaseName", this.OriginDatabaseName);
        this.setParamSimple(map, prefix + "OriginSchemaName", this.OriginSchemaName);
        this.setParamSimple(map, prefix + "DsEnvType", this.DsEnvType);
        this.setParamSimple(map, prefix + "ClusterDeployType", this.ClusterDeployType);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);

    }
}

