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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SSMCreateAccountInfos extends AbstractModel {

    /**
    * <p>是否开启SSM托管</p><p>枚举值：</p><ul><li>true： 开启托管</li><li>false： 不开启托管</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsOpenSSM")
    @Expose
    private Boolean IsOpenSSM;

    /**
    * <p>是否创建轮转账号</p><p>枚举值：</p><ul><li>true： 创建轮转账号</li><li>false： 创建非轮转账号</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsRotationAccount")
    @Expose
    private Boolean IsRotationAccount;

    /**
    * <p>凭据名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * <p>KMS CMK ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KmsKeyId")
    @Expose
    private String KmsKeyId;

    /**
    * <p>密钥类型</p><p>枚举值：</p><ul><li>0： KMS密码</li><li>1： 软件密钥</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EncryptType")
    @Expose
    private Long EncryptType;

    /**
    * <p>是否开启轮转</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableRotation")
    @Expose
    private Boolean EnableRotation;

    /**
    * <p>轮转周期</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RotationFrequency")
    @Expose
    private Long RotationFrequency;

    /**
    * <p>权限列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrivilegesList")
    @Expose
    private PrivilegeGroup PrivilegesList;

    /**
    * <p>独享版 KMS 集群 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KmsHsmClusterId")
    @Expose
    private String KmsHsmClusterId;

    /**
     * Get <p>是否开启SSM托管</p><p>枚举值：</p><ul><li>true： 开启托管</li><li>false： 不开启托管</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsOpenSSM <p>是否开启SSM托管</p><p>枚举值：</p><ul><li>true： 开启托管</li><li>false： 不开启托管</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsOpenSSM() {
        return this.IsOpenSSM;
    }

    /**
     * Set <p>是否开启SSM托管</p><p>枚举值：</p><ul><li>true： 开启托管</li><li>false： 不开启托管</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsOpenSSM <p>是否开启SSM托管</p><p>枚举值：</p><ul><li>true： 开启托管</li><li>false： 不开启托管</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsOpenSSM(Boolean IsOpenSSM) {
        this.IsOpenSSM = IsOpenSSM;
    }

    /**
     * Get <p>是否创建轮转账号</p><p>枚举值：</p><ul><li>true： 创建轮转账号</li><li>false： 创建非轮转账号</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsRotationAccount <p>是否创建轮转账号</p><p>枚举值：</p><ul><li>true： 创建轮转账号</li><li>false： 创建非轮转账号</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsRotationAccount() {
        return this.IsRotationAccount;
    }

    /**
     * Set <p>是否创建轮转账号</p><p>枚举值：</p><ul><li>true： 创建轮转账号</li><li>false： 创建非轮转账号</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsRotationAccount <p>是否创建轮转账号</p><p>枚举值：</p><ul><li>true： 创建轮转账号</li><li>false： 创建非轮转账号</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsRotationAccount(Boolean IsRotationAccount) {
        this.IsRotationAccount = IsRotationAccount;
    }

    /**
     * Get <p>凭据名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecretName <p>凭据名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set <p>凭据名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecretName <p>凭据名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get <p>KMS CMK ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KmsKeyId <p>KMS CMK ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKmsKeyId() {
        return this.KmsKeyId;
    }

    /**
     * Set <p>KMS CMK ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param KmsKeyId <p>KMS CMK ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKmsKeyId(String KmsKeyId) {
        this.KmsKeyId = KmsKeyId;
    }

    /**
     * Get <p>密钥类型</p><p>枚举值：</p><ul><li>0： KMS密码</li><li>1： 软件密钥</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EncryptType <p>密钥类型</p><p>枚举值：</p><ul><li>0： KMS密码</li><li>1： 软件密钥</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEncryptType() {
        return this.EncryptType;
    }

    /**
     * Set <p>密钥类型</p><p>枚举值：</p><ul><li>0： KMS密码</li><li>1： 软件密钥</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EncryptType <p>密钥类型</p><p>枚举值：</p><ul><li>0： KMS密码</li><li>1： 软件密钥</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEncryptType(Long EncryptType) {
        this.EncryptType = EncryptType;
    }

    /**
     * Get <p>是否开启轮转</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableRotation <p>是否开启轮转</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableRotation() {
        return this.EnableRotation;
    }

    /**
     * Set <p>是否开启轮转</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableRotation <p>是否开启轮转</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableRotation(Boolean EnableRotation) {
        this.EnableRotation = EnableRotation;
    }

    /**
     * Get <p>轮转周期</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RotationFrequency <p>轮转周期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRotationFrequency() {
        return this.RotationFrequency;
    }

    /**
     * Set <p>轮转周期</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RotationFrequency <p>轮转周期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRotationFrequency(Long RotationFrequency) {
        this.RotationFrequency = RotationFrequency;
    }

    /**
     * Get <p>权限列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrivilegesList <p>权限列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrivilegeGroup getPrivilegesList() {
        return this.PrivilegesList;
    }

    /**
     * Set <p>权限列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrivilegesList <p>权限列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivilegesList(PrivilegeGroup PrivilegesList) {
        this.PrivilegesList = PrivilegesList;
    }

    /**
     * Get <p>独享版 KMS 集群 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KmsHsmClusterId <p>独享版 KMS 集群 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKmsHsmClusterId() {
        return this.KmsHsmClusterId;
    }

    /**
     * Set <p>独享版 KMS 集群 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param KmsHsmClusterId <p>独享版 KMS 集群 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKmsHsmClusterId(String KmsHsmClusterId) {
        this.KmsHsmClusterId = KmsHsmClusterId;
    }

    public SSMCreateAccountInfos() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SSMCreateAccountInfos(SSMCreateAccountInfos source) {
        if (source.IsOpenSSM != null) {
            this.IsOpenSSM = new Boolean(source.IsOpenSSM);
        }
        if (source.IsRotationAccount != null) {
            this.IsRotationAccount = new Boolean(source.IsRotationAccount);
        }
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
        if (source.KmsKeyId != null) {
            this.KmsKeyId = new String(source.KmsKeyId);
        }
        if (source.EncryptType != null) {
            this.EncryptType = new Long(source.EncryptType);
        }
        if (source.EnableRotation != null) {
            this.EnableRotation = new Boolean(source.EnableRotation);
        }
        if (source.RotationFrequency != null) {
            this.RotationFrequency = new Long(source.RotationFrequency);
        }
        if (source.PrivilegesList != null) {
            this.PrivilegesList = new PrivilegeGroup(source.PrivilegesList);
        }
        if (source.KmsHsmClusterId != null) {
            this.KmsHsmClusterId = new String(source.KmsHsmClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsOpenSSM", this.IsOpenSSM);
        this.setParamSimple(map, prefix + "IsRotationAccount", this.IsRotationAccount);
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "KmsKeyId", this.KmsKeyId);
        this.setParamSimple(map, prefix + "EncryptType", this.EncryptType);
        this.setParamSimple(map, prefix + "EnableRotation", this.EnableRotation);
        this.setParamSimple(map, prefix + "RotationFrequency", this.RotationFrequency);
        this.setParamObj(map, prefix + "PrivilegesList.", this.PrivilegesList);
        this.setParamSimple(map, prefix + "KmsHsmClusterId", this.KmsHsmClusterId);

    }
}

