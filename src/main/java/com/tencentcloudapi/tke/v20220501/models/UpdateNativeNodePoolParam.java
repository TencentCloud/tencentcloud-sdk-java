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
    * 伸缩配置
    */
    @SerializedName("Scaling")
    @Expose
    private MachineSetScaling Scaling;

    /**
    * 子网列表
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * 安全组列表
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * 自动升级配置
    */
    @SerializedName("UpgradeSettings")
    @Expose
    private MachineUpgradeSettings UpgradeSettings;

    /**
    * 是否开启自愈能力
    */
    @SerializedName("AutoRepair")
    @Expose
    private Boolean AutoRepair;

    /**
    * 节点计费类型变更
当前仅支持按量计费转包年包月：
- PREPAID

    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * 包年包月机型计费配置
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * 系统盘配置
    */
    @SerializedName("SystemDisk")
    @Expose
    private Disk SystemDisk;

    /**
    * Machine 系统配置
    */
    @SerializedName("Management")
    @Expose
    private ManagementConfig Management;

    /**
    * 故障自愈规则名称
    */
    @SerializedName("HealthCheckPolicyName")
    @Expose
    private String HealthCheckPolicyName;

    /**
    * 原生节点池hostName模式串
    */
    @SerializedName("HostNamePattern")
    @Expose
    private String HostNamePattern;

    /**
    * kubelet 自定义参数
    */
    @SerializedName("KubeletArgs")
    @Expose
    private String [] KubeletArgs;

    /**
    * 预定义脚本
    */
    @SerializedName("Lifecycle")
    @Expose
    private LifecycleConfig Lifecycle;

    /**
    * 运行时根目录
    */
    @SerializedName("RuntimeRootDir")
    @Expose
    private String RuntimeRootDir;

    /**
    * 是否开启弹性伸缩
    */
    @SerializedName("EnableAutoscaling")
    @Expose
    private Boolean EnableAutoscaling;

    /**
    * 机型列表
    */
    @SerializedName("InstanceTypes")
    @Expose
    private String [] InstanceTypes;

    /**
    * 期望节点数
    */
    @SerializedName("Replicas")
    @Expose
    private Long Replicas;

    /**
    * 数据盘列表
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

    /**
    * ssh公钥id数组
    */
    @SerializedName("KeyIds")
    @Expose
    private String [] KeyIds;

    /**
    * 节点池 GPU 配置
    */
    @SerializedName("GPUConfigs")
    @Expose
    private GPUConfig [] GPUConfigs;

    /**
     * Get 伸缩配置 
     * @return Scaling 伸缩配置
     */
    public MachineSetScaling getScaling() {
        return this.Scaling;
    }

    /**
     * Set 伸缩配置
     * @param Scaling 伸缩配置
     */
    public void setScaling(MachineSetScaling Scaling) {
        this.Scaling = Scaling;
    }

    /**
     * Get 子网列表 
     * @return SubnetIds 子网列表
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set 子网列表
     * @param SubnetIds 子网列表
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get 安全组列表 
     * @return SecurityGroupIds 安全组列表
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 安全组列表
     * @param SecurityGroupIds 安全组列表
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get 自动升级配置 
     * @return UpgradeSettings 自动升级配置
     */
    public MachineUpgradeSettings getUpgradeSettings() {
        return this.UpgradeSettings;
    }

    /**
     * Set 自动升级配置
     * @param UpgradeSettings 自动升级配置
     */
    public void setUpgradeSettings(MachineUpgradeSettings UpgradeSettings) {
        this.UpgradeSettings = UpgradeSettings;
    }

    /**
     * Get 是否开启自愈能力 
     * @return AutoRepair 是否开启自愈能力
     */
    public Boolean getAutoRepair() {
        return this.AutoRepair;
    }

    /**
     * Set 是否开启自愈能力
     * @param AutoRepair 是否开启自愈能力
     */
    public void setAutoRepair(Boolean AutoRepair) {
        this.AutoRepair = AutoRepair;
    }

    /**
     * Get 节点计费类型变更
当前仅支持按量计费转包年包月：
- PREPAID
 
     * @return InstanceChargeType 节点计费类型变更
当前仅支持按量计费转包年包月：
- PREPAID

     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set 节点计费类型变更
当前仅支持按量计费转包年包月：
- PREPAID

     * @param InstanceChargeType 节点计费类型变更
当前仅支持按量计费转包年包月：
- PREPAID

     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get 包年包月机型计费配置 
     * @return InstanceChargePrepaid 包年包月机型计费配置
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set 包年包月机型计费配置
     * @param InstanceChargePrepaid 包年包月机型计费配置
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get 系统盘配置 
     * @return SystemDisk 系统盘配置
     */
    public Disk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set 系统盘配置
     * @param SystemDisk 系统盘配置
     */
    public void setSystemDisk(Disk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get Machine 系统配置 
     * @return Management Machine 系统配置
     */
    public ManagementConfig getManagement() {
        return this.Management;
    }

    /**
     * Set Machine 系统配置
     * @param Management Machine 系统配置
     */
    public void setManagement(ManagementConfig Management) {
        this.Management = Management;
    }

    /**
     * Get 故障自愈规则名称 
     * @return HealthCheckPolicyName 故障自愈规则名称
     */
    public String getHealthCheckPolicyName() {
        return this.HealthCheckPolicyName;
    }

    /**
     * Set 故障自愈规则名称
     * @param HealthCheckPolicyName 故障自愈规则名称
     */
    public void setHealthCheckPolicyName(String HealthCheckPolicyName) {
        this.HealthCheckPolicyName = HealthCheckPolicyName;
    }

    /**
     * Get 原生节点池hostName模式串 
     * @return HostNamePattern 原生节点池hostName模式串
     */
    public String getHostNamePattern() {
        return this.HostNamePattern;
    }

    /**
     * Set 原生节点池hostName模式串
     * @param HostNamePattern 原生节点池hostName模式串
     */
    public void setHostNamePattern(String HostNamePattern) {
        this.HostNamePattern = HostNamePattern;
    }

    /**
     * Get kubelet 自定义参数 
     * @return KubeletArgs kubelet 自定义参数
     */
    public String [] getKubeletArgs() {
        return this.KubeletArgs;
    }

    /**
     * Set kubelet 自定义参数
     * @param KubeletArgs kubelet 自定义参数
     */
    public void setKubeletArgs(String [] KubeletArgs) {
        this.KubeletArgs = KubeletArgs;
    }

    /**
     * Get 预定义脚本 
     * @return Lifecycle 预定义脚本
     */
    public LifecycleConfig getLifecycle() {
        return this.Lifecycle;
    }

    /**
     * Set 预定义脚本
     * @param Lifecycle 预定义脚本
     */
    public void setLifecycle(LifecycleConfig Lifecycle) {
        this.Lifecycle = Lifecycle;
    }

    /**
     * Get 运行时根目录 
     * @return RuntimeRootDir 运行时根目录
     */
    public String getRuntimeRootDir() {
        return this.RuntimeRootDir;
    }

    /**
     * Set 运行时根目录
     * @param RuntimeRootDir 运行时根目录
     */
    public void setRuntimeRootDir(String RuntimeRootDir) {
        this.RuntimeRootDir = RuntimeRootDir;
    }

    /**
     * Get 是否开启弹性伸缩 
     * @return EnableAutoscaling 是否开启弹性伸缩
     */
    public Boolean getEnableAutoscaling() {
        return this.EnableAutoscaling;
    }

    /**
     * Set 是否开启弹性伸缩
     * @param EnableAutoscaling 是否开启弹性伸缩
     */
    public void setEnableAutoscaling(Boolean EnableAutoscaling) {
        this.EnableAutoscaling = EnableAutoscaling;
    }

    /**
     * Get 机型列表 
     * @return InstanceTypes 机型列表
     */
    public String [] getInstanceTypes() {
        return this.InstanceTypes;
    }

    /**
     * Set 机型列表
     * @param InstanceTypes 机型列表
     */
    public void setInstanceTypes(String [] InstanceTypes) {
        this.InstanceTypes = InstanceTypes;
    }

    /**
     * Get 期望节点数 
     * @return Replicas 期望节点数
     */
    public Long getReplicas() {
        return this.Replicas;
    }

    /**
     * Set 期望节点数
     * @param Replicas 期望节点数
     */
    public void setReplicas(Long Replicas) {
        this.Replicas = Replicas;
    }

    /**
     * Get 数据盘列表 
     * @return DataDisks 数据盘列表
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set 数据盘列表
     * @param DataDisks 数据盘列表
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * Get ssh公钥id数组 
     * @return KeyIds ssh公钥id数组
     */
    public String [] getKeyIds() {
        return this.KeyIds;
    }

    /**
     * Set ssh公钥id数组
     * @param KeyIds ssh公钥id数组
     */
    public void setKeyIds(String [] KeyIds) {
        this.KeyIds = KeyIds;
    }

    /**
     * Get 节点池 GPU 配置 
     * @return GPUConfigs 节点池 GPU 配置
     */
    public GPUConfig [] getGPUConfigs() {
        return this.GPUConfigs;
    }

    /**
     * Set 节点池 GPU 配置
     * @param GPUConfigs 节点池 GPU 配置
     */
    public void setGPUConfigs(GPUConfig [] GPUConfigs) {
        this.GPUConfigs = GPUConfigs;
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
        if (source.DataDisks != null) {
            this.DataDisks = new DataDisk[source.DataDisks.length];
            for (int i = 0; i < source.DataDisks.length; i++) {
                this.DataDisks[i] = new DataDisk(source.DataDisks[i]);
            }
        }
        if (source.KeyIds != null) {
            this.KeyIds = new String[source.KeyIds.length];
            for (int i = 0; i < source.KeyIds.length; i++) {
                this.KeyIds[i] = new String(source.KeyIds[i]);
            }
        }
        if (source.GPUConfigs != null) {
            this.GPUConfigs = new GPUConfig[source.GPUConfigs.length];
            for (int i = 0; i < source.GPUConfigs.length; i++) {
                this.GPUConfigs[i] = new GPUConfig(source.GPUConfigs[i]);
            }
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
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);
        this.setParamArraySimple(map, prefix + "KeyIds.", this.KeyIds);
        this.setParamArrayObj(map, prefix + "GPUConfigs.", this.GPUConfigs);

    }
}

