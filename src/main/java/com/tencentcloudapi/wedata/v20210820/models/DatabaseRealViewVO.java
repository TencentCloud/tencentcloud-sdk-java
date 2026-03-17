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

public class DatabaseRealViewVO extends AbstractModel {

    /**
    * CatalogName: 如dlc数据默认为DataLakeCatalog
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
    * 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataSourceId")
    @Expose
    private Long DataSourceId;

    /**
    * 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataSourceName")
    @Expose
    private String DataSourceName;

    /**
    * 数据源实例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataSourceInstance")
    @Expose
    private String DataSourceInstance;

    /**
    * 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataSourceType")
    @Expose
    private String DataSourceType;

    /**
    * 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 责任人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * 责任人账号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerAccount")
    @Expose
    private Long OwnerAccount;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifiedTime")
    @Expose
    private Long ModifiedTime;

    /**
    * 数据库地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * 业务额外属性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BizParams")
    @Expose
    private BizParams BizParams;

    /**
    * 下一级元数据:CATALOG,DATABASE,SCHEMA,TABLE
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NextLevel")
    @Expose
    private String NextLevel;

    /**
     * Get CatalogName: 如dlc数据默认为DataLakeCatalog
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CatalogName CatalogName: 如dlc数据默认为DataLakeCatalog
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set CatalogName: 如dlc数据默认为DataLakeCatalog
注意：此字段可能返回 null，表示取不到有效值。
     * @param CatalogName CatalogName: 如dlc数据默认为DataLakeCatalog
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }

    /**
     * Get 数据源ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataSourceId 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDataSourceId() {
        return this.DataSourceId;
    }

    /**
     * Set 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataSourceId 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataSourceId(Long DataSourceId) {
        this.DataSourceId = DataSourceId;
    }

    /**
     * Get 数据源名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataSourceName 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataSourceName() {
        return this.DataSourceName;
    }

    /**
     * Set 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataSourceName 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataSourceName(String DataSourceName) {
        this.DataSourceName = DataSourceName;
    }

    /**
     * Get 数据源实例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataSourceInstance 数据源实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataSourceInstance() {
        return this.DataSourceInstance;
    }

    /**
     * Set 数据源实例
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataSourceInstance 数据源实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataSourceInstance(String DataSourceInstance) {
        this.DataSourceInstance = DataSourceInstance;
    }

    /**
     * Get 数据源类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataSourceType 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataSourceType() {
        return this.DataSourceType;
    }

    /**
     * Set 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataSourceType 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataSourceType(String DataSourceType) {
        this.DataSourceType = DataSourceType;
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
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 责任人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Owner 责任人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set 责任人
注意：此字段可能返回 null，表示取不到有效值。
     * @param Owner 责任人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 责任人账号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerAccount 责任人账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOwnerAccount() {
        return this.OwnerAccount;
    }

    /**
     * Set 责任人账号
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerAccount 责任人账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerAccount(Long OwnerAccount) {
        this.OwnerAccount = OwnerAccount;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifiedTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifiedTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifiedTime(Long ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get 数据库地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Location 数据库地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set 数据库地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Location 数据库地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get 业务额外属性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BizParams 业务额外属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BizParams getBizParams() {
        return this.BizParams;
    }

    /**
     * Set 业务额外属性
注意：此字段可能返回 null，表示取不到有效值。
     * @param BizParams 业务额外属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBizParams(BizParams BizParams) {
        this.BizParams = BizParams;
    }

    /**
     * Get 下一级元数据:CATALOG,DATABASE,SCHEMA,TABLE
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NextLevel 下一级元数据:CATALOG,DATABASE,SCHEMA,TABLE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNextLevel() {
        return this.NextLevel;
    }

    /**
     * Set 下一级元数据:CATALOG,DATABASE,SCHEMA,TABLE
注意：此字段可能返回 null，表示取不到有效值。
     * @param NextLevel 下一级元数据:CATALOG,DATABASE,SCHEMA,TABLE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNextLevel(String NextLevel) {
        this.NextLevel = NextLevel;
    }

    public DatabaseRealViewVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DatabaseRealViewVO(DatabaseRealViewVO source) {
        if (source.CatalogName != null) {
            this.CatalogName = new String(source.CatalogName);
        }
        if (source.DataSourceId != null) {
            this.DataSourceId = new Long(source.DataSourceId);
        }
        if (source.DataSourceName != null) {
            this.DataSourceName = new String(source.DataSourceName);
        }
        if (source.DataSourceInstance != null) {
            this.DataSourceInstance = new String(source.DataSourceInstance);
        }
        if (source.DataSourceType != null) {
            this.DataSourceType = new String(source.DataSourceType);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.OwnerAccount != null) {
            this.OwnerAccount = new Long(source.OwnerAccount);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new Long(source.ModifiedTime);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.BizParams != null) {
            this.BizParams = new BizParams(source.BizParams);
        }
        if (source.NextLevel != null) {
            this.NextLevel = new String(source.NextLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CatalogName", this.CatalogName);
        this.setParamSimple(map, prefix + "DataSourceId", this.DataSourceId);
        this.setParamSimple(map, prefix + "DataSourceName", this.DataSourceName);
        this.setParamSimple(map, prefix + "DataSourceInstance", this.DataSourceInstance);
        this.setParamSimple(map, prefix + "DataSourceType", this.DataSourceType);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "OwnerAccount", this.OwnerAccount);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamObj(map, prefix + "BizParams.", this.BizParams);
        this.setParamSimple(map, prefix + "NextLevel", this.NextLevel);

    }
}

