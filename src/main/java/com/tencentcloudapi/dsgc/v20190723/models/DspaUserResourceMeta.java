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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspaUserResourceMeta extends AbstractModel {

    /**
    * 用户资源ID。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源名称。
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 资源VIP。
    */
    @SerializedName("ResourceVip")
    @Expose
    private String ResourceVip;

    /**
    * 资源端口。
    */
    @SerializedName("ResourceVPort")
    @Expose
    private Long ResourceVPort;

    /**
    * 资源被创建时间。
    */
    @SerializedName("ResourceCreateTime")
    @Expose
    private String ResourceCreateTime;

    /**
    * 用户资源VPC ID 字符串。
    */
    @SerializedName("ResourceUniqueVpcId")
    @Expose
    private String ResourceUniqueVpcId;

    /**
    * 用户资源Subnet ID 字符串。
    */
    @SerializedName("ResourceUniqueSubnetId")
    @Expose
    private String ResourceUniqueSubnetId;

    /**
    * 用户资源类型信息。
    */
    @SerializedName("MetaType")
    @Expose
    private String MetaType;

    /**
    * 资源所处地域。
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * 资源被同步时间。
    */
    @SerializedName("ResourceSyncTime")
    @Expose
    private String ResourceSyncTime;

    /**
    * 资源被授权状态。
    */
    @SerializedName("AuthStatus")
    @Expose
    private String AuthStatus;

    /**
    * 资源创建类型，cloud-云原生资源，build-用户自建资源。
    */
    @SerializedName("BuildType")
    @Expose
    private String BuildType;

    /**
    * 主实例ID。
    */
    @SerializedName("MasterInsId")
    @Expose
    private String MasterInsId;

    /**
    * 用户资源VPC ID 整数。
    */
    @SerializedName("ResourceVpcId")
    @Expose
    private Long ResourceVpcId;

    /**
    * 用户资源Subnet ID 整数。
    */
    @SerializedName("ResourceSubnetId")
    @Expose
    private Long ResourceSubnetId;

    /**
    * 协议类型。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 资源版本号。
    */
    @SerializedName("ResourceVersion")
    @Expose
    private String ResourceVersion;

    /**
    * 授权方式
    */
    @SerializedName("ResourceAuthType")
    @Expose
    private String ResourceAuthType;

    /**
    * 授权账号名
    */
    @SerializedName("ResourceAuthAccount")
    @Expose
    private String ResourceAuthAccount;

    /**
    * 实例类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 实例值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceValue")
    @Expose
    private String InstanceValue;

    /**
     * Get 用户资源ID。 
     * @return ResourceId 用户资源ID。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 用户资源ID。
     * @param ResourceId 用户资源ID。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 资源名称。 
     * @return ResourceName 资源名称。
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 资源名称。
     * @param ResourceName 资源名称。
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get 资源VIP。 
     * @return ResourceVip 资源VIP。
     */
    public String getResourceVip() {
        return this.ResourceVip;
    }

    /**
     * Set 资源VIP。
     * @param ResourceVip 资源VIP。
     */
    public void setResourceVip(String ResourceVip) {
        this.ResourceVip = ResourceVip;
    }

    /**
     * Get 资源端口。 
     * @return ResourceVPort 资源端口。
     */
    public Long getResourceVPort() {
        return this.ResourceVPort;
    }

    /**
     * Set 资源端口。
     * @param ResourceVPort 资源端口。
     */
    public void setResourceVPort(Long ResourceVPort) {
        this.ResourceVPort = ResourceVPort;
    }

    /**
     * Get 资源被创建时间。 
     * @return ResourceCreateTime 资源被创建时间。
     */
    public String getResourceCreateTime() {
        return this.ResourceCreateTime;
    }

    /**
     * Set 资源被创建时间。
     * @param ResourceCreateTime 资源被创建时间。
     */
    public void setResourceCreateTime(String ResourceCreateTime) {
        this.ResourceCreateTime = ResourceCreateTime;
    }

    /**
     * Get 用户资源VPC ID 字符串。 
     * @return ResourceUniqueVpcId 用户资源VPC ID 字符串。
     */
    public String getResourceUniqueVpcId() {
        return this.ResourceUniqueVpcId;
    }

    /**
     * Set 用户资源VPC ID 字符串。
     * @param ResourceUniqueVpcId 用户资源VPC ID 字符串。
     */
    public void setResourceUniqueVpcId(String ResourceUniqueVpcId) {
        this.ResourceUniqueVpcId = ResourceUniqueVpcId;
    }

    /**
     * Get 用户资源Subnet ID 字符串。 
     * @return ResourceUniqueSubnetId 用户资源Subnet ID 字符串。
     */
    public String getResourceUniqueSubnetId() {
        return this.ResourceUniqueSubnetId;
    }

    /**
     * Set 用户资源Subnet ID 字符串。
     * @param ResourceUniqueSubnetId 用户资源Subnet ID 字符串。
     */
    public void setResourceUniqueSubnetId(String ResourceUniqueSubnetId) {
        this.ResourceUniqueSubnetId = ResourceUniqueSubnetId;
    }

    /**
     * Get 用户资源类型信息。 
     * @return MetaType 用户资源类型信息。
     */
    public String getMetaType() {
        return this.MetaType;
    }

    /**
     * Set 用户资源类型信息。
     * @param MetaType 用户资源类型信息。
     */
    public void setMetaType(String MetaType) {
        this.MetaType = MetaType;
    }

    /**
     * Get 资源所处地域。 
     * @return ResourceRegion 资源所处地域。
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set 资源所处地域。
     * @param ResourceRegion 资源所处地域。
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get 资源被同步时间。 
     * @return ResourceSyncTime 资源被同步时间。
     */
    public String getResourceSyncTime() {
        return this.ResourceSyncTime;
    }

    /**
     * Set 资源被同步时间。
     * @param ResourceSyncTime 资源被同步时间。
     */
    public void setResourceSyncTime(String ResourceSyncTime) {
        this.ResourceSyncTime = ResourceSyncTime;
    }

    /**
     * Get 资源被授权状态。 
     * @return AuthStatus 资源被授权状态。
     */
    public String getAuthStatus() {
        return this.AuthStatus;
    }

    /**
     * Set 资源被授权状态。
     * @param AuthStatus 资源被授权状态。
     */
    public void setAuthStatus(String AuthStatus) {
        this.AuthStatus = AuthStatus;
    }

    /**
     * Get 资源创建类型，cloud-云原生资源，build-用户自建资源。 
     * @return BuildType 资源创建类型，cloud-云原生资源，build-用户自建资源。
     */
    public String getBuildType() {
        return this.BuildType;
    }

    /**
     * Set 资源创建类型，cloud-云原生资源，build-用户自建资源。
     * @param BuildType 资源创建类型，cloud-云原生资源，build-用户自建资源。
     */
    public void setBuildType(String BuildType) {
        this.BuildType = BuildType;
    }

    /**
     * Get 主实例ID。 
     * @return MasterInsId 主实例ID。
     */
    public String getMasterInsId() {
        return this.MasterInsId;
    }

    /**
     * Set 主实例ID。
     * @param MasterInsId 主实例ID。
     */
    public void setMasterInsId(String MasterInsId) {
        this.MasterInsId = MasterInsId;
    }

    /**
     * Get 用户资源VPC ID 整数。 
     * @return ResourceVpcId 用户资源VPC ID 整数。
     */
    public Long getResourceVpcId() {
        return this.ResourceVpcId;
    }

    /**
     * Set 用户资源VPC ID 整数。
     * @param ResourceVpcId 用户资源VPC ID 整数。
     */
    public void setResourceVpcId(Long ResourceVpcId) {
        this.ResourceVpcId = ResourceVpcId;
    }

    /**
     * Get 用户资源Subnet ID 整数。 
     * @return ResourceSubnetId 用户资源Subnet ID 整数。
     */
    public Long getResourceSubnetId() {
        return this.ResourceSubnetId;
    }

    /**
     * Set 用户资源Subnet ID 整数。
     * @param ResourceSubnetId 用户资源Subnet ID 整数。
     */
    public void setResourceSubnetId(Long ResourceSubnetId) {
        this.ResourceSubnetId = ResourceSubnetId;
    }

    /**
     * Get 协议类型。 
     * @return Protocol 协议类型。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议类型。
     * @param Protocol 协议类型。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 资源版本号。 
     * @return ResourceVersion 资源版本号。
     */
    public String getResourceVersion() {
        return this.ResourceVersion;
    }

    /**
     * Set 资源版本号。
     * @param ResourceVersion 资源版本号。
     */
    public void setResourceVersion(String ResourceVersion) {
        this.ResourceVersion = ResourceVersion;
    }

    /**
     * Get 授权方式 
     * @return ResourceAuthType 授权方式
     */
    public String getResourceAuthType() {
        return this.ResourceAuthType;
    }

    /**
     * Set 授权方式
     * @param ResourceAuthType 授权方式
     */
    public void setResourceAuthType(String ResourceAuthType) {
        this.ResourceAuthType = ResourceAuthType;
    }

    /**
     * Get 授权账号名 
     * @return ResourceAuthAccount 授权账号名
     */
    public String getResourceAuthAccount() {
        return this.ResourceAuthAccount;
    }

    /**
     * Set 授权账号名
     * @param ResourceAuthAccount 授权账号名
     */
    public void setResourceAuthAccount(String ResourceAuthAccount) {
        this.ResourceAuthAccount = ResourceAuthAccount;
    }

    /**
     * Get 实例类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceType 实例类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceType 实例类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 实例值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceValue 实例值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceValue() {
        return this.InstanceValue;
    }

    /**
     * Set 实例值
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceValue 实例值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceValue(String InstanceValue) {
        this.InstanceValue = InstanceValue;
    }

    public DspaUserResourceMeta() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspaUserResourceMeta(DspaUserResourceMeta source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.ResourceVip != null) {
            this.ResourceVip = new String(source.ResourceVip);
        }
        if (source.ResourceVPort != null) {
            this.ResourceVPort = new Long(source.ResourceVPort);
        }
        if (source.ResourceCreateTime != null) {
            this.ResourceCreateTime = new String(source.ResourceCreateTime);
        }
        if (source.ResourceUniqueVpcId != null) {
            this.ResourceUniqueVpcId = new String(source.ResourceUniqueVpcId);
        }
        if (source.ResourceUniqueSubnetId != null) {
            this.ResourceUniqueSubnetId = new String(source.ResourceUniqueSubnetId);
        }
        if (source.MetaType != null) {
            this.MetaType = new String(source.MetaType);
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
        if (source.ResourceSyncTime != null) {
            this.ResourceSyncTime = new String(source.ResourceSyncTime);
        }
        if (source.AuthStatus != null) {
            this.AuthStatus = new String(source.AuthStatus);
        }
        if (source.BuildType != null) {
            this.BuildType = new String(source.BuildType);
        }
        if (source.MasterInsId != null) {
            this.MasterInsId = new String(source.MasterInsId);
        }
        if (source.ResourceVpcId != null) {
            this.ResourceVpcId = new Long(source.ResourceVpcId);
        }
        if (source.ResourceSubnetId != null) {
            this.ResourceSubnetId = new Long(source.ResourceSubnetId);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.ResourceVersion != null) {
            this.ResourceVersion = new String(source.ResourceVersion);
        }
        if (source.ResourceAuthType != null) {
            this.ResourceAuthType = new String(source.ResourceAuthType);
        }
        if (source.ResourceAuthAccount != null) {
            this.ResourceAuthAccount = new String(source.ResourceAuthAccount);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceValue != null) {
            this.InstanceValue = new String(source.InstanceValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "ResourceVip", this.ResourceVip);
        this.setParamSimple(map, prefix + "ResourceVPort", this.ResourceVPort);
        this.setParamSimple(map, prefix + "ResourceCreateTime", this.ResourceCreateTime);
        this.setParamSimple(map, prefix + "ResourceUniqueVpcId", this.ResourceUniqueVpcId);
        this.setParamSimple(map, prefix + "ResourceUniqueSubnetId", this.ResourceUniqueSubnetId);
        this.setParamSimple(map, prefix + "MetaType", this.MetaType);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "ResourceSyncTime", this.ResourceSyncTime);
        this.setParamSimple(map, prefix + "AuthStatus", this.AuthStatus);
        this.setParamSimple(map, prefix + "BuildType", this.BuildType);
        this.setParamSimple(map, prefix + "MasterInsId", this.MasterInsId);
        this.setParamSimple(map, prefix + "ResourceVpcId", this.ResourceVpcId);
        this.setParamSimple(map, prefix + "ResourceSubnetId", this.ResourceSubnetId);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "ResourceVersion", this.ResourceVersion);
        this.setParamSimple(map, prefix + "ResourceAuthType", this.ResourceAuthType);
        this.setParamSimple(map, prefix + "ResourceAuthAccount", this.ResourceAuthAccount);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceValue", this.InstanceValue);

    }
}

