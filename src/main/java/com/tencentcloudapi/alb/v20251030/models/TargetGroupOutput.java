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

public class TargetGroupOutput extends AbstractModel {

    /**
    * 创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 健康检查配置。
    */
    @SerializedName("HealthCheckConfig")
    @Expose
    private HealthCheckConfig HealthCheckConfig;

    /**
    * 是否开启长连接。
    */
    @SerializedName("KeepaliveEnabled")
    @Expose
    private Boolean KeepaliveEnabled;

    /**
    * 后端服务协议类型。取值：
- **HTTP**（默认）：支持绑定HTTP、HTTPS的监听器
- **HTTPS**：支持绑定HTTPS类型的监听器
- **GRPC**：支持绑定HTTPS类型的监听器
- **GRPCS**：支持绑定HTTPS类型的监听器
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 目标组关联的负载均衡数量。
    */
    @SerializedName("RelatedLoadBalancersCount")
    @Expose
    private Long RelatedLoadBalancersCount;

    /**
    * 调度算法。
    */
    @SerializedName("SchedulerAlgorithm")
    @Expose
    private String SchedulerAlgorithm;

    /**
    * 会话保持配置。
    */
    @SerializedName("StickySessionConfig")
    @Expose
    private StickySessionConfig StickySessionConfig;

    /**
    * 标签。
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * 目标组 ID，格式为 lbtg- 后接 8 位字母数字。
    */
    @SerializedName("TargetGroupId")
    @Expose
    private String TargetGroupId;

    /**
    * 目标组名称。默认为目标组ID。长度为 **1-255** 个字符，可包含数字、大小写字母、中文、半角句号（.）、下划线（_）和短划线（-）。
    */
    @SerializedName("TargetGroupName")
    @Expose
    private String TargetGroupName;

    /**
    * 目标组状态。取值：
- **Provisioning**：创建中。
- **ProvisionFailed**：创建失败。
- **Active**: 运行中。
- **Configuring**：配置变更中。
    */
    @SerializedName("TargetGroupStatus")
    @Expose
    private String TargetGroupStatus;

    /**
    * 目标组类型。取值：
- **Instance**：Cvm服务器类型或Eni弹性网卡类型
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * 私有网络 ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
     * Get 创建时间。 
     * @return CreateTime 创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。
     * @param CreateTime 创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 健康检查配置。 
     * @return HealthCheckConfig 健康检查配置。
     */
    public HealthCheckConfig getHealthCheckConfig() {
        return this.HealthCheckConfig;
    }

    /**
     * Set 健康检查配置。
     * @param HealthCheckConfig 健康检查配置。
     */
    public void setHealthCheckConfig(HealthCheckConfig HealthCheckConfig) {
        this.HealthCheckConfig = HealthCheckConfig;
    }

    /**
     * Get 是否开启长连接。 
     * @return KeepaliveEnabled 是否开启长连接。
     */
    public Boolean getKeepaliveEnabled() {
        return this.KeepaliveEnabled;
    }

    /**
     * Set 是否开启长连接。
     * @param KeepaliveEnabled 是否开启长连接。
     */
    public void setKeepaliveEnabled(Boolean KeepaliveEnabled) {
        this.KeepaliveEnabled = KeepaliveEnabled;
    }

    /**
     * Get 后端服务协议类型。取值：
- **HTTP**（默认）：支持绑定HTTP、HTTPS的监听器
- **HTTPS**：支持绑定HTTPS类型的监听器
- **GRPC**：支持绑定HTTPS类型的监听器
- **GRPCS**：支持绑定HTTPS类型的监听器 
     * @return Protocol 后端服务协议类型。取值：
- **HTTP**（默认）：支持绑定HTTP、HTTPS的监听器
- **HTTPS**：支持绑定HTTPS类型的监听器
- **GRPC**：支持绑定HTTPS类型的监听器
- **GRPCS**：支持绑定HTTPS类型的监听器
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 后端服务协议类型。取值：
- **HTTP**（默认）：支持绑定HTTP、HTTPS的监听器
- **HTTPS**：支持绑定HTTPS类型的监听器
- **GRPC**：支持绑定HTTPS类型的监听器
- **GRPCS**：支持绑定HTTPS类型的监听器
     * @param Protocol 后端服务协议类型。取值：
- **HTTP**（默认）：支持绑定HTTP、HTTPS的监听器
- **HTTPS**：支持绑定HTTPS类型的监听器
- **GRPC**：支持绑定HTTPS类型的监听器
- **GRPCS**：支持绑定HTTPS类型的监听器
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 目标组关联的负载均衡数量。 
     * @return RelatedLoadBalancersCount 目标组关联的负载均衡数量。
     */
    public Long getRelatedLoadBalancersCount() {
        return this.RelatedLoadBalancersCount;
    }

    /**
     * Set 目标组关联的负载均衡数量。
     * @param RelatedLoadBalancersCount 目标组关联的负载均衡数量。
     */
    public void setRelatedLoadBalancersCount(Long RelatedLoadBalancersCount) {
        this.RelatedLoadBalancersCount = RelatedLoadBalancersCount;
    }

    /**
     * Get 调度算法。 
     * @return SchedulerAlgorithm 调度算法。
     */
    public String getSchedulerAlgorithm() {
        return this.SchedulerAlgorithm;
    }

    /**
     * Set 调度算法。
     * @param SchedulerAlgorithm 调度算法。
     */
    public void setSchedulerAlgorithm(String SchedulerAlgorithm) {
        this.SchedulerAlgorithm = SchedulerAlgorithm;
    }

    /**
     * Get 会话保持配置。 
     * @return StickySessionConfig 会话保持配置。
     */
    public StickySessionConfig getStickySessionConfig() {
        return this.StickySessionConfig;
    }

    /**
     * Set 会话保持配置。
     * @param StickySessionConfig 会话保持配置。
     */
    public void setStickySessionConfig(StickySessionConfig StickySessionConfig) {
        this.StickySessionConfig = StickySessionConfig;
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
     * Get 目标组 ID，格式为 lbtg- 后接 8 位字母数字。 
     * @return TargetGroupId 目标组 ID，格式为 lbtg- 后接 8 位字母数字。
     */
    public String getTargetGroupId() {
        return this.TargetGroupId;
    }

    /**
     * Set 目标组 ID，格式为 lbtg- 后接 8 位字母数字。
     * @param TargetGroupId 目标组 ID，格式为 lbtg- 后接 8 位字母数字。
     */
    public void setTargetGroupId(String TargetGroupId) {
        this.TargetGroupId = TargetGroupId;
    }

    /**
     * Get 目标组名称。默认为目标组ID。长度为 **1-255** 个字符，可包含数字、大小写字母、中文、半角句号（.）、下划线（_）和短划线（-）。 
     * @return TargetGroupName 目标组名称。默认为目标组ID。长度为 **1-255** 个字符，可包含数字、大小写字母、中文、半角句号（.）、下划线（_）和短划线（-）。
     */
    public String getTargetGroupName() {
        return this.TargetGroupName;
    }

    /**
     * Set 目标组名称。默认为目标组ID。长度为 **1-255** 个字符，可包含数字、大小写字母、中文、半角句号（.）、下划线（_）和短划线（-）。
     * @param TargetGroupName 目标组名称。默认为目标组ID。长度为 **1-255** 个字符，可包含数字、大小写字母、中文、半角句号（.）、下划线（_）和短划线（-）。
     */
    public void setTargetGroupName(String TargetGroupName) {
        this.TargetGroupName = TargetGroupName;
    }

    /**
     * Get 目标组状态。取值：
- **Provisioning**：创建中。
- **ProvisionFailed**：创建失败。
- **Active**: 运行中。
- **Configuring**：配置变更中。 
     * @return TargetGroupStatus 目标组状态。取值：
- **Provisioning**：创建中。
- **ProvisionFailed**：创建失败。
- **Active**: 运行中。
- **Configuring**：配置变更中。
     */
    public String getTargetGroupStatus() {
        return this.TargetGroupStatus;
    }

    /**
     * Set 目标组状态。取值：
- **Provisioning**：创建中。
- **ProvisionFailed**：创建失败。
- **Active**: 运行中。
- **Configuring**：配置变更中。
     * @param TargetGroupStatus 目标组状态。取值：
- **Provisioning**：创建中。
- **ProvisionFailed**：创建失败。
- **Active**: 运行中。
- **Configuring**：配置变更中。
     */
    public void setTargetGroupStatus(String TargetGroupStatus) {
        this.TargetGroupStatus = TargetGroupStatus;
    }

    /**
     * Get 目标组类型。取值：
- **Instance**：Cvm服务器类型或Eni弹性网卡类型 
     * @return TargetType 目标组类型。取值：
- **Instance**：Cvm服务器类型或Eni弹性网卡类型
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set 目标组类型。取值：
- **Instance**：Cvm服务器类型或Eni弹性网卡类型
     * @param TargetType 目标组类型。取值：
- **Instance**：Cvm服务器类型或Eni弹性网卡类型
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
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

    public TargetGroupOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetGroupOutput(TargetGroupOutput source) {
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.HealthCheckConfig != null) {
            this.HealthCheckConfig = new HealthCheckConfig(source.HealthCheckConfig);
        }
        if (source.KeepaliveEnabled != null) {
            this.KeepaliveEnabled = new Boolean(source.KeepaliveEnabled);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.RelatedLoadBalancersCount != null) {
            this.RelatedLoadBalancersCount = new Long(source.RelatedLoadBalancersCount);
        }
        if (source.SchedulerAlgorithm != null) {
            this.SchedulerAlgorithm = new String(source.SchedulerAlgorithm);
        }
        if (source.StickySessionConfig != null) {
            this.StickySessionConfig = new StickySessionConfig(source.StickySessionConfig);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.TargetGroupId != null) {
            this.TargetGroupId = new String(source.TargetGroupId);
        }
        if (source.TargetGroupName != null) {
            this.TargetGroupName = new String(source.TargetGroupName);
        }
        if (source.TargetGroupStatus != null) {
            this.TargetGroupStatus = new String(source.TargetGroupStatus);
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamObj(map, prefix + "HealthCheckConfig.", this.HealthCheckConfig);
        this.setParamSimple(map, prefix + "KeepaliveEnabled", this.KeepaliveEnabled);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "RelatedLoadBalancersCount", this.RelatedLoadBalancersCount);
        this.setParamSimple(map, prefix + "SchedulerAlgorithm", this.SchedulerAlgorithm);
        this.setParamObj(map, prefix + "StickySessionConfig.", this.StickySessionConfig);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "TargetGroupId", this.TargetGroupId);
        this.setParamSimple(map, prefix + "TargetGroupName", this.TargetGroupName);
        this.setParamSimple(map, prefix + "TargetGroupStatus", this.TargetGroupStatus);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);

    }
}

