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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecretMetadata extends AbstractModel {

    /**
    * <p>凭据名称</p>
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * <p>凭据的描述信息</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>用于加密凭据的KMS KeyId</p>
    */
    @SerializedName("KmsKeyId")
    @Expose
    private String KmsKeyId;

    /**
    * <p>创建者UIN</p>
    */
    @SerializedName("CreateUin")
    @Expose
    private Long CreateUin;

    /**
    * <p>凭据状态：Enabled、Disabled、PendingDelete、Creating、Failed</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>凭据删除日期，对于status为PendingDelete 的有效，unix时间戳</p>
    */
    @SerializedName("DeleteTime")
    @Expose
    private Long DeleteTime;

    /**
    * <p>凭据创建时间，unix时间戳</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>用于加密凭据的KMS CMK类型，DEFAULT 表示SecretsManager 创建的默认密钥， CUSTOMER 表示用户指定的密钥</p>
    */
    @SerializedName("KmsKeyType")
    @Expose
    private String KmsKeyType;

    /**
    * <p>1:--开启轮转；0--禁止轮转</p>
    */
    @SerializedName("RotationStatus")
    @Expose
    private Long RotationStatus;

    /**
    * <p>下一次轮转开始时间，uinx 时间戳</p>
    */
    @SerializedName("NextRotationTime")
    @Expose
    private Long NextRotationTime;

    /**
    * <p>0 -- 用户自定义凭据；<br>1 -- 云产品凭据；<br>2 -- SSH密钥对凭据；<br>3 -- 云API密钥对凭据；<br>4 -- Redis类型凭据；</p>
    */
    @SerializedName("SecretType")
    @Expose
    private Long SecretType;

    /**
    * <p>云产品名称，仅在SecretType为1，即凭据类型为云产品凭据时生效</p>
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * <p>当凭据类型为SSH密钥对凭据时，此字段有效，用于表示SSH密钥对凭据的名称。</p>
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * <p>当凭据类型为SSH密钥对凭据时，此字段有效，用于表示SSH密钥对所属的项目ID。</p>
    */
    @SerializedName("ProjectID")
    @Expose
    private Long ProjectID;

    /**
    * <p>当凭据类型为SSH密钥对凭据时，此字段有效，用于表示SSH密钥对所关联的CVM实例ID。</p>
    */
    @SerializedName("AssociatedInstanceIDs")
    @Expose
    private String [] AssociatedInstanceIDs;

    /**
    * <p>当凭据类型为云API密钥对凭据时，此字段有效，用于表示云API密钥对所属的用户UIN。</p>
    */
    @SerializedName("TargetUin")
    @Expose
    private Long TargetUin;

    /**
    * <p>轮转的频率，以天作为单位，在轮转开启状态下生效。</p>
    */
    @SerializedName("RotationFrequency")
    @Expose
    private Long RotationFrequency;

    /**
    * <p>云产品凭据对应的云产品实例 ID 号。</p>
    */
    @SerializedName("ResourceID")
    @Expose
    private String ResourceID;

    /**
    * <p>用户指定的轮转开始时间。</p>
    */
    @SerializedName("RotationBeginTime")
    @Expose
    private String RotationBeginTime;

    /**
    * <p>凭据加密类型</p><p>枚举值：</p><ul><li>0： KMS 密钥加密</li><li>1： 软密钥加密</li></ul><p>默认值：0</p>
    */
    @SerializedName("EncryptType")
    @Expose
    private Long EncryptType;

    /**
    * <p>凭据密钥加密切换中</p>
    */
    @SerializedName("EncryptSwitching")
    @Expose
    private Boolean EncryptSwitching;

    /**
     * Get <p>凭据名称</p> 
     * @return SecretName <p>凭据名称</p>
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set <p>凭据名称</p>
     * @param SecretName <p>凭据名称</p>
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get <p>凭据的描述信息</p> 
     * @return Description <p>凭据的描述信息</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>凭据的描述信息</p>
     * @param Description <p>凭据的描述信息</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>用于加密凭据的KMS KeyId</p> 
     * @return KmsKeyId <p>用于加密凭据的KMS KeyId</p>
     */
    public String getKmsKeyId() {
        return this.KmsKeyId;
    }

    /**
     * Set <p>用于加密凭据的KMS KeyId</p>
     * @param KmsKeyId <p>用于加密凭据的KMS KeyId</p>
     */
    public void setKmsKeyId(String KmsKeyId) {
        this.KmsKeyId = KmsKeyId;
    }

    /**
     * Get <p>创建者UIN</p> 
     * @return CreateUin <p>创建者UIN</p>
     */
    public Long getCreateUin() {
        return this.CreateUin;
    }

    /**
     * Set <p>创建者UIN</p>
     * @param CreateUin <p>创建者UIN</p>
     */
    public void setCreateUin(Long CreateUin) {
        this.CreateUin = CreateUin;
    }

    /**
     * Get <p>凭据状态：Enabled、Disabled、PendingDelete、Creating、Failed</p> 
     * @return Status <p>凭据状态：Enabled、Disabled、PendingDelete、Creating、Failed</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>凭据状态：Enabled、Disabled、PendingDelete、Creating、Failed</p>
     * @param Status <p>凭据状态：Enabled、Disabled、PendingDelete、Creating、Failed</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>凭据删除日期，对于status为PendingDelete 的有效，unix时间戳</p> 
     * @return DeleteTime <p>凭据删除日期，对于status为PendingDelete 的有效，unix时间戳</p>
     */
    public Long getDeleteTime() {
        return this.DeleteTime;
    }

    /**
     * Set <p>凭据删除日期，对于status为PendingDelete 的有效，unix时间戳</p>
     * @param DeleteTime <p>凭据删除日期，对于status为PendingDelete 的有效，unix时间戳</p>
     */
    public void setDeleteTime(Long DeleteTime) {
        this.DeleteTime = DeleteTime;
    }

    /**
     * Get <p>凭据创建时间，unix时间戳</p> 
     * @return CreateTime <p>凭据创建时间，unix时间戳</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>凭据创建时间，unix时间戳</p>
     * @param CreateTime <p>凭据创建时间，unix时间戳</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>用于加密凭据的KMS CMK类型，DEFAULT 表示SecretsManager 创建的默认密钥， CUSTOMER 表示用户指定的密钥</p> 
     * @return KmsKeyType <p>用于加密凭据的KMS CMK类型，DEFAULT 表示SecretsManager 创建的默认密钥， CUSTOMER 表示用户指定的密钥</p>
     */
    public String getKmsKeyType() {
        return this.KmsKeyType;
    }

    /**
     * Set <p>用于加密凭据的KMS CMK类型，DEFAULT 表示SecretsManager 创建的默认密钥， CUSTOMER 表示用户指定的密钥</p>
     * @param KmsKeyType <p>用于加密凭据的KMS CMK类型，DEFAULT 表示SecretsManager 创建的默认密钥， CUSTOMER 表示用户指定的密钥</p>
     */
    public void setKmsKeyType(String KmsKeyType) {
        this.KmsKeyType = KmsKeyType;
    }

    /**
     * Get <p>1:--开启轮转；0--禁止轮转</p> 
     * @return RotationStatus <p>1:--开启轮转；0--禁止轮转</p>
     */
    public Long getRotationStatus() {
        return this.RotationStatus;
    }

    /**
     * Set <p>1:--开启轮转；0--禁止轮转</p>
     * @param RotationStatus <p>1:--开启轮转；0--禁止轮转</p>
     */
    public void setRotationStatus(Long RotationStatus) {
        this.RotationStatus = RotationStatus;
    }

    /**
     * Get <p>下一次轮转开始时间，uinx 时间戳</p> 
     * @return NextRotationTime <p>下一次轮转开始时间，uinx 时间戳</p>
     */
    public Long getNextRotationTime() {
        return this.NextRotationTime;
    }

    /**
     * Set <p>下一次轮转开始时间，uinx 时间戳</p>
     * @param NextRotationTime <p>下一次轮转开始时间，uinx 时间戳</p>
     */
    public void setNextRotationTime(Long NextRotationTime) {
        this.NextRotationTime = NextRotationTime;
    }

    /**
     * Get <p>0 -- 用户自定义凭据；<br>1 -- 云产品凭据；<br>2 -- SSH密钥对凭据；<br>3 -- 云API密钥对凭据；<br>4 -- Redis类型凭据；</p> 
     * @return SecretType <p>0 -- 用户自定义凭据；<br>1 -- 云产品凭据；<br>2 -- SSH密钥对凭据；<br>3 -- 云API密钥对凭据；<br>4 -- Redis类型凭据；</p>
     */
    public Long getSecretType() {
        return this.SecretType;
    }

    /**
     * Set <p>0 -- 用户自定义凭据；<br>1 -- 云产品凭据；<br>2 -- SSH密钥对凭据；<br>3 -- 云API密钥对凭据；<br>4 -- Redis类型凭据；</p>
     * @param SecretType <p>0 -- 用户自定义凭据；<br>1 -- 云产品凭据；<br>2 -- SSH密钥对凭据；<br>3 -- 云API密钥对凭据；<br>4 -- Redis类型凭据；</p>
     */
    public void setSecretType(Long SecretType) {
        this.SecretType = SecretType;
    }

    /**
     * Get <p>云产品名称，仅在SecretType为1，即凭据类型为云产品凭据时生效</p> 
     * @return ProductName <p>云产品名称，仅在SecretType为1，即凭据类型为云产品凭据时生效</p>
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set <p>云产品名称，仅在SecretType为1，即凭据类型为云产品凭据时生效</p>
     * @param ProductName <p>云产品名称，仅在SecretType为1，即凭据类型为云产品凭据时生效</p>
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get <p>当凭据类型为SSH密钥对凭据时，此字段有效，用于表示SSH密钥对凭据的名称。</p> 
     * @return ResourceName <p>当凭据类型为SSH密钥对凭据时，此字段有效，用于表示SSH密钥对凭据的名称。</p>
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set <p>当凭据类型为SSH密钥对凭据时，此字段有效，用于表示SSH密钥对凭据的名称。</p>
     * @param ResourceName <p>当凭据类型为SSH密钥对凭据时，此字段有效，用于表示SSH密钥对凭据的名称。</p>
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get <p>当凭据类型为SSH密钥对凭据时，此字段有效，用于表示SSH密钥对所属的项目ID。</p> 
     * @return ProjectID <p>当凭据类型为SSH密钥对凭据时，此字段有效，用于表示SSH密钥对所属的项目ID。</p>
     */
    public Long getProjectID() {
        return this.ProjectID;
    }

    /**
     * Set <p>当凭据类型为SSH密钥对凭据时，此字段有效，用于表示SSH密钥对所属的项目ID。</p>
     * @param ProjectID <p>当凭据类型为SSH密钥对凭据时，此字段有效，用于表示SSH密钥对所属的项目ID。</p>
     */
    public void setProjectID(Long ProjectID) {
        this.ProjectID = ProjectID;
    }

    /**
     * Get <p>当凭据类型为SSH密钥对凭据时，此字段有效，用于表示SSH密钥对所关联的CVM实例ID。</p> 
     * @return AssociatedInstanceIDs <p>当凭据类型为SSH密钥对凭据时，此字段有效，用于表示SSH密钥对所关联的CVM实例ID。</p>
     */
    public String [] getAssociatedInstanceIDs() {
        return this.AssociatedInstanceIDs;
    }

    /**
     * Set <p>当凭据类型为SSH密钥对凭据时，此字段有效，用于表示SSH密钥对所关联的CVM实例ID。</p>
     * @param AssociatedInstanceIDs <p>当凭据类型为SSH密钥对凭据时，此字段有效，用于表示SSH密钥对所关联的CVM实例ID。</p>
     */
    public void setAssociatedInstanceIDs(String [] AssociatedInstanceIDs) {
        this.AssociatedInstanceIDs = AssociatedInstanceIDs;
    }

    /**
     * Get <p>当凭据类型为云API密钥对凭据时，此字段有效，用于表示云API密钥对所属的用户UIN。</p> 
     * @return TargetUin <p>当凭据类型为云API密钥对凭据时，此字段有效，用于表示云API密钥对所属的用户UIN。</p>
     */
    public Long getTargetUin() {
        return this.TargetUin;
    }

    /**
     * Set <p>当凭据类型为云API密钥对凭据时，此字段有效，用于表示云API密钥对所属的用户UIN。</p>
     * @param TargetUin <p>当凭据类型为云API密钥对凭据时，此字段有效，用于表示云API密钥对所属的用户UIN。</p>
     */
    public void setTargetUin(Long TargetUin) {
        this.TargetUin = TargetUin;
    }

    /**
     * Get <p>轮转的频率，以天作为单位，在轮转开启状态下生效。</p> 
     * @return RotationFrequency <p>轮转的频率，以天作为单位，在轮转开启状态下生效。</p>
     */
    public Long getRotationFrequency() {
        return this.RotationFrequency;
    }

    /**
     * Set <p>轮转的频率，以天作为单位，在轮转开启状态下生效。</p>
     * @param RotationFrequency <p>轮转的频率，以天作为单位，在轮转开启状态下生效。</p>
     */
    public void setRotationFrequency(Long RotationFrequency) {
        this.RotationFrequency = RotationFrequency;
    }

    /**
     * Get <p>云产品凭据对应的云产品实例 ID 号。</p> 
     * @return ResourceID <p>云产品凭据对应的云产品实例 ID 号。</p>
     */
    public String getResourceID() {
        return this.ResourceID;
    }

    /**
     * Set <p>云产品凭据对应的云产品实例 ID 号。</p>
     * @param ResourceID <p>云产品凭据对应的云产品实例 ID 号。</p>
     */
    public void setResourceID(String ResourceID) {
        this.ResourceID = ResourceID;
    }

    /**
     * Get <p>用户指定的轮转开始时间。</p> 
     * @return RotationBeginTime <p>用户指定的轮转开始时间。</p>
     */
    public String getRotationBeginTime() {
        return this.RotationBeginTime;
    }

    /**
     * Set <p>用户指定的轮转开始时间。</p>
     * @param RotationBeginTime <p>用户指定的轮转开始时间。</p>
     */
    public void setRotationBeginTime(String RotationBeginTime) {
        this.RotationBeginTime = RotationBeginTime;
    }

    /**
     * Get <p>凭据加密类型</p><p>枚举值：</p><ul><li>0： KMS 密钥加密</li><li>1： 软密钥加密</li></ul><p>默认值：0</p> 
     * @return EncryptType <p>凭据加密类型</p><p>枚举值：</p><ul><li>0： KMS 密钥加密</li><li>1： 软密钥加密</li></ul><p>默认值：0</p>
     */
    public Long getEncryptType() {
        return this.EncryptType;
    }

    /**
     * Set <p>凭据加密类型</p><p>枚举值：</p><ul><li>0： KMS 密钥加密</li><li>1： 软密钥加密</li></ul><p>默认值：0</p>
     * @param EncryptType <p>凭据加密类型</p><p>枚举值：</p><ul><li>0： KMS 密钥加密</li><li>1： 软密钥加密</li></ul><p>默认值：0</p>
     */
    public void setEncryptType(Long EncryptType) {
        this.EncryptType = EncryptType;
    }

    /**
     * Get <p>凭据密钥加密切换中</p> 
     * @return EncryptSwitching <p>凭据密钥加密切换中</p>
     */
    public Boolean getEncryptSwitching() {
        return this.EncryptSwitching;
    }

    /**
     * Set <p>凭据密钥加密切换中</p>
     * @param EncryptSwitching <p>凭据密钥加密切换中</p>
     */
    public void setEncryptSwitching(Boolean EncryptSwitching) {
        this.EncryptSwitching = EncryptSwitching;
    }

    public SecretMetadata() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecretMetadata(SecretMetadata source) {
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.KmsKeyId != null) {
            this.KmsKeyId = new String(source.KmsKeyId);
        }
        if (source.CreateUin != null) {
            this.CreateUin = new Long(source.CreateUin);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.DeleteTime != null) {
            this.DeleteTime = new Long(source.DeleteTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.KmsKeyType != null) {
            this.KmsKeyType = new String(source.KmsKeyType);
        }
        if (source.RotationStatus != null) {
            this.RotationStatus = new Long(source.RotationStatus);
        }
        if (source.NextRotationTime != null) {
            this.NextRotationTime = new Long(source.NextRotationTime);
        }
        if (source.SecretType != null) {
            this.SecretType = new Long(source.SecretType);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.ProjectID != null) {
            this.ProjectID = new Long(source.ProjectID);
        }
        if (source.AssociatedInstanceIDs != null) {
            this.AssociatedInstanceIDs = new String[source.AssociatedInstanceIDs.length];
            for (int i = 0; i < source.AssociatedInstanceIDs.length; i++) {
                this.AssociatedInstanceIDs[i] = new String(source.AssociatedInstanceIDs[i]);
            }
        }
        if (source.TargetUin != null) {
            this.TargetUin = new Long(source.TargetUin);
        }
        if (source.RotationFrequency != null) {
            this.RotationFrequency = new Long(source.RotationFrequency);
        }
        if (source.ResourceID != null) {
            this.ResourceID = new String(source.ResourceID);
        }
        if (source.RotationBeginTime != null) {
            this.RotationBeginTime = new String(source.RotationBeginTime);
        }
        if (source.EncryptType != null) {
            this.EncryptType = new Long(source.EncryptType);
        }
        if (source.EncryptSwitching != null) {
            this.EncryptSwitching = new Boolean(source.EncryptSwitching);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "KmsKeyId", this.KmsKeyId);
        this.setParamSimple(map, prefix + "CreateUin", this.CreateUin);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DeleteTime", this.DeleteTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "KmsKeyType", this.KmsKeyType);
        this.setParamSimple(map, prefix + "RotationStatus", this.RotationStatus);
        this.setParamSimple(map, prefix + "NextRotationTime", this.NextRotationTime);
        this.setParamSimple(map, prefix + "SecretType", this.SecretType);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "ProjectID", this.ProjectID);
        this.setParamArraySimple(map, prefix + "AssociatedInstanceIDs.", this.AssociatedInstanceIDs);
        this.setParamSimple(map, prefix + "TargetUin", this.TargetUin);
        this.setParamSimple(map, prefix + "RotationFrequency", this.RotationFrequency);
        this.setParamSimple(map, prefix + "ResourceID", this.ResourceID);
        this.setParamSimple(map, prefix + "RotationBeginTime", this.RotationBeginTime);
        this.setParamSimple(map, prefix + "EncryptType", this.EncryptType);
        this.setParamSimple(map, prefix + "EncryptSwitching", this.EncryptSwitching);

    }
}

