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
    * <p>是否启用集群节点自动扩缩容(创建集群流程不支持开启此功能)</p>
    */
    @SerializedName("AsEnabled")
    @Expose
    private Boolean AsEnabled;

    /**
    * <p>是否开启审计开关</p>
    */
    @SerializedName("AuditEnabled")
    @Expose
    private Boolean AuditEnabled;

    /**
    * <p>审计日志上传到的topic</p>
    */
    @SerializedName("AuditLogTopicId")
    @Expose
    private String AuditLogTopicId;

    /**
    * <p>审计日志上传到的logset日志集</p>
    */
    @SerializedName("AuditLogsetId")
    @Expose
    private String AuditLogsetId;

    /**
    * <p>自定义模式下的基础pod数量</p>
    */
    @SerializedName("BasePodNumber")
    @Expose
    private Long BasePodNumber;

    /**
    * <p>启用 CiliumMode 的模式，空值表示不启用，“clusterIP” 表示启用 Cilium 支持 ClusterIP</p>
    */
    @SerializedName("CiliumMode")
    @Expose
    private String CiliumMode;

    /**
    * <p>集群使用的runtime类型，包括&quot;docker&quot;和&quot;containerd&quot;两种类型，默认为&quot;docker&quot;</p>
    */
    @SerializedName("ContainerRuntime")
    @Expose
    private String ContainerRuntime;

    /**
    * <p>是否启用 DataPlaneV2（cilium替代kube-proxy）</p>
    */
    @SerializedName("DataPlaneV2")
    @Expose
    private Boolean DataPlaneV2;

    /**
    * <p>是否启用集群删除保护</p>
    */
    @SerializedName("DeletionProtection")
    @Expose
    private Boolean DeletionProtection;

    /**
    * <p>是否开节点podCIDR大小的自定义模式</p>
    */
    @SerializedName("EnableCustomizedPodCIDR")
    @Expose
    private Boolean EnableCustomizedPodCIDR;

    /**
    * <p>元数据拆分存储Etcd配置</p>
    */
    @SerializedName("EtcdOverrideConfigs")
    @Expose
    private EtcdOverrideConfig [] EtcdOverrideConfigs;

    /**
    * <p>集群自定义参数</p>
    */
    @SerializedName("ExtraArgs")
    @Expose
    private ClusterExtraArgs ExtraArgs;

    /**
    * <p>是否启用IPVS</p>
    */
    @SerializedName("IPVS")
    @Expose
    private Boolean IPVS;

    /**
    * <p>集群VPC-CNI模式下是否是双栈集群，默认false，表明非双栈集群。</p>
    */
    @SerializedName("IsDualStack")
    @Expose
    private Boolean IsDualStack;

    /**
    * <p>集群VPC-CNI模式是否为非固定IP，默认: FALSE 固定IP。</p>
    */
    @SerializedName("IsNonStaticIpMode")
    @Expose
    private Boolean IsNonStaticIpMode;

    /**
    * <p>集群的网络代理模型，目前tke集群支持的网络代理模式有三种：iptables,ipvs,ipvs-bpf，此参数仅在使用ipvs-bpf模式时使用，三种网络模式的参数设置关系如下：<br>iptables模式：IPVS和KubeProxyMode都不设置<br>ipvs模式: 设置IPVS为true, KubeProxyMode不设置<br>ipvs-bpf模式: 设置KubeProxyMode为kube-proxy-bpf<br>使用ipvs-bpf的网络模式需要满足以下条件：</p><ol><li>集群版本必须为1.14及以上；</li><li>系统镜像必须是: Tencent Linux 2.4；</li></ol>
    */
    @SerializedName("KubeProxyMode")
    @Expose
    private String KubeProxyMode;

    /**
    * <p>集群网络类型，默认为GR。</p><ul><li>GR: 全局路由</li><li>VPC-CNI: VPC-CNI模式</li><li>CiliumOverlay: CiliumOverlay模式</li></ul>
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * <p>集群中节点NodeName类型（包括 hostname,lan-ip两种形式，默认为lan-ip。如果开启了hostname模式，创建节点时需要设置HostName参数，并且InstanceName需要和HostName一致）</p>
    */
    @SerializedName("NodeNameType")
    @Expose
    private String NodeNameType;

    /**
    * <p>是否开启QGPU共享</p>
    */
    @SerializedName("QGPUShareEnable")
    @Expose
    private Boolean QGPUShareEnable;

    /**
    * <p>运行时版本</p>
    */
    @SerializedName("RuntimeVersion")
    @Expose
    private String RuntimeVersion;

    /**
    * <p>区分共享网卡多IP模式和独立网卡模式，共享网卡多 IP 模式填写&quot;tke-route-eni&quot;，独立网卡模式填写&quot;tke-direct-eni&quot;，默认为共享网卡模式</p>
    */
    @SerializedName("VpcCniType")
    @Expose
    private String VpcCniType;

    /**
    * <p>集群是否启用高可用模式。用于指导跨可用区资源打散等高可用策略的执行，默认为true</p>
    */
    @SerializedName("IsHighAvailability")
    @Expose
    private Boolean IsHighAvailability;

    /**
    * <p>集群安全模式配置</p>
    */
    @SerializedName("SecurityModeConfig")
    @Expose
    private SecurityModeConfig SecurityModeConfig;

    /**
     * Get <p>是否启用集群节点自动扩缩容(创建集群流程不支持开启此功能)</p> 
     * @return AsEnabled <p>是否启用集群节点自动扩缩容(创建集群流程不支持开启此功能)</p>
     */
    public Boolean getAsEnabled() {
        return this.AsEnabled;
    }

    /**
     * Set <p>是否启用集群节点自动扩缩容(创建集群流程不支持开启此功能)</p>
     * @param AsEnabled <p>是否启用集群节点自动扩缩容(创建集群流程不支持开启此功能)</p>
     */
    public void setAsEnabled(Boolean AsEnabled) {
        this.AsEnabled = AsEnabled;
    }

    /**
     * Get <p>是否开启审计开关</p> 
     * @return AuditEnabled <p>是否开启审计开关</p>
     */
    public Boolean getAuditEnabled() {
        return this.AuditEnabled;
    }

    /**
     * Set <p>是否开启审计开关</p>
     * @param AuditEnabled <p>是否开启审计开关</p>
     */
    public void setAuditEnabled(Boolean AuditEnabled) {
        this.AuditEnabled = AuditEnabled;
    }

    /**
     * Get <p>审计日志上传到的topic</p> 
     * @return AuditLogTopicId <p>审计日志上传到的topic</p>
     */
    public String getAuditLogTopicId() {
        return this.AuditLogTopicId;
    }

    /**
     * Set <p>审计日志上传到的topic</p>
     * @param AuditLogTopicId <p>审计日志上传到的topic</p>
     */
    public void setAuditLogTopicId(String AuditLogTopicId) {
        this.AuditLogTopicId = AuditLogTopicId;
    }

    /**
     * Get <p>审计日志上传到的logset日志集</p> 
     * @return AuditLogsetId <p>审计日志上传到的logset日志集</p>
     */
    public String getAuditLogsetId() {
        return this.AuditLogsetId;
    }

    /**
     * Set <p>审计日志上传到的logset日志集</p>
     * @param AuditLogsetId <p>审计日志上传到的logset日志集</p>
     */
    public void setAuditLogsetId(String AuditLogsetId) {
        this.AuditLogsetId = AuditLogsetId;
    }

    /**
     * Get <p>自定义模式下的基础pod数量</p> 
     * @return BasePodNumber <p>自定义模式下的基础pod数量</p>
     */
    public Long getBasePodNumber() {
        return this.BasePodNumber;
    }

    /**
     * Set <p>自定义模式下的基础pod数量</p>
     * @param BasePodNumber <p>自定义模式下的基础pod数量</p>
     */
    public void setBasePodNumber(Long BasePodNumber) {
        this.BasePodNumber = BasePodNumber;
    }

    /**
     * Get <p>启用 CiliumMode 的模式，空值表示不启用，“clusterIP” 表示启用 Cilium 支持 ClusterIP</p> 
     * @return CiliumMode <p>启用 CiliumMode 的模式，空值表示不启用，“clusterIP” 表示启用 Cilium 支持 ClusterIP</p>
     */
    public String getCiliumMode() {
        return this.CiliumMode;
    }

    /**
     * Set <p>启用 CiliumMode 的模式，空值表示不启用，“clusterIP” 表示启用 Cilium 支持 ClusterIP</p>
     * @param CiliumMode <p>启用 CiliumMode 的模式，空值表示不启用，“clusterIP” 表示启用 Cilium 支持 ClusterIP</p>
     */
    public void setCiliumMode(String CiliumMode) {
        this.CiliumMode = CiliumMode;
    }

    /**
     * Get <p>集群使用的runtime类型，包括&quot;docker&quot;和&quot;containerd&quot;两种类型，默认为&quot;docker&quot;</p> 
     * @return ContainerRuntime <p>集群使用的runtime类型，包括&quot;docker&quot;和&quot;containerd&quot;两种类型，默认为&quot;docker&quot;</p>
     */
    public String getContainerRuntime() {
        return this.ContainerRuntime;
    }

    /**
     * Set <p>集群使用的runtime类型，包括&quot;docker&quot;和&quot;containerd&quot;两种类型，默认为&quot;docker&quot;</p>
     * @param ContainerRuntime <p>集群使用的runtime类型，包括&quot;docker&quot;和&quot;containerd&quot;两种类型，默认为&quot;docker&quot;</p>
     */
    public void setContainerRuntime(String ContainerRuntime) {
        this.ContainerRuntime = ContainerRuntime;
    }

    /**
     * Get <p>是否启用 DataPlaneV2（cilium替代kube-proxy）</p> 
     * @return DataPlaneV2 <p>是否启用 DataPlaneV2（cilium替代kube-proxy）</p>
     */
    public Boolean getDataPlaneV2() {
        return this.DataPlaneV2;
    }

    /**
     * Set <p>是否启用 DataPlaneV2（cilium替代kube-proxy）</p>
     * @param DataPlaneV2 <p>是否启用 DataPlaneV2（cilium替代kube-proxy）</p>
     */
    public void setDataPlaneV2(Boolean DataPlaneV2) {
        this.DataPlaneV2 = DataPlaneV2;
    }

    /**
     * Get <p>是否启用集群删除保护</p> 
     * @return DeletionProtection <p>是否启用集群删除保护</p>
     */
    public Boolean getDeletionProtection() {
        return this.DeletionProtection;
    }

    /**
     * Set <p>是否启用集群删除保护</p>
     * @param DeletionProtection <p>是否启用集群删除保护</p>
     */
    public void setDeletionProtection(Boolean DeletionProtection) {
        this.DeletionProtection = DeletionProtection;
    }

    /**
     * Get <p>是否开节点podCIDR大小的自定义模式</p> 
     * @return EnableCustomizedPodCIDR <p>是否开节点podCIDR大小的自定义模式</p>
     */
    public Boolean getEnableCustomizedPodCIDR() {
        return this.EnableCustomizedPodCIDR;
    }

    /**
     * Set <p>是否开节点podCIDR大小的自定义模式</p>
     * @param EnableCustomizedPodCIDR <p>是否开节点podCIDR大小的自定义模式</p>
     */
    public void setEnableCustomizedPodCIDR(Boolean EnableCustomizedPodCIDR) {
        this.EnableCustomizedPodCIDR = EnableCustomizedPodCIDR;
    }

    /**
     * Get <p>元数据拆分存储Etcd配置</p> 
     * @return EtcdOverrideConfigs <p>元数据拆分存储Etcd配置</p>
     */
    public EtcdOverrideConfig [] getEtcdOverrideConfigs() {
        return this.EtcdOverrideConfigs;
    }

    /**
     * Set <p>元数据拆分存储Etcd配置</p>
     * @param EtcdOverrideConfigs <p>元数据拆分存储Etcd配置</p>
     */
    public void setEtcdOverrideConfigs(EtcdOverrideConfig [] EtcdOverrideConfigs) {
        this.EtcdOverrideConfigs = EtcdOverrideConfigs;
    }

    /**
     * Get <p>集群自定义参数</p> 
     * @return ExtraArgs <p>集群自定义参数</p>
     */
    public ClusterExtraArgs getExtraArgs() {
        return this.ExtraArgs;
    }

    /**
     * Set <p>集群自定义参数</p>
     * @param ExtraArgs <p>集群自定义参数</p>
     */
    public void setExtraArgs(ClusterExtraArgs ExtraArgs) {
        this.ExtraArgs = ExtraArgs;
    }

    /**
     * Get <p>是否启用IPVS</p> 
     * @return IPVS <p>是否启用IPVS</p>
     */
    public Boolean getIPVS() {
        return this.IPVS;
    }

    /**
     * Set <p>是否启用IPVS</p>
     * @param IPVS <p>是否启用IPVS</p>
     */
    public void setIPVS(Boolean IPVS) {
        this.IPVS = IPVS;
    }

    /**
     * Get <p>集群VPC-CNI模式下是否是双栈集群，默认false，表明非双栈集群。</p> 
     * @return IsDualStack <p>集群VPC-CNI模式下是否是双栈集群，默认false，表明非双栈集群。</p>
     */
    public Boolean getIsDualStack() {
        return this.IsDualStack;
    }

    /**
     * Set <p>集群VPC-CNI模式下是否是双栈集群，默认false，表明非双栈集群。</p>
     * @param IsDualStack <p>集群VPC-CNI模式下是否是双栈集群，默认false，表明非双栈集群。</p>
     */
    public void setIsDualStack(Boolean IsDualStack) {
        this.IsDualStack = IsDualStack;
    }

    /**
     * Get <p>集群VPC-CNI模式是否为非固定IP，默认: FALSE 固定IP。</p> 
     * @return IsNonStaticIpMode <p>集群VPC-CNI模式是否为非固定IP，默认: FALSE 固定IP。</p>
     */
    public Boolean getIsNonStaticIpMode() {
        return this.IsNonStaticIpMode;
    }

    /**
     * Set <p>集群VPC-CNI模式是否为非固定IP，默认: FALSE 固定IP。</p>
     * @param IsNonStaticIpMode <p>集群VPC-CNI模式是否为非固定IP，默认: FALSE 固定IP。</p>
     */
    public void setIsNonStaticIpMode(Boolean IsNonStaticIpMode) {
        this.IsNonStaticIpMode = IsNonStaticIpMode;
    }

    /**
     * Get <p>集群的网络代理模型，目前tke集群支持的网络代理模式有三种：iptables,ipvs,ipvs-bpf，此参数仅在使用ipvs-bpf模式时使用，三种网络模式的参数设置关系如下：<br>iptables模式：IPVS和KubeProxyMode都不设置<br>ipvs模式: 设置IPVS为true, KubeProxyMode不设置<br>ipvs-bpf模式: 设置KubeProxyMode为kube-proxy-bpf<br>使用ipvs-bpf的网络模式需要满足以下条件：</p><ol><li>集群版本必须为1.14及以上；</li><li>系统镜像必须是: Tencent Linux 2.4；</li></ol> 
     * @return KubeProxyMode <p>集群的网络代理模型，目前tke集群支持的网络代理模式有三种：iptables,ipvs,ipvs-bpf，此参数仅在使用ipvs-bpf模式时使用，三种网络模式的参数设置关系如下：<br>iptables模式：IPVS和KubeProxyMode都不设置<br>ipvs模式: 设置IPVS为true, KubeProxyMode不设置<br>ipvs-bpf模式: 设置KubeProxyMode为kube-proxy-bpf<br>使用ipvs-bpf的网络模式需要满足以下条件：</p><ol><li>集群版本必须为1.14及以上；</li><li>系统镜像必须是: Tencent Linux 2.4；</li></ol>
     */
    public String getKubeProxyMode() {
        return this.KubeProxyMode;
    }

    /**
     * Set <p>集群的网络代理模型，目前tke集群支持的网络代理模式有三种：iptables,ipvs,ipvs-bpf，此参数仅在使用ipvs-bpf模式时使用，三种网络模式的参数设置关系如下：<br>iptables模式：IPVS和KubeProxyMode都不设置<br>ipvs模式: 设置IPVS为true, KubeProxyMode不设置<br>ipvs-bpf模式: 设置KubeProxyMode为kube-proxy-bpf<br>使用ipvs-bpf的网络模式需要满足以下条件：</p><ol><li>集群版本必须为1.14及以上；</li><li>系统镜像必须是: Tencent Linux 2.4；</li></ol>
     * @param KubeProxyMode <p>集群的网络代理模型，目前tke集群支持的网络代理模式有三种：iptables,ipvs,ipvs-bpf，此参数仅在使用ipvs-bpf模式时使用，三种网络模式的参数设置关系如下：<br>iptables模式：IPVS和KubeProxyMode都不设置<br>ipvs模式: 设置IPVS为true, KubeProxyMode不设置<br>ipvs-bpf模式: 设置KubeProxyMode为kube-proxy-bpf<br>使用ipvs-bpf的网络模式需要满足以下条件：</p><ol><li>集群版本必须为1.14及以上；</li><li>系统镜像必须是: Tencent Linux 2.4；</li></ol>
     */
    public void setKubeProxyMode(String KubeProxyMode) {
        this.KubeProxyMode = KubeProxyMode;
    }

    /**
     * Get <p>集群网络类型，默认为GR。</p><ul><li>GR: 全局路由</li><li>VPC-CNI: VPC-CNI模式</li><li>CiliumOverlay: CiliumOverlay模式</li></ul> 
     * @return NetworkType <p>集群网络类型，默认为GR。</p><ul><li>GR: 全局路由</li><li>VPC-CNI: VPC-CNI模式</li><li>CiliumOverlay: CiliumOverlay模式</li></ul>
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set <p>集群网络类型，默认为GR。</p><ul><li>GR: 全局路由</li><li>VPC-CNI: VPC-CNI模式</li><li>CiliumOverlay: CiliumOverlay模式</li></ul>
     * @param NetworkType <p>集群网络类型，默认为GR。</p><ul><li>GR: 全局路由</li><li>VPC-CNI: VPC-CNI模式</li><li>CiliumOverlay: CiliumOverlay模式</li></ul>
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get <p>集群中节点NodeName类型（包括 hostname,lan-ip两种形式，默认为lan-ip。如果开启了hostname模式，创建节点时需要设置HostName参数，并且InstanceName需要和HostName一致）</p> 
     * @return NodeNameType <p>集群中节点NodeName类型（包括 hostname,lan-ip两种形式，默认为lan-ip。如果开启了hostname模式，创建节点时需要设置HostName参数，并且InstanceName需要和HostName一致）</p>
     */
    public String getNodeNameType() {
        return this.NodeNameType;
    }

    /**
     * Set <p>集群中节点NodeName类型（包括 hostname,lan-ip两种形式，默认为lan-ip。如果开启了hostname模式，创建节点时需要设置HostName参数，并且InstanceName需要和HostName一致）</p>
     * @param NodeNameType <p>集群中节点NodeName类型（包括 hostname,lan-ip两种形式，默认为lan-ip。如果开启了hostname模式，创建节点时需要设置HostName参数，并且InstanceName需要和HostName一致）</p>
     */
    public void setNodeNameType(String NodeNameType) {
        this.NodeNameType = NodeNameType;
    }

    /**
     * Get <p>是否开启QGPU共享</p> 
     * @return QGPUShareEnable <p>是否开启QGPU共享</p>
     */
    public Boolean getQGPUShareEnable() {
        return this.QGPUShareEnable;
    }

    /**
     * Set <p>是否开启QGPU共享</p>
     * @param QGPUShareEnable <p>是否开启QGPU共享</p>
     */
    public void setQGPUShareEnable(Boolean QGPUShareEnable) {
        this.QGPUShareEnable = QGPUShareEnable;
    }

    /**
     * Get <p>运行时版本</p> 
     * @return RuntimeVersion <p>运行时版本</p>
     */
    public String getRuntimeVersion() {
        return this.RuntimeVersion;
    }

    /**
     * Set <p>运行时版本</p>
     * @param RuntimeVersion <p>运行时版本</p>
     */
    public void setRuntimeVersion(String RuntimeVersion) {
        this.RuntimeVersion = RuntimeVersion;
    }

    /**
     * Get <p>区分共享网卡多IP模式和独立网卡模式，共享网卡多 IP 模式填写&quot;tke-route-eni&quot;，独立网卡模式填写&quot;tke-direct-eni&quot;，默认为共享网卡模式</p> 
     * @return VpcCniType <p>区分共享网卡多IP模式和独立网卡模式，共享网卡多 IP 模式填写&quot;tke-route-eni&quot;，独立网卡模式填写&quot;tke-direct-eni&quot;，默认为共享网卡模式</p>
     */
    public String getVpcCniType() {
        return this.VpcCniType;
    }

    /**
     * Set <p>区分共享网卡多IP模式和独立网卡模式，共享网卡多 IP 模式填写&quot;tke-route-eni&quot;，独立网卡模式填写&quot;tke-direct-eni&quot;，默认为共享网卡模式</p>
     * @param VpcCniType <p>区分共享网卡多IP模式和独立网卡模式，共享网卡多 IP 模式填写&quot;tke-route-eni&quot;，独立网卡模式填写&quot;tke-direct-eni&quot;，默认为共享网卡模式</p>
     */
    public void setVpcCniType(String VpcCniType) {
        this.VpcCniType = VpcCniType;
    }

    /**
     * Get <p>集群是否启用高可用模式。用于指导跨可用区资源打散等高可用策略的执行，默认为true</p> 
     * @return IsHighAvailability <p>集群是否启用高可用模式。用于指导跨可用区资源打散等高可用策略的执行，默认为true</p>
     */
    public Boolean getIsHighAvailability() {
        return this.IsHighAvailability;
    }

    /**
     * Set <p>集群是否启用高可用模式。用于指导跨可用区资源打散等高可用策略的执行，默认为true</p>
     * @param IsHighAvailability <p>集群是否启用高可用模式。用于指导跨可用区资源打散等高可用策略的执行，默认为true</p>
     */
    public void setIsHighAvailability(Boolean IsHighAvailability) {
        this.IsHighAvailability = IsHighAvailability;
    }

    /**
     * Get <p>集群安全模式配置</p> 
     * @return SecurityModeConfig <p>集群安全模式配置</p>
     */
    public SecurityModeConfig getSecurityModeConfig() {
        return this.SecurityModeConfig;
    }

    /**
     * Set <p>集群安全模式配置</p>
     * @param SecurityModeConfig <p>集群安全模式配置</p>
     */
    public void setSecurityModeConfig(SecurityModeConfig SecurityModeConfig) {
        this.SecurityModeConfig = SecurityModeConfig;
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
        if (source.IsHighAvailability != null) {
            this.IsHighAvailability = new Boolean(source.IsHighAvailability);
        }
        if (source.SecurityModeConfig != null) {
            this.SecurityModeConfig = new SecurityModeConfig(source.SecurityModeConfig);
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
        this.setParamSimple(map, prefix + "IsHighAvailability", this.IsHighAvailability);
        this.setParamObj(map, prefix + "SecurityModeConfig.", this.SecurityModeConfig);

    }
}

