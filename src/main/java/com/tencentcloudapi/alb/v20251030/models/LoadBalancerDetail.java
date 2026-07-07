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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoadBalancerDetail extends AbstractModel {

    /**
    * 访问日志配置。
    */
    @SerializedName("AccessLogConfig")
    @Expose
    private AccessLogConfig AccessLogConfig;

    /**
    * IP 地址版本，取值 IPv4 或 IPv6。
    */
    @SerializedName("AddressIpVersion")
    @Expose
    private String AddressIpVersion;

    /**
    * 应用型负载均衡实例的网络地址类型。取值：

- **Internet/Public**：负载均衡具有公网IP地址，DNS域名被解析到公网IP，因此可以在公网环境访问。

- **Intranet/Internal**：负载均衡只有私网IP地址，DNS域名被解析到私网IP，因此只能被负载均衡所在VPC的内网环境访问。


    */
    @SerializedName("AddressType")
    @Expose
    private String AddressType;

    /**
    * 资源创建时间，格式为`yyyy-MM-ddTHH:mm:ss±hh:mm`。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 删除保护设置信息。
    */
    @SerializedName("DeletionProtection")
    @Expose
    private DeletionProtectionConfig DeletionProtection;

    /**
    * DNS域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 负载均衡实例付计费配置信息
    */
    @SerializedName("LoadBalancerBillingConfig")
    @Expose
    private LoadBalancerBillingConfig LoadBalancerBillingConfig;

    /**
    * 负载均衡实例 ID，格式为 alb- 后接 8 位字母数字。
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 实例名称。

长度为1~80个字符，可包含中文、字母、数字、短划线（-）、正斜线（/）、半角句号（.）和下划线（_）。
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * 应用型负载均衡操作锁配置。
    */
    @SerializedName("LoadBalancerOperationLocks")
    @Expose
    private LoadBalancerOperationLocksItem [] LoadBalancerOperationLocks;

    /**
    * 应用型负载均衡实例状态。取值：

- **Provisioning**：创建中。
- **Active**: 运行中。
- **Configuring**: 变配中。
- **Deleting**：删除中。
- **ProvisionFailed**：创建失败。
- **ConfigureFailed**：变配失败。
- **DeletionFailed**：删除失败。
- **Abnormal**：异常状态，具体异常原因参见LoadBalancerOperationLocks字段。
    */
    @SerializedName("LoadBalancerStatus")
    @Expose
    private String LoadBalancerStatus;

    /**
    * 修改保护设置信息。
    */
    @SerializedName("ModificationProtection")
    @Expose
    private ModificationProtectionInfo ModificationProtection;

    /**
    * 应用型负载均衡实例绑定的安全组ID集合。
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * 标签。
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * 私有网络 ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 可用区及子网映射列表，最多返回10个可用区。若当前地域支持2个及以上可用区，至少返回2个及以上可用区。
    */
    @SerializedName("ZoneMappings")
    @Expose
    private ZoneMappingInfo [] ZoneMappings;

    /**
     * Get 访问日志配置。 
     * @return AccessLogConfig 访问日志配置。
     */
    public AccessLogConfig getAccessLogConfig() {
        return this.AccessLogConfig;
    }

    /**
     * Set 访问日志配置。
     * @param AccessLogConfig 访问日志配置。
     */
    public void setAccessLogConfig(AccessLogConfig AccessLogConfig) {
        this.AccessLogConfig = AccessLogConfig;
    }

    /**
     * Get IP 地址版本，取值 IPv4 或 IPv6。 
     * @return AddressIpVersion IP 地址版本，取值 IPv4 或 IPv6。
     */
    public String getAddressIpVersion() {
        return this.AddressIpVersion;
    }

    /**
     * Set IP 地址版本，取值 IPv4 或 IPv6。
     * @param AddressIpVersion IP 地址版本，取值 IPv4 或 IPv6。
     */
    public void setAddressIpVersion(String AddressIpVersion) {
        this.AddressIpVersion = AddressIpVersion;
    }

    /**
     * Get 应用型负载均衡实例的网络地址类型。取值：

- **Internet/Public**：负载均衡具有公网IP地址，DNS域名被解析到公网IP，因此可以在公网环境访问。

- **Intranet/Internal**：负载均衡只有私网IP地址，DNS域名被解析到私网IP，因此只能被负载均衡所在VPC的内网环境访问。

 
     * @return AddressType 应用型负载均衡实例的网络地址类型。取值：

- **Internet/Public**：负载均衡具有公网IP地址，DNS域名被解析到公网IP，因此可以在公网环境访问。

- **Intranet/Internal**：负载均衡只有私网IP地址，DNS域名被解析到私网IP，因此只能被负载均衡所在VPC的内网环境访问。


     */
    public String getAddressType() {
        return this.AddressType;
    }

    /**
     * Set 应用型负载均衡实例的网络地址类型。取值：

- **Internet/Public**：负载均衡具有公网IP地址，DNS域名被解析到公网IP，因此可以在公网环境访问。

- **Intranet/Internal**：负载均衡只有私网IP地址，DNS域名被解析到私网IP，因此只能被负载均衡所在VPC的内网环境访问。


     * @param AddressType 应用型负载均衡实例的网络地址类型。取值：

- **Internet/Public**：负载均衡具有公网IP地址，DNS域名被解析到公网IP，因此可以在公网环境访问。

- **Intranet/Internal**：负载均衡只有私网IP地址，DNS域名被解析到私网IP，因此只能被负载均衡所在VPC的内网环境访问。


     */
    public void setAddressType(String AddressType) {
        this.AddressType = AddressType;
    }

    /**
     * Get 资源创建时间，格式为`yyyy-MM-ddTHH:mm:ss±hh:mm`。 
     * @return CreateTime 资源创建时间，格式为`yyyy-MM-ddTHH:mm:ss±hh:mm`。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 资源创建时间，格式为`yyyy-MM-ddTHH:mm:ss±hh:mm`。
     * @param CreateTime 资源创建时间，格式为`yyyy-MM-ddTHH:mm:ss±hh:mm`。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 删除保护设置信息。 
     * @return DeletionProtection 删除保护设置信息。
     */
    public DeletionProtectionConfig getDeletionProtection() {
        return this.DeletionProtection;
    }

    /**
     * Set 删除保护设置信息。
     * @param DeletionProtection 删除保护设置信息。
     */
    public void setDeletionProtection(DeletionProtectionConfig DeletionProtection) {
        this.DeletionProtection = DeletionProtection;
    }

    /**
     * Get DNS域名。 
     * @return Domain DNS域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set DNS域名。
     * @param Domain DNS域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 负载均衡实例付计费配置信息 
     * @return LoadBalancerBillingConfig 负载均衡实例付计费配置信息
     */
    public LoadBalancerBillingConfig getLoadBalancerBillingConfig() {
        return this.LoadBalancerBillingConfig;
    }

    /**
     * Set 负载均衡实例付计费配置信息
     * @param LoadBalancerBillingConfig 负载均衡实例付计费配置信息
     */
    public void setLoadBalancerBillingConfig(LoadBalancerBillingConfig LoadBalancerBillingConfig) {
        this.LoadBalancerBillingConfig = LoadBalancerBillingConfig;
    }

    /**
     * Get 负载均衡实例 ID，格式为 alb- 后接 8 位字母数字。 
     * @return LoadBalancerId 负载均衡实例 ID，格式为 alb- 后接 8 位字母数字。
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡实例 ID，格式为 alb- 后接 8 位字母数字。
     * @param LoadBalancerId 负载均衡实例 ID，格式为 alb- 后接 8 位字母数字。
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 实例名称。

长度为1~80个字符，可包含中文、字母、数字、短划线（-）、正斜线（/）、半角句号（.）和下划线（_）。 
     * @return LoadBalancerName 实例名称。

长度为1~80个字符，可包含中文、字母、数字、短划线（-）、正斜线（/）、半角句号（.）和下划线（_）。
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set 实例名称。

长度为1~80个字符，可包含中文、字母、数字、短划线（-）、正斜线（/）、半角句号（.）和下划线（_）。
     * @param LoadBalancerName 实例名称。

长度为1~80个字符，可包含中文、字母、数字、短划线（-）、正斜线（/）、半角句号（.）和下划线（_）。
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get 应用型负载均衡操作锁配置。 
     * @return LoadBalancerOperationLocks 应用型负载均衡操作锁配置。
     */
    public LoadBalancerOperationLocksItem [] getLoadBalancerOperationLocks() {
        return this.LoadBalancerOperationLocks;
    }

    /**
     * Set 应用型负载均衡操作锁配置。
     * @param LoadBalancerOperationLocks 应用型负载均衡操作锁配置。
     */
    public void setLoadBalancerOperationLocks(LoadBalancerOperationLocksItem [] LoadBalancerOperationLocks) {
        this.LoadBalancerOperationLocks = LoadBalancerOperationLocks;
    }

    /**
     * Get 应用型负载均衡实例状态。取值：

- **Provisioning**：创建中。
- **Active**: 运行中。
- **Configuring**: 变配中。
- **Deleting**：删除中。
- **ProvisionFailed**：创建失败。
- **ConfigureFailed**：变配失败。
- **DeletionFailed**：删除失败。
- **Abnormal**：异常状态，具体异常原因参见LoadBalancerOperationLocks字段。 
     * @return LoadBalancerStatus 应用型负载均衡实例状态。取值：

- **Provisioning**：创建中。
- **Active**: 运行中。
- **Configuring**: 变配中。
- **Deleting**：删除中。
- **ProvisionFailed**：创建失败。
- **ConfigureFailed**：变配失败。
- **DeletionFailed**：删除失败。
- **Abnormal**：异常状态，具体异常原因参见LoadBalancerOperationLocks字段。
     */
    public String getLoadBalancerStatus() {
        return this.LoadBalancerStatus;
    }

    /**
     * Set 应用型负载均衡实例状态。取值：

- **Provisioning**：创建中。
- **Active**: 运行中。
- **Configuring**: 变配中。
- **Deleting**：删除中。
- **ProvisionFailed**：创建失败。
- **ConfigureFailed**：变配失败。
- **DeletionFailed**：删除失败。
- **Abnormal**：异常状态，具体异常原因参见LoadBalancerOperationLocks字段。
     * @param LoadBalancerStatus 应用型负载均衡实例状态。取值：

- **Provisioning**：创建中。
- **Active**: 运行中。
- **Configuring**: 变配中。
- **Deleting**：删除中。
- **ProvisionFailed**：创建失败。
- **ConfigureFailed**：变配失败。
- **DeletionFailed**：删除失败。
- **Abnormal**：异常状态，具体异常原因参见LoadBalancerOperationLocks字段。
     */
    public void setLoadBalancerStatus(String LoadBalancerStatus) {
        this.LoadBalancerStatus = LoadBalancerStatus;
    }

    /**
     * Get 修改保护设置信息。 
     * @return ModificationProtection 修改保护设置信息。
     */
    public ModificationProtectionInfo getModificationProtection() {
        return this.ModificationProtection;
    }

    /**
     * Set 修改保护设置信息。
     * @param ModificationProtection 修改保护设置信息。
     */
    public void setModificationProtection(ModificationProtectionInfo ModificationProtection) {
        this.ModificationProtection = ModificationProtection;
    }

    /**
     * Get 应用型负载均衡实例绑定的安全组ID集合。 
     * @return SecurityGroupIds 应用型负载均衡实例绑定的安全组ID集合。
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 应用型负载均衡实例绑定的安全组ID集合。
     * @param SecurityGroupIds 应用型负载均衡实例绑定的安全组ID集合。
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get 标签。 
     * @return Tags 标签。
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签。
     * @param Tags 标签。
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 私有网络 ID。 
     * @return VpcId 私有网络 ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络 ID。
     * @param VpcId 私有网络 ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 可用区及子网映射列表，最多返回10个可用区。若当前地域支持2个及以上可用区，至少返回2个及以上可用区。 
     * @return ZoneMappings 可用区及子网映射列表，最多返回10个可用区。若当前地域支持2个及以上可用区，至少返回2个及以上可用区。
     */
    public ZoneMappingInfo [] getZoneMappings() {
        return this.ZoneMappings;
    }

    /**
     * Set 可用区及子网映射列表，最多返回10个可用区。若当前地域支持2个及以上可用区，至少返回2个及以上可用区。
     * @param ZoneMappings 可用区及子网映射列表，最多返回10个可用区。若当前地域支持2个及以上可用区，至少返回2个及以上可用区。
     */
    public void setZoneMappings(ZoneMappingInfo [] ZoneMappings) {
        this.ZoneMappings = ZoneMappings;
    }

    public LoadBalancerDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoadBalancerDetail(LoadBalancerDetail source) {
        if (source.AccessLogConfig != null) {
            this.AccessLogConfig = new AccessLogConfig(source.AccessLogConfig);
        }
        if (source.AddressIpVersion != null) {
            this.AddressIpVersion = new String(source.AddressIpVersion);
        }
        if (source.AddressType != null) {
            this.AddressType = new String(source.AddressType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DeletionProtection != null) {
            this.DeletionProtection = new DeletionProtectionConfig(source.DeletionProtection);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.LoadBalancerBillingConfig != null) {
            this.LoadBalancerBillingConfig = new LoadBalancerBillingConfig(source.LoadBalancerBillingConfig);
        }
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.LoadBalancerOperationLocks != null) {
            this.LoadBalancerOperationLocks = new LoadBalancerOperationLocksItem[source.LoadBalancerOperationLocks.length];
            for (int i = 0; i < source.LoadBalancerOperationLocks.length; i++) {
                this.LoadBalancerOperationLocks[i] = new LoadBalancerOperationLocksItem(source.LoadBalancerOperationLocks[i]);
            }
        }
        if (source.LoadBalancerStatus != null) {
            this.LoadBalancerStatus = new String(source.LoadBalancerStatus);
        }
        if (source.ModificationProtection != null) {
            this.ModificationProtection = new ModificationProtectionInfo(source.ModificationProtection);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.ZoneMappings != null) {
            this.ZoneMappings = new ZoneMappingInfo[source.ZoneMappings.length];
            for (int i = 0; i < source.ZoneMappings.length; i++) {
                this.ZoneMappings[i] = new ZoneMappingInfo(source.ZoneMappings[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AccessLogConfig.", this.AccessLogConfig);
        this.setParamSimple(map, prefix + "AddressIpVersion", this.AddressIpVersion);
        this.setParamSimple(map, prefix + "AddressType", this.AddressType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamObj(map, prefix + "DeletionProtection.", this.DeletionProtection);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamObj(map, prefix + "LoadBalancerBillingConfig.", this.LoadBalancerBillingConfig);
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamArrayObj(map, prefix + "LoadBalancerOperationLocks.", this.LoadBalancerOperationLocks);
        this.setParamSimple(map, prefix + "LoadBalancerStatus", this.LoadBalancerStatus);
        this.setParamObj(map, prefix + "ModificationProtection.", this.ModificationProtection);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArrayObj(map, prefix + "ZoneMappings.", this.ZoneMappings);

    }
}

