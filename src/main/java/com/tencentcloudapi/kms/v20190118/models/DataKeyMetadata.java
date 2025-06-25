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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataKeyMetadata extends AbstractModel {

    /**
    * DataKey的全局唯一标识
    */
    @SerializedName("DataKeyId")
    @Expose
    private String DataKeyId;

    /**
    * CMK的全局唯一标识
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 作为密钥更容易辨识，更容易被人看懂的数据密钥名称
    */
    @SerializedName("DataKeyName")
    @Expose
    private String DataKeyName;

    /**
    * 数据密钥的长度,单位字节
    */
    @SerializedName("NumberOfBytes")
    @Expose
    private Long NumberOfBytes;

    /**
    * 密钥创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * DataKey的描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * DataKey的状态， 取值为：Enabled | Disabled | PendingDelete
    */
    @SerializedName("KeyState")
    @Expose
    private String KeyState;

    /**
    * 创建者
    */
    @SerializedName("CreatorUin")
    @Expose
    private Long CreatorUin;

    /**
    * 数据密钥的创建者，用户创建的为 user，授权各云产品自动创建的为对应的产品名
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * 计划删除的时间
    */
    @SerializedName("DeletionDate")
    @Expose
    private Long DeletionDate;

    /**
    * DataKey 密钥材料类型，由KMS创建的为： TENCENT_KMS， 由用户导入的类型为：EXTERNAL
    */
    @SerializedName("Origin")
    @Expose
    private String Origin;

    /**
    * HSM 集群 ID（仅对 KMS 独占版/托管版服务实例有效）
    */
    @SerializedName("HsmClusterId")
    @Expose
    private String HsmClusterId;

    /**
    * 资源ID，格式：creatorUin/$creatorUin/$dataKeyId
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
     * Get DataKey的全局唯一标识 
     * @return DataKeyId DataKey的全局唯一标识
     */
    public String getDataKeyId() {
        return this.DataKeyId;
    }

    /**
     * Set DataKey的全局唯一标识
     * @param DataKeyId DataKey的全局唯一标识
     */
    public void setDataKeyId(String DataKeyId) {
        this.DataKeyId = DataKeyId;
    }

    /**
     * Get CMK的全局唯一标识 
     * @return KeyId CMK的全局唯一标识
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set CMK的全局唯一标识
     * @param KeyId CMK的全局唯一标识
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get 作为密钥更容易辨识，更容易被人看懂的数据密钥名称 
     * @return DataKeyName 作为密钥更容易辨识，更容易被人看懂的数据密钥名称
     */
    public String getDataKeyName() {
        return this.DataKeyName;
    }

    /**
     * Set 作为密钥更容易辨识，更容易被人看懂的数据密钥名称
     * @param DataKeyName 作为密钥更容易辨识，更容易被人看懂的数据密钥名称
     */
    public void setDataKeyName(String DataKeyName) {
        this.DataKeyName = DataKeyName;
    }

    /**
     * Get 数据密钥的长度,单位字节 
     * @return NumberOfBytes 数据密钥的长度,单位字节
     */
    public Long getNumberOfBytes() {
        return this.NumberOfBytes;
    }

    /**
     * Set 数据密钥的长度,单位字节
     * @param NumberOfBytes 数据密钥的长度,单位字节
     */
    public void setNumberOfBytes(Long NumberOfBytes) {
        this.NumberOfBytes = NumberOfBytes;
    }

    /**
     * Get 密钥创建时间 
     * @return CreateTime 密钥创建时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 密钥创建时间
     * @param CreateTime 密钥创建时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get DataKey的描述 
     * @return Description DataKey的描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set DataKey的描述
     * @param Description DataKey的描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get DataKey的状态， 取值为：Enabled | Disabled | PendingDelete 
     * @return KeyState DataKey的状态， 取值为：Enabled | Disabled | PendingDelete
     */
    public String getKeyState() {
        return this.KeyState;
    }

    /**
     * Set DataKey的状态， 取值为：Enabled | Disabled | PendingDelete
     * @param KeyState DataKey的状态， 取值为：Enabled | Disabled | PendingDelete
     */
    public void setKeyState(String KeyState) {
        this.KeyState = KeyState;
    }

    /**
     * Get 创建者 
     * @return CreatorUin 创建者
     */
    public Long getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set 创建者
     * @param CreatorUin 创建者
     */
    public void setCreatorUin(Long CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get 数据密钥的创建者，用户创建的为 user，授权各云产品自动创建的为对应的产品名 
     * @return Owner 数据密钥的创建者，用户创建的为 user，授权各云产品自动创建的为对应的产品名
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set 数据密钥的创建者，用户创建的为 user，授权各云产品自动创建的为对应的产品名
     * @param Owner 数据密钥的创建者，用户创建的为 user，授权各云产品自动创建的为对应的产品名
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 计划删除的时间 
     * @return DeletionDate 计划删除的时间
     */
    public Long getDeletionDate() {
        return this.DeletionDate;
    }

    /**
     * Set 计划删除的时间
     * @param DeletionDate 计划删除的时间
     */
    public void setDeletionDate(Long DeletionDate) {
        this.DeletionDate = DeletionDate;
    }

    /**
     * Get DataKey 密钥材料类型，由KMS创建的为： TENCENT_KMS， 由用户导入的类型为：EXTERNAL 
     * @return Origin DataKey 密钥材料类型，由KMS创建的为： TENCENT_KMS， 由用户导入的类型为：EXTERNAL
     */
    public String getOrigin() {
        return this.Origin;
    }

    /**
     * Set DataKey 密钥材料类型，由KMS创建的为： TENCENT_KMS， 由用户导入的类型为：EXTERNAL
     * @param Origin DataKey 密钥材料类型，由KMS创建的为： TENCENT_KMS， 由用户导入的类型为：EXTERNAL
     */
    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    /**
     * Get HSM 集群 ID（仅对 KMS 独占版/托管版服务实例有效） 
     * @return HsmClusterId HSM 集群 ID（仅对 KMS 独占版/托管版服务实例有效）
     */
    public String getHsmClusterId() {
        return this.HsmClusterId;
    }

    /**
     * Set HSM 集群 ID（仅对 KMS 独占版/托管版服务实例有效）
     * @param HsmClusterId HSM 集群 ID（仅对 KMS 独占版/托管版服务实例有效）
     */
    public void setHsmClusterId(String HsmClusterId) {
        this.HsmClusterId = HsmClusterId;
    }

    /**
     * Get 资源ID，格式：creatorUin/$creatorUin/$dataKeyId 
     * @return ResourceId 资源ID，格式：creatorUin/$creatorUin/$dataKeyId
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID，格式：creatorUin/$creatorUin/$dataKeyId
     * @param ResourceId 资源ID，格式：creatorUin/$creatorUin/$dataKeyId
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    public DataKeyMetadata() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataKeyMetadata(DataKeyMetadata source) {
        if (source.DataKeyId != null) {
            this.DataKeyId = new String(source.DataKeyId);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.DataKeyName != null) {
            this.DataKeyName = new String(source.DataKeyName);
        }
        if (source.NumberOfBytes != null) {
            this.NumberOfBytes = new Long(source.NumberOfBytes);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.KeyState != null) {
            this.KeyState = new String(source.KeyState);
        }
        if (source.CreatorUin != null) {
            this.CreatorUin = new Long(source.CreatorUin);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.DeletionDate != null) {
            this.DeletionDate = new Long(source.DeletionDate);
        }
        if (source.Origin != null) {
            this.Origin = new String(source.Origin);
        }
        if (source.HsmClusterId != null) {
            this.HsmClusterId = new String(source.HsmClusterId);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataKeyId", this.DataKeyId);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "DataKeyName", this.DataKeyName);
        this.setParamSimple(map, prefix + "NumberOfBytes", this.NumberOfBytes);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "KeyState", this.KeyState);
        this.setParamSimple(map, prefix + "CreatorUin", this.CreatorUin);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "DeletionDate", this.DeletionDate);
        this.setParamSimple(map, prefix + "Origin", this.Origin);
        this.setParamSimple(map, prefix + "HsmClusterId", this.HsmClusterId);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

