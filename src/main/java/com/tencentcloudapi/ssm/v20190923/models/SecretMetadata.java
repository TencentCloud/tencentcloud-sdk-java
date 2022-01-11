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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecretMetadata extends AbstractModel{

    /**
    * 凭据名称
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * 凭据的描述信息
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 用于加密凭据的KMS KeyId
    */
    @SerializedName("KmsKeyId")
    @Expose
    private String KmsKeyId;

    /**
    * 创建者UIN
    */
    @SerializedName("CreateUin")
    @Expose
    private Long CreateUin;

    /**
    * 凭据状态：Enabled、Disabled、PendingDelete、Creating、Failed
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 凭据删除日期，对于status为PendingDelete 的有效，unix时间戳
    */
    @SerializedName("DeleteTime")
    @Expose
    private Long DeleteTime;

    /**
    * 凭据创建时间，unix时间戳
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 用于加密凭据的KMS CMK类型，DEFAULT 表示SecretsManager 创建的默认密钥， CUSTOMER 表示用户指定的密钥
    */
    @SerializedName("KmsKeyType")
    @Expose
    private String KmsKeyType;

    /**
    * 1:--开启轮转；0--禁止轮转
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RotationStatus")
    @Expose
    private Long RotationStatus;

    /**
    * 下一次轮转开始时间，uinx 时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NextRotationTime")
    @Expose
    private Long NextRotationTime;

    /**
    * 0 -- 用户自定义凭据；
1 -- 云产品凭据；
2 -- SSH密钥对凭据；
3 -- 云API密钥对凭据；
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecretType")
    @Expose
    private Long SecretType;

    /**
    * 云产品名称，仅在SecretType为1，即凭据类型为云产品凭据时生效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 当凭据类型为SSH密钥对凭据时，此字段有效，用于表示SSH密钥对凭据的名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 当凭据类型为SSH密钥对凭据时，此字段有效，用于表示SSH密钥对所属的项目ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectID")
    @Expose
    private Long ProjectID;

    /**
    * 当凭据类型为SSH密钥对凭据时，此字段有效，用于表示SSH密钥对所关联的CVM实例ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssociatedInstanceIDs")
    @Expose
    private String [] AssociatedInstanceIDs;

    /**
    * 当凭据类型为云API密钥对凭据时，此字段有效，用于表示云API密钥对所属的用户UIN。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetUin")
    @Expose
    private Long TargetUin;

    /**
     * Get 凭据名称 
     * @return SecretName 凭据名称
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set 凭据名称
     * @param SecretName 凭据名称
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get 凭据的描述信息 
     * @return Description 凭据的描述信息
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 凭据的描述信息
     * @param Description 凭据的描述信息
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 用于加密凭据的KMS KeyId 
     * @return KmsKeyId 用于加密凭据的KMS KeyId
     */
    public String getKmsKeyId() {
        return this.KmsKeyId;
    }

    /**
     * Set 用于加密凭据的KMS KeyId
     * @param KmsKeyId 用于加密凭据的KMS KeyId
     */
    public void setKmsKeyId(String KmsKeyId) {
        this.KmsKeyId = KmsKeyId;
    }

    /**
     * Get 创建者UIN 
     * @return CreateUin 创建者UIN
     */
    public Long getCreateUin() {
        return this.CreateUin;
    }

    /**
     * Set 创建者UIN
     * @param CreateUin 创建者UIN
     */
    public void setCreateUin(Long CreateUin) {
        this.CreateUin = CreateUin;
    }

    /**
     * Get 凭据状态：Enabled、Disabled、PendingDelete、Creating、Failed 
     * @return Status 凭据状态：Enabled、Disabled、PendingDelete、Creating、Failed
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 凭据状态：Enabled、Disabled、PendingDelete、Creating、Failed
     * @param Status 凭据状态：Enabled、Disabled、PendingDelete、Creating、Failed
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 凭据删除日期，对于status为PendingDelete 的有效，unix时间戳 
     * @return DeleteTime 凭据删除日期，对于status为PendingDelete 的有效，unix时间戳
     */
    public Long getDeleteTime() {
        return this.DeleteTime;
    }

    /**
     * Set 凭据删除日期，对于status为PendingDelete 的有效，unix时间戳
     * @param DeleteTime 凭据删除日期，对于status为PendingDelete 的有效，unix时间戳
     */
    public void setDeleteTime(Long DeleteTime) {
        this.DeleteTime = DeleteTime;
    }

    /**
     * Get 凭据创建时间，unix时间戳 
     * @return CreateTime 凭据创建时间，unix时间戳
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 凭据创建时间，unix时间戳
     * @param CreateTime 凭据创建时间，unix时间戳
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 用于加密凭据的KMS CMK类型，DEFAULT 表示SecretsManager 创建的默认密钥， CUSTOMER 表示用户指定的密钥 
     * @return KmsKeyType 用于加密凭据的KMS CMK类型，DEFAULT 表示SecretsManager 创建的默认密钥， CUSTOMER 表示用户指定的密钥
     */
    public String getKmsKeyType() {
        return this.KmsKeyType;
    }

    /**
     * Set 用于加密凭据的KMS CMK类型，DEFAULT 表示SecretsManager 创建的默认密钥， CUSTOMER 表示用户指定的密钥
     * @param KmsKeyType 用于加密凭据的KMS CMK类型，DEFAULT 表示SecretsManager 创建的默认密钥， CUSTOMER 表示用户指定的密钥
     */
    public void setKmsKeyType(String KmsKeyType) {
        this.KmsKeyType = KmsKeyType;
    }

    /**
     * Get 1:--开启轮转；0--禁止轮转
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RotationStatus 1:--开启轮转；0--禁止轮转
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRotationStatus() {
        return this.RotationStatus;
    }

    /**
     * Set 1:--开启轮转；0--禁止轮转
注意：此字段可能返回 null，表示取不到有效值。
     * @param RotationStatus 1:--开启轮转；0--禁止轮转
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRotationStatus(Long RotationStatus) {
        this.RotationStatus = RotationStatus;
    }

    /**
     * Get 下一次轮转开始时间，uinx 时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NextRotationTime 下一次轮转开始时间，uinx 时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNextRotationTime() {
        return this.NextRotationTime;
    }

    /**
     * Set 下一次轮转开始时间，uinx 时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param NextRotationTime 下一次轮转开始时间，uinx 时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNextRotationTime(Long NextRotationTime) {
        this.NextRotationTime = NextRotationTime;
    }

    /**
     * Get 0 -- 用户自定义凭据；
1 -- 云产品凭据；
2 -- SSH密钥对凭据；
3 -- 云API密钥对凭据；
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecretType 0 -- 用户自定义凭据；
1 -- 云产品凭据；
2 -- SSH密钥对凭据；
3 -- 云API密钥对凭据；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSecretType() {
        return this.SecretType;
    }

    /**
     * Set 0 -- 用户自定义凭据；
1 -- 云产品凭据；
2 -- SSH密钥对凭据；
3 -- 云API密钥对凭据；
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecretType 0 -- 用户自定义凭据；
1 -- 云产品凭据；
2 -- SSH密钥对凭据；
3 -- 云API密钥对凭据；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecretType(Long SecretType) {
        this.SecretType = SecretType;
    }

    /**
     * Get 云产品名称，仅在SecretType为1，即凭据类型为云产品凭据时生效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductName 云产品名称，仅在SecretType为1，即凭据类型为云产品凭据时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 云产品名称，仅在SecretType为1，即凭据类型为云产品凭据时生效
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductName 云产品名称，仅在SecretType为1，即凭据类型为云产品凭据时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 当凭据类型为SSH密钥对凭据时，此字段有效，用于表示SSH密钥对凭据的名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceName 当凭据类型为SSH密钥对凭据时，此字段有效，用于表示SSH密钥对凭据的名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 当凭据类型为SSH密钥对凭据时，此字段有效，用于表示SSH密钥对凭据的名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceName 当凭据类型为SSH密钥对凭据时，此字段有效，用于表示SSH密钥对凭据的名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get 当凭据类型为SSH密钥对凭据时，此字段有效，用于表示SSH密钥对所属的项目ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectID 当凭据类型为SSH密钥对凭据时，此字段有效，用于表示SSH密钥对所属的项目ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProjectID() {
        return this.ProjectID;
    }

    /**
     * Set 当凭据类型为SSH密钥对凭据时，此字段有效，用于表示SSH密钥对所属的项目ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectID 当凭据类型为SSH密钥对凭据时，此字段有效，用于表示SSH密钥对所属的项目ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectID(Long ProjectID) {
        this.ProjectID = ProjectID;
    }

    /**
     * Get 当凭据类型为SSH密钥对凭据时，此字段有效，用于表示SSH密钥对所关联的CVM实例ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssociatedInstanceIDs 当凭据类型为SSH密钥对凭据时，此字段有效，用于表示SSH密钥对所关联的CVM实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAssociatedInstanceIDs() {
        return this.AssociatedInstanceIDs;
    }

    /**
     * Set 当凭据类型为SSH密钥对凭据时，此字段有效，用于表示SSH密钥对所关联的CVM实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssociatedInstanceIDs 当凭据类型为SSH密钥对凭据时，此字段有效，用于表示SSH密钥对所关联的CVM实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssociatedInstanceIDs(String [] AssociatedInstanceIDs) {
        this.AssociatedInstanceIDs = AssociatedInstanceIDs;
    }

    /**
     * Get 当凭据类型为云API密钥对凭据时，此字段有效，用于表示云API密钥对所属的用户UIN。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetUin 当凭据类型为云API密钥对凭据时，此字段有效，用于表示云API密钥对所属的用户UIN。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTargetUin() {
        return this.TargetUin;
    }

    /**
     * Set 当凭据类型为云API密钥对凭据时，此字段有效，用于表示云API密钥对所属的用户UIN。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetUin 当凭据类型为云API密钥对凭据时，此字段有效，用于表示云API密钥对所属的用户UIN。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetUin(Long TargetUin) {
        this.TargetUin = TargetUin;
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

    }
}

