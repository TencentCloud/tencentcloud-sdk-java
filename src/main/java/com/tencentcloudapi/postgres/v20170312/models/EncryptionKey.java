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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EncryptionKey extends AbstractModel{

    /**
    * KMS实例加密的KeyId。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * KMS实例加密Key的别名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyAlias")
    @Expose
    private String KeyAlias;

    /**
    * 实例加密密钥DEK的密文。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DEKCipherTextBlob")
    @Expose
    private String DEKCipherTextBlob;

    /**
    * 密钥是否启用，1-启用， 0-未启用。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsEnabled")
    @Expose
    private Long IsEnabled;

    /**
    * KMS密钥所在地域。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyRegion")
    @Expose
    private String KeyRegion;

    /**
    * DEK密钥创建时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get KMS实例加密的KeyId。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyId KMS实例加密的KeyId。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set KMS实例加密的KeyId。
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyId KMS实例加密的KeyId。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get KMS实例加密Key的别名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyAlias KMS实例加密Key的别名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKeyAlias() {
        return this.KeyAlias;
    }

    /**
     * Set KMS实例加密Key的别名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyAlias KMS实例加密Key的别名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyAlias(String KeyAlias) {
        this.KeyAlias = KeyAlias;
    }

    /**
     * Get 实例加密密钥DEK的密文。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DEKCipherTextBlob 实例加密密钥DEK的密文。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDEKCipherTextBlob() {
        return this.DEKCipherTextBlob;
    }

    /**
     * Set 实例加密密钥DEK的密文。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DEKCipherTextBlob 实例加密密钥DEK的密文。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDEKCipherTextBlob(String DEKCipherTextBlob) {
        this.DEKCipherTextBlob = DEKCipherTextBlob;
    }

    /**
     * Get 密钥是否启用，1-启用， 0-未启用。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsEnabled 密钥是否启用，1-启用， 0-未启用。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set 密钥是否启用，1-启用， 0-未启用。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsEnabled 密钥是否启用，1-启用， 0-未启用。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsEnabled(Long IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    /**
     * Get KMS密钥所在地域。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyRegion KMS密钥所在地域。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKeyRegion() {
        return this.KeyRegion;
    }

    /**
     * Set KMS密钥所在地域。
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyRegion KMS密钥所在地域。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyRegion(String KeyRegion) {
        this.KeyRegion = KeyRegion;
    }

    /**
     * Get DEK密钥创建时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime DEK密钥创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set DEK密钥创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime DEK密钥创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public EncryptionKey() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EncryptionKey(EncryptionKey source) {
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.KeyAlias != null) {
            this.KeyAlias = new String(source.KeyAlias);
        }
        if (source.DEKCipherTextBlob != null) {
            this.DEKCipherTextBlob = new String(source.DEKCipherTextBlob);
        }
        if (source.IsEnabled != null) {
            this.IsEnabled = new Long(source.IsEnabled);
        }
        if (source.KeyRegion != null) {
            this.KeyRegion = new String(source.KeyRegion);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "KeyAlias", this.KeyAlias);
        this.setParamSimple(map, prefix + "DEKCipherTextBlob", this.DEKCipherTextBlob);
        this.setParamSimple(map, prefix + "IsEnabled", this.IsEnabled);
        this.setParamSimple(map, prefix + "KeyRegion", this.KeyRegion);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

