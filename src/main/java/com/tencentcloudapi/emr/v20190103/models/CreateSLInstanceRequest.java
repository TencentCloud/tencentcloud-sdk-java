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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSLInstanceRequest extends AbstractModel {

    /**
    * <p>实例单节点磁盘容量，单位GB，单节点磁盘容量需大于等于100，小于等于250*CPU核心数，容量调整步长为100。</p>
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * <p>实例存储类型，CLOUD_HSSD表示性能云存储， CLOUD_BSSD表示标准云存储。</p>
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * <p>实例名称。</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>实例节点规格，可填写4C16G、8C32G、16C64G、32C128G，不区分大小写。</p>
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * <p>实例计费模式，0表示后付费，即按量计费，1表示预付费，即包年包月。</p>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>实例可用区详细配置，当前支持多可用区，可用区数量只能为1或3，包含区域名称，VPC信息、节点数量，其中所有区域节点总数需大于等于3，小于等于50。</p>
    */
    @SerializedName("ZoneSettings")
    @Expose
    private ZoneSetting [] ZoneSettings;

    /**
    * <p>唯一随机标识，时效性为5分钟，需要调用者指定 防止客户端重复创建资源，例如 a9a90aa6-<strong><strong>-</strong></strong>-****-fae360632808</p>
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * <p>部署模式</p>
    */
    @SerializedName("DeploymentMode")
    @Expose
    private String DeploymentMode;

    /**
    * <p>是否开启公网 IP 访问，默认 false。TCBase 开启后会创建并绑定 EIP；内网 CLB 绑定 EIP 后，CLB 安全组对来自 EIP 的流量不生效，对来自内网 CLB 的流量生效。</p>
    */
    @SerializedName("EnablePublicIP")
    @Expose
    private Boolean EnablePublicIP;

    /**
    * <p>预付费参数</p>
    */
    @SerializedName("PrePaySetting")
    @Expose
    private PrePaySetting PrePaySetting;

    /**
    * <p>TCBase 实例 CLB 绑定的安全组 ID 列表，形如 sg-xxxxxxxx，可通过 DescribeSecurityGroups 获取。绑定后管控侧会尝试补充 TCP 80、5432、5433 入站放通规则。</p>
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * <p>实例要绑定的标签列表。</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>是否开启实例销毁保护，默认 false；true 表示开启，开启后不允许销毁实例。</p>
    */
    @SerializedName("TerminateProtection")
    @Expose
    private Boolean TerminateProtection;

    /**
    * <p>服务用户名，对不需要用户名的服务不用传，8-16个字符，支持大写字母、小写字母、数字</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
     * Get <p>实例单节点磁盘容量，单位GB，单节点磁盘容量需大于等于100，小于等于250*CPU核心数，容量调整步长为100。</p> 
     * @return DiskSize <p>实例单节点磁盘容量，单位GB，单节点磁盘容量需大于等于100，小于等于250*CPU核心数，容量调整步长为100。</p>
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>实例单节点磁盘容量，单位GB，单节点磁盘容量需大于等于100，小于等于250*CPU核心数，容量调整步长为100。</p>
     * @param DiskSize <p>实例单节点磁盘容量，单位GB，单节点磁盘容量需大于等于100，小于等于250*CPU核心数，容量调整步长为100。</p>
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get <p>实例存储类型，CLOUD_HSSD表示性能云存储， CLOUD_BSSD表示标准云存储。</p> 
     * @return DiskType <p>实例存储类型，CLOUD_HSSD表示性能云存储， CLOUD_BSSD表示标准云存储。</p>
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set <p>实例存储类型，CLOUD_HSSD表示性能云存储， CLOUD_BSSD表示标准云存储。</p>
     * @param DiskType <p>实例存储类型，CLOUD_HSSD表示性能云存储， CLOUD_BSSD表示标准云存储。</p>
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get <p>实例名称。</p> 
     * @return InstanceName <p>实例名称。</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称。</p>
     * @param InstanceName <p>实例名称。</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>实例节点规格，可填写4C16G、8C32G、16C64G、32C128G，不区分大小写。</p> 
     * @return NodeType <p>实例节点规格，可填写4C16G、8C32G、16C64G、32C128G，不区分大小写。</p>
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set <p>实例节点规格，可填写4C16G、8C32G、16C64G、32C128G，不区分大小写。</p>
     * @param NodeType <p>实例节点规格，可填写4C16G、8C32G、16C64G、32C128G，不区分大小写。</p>
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get <p>实例计费模式，0表示后付费，即按量计费，1表示预付费，即包年包月。</p> 
     * @return PayMode <p>实例计费模式，0表示后付费，即按量计费，1表示预付费，即包年包月。</p>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>实例计费模式，0表示后付费，即按量计费，1表示预付费，即包年包月。</p>
     * @param PayMode <p>实例计费模式，0表示后付费，即按量计费，1表示预付费，即包年包月。</p>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>实例可用区详细配置，当前支持多可用区，可用区数量只能为1或3，包含区域名称，VPC信息、节点数量，其中所有区域节点总数需大于等于3，小于等于50。</p> 
     * @return ZoneSettings <p>实例可用区详细配置，当前支持多可用区，可用区数量只能为1或3，包含区域名称，VPC信息、节点数量，其中所有区域节点总数需大于等于3，小于等于50。</p>
     */
    public ZoneSetting [] getZoneSettings() {
        return this.ZoneSettings;
    }

    /**
     * Set <p>实例可用区详细配置，当前支持多可用区，可用区数量只能为1或3，包含区域名称，VPC信息、节点数量，其中所有区域节点总数需大于等于3，小于等于50。</p>
     * @param ZoneSettings <p>实例可用区详细配置，当前支持多可用区，可用区数量只能为1或3，包含区域名称，VPC信息、节点数量，其中所有区域节点总数需大于等于3，小于等于50。</p>
     */
    public void setZoneSettings(ZoneSetting [] ZoneSettings) {
        this.ZoneSettings = ZoneSettings;
    }

    /**
     * Get <p>唯一随机标识，时效性为5分钟，需要调用者指定 防止客户端重复创建资源，例如 a9a90aa6-<strong><strong>-</strong></strong>-****-fae360632808</p> 
     * @return ClientToken <p>唯一随机标识，时效性为5分钟，需要调用者指定 防止客户端重复创建资源，例如 a9a90aa6-<strong><strong>-</strong></strong>-****-fae360632808</p>
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set <p>唯一随机标识，时效性为5分钟，需要调用者指定 防止客户端重复创建资源，例如 a9a90aa6-<strong><strong>-</strong></strong>-****-fae360632808</p>
     * @param ClientToken <p>唯一随机标识，时效性为5分钟，需要调用者指定 防止客户端重复创建资源，例如 a9a90aa6-<strong><strong>-</strong></strong>-****-fae360632808</p>
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get <p>部署模式</p> 
     * @return DeploymentMode <p>部署模式</p>
     */
    public String getDeploymentMode() {
        return this.DeploymentMode;
    }

    /**
     * Set <p>部署模式</p>
     * @param DeploymentMode <p>部署模式</p>
     */
    public void setDeploymentMode(String DeploymentMode) {
        this.DeploymentMode = DeploymentMode;
    }

    /**
     * Get <p>是否开启公网 IP 访问，默认 false。TCBase 开启后会创建并绑定 EIP；内网 CLB 绑定 EIP 后，CLB 安全组对来自 EIP 的流量不生效，对来自内网 CLB 的流量生效。</p> 
     * @return EnablePublicIP <p>是否开启公网 IP 访问，默认 false。TCBase 开启后会创建并绑定 EIP；内网 CLB 绑定 EIP 后，CLB 安全组对来自 EIP 的流量不生效，对来自内网 CLB 的流量生效。</p>
     */
    public Boolean getEnablePublicIP() {
        return this.EnablePublicIP;
    }

    /**
     * Set <p>是否开启公网 IP 访问，默认 false。TCBase 开启后会创建并绑定 EIP；内网 CLB 绑定 EIP 后，CLB 安全组对来自 EIP 的流量不生效，对来自内网 CLB 的流量生效。</p>
     * @param EnablePublicIP <p>是否开启公网 IP 访问，默认 false。TCBase 开启后会创建并绑定 EIP；内网 CLB 绑定 EIP 后，CLB 安全组对来自 EIP 的流量不生效，对来自内网 CLB 的流量生效。</p>
     */
    public void setEnablePublicIP(Boolean EnablePublicIP) {
        this.EnablePublicIP = EnablePublicIP;
    }

    /**
     * Get <p>预付费参数</p> 
     * @return PrePaySetting <p>预付费参数</p>
     */
    public PrePaySetting getPrePaySetting() {
        return this.PrePaySetting;
    }

    /**
     * Set <p>预付费参数</p>
     * @param PrePaySetting <p>预付费参数</p>
     */
    public void setPrePaySetting(PrePaySetting PrePaySetting) {
        this.PrePaySetting = PrePaySetting;
    }

    /**
     * Get <p>TCBase 实例 CLB 绑定的安全组 ID 列表，形如 sg-xxxxxxxx，可通过 DescribeSecurityGroups 获取。绑定后管控侧会尝试补充 TCP 80、5432、5433 入站放通规则。</p> 
     * @return SecurityGroupIds <p>TCBase 实例 CLB 绑定的安全组 ID 列表，形如 sg-xxxxxxxx，可通过 DescribeSecurityGroups 获取。绑定后管控侧会尝试补充 TCP 80、5432、5433 入站放通规则。</p>
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>TCBase 实例 CLB 绑定的安全组 ID 列表，形如 sg-xxxxxxxx，可通过 DescribeSecurityGroups 获取。绑定后管控侧会尝试补充 TCP 80、5432、5433 入站放通规则。</p>
     * @param SecurityGroupIds <p>TCBase 实例 CLB 绑定的安全组 ID 列表，形如 sg-xxxxxxxx，可通过 DescribeSecurityGroups 获取。绑定后管控侧会尝试补充 TCP 80、5432、5433 入站放通规则。</p>
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get <p>实例要绑定的标签列表。</p> 
     * @return Tags <p>实例要绑定的标签列表。</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>实例要绑定的标签列表。</p>
     * @param Tags <p>实例要绑定的标签列表。</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>是否开启实例销毁保护，默认 false；true 表示开启，开启后不允许销毁实例。</p> 
     * @return TerminateProtection <p>是否开启实例销毁保护，默认 false；true 表示开启，开启后不允许销毁实例。</p>
     */
    public Boolean getTerminateProtection() {
        return this.TerminateProtection;
    }

    /**
     * Set <p>是否开启实例销毁保护，默认 false；true 表示开启，开启后不允许销毁实例。</p>
     * @param TerminateProtection <p>是否开启实例销毁保护，默认 false；true 表示开启，开启后不允许销毁实例。</p>
     */
    public void setTerminateProtection(Boolean TerminateProtection) {
        this.TerminateProtection = TerminateProtection;
    }

    /**
     * Get <p>服务用户名，对不需要用户名的服务不用传，8-16个字符，支持大写字母、小写字母、数字</p> 
     * @return UserName <p>服务用户名，对不需要用户名的服务不用传，8-16个字符，支持大写字母、小写字母、数字</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>服务用户名，对不需要用户名的服务不用传，8-16个字符，支持大写字母、小写字母、数字</p>
     * @param UserName <p>服务用户名，对不需要用户名的服务不用传，8-16个字符，支持大写字母、小写字母、数字</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public CreateSLInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSLInstanceRequest(CreateSLInstanceRequest source) {
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.ZoneSettings != null) {
            this.ZoneSettings = new ZoneSetting[source.ZoneSettings.length];
            for (int i = 0; i < source.ZoneSettings.length; i++) {
                this.ZoneSettings[i] = new ZoneSetting(source.ZoneSettings[i]);
            }
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.DeploymentMode != null) {
            this.DeploymentMode = new String(source.DeploymentMode);
        }
        if (source.EnablePublicIP != null) {
            this.EnablePublicIP = new Boolean(source.EnablePublicIP);
        }
        if (source.PrePaySetting != null) {
            this.PrePaySetting = new PrePaySetting(source.PrePaySetting);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.TerminateProtection != null) {
            this.TerminateProtection = new Boolean(source.TerminateProtection);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamArrayObj(map, prefix + "ZoneSettings.", this.ZoneSettings);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "DeploymentMode", this.DeploymentMode);
        this.setParamSimple(map, prefix + "EnablePublicIP", this.EnablePublicIP);
        this.setParamObj(map, prefix + "PrePaySetting.", this.PrePaySetting);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "TerminateProtection", this.TerminateProtection);
        this.setParamSimple(map, prefix + "UserName", this.UserName);

    }
}

