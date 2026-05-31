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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateNativeNodePoolParam extends AbstractModel {

    /**
    * <p>伸缩配置</p>
    */
    @SerializedName("Scaling")
    @Expose
    private MachineSetScaling Scaling;

    /**
    * <p>子网列表</p>
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * <p>安全组列表</p>
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * <p>自动升级配置</p>
    */
    @SerializedName("UpgradeSettings")
    @Expose
    private MachineUpgradeSettings UpgradeSettings;

    /**
    * <p>是否开启自愈能力</p>
    */
    @SerializedName("AutoRepair")
    @Expose
    private Boolean AutoRepair;

    /**
    * <p>计费类型</p><p>枚举值：</p><ul><li>POSTPAID_BY_HOUR： 目标计费类型为按量计费</li><li>PREPAID： 目标计费类型为包年包月计费</li></ul>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * <p>包年包月机型计费配置</p>
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * <p>系统盘配置</p>
    */
    @SerializedName("SystemDisk")
    @Expose
    private Disk SystemDisk;

    /**
    * <p>Machine 系统配置</p>
    */
    @SerializedName("Management")
    @Expose
    private ManagementConfig Management;

    /**
    * <p>故障自愈规则名称</p>
    */
    @SerializedName("HealthCheckPolicyName")
    @Expose
    private String HealthCheckPolicyName;

    /**
    * <p>原生节点池hostName模式串</p>
    */
    @SerializedName("HostNamePattern")
    @Expose
    private String HostNamePattern;

    /**
    * <p>kubelet 自定义参数</p>
    */
    @SerializedName("KubeletArgs")
    @Expose
    private String [] KubeletArgs;

    /**
    * <p>预定义脚本</p>
    */
    @SerializedName("Lifecycle")
    @Expose
    private LifecycleConfig Lifecycle;

    /**
    * <p>运行时根目录</p>
    */
    @SerializedName("RuntimeRootDir")
    @Expose
    private String RuntimeRootDir;

    /**
    * <p>是否开启弹性伸缩</p>
    */
    @SerializedName("EnableAutoscaling")
    @Expose
    private Boolean EnableAutoscaling;

    /**
    * <p>机型列表</p>
    */
    @SerializedName("InstanceTypes")
    @Expose
    private String [] InstanceTypes;

    /**
    * <p>期望节点数</p>
    */
    @SerializedName("Replicas")
    @Expose
    private Long Replicas;

    /**
    * <p>是否更新存量节点MetaData(包括： metadata、annotation、label)</p>
    */
    @SerializedName("UpdateExistedNode")
    @Expose
    private Boolean UpdateExistedNode;

    /**
    * <p>数据盘列表</p>
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

    /**
    * <p>节点management参数存量更新开关，有enable（打开）、disable（关闭）两个状态可选</p><p>management包括：nameserver、host、kubelet、kernel参数</p>
    */
    @SerializedName("UpdateMachineManagement")
    @Expose
    private String UpdateMachineManagement;

    /**
    * <p>ssh公钥id数组</p>
    */
    @SerializedName("KeyIds")
    @Expose
    private String [] KeyIds;

    /**
    * <p>节点移出策略，有Random（随机）、Newest（优先移出最新实例）、Oldest（优先移出最旧实例）三种可选，默认是Newest</p>
    */
    @SerializedName("DeletePolicy")
    @Expose
    private String DeletePolicy;

    /**
    * <p>节点池 GPU 配置</p>
    */
    @SerializedName("GPUConfigs")
    @Expose
    private GPUConfig [] GPUConfigs;

    /**
    * <p>原生节点池安装自动化助手开关状态</p>
    */
    @SerializedName("AutomationService")
    @Expose
    private Boolean AutomationService;

    /**
    * <p>原生节点池密码</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * Get <p>伸缩配置</p> 
     * @return Scaling <p>伸缩配置</p>
     */
    public MachineSetScaling getScaling() {
        return this.Scaling;
    }

    /**
     * Set <p>伸缩配置</p>
     * @param Scaling <p>伸缩配置</p>
     */
    public void setScaling(MachineSetScaling Scaling) {
        this.Scaling = Scaling;
    }

    /**
     * Get <p>子网列表</p> 
     * @return SubnetIds <p>子网列表</p>
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set <p>子网列表</p>
     * @param SubnetIds <p>子网列表</p>
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get <p>安全组列表</p> 
     * @return SecurityGroupIds <p>安全组列表</p>
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>安全组列表</p>
     * @param SecurityGroupIds <p>安全组列表</p>
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get <p>自动升级配置</p> 
     * @return UpgradeSettings <p>自动升级配置</p>
     */
    public MachineUpgradeSettings getUpgradeSettings() {
        return this.UpgradeSettings;
    }

    /**
     * Set <p>自动升级配置</p>
     * @param UpgradeSettings <p>自动升级配置</p>
     */
    public void setUpgradeSettings(MachineUpgradeSettings UpgradeSettings) {
        this.UpgradeSettings = UpgradeSettings;
    }

    /**
     * Get <p>是否开启自愈能力</p> 
     * @return AutoRepair <p>是否开启自愈能力</p>
     */
    public Boolean getAutoRepair() {
        return this.AutoRepair;
    }

    /**
     * Set <p>是否开启自愈能力</p>
     * @param AutoRepair <p>是否开启自愈能力</p>
     */
    public void setAutoRepair(Boolean AutoRepair) {
        this.AutoRepair = AutoRepair;
    }

    /**
     * Get <p>计费类型</p><p>枚举值：</p><ul><li>POSTPAID_BY_HOUR： 目标计费类型为按量计费</li><li>PREPAID： 目标计费类型为包年包月计费</li></ul> 
     * @return InstanceChargeType <p>计费类型</p><p>枚举值：</p><ul><li>POSTPAID_BY_HOUR： 目标计费类型为按量计费</li><li>PREPAID： 目标计费类型为包年包月计费</li></ul>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set <p>计费类型</p><p>枚举值：</p><ul><li>POSTPAID_BY_HOUR： 目标计费类型为按量计费</li><li>PREPAID： 目标计费类型为包年包月计费</li></ul>
     * @param InstanceChargeType <p>计费类型</p><p>枚举值：</p><ul><li>POSTPAID_BY_HOUR： 目标计费类型为按量计费</li><li>PREPAID： 目标计费类型为包年包月计费</li></ul>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get <p>包年包月机型计费配置</p> 
     * @return InstanceChargePrepaid <p>包年包月机型计费配置</p>
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set <p>包年包月机型计费配置</p>
     * @param InstanceChargePrepaid <p>包年包月机型计费配置</p>
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get <p>系统盘配置</p> 
     * @return SystemDisk <p>系统盘配置</p>
     */
    public Disk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set <p>系统盘配置</p>
     * @param SystemDisk <p>系统盘配置</p>
     */
    public void setSystemDisk(Disk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get <p>Machine 系统配置</p> 
     * @return Management <p>Machine 系统配置</p>
     */
    public ManagementConfig getManagement() {
        return this.Management;
    }

    /**
     * Set <p>Machine 系统配置</p>
     * @param Management <p>Machine 系统配置</p>
     */
    public void setManagement(ManagementConfig Management) {
        this.Management = Management;
    }

    /**
     * Get <p>故障自愈规则名称</p> 
     * @return HealthCheckPolicyName <p>故障自愈规则名称</p>
     */
    public String getHealthCheckPolicyName() {
        return this.HealthCheckPolicyName;
    }

    /**
     * Set <p>故障自愈规则名称</p>
     * @param HealthCheckPolicyName <p>故障自愈规则名称</p>
     */
    public void setHealthCheckPolicyName(String HealthCheckPolicyName) {
        this.HealthCheckPolicyName = HealthCheckPolicyName;
    }

    /**
     * Get <p>原生节点池hostName模式串</p> 
     * @return HostNamePattern <p>原生节点池hostName模式串</p>
     */
    public String getHostNamePattern() {
        return this.HostNamePattern;
    }

    /**
     * Set <p>原生节点池hostName模式串</p>
     * @param HostNamePattern <p>原生节点池hostName模式串</p>
     */
    public void setHostNamePattern(String HostNamePattern) {
        this.HostNamePattern = HostNamePattern;
    }

    /**
     * Get <p>kubelet 自定义参数</p> 
     * @return KubeletArgs <p>kubelet 自定义参数</p>
     */
    public String [] getKubeletArgs() {
        return this.KubeletArgs;
    }

    /**
     * Set <p>kubelet 自定义参数</p>
     * @param KubeletArgs <p>kubelet 自定义参数</p>
     */
    public void setKubeletArgs(String [] KubeletArgs) {
        this.KubeletArgs = KubeletArgs;
    }

    /**
     * Get <p>预定义脚本</p> 
     * @return Lifecycle <p>预定义脚本</p>
     */
    public LifecycleConfig getLifecycle() {
        return this.Lifecycle;
    }

    /**
     * Set <p>预定义脚本</p>
     * @param Lifecycle <p>预定义脚本</p>
     */
    public void setLifecycle(LifecycleConfig Lifecycle) {
        this.Lifecycle = Lifecycle;
    }

    /**
     * Get <p>运行时根目录</p> 
     * @return RuntimeRootDir <p>运行时根目录</p>
     */
    public String getRuntimeRootDir() {
        return this.RuntimeRootDir;
    }

    /**
     * Set <p>运行时根目录</p>
     * @param RuntimeRootDir <p>运行时根目录</p>
     */
    public void setRuntimeRootDir(String RuntimeRootDir) {
        this.RuntimeRootDir = RuntimeRootDir;
    }

    /**
     * Get <p>是否开启弹性伸缩</p> 
     * @return EnableAutoscaling <p>是否开启弹性伸缩</p>
     */
    public Boolean getEnableAutoscaling() {
        return this.EnableAutoscaling;
    }

    /**
     * Set <p>是否开启弹性伸缩</p>
     * @param EnableAutoscaling <p>是否开启弹性伸缩</p>
     */
    public void setEnableAutoscaling(Boolean EnableAutoscaling) {
        this.EnableAutoscaling = EnableAutoscaling;
    }

    /**
     * Get <p>机型列表</p> 
     * @return InstanceTypes <p>机型列表</p>
     */
    public String [] getInstanceTypes() {
        return this.InstanceTypes;
    }

    /**
     * Set <p>机型列表</p>
     * @param InstanceTypes <p>机型列表</p>
     */
    public void setInstanceTypes(String [] InstanceTypes) {
        this.InstanceTypes = InstanceTypes;
    }

    /**
     * Get <p>期望节点数</p> 
     * @return Replicas <p>期望节点数</p>
     */
    public Long getReplicas() {
        return this.Replicas;
    }

    /**
     * Set <p>期望节点数</p>
     * @param Replicas <p>期望节点数</p>
     */
    public void setReplicas(Long Replicas) {
        this.Replicas = Replicas;
    }

    /**
     * Get <p>是否更新存量节点MetaData(包括： metadata、annotation、label)</p> 
     * @return UpdateExistedNode <p>是否更新存量节点MetaData(包括： metadata、annotation、label)</p>
     */
    public Boolean getUpdateExistedNode() {
        return this.UpdateExistedNode;
    }

    /**
     * Set <p>是否更新存量节点MetaData(包括： metadata、annotation、label)</p>
     * @param UpdateExistedNode <p>是否更新存量节点MetaData(包括： metadata、annotation、label)</p>
     */
    public void setUpdateExistedNode(Boolean UpdateExistedNode) {
        this.UpdateExistedNode = UpdateExistedNode;
    }

    /**
     * Get <p>数据盘列表</p> 
     * @return DataDisks <p>数据盘列表</p>
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set <p>数据盘列表</p>
     * @param DataDisks <p>数据盘列表</p>
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * Get <p>节点management参数存量更新开关，有enable（打开）、disable（关闭）两个状态可选</p><p>management包括：nameserver、host、kubelet、kernel参数</p> 
     * @return UpdateMachineManagement <p>节点management参数存量更新开关，有enable（打开）、disable（关闭）两个状态可选</p><p>management包括：nameserver、host、kubelet、kernel参数</p>
     */
    public String getUpdateMachineManagement() {
        return this.UpdateMachineManagement;
    }

    /**
     * Set <p>节点management参数存量更新开关，有enable（打开）、disable（关闭）两个状态可选</p><p>management包括：nameserver、host、kubelet、kernel参数</p>
     * @param UpdateMachineManagement <p>节点management参数存量更新开关，有enable（打开）、disable（关闭）两个状态可选</p><p>management包括：nameserver、host、kubelet、kernel参数</p>
     */
    public void setUpdateMachineManagement(String UpdateMachineManagement) {
        this.UpdateMachineManagement = UpdateMachineManagement;
    }

    /**
     * Get <p>ssh公钥id数组</p> 
     * @return KeyIds <p>ssh公钥id数组</p>
     */
    public String [] getKeyIds() {
        return this.KeyIds;
    }

    /**
     * Set <p>ssh公钥id数组</p>
     * @param KeyIds <p>ssh公钥id数组</p>
     */
    public void setKeyIds(String [] KeyIds) {
        this.KeyIds = KeyIds;
    }

    /**
     * Get <p>节点移出策略，有Random（随机）、Newest（优先移出最新实例）、Oldest（优先移出最旧实例）三种可选，默认是Newest</p> 
     * @return DeletePolicy <p>节点移出策略，有Random（随机）、Newest（优先移出最新实例）、Oldest（优先移出最旧实例）三种可选，默认是Newest</p>
     */
    public String getDeletePolicy() {
        return this.DeletePolicy;
    }

    /**
     * Set <p>节点移出策略，有Random（随机）、Newest（优先移出最新实例）、Oldest（优先移出最旧实例）三种可选，默认是Newest</p>
     * @param DeletePolicy <p>节点移出策略，有Random（随机）、Newest（优先移出最新实例）、Oldest（优先移出最旧实例）三种可选，默认是Newest</p>
     */
    public void setDeletePolicy(String DeletePolicy) {
        this.DeletePolicy = DeletePolicy;
    }

    /**
     * Get <p>节点池 GPU 配置</p> 
     * @return GPUConfigs <p>节点池 GPU 配置</p>
     */
    public GPUConfig [] getGPUConfigs() {
        return this.GPUConfigs;
    }

    /**
     * Set <p>节点池 GPU 配置</p>
     * @param GPUConfigs <p>节点池 GPU 配置</p>
     */
    public void setGPUConfigs(GPUConfig [] GPUConfigs) {
        this.GPUConfigs = GPUConfigs;
    }

    /**
     * Get <p>原生节点池安装自动化助手开关状态</p> 
     * @return AutomationService <p>原生节点池安装自动化助手开关状态</p>
     */
    public Boolean getAutomationService() {
        return this.AutomationService;
    }

    /**
     * Set <p>原生节点池安装自动化助手开关状态</p>
     * @param AutomationService <p>原生节点池安装自动化助手开关状态</p>
     */
    public void setAutomationService(Boolean AutomationService) {
        this.AutomationService = AutomationService;
    }

    /**
     * Get <p>原生节点池密码</p> 
     * @return Password <p>原生节点池密码</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>原生节点池密码</p>
     * @param Password <p>原生节点池密码</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public UpdateNativeNodePoolParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateNativeNodePoolParam(UpdateNativeNodePoolParam source) {
        if (source.Scaling != null) {
            this.Scaling = new MachineSetScaling(source.Scaling);
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new String[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new String(source.SubnetIds[i]);
            }
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.UpgradeSettings != null) {
            this.UpgradeSettings = new MachineUpgradeSettings(source.UpgradeSettings);
        }
        if (source.AutoRepair != null) {
            this.AutoRepair = new Boolean(source.AutoRepair);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.InstanceChargePrepaid != null) {
            this.InstanceChargePrepaid = new InstanceChargePrepaid(source.InstanceChargePrepaid);
        }
        if (source.SystemDisk != null) {
            this.SystemDisk = new Disk(source.SystemDisk);
        }
        if (source.Management != null) {
            this.Management = new ManagementConfig(source.Management);
        }
        if (source.HealthCheckPolicyName != null) {
            this.HealthCheckPolicyName = new String(source.HealthCheckPolicyName);
        }
        if (source.HostNamePattern != null) {
            this.HostNamePattern = new String(source.HostNamePattern);
        }
        if (source.KubeletArgs != null) {
            this.KubeletArgs = new String[source.KubeletArgs.length];
            for (int i = 0; i < source.KubeletArgs.length; i++) {
                this.KubeletArgs[i] = new String(source.KubeletArgs[i]);
            }
        }
        if (source.Lifecycle != null) {
            this.Lifecycle = new LifecycleConfig(source.Lifecycle);
        }
        if (source.RuntimeRootDir != null) {
            this.RuntimeRootDir = new String(source.RuntimeRootDir);
        }
        if (source.EnableAutoscaling != null) {
            this.EnableAutoscaling = new Boolean(source.EnableAutoscaling);
        }
        if (source.InstanceTypes != null) {
            this.InstanceTypes = new String[source.InstanceTypes.length];
            for (int i = 0; i < source.InstanceTypes.length; i++) {
                this.InstanceTypes[i] = new String(source.InstanceTypes[i]);
            }
        }
        if (source.Replicas != null) {
            this.Replicas = new Long(source.Replicas);
        }
        if (source.UpdateExistedNode != null) {
            this.UpdateExistedNode = new Boolean(source.UpdateExistedNode);
        }
        if (source.DataDisks != null) {
            this.DataDisks = new DataDisk[source.DataDisks.length];
            for (int i = 0; i < source.DataDisks.length; i++) {
                this.DataDisks[i] = new DataDisk(source.DataDisks[i]);
            }
        }
        if (source.UpdateMachineManagement != null) {
            this.UpdateMachineManagement = new String(source.UpdateMachineManagement);
        }
        if (source.KeyIds != null) {
            this.KeyIds = new String[source.KeyIds.length];
            for (int i = 0; i < source.KeyIds.length; i++) {
                this.KeyIds[i] = new String(source.KeyIds[i]);
            }
        }
        if (source.DeletePolicy != null) {
            this.DeletePolicy = new String(source.DeletePolicy);
        }
        if (source.GPUConfigs != null) {
            this.GPUConfigs = new GPUConfig[source.GPUConfigs.length];
            for (int i = 0; i < source.GPUConfigs.length; i++) {
                this.GPUConfigs[i] = new GPUConfig(source.GPUConfigs[i]);
            }
        }
        if (source.AutomationService != null) {
            this.AutomationService = new Boolean(source.AutomationService);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Scaling.", this.Scaling);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamObj(map, prefix + "UpgradeSettings.", this.UpgradeSettings);
        this.setParamSimple(map, prefix + "AutoRepair", this.AutoRepair);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamObj(map, prefix + "Management.", this.Management);
        this.setParamSimple(map, prefix + "HealthCheckPolicyName", this.HealthCheckPolicyName);
        this.setParamSimple(map, prefix + "HostNamePattern", this.HostNamePattern);
        this.setParamArraySimple(map, prefix + "KubeletArgs.", this.KubeletArgs);
        this.setParamObj(map, prefix + "Lifecycle.", this.Lifecycle);
        this.setParamSimple(map, prefix + "RuntimeRootDir", this.RuntimeRootDir);
        this.setParamSimple(map, prefix + "EnableAutoscaling", this.EnableAutoscaling);
        this.setParamArraySimple(map, prefix + "InstanceTypes.", this.InstanceTypes);
        this.setParamSimple(map, prefix + "Replicas", this.Replicas);
        this.setParamSimple(map, prefix + "UpdateExistedNode", this.UpdateExistedNode);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);
        this.setParamSimple(map, prefix + "UpdateMachineManagement", this.UpdateMachineManagement);
        this.setParamArraySimple(map, prefix + "KeyIds.", this.KeyIds);
        this.setParamSimple(map, prefix + "DeletePolicy", this.DeletePolicy);
        this.setParamArrayObj(map, prefix + "GPUConfigs.", this.GPUConfigs);
        this.setParamSimple(map, prefix + "AutomationService", this.AutomationService);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

