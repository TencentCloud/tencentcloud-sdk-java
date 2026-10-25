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

public class AssetTagVote extends AbstractModel {

    /**
    * 主键ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 资产类型，取值参考AssetType定义，如CATALOG、SCHEMA、TABLE、VIEW、MODEL、VOLUME、FUNCTION等
    */
    @SerializedName("PropertyType")
    @Expose
    private String PropertyType;

    /**
    * 资产ID
    */
    @SerializedName("PropertyId")
    @Expose
    private String PropertyId;

    /**
    * 标签ID
    */
    @SerializedName("LabelId")
    @Expose
    private String LabelId;

    /**
    * 标签名称
    */
    @SerializedName("LabelName")
    @Expose
    private String LabelName;

    /**
    * 标签值ID
    */
    @SerializedName("LabelValueId")
    @Expose
    private String LabelValueId;

    /**
    * 标签值
    */
    @SerializedName("LabelValue")
    @Expose
    private String LabelValue;

    /**
    * 创建人
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * 修改者
    */
    @SerializedName("Modifier")
    @Expose
    private String Modifier;

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
    * 所有者账号
    */
    @SerializedName("OwnerAccount")
    @Expose
    private String OwnerAccount;

    /**
    * 标签类型，取值：0=未知，1=治理标签，2=自定义标签，3=属性标签，4=脱敏标签
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 是否删除
    */
    @SerializedName("Deleted")
    @Expose
    private Boolean Deleted;

    /**
     * Get 主键ID 
     * @return Id 主键ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 主键ID
     * @param Id 主键ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 资产类型，取值参考AssetType定义，如CATALOG、SCHEMA、TABLE、VIEW、MODEL、VOLUME、FUNCTION等 
     * @return PropertyType 资产类型，取值参考AssetType定义，如CATALOG、SCHEMA、TABLE、VIEW、MODEL、VOLUME、FUNCTION等
     */
    public String getPropertyType() {
        return this.PropertyType;
    }

    /**
     * Set 资产类型，取值参考AssetType定义，如CATALOG、SCHEMA、TABLE、VIEW、MODEL、VOLUME、FUNCTION等
     * @param PropertyType 资产类型，取值参考AssetType定义，如CATALOG、SCHEMA、TABLE、VIEW、MODEL、VOLUME、FUNCTION等
     */
    public void setPropertyType(String PropertyType) {
        this.PropertyType = PropertyType;
    }

    /**
     * Get 资产ID 
     * @return PropertyId 资产ID
     */
    public String getPropertyId() {
        return this.PropertyId;
    }

    /**
     * Set 资产ID
     * @param PropertyId 资产ID
     */
    public void setPropertyId(String PropertyId) {
        this.PropertyId = PropertyId;
    }

    /**
     * Get 标签ID 
     * @return LabelId 标签ID
     */
    public String getLabelId() {
        return this.LabelId;
    }

    /**
     * Set 标签ID
     * @param LabelId 标签ID
     */
    public void setLabelId(String LabelId) {
        this.LabelId = LabelId;
    }

    /**
     * Get 标签名称 
     * @return LabelName 标签名称
     */
    public String getLabelName() {
        return this.LabelName;
    }

    /**
     * Set 标签名称
     * @param LabelName 标签名称
     */
    public void setLabelName(String LabelName) {
        this.LabelName = LabelName;
    }

    /**
     * Get 标签值ID 
     * @return LabelValueId 标签值ID
     */
    public String getLabelValueId() {
        return this.LabelValueId;
    }

    /**
     * Set 标签值ID
     * @param LabelValueId 标签值ID
     */
    public void setLabelValueId(String LabelValueId) {
        this.LabelValueId = LabelValueId;
    }

    /**
     * Get 标签值 
     * @return LabelValue 标签值
     */
    public String getLabelValue() {
        return this.LabelValue;
    }

    /**
     * Set 标签值
     * @param LabelValue 标签值
     */
    public void setLabelValue(String LabelValue) {
        this.LabelValue = LabelValue;
    }

    /**
     * Get 创建人 
     * @return Creator 创建人
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 创建人
     * @param Creator 创建人
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get 修改者 
     * @return Modifier 修改者
     */
    public String getModifier() {
        return this.Modifier;
    }

    /**
     * Set 修改者
     * @param Modifier 修改者
     */
    public void setModifier(String Modifier) {
        this.Modifier = Modifier;
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
     * Get 所有者账号 
     * @return OwnerAccount 所有者账号
     */
    public String getOwnerAccount() {
        return this.OwnerAccount;
    }

    /**
     * Set 所有者账号
     * @param OwnerAccount 所有者账号
     */
    public void setOwnerAccount(String OwnerAccount) {
        this.OwnerAccount = OwnerAccount;
    }

    /**
     * Get 标签类型，取值：0=未知，1=治理标签，2=自定义标签，3=属性标签，4=脱敏标签 
     * @return Type 标签类型，取值：0=未知，1=治理标签，2=自定义标签，3=属性标签，4=脱敏标签
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 标签类型，取值：0=未知，1=治理标签，2=自定义标签，3=属性标签，4=脱敏标签
     * @param Type 标签类型，取值：0=未知，1=治理标签，2=自定义标签，3=属性标签，4=脱敏标签
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 是否删除 
     * @return Deleted 是否删除
     */
    public Boolean getDeleted() {
        return this.Deleted;
    }

    /**
     * Set 是否删除
     * @param Deleted 是否删除
     */
    public void setDeleted(Boolean Deleted) {
        this.Deleted = Deleted;
    }

    public AssetTagVote() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetTagVote(AssetTagVote source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.PropertyType != null) {
            this.PropertyType = new String(source.PropertyType);
        }
        if (source.PropertyId != null) {
            this.PropertyId = new String(source.PropertyId);
        }
        if (source.LabelId != null) {
            this.LabelId = new String(source.LabelId);
        }
        if (source.LabelName != null) {
            this.LabelName = new String(source.LabelName);
        }
        if (source.LabelValueId != null) {
            this.LabelValueId = new String(source.LabelValueId);
        }
        if (source.LabelValue != null) {
            this.LabelValue = new String(source.LabelValue);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.Modifier != null) {
            this.Modifier = new String(source.Modifier);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
        if (source.OwnerAccount != null) {
            this.OwnerAccount = new String(source.OwnerAccount);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Deleted != null) {
            this.Deleted = new Boolean(source.Deleted);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "PropertyType", this.PropertyType);
        this.setParamSimple(map, prefix + "PropertyId", this.PropertyId);
        this.setParamSimple(map, prefix + "LabelId", this.LabelId);
        this.setParamSimple(map, prefix + "LabelName", this.LabelName);
        this.setParamSimple(map, prefix + "LabelValueId", this.LabelValueId);
        this.setParamSimple(map, prefix + "LabelValue", this.LabelValue);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "Modifier", this.Modifier);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "OwnerAccount", this.OwnerAccount);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Deleted", this.Deleted);

    }
}

