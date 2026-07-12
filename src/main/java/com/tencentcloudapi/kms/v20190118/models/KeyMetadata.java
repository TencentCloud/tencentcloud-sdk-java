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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KeyMetadata extends AbstractModel {

    /**
    * <p>CMK的全局唯一标识</p>
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * <p>作为密钥更容易辨识，更容易被人看懂的别名</p>
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * <p>密钥创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>CMK的描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>CMK的状态， 取值为：Enabled | Disabled | PendingDelete | PendingImport | Archived</p>
    */
    @SerializedName("KeyState")
    @Expose
    private String KeyState;

    /**
    * <p>CMK用途，取值为: ENCRYPT_DECRYPT | ASYMMETRIC_DECRYPT_RSA_2048 | ASYMMETRIC_DECRYPT_SM2 | ASYMMETRIC_SIGN_VERIFY_SM2 | ASYMMETRIC_SIGN_VERIFY_RSA_2048 | ASYMMETRIC_SIGN_VERIFY_ECC</p>
    */
    @SerializedName("KeyUsage")
    @Expose
    private String KeyUsage;

    /**
    * <p>CMK类型，2 表示符合FIPS 140-2标准，4表示符合国密标准</p><p>枚举值：</p><ul><li>2： 表示符合FIPS 140-2标准</li><li>4： 表示符合国密标准</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>创建者</p>
    */
    @SerializedName("CreatorUin")
    @Expose
    private Long CreatorUin;

    /**
    * <p>是否开启了密钥轮换功能</p>
    */
    @SerializedName("KeyRotationEnabled")
    @Expose
    private Boolean KeyRotationEnabled;

    /**
    * <p>CMK的创建者，用户创建的为 user，授权各云产品自动创建的为对应的产品名</p>
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * <p>在密钥轮换开启状态下，下次轮换的时间</p>
    */
    @SerializedName("NextRotateTime")
    @Expose
    private Long NextRotateTime;

    /**
    * <p>计划删除的时间</p>
    */
    @SerializedName("DeletionDate")
    @Expose
    private Long DeletionDate;

    /**
    * <p>CMK 密钥材料类型，由KMS创建的为： TENCENT_KMS， 由用户导入的类型为：EXTERNAL</p>
    */
    @SerializedName("Origin")
    @Expose
    private String Origin;

    /**
    * <p>在Origin为  EXTERNAL 时有效，表示密钥材料的有效日期， 0 表示不过期</p>
    */
    @SerializedName("ValidTo")
    @Expose
    private Long ValidTo;

    /**
    * <p>资源ID，格式：creatorUin/$creatorUin/$keyId</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>HSM 集群 ID（仅对 KMS 独占版/托管版服务实例有效）</p>
    */
    @SerializedName("HsmClusterId")
    @Expose
    private String HsmClusterId;

    /**
    * <p>密钥轮转周期（天）</p>
    */
    @SerializedName("RotateDays")
    @Expose
    private Long RotateDays;

    /**
    * <p>上次轮转时间（Unix timestamp）</p>
    */
    @SerializedName("LastRotateTime")
    @Expose
    private Long LastRotateTime;

    /**
    * <p>密钥是否是主副本。0:主本，1:同步副本。</p>
    */
    @SerializedName("IsSyncReplica")
    @Expose
    private Long IsSyncReplica;

    /**
    * <p>同步的原始地域</p>
    */
    @SerializedName("SourceRegion")
    @Expose
    private String SourceRegion;

    /**
    * <p>密钥同步的状态，0:未同步,1:同步成功,2:同步失败,3:同步中。</p>
    */
    @SerializedName("SyncStatus")
    @Expose
    private Long SyncStatus;

    /**
    * <p>同步的结果描述</p>
    */
    @SerializedName("SyncMessages")
    @Expose
    private String SyncMessages;

    /**
    * <p>同步的开始时间</p>
    */
    @SerializedName("SyncStartTime")
    @Expose
    private Long SyncStartTime;

    /**
    * <p>同步的结束时间</p>
    */
    @SerializedName("SyncEndTime")
    @Expose
    private Long SyncEndTime;

    /**
    * <p>同步的原始集群，如果为空，是公有云公共集群</p>
    */
    @SerializedName("SourceHsmClusterId")
    @Expose
    private String SourceHsmClusterId;

    /**
    * <p>成员账号appId</p>
    */
    @SerializedName("AccountAppId")
    @Expose
    private Long AccountAppId;

    /**
    * <p>成员账号uin</p>
    */
    @SerializedName("AccountUin")
    @Expose
    private Long AccountUin;

    /**
    * <p>成员账号名称</p>
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
     * Get <p>CMK的全局唯一标识</p> 
     * @return KeyId <p>CMK的全局唯一标识</p>
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set <p>CMK的全局唯一标识</p>
     * @param KeyId <p>CMK的全局唯一标识</p>
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get <p>作为密钥更容易辨识，更容易被人看懂的别名</p> 
     * @return Alias <p>作为密钥更容易辨识，更容易被人看懂的别名</p>
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set <p>作为密钥更容易辨识，更容易被人看懂的别名</p>
     * @param Alias <p>作为密钥更容易辨识，更容易被人看懂的别名</p>
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get <p>密钥创建时间</p> 
     * @return CreateTime <p>密钥创建时间</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>密钥创建时间</p>
     * @param CreateTime <p>密钥创建时间</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>CMK的描述</p> 
     * @return Description <p>CMK的描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>CMK的描述</p>
     * @param Description <p>CMK的描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>CMK的状态， 取值为：Enabled | Disabled | PendingDelete | PendingImport | Archived</p> 
     * @return KeyState <p>CMK的状态， 取值为：Enabled | Disabled | PendingDelete | PendingImport | Archived</p>
     */
    public String getKeyState() {
        return this.KeyState;
    }

    /**
     * Set <p>CMK的状态， 取值为：Enabled | Disabled | PendingDelete | PendingImport | Archived</p>
     * @param KeyState <p>CMK的状态， 取值为：Enabled | Disabled | PendingDelete | PendingImport | Archived</p>
     */
    public void setKeyState(String KeyState) {
        this.KeyState = KeyState;
    }

    /**
     * Get <p>CMK用途，取值为: ENCRYPT_DECRYPT | ASYMMETRIC_DECRYPT_RSA_2048 | ASYMMETRIC_DECRYPT_SM2 | ASYMMETRIC_SIGN_VERIFY_SM2 | ASYMMETRIC_SIGN_VERIFY_RSA_2048 | ASYMMETRIC_SIGN_VERIFY_ECC</p> 
     * @return KeyUsage <p>CMK用途，取值为: ENCRYPT_DECRYPT | ASYMMETRIC_DECRYPT_RSA_2048 | ASYMMETRIC_DECRYPT_SM2 | ASYMMETRIC_SIGN_VERIFY_SM2 | ASYMMETRIC_SIGN_VERIFY_RSA_2048 | ASYMMETRIC_SIGN_VERIFY_ECC</p>
     */
    public String getKeyUsage() {
        return this.KeyUsage;
    }

    /**
     * Set <p>CMK用途，取值为: ENCRYPT_DECRYPT | ASYMMETRIC_DECRYPT_RSA_2048 | ASYMMETRIC_DECRYPT_SM2 | ASYMMETRIC_SIGN_VERIFY_SM2 | ASYMMETRIC_SIGN_VERIFY_RSA_2048 | ASYMMETRIC_SIGN_VERIFY_ECC</p>
     * @param KeyUsage <p>CMK用途，取值为: ENCRYPT_DECRYPT | ASYMMETRIC_DECRYPT_RSA_2048 | ASYMMETRIC_DECRYPT_SM2 | ASYMMETRIC_SIGN_VERIFY_SM2 | ASYMMETRIC_SIGN_VERIFY_RSA_2048 | ASYMMETRIC_SIGN_VERIFY_ECC</p>
     */
    public void setKeyUsage(String KeyUsage) {
        this.KeyUsage = KeyUsage;
    }

    /**
     * Get <p>CMK类型，2 表示符合FIPS 140-2标准，4表示符合国密标准</p><p>枚举值：</p><ul><li>2： 表示符合FIPS 140-2标准</li><li>4： 表示符合国密标准</li></ul> 
     * @return Type <p>CMK类型，2 表示符合FIPS 140-2标准，4表示符合国密标准</p><p>枚举值：</p><ul><li>2： 表示符合FIPS 140-2标准</li><li>4： 表示符合国密标准</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>CMK类型，2 表示符合FIPS 140-2标准，4表示符合国密标准</p><p>枚举值：</p><ul><li>2： 表示符合FIPS 140-2标准</li><li>4： 表示符合国密标准</li></ul>
     * @param Type <p>CMK类型，2 表示符合FIPS 140-2标准，4表示符合国密标准</p><p>枚举值：</p><ul><li>2： 表示符合FIPS 140-2标准</li><li>4： 表示符合国密标准</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>创建者</p> 
     * @return CreatorUin <p>创建者</p>
     */
    public Long getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set <p>创建者</p>
     * @param CreatorUin <p>创建者</p>
     */
    public void setCreatorUin(Long CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get <p>是否开启了密钥轮换功能</p> 
     * @return KeyRotationEnabled <p>是否开启了密钥轮换功能</p>
     */
    public Boolean getKeyRotationEnabled() {
        return this.KeyRotationEnabled;
    }

    /**
     * Set <p>是否开启了密钥轮换功能</p>
     * @param KeyRotationEnabled <p>是否开启了密钥轮换功能</p>
     */
    public void setKeyRotationEnabled(Boolean KeyRotationEnabled) {
        this.KeyRotationEnabled = KeyRotationEnabled;
    }

    /**
     * Get <p>CMK的创建者，用户创建的为 user，授权各云产品自动创建的为对应的产品名</p> 
     * @return Owner <p>CMK的创建者，用户创建的为 user，授权各云产品自动创建的为对应的产品名</p>
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set <p>CMK的创建者，用户创建的为 user，授权各云产品自动创建的为对应的产品名</p>
     * @param Owner <p>CMK的创建者，用户创建的为 user，授权各云产品自动创建的为对应的产品名</p>
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get <p>在密钥轮换开启状态下，下次轮换的时间</p> 
     * @return NextRotateTime <p>在密钥轮换开启状态下，下次轮换的时间</p>
     */
    public Long getNextRotateTime() {
        return this.NextRotateTime;
    }

    /**
     * Set <p>在密钥轮换开启状态下，下次轮换的时间</p>
     * @param NextRotateTime <p>在密钥轮换开启状态下，下次轮换的时间</p>
     */
    public void setNextRotateTime(Long NextRotateTime) {
        this.NextRotateTime = NextRotateTime;
    }

    /**
     * Get <p>计划删除的时间</p> 
     * @return DeletionDate <p>计划删除的时间</p>
     */
    public Long getDeletionDate() {
        return this.DeletionDate;
    }

    /**
     * Set <p>计划删除的时间</p>
     * @param DeletionDate <p>计划删除的时间</p>
     */
    public void setDeletionDate(Long DeletionDate) {
        this.DeletionDate = DeletionDate;
    }

    /**
     * Get <p>CMK 密钥材料类型，由KMS创建的为： TENCENT_KMS， 由用户导入的类型为：EXTERNAL</p> 
     * @return Origin <p>CMK 密钥材料类型，由KMS创建的为： TENCENT_KMS， 由用户导入的类型为：EXTERNAL</p>
     */
    public String getOrigin() {
        return this.Origin;
    }

    /**
     * Set <p>CMK 密钥材料类型，由KMS创建的为： TENCENT_KMS， 由用户导入的类型为：EXTERNAL</p>
     * @param Origin <p>CMK 密钥材料类型，由KMS创建的为： TENCENT_KMS， 由用户导入的类型为：EXTERNAL</p>
     */
    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    /**
     * Get <p>在Origin为  EXTERNAL 时有效，表示密钥材料的有效日期， 0 表示不过期</p> 
     * @return ValidTo <p>在Origin为  EXTERNAL 时有效，表示密钥材料的有效日期， 0 表示不过期</p>
     */
    public Long getValidTo() {
        return this.ValidTo;
    }

    /**
     * Set <p>在Origin为  EXTERNAL 时有效，表示密钥材料的有效日期， 0 表示不过期</p>
     * @param ValidTo <p>在Origin为  EXTERNAL 时有效，表示密钥材料的有效日期， 0 表示不过期</p>
     */
    public void setValidTo(Long ValidTo) {
        this.ValidTo = ValidTo;
    }

    /**
     * Get <p>资源ID，格式：creatorUin/$creatorUin/$keyId</p> 
     * @return ResourceId <p>资源ID，格式：creatorUin/$creatorUin/$keyId</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>资源ID，格式：creatorUin/$creatorUin/$keyId</p>
     * @param ResourceId <p>资源ID，格式：creatorUin/$creatorUin/$keyId</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>HSM 集群 ID（仅对 KMS 独占版/托管版服务实例有效）</p> 
     * @return HsmClusterId <p>HSM 集群 ID（仅对 KMS 独占版/托管版服务实例有效）</p>
     */
    public String getHsmClusterId() {
        return this.HsmClusterId;
    }

    /**
     * Set <p>HSM 集群 ID（仅对 KMS 独占版/托管版服务实例有效）</p>
     * @param HsmClusterId <p>HSM 集群 ID（仅对 KMS 独占版/托管版服务实例有效）</p>
     */
    public void setHsmClusterId(String HsmClusterId) {
        this.HsmClusterId = HsmClusterId;
    }

    /**
     * Get <p>密钥轮转周期（天）</p> 
     * @return RotateDays <p>密钥轮转周期（天）</p>
     */
    public Long getRotateDays() {
        return this.RotateDays;
    }

    /**
     * Set <p>密钥轮转周期（天）</p>
     * @param RotateDays <p>密钥轮转周期（天）</p>
     */
    public void setRotateDays(Long RotateDays) {
        this.RotateDays = RotateDays;
    }

    /**
     * Get <p>上次轮转时间（Unix timestamp）</p> 
     * @return LastRotateTime <p>上次轮转时间（Unix timestamp）</p>
     */
    public Long getLastRotateTime() {
        return this.LastRotateTime;
    }

    /**
     * Set <p>上次轮转时间（Unix timestamp）</p>
     * @param LastRotateTime <p>上次轮转时间（Unix timestamp）</p>
     */
    public void setLastRotateTime(Long LastRotateTime) {
        this.LastRotateTime = LastRotateTime;
    }

    /**
     * Get <p>密钥是否是主副本。0:主本，1:同步副本。</p> 
     * @return IsSyncReplica <p>密钥是否是主副本。0:主本，1:同步副本。</p>
     */
    public Long getIsSyncReplica() {
        return this.IsSyncReplica;
    }

    /**
     * Set <p>密钥是否是主副本。0:主本，1:同步副本。</p>
     * @param IsSyncReplica <p>密钥是否是主副本。0:主本，1:同步副本。</p>
     */
    public void setIsSyncReplica(Long IsSyncReplica) {
        this.IsSyncReplica = IsSyncReplica;
    }

    /**
     * Get <p>同步的原始地域</p> 
     * @return SourceRegion <p>同步的原始地域</p>
     */
    public String getSourceRegion() {
        return this.SourceRegion;
    }

    /**
     * Set <p>同步的原始地域</p>
     * @param SourceRegion <p>同步的原始地域</p>
     */
    public void setSourceRegion(String SourceRegion) {
        this.SourceRegion = SourceRegion;
    }

    /**
     * Get <p>密钥同步的状态，0:未同步,1:同步成功,2:同步失败,3:同步中。</p> 
     * @return SyncStatus <p>密钥同步的状态，0:未同步,1:同步成功,2:同步失败,3:同步中。</p>
     */
    public Long getSyncStatus() {
        return this.SyncStatus;
    }

    /**
     * Set <p>密钥同步的状态，0:未同步,1:同步成功,2:同步失败,3:同步中。</p>
     * @param SyncStatus <p>密钥同步的状态，0:未同步,1:同步成功,2:同步失败,3:同步中。</p>
     */
    public void setSyncStatus(Long SyncStatus) {
        this.SyncStatus = SyncStatus;
    }

    /**
     * Get <p>同步的结果描述</p> 
     * @return SyncMessages <p>同步的结果描述</p>
     */
    public String getSyncMessages() {
        return this.SyncMessages;
    }

    /**
     * Set <p>同步的结果描述</p>
     * @param SyncMessages <p>同步的结果描述</p>
     */
    public void setSyncMessages(String SyncMessages) {
        this.SyncMessages = SyncMessages;
    }

    /**
     * Get <p>同步的开始时间</p> 
     * @return SyncStartTime <p>同步的开始时间</p>
     */
    public Long getSyncStartTime() {
        return this.SyncStartTime;
    }

    /**
     * Set <p>同步的开始时间</p>
     * @param SyncStartTime <p>同步的开始时间</p>
     */
    public void setSyncStartTime(Long SyncStartTime) {
        this.SyncStartTime = SyncStartTime;
    }

    /**
     * Get <p>同步的结束时间</p> 
     * @return SyncEndTime <p>同步的结束时间</p>
     */
    public Long getSyncEndTime() {
        return this.SyncEndTime;
    }

    /**
     * Set <p>同步的结束时间</p>
     * @param SyncEndTime <p>同步的结束时间</p>
     */
    public void setSyncEndTime(Long SyncEndTime) {
        this.SyncEndTime = SyncEndTime;
    }

    /**
     * Get <p>同步的原始集群，如果为空，是公有云公共集群</p> 
     * @return SourceHsmClusterId <p>同步的原始集群，如果为空，是公有云公共集群</p>
     */
    public String getSourceHsmClusterId() {
        return this.SourceHsmClusterId;
    }

    /**
     * Set <p>同步的原始集群，如果为空，是公有云公共集群</p>
     * @param SourceHsmClusterId <p>同步的原始集群，如果为空，是公有云公共集群</p>
     */
    public void setSourceHsmClusterId(String SourceHsmClusterId) {
        this.SourceHsmClusterId = SourceHsmClusterId;
    }

    /**
     * Get <p>成员账号appId</p> 
     * @return AccountAppId <p>成员账号appId</p>
     */
    public Long getAccountAppId() {
        return this.AccountAppId;
    }

    /**
     * Set <p>成员账号appId</p>
     * @param AccountAppId <p>成员账号appId</p>
     */
    public void setAccountAppId(Long AccountAppId) {
        this.AccountAppId = AccountAppId;
    }

    /**
     * Get <p>成员账号uin</p> 
     * @return AccountUin <p>成员账号uin</p>
     */
    public Long getAccountUin() {
        return this.AccountUin;
    }

    /**
     * Set <p>成员账号uin</p>
     * @param AccountUin <p>成员账号uin</p>
     */
    public void setAccountUin(Long AccountUin) {
        this.AccountUin = AccountUin;
    }

    /**
     * Get <p>成员账号名称</p> 
     * @return AccountName <p>成员账号名称</p>
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set <p>成员账号名称</p>
     * @param AccountName <p>成员账号名称</p>
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
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
        if (source.IsSyncReplica != null) {
            this.IsSyncReplica = new Long(source.IsSyncReplica);
        }
        if (source.SourceRegion != null) {
            this.SourceRegion = new String(source.SourceRegion);
        }
        if (source.SyncStatus != null) {
            this.SyncStatus = new Long(source.SyncStatus);
        }
        if (source.SyncMessages != null) {
            this.SyncMessages = new String(source.SyncMessages);
        }
        if (source.SyncStartTime != null) {
            this.SyncStartTime = new Long(source.SyncStartTime);
        }
        if (source.SyncEndTime != null) {
            this.SyncEndTime = new Long(source.SyncEndTime);
        }
        if (source.SourceHsmClusterId != null) {
            this.SourceHsmClusterId = new String(source.SourceHsmClusterId);
        }
        if (source.AccountAppId != null) {
            this.AccountAppId = new Long(source.AccountAppId);
        }
        if (source.AccountUin != null) {
            this.AccountUin = new Long(source.AccountUin);
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
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
        this.setParamSimple(map, prefix + "IsSyncReplica", this.IsSyncReplica);
        this.setParamSimple(map, prefix + "SourceRegion", this.SourceRegion);
        this.setParamSimple(map, prefix + "SyncStatus", this.SyncStatus);
        this.setParamSimple(map, prefix + "SyncMessages", this.SyncMessages);
        this.setParamSimple(map, prefix + "SyncStartTime", this.SyncStartTime);
        this.setParamSimple(map, prefix + "SyncEndTime", this.SyncEndTime);
        this.setParamSimple(map, prefix + "SourceHsmClusterId", this.SourceHsmClusterId);
        this.setParamSimple(map, prefix + "AccountAppId", this.AccountAppId);
        this.setParamSimple(map, prefix + "AccountUin", this.AccountUin);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);

    }
}

