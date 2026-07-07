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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelKeyInfoItem extends AbstractModel {

    /**
    * <p>接入类型</p>
    */
    @SerializedName("AccessType")
    @Expose
    private String AccessType;

    /**
    * <p>API Base URL</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiBase")
    @Expose
    private String ApiBase;

    /**
    * <p>模型创建时间（ISO 8601）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * <p>自定义host header</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostHeader")
    @Expose
    private String HostHeader;

    /**
    * <p>Key 数量</p>
    */
    @SerializedName("KeyCount")
    @Expose
    private Long KeyCount;

    /**
    * <p>Key 详情列表</p>
    */
    @SerializedName("Keys")
    @Expose
    private KeyDetailItem [] Keys;

    /**
    * <p>model信息</p>
    */
    @SerializedName("ModelIdsWithAlias")
    @Expose
    private ServiceProviderModelItem [] ModelIdsWithAlias;

    /**
    * <p>模型供应商</p>
    */
    @SerializedName("ModelProvider")
    @Expose
    private String ModelProvider;

    /**
    * <p>模型协议</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>内部通信占用IP</p>
    */
    @SerializedName("ServiceIps")
    @Expose
    private String [] ServiceIps;

    /**
    * <p>服务提供商ID</p>
    */
    @SerializedName("ServiceProviderId")
    @Expose
    private String ServiceProviderId;

    /**
    * <p>服务提供商自定义名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceProviderName")
    @Expose
    private String ServiceProviderName;

    /**
    * <p>模型状态</p><p>枚举值：</p><ul><li>Active： 运行中</li><li>Provisioning： 创建中</li><li>Configuring： 变配中</li><li>Deleting： 删除中</li><li>ProvisionFailed： 创建失败</li><li>ConfigureFailed： 变配失败</li><li>DeletionFailed： 删除失败</li><li>Disabled： 已禁用</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>子网 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>标签信息</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * <p>是否校验上游SSL</p>
    */
    @SerializedName("VerifySSL")
    @Expose
    private Boolean VerifySSL;

    /**
    * <p>VPC 实例 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
     * Get <p>接入类型</p> 
     * @return AccessType <p>接入类型</p>
     */
    public String getAccessType() {
        return this.AccessType;
    }

    /**
     * Set <p>接入类型</p>
     * @param AccessType <p>接入类型</p>
     */
    public void setAccessType(String AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get <p>API Base URL</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiBase <p>API Base URL</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApiBase() {
        return this.ApiBase;
    }

    /**
     * Set <p>API Base URL</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiBase <p>API Base URL</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiBase(String ApiBase) {
        this.ApiBase = ApiBase;
    }

    /**
     * Get <p>模型创建时间（ISO 8601）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedAt <p>模型创建时间（ISO 8601）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>模型创建时间（ISO 8601）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedAt <p>模型创建时间（ISO 8601）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get <p>自定义host header</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostHeader <p>自定义host header</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHostHeader() {
        return this.HostHeader;
    }

    /**
     * Set <p>自定义host header</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostHeader <p>自定义host header</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostHeader(String HostHeader) {
        this.HostHeader = HostHeader;
    }

    /**
     * Get <p>Key 数量</p> 
     * @return KeyCount <p>Key 数量</p>
     */
    public Long getKeyCount() {
        return this.KeyCount;
    }

    /**
     * Set <p>Key 数量</p>
     * @param KeyCount <p>Key 数量</p>
     */
    public void setKeyCount(Long KeyCount) {
        this.KeyCount = KeyCount;
    }

    /**
     * Get <p>Key 详情列表</p> 
     * @return Keys <p>Key 详情列表</p>
     */
    public KeyDetailItem [] getKeys() {
        return this.Keys;
    }

    /**
     * Set <p>Key 详情列表</p>
     * @param Keys <p>Key 详情列表</p>
     */
    public void setKeys(KeyDetailItem [] Keys) {
        this.Keys = Keys;
    }

    /**
     * Get <p>model信息</p> 
     * @return ModelIdsWithAlias <p>model信息</p>
     */
    public ServiceProviderModelItem [] getModelIdsWithAlias() {
        return this.ModelIdsWithAlias;
    }

    /**
     * Set <p>model信息</p>
     * @param ModelIdsWithAlias <p>model信息</p>
     */
    public void setModelIdsWithAlias(ServiceProviderModelItem [] ModelIdsWithAlias) {
        this.ModelIdsWithAlias = ModelIdsWithAlias;
    }

    /**
     * Get <p>模型供应商</p> 
     * @return ModelProvider <p>模型供应商</p>
     */
    public String getModelProvider() {
        return this.ModelProvider;
    }

    /**
     * Set <p>模型供应商</p>
     * @param ModelProvider <p>模型供应商</p>
     */
    public void setModelProvider(String ModelProvider) {
        this.ModelProvider = ModelProvider;
    }

    /**
     * Get <p>模型协议</p> 
     * @return Protocol <p>模型协议</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>模型协议</p>
     * @param Protocol <p>模型协议</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>内部通信占用IP</p> 
     * @return ServiceIps <p>内部通信占用IP</p>
     */
    public String [] getServiceIps() {
        return this.ServiceIps;
    }

    /**
     * Set <p>内部通信占用IP</p>
     * @param ServiceIps <p>内部通信占用IP</p>
     */
    public void setServiceIps(String [] ServiceIps) {
        this.ServiceIps = ServiceIps;
    }

    /**
     * Get <p>服务提供商ID</p> 
     * @return ServiceProviderId <p>服务提供商ID</p>
     */
    public String getServiceProviderId() {
        return this.ServiceProviderId;
    }

    /**
     * Set <p>服务提供商ID</p>
     * @param ServiceProviderId <p>服务提供商ID</p>
     */
    public void setServiceProviderId(String ServiceProviderId) {
        this.ServiceProviderId = ServiceProviderId;
    }

    /**
     * Get <p>服务提供商自定义名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceProviderName <p>服务提供商自定义名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceProviderName() {
        return this.ServiceProviderName;
    }

    /**
     * Set <p>服务提供商自定义名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceProviderName <p>服务提供商自定义名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceProviderName(String ServiceProviderName) {
        this.ServiceProviderName = ServiceProviderName;
    }

    /**
     * Get <p>模型状态</p><p>枚举值：</p><ul><li>Active： 运行中</li><li>Provisioning： 创建中</li><li>Configuring： 变配中</li><li>Deleting： 删除中</li><li>ProvisionFailed： 创建失败</li><li>ConfigureFailed： 变配失败</li><li>DeletionFailed： 删除失败</li><li>Disabled： 已禁用</li></ul> 
     * @return Status <p>模型状态</p><p>枚举值：</p><ul><li>Active： 运行中</li><li>Provisioning： 创建中</li><li>Configuring： 变配中</li><li>Deleting： 删除中</li><li>ProvisionFailed： 创建失败</li><li>ConfigureFailed： 变配失败</li><li>DeletionFailed： 删除失败</li><li>Disabled： 已禁用</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>模型状态</p><p>枚举值：</p><ul><li>Active： 运行中</li><li>Provisioning： 创建中</li><li>Configuring： 变配中</li><li>Deleting： 删除中</li><li>ProvisionFailed： 创建失败</li><li>ConfigureFailed： 变配失败</li><li>DeletionFailed： 删除失败</li><li>Disabled： 已禁用</li></ul>
     * @param Status <p>模型状态</p><p>枚举值：</p><ul><li>Active： 运行中</li><li>Provisioning： 创建中</li><li>Configuring： 变配中</li><li>Deleting： 删除中</li><li>ProvisionFailed： 创建失败</li><li>ConfigureFailed： 变配失败</li><li>DeletionFailed： 删除失败</li><li>Disabled： 已禁用</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>子网 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId <p>子网 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId <p>子网 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>标签信息</p> 
     * @return Tags <p>标签信息</p>
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签信息</p>
     * @param Tags <p>标签信息</p>
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>是否校验上游SSL</p> 
     * @return VerifySSL <p>是否校验上游SSL</p>
     */
    public Boolean getVerifySSL() {
        return this.VerifySSL;
    }

    /**
     * Set <p>是否校验上游SSL</p>
     * @param VerifySSL <p>是否校验上游SSL</p>
     */
    public void setVerifySSL(Boolean VerifySSL) {
        this.VerifySSL = VerifySSL;
    }

    /**
     * Get <p>VPC 实例 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId <p>VPC 实例 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC 实例 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId <p>VPC 实例 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    public ModelKeyInfoItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelKeyInfoItem(ModelKeyInfoItem source) {
        if (source.AccessType != null) {
            this.AccessType = new String(source.AccessType);
        }
        if (source.ApiBase != null) {
            this.ApiBase = new String(source.ApiBase);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.HostHeader != null) {
            this.HostHeader = new String(source.HostHeader);
        }
        if (source.KeyCount != null) {
            this.KeyCount = new Long(source.KeyCount);
        }
        if (source.Keys != null) {
            this.Keys = new KeyDetailItem[source.Keys.length];
            for (int i = 0; i < source.Keys.length; i++) {
                this.Keys[i] = new KeyDetailItem(source.Keys[i]);
            }
        }
        if (source.ModelIdsWithAlias != null) {
            this.ModelIdsWithAlias = new ServiceProviderModelItem[source.ModelIdsWithAlias.length];
            for (int i = 0; i < source.ModelIdsWithAlias.length; i++) {
                this.ModelIdsWithAlias[i] = new ServiceProviderModelItem(source.ModelIdsWithAlias[i]);
            }
        }
        if (source.ModelProvider != null) {
            this.ModelProvider = new String(source.ModelProvider);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.ServiceIps != null) {
            this.ServiceIps = new String[source.ServiceIps.length];
            for (int i = 0; i < source.ServiceIps.length; i++) {
                this.ServiceIps[i] = new String(source.ServiceIps[i]);
            }
        }
        if (source.ServiceProviderId != null) {
            this.ServiceProviderId = new String(source.ServiceProviderId);
        }
        if (source.ServiceProviderName != null) {
            this.ServiceProviderName = new String(source.ServiceProviderName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.VerifySSL != null) {
            this.VerifySSL = new Boolean(source.VerifySSL);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamSimple(map, prefix + "ApiBase", this.ApiBase);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "HostHeader", this.HostHeader);
        this.setParamSimple(map, prefix + "KeyCount", this.KeyCount);
        this.setParamArrayObj(map, prefix + "Keys.", this.Keys);
        this.setParamArrayObj(map, prefix + "ModelIdsWithAlias.", this.ModelIdsWithAlias);
        this.setParamSimple(map, prefix + "ModelProvider", this.ModelProvider);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamArraySimple(map, prefix + "ServiceIps.", this.ServiceIps);
        this.setParamSimple(map, prefix + "ServiceProviderId", this.ServiceProviderId);
        this.setParamSimple(map, prefix + "ServiceProviderName", this.ServiceProviderName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "VerifySSL", this.VerifySSL);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);

    }
}

