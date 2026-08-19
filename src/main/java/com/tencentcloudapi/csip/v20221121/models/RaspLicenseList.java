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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RaspLicenseList extends AbstractModel {

    /**
    * <p>机器唯一ID</p>
    */
    @SerializedName("QUUID")
    @Expose
    private String QUUID;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>公网IP</p>
    */
    @SerializedName("PublicIP")
    @Expose
    private String PublicIP;

    /**
    * <p>内网IP</p>
    */
    @SerializedName("PrivateIP")
    @Expose
    private String PrivateIP;

    /**
    * <p>云标签信息</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tags [] Tags;

    /**
    * <p>防护版本信息</p><ul><li>CriticalProtection 重保防护包</li><li>Pro 容器安全-专业版</li><li>Ultimate 主机安全-旗舰版</li></ul>
    */
    @SerializedName("ProtectionVersion")
    @Expose
    private String [] ProtectionVersion;

    /**
    * <p>防护设置</p><ul><li>0 未配置</li><li>1 已配置</li></ul>
    */
    @SerializedName("ConfigurationSetting")
    @Expose
    private Long ConfigurationSetting;

    /**
    * <p>总开关</p><ul><li>0 未开启</li><li>1已开启</li></ul>
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * <p>漏洞防御开关</p><ul><li>0 未开启</li><li>1 开启</li></ul>
    */
    @SerializedName("VulDefEnable")
    @Expose
    private Long VulDefEnable;

    /**
    * <p>漏洞防御模式</p><ul><li>0 标准</li><li>1 重保</li></ul>
    */
    @SerializedName("VulDefMode")
    @Expose
    private Long VulDefMode;

    /**
    * <p>漏洞防御动作</p><ul><li>0 仅检测</li><li>1 检测+防御</li></ul>
    */
    @SerializedName("VulDefAction")
    @Expose
    private Long VulDefAction;

    /**
    * <p>内存马防御开关</p><ul><li>0 未开启</li><li>1 开启</li></ul>
    */
    @SerializedName("MemShellDefEnable")
    @Expose
    private Long MemShellDefEnable;

    /**
    * <p>更多防护</p><ul><li>0 不注入会重启的进程 </li><li>1 注入会重启的进程</li></ul>
    */
    @SerializedName("SafeInject")
    @Expose
    private Long SafeInject;

    /**
    * <p>性能阈值配置开关</p><ul><li>0 未开启</li><li>1 开启</li></ul>
    */
    @SerializedName("PerformanceLimit")
    @Expose
    private Long PerformanceLimit;

    /**
    * <p>CPU阈值,取值1-99</p>
    */
    @SerializedName("PerformanceLimitCpu")
    @Expose
    private Long PerformanceLimitCpu;

    /**
    * <p>内存阈值,取值1-99</p>
    */
    @SerializedName("PerformanceLimitMem")
    @Expose
    private Long PerformanceLimitMem;

    /**
    * <p>内存剩余阈值</p>
    */
    @SerializedName("PerformanceLimitMemAmount")
    @Expose
    private Long PerformanceLimitMemAmount;

    /**
    * <p>插件状态</p><ul><li>0 使用正常</li><li>1 存在异常</li><li>2 未使用</li></ul>
    */
    @SerializedName("RaspException")
    @Expose
    private Long RaspException;

    /**
    * <p>最近更新时间</p>
    */
    @SerializedName("LatestUpdateTime")
    @Expose
    private String LatestUpdateTime;

    /**
    * <p>集群ID,仅容器资产有值</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>集群名称,仅容器资产有值</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>订单信息</p>
    */
    @SerializedName("OrderDetail")
    @Expose
    private OrderDetail OrderDetail;

    /**
    * <p>是否允许解绑,fasle 不允许 true 允许</p>
    */
    @SerializedName("IsUnBind")
    @Expose
    private Boolean IsUnBind;

    /**
    * <p>uuid 机器唯一ID,仅AssetType = CWP 时有值</p>
    */
    @SerializedName("UUID")
    @Expose
    private String UUID;

    /**
    * <p>无注入/注入失败原因</p><p>默认值：空</p><p>注入失败才会有值</p>
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get <p>机器唯一ID</p> 
     * @return QUUID <p>机器唯一ID</p>
     */
    public String getQUUID() {
        return this.QUUID;
    }

    /**
     * Set <p>机器唯一ID</p>
     * @param QUUID <p>机器唯一ID</p>
     */
    public void setQUUID(String QUUID) {
        this.QUUID = QUUID;
    }

    /**
     * Get <p>实例名称</p> 
     * @return InstanceName <p>实例名称</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称</p>
     * @param InstanceName <p>实例名称</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>公网IP</p> 
     * @return PublicIP <p>公网IP</p>
     */
    public String getPublicIP() {
        return this.PublicIP;
    }

    /**
     * Set <p>公网IP</p>
     * @param PublicIP <p>公网IP</p>
     */
    public void setPublicIP(String PublicIP) {
        this.PublicIP = PublicIP;
    }

    /**
     * Get <p>内网IP</p> 
     * @return PrivateIP <p>内网IP</p>
     */
    public String getPrivateIP() {
        return this.PrivateIP;
    }

    /**
     * Set <p>内网IP</p>
     * @param PrivateIP <p>内网IP</p>
     */
    public void setPrivateIP(String PrivateIP) {
        this.PrivateIP = PrivateIP;
    }

    /**
     * Get <p>云标签信息</p> 
     * @return Tags <p>云标签信息</p>
     */
    public Tags [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>云标签信息</p>
     * @param Tags <p>云标签信息</p>
     */
    public void setTags(Tags [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>防护版本信息</p><ul><li>CriticalProtection 重保防护包</li><li>Pro 容器安全-专业版</li><li>Ultimate 主机安全-旗舰版</li></ul> 
     * @return ProtectionVersion <p>防护版本信息</p><ul><li>CriticalProtection 重保防护包</li><li>Pro 容器安全-专业版</li><li>Ultimate 主机安全-旗舰版</li></ul>
     */
    public String [] getProtectionVersion() {
        return this.ProtectionVersion;
    }

    /**
     * Set <p>防护版本信息</p><ul><li>CriticalProtection 重保防护包</li><li>Pro 容器安全-专业版</li><li>Ultimate 主机安全-旗舰版</li></ul>
     * @param ProtectionVersion <p>防护版本信息</p><ul><li>CriticalProtection 重保防护包</li><li>Pro 容器安全-专业版</li><li>Ultimate 主机安全-旗舰版</li></ul>
     */
    public void setProtectionVersion(String [] ProtectionVersion) {
        this.ProtectionVersion = ProtectionVersion;
    }

    /**
     * Get <p>防护设置</p><ul><li>0 未配置</li><li>1 已配置</li></ul> 
     * @return ConfigurationSetting <p>防护设置</p><ul><li>0 未配置</li><li>1 已配置</li></ul>
     */
    public Long getConfigurationSetting() {
        return this.ConfigurationSetting;
    }

    /**
     * Set <p>防护设置</p><ul><li>0 未配置</li><li>1 已配置</li></ul>
     * @param ConfigurationSetting <p>防护设置</p><ul><li>0 未配置</li><li>1 已配置</li></ul>
     */
    public void setConfigurationSetting(Long ConfigurationSetting) {
        this.ConfigurationSetting = ConfigurationSetting;
    }

    /**
     * Get <p>总开关</p><ul><li>0 未开启</li><li>1已开启</li></ul> 
     * @return Enable <p>总开关</p><ul><li>0 未开启</li><li>1已开启</li></ul>
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>总开关</p><ul><li>0 未开启</li><li>1已开启</li></ul>
     * @param Enable <p>总开关</p><ul><li>0 未开启</li><li>1已开启</li></ul>
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>漏洞防御开关</p><ul><li>0 未开启</li><li>1 开启</li></ul> 
     * @return VulDefEnable <p>漏洞防御开关</p><ul><li>0 未开启</li><li>1 开启</li></ul>
     */
    public Long getVulDefEnable() {
        return this.VulDefEnable;
    }

    /**
     * Set <p>漏洞防御开关</p><ul><li>0 未开启</li><li>1 开启</li></ul>
     * @param VulDefEnable <p>漏洞防御开关</p><ul><li>0 未开启</li><li>1 开启</li></ul>
     */
    public void setVulDefEnable(Long VulDefEnable) {
        this.VulDefEnable = VulDefEnable;
    }

    /**
     * Get <p>漏洞防御模式</p><ul><li>0 标准</li><li>1 重保</li></ul> 
     * @return VulDefMode <p>漏洞防御模式</p><ul><li>0 标准</li><li>1 重保</li></ul>
     */
    public Long getVulDefMode() {
        return this.VulDefMode;
    }

    /**
     * Set <p>漏洞防御模式</p><ul><li>0 标准</li><li>1 重保</li></ul>
     * @param VulDefMode <p>漏洞防御模式</p><ul><li>0 标准</li><li>1 重保</li></ul>
     */
    public void setVulDefMode(Long VulDefMode) {
        this.VulDefMode = VulDefMode;
    }

    /**
     * Get <p>漏洞防御动作</p><ul><li>0 仅检测</li><li>1 检测+防御</li></ul> 
     * @return VulDefAction <p>漏洞防御动作</p><ul><li>0 仅检测</li><li>1 检测+防御</li></ul>
     */
    public Long getVulDefAction() {
        return this.VulDefAction;
    }

    /**
     * Set <p>漏洞防御动作</p><ul><li>0 仅检测</li><li>1 检测+防御</li></ul>
     * @param VulDefAction <p>漏洞防御动作</p><ul><li>0 仅检测</li><li>1 检测+防御</li></ul>
     */
    public void setVulDefAction(Long VulDefAction) {
        this.VulDefAction = VulDefAction;
    }

    /**
     * Get <p>内存马防御开关</p><ul><li>0 未开启</li><li>1 开启</li></ul> 
     * @return MemShellDefEnable <p>内存马防御开关</p><ul><li>0 未开启</li><li>1 开启</li></ul>
     */
    public Long getMemShellDefEnable() {
        return this.MemShellDefEnable;
    }

    /**
     * Set <p>内存马防御开关</p><ul><li>0 未开启</li><li>1 开启</li></ul>
     * @param MemShellDefEnable <p>内存马防御开关</p><ul><li>0 未开启</li><li>1 开启</li></ul>
     */
    public void setMemShellDefEnable(Long MemShellDefEnable) {
        this.MemShellDefEnable = MemShellDefEnable;
    }

    /**
     * Get <p>更多防护</p><ul><li>0 不注入会重启的进程 </li><li>1 注入会重启的进程</li></ul> 
     * @return SafeInject <p>更多防护</p><ul><li>0 不注入会重启的进程 </li><li>1 注入会重启的进程</li></ul>
     */
    public Long getSafeInject() {
        return this.SafeInject;
    }

    /**
     * Set <p>更多防护</p><ul><li>0 不注入会重启的进程 </li><li>1 注入会重启的进程</li></ul>
     * @param SafeInject <p>更多防护</p><ul><li>0 不注入会重启的进程 </li><li>1 注入会重启的进程</li></ul>
     */
    public void setSafeInject(Long SafeInject) {
        this.SafeInject = SafeInject;
    }

    /**
     * Get <p>性能阈值配置开关</p><ul><li>0 未开启</li><li>1 开启</li></ul> 
     * @return PerformanceLimit <p>性能阈值配置开关</p><ul><li>0 未开启</li><li>1 开启</li></ul>
     */
    public Long getPerformanceLimit() {
        return this.PerformanceLimit;
    }

    /**
     * Set <p>性能阈值配置开关</p><ul><li>0 未开启</li><li>1 开启</li></ul>
     * @param PerformanceLimit <p>性能阈值配置开关</p><ul><li>0 未开启</li><li>1 开启</li></ul>
     */
    public void setPerformanceLimit(Long PerformanceLimit) {
        this.PerformanceLimit = PerformanceLimit;
    }

    /**
     * Get <p>CPU阈值,取值1-99</p> 
     * @return PerformanceLimitCpu <p>CPU阈值,取值1-99</p>
     */
    public Long getPerformanceLimitCpu() {
        return this.PerformanceLimitCpu;
    }

    /**
     * Set <p>CPU阈值,取值1-99</p>
     * @param PerformanceLimitCpu <p>CPU阈值,取值1-99</p>
     */
    public void setPerformanceLimitCpu(Long PerformanceLimitCpu) {
        this.PerformanceLimitCpu = PerformanceLimitCpu;
    }

    /**
     * Get <p>内存阈值,取值1-99</p> 
     * @return PerformanceLimitMem <p>内存阈值,取值1-99</p>
     */
    public Long getPerformanceLimitMem() {
        return this.PerformanceLimitMem;
    }

    /**
     * Set <p>内存阈值,取值1-99</p>
     * @param PerformanceLimitMem <p>内存阈值,取值1-99</p>
     */
    public void setPerformanceLimitMem(Long PerformanceLimitMem) {
        this.PerformanceLimitMem = PerformanceLimitMem;
    }

    /**
     * Get <p>内存剩余阈值</p> 
     * @return PerformanceLimitMemAmount <p>内存剩余阈值</p>
     */
    public Long getPerformanceLimitMemAmount() {
        return this.PerformanceLimitMemAmount;
    }

    /**
     * Set <p>内存剩余阈值</p>
     * @param PerformanceLimitMemAmount <p>内存剩余阈值</p>
     */
    public void setPerformanceLimitMemAmount(Long PerformanceLimitMemAmount) {
        this.PerformanceLimitMemAmount = PerformanceLimitMemAmount;
    }

    /**
     * Get <p>插件状态</p><ul><li>0 使用正常</li><li>1 存在异常</li><li>2 未使用</li></ul> 
     * @return RaspException <p>插件状态</p><ul><li>0 使用正常</li><li>1 存在异常</li><li>2 未使用</li></ul>
     */
    public Long getRaspException() {
        return this.RaspException;
    }

    /**
     * Set <p>插件状态</p><ul><li>0 使用正常</li><li>1 存在异常</li><li>2 未使用</li></ul>
     * @param RaspException <p>插件状态</p><ul><li>0 使用正常</li><li>1 存在异常</li><li>2 未使用</li></ul>
     */
    public void setRaspException(Long RaspException) {
        this.RaspException = RaspException;
    }

    /**
     * Get <p>最近更新时间</p> 
     * @return LatestUpdateTime <p>最近更新时间</p>
     */
    public String getLatestUpdateTime() {
        return this.LatestUpdateTime;
    }

    /**
     * Set <p>最近更新时间</p>
     * @param LatestUpdateTime <p>最近更新时间</p>
     */
    public void setLatestUpdateTime(String LatestUpdateTime) {
        this.LatestUpdateTime = LatestUpdateTime;
    }

    /**
     * Get <p>集群ID,仅容器资产有值</p> 
     * @return ClusterName <p>集群ID,仅容器资产有值</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>集群ID,仅容器资产有值</p>
     * @param ClusterName <p>集群ID,仅容器资产有值</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>集群名称,仅容器资产有值</p> 
     * @return ClusterId <p>集群名称,仅容器资产有值</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群名称,仅容器资产有值</p>
     * @param ClusterId <p>集群名称,仅容器资产有值</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>订单信息</p> 
     * @return OrderDetail <p>订单信息</p>
     */
    public OrderDetail getOrderDetail() {
        return this.OrderDetail;
    }

    /**
     * Set <p>订单信息</p>
     * @param OrderDetail <p>订单信息</p>
     */
    public void setOrderDetail(OrderDetail OrderDetail) {
        this.OrderDetail = OrderDetail;
    }

    /**
     * Get <p>是否允许解绑,fasle 不允许 true 允许</p> 
     * @return IsUnBind <p>是否允许解绑,fasle 不允许 true 允许</p>
     */
    public Boolean getIsUnBind() {
        return this.IsUnBind;
    }

    /**
     * Set <p>是否允许解绑,fasle 不允许 true 允许</p>
     * @param IsUnBind <p>是否允许解绑,fasle 不允许 true 允许</p>
     */
    public void setIsUnBind(Boolean IsUnBind) {
        this.IsUnBind = IsUnBind;
    }

    /**
     * Get <p>uuid 机器唯一ID,仅AssetType = CWP 时有值</p> 
     * @return UUID <p>uuid 机器唯一ID,仅AssetType = CWP 时有值</p>
     */
    public String getUUID() {
        return this.UUID;
    }

    /**
     * Set <p>uuid 机器唯一ID,仅AssetType = CWP 时有值</p>
     * @param UUID <p>uuid 机器唯一ID,仅AssetType = CWP 时有值</p>
     */
    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    /**
     * Get <p>无注入/注入失败原因</p><p>默认值：空</p><p>注入失败才会有值</p> 
     * @return Reason <p>无注入/注入失败原因</p><p>默认值：空</p><p>注入失败才会有值</p>
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set <p>无注入/注入失败原因</p><p>默认值：空</p><p>注入失败才会有值</p>
     * @param Reason <p>无注入/注入失败原因</p><p>默认值：空</p><p>注入失败才会有值</p>
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

