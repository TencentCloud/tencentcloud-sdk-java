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

public class DatabaseInfo extends AbstractModel {

    /**
    * 数据库GUID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Guid")
    @Expose
    private String Guid;

    /**
    * 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 数据库目录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
    * 数据库描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 数据库位置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * 数据库存储大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageSize")
    @Expose
    private Long StorageSize;

    /**
    * 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceId")
    @Expose
    private Long DatasourceId;

    /**
    * 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceType")
    @Expose
    private String DatasourceType;

    /**
     * Get 数据库GUID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Guid 数据库GUID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGuid() {
        return this.Guid;
    }

    /**
     * Set 数据库GUID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Guid 数据库GUID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGuid(String Guid) {
        this.Guid = Guid;
    }

    /**
     * Get 数据库名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 数据库目录
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CatalogName 数据库目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set 数据库目录
注意：此字段可能返回 null，表示取不到有效值。
     * @param CatalogName 数据库目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }

    /**
     * Get 数据库描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 数据库描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 数据库描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 数据库描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 数据库位置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Location 数据库位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set 数据库位置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Location 数据库位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get 数据库存储大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageSize 数据库存储大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStorageSize() {
        return this.StorageSize;
    }

    /**
     * Set 数据库存储大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageSize 数据库存储大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageSize(Long StorageSize) {
        this.StorageSize = StorageSize;
    }

    /**
     * Get 数据源ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceId 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceId 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceId(Long DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get 数据源类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceType 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceType() {
        return this.DatasourceType;
    }

    /**
     * Set 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceType 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceType(String DatasourceType) {
        this.DatasourceType = DatasourceType;
    }

    public DatabaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DatabaseInfo(DatabaseInfo source) {
        if (source.Guid != null) {
            this.Guid = new String(source.Guid);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CatalogName != null) {
            this.CatalogName = new String(source.CatalogName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.StorageSize != null) {
            this.StorageSize = new Long(source.StorageSize);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new Long(source.DatasourceId);
        }
        if (source.DatasourceType != null) {
            this.DatasourceType = new String(source.DatasourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Guid", this.Guid);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CatalogName", this.CatalogName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "StorageSize", this.StorageSize);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "DatasourceType", this.DatasourceType);

    }
}

