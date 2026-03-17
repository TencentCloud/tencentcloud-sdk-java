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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RaspLicenseList extends AbstractModel {

    /**
    * 机器唯一ID
    */
    @SerializedName("QUUID")
    @Expose
    private String QUUID;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 公网IP
    */
    @SerializedName("PublicIP")
    @Expose
    private String PublicIP;

    /**
    * 内网IP
    */
    @SerializedName("PrivateIP")
    @Expose
    private String PrivateIP;

    /**
    * 云标签信息
    */
    @SerializedName("Tags")
    @Expose
    private Tags [] Tags;

    /**
    * 防护版本信息
- CriticalProtection 重保防护包
- Pro 容器安全-专业版
- Ultimate 主机安全-旗舰版
    */
    @SerializedName("ProtectionVersion")
    @Expose
    private String [] ProtectionVersion;

    /**
    * 防护设置
- 0 未配置
- 1 已配置
    */
    @SerializedName("ConfigurationSetting")
    @Expose
    private Long ConfigurationSetting;

    /**
    * 总开关
- 0 未开启
- 1已开启
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 漏洞防御开关
- 0 未开启
- 1 开启
    */
    @SerializedName("VulDefEnable")
    @Expose
    private Long VulDefEnable;

    /**
    * 漏洞防御模式
- 0 标准
- 1 重保
    */
    @SerializedName("VulDefMode")
    @Expose
    private Long VulDefMode;

    /**
    * 漏洞防御动作
- 0 仅检测
- 1 检测+防御
    */
    @SerializedName("VulDefAction")
    @Expose
    private Long VulDefAction;

    /**
    * 内存马防御开关
- 0 未开启
- 1 开启
    */
    @SerializedName("MemShellDefEnable")
    @Expose
    private Long MemShellDefEnable;

    /**
    * 更多防护
- 0 不注入会重启的进程 
- 1 注入会重启的进程
    */
    @SerializedName("SafeInject")
    @Expose
    private Long SafeInject;

    /**
    * 性能阈值配置开关
- 0 未开启
- 1 开启
    */
    @SerializedName("PerformanceLimit")
    @Expose
    private Long PerformanceLimit;

    /**
    * CPU阈值,取值1-99
    */
    @SerializedName("PerformanceLimitCpu")
    @Expose
    private Long PerformanceLimitCpu;

    /**
    * 内存阈值,取值1-99
    */
    @SerializedName("PerformanceLimitMem")
    @Expose
    private Long PerformanceLimitMem;

    /**
    * 内存剩余阈值
    */
    @SerializedName("PerformanceLimitMemAmount")
    @Expose
    private Long PerformanceLimitMemAmount;

    /**
    * 插件状态
- 0 使用正常
- 1 存在异常
- 2 未使用
    */
    @SerializedName("RaspException")
    @Expose
    private Long RaspException;

    /**
    * 最近更新时间
    */
    @SerializedName("LatestUpdateTime")
    @Expose
    private String LatestUpdateTime;

    /**
    * 集群ID,仅容器资产有值
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 集群名称,仅容器资产有值
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 订单信息
    */
    @SerializedName("OrderDetail")
    @Expose
    private OrderDetail OrderDetail;

    /**
    * 是否允许解绑,fasle 不允许 true 允许
    */
    @SerializedName("IsUnBind")
    @Expose
    private Boolean IsUnBind;

    /**
    * uuid 机器唯一ID,仅AssetType = CWP 时有值
    */
    @SerializedName("UUID")
    @Expose
    private String UUID;

    /**
    * 无注入/注入失败原因
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get 机器唯一ID 
     * @return QUUID 机器唯一ID
     */
    public String getQUUID() {
        return this.QUUID;
    }

    /**
     * Set 机器唯一ID
     * @param QUUID 机器唯一ID
     */
    public void setQUUID(String QUUID) {
        this.QUUID = QUUID;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 公网IP 
     * @return PublicIP 公网IP
     */
    public String getPublicIP() {
        return this.PublicIP;
    }

    /**
     * Set 公网IP
     * @param PublicIP 公网IP
     */
    public void setPublicIP(String PublicIP) {
        this.PublicIP = PublicIP;
    }

    /**
     * Get 内网IP 
     * @return PrivateIP 内网IP
     */
    public String getPrivateIP() {
        return this.PrivateIP;
    }

    /**
     * Set 内网IP
     * @param PrivateIP 内网IP
     */
    public void setPrivateIP(String PrivateIP) {
        this.PrivateIP = PrivateIP;
    }

    /**
     * Get 云标签信息 
     * @return Tags 云标签信息
     */
    public Tags [] getTags() {
        return this.Tags;
    }

    /**
     * Set 云标签信息
     * @param Tags 云标签信息
     */
    public void setTags(Tags [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 防护版本信息
- CriticalProtection 重保防护包
- Pro 容器安全-专业版
- Ultimate 主机安全-旗舰版 
     * @return ProtectionVersion 防护版本信息
- CriticalProtection 重保防护包
- Pro 容器安全-专业版
- Ultimate 主机安全-旗舰版
     */
    public String [] getProtectionVersion() {
        return this.ProtectionVersion;
    }

    /**
     * Set 防护版本信息
- CriticalProtection 重保防护包
- Pro 容器安全-专业版
- Ultimate 主机安全-旗舰版
     * @param ProtectionVersion 防护版本信息
- CriticalProtection 重保防护包
- Pro 容器安全-专业版
- Ultimate 主机安全-旗舰版
     */
    public void setProtectionVersion(String [] ProtectionVersion) {
        this.ProtectionVersion = ProtectionVersion;
    }

    /**
     * Get 防护设置
- 0 未配置
- 1 已配置 
     * @return ConfigurationSetting 防护设置
- 0 未配置
- 1 已配置
     */
    public Long getConfigurationSetting() {
        return this.ConfigurationSetting;
    }

    /**
     * Set 防护设置
- 0 未配置
- 1 已配置
     * @param ConfigurationSetting 防护设置
- 0 未配置
- 1 已配置
     */
    public void setConfigurationSetting(Long ConfigurationSetting) {
        this.ConfigurationSetting = ConfigurationSetting;
    }

    /**
     * Get 总开关
- 0 未开启
- 1已开启 
     * @return Enable 总开关
- 0 未开启
- 1已开启
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 总开关
- 0 未开启
- 1已开启
     * @param Enable 总开关
- 0 未开启
- 1已开启
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 漏洞防御开关
- 0 未开启
- 1 开启 
     * @return VulDefEnable 漏洞防御开关
- 0 未开启
- 1 开启
     */
    public Long getVulDefEnable() {
        return this.VulDefEnable;
    }

    /**
     * Set 漏洞防御开关
- 0 未开启
- 1 开启
     * @param VulDefEnable 漏洞防御开关
- 0 未开启
- 1 开启
     */
    public void setVulDefEnable(Long VulDefEnable) {
        this.VulDefEnable = VulDefEnable;
    }

    /**
     * Get 漏洞防御模式
- 0 标准
- 1 重保 
     * @return VulDefMode 漏洞防御模式
- 0 标准
- 1 重保
     */
    public Long getVulDefMode() {
        return this.VulDefMode;
    }

    /**
     * Set 漏洞防御模式
- 0 标准
- 1 重保
     * @param VulDefMode 漏洞防御模式
- 0 标准
- 1 重保
     */
    public void setVulDefMode(Long VulDefMode) {
        this.VulDefMode = VulDefMode;
    }

    /**
     * Get 漏洞防御动作
- 0 仅检测
- 1 检测+防御 
     * @return VulDefAction 漏洞防御动作
- 0 仅检测
- 1 检测+防御
     */
    public Long getVulDefAction() {
        return this.VulDefAction;
    }

    /**
     * Set 漏洞防御动作
- 0 仅检测
- 1 检测+防御
     * @param VulDefAction 漏洞防御动作
- 0 仅检测
- 1 检测+防御
     */
    public void setVulDefAction(Long VulDefAction) {
        this.VulDefAction = VulDefAction;
    }

    /**
     * Get 内存马防御开关
- 0 未开启
- 1 开启 
     * @return MemShellDefEnable 内存马防御开关
- 0 未开启
- 1 开启
     */
    public Long getMemShellDefEnable() {
        return this.MemShellDefEnable;
    }

    /**
     * Set 内存马防御开关
- 0 未开启
- 1 开启
     * @param MemShellDefEnable 内存马防御开关
- 0 未开启
- 1 开启
     */
    public void setMemShellDefEnable(Long MemShellDefEnable) {
        this.MemShellDefEnable = MemShellDefEnable;
    }

    /**
     * Get 更多防护
- 0 不注入会重启的进程 
- 1 注入会重启的进程 
     * @return SafeInject 更多防护
- 0 不注入会重启的进程 
- 1 注入会重启的进程
     */
    public Long getSafeInject() {
        return this.SafeInject;
    }

    /**
     * Set 更多防护
- 0 不注入会重启的进程 
- 1 注入会重启的进程
     * @param SafeInject 更多防护
- 0 不注入会重启的进程 
- 1 注入会重启的进程
     */
    public void setSafeInject(Long SafeInject) {
        this.SafeInject = SafeInject;
    }

    /**
     * Get 性能阈值配置开关
- 0 未开启
- 1 开启 
     * @return PerformanceLimit 性能阈值配置开关
- 0 未开启
- 1 开启
     */
    public Long getPerformanceLimit() {
        return this.PerformanceLimit;
    }

    /**
     * Set 性能阈值配置开关
- 0 未开启
- 1 开启
     * @param PerformanceLimit 性能阈值配置开关
- 0 未开启
- 1 开启
     */
    public void setPerformanceLimit(Long PerformanceLimit) {
        this.PerformanceLimit = PerformanceLimit;
    }

    /**
     * Get CPU阈值,取值1-99 
     * @return PerformanceLimitCpu CPU阈值,取值1-99
     */
    public Long getPerformanceLimitCpu() {
        return this.PerformanceLimitCpu;
    }

    /**
     * Set CPU阈值,取值1-99
     * @param PerformanceLimitCpu CPU阈值,取值1-99
     */
    public void setPerformanceLimitCpu(Long PerformanceLimitCpu) {
        this.PerformanceLimitCpu = PerformanceLimitCpu;
    }

    /**
     * Get 内存阈值,取值1-99 
     * @return PerformanceLimitMem 内存阈值,取值1-99
     */
    public Long getPerformanceLimitMem() {
        return this.PerformanceLimitMem;
    }

    /**
     * Set 内存阈值,取值1-99
     * @param PerformanceLimitMem 内存阈值,取值1-99
     */
    public void setPerformanceLimitMem(Long PerformanceLimitMem) {
        this.PerformanceLimitMem = PerformanceLimitMem;
    }

    /**
     * Get 内存剩余阈值 
     * @return PerformanceLimitMemAmount 内存剩余阈值
     */
    public Long getPerformanceLimitMemAmount() {
        return this.PerformanceLimitMemAmount;
    }

    /**
     * Set 内存剩余阈值
     * @param PerformanceLimitMemAmount 内存剩余阈值
     */
    public void setPerformanceLimitMemAmount(Long PerformanceLimitMemAmount) {
        this.PerformanceLimitMemAmount = PerformanceLimitMemAmount;
    }

    /**
     * Get 插件状态
- 0 使用正常
- 1 存在异常
- 2 未使用 
     * @return RaspException 插件状态
- 0 使用正常
- 1 存在异常
- 2 未使用
     */
    public Long getRaspException() {
        return this.RaspException;
    }

    /**
     * Set 插件状态
- 0 使用正常
- 1 存在异常
- 2 未使用
     * @param RaspException 插件状态
- 0 使用正常
- 1 存在异常
- 2 未使用
     */
    public void setRaspException(Long RaspException) {
        this.RaspException = RaspException;
    }

    /**
     * Get 最近更新时间 
     * @return LatestUpdateTime 最近更新时间
     */
    public String getLatestUpdateTime() {
        return this.LatestUpdateTime;
    }

    /**
     * Set 最近更新时间
     * @param LatestUpdateTime 最近更新时间
     */
    public void setLatestUpdateTime(String LatestUpdateTime) {
        this.LatestUpdateTime = LatestUpdateTime;
    }

    /**
     * Get 集群ID,仅容器资产有值 
     * @return ClusterName 集群ID,仅容器资产有值
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群ID,仅容器资产有值
     * @param ClusterName 集群ID,仅容器资产有值
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 集群名称,仅容器资产有值 
     * @return ClusterId 集群名称,仅容器资产有值
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群名称,仅容器资产有值
     * @param ClusterId 集群名称,仅容器资产有值
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 订单信息 
     * @return OrderDetail 订单信息
     */
    public OrderDetail getOrderDetail() {
        return this.OrderDetail;
    }

    /**
     * Set 订单信息
     * @param OrderDetail 订单信息
     */
    public void setOrderDetail(OrderDetail OrderDetail) {
        this.OrderDetail = OrderDetail;
    }

    /**
     * Get 是否允许解绑,fasle 不允许 true 允许 
     * @return IsUnBind 是否允许解绑,fasle 不允许 true 允许
     */
    public Boolean getIsUnBind() {
        return this.IsUnBind;
    }

    /**
     * Set 是否允许解绑,fasle 不允许 true 允许
     * @param IsUnBind 是否允许解绑,fasle 不允许 true 允许
     */
    public void setIsUnBind(Boolean IsUnBind) {
        this.IsUnBind = IsUnBind;
    }

    /**
     * Get uuid 机器唯一ID,仅AssetType = CWP 时有值 
     * @return UUID uuid 机器唯一ID,仅AssetType = CWP 时有值
     */
    public String getUUID() {
        return this.UUID;
    }

    /**
     * Set uuid 机器唯一ID,仅AssetType = CWP 时有值
     * @param UUID uuid 机器唯一ID,仅AssetType = CWP 时有值
     */
    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    /**
     * Get 无注入/注入失败原因 
     * @return Reason 无注入/注入失败原因
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 无注入/注入失败原因
     * @param Reason 无注入/注入失败原因
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public RaspLicenseList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RaspLicenseList(RaspLicenseList source) {
        if (source.QUUID != null) {
            this.QUUID = new String(source.QUUID);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.PublicIP != null) {
            this.PublicIP = new String(source.PublicIP);
        }
        if (source.PrivateIP != null) {
            this.PrivateIP = new String(source.PrivateIP);
        }
        if (source.Tags != null) {
            this.Tags = new Tags[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tags(source.Tags[i]);
            }
        }
        if (source.ProtectionVersion != null) {
            this.ProtectionVersion = new String[source.ProtectionVersion.length];
            for (int i = 0; i < source.ProtectionVersion.length; i++) {
                this.ProtectionVersion[i] = new String(source.ProtectionVersion[i]);
            }
        }
        if (source.ConfigurationSetting != null) {
            this.ConfigurationSetting = new Long(source.ConfigurationSetting);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.VulDefEnable != null) {
            this.VulDefEnable = new Long(source.VulDefEnable);
        }
        if (source.VulDefMode != null) {
            this.VulDefMode = new Long(source.VulDefMode);
        }
        if (source.VulDefAction != null) {
            this.VulDefAction = new Long(source.VulDefAction);
        }
        if (source.MemShellDefEnable != null) {
            this.MemShellDefEnable = new Long(source.MemShellDefEnable);
        }
        if (source.SafeInject != null) {
            this.SafeInject = new Long(source.SafeInject);
        }
        if (source.PerformanceLimit != null) {
            this.PerformanceLimit = new Long(source.PerformanceLimit);
        }
        if (source.PerformanceLimitCpu != null) {
            this.PerformanceLimitCpu = new Long(source.PerformanceLimitCpu);
        }
        if (source.PerformanceLimitMem != null) {
            this.PerformanceLimitMem = new Long(source.PerformanceLimitMem);
        }
        if (source.PerformanceLimitMemAmount != null) {
            this.PerformanceLimitMemAmount = new Long(source.PerformanceLimitMemAmount);
        }
        if (source.RaspException != null) {
            this.RaspException = new Long(source.RaspException);
        }
        if (source.LatestUpdateTime != null) {
            this.LatestUpdateTime = new String(source.LatestUpdateTime);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.OrderDetail != null) {
            this.OrderDetail = new OrderDetail(source.OrderDetail);
        }
        if (source.IsUnBind != null) {
            this.IsUnBind = new Boolean(source.IsUnBind);
        }
        if (source.UUID != null) {
            this.UUID = new String(source.UUID);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QUUID", this.QUUID);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "PublicIP", this.PublicIP);
        this.setParamSimple(map, prefix + "PrivateIP", this.PrivateIP);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "ProtectionVersion.", this.ProtectionVersion);
        this.setParamSimple(map, prefix + "ConfigurationSetting", this.ConfigurationSetting);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "VulDefEnable", this.VulDefEnable);
        this.setParamSimple(map, prefix + "VulDefMode", this.VulDefMode);
        this.setParamSimple(map, prefix + "VulDefAction", this.VulDefAction);
        this.setParamSimple(map, prefix + "MemShellDefEnable", this.MemShellDefEnable);
        this.setParamSimple(map, prefix + "SafeInject", this.SafeInject);
        this.setParamSimple(map, prefix + "PerformanceLimit", this.PerformanceLimit);
        this.setParamSimple(map, prefix + "PerformanceLimitCpu", this.PerformanceLimitCpu);
        this.setParamSimple(map, prefix + "PerformanceLimitMem", this.PerformanceLimitMem);
        this.setParamSimple(map, prefix + "PerformanceLimitMemAmount", this.PerformanceLimitMemAmount);
        this.setParamSimple(map, prefix + "RaspException", this.RaspException);
        this.setParamSimple(map, prefix + "LatestUpdateTime", this.LatestUpdateTime);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamObj(map, prefix + "OrderDetail.", this.OrderDetail);
        this.setParamSimple(map, prefix + "IsUnBind", this.IsUnBind);
        this.setParamSimple(map, prefix + "UUID", this.UUID);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

