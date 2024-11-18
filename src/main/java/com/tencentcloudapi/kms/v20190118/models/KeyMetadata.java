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

public class KeyMetadata extends AbstractModel {

    /**
    * CMK的全局唯一标识
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 作为密钥更容易辨识，更容易被人看懂的别名
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 密钥创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * CMK的描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * CMK的状态， 取值为：Enabled | Disabled | PendingDelete | PendingImport | Archived
    */
    @SerializedName("KeyState")
    @Expose
    private String KeyState;

    /**
    * CMK用途，取值为: ENCRYPT_DECRYPT | ASYMMETRIC_DECRYPT_RSA_2048 | ASYMMETRIC_DECRYPT_SM2 | ASYMMETRIC_SIGN_VERIFY_SM2 | ASYMMETRIC_SIGN_VERIFY_RSA_2048 | ASYMMETRIC_SIGN_VERIFY_ECC
    */
    @SerializedName("KeyUsage")
    @Expose
    private String KeyUsage;

    /**
    * CMK类型，2 表示符合FIPS标准，4表示符合国密标准
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 创建者
    */
    @SerializedName("CreatorUin")
    @Expose
    private Long CreatorUin;

    /**
    * 是否开启了密钥轮换功能
    */
    @SerializedName("KeyRotationEnabled")
    @Expose
    private Boolean KeyRotationEnabled;

    /**
    * CMK的创建者，用户创建的为 user，授权各云产品自动创建的为对应的产品名
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * 在密钥轮换开启状态下，下次轮换的时间
    */
    @SerializedName("NextRotateTime")
    @Expose
    private Long NextRotateTime;

    /**
    * 计划删除的时间
    */
    @SerializedName("DeletionDate")
    @Expose
    private Long DeletionDate;

    /**
    * CMK 密钥材料类型，由KMS创建的为： TENCENT_KMS， 由用户导入的类型为：EXTERNAL
    */
    @SerializedName("Origin")
    @Expose
    private String Origin;

    /**
    * 在Origin为  EXTERNAL 时有效，表示密钥材料的有效日期， 0 表示不过期
    */
    @SerializedName("ValidTo")
    @Expose
    private Long ValidTo;

    /**
    * 资源ID，格式：creatorUin/$creatorUin/$keyId
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * HSM 集群 ID（仅对 KMS 独占版/托管版服务实例有效）
    */
    @SerializedName("HsmClusterId")
    @Expose
    private String HsmClusterId;

    /**
    * 密钥轮转周期（天）
    */
    @SerializedName("RotateDays")
    @Expose
    private Long RotateDays;

    /**
    * 上次乱转时间（Unix timestamp）
    */
    @SerializedName("LastRotateTime")
    @Expose
    private Long LastRotateTime;

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
     * Get 作为密钥更容易辨识，更容易被人看懂的别名 
     * @return Alias 作为密钥更容易辨识，更容易被人看懂的别名
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 作为密钥更容易辨识，更容易被人看懂的别名
     * @param Alias 作为密钥更容易辨识，更容易被人看懂的别名
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
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
     * Get CMK的描述 
     * @return Description CMK的描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set CMK的描述
     * @param Description CMK的描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get CMK的状态， 取值为：Enabled | Disabled | PendingDelete | PendingImport | Archived 
     * @return KeyState CMK的状态， 取值为：Enabled | Disabled | PendingDelete | PendingImport | Archived
     */
    public String getKeyState() {
        return this.KeyState;
    }

    /**
     * Set CMK的状态， 取值为：Enabled | Disabled | PendingDelete | PendingImport | Archived
     * @param KeyState CMK的状态， 取值为：Enabled | Disabled | PendingDelete | PendingImport | Archived
     */
    public void setKeyState(String KeyState) {
        this.KeyState = KeyState;
    }

    /**
     * Get CMK用途，取值为: ENCRYPT_DECRYPT | ASYMMETRIC_DECRYPT_RSA_2048 | ASYMMETRIC_DECRYPT_SM2 | ASYMMETRIC_SIGN_VERIFY_SM2 | ASYMMETRIC_SIGN_VERIFY_RSA_2048 | ASYMMETRIC_SIGN_VERIFY_ECC 
     * @return KeyUsage CMK用途，取值为: ENCRYPT_DECRYPT | ASYMMETRIC_DECRYPT_RSA_2048 | ASYMMETRIC_DECRYPT_SM2 | ASYMMETRIC_SIGN_VERIFY_SM2 | ASYMMETRIC_SIGN_VERIFY_RSA_2048 | ASYMMETRIC_SIGN_VERIFY_ECC
     */
    public String getKeyUsage() {
        return this.KeyUsage;
    }

    /**
     * Set CMK用途，取值为: ENCRYPT_DECRYPT | ASYMMETRIC_DECRYPT_RSA_2048 | ASYMMETRIC_DECRYPT_SM2 | ASYMMETRIC_SIGN_VERIFY_SM2 | ASYMMETRIC_SIGN_VERIFY_RSA_2048 | ASYMMETRIC_SIGN_VERIFY_ECC
     * @param KeyUsage CMK用途，取值为: ENCRYPT_DECRYPT | ASYMMETRIC_DECRYPT_RSA_2048 | ASYMMETRIC_DECRYPT_SM2 | ASYMMETRIC_SIGN_VERIFY_SM2 | ASYMMETRIC_SIGN_VERIFY_RSA_2048 | ASYMMETRIC_SIGN_VERIFY_ECC
     */
    public void setKeyUsage(String KeyUsage) {
        this.KeyUsage = KeyUsage;
    }

    /**
     * Get CMK类型，2 表示符合FIPS标准，4表示符合国密标准 
     * @return Type CMK类型，2 表示符合FIPS标准，4表示符合国密标准
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set CMK类型，2 表示符合FIPS标准，4表示符合国密标准
     * @param Type CMK类型，2 表示符合FIPS标准，4表示符合国密标准
     */
    public void setType(Long Type) {
        this.Type = Type;
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
     * Get 是否开启了密钥轮换功能 
     * @return KeyRotationEnabled 是否开启了密钥轮换功能
     */
    public Boolean getKeyRotationEnabled() {
        return this.KeyRotationEnabled;
    }

    /**
     * Set 是否开启了密钥轮换功能
     * @param KeyRotationEnabled 是否开启了密钥轮换功能
     */
    public void setKeyRotationEnabled(Boolean KeyRotationEnabled) {
        this.KeyRotationEnabled = KeyRotationEnabled;
    }

    /**
     * Get CMK的创建者，用户创建的为 user，授权各云产品自动创建的为对应的产品名 
     * @return Owner CMK的创建者，用户创建的为 user，授权各云产品自动创建的为对应的产品名
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set CMK的创建者，用户创建的为 user，授权各云产品自动创建的为对应的产品名
     * @param Owner CMK的创建者，用户创建的为 user，授权各云产品自动创建的为对应的产品名
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 在密钥轮换开启状态下，下次轮换的时间 
     * @return NextRotateTime 在密钥轮换开启状态下，下次轮换的时间
     */
    public Long getNextRotateTime() {
        return this.NextRotateTime;
    }

    /**
     * Set 在密钥轮换开启状态下，下次轮换的时间
     * @param NextRotateTime 在密钥轮换开启状态下，下次轮换的时间
     */
    public void setNextRotateTime(Long NextRotateTime) {
        this.NextRotateTime = NextRotateTime;
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
     * Get CMK 密钥材料类型，由KMS创建的为： TENCENT_KMS， 由用户导入的类型为：EXTERNAL 
     * @return Origin CMK 密钥材料类型，由KMS创建的为： TENCENT_KMS， 由用户导入的类型为：EXTERNAL
     */
    public String getOrigin() {
        return this.Origin;
    }

    /**
     * Set CMK 密钥材料类型，由KMS创建的为： TENCENT_KMS， 由用户导入的类型为：EXTERNAL
     * @param Origin CMK 密钥材料类型，由KMS创建的为： TENCENT_KMS， 由用户导入的类型为：EXTERNAL
     */
    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    /**
     * Get 在Origin为  EXTERNAL 时有效，表示密钥材料的有效日期， 0 表示不过期 
     * @return ValidTo 在Origin为  EXTERNAL 时有效，表示密钥材料的有效日期， 0 表示不过期
     */
    public Long getValidTo() {
        return this.ValidTo;
    }

    /**
     * Set 在Origin为  EXTERNAL 时有效，表示密钥材料的有效日期， 0 表示不过期
     * @param ValidTo 在Origin为  EXTERNAL 时有效，表示密钥材料的有效日期， 0 表示不过期
     */
    public void setValidTo(Long ValidTo) {
        this.ValidTo = ValidTo;
    }

    /**
     * Get 资源ID，格式：creatorUin/$creatorUin/$keyId 
     * @return ResourceId 资源ID，格式：creatorUin/$creatorUin/$keyId
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID，格式：creatorUin/$creatorUin/$keyId
     * @param ResourceId 资源ID，格式：creatorUin/$creatorUin/$keyId
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
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
     * Get 密钥轮转周期（天） 
     * @return RotateDays 密钥轮转周期（天）
     */
    public Long getRotateDays() {
        return this.RotateDays;
    }

    /**
     * Set 密钥轮转周期（天）
     * @param RotateDays 密钥轮转周期（天）
     */
    public void setRotateDays(Long RotateDays) {
        this.RotateDays = RotateDays;
    }

    /**
     * Get 上次乱转时间（Unix timestamp） 
     * @return LastRotateTime 上次乱转时间（Unix timestamp）
     */
    public Long getLastRotateTime() {
        return this.LastRotateTime;
    }

    /**
     * Set 上次乱转时间（Unix timestamp）
     * @param LastRotateTime 上次乱转时间（Unix timestamp）
     */
    public void setLastRotateTime(Long LastRotateTime) {
        this.LastRotateTime = LastRotateTime;
    }

    public KeyMetadata() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KeyMetadata(KeyMetadata source) {
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
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
        if (source.KeyUsage != null) {
            this.KeyUsage = new String(source.KeyUsage);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.CreatorUin != null) {
            this.CreatorUin = new Long(source.CreatorUin);
        }
        if (source.KeyRotationEnabled != null) {
            this.KeyRotationEnabled = new Boolean(source.KeyRotationEnabled);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.NextRotateTime != null) {
            this.NextRotateTime = new Long(source.NextRotateTime);
        }
        if (source.DeletionDate != null) {
            this.DeletionDate = new Long(source.DeletionDate);
        }
        if (source.Origin != null) {
            this.Origin = new String(source.Origin);
        }
        if (source.ValidTo != null) {
            this.ValidTo = new Long(source.ValidTo);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.HsmClusterId != null) {
            this.HsmClusterId = new String(source.HsmClusterId);
        }
        if (source.RotateDays != null) {
            this.RotateDays = new Long(source.RotateDays);
        }
        if (source.LastRotateTime != null) {
            this.LastRotateTime = new Long(source.LastRotateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "KeyState", this.KeyState);
        this.setParamSimple(map, prefix + "KeyUsage", this.KeyUsage);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CreatorUin", this.CreatorUin);
        this.setParamSimple(map, prefix + "KeyRotationEnabled", this.KeyRotationEnabled);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "NextRotateTime", this.NextRotateTime);
        this.setParamSimple(map, prefix + "DeletionDate", this.DeletionDate);
        this.setParamSimple(map, prefix + "Origin", this.Origin);
        this.setParamSimple(map, prefix + "ValidTo", this.ValidTo);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "HsmClusterId", this.HsmClusterId);
        this.setParamSimple(map, prefix + "RotateDays", this.RotateDays);
        this.setParamSimple(map, prefix + "LastRotateTime", this.LastRotateTime);

    }
}

