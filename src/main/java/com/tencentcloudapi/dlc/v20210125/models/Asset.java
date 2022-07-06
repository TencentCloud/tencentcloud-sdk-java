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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Asset extends AbstractModel{

    /**
    * 主键
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 对象GUID值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Guid")
    @Expose
    private String Guid;

    /**
    * 数据目录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * 描述信息
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 对象owner
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * 对象owner账户
    */
    @SerializedName("OwnerAccount")
    @Expose
    private String OwnerAccount;

    /**
    * 权限
    */
    @SerializedName("PermValues")
    @Expose
    private KVPair [] PermValues;

    /**
    * 附加属性
    */
    @SerializedName("Params")
    @Expose
    private KVPair [] Params;

    /**
    * 附加业务属性
    */
    @SerializedName("BizParams")
    @Expose
    private KVPair [] BizParams;

    /**
    * 数据版本
    */
    @SerializedName("DataVersion")
    @Expose
    private Long DataVersion;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 修改时间
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * 数据源主键
    */
    @SerializedName("DatasourceId")
    @Expose
    private Long DatasourceId;

    /**
     * Get 主键
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 主键
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 主键
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 主键
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 对象GUID值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Guid 对象GUID值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGuid() {
        return this.Guid;
    }

    /**
     * Set 对象GUID值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Guid 对象GUID值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGuid(String Guid) {
        this.Guid = Guid;
    }

    /**
     * Get 数据目录
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Catalog 数据目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set 数据目录
注意：此字段可能返回 null，表示取不到有效值。
     * @param Catalog 数据目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    /**
     * Get 描述信息 
     * @return Description 描述信息
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述信息
     * @param Description 描述信息
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 对象owner 
     * @return Owner 对象owner
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set 对象owner
     * @param Owner 对象owner
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 对象owner账户 
     * @return OwnerAccount 对象owner账户
     */
    public String getOwnerAccount() {
        return this.OwnerAccount;
    }

    /**
     * Set 对象owner账户
     * @param OwnerAccount 对象owner账户
     */
    public void setOwnerAccount(String OwnerAccount) {
        this.OwnerAccount = OwnerAccount;
    }

    /**
     * Get 权限 
     * @return PermValues 权限
     */
    public KVPair [] getPermValues() {
        return this.PermValues;
    }

    /**
     * Set 权限
     * @param PermValues 权限
     */
    public void setPermValues(KVPair [] PermValues) {
        this.PermValues = PermValues;
    }

    /**
     * Get 附加属性 
     * @return Params 附加属性
     */
    public KVPair [] getParams() {
        return this.Params;
    }

    /**
     * Set 附加属性
     * @param Params 附加属性
     */
    public void setParams(KVPair [] Params) {
        this.Params = Params;
    }

    /**
     * Get 附加业务属性 
     * @return BizParams 附加业务属性
     */
    public KVPair [] getBizParams() {
        return this.BizParams;
    }

    /**
     * Set 附加业务属性
     * @param BizParams 附加业务属性
     */
    public void setBizParams(KVPair [] BizParams) {
        this.BizParams = BizParams;
    }

    /**
     * Get 数据版本 
     * @return DataVersion 数据版本
     */
    public Long getDataVersion() {
        return this.DataVersion;
    }

    /**
     * Set 数据版本
     * @param DataVersion 数据版本
     */
    public void setDataVersion(Long DataVersion) {
        this.DataVersion = DataVersion;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间 
     * @return ModifiedTime 修改时间
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set 修改时间
     * @param ModifiedTime 修改时间
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get 数据源主键 
     * @return DatasourceId 数据源主键
     */
    public Long getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据源主键
     * @param DatasourceId 数据源主键
     */
    public void setDatasourceId(Long DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    public Asset() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Asset(Asset source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Guid != null) {
            this.Guid = new String(source.Guid);
        }
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.OwnerAccount != null) {
            this.OwnerAccount = new String(source.OwnerAccount);
        }
        if (source.PermValues != null) {
            this.PermValues = new KVPair[source.PermValues.length];
            for (int i = 0; i < source.PermValues.length; i++) {
                this.PermValues[i] = new KVPair(source.PermValues[i]);
            }
        }
        if (source.Params != null) {
            this.Params = new KVPair[source.Params.length];
            for (int i = 0; i < source.Params.length; i++) {
                this.Params[i] = new KVPair(source.Params[i]);
            }
        }
        if (source.BizParams != null) {
            this.BizParams = new KVPair[source.BizParams.length];
            for (int i = 0; i < source.BizParams.length; i++) {
                this.BizParams[i] = new KVPair(source.BizParams[i]);
            }
        }
        if (source.DataVersion != null) {
            this.DataVersion = new Long(source.DataVersion);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new Long(source.DatasourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Guid", this.Guid);
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "OwnerAccount", this.OwnerAccount);
        this.setParamArrayObj(map, prefix + "PermValues.", this.PermValues);
        this.setParamArrayObj(map, prefix + "Params.", this.Params);
        this.setParamArrayObj(map, prefix + "BizParams.", this.BizParams);
        this.setParamSimple(map, prefix + "DataVersion", this.DataVersion);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);

    }
}

