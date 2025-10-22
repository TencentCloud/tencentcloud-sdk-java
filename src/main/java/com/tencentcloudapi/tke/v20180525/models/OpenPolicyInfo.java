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

public class OpenPolicyInfo extends AbstractModel {

    /**
    * 策略分类：cluster集群策略、node节点策略、namespace命名空间策略、configuration配置相关策略、compute计算资源策略、storage存储资源策略、network网络资源策略
    */
    @SerializedName("PolicyCategory")
    @Expose
    private String PolicyCategory;

    /**
    * 策略中文名称
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 策略描述
    */
    @SerializedName("PolicyDesc")
    @Expose
    private String PolicyDesc;

    /**
    * 策略运行模式：dryrun空跑不生效，deny拦截生效
    */
    @SerializedName("EnforcementAction")
    @Expose
    private String EnforcementAction;

    /**
    * 关联的事件数量(最近7d)
    */
    @SerializedName("EventNums")
    @Expose
    private Long EventNums;

    /**
    * 策略英文名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 策略模板类型，支持的类型如下：
优选策略：
blocknamespacedeletion：存在pod的命名空间不允许删除
blockcrddeletion：存在cr的crd不允许删除
blockmountablevolumetype：禁止挂载指定的volume类型
disallowalwayspullimage：禁止镜像拉取策略使用Always
tkeallowedrepos：容器镜像来源限制
blockunknowndaemonset：禁止未知的DaemonSet部署
blockpvdeletion：PV处于绑定状态则不允许删除
corednsprotect：CoreDNS组件删除保护
blockschedulablenodedelete：非封锁状态的Node不允许删除
resourcesdeletionprotection：资源删除保护
tkeenirequest：弹性网卡资源配置限制
blockworkloadcrossversionupgrade：工作负载镜像版本升级策略管控
blockserviceaccountgranthighprivilegepermission：ServiceAccount权限管控
blockclusteripserviceexist：不允许Service为ClusterIP类型
blockinternetaccess：禁止公网访问
assign：禁止访问Metadata Server
blockhostnetworkpod：禁止创建HostNetwork类型Pod

可选策略：
blockvolumemountpath：禁止容器挂载指定的目录
k8sallowedrepos：容器镜像必须以指定字符串列表中的字符串开头
k8sblockendpointeditdefaultrole：禁止默认ClusterRole修改Endpoints
k8sblockloadbalancer：不允许Service为LoadBalancer类型
k8sblocknodeport：不允许Service为NodePort类型
k8sblockwildcardingress：禁止ingress配置空白或通配符类型的hostname
k8scontainerlimits：限制容器必须设置CPU和内存Limit
k8scontainerratios：限制CPU和内存的Request与Limit的最大比率
k8scontainerrequests：限制CPU和内存的Request必须设置且小于配置的最大值
k8srequiredresources：必须配置内存的Limit，CPU和内存的Request
k8sdisallowanonymous：不允许将白名单以外的ClusterRole和Role关联到system:anonymous User和system:unauthenticated Group
k8sdisallowedtags：约束容器镜像tag
k8sexternalips：限制服务externalIP仅为允许的IP地址列表
k8simagedigests：容器镜像必须包含digest
noupdateserviceaccount：拒绝白名单外的资源更新ServiceAccount
k8sreplicalimits：要求具有spec.replicas字段的对象（Deployments、ReplicaSets等）在定义的范围内
k8srequiredannotations：要求资源包含指定的annotations，其值与提供的正则表达式匹配
k8srequiredlabels：要求资源包含指定的标签，其值与提供的正则表达式匹配
k8srequiredprobes：要求Pod具有Readiness或Liveness Probe
k8spspautomountserviceaccounttokenpod：约束容器不能设置automountServiceAccountToken为true
k8spspallowprivilegeescalationcontainer：约束PodSecurityPolicy中的allowPrivilegeEscalation字段为false
k8spspapparmor：约束AppArmor字段列表
k8spspcapabilities：限制PodSecurityPolicy中的allowedCapabilities和requiredDropCapabilities字段
k8spspflexvolumes：约束PodSecurityPolicy中的allowedFlexVolumes字段类型
k8spspforbiddensysctls：约束PodSecurityPolicy中的sysctls字段不能使用的name
k8spspfsgroup：控制PodSecurityPolicy中的fsGroup字段在限制范围内
k8spsphostfilesystem：约束PodSecurityPolicy中的hostPath字段的参数
k8spsphostnamespace：限制PodSecurityPolicy中的hostPID和hostIPC字段
k8spsphostnetworkingports：约束PodSecurityPolicy中的hostNetwork和hostPorts字段
k8spspprivilegedcontainer：禁止PodSecurityPolicy中的privileged字段为true
k8spspprocmount：约束PodSecurityPolicy中的allowedProcMountTypes字段
k8spspreadonlyrootfilesystem：约束PodSecurityPolicy中的readOnlyRootFilesystem字段
k8spspseccomp：约束PodSecurityPolicy上的seccomp.security.alpha.kubernetes.io/allowedProfileNames注解
k8spspselinuxv2：约束Pod定义SELinux配置的允许列表
k8spspallowedusers：约束PodSecurityPolicy中的runAsUser、runAsGroup、supplementalGroups和fsGroup字段
k8spspvolumetypes：约束PodSecurityPolicy中的volumes字段类型
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * 策略开关状态：open打开，close关闭
    */
    @SerializedName("EnabledStatus")
    @Expose
    private String EnabledStatus;

    /**
    * 策略的实例的yaml示例base64编码
    */
    @SerializedName("ConstraintYamlExample")
    @Expose
    private String ConstraintYamlExample;

    /**
    * 策略关联的实例列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OpenConstraintInfoList")
    @Expose
    private OpenConstraintInfo [] OpenConstraintInfoList;

    /**
     * Get 策略分类：cluster集群策略、node节点策略、namespace命名空间策略、configuration配置相关策略、compute计算资源策略、storage存储资源策略、network网络资源策略 
     * @return PolicyCategory 策略分类：cluster集群策略、node节点策略、namespace命名空间策略、configuration配置相关策略、compute计算资源策略、storage存储资源策略、network网络资源策略
     */
    public String getPolicyCategory() {
        return this.PolicyCategory;
    }

    /**
     * Set 策略分类：cluster集群策略、node节点策略、namespace命名空间策略、configuration配置相关策略、compute计算资源策略、storage存储资源策略、network网络资源策略
     * @param PolicyCategory 策略分类：cluster集群策略、node节点策略、namespace命名空间策略、configuration配置相关策略、compute计算资源策略、storage存储资源策略、network网络资源策略
     */
    public void setPolicyCategory(String PolicyCategory) {
        this.PolicyCategory = PolicyCategory;
    }

    /**
     * Get 策略中文名称 
     * @return PolicyName 策略中文名称
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 策略中文名称
     * @param PolicyName 策略中文名称
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get 策略描述 
     * @return PolicyDesc 策略描述
     */
    public String getPolicyDesc() {
        return this.PolicyDesc;
    }

    /**
     * Set 策略描述
     * @param PolicyDesc 策略描述
     */
    public void setPolicyDesc(String PolicyDesc) {
        this.PolicyDesc = PolicyDesc;
    }

    /**
     * Get 策略运行模式：dryrun空跑不生效，deny拦截生效 
     * @return EnforcementAction 策略运行模式：dryrun空跑不生效，deny拦截生效
     */
    public String getEnforcementAction() {
        return this.EnforcementAction;
    }

    /**
     * Set 策略运行模式：dryrun空跑不生效，deny拦截生效
     * @param EnforcementAction 策略运行模式：dryrun空跑不生效，deny拦截生效
     */
    public void setEnforcementAction(String EnforcementAction) {
        this.EnforcementAction = EnforcementAction;
    }

    /**
     * Get 关联的事件数量(最近7d) 
     * @return EventNums 关联的事件数量(最近7d)
     */
    public Long getEventNums() {
        return this.EventNums;
    }

    /**
     * Set 关联的事件数量(最近7d)
     * @param EventNums 关联的事件数量(最近7d)
     */
    public void setEventNums(Long EventNums) {
        this.EventNums = EventNums;
    }

    /**
     * Get 策略英文名称 
     * @return Name 策略英文名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 策略英文名称
     * @param Name 策略英文名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 策略模板类型，支持的类型如下：
优选策略：
blocknamespacedeletion：存在pod的命名空间不允许删除
blockcrddeletion：存在cr的crd不允许删除
blockmountablevolumetype：禁止挂载指定的volume类型
disallowalwayspullimage：禁止镜像拉取策略使用Always
tkeallowedrepos：容器镜像来源限制
blockunknowndaemonset：禁止未知的DaemonSet部署
blockpvdeletion：PV处于绑定状态则不允许删除
corednsprotect：CoreDNS组件删除保护
blockschedulablenodedelete：非封锁状态的Node不允许删除
resourcesdeletionprotection：资源删除保护
tkeenirequest：弹性网卡资源配置限制
blockworkloadcrossversionupgrade：工作负载镜像版本升级策略管控
blockserviceaccountgranthighprivilegepermission：ServiceAccount权限管控
blockclusteripserviceexist：不允许Service为ClusterIP类型
blockinternetaccess：禁止公网访问
assign：禁止访问Metadata Server
blockhostnetworkpod：禁止创建HostNetwork类型Pod

可选策略：
blockvolumemountpath：禁止容器挂载指定的目录
k8sallowedrepos：容器镜像必须以指定字符串列表中的字符串开头
k8sblockendpointeditdefaultrole：禁止默认ClusterRole修改Endpoints
k8sblockloadbalancer：不允许Service为LoadBalancer类型
k8sblocknodeport：不允许Service为NodePort类型
k8sblockwildcardingress：禁止ingress配置空白或通配符类型的hostname
k8scontainerlimits：限制容器必须设置CPU和内存Limit
k8scontainerratios：限制CPU和内存的Request与Limit的最大比率
k8scontainerrequests：限制CPU和内存的Request必须设置且小于配置的最大值
k8srequiredresources：必须配置内存的Limit，CPU和内存的Request
k8sdisallowanonymous：不允许将白名单以外的ClusterRole和Role关联到system:anonymous User和system:unauthenticated Group
k8sdisallowedtags：约束容器镜像tag
k8sexternalips：限制服务externalIP仅为允许的IP地址列表
k8simagedigests：容器镜像必须包含digest
noupdateserviceaccount：拒绝白名单外的资源更新ServiceAccount
k8sreplicalimits：要求具有spec.replicas字段的对象（Deployments、ReplicaSets等）在定义的范围内
k8srequiredannotations：要求资源包含指定的annotations，其值与提供的正则表达式匹配
k8srequiredlabels：要求资源包含指定的标签，其值与提供的正则表达式匹配
k8srequiredprobes：要求Pod具有Readiness或Liveness Probe
k8spspautomountserviceaccounttokenpod：约束容器不能设置automountServiceAccountToken为true
k8spspallowprivilegeescalationcontainer：约束PodSecurityPolicy中的allowPrivilegeEscalation字段为false
k8spspapparmor：约束AppArmor字段列表
k8spspcapabilities：限制PodSecurityPolicy中的allowedCapabilities和requiredDropCapabilities字段
k8spspflexvolumes：约束PodSecurityPolicy中的allowedFlexVolumes字段类型
k8spspforbiddensysctls：约束PodSecurityPolicy中的sysctls字段不能使用的name
k8spspfsgroup：控制PodSecurityPolicy中的fsGroup字段在限制范围内
k8spsphostfilesystem：约束PodSecurityPolicy中的hostPath字段的参数
k8spsphostnamespace：限制PodSecurityPolicy中的hostPID和hostIPC字段
k8spsphostnetworkingports：约束PodSecurityPolicy中的hostNetwork和hostPorts字段
k8spspprivilegedcontainer：禁止PodSecurityPolicy中的privileged字段为true
k8spspprocmount：约束PodSecurityPolicy中的allowedProcMountTypes字段
k8spspreadonlyrootfilesystem：约束PodSecurityPolicy中的readOnlyRootFilesystem字段
k8spspseccomp：约束PodSecurityPolicy上的seccomp.security.alpha.kubernetes.io/allowedProfileNames注解
k8spspselinuxv2：约束Pod定义SELinux配置的允许列表
k8spspallowedusers：约束PodSecurityPolicy中的runAsUser、runAsGroup、supplementalGroups和fsGroup字段
k8spspvolumetypes：约束PodSecurityPolicy中的volumes字段类型 
     * @return Kind 策略模板类型，支持的类型如下：
优选策略：
blocknamespacedeletion：存在pod的命名空间不允许删除
blockcrddeletion：存在cr的crd不允许删除
blockmountablevolumetype：禁止挂载指定的volume类型
disallowalwayspullimage：禁止镜像拉取策略使用Always
tkeallowedrepos：容器镜像来源限制
blockunknowndaemonset：禁止未知的DaemonSet部署
blockpvdeletion：PV处于绑定状态则不允许删除
corednsprotect：CoreDNS组件删除保护
blockschedulablenodedelete：非封锁状态的Node不允许删除
resourcesdeletionprotection：资源删除保护
tkeenirequest：弹性网卡资源配置限制
blockworkloadcrossversionupgrade：工作负载镜像版本升级策略管控
blockserviceaccountgranthighprivilegepermission：ServiceAccount权限管控
blockclusteripserviceexist：不允许Service为ClusterIP类型
blockinternetaccess：禁止公网访问
assign：禁止访问Metadata Server
blockhostnetworkpod：禁止创建HostNetwork类型Pod

可选策略：
blockvolumemountpath：禁止容器挂载指定的目录
k8sallowedrepos：容器镜像必须以指定字符串列表中的字符串开头
k8sblockendpointeditdefaultrole：禁止默认ClusterRole修改Endpoints
k8sblockloadbalancer：不允许Service为LoadBalancer类型
k8sblocknodeport：不允许Service为NodePort类型
k8sblockwildcardingress：禁止ingress配置空白或通配符类型的hostname
k8scontainerlimits：限制容器必须设置CPU和内存Limit
k8scontainerratios：限制CPU和内存的Request与Limit的最大比率
k8scontainerrequests：限制CPU和内存的Request必须设置且小于配置的最大值
k8srequiredresources：必须配置内存的Limit，CPU和内存的Request
k8sdisallowanonymous：不允许将白名单以外的ClusterRole和Role关联到system:anonymous User和system:unauthenticated Group
k8sdisallowedtags：约束容器镜像tag
k8sexternalips：限制服务externalIP仅为允许的IP地址列表
k8simagedigests：容器镜像必须包含digest
noupdateserviceaccount：拒绝白名单外的资源更新ServiceAccount
k8sreplicalimits：要求具有spec.replicas字段的对象（Deployments、ReplicaSets等）在定义的范围内
k8srequiredannotations：要求资源包含指定的annotations，其值与提供的正则表达式匹配
k8srequiredlabels：要求资源包含指定的标签，其值与提供的正则表达式匹配
k8srequiredprobes：要求Pod具有Readiness或Liveness Probe
k8spspautomountserviceaccounttokenpod：约束容器不能设置automountServiceAccountToken为true
k8spspallowprivilegeescalationcontainer：约束PodSecurityPolicy中的allowPrivilegeEscalation字段为false
k8spspapparmor：约束AppArmor字段列表
k8spspcapabilities：限制PodSecurityPolicy中的allowedCapabilities和requiredDropCapabilities字段
k8spspflexvolumes：约束PodSecurityPolicy中的allowedFlexVolumes字段类型
k8spspforbiddensysctls：约束PodSecurityPolicy中的sysctls字段不能使用的name
k8spspfsgroup：控制PodSecurityPolicy中的fsGroup字段在限制范围内
k8spsphostfilesystem：约束PodSecurityPolicy中的hostPath字段的参数
k8spsphostnamespace：限制PodSecurityPolicy中的hostPID和hostIPC字段
k8spsphostnetworkingports：约束PodSecurityPolicy中的hostNetwork和hostPorts字段
k8spspprivilegedcontainer：禁止PodSecurityPolicy中的privileged字段为true
k8spspprocmount：约束PodSecurityPolicy中的allowedProcMountTypes字段
k8spspreadonlyrootfilesystem：约束PodSecurityPolicy中的readOnlyRootFilesystem字段
k8spspseccomp：约束PodSecurityPolicy上的seccomp.security.alpha.kubernetes.io/allowedProfileNames注解
k8spspselinuxv2：约束Pod定义SELinux配置的允许列表
k8spspallowedusers：约束PodSecurityPolicy中的runAsUser、runAsGroup、supplementalGroups和fsGroup字段
k8spspvolumetypes：约束PodSecurityPolicy中的volumes字段类型
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set 策略模板类型，支持的类型如下：
优选策略：
blocknamespacedeletion：存在pod的命名空间不允许删除
blockcrddeletion：存在cr的crd不允许删除
blockmountablevolumetype：禁止挂载指定的volume类型
disallowalwayspullimage：禁止镜像拉取策略使用Always
tkeallowedrepos：容器镜像来源限制
blockunknowndaemonset：禁止未知的DaemonSet部署
blockpvdeletion：PV处于绑定状态则不允许删除
corednsprotect：CoreDNS组件删除保护
blockschedulablenodedelete：非封锁状态的Node不允许删除
resourcesdeletionprotection：资源删除保护
tkeenirequest：弹性网卡资源配置限制
blockworkloadcrossversionupgrade：工作负载镜像版本升级策略管控
blockserviceaccountgranthighprivilegepermission：ServiceAccount权限管控
blockclusteripserviceexist：不允许Service为ClusterIP类型
blockinternetaccess：禁止公网访问
assign：禁止访问Metadata Server
blockhostnetworkpod：禁止创建HostNetwork类型Pod

可选策略：
blockvolumemountpath：禁止容器挂载指定的目录
k8sallowedrepos：容器镜像必须以指定字符串列表中的字符串开头
k8sblockendpointeditdefaultrole：禁止默认ClusterRole修改Endpoints
k8sblockloadbalancer：不允许Service为LoadBalancer类型
k8sblocknodeport：不允许Service为NodePort类型
k8sblockwildcardingress：禁止ingress配置空白或通配符类型的hostname
k8scontainerlimits：限制容器必须设置CPU和内存Limit
k8scontainerratios：限制CPU和内存的Request与Limit的最大比率
k8scontainerrequests：限制CPU和内存的Request必须设置且小于配置的最大值
k8srequiredresources：必须配置内存的Limit，CPU和内存的Request
k8sdisallowanonymous：不允许将白名单以外的ClusterRole和Role关联到system:anonymous User和system:unauthenticated Group
k8sdisallowedtags：约束容器镜像tag
k8sexternalips：限制服务externalIP仅为允许的IP地址列表
k8simagedigests：容器镜像必须包含digest
noupdateserviceaccount：拒绝白名单外的资源更新ServiceAccount
k8sreplicalimits：要求具有spec.replicas字段的对象（Deployments、ReplicaSets等）在定义的范围内
k8srequiredannotations：要求资源包含指定的annotations，其值与提供的正则表达式匹配
k8srequiredlabels：要求资源包含指定的标签，其值与提供的正则表达式匹配
k8srequiredprobes：要求Pod具有Readiness或Liveness Probe
k8spspautomountserviceaccounttokenpod：约束容器不能设置automountServiceAccountToken为true
k8spspallowprivilegeescalationcontainer：约束PodSecurityPolicy中的allowPrivilegeEscalation字段为false
k8spspapparmor：约束AppArmor字段列表
k8spspcapabilities：限制PodSecurityPolicy中的allowedCapabilities和requiredDropCapabilities字段
k8spspflexvolumes：约束PodSecurityPolicy中的allowedFlexVolumes字段类型
k8spspforbiddensysctls：约束PodSecurityPolicy中的sysctls字段不能使用的name
k8spspfsgroup：控制PodSecurityPolicy中的fsGroup字段在限制范围内
k8spsphostfilesystem：约束PodSecurityPolicy中的hostPath字段的参数
k8spsphostnamespace：限制PodSecurityPolicy中的hostPID和hostIPC字段
k8spsphostnetworkingports：约束PodSecurityPolicy中的hostNetwork和hostPorts字段
k8spspprivilegedcontainer：禁止PodSecurityPolicy中的privileged字段为true
k8spspprocmount：约束PodSecurityPolicy中的allowedProcMountTypes字段
k8spspreadonlyrootfilesystem：约束PodSecurityPolicy中的readOnlyRootFilesystem字段
k8spspseccomp：约束PodSecurityPolicy上的seccomp.security.alpha.kubernetes.io/allowedProfileNames注解
k8spspselinuxv2：约束Pod定义SELinux配置的允许列表
k8spspallowedusers：约束PodSecurityPolicy中的runAsUser、runAsGroup、supplementalGroups和fsGroup字段
k8spspvolumetypes：约束PodSecurityPolicy中的volumes字段类型
     * @param Kind 策略模板类型，支持的类型如下：
优选策略：
blocknamespacedeletion：存在pod的命名空间不允许删除
blockcrddeletion：存在cr的crd不允许删除
blockmountablevolumetype：禁止挂载指定的volume类型
disallowalwayspullimage：禁止镜像拉取策略使用Always
tkeallowedrepos：容器镜像来源限制
blockunknowndaemonset：禁止未知的DaemonSet部署
blockpvdeletion：PV处于绑定状态则不允许删除
corednsprotect：CoreDNS组件删除保护
blockschedulablenodedelete：非封锁状态的Node不允许删除
resourcesdeletionprotection：资源删除保护
tkeenirequest：弹性网卡资源配置限制
blockworkloadcrossversionupgrade：工作负载镜像版本升级策略管控
blockserviceaccountgranthighprivilegepermission：ServiceAccount权限管控
blockclusteripserviceexist：不允许Service为ClusterIP类型
blockinternetaccess：禁止公网访问
assign：禁止访问Metadata Server
blockhostnetworkpod：禁止创建HostNetwork类型Pod

可选策略：
blockvolumemountpath：禁止容器挂载指定的目录
k8sallowedrepos：容器镜像必须以指定字符串列表中的字符串开头
k8sblockendpointeditdefaultrole：禁止默认ClusterRole修改Endpoints
k8sblockloadbalancer：不允许Service为LoadBalancer类型
k8sblocknodeport：不允许Service为NodePort类型
k8sblockwildcardingress：禁止ingress配置空白或通配符类型的hostname
k8scontainerlimits：限制容器必须设置CPU和内存Limit
k8scontainerratios：限制CPU和内存的Request与Limit的最大比率
k8scontainerrequests：限制CPU和内存的Request必须设置且小于配置的最大值
k8srequiredresources：必须配置内存的Limit，CPU和内存的Request
k8sdisallowanonymous：不允许将白名单以外的ClusterRole和Role关联到system:anonymous User和system:unauthenticated Group
k8sdisallowedtags：约束容器镜像tag
k8sexternalips：限制服务externalIP仅为允许的IP地址列表
k8simagedigests：容器镜像必须包含digest
noupdateserviceaccount：拒绝白名单外的资源更新ServiceAccount
k8sreplicalimits：要求具有spec.replicas字段的对象（Deployments、ReplicaSets等）在定义的范围内
k8srequiredannotations：要求资源包含指定的annotations，其值与提供的正则表达式匹配
k8srequiredlabels：要求资源包含指定的标签，其值与提供的正则表达式匹配
k8srequiredprobes：要求Pod具有Readiness或Liveness Probe
k8spspautomountserviceaccounttokenpod：约束容器不能设置automountServiceAccountToken为true
k8spspallowprivilegeescalationcontainer：约束PodSecurityPolicy中的allowPrivilegeEscalation字段为false
k8spspapparmor：约束AppArmor字段列表
k8spspcapabilities：限制PodSecurityPolicy中的allowedCapabilities和requiredDropCapabilities字段
k8spspflexvolumes：约束PodSecurityPolicy中的allowedFlexVolumes字段类型
k8spspforbiddensysctls：约束PodSecurityPolicy中的sysctls字段不能使用的name
k8spspfsgroup：控制PodSecurityPolicy中的fsGroup字段在限制范围内
k8spsphostfilesystem：约束PodSecurityPolicy中的hostPath字段的参数
k8spsphostnamespace：限制PodSecurityPolicy中的hostPID和hostIPC字段
k8spsphostnetworkingports：约束PodSecurityPolicy中的hostNetwork和hostPorts字段
k8spspprivilegedcontainer：禁止PodSecurityPolicy中的privileged字段为true
k8spspprocmount：约束PodSecurityPolicy中的allowedProcMountTypes字段
k8spspreadonlyrootfilesystem：约束PodSecurityPolicy中的readOnlyRootFilesystem字段
k8spspseccomp：约束PodSecurityPolicy上的seccomp.security.alpha.kubernetes.io/allowedProfileNames注解
k8spspselinuxv2：约束Pod定义SELinux配置的允许列表
k8spspallowedusers：约束PodSecurityPolicy中的runAsUser、runAsGroup、supplementalGroups和fsGroup字段
k8spspvolumetypes：约束PodSecurityPolicy中的volumes字段类型
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get 策略开关状态：open打开，close关闭 
     * @return EnabledStatus 策略开关状态：open打开，close关闭
     */
    public String getEnabledStatus() {
        return this.EnabledStatus;
    }

    /**
     * Set 策略开关状态：open打开，close关闭
     * @param EnabledStatus 策略开关状态：open打开，close关闭
     */
    public void setEnabledStatus(String EnabledStatus) {
        this.EnabledStatus = EnabledStatus;
    }

    /**
     * Get 策略的实例的yaml示例base64编码 
     * @return ConstraintYamlExample 策略的实例的yaml示例base64编码
     */
    public String getConstraintYamlExample() {
        return this.ConstraintYamlExample;
    }

    /**
     * Set 策略的实例的yaml示例base64编码
     * @param ConstraintYamlExample 策略的实例的yaml示例base64编码
     */
    public void setConstraintYamlExample(String ConstraintYamlExample) {
        this.ConstraintYamlExample = ConstraintYamlExample;
    }

    /**
     * Get 策略关联的实例列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OpenConstraintInfoList 策略关联的实例列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OpenConstraintInfo [] getOpenConstraintInfoList() {
        return this.OpenConstraintInfoList;
    }

    /**
     * Set 策略关联的实例列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param OpenConstraintInfoList 策略关联的实例列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOpenConstraintInfoList(OpenConstraintInfo [] OpenConstraintInfoList) {
        this.OpenConstraintInfoList = OpenConstraintInfoList;
    }

    public OpenPolicyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenPolicyInfo(OpenPolicyInfo source) {
        if (source.PolicyCategory != null) {
            this.PolicyCategory = new String(source.PolicyCategory);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.PolicyDesc != null) {
            this.PolicyDesc = new String(source.PolicyDesc);
        }
        if (source.EnforcementAction != null) {
            this.EnforcementAction = new String(source.EnforcementAction);
        }
        if (source.EventNums != null) {
            this.EventNums = new Long(source.EventNums);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.EnabledStatus != null) {
            this.EnabledStatus = new String(source.EnabledStatus);
        }
        if (source.ConstraintYamlExample != null) {
            this.ConstraintYamlExample = new String(source.ConstraintYamlExample);
        }
        if (source.OpenConstraintInfoList != null) {
            this.OpenConstraintInfoList = new OpenConstraintInfo[source.OpenConstraintInfoList.length];
            for (int i = 0; i < source.OpenConstraintInfoList.length; i++) {
                this.OpenConstraintInfoList[i] = new OpenConstraintInfo(source.OpenConstraintInfoList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyCategory", this.PolicyCategory);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "PolicyDesc", this.PolicyDesc);
        this.setParamSimple(map, prefix + "EnforcementAction", this.EnforcementAction);
        this.setParamSimple(map, prefix + "EventNums", this.EventNums);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "EnabledStatus", this.EnabledStatus);
        this.setParamSimple(map, prefix + "ConstraintYamlExample", this.ConstraintYamlExample);
        this.setParamArrayObj(map, prefix + "OpenConstraintInfoList.", this.OpenConstraintInfoList);

    }
}

