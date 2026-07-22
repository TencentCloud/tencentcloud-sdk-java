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

public class DescribeSecretResponse extends AbstractModel {

    /**
    * <p>凭据名称。</p>
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * <p>凭据描述信息。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>用于加密的KMS CMK ID。</p>
    */
    @SerializedName("KmsKeyId")
    @Expose
    private String KmsKeyId;

    /**
    * <p>创建者UIN。</p>
    */
    @SerializedName("CreateUin")
    @Expose
    private Long CreateUin;

    /**
    * <p>凭据状态：Enabled、Disabled、PendingDelete, Creating, Failed。</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>删除日期，uinx 时间戳，非计划删除状态的凭据为0。</p>
    */
    @SerializedName("DeleteTime")
    @Expose
    private Long DeleteTime;

    /**
    * <p>创建日期。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>0 --  用户自定义凭据类型；1 -- 数据库凭据类型；2 -- SSH密钥对凭据类型；3 -- 云API密钥（AKSK）凭据类型（使用此功能需要联系云助手单独开启白名单）；4 -- Redis类型凭据。</p>
    */
    @SerializedName("SecretType")
    @Expose
    private Long SecretType;

    /**
    * <p>云产品名称。</p>
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * <p>云产品实例ID。</p>
    */
    @SerializedName("ResourceID")
    @Expose
    private String ResourceID;

    /**
    * <p>是否开启轮转：True -- 开启轮转；False -- 关闭轮转。</p>
    */
    @SerializedName("RotationStatus")
    @Expose
    private Boolean RotationStatus;

    /**
    * <p>轮转周期，默认以天为单位。</p>
    */
    @SerializedName("RotationFrequency")
    @Expose
    private Long RotationFrequency;

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
    * <p>当凭据类型为云API密钥对凭据时，此字段有效，用于表示此云API密钥对所属的用户UIN。</p>
    */
    @SerializedName("TargetUin")
    @Expose
    private Long TargetUin;

    /**
    * <p>凭据额外配置</p>
    */
    @SerializedName("AdditionalConfig")
    @Expose
    private String AdditionalConfig;

    /**
    * <p>凭据加密类型</p><p>枚举值：</p><ul><li>0： KMS 密钥加密</li><li>1： 软密钥加密</li></ul><p>默认值：0</p>
    */
    @SerializedName("EncryptType")
    @Expose
    private Long EncryptType;

    /**
    * <p>凭据更新状态</p>
    */
    @SerializedName("EncryptSwitching")
    @Expose
    private Boolean EncryptSwitching;

    /**
    * <p>创建者 uin 字符串</p>
    */
    @SerializedName("CreateUinString")
    @Expose
    private String CreateUinString;

    /**
    * <p>所属用户UIN 字符串</p>
    */
    @SerializedName("TargetUinString")
    @Expose
    private String TargetUinString;

    /**
    * <p>对应云产品的账号信息</p>
    */
    @SerializedName("AccountInfoList")
    @Expose
    private SecretAccountInfo [] AccountInfoList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>凭据名称。</p> 
     * @return SecretName <p>凭据名称。</p>
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set <p>凭据名称。</p>
     * @param SecretName <p>凭据名称。</p>
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get <p>凭据描述信息。</p> 
     * @return Description <p>凭据描述信息。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>凭据描述信息。</p>
     * @param Description <p>凭据描述信息。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>用于加密的KMS CMK ID。</p> 
     * @return KmsKeyId <p>用于加密的KMS CMK ID。</p>
     */
    public String getKmsKeyId() {
        return this.KmsKeyId;
    }

    /**
     * Set <p>用于加密的KMS CMK ID。</p>
     * @param KmsKeyId <p>用于加密的KMS CMK ID。</p>
     */
    public void setKmsKeyId(String KmsKeyId) {
        this.KmsKeyId = KmsKeyId;
    }

    /**
     * Get <p>创建者UIN。</p> 
     * @return CreateUin <p>创建者UIN。</p>
     */
    public Long getCreateUin() {
        return this.CreateUin;
    }

    /**
     * Set <p>创建者UIN。</p>
     * @param CreateUin <p>创建者UIN。</p>
     */
    public void setCreateUin(Long CreateUin) {
        this.CreateUin = CreateUin;
    }

    /**
     * Get <p>凭据状态：Enabled、Disabled、PendingDelete, Creating, Failed。</p> 
     * @return Status <p>凭据状态：Enabled、Disabled、PendingDelete, Creating, Failed。</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>凭据状态：Enabled、Disabled、PendingDelete, Creating, Failed。</p>
     * @param Status <p>凭据状态：Enabled、Disabled、PendingDelete, Creating, Failed。</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>删除日期，uinx 时间戳，非计划删除状态的凭据为0。</p> 
     * @return DeleteTime <p>删除日期，uinx 时间戳，非计划删除状态的凭据为0。</p>
     */
    public Long getDeleteTime() {
        return this.DeleteTime;
    }

    /**
     * Set <p>删除日期，uinx 时间戳，非计划删除状态的凭据为0。</p>
     * @param DeleteTime <p>删除日期，uinx 时间戳，非计划删除状态的凭据为0。</p>
     */
    public void setDeleteTime(Long DeleteTime) {
        this.DeleteTime = DeleteTime;
    }

    /**
     * Get <p>创建日期。</p> 
     * @return CreateTime <p>创建日期。</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建日期。</p>
     * @param CreateTime <p>创建日期。</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>0 --  用户自定义凭据类型；1 -- 数据库凭据类型；2 -- SSH密钥对凭据类型；3 -- 云API密钥（AKSK）凭据类型（使用此功能需要联系云助手单独开启白名单）；4 -- Redis类型凭据。</p> 
     * @return SecretType <p>0 --  用户自定义凭据类型；1 -- 数据库凭据类型；2 -- SSH密钥对凭据类型；3 -- 云API密钥（AKSK）凭据类型（使用此功能需要联系云助手单独开启白名单）；4 -- Redis类型凭据。</p>
     */
    public Long getSecretType() {
        return this.SecretType;
    }

    /**
     * Set <p>0 --  用户自定义凭据类型；1 -- 数据库凭据类型；2 -- SSH密钥对凭据类型；3 -- 云API密钥（AKSK）凭据类型（使用此功能需要联系云助手单独开启白名单）；4 -- Redis类型凭据。</p>
     * @param SecretType <p>0 --  用户自定义凭据类型；1 -- 数据库凭据类型；2 -- SSH密钥对凭据类型；3 -- 云API密钥（AKSK）凭据类型（使用此功能需要联系云助手单独开启白名单）；4 -- Redis类型凭据。</p>
     */
    public void setSecretType(Long SecretType) {
        this.SecretType = SecretType;
    }

    /**
     * Get <p>云产品名称。</p> 
     * @return ProductName <p>云产品名称。</p>
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set <p>云产品名称。</p>
     * @param ProductName <p>云产品名称。</p>
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get <p>云产品实例ID。</p> 
     * @return ResourceID <p>云产品实例ID。</p>
     */
    public String getResourceID() {
        return this.ResourceID;
    }

    /**
     * Set <p>云产品实例ID。</p>
     * @param ResourceID <p>云产品实例ID。</p>
     */
    public void setResourceID(String ResourceID) {
        this.ResourceID = ResourceID;
    }

    /**
     * Get <p>是否开启轮转：True -- 开启轮转；False -- 关闭轮转。</p> 
     * @return RotationStatus <p>是否开启轮转：True -- 开启轮转；False -- 关闭轮转。</p>
     */
    public Boolean getRotationStatus() {
        return this.RotationStatus;
    }

    /**
     * Set <p>是否开启轮转：True -- 开启轮转；False -- 关闭轮转。</p>
     * @param RotationStatus <p>是否开启轮转：True -- 开启轮转；False -- 关闭轮转。</p>
     */
    public void setRotationStatus(Boolean RotationStatus) {
        this.RotationStatus = RotationStatus;
    }

    /**
     * Get <p>轮转周期，默认以天为单位。</p> 
     * @return RotationFrequency <p>轮转周期，默认以天为单位。</p>
     */
    public Long getRotationFrequency() {
        return this.RotationFrequency;
    }

    /**
     * Set <p>轮转周期，默认以天为单位。</p>
     * @param RotationFrequency <p>轮转周期，默认以天为单位。</p>
     */
    public void setRotationFrequency(Long RotationFrequency) {
        this.RotationFrequency = RotationFrequency;
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
     * Get <p>当凭据类型为云API密钥对凭据时，此字段有效，用于表示此云API密钥对所属的用户UIN。</p> 
     * @return TargetUin <p>当凭据类型为云API密钥对凭据时，此字段有效，用于表示此云API密钥对所属的用户UIN。</p>
     */
    public Long getTargetUin() {
        return this.TargetUin;
    }

    /**
     * Set <p>当凭据类型为云API密钥对凭据时，此字段有效，用于表示此云API密钥对所属的用户UIN。</p>
     * @param TargetUin <p>当凭据类型为云API密钥对凭据时，此字段有效，用于表示此云API密钥对所属的用户UIN。</p>
     */
    public void setTargetUin(Long TargetUin) {
        this.TargetUin = TargetUin;
    }

    /**
     * Get <p>凭据额外配置</p> 
     * @return AdditionalConfig <p>凭据额外配置</p>
     */
    public String getAdditionalConfig() {
        return this.AdditionalConfig;
    }

    /**
     * Set <p>凭据额外配置</p>
     * @param AdditionalConfig <p>凭据额外配置</p>
     */
    public void setAdditionalConfig(String AdditionalConfig) {
        this.AdditionalConfig = AdditionalConfig;
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
     * Get <p>凭据更新状态</p> 
     * @return EncryptSwitching <p>凭据更新状态</p>
     */
    public Boolean getEncryptSwitching() {
        return this.EncryptSwitching;
    }

    /**
     * Set <p>凭据更新状态</p>
     * @param EncryptSwitching <p>凭据更新状态</p>
     */
    public void setEncryptSwitching(Boolean EncryptSwitching) {
        this.EncryptSwitching = EncryptSwitching;
    }

    /**
     * Get <p>创建者 uin 字符串</p> 
     * @return CreateUinString <p>创建者 uin 字符串</p>
     */
    public String getCreateUinString() {
        return this.CreateUinString;
    }

    /**
     * Set <p>创建者 uin 字符串</p>
     * @param CreateUinString <p>创建者 uin 字符串</p>
     */
    public void setCreateUinString(String CreateUinString) {
        this.CreateUinString = CreateUinString;
    }

    /**
     * Get <p>所属用户UIN 字符串</p> 
     * @return TargetUinString <p>所属用户UIN 字符串</p>
     */
    public String getTargetUinString() {
        return this.TargetUinString;
    }

    /**
     * Set <p>所属用户UIN 字符串</p>
     * @param TargetUinString <p>所属用户UIN 字符串</p>
     */
    public void setTargetUinString(String TargetUinString) {
        this.TargetUinString = TargetUinString;
    }

    /**
     * Get <p>对应云产品的账号信息</p> 
     * @return AccountInfoList <p>对应云产品的账号信息</p>
     */
    public SecretAccountInfo [] getAccountInfoList() {
        return this.AccountInfoList;
    }

    /**
     * Set <p>对应云产品的账号信息</p>
     * @param AccountInfoList <p>对应云产品的账号信息</p>
     */
    public void setAccountInfoList(SecretAccountInfo [] AccountInfoList) {
        this.AccountInfoList = AccountInfoList;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeSecretResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecretResponse(DescribeSecretResponse source) {
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
        if (source.SecretType != null) {
            this.SecretType = new Long(source.SecretType);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.ResourceID != null) {
            this.ResourceID = new String(source.ResourceID);
        }
        if (source.RotationStatus != null) {
            this.RotationStatus = new Boolean(source.RotationStatus);
        }
        if (source.RotationFrequency != null) {
            this.RotationFrequency = new Long(source.RotationFrequency);
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
        if (source.AdditionalConfig != null) {
            this.AdditionalConfig = new String(source.AdditionalConfig);
        }
        if (source.EncryptType != null) {
            this.EncryptType = new Long(source.EncryptType);
        }
        if (source.EncryptSwitching != null) {
            this.EncryptSwitching = new Boolean(source.EncryptSwitching);
        }
        if (source.CreateUinString != null) {
            this.CreateUinString = new String(source.CreateUinString);
        }
        if (source.TargetUinString != null) {
            this.TargetUinString = new String(source.TargetUinString);
        }
        if (source.AccountInfoList != null) {
            this.AccountInfoList = new SecretAccountInfo[source.AccountInfoList.length];
            for (int i = 0; i < source.AccountInfoList.length; i++) {
                this.AccountInfoList[i] = new SecretAccountInfo(source.AccountInfoList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
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
        this.setParamSimple(map, prefix + "SecretType", this.SecretType);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "ResourceID", this.ResourceID);
        this.setParamSimple(map, prefix + "RotationStatus", this.RotationStatus);
        this.setParamSimple(map, prefix + "RotationFrequency", this.RotationFrequency);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "ProjectID", this.ProjectID);
        this.setParamArraySimple(map, prefix + "AssociatedInstanceIDs.", this.AssociatedInstanceIDs);
        this.setParamSimple(map, prefix + "TargetUin", this.TargetUin);
        this.setParamSimple(map, prefix + "AdditionalConfig", this.AdditionalConfig);
        this.setParamSimple(map, prefix + "EncryptType", this.EncryptType);
        this.setParamSimple(map, prefix + "EncryptSwitching", this.EncryptSwitching);
        this.setParamSimple(map, prefix + "CreateUinString", this.CreateUinString);
        this.setParamSimple(map, prefix + "TargetUinString", this.TargetUinString);
        this.setParamArrayObj(map, prefix + "AccountInfoList.", this.AccountInfoList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

