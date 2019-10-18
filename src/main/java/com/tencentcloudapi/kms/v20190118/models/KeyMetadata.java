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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KeyMetadata  extends AbstractModel{

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
    * CMK的状态， 取值为：Enabled | Disabled | PendingDelete | PendingImport
    */
    @SerializedName("KeyState")
    @Expose
    private String KeyState;

    /**
    * CMK用途，当前是 ENCRYPT_DECRYPT
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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeletionDate")
    @Expose
    private Long DeletionDate;

    /**
    * CMK 密钥材料类型，由KMS创建的为： TENCENT_KMS， 由用户导入的类型为：EXTERNAL
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Origin")
    @Expose
    private String Origin;

    /**
    * 在Origin为  EXTERNAL 时有效，表示密钥材料的有效日期， 0 表示不过期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValidTo")
    @Expose
    private Long ValidTo;

    /**
     * 获取CMK的全局唯一标识
     * @return KeyId CMK的全局唯一标识
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * 设置CMK的全局唯一标识
     * @param KeyId CMK的全局唯一标识
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * 获取作为密钥更容易辨识，更容易被人看懂的别名
     * @return Alias 作为密钥更容易辨识，更容易被人看懂的别名
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * 设置作为密钥更容易辨识，更容易被人看懂的别名
     * @param Alias 作为密钥更容易辨识，更容易被人看懂的别名
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * 获取密钥创建时间
     * @return CreateTime 密钥创建时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置密钥创建时间
     * @param CreateTime 密钥创建时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取CMK的描述
     * @return Description CMK的描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置CMK的描述
     * @param Description CMK的描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 获取CMK的状态， 取值为：Enabled | Disabled | PendingDelete | PendingImport
     * @return KeyState CMK的状态， 取值为：Enabled | Disabled | PendingDelete | PendingImport
     */
    public String getKeyState() {
        return this.KeyState;
    }

    /**
     * 设置CMK的状态， 取值为：Enabled | Disabled | PendingDelete | PendingImport
     * @param KeyState CMK的状态， 取值为：Enabled | Disabled | PendingDelete | PendingImport
     */
    public void setKeyState(String KeyState) {
        this.KeyState = KeyState;
    }

    /**
     * 获取CMK用途，当前是 ENCRYPT_DECRYPT
     * @return KeyUsage CMK用途，当前是 ENCRYPT_DECRYPT
     */
    public String getKeyUsage() {
        return this.KeyUsage;
    }

    /**
     * 设置CMK用途，当前是 ENCRYPT_DECRYPT
     * @param KeyUsage CMK用途，当前是 ENCRYPT_DECRYPT
     */
    public void setKeyUsage(String KeyUsage) {
        this.KeyUsage = KeyUsage;
    }

    /**
     * 获取CMK类型，2 表示符合FIPS标准，4表示符合国密标准
     * @return Type CMK类型，2 表示符合FIPS标准，4表示符合国密标准
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * 设置CMK类型，2 表示符合FIPS标准，4表示符合国密标准
     * @param Type CMK类型，2 表示符合FIPS标准，4表示符合国密标准
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * 获取创建者
     * @return CreatorUin 创建者
     */
    public Long getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * 设置创建者
     * @param CreatorUin 创建者
     */
    public void setCreatorUin(Long CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * 获取是否开启了密钥轮换功能
     * @return KeyRotationEnabled 是否开启了密钥轮换功能
     */
    public Boolean getKeyRotationEnabled() {
        return this.KeyRotationEnabled;
    }

    /**
     * 设置是否开启了密钥轮换功能
     * @param KeyRotationEnabled 是否开启了密钥轮换功能
     */
    public void setKeyRotationEnabled(Boolean KeyRotationEnabled) {
        this.KeyRotationEnabled = KeyRotationEnabled;
    }

    /**
     * 获取CMK的创建者，用户创建的为 user，授权各云产品自动创建的为对应的产品名
     * @return Owner CMK的创建者，用户创建的为 user，授权各云产品自动创建的为对应的产品名
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * 设置CMK的创建者，用户创建的为 user，授权各云产品自动创建的为对应的产品名
     * @param Owner CMK的创建者，用户创建的为 user，授权各云产品自动创建的为对应的产品名
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * 获取在密钥轮换开启状态下，下次轮换的时间
     * @return NextRotateTime 在密钥轮换开启状态下，下次轮换的时间
     */
    public Long getNextRotateTime() {
        return this.NextRotateTime;
    }

    /**
     * 设置在密钥轮换开启状态下，下次轮换的时间
     * @param NextRotateTime 在密钥轮换开启状态下，下次轮换的时间
     */
    public void setNextRotateTime(Long NextRotateTime) {
        this.NextRotateTime = NextRotateTime;
    }

    /**
     * 获取计划删除的时间
注意：此字段可能返回 null，表示取不到有效值。
     * @return DeletionDate 计划删除的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDeletionDate() {
        return this.DeletionDate;
    }

    /**
     * 设置计划删除的时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeletionDate 计划删除的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeletionDate(Long DeletionDate) {
        this.DeletionDate = DeletionDate;
    }

    /**
     * 获取CMK 密钥材料类型，由KMS创建的为： TENCENT_KMS， 由用户导入的类型为：EXTERNAL
注意：此字段可能返回 null，表示取不到有效值。
     * @return Origin CMK 密钥材料类型，由KMS创建的为： TENCENT_KMS， 由用户导入的类型为：EXTERNAL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrigin() {
        return this.Origin;
    }

    /**
     * 设置CMK 密钥材料类型，由KMS创建的为： TENCENT_KMS， 由用户导入的类型为：EXTERNAL
注意：此字段可能返回 null，表示取不到有效值。
     * @param Origin CMK 密钥材料类型，由KMS创建的为： TENCENT_KMS， 由用户导入的类型为：EXTERNAL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    /**
     * 获取在Origin为  EXTERNAL 时有效，表示密钥材料的有效日期， 0 表示不过期
注意：此字段可能返回 null，表示取不到有效值。
     * @return ValidTo 在Origin为  EXTERNAL 时有效，表示密钥材料的有效日期， 0 表示不过期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getValidTo() {
        return this.ValidTo;
    }

    /**
     * 设置在Origin为  EXTERNAL 时有效，表示密钥材料的有效日期， 0 表示不过期
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValidTo 在Origin为  EXTERNAL 时有效，表示密钥材料的有效日期， 0 表示不过期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValidTo(Long ValidTo) {
        this.ValidTo = ValidTo;
    }

    /**
     * 内部实现，用户禁止调用
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

    }
}

