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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterAdvancedSettings extends AbstractModel {

    /**
    * 是否启用集群节点自动扩缩容(创建集群流程不支持开启此功能)
    */
    @SerializedName("AsEnabled")
    @Expose
    private Boolean AsEnabled;

    /**
    * 是否开启审计开关
    */
    @SerializedName("AuditEnabled")
    @Expose
    private Boolean AuditEnabled;

    /**
    * 审计日志上传到的topic
    */
    @SerializedName("AuditLogTopicId")
    @Expose
    private String AuditLogTopicId;

    /**
    * 审计日志上传到的logset日志集
    */
    @SerializedName("AuditLogsetId")
    @Expose
    private String AuditLogsetId;

    /**
    * 自定义模式下的基础pod数量
    */
    @SerializedName("BasePodNumber")
    @Expose
    private Long BasePodNumber;

    /**
    * 启用 CiliumMode 的模式，空值表示不启用，“clusterIP” 表示启用 Cilium 支持 ClusterIP
    */
    @SerializedName("CiliumMode")
    @Expose
    private String CiliumMode;

    /**
    * 集群使用的runtime类型，包括"docker"和"containerd"两种类型，默认为"docker"
    */
    @SerializedName("ContainerRuntime")
    @Expose
    private String ContainerRuntime;

    /**
    * 是否启用 DataPlaneV2（cilium替代kube-proxy） 
    */
    @SerializedName("DataPlaneV2")
    @Expose
    private Boolean DataPlaneV2;

    /**
    * 是否启用集群删除保护
    */
    @SerializedName("DeletionProtection")
    @Expose
    private Boolean DeletionProtection;

    /**
    * 是否开节点podCIDR大小的自定义模式
    */
    @SerializedName("EnableCustomizedPodCIDR")
    @Expose
    private Boolean EnableCustomizedPodCIDR;

    /**
    * 元数据拆分存储Etcd配置
    */
    @SerializedName("EtcdOverrideConfigs")
    @Expose
    private EtcdOverrideConfig [] EtcdOverrideConfigs;

    /**
    * 集群自定义参数
    */
    @SerializedName("ExtraArgs")
    @Expose
    private ClusterExtraArgs ExtraArgs;

    /**
    * 是否启用IPVS
    */
    @SerializedName("IPVS")
    @Expose
    private Boolean IPVS;

    /**
    * 集群VPC-CNI模式下是否是双栈集群，默认false，表明非双栈集群。
    */
    @SerializedName("IsDualStack")
    @Expose
    private Boolean IsDualStack;

    /**
    * 集群VPC-CNI模式是否为非固定IP，默认: FALSE 固定IP。
    */
    @SerializedName("IsNonStaticIpMode")
    @Expose
    private Boolean IsNonStaticIpMode;

    /**
    * 集群的网络代理模型，目前tke集群支持的网络代理模式有三种：iptables,ipvs,ipvs-bpf，此参数仅在使用ipvs-bpf模式时使用，三种网络模式的参数设置关系如下：
iptables模式：IPVS和KubeProxyMode都不设置
ipvs模式: 设置IPVS为true, KubeProxyMode不设置
ipvs-bpf模式: 设置KubeProxyMode为kube-proxy-bpf
使用ipvs-bpf的网络模式需要满足以下条件：
1. 集群版本必须为1.14及以上；
2. 系统镜像必须是: Tencent Linux 2.4；
    */
    @SerializedName("KubeProxyMode")
    @Expose
    private String KubeProxyMode;

    /**
    * 集群网络类型，默认为GR。
- GR: 全局路由
- VPC-CNI: VPC-CNI模式
- CiliumOverlay: CiliumOverlay模式
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * 集群中节点NodeName类型（包括 hostname,lan-ip两种形式，默认为lan-ip。如果开启了hostname模式，创建节点时需要设置HostName参数，并且InstanceName需要和HostName一致）
    */
    @SerializedName("NodeNameType")
    @Expose
    private String NodeNameType;

    /**
    * 是否开启QGPU共享
    */
    @SerializedName("QGPUShareEnable")
    @Expose
    private Boolean QGPUShareEnable;

    /**
    * 运行时版本
    */
    @SerializedName("RuntimeVersion")
    @Expose
    private String RuntimeVersion;

    /**
    * 区分共享网卡多IP模式和独立网卡模式，共享网卡多 IP 模式填写"tke-route-eni"，独立网卡模式填写"tke-direct-eni"，默认为共享网卡模式
    */
    @SerializedName("VpcCniType")
    @Expose
    private String VpcCniType;

    /**
     * Get 是否启用集群节点自动扩缩容(创建集群流程不支持开启此功能) 
     * @return AsEnabled 是否启用集群节点自动扩缩容(创建集群流程不支持开启此功能)
     */
    public Boolean getAsEnabled() {
        return this.AsEnabled;
    }

    /**
     * Set 是否启用集群节点自动扩缩容(创建集群流程不支持开启此功能)
     * @param AsEnabled 是否启用集群节点自动扩缩容(创建集群流程不支持开启此功能)
     */
    public void setAsEnabled(Boolean AsEnabled) {
        this.AsEnabled = AsEnabled;
    }

    /**
     * Get 是否开启审计开关 
     * @return AuditEnabled 是否开启审计开关
     */
    public Boolean getAuditEnabled() {
        return this.AuditEnabled;
    }

    /**
     * Set 是否开启审计开关
     * @param AuditEnabled 是否开启审计开关
     */
    public void setAuditEnabled(Boolean AuditEnabled) {
        this.AuditEnabled = AuditEnabled;
    }

    /**
     * Get 审计日志上传到的topic 
     * @return AuditLogTopicId 审计日志上传到的topic
     */
    public String getAuditLogTopicId() {
        return this.AuditLogTopicId;
    }

    /**
     * Set 审计日志上传到的topic
     * @param AuditLogTopicId 审计日志上传到的topic
     */
    public void setAuditLogTopicId(String AuditLogTopicId) {
        this.AuditLogTopicId = AuditLogTopicId;
    }

    /**
     * Get 审计日志上传到的logset日志集 
     * @return AuditLogsetId 审计日志上传到的logset日志集
     */
    public String getAuditLogsetId() {
        return this.AuditLogsetId;
    }

    /**
     * Set 审计日志上传到的logset日志集
     * @param AuditLogsetId 审计日志上传到的logset日志集
     */
    public void setAuditLogsetId(String AuditLogsetId) {
        this.AuditLogsetId = AuditLogsetId;
    }

    /**
     * Get 自定义模式下的基础pod数量 
     * @return BasePodNumber 自定义模式下的基础pod数量
     */
    public Long getBasePodNumber() {
        return this.BasePodNumber;
    }

    /**
     * Set 自定义模式下的基础pod数量
     * @param BasePodNumber 自定义模式下的基础pod数量
     */
    public void setBasePodNumber(Long BasePodNumber) {
        this.BasePodNumber = BasePodNumber;
    }

    /**
     * Get 启用 CiliumMode 的模式，空值表示不启用，“clusterIP” 表示启用 Cilium 支持 ClusterIP 
     * @return CiliumMode 启用 CiliumMode 的模式，空值表示不启用，“clusterIP” 表示启用 Cilium 支持 ClusterIP
     */
    public String getCiliumMode() {
        return this.CiliumMode;
    }

    /**
     * Set 启用 CiliumMode 的模式，空值表示不启用，“clusterIP” 表示启用 Cilium 支持 ClusterIP
     * @param CiliumMode 启用 CiliumMode 的模式，空值表示不启用，“clusterIP” 表示启用 Cilium 支持 ClusterIP
     */
    public void setCiliumMode(String CiliumMode) {
        this.CiliumMode = CiliumMode;
    }

    /**
     * Get 集群使用的runtime类型，包括"docker"和"containerd"两种类型，默认为"docker" 
     * @return ContainerRuntime 集群使用的runtime类型，包括"docker"和"containerd"两种类型，默认为"docker"
     */
    public String getContainerRuntime() {
        return this.ContainerRuntime;
    }

    /**
     * Set 集群使用的runtime类型，包括"docker"和"containerd"两种类型，默认为"docker"
     * @param ContainerRuntime 集群使用的runtime类型，包括"docker"和"containerd"两种类型，默认为"docker"
     */
    public void setContainerRuntime(String ContainerRuntime) {
        this.ContainerRuntime = ContainerRuntime;
    }

    /**
     * Get 是否启用 DataPlaneV2（cilium替代kube-proxy）  
     * @return DataPlaneV2 是否启用 DataPlaneV2（cilium替代kube-proxy） 
     */
    public Boolean getDataPlaneV2() {
        return this.DataPlaneV2;
    }

    /**
     * Set 是否启用 DataPlaneV2（cilium替代kube-proxy） 
     * @param DataPlaneV2 是否启用 DataPlaneV2（cilium替代kube-proxy） 
     */
    public void setDataPlaneV2(Boolean DataPlaneV2) {
        this.DataPlaneV2 = DataPlaneV2;
    }

    /**
     * Get 是否启用集群删除保护 
     * @return DeletionProtection 是否启用集群删除保护
     */
    public Boolean getDeletionProtection() {
        return this.DeletionProtection;
    }

    /**
     * Set 是否启用集群删除保护
     * @param DeletionProtection 是否启用集群删除保护
     */
    public void setDeletionProtection(Boolean DeletionProtection) {
        this.DeletionProtection = DeletionProtection;
    }

    /**
     * Get 是否开节点podCIDR大小的自定义模式 
     * @return EnableCustomizedPodCIDR 是否开节点podCIDR大小的自定义模式
     */
    public Boolean getEnableCustomizedPodCIDR() {
        return this.EnableCustomizedPodCIDR;
    }

    /**
     * Set 是否开节点podCIDR大小的自定义模式
     * @param EnableCustomizedPodCIDR 是否开节点podCIDR大小的自定义模式
     */
    public void setEnableCustomizedPodCIDR(Boolean EnableCustomizedPodCIDR) {
        this.EnableCustomizedPodCIDR = EnableCustomizedPodCIDR;
    }

    /**
     * Get 元数据拆分存储Etcd配置 
     * @return EtcdOverrideConfigs 元数据拆分存储Etcd配置
     */
    public EtcdOverrideConfig [] getEtcdOverrideConfigs() {
        return this.EtcdOverrideConfigs;
    }

    /**
     * Set 元数据拆分存储Etcd配置
     * @param EtcdOverrideConfigs 元数据拆分存储Etcd配置
     */
    public void setEtcdOverrideConfigs(EtcdOverrideConfig [] EtcdOverrideConfigs) {
        this.EtcdOverrideConfigs = EtcdOverrideConfigs;
    }

    /**
     * Get 集群自定义参数 
     * @return ExtraArgs 集群自定义参数
     */
    public ClusterExtraArgs getExtraArgs() {
        return this.ExtraArgs;
    }

    /**
     * Set 集群自定义参数
     * @param ExtraArgs 集群自定义参数
     */
    public void setExtraArgs(ClusterExtraArgs ExtraArgs) {
        this.ExtraArgs = ExtraArgs;
    }

    /**
     * Get 是否启用IPVS 
     * @return IPVS 是否启用IPVS
     */
    public Boolean getIPVS() {
        return this.IPVS;
    }

    /**
     * Set 是否启用IPVS
     * @param IPVS 是否启用IPVS
     */
    public void setIPVS(Boolean IPVS) {
        this.IPVS = IPVS;
    }

    /**
     * Get 集群VPC-CNI模式下是否是双栈集群，默认false，表明非双栈集群。 
     * @return IsDualStack 集群VPC-CNI模式下是否是双栈集群，默认false，表明非双栈集群。
     */
    public Boolean getIsDualStack() {
        return this.IsDualStack;
    }

    /**
     * Set 集群VPC-CNI模式下是否是双栈集群，默认false，表明非双栈集群。
     * @param IsDualStack 集群VPC-CNI模式下是否是双栈集群，默认false，表明非双栈集群。
     */
    public void setIsDualStack(Boolean IsDualStack) {
        this.IsDualStack = IsDualStack;
    }

    /**
     * Get 集群VPC-CNI模式是否为非固定IP，默认: FALSE 固定IP。 
     * @return IsNonStaticIpMode 集群VPC-CNI模式是否为非固定IP，默认: FALSE 固定IP。
     */
    public Boolean getIsNonStaticIpMode() {
        return this.IsNonStaticIpMode;
    }

    /**
     * Set 集群VPC-CNI模式是否为非固定IP，默认: FALSE 固定IP。
     * @param IsNonStaticIpMode 集群VPC-CNI模式是否为非固定IP，默认: FALSE 固定IP。
     */
    public void setIsNonStaticIpMode(Boolean IsNonStaticIpMode) {
        this.IsNonStaticIpMode = IsNonStaticIpMode;
    }

    /**
     * Get 集群的网络代理模型，目前tke集群支持的网络代理模式有三种：iptables,ipvs,ipvs-bpf，此参数仅在使用ipvs-bpf模式时使用，三种网络模式的参数设置关系如下：
iptables模式：IPVS和KubeProxyMode都不设置
ipvs模式: 设置IPVS为true, KubeProxyMode不设置
ipvs-bpf模式: 设置KubeProxyMode为kube-proxy-bpf
使用ipvs-bpf的网络模式需要满足以下条件：
1. 集群版本必须为1.14及以上；
2. 系统镜像必须是: Tencent Linux 2.4； 
     * @return KubeProxyMode 集群的网络代理模型，目前tke集群支持的网络代理模式有三种：iptables,ipvs,ipvs-bpf，此参数仅在使用ipvs-bpf模式时使用，三种网络模式的参数设置关系如下：
iptables模式：IPVS和KubeProxyMode都不设置
ipvs模式: 设置IPVS为true, KubeProxyMode不设置
ipvs-bpf模式: 设置KubeProxyMode为kube-proxy-bpf
使用ipvs-bpf的网络模式需要满足以下条件：
1. 集群版本必须为1.14及以上；
2. 系统镜像必须是: Tencent Linux 2.4；
     */
    public String getKubeProxyMode() {
        return this.KubeProxyMode;
    }

    /**
     * Set 集群的网络代理模型，目前tke集群支持的网络代理模式有三种：iptables,ipvs,ipvs-bpf，此参数仅在使用ipvs-bpf模式时使用，三种网络模式的参数设置关系如下：
iptables模式：IPVS和KubeProxyMode都不设置
ipvs模式: 设置IPVS为true, KubeProxyMode不设置
ipvs-bpf模式: 设置KubeProxyMode为kube-proxy-bpf
使用ipvs-bpf的网络模式需要满足以下条件：
1. 集群版本必须为1.14及以上；
2. 系统镜像必须是: Tencent Linux 2.4；
     * @param KubeProxyMode 集群的网络代理模型，目前tke集群支持的网络代理模式有三种：iptables,ipvs,ipvs-bpf，此参数仅在使用ipvs-bpf模式时使用，三种网络模式的参数设置关系如下：
iptables模式：IPVS和KubeProxyMode都不设置
ipvs模式: 设置IPVS为true, KubeProxyMode不设置
ipvs-bpf模式: 设置KubeProxyMode为kube-proxy-bpf
使用ipvs-bpf的网络模式需要满足以下条件：
1. 集群版本必须为1.14及以上；
2. 系统镜像必须是: Tencent Linux 2.4；
     */
    public void setKubeProxyMode(String KubeProxyMode) {
        this.KubeProxyMode = KubeProxyMode;
    }

    /**
     * Get 集群网络类型，默认为GR。
- GR: 全局路由
- VPC-CNI: VPC-CNI模式
- CiliumOverlay: CiliumOverlay模式 
     * @return NetworkType 集群网络类型，默认为GR。
- GR: 全局路由
- VPC-CNI: VPC-CNI模式
- CiliumOverlay: CiliumOverlay模式
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set 集群网络类型，默认为GR。
- GR: 全局路由
- VPC-CNI: VPC-CNI模式
- CiliumOverlay: CiliumOverlay模式
     * @param NetworkType 集群网络类型，默认为GR。
- GR: 全局路由
- VPC-CNI: VPC-CNI模式
- CiliumOverlay: CiliumOverlay模式
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get 集群中节点NodeName类型（包括 hostname,lan-ip两种形式，默认为lan-ip。如果开启了hostname模式，创建节点时需要设置HostName参数，并且InstanceName需要和HostName一致） 
     * @return NodeNameType 集群中节点NodeName类型（包括 hostname,lan-ip两种形式，默认为lan-ip。如果开启了hostname模式，创建节点时需要设置HostName参数，并且InstanceName需要和HostName一致）
     */
    public String getNodeNameType() {
        return this.NodeNameType;
    }

    /**
     * Set 集群中节点NodeName类型（包括 hostname,lan-ip两种形式，默认为lan-ip。如果开启了hostname模式，创建节点时需要设置HostName参数，并且InstanceName需要和HostName一致）
     * @param NodeNameType 集群中节点NodeName类型（包括 hostname,lan-ip两种形式，默认为lan-ip。如果开启了hostname模式，创建节点时需要设置HostName参数，并且InstanceName需要和HostName一致）
     */
    public void setNodeNameType(String NodeNameType) {
        this.NodeNameType = NodeNameType;
    }

    /**
     * Get 是否开启QGPU共享 
     * @return QGPUShareEnable 是否开启QGPU共享
     */
    public Boolean getQGPUShareEnable() {
        return this.QGPUShareEnable;
    }

    /**
     * Set 是否开启QGPU共享
     * @param QGPUShareEnable 是否开启QGPU共享
     */
    public void setQGPUShareEnable(Boolean QGPUShareEnable) {
        this.QGPUShareEnable = QGPUShareEnable;
    }

    /**
     * Get 运行时版本 
     * @return RuntimeVersion 运行时版本
     */
    public String getRuntimeVersion() {
        return this.RuntimeVersion;
    }

    /**
     * Set 运行时版本
     * @param RuntimeVersion 运行时版本
     */
    public void setRuntimeVersion(String RuntimeVersion) {
        this.RuntimeVersion = RuntimeVersion;
    }

    /**
     * Get 区分共享网卡多IP模式和独立网卡模式，共享网卡多 IP 模式填写"tke-route-eni"，独立网卡模式填写"tke-direct-eni"，默认为共享网卡模式 
     * @return VpcCniType 区分共享网卡多IP模式和独立网卡模式，共享网卡多 IP 模式填写"tke-route-eni"，独立网卡模式填写"tke-direct-eni"，默认为共享网卡模式
     */
    public String getVpcCniType() {
        return this.VpcCniType;
    }

    /**
     * Set 区分共享网卡多IP模式和独立网卡模式，共享网卡多 IP 模式填写"tke-route-eni"，独立网卡模式填写"tke-direct-eni"，默认为共享网卡模式
     * @param VpcCniType 区分共享网卡多IP模式和独立网卡模式，共享网卡多 IP 模式填写"tke-route-eni"，独立网卡模式填写"tke-direct-eni"，默认为共享网卡模式
     */
    public void setVpcCniType(String VpcCniType) {
        this.VpcCniType = VpcCniType;
    }

    public ClusterAdvancedSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterAdvancedSettings(ClusterAdvancedSettings source) {
        if (source.AsEnabled != null) {
            this.AsEnabled = new Boolean(source.AsEnabled);
        }
        if (source.AuditEnabled != null) {
            this.AuditEnabled = new Boolean(source.AuditEnabled);
        }
        if (source.AuditLogTopicId != null) {
            this.AuditLogTopicId = new String(source.AuditLogTopicId);
        }
        if (source.AuditLogsetId != null) {
            this.AuditLogsetId = new String(source.AuditLogsetId);
        }
        if (source.BasePodNumber != null) {
            this.BasePodNumber = new Long(source.BasePodNumber);
        }
        if (source.CiliumMode != null) {
            this.CiliumMode = new String(source.CiliumMode);
        }
        if (source.ContainerRuntime != null) {
            this.ContainerRuntime = new String(source.ContainerRuntime);
        }
        if (source.DataPlaneV2 != null) {
            this.DataPlaneV2 = new Boolean(source.DataPlaneV2);
        }
        if (source.DeletionProtection != null) {
            this.DeletionProtection = new Boolean(source.DeletionProtection);
        }
        if (source.EnableCustomizedPodCIDR != null) {
            this.EnableCustomizedPodCIDR = new Boolean(source.EnableCustomizedPodCIDR);
        }
        if (source.EtcdOverrideConfigs != null) {
            this.EtcdOverrideConfigs = new EtcdOverrideConfig[source.EtcdOverrideConfigs.length];
            for (int i = 0; i < source.EtcdOverrideConfigs.length; i++) {
                this.EtcdOverrideConfigs[i] = new EtcdOverrideConfig(source.EtcdOverrideConfigs[i]);
            }
        }
        if (source.ExtraArgs != null) {
            this.ExtraArgs = new ClusterExtraArgs(source.ExtraArgs);
        }
        if (source.IPVS != null) {
            this.IPVS = new Boolean(source.IPVS);
        }
        if (source.IsDualStack != null) {
            this.IsDualStack = new Boolean(source.IsDualStack);
        }
        if (source.IsNonStaticIpMode != null) {
            this.IsNonStaticIpMode = new Boolean(source.IsNonStaticIpMode);
        }
        if (source.KubeProxyMode != null) {
            this.KubeProxyMode = new String(source.KubeProxyMode);
        }
        if (source.NetworkType != null) {
            this.NetworkType = new String(source.NetworkType);
        }
        if (source.NodeNameType != null) {
            this.NodeNameType = new String(source.NodeNameType);
        }
        if (source.QGPUShareEnable != null) {
            this.QGPUShareEnable = new Boolean(source.QGPUShareEnable);
        }
        if (source.RuntimeVersion != null) {
            this.RuntimeVersion = new String(source.RuntimeVersion);
        }
        if (source.VpcCniType != null) {
            this.VpcCniType = new String(source.VpcCniType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AsEnabled", this.AsEnabled);
        this.setParamSimple(map, prefix + "AuditEnabled", this.AuditEnabled);
        this.setParamSimple(map, prefix + "AuditLogTopicId", this.AuditLogTopicId);
        this.setParamSimple(map, prefix + "AuditLogsetId", this.AuditLogsetId);
        this.setParamSimple(map, prefix + "BasePodNumber", this.BasePodNumber);
        this.setParamSimple(map, prefix + "CiliumMode", this.CiliumMode);
        this.setParamSimple(map, prefix + "ContainerRuntime", this.ContainerRuntime);
        this.setParamSimple(map, prefix + "DataPlaneV2", this.DataPlaneV2);
        this.setParamSimple(map, prefix + "DeletionProtection", this.DeletionProtection);
        this.setParamSimple(map, prefix + "EnableCustomizedPodCIDR", this.EnableCustomizedPodCIDR);
        this.setParamArrayObj(map, prefix + "EtcdOverrideConfigs.", this.EtcdOverrideConfigs);
        this.setParamObj(map, prefix + "ExtraArgs.", this.ExtraArgs);
        this.setParamSimple(map, prefix + "IPVS", this.IPVS);
        this.setParamSimple(map, prefix + "IsDualStack", this.IsDualStack);
        this.setParamSimple(map, prefix + "IsNonStaticIpMode", this.IsNonStaticIpMode);
        this.setParamSimple(map, prefix + "KubeProxyMode", this.KubeProxyMode);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "NodeNameType", this.NodeNameType);
        this.setParamSimple(map, prefix + "QGPUShareEnable", this.QGPUShareEnable);
        this.setParamSimple(map, prefix + "RuntimeVersion", this.RuntimeVersion);
        this.setParamSimple(map, prefix + "VpcCniType", this.VpcCniType);

    }
}

