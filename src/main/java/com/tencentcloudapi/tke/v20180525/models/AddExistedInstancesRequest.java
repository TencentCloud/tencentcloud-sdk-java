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

public class AddExistedInstancesRequest extends AbstractModel {

    /**
    * <p>集群ID（请登录 <a href="https://console.cloud.tencent.com/tke2">TKE 控制台</a> 获取集群 ID ）</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>实例列表，不支持竞价实例（请登录 <a href="https://console.cloud.tencent.com/cvm">CVM控制台</a> 获取待添加节点ID ）</p>
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * <p>实例额外需要设置参数信息(默认值)</p>
    */
    @SerializedName("InstanceAdvancedSettings")
    @Expose
    private InstanceAdvancedSettings InstanceAdvancedSettings;

    /**
    * <p>增强服务。通过该参数可以指定是否开启云安全、云监控等服务。若不指定该参数，则默认开启云监控、云安全服务。</p>
    */
    @SerializedName("EnhancedService")
    @Expose
    private EnhancedService EnhancedService;

    /**
    * <p>节点登录信息（目前仅支持使用Password或者单个KeyIds）</p>
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSettings LoginSettings;

    /**
    * <p>重装系统时，可以指定修改实例的HostName(集群为HostName模式时，此参数必传，规则名称除不支持大写字符外与<a href="https://cloud.tencent.com/document/product/213/15730">CVM创建实例</a>接口HostName一致)</p>
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * <p>实例所属安全组。该参数可以通过调用 DescribeSecurityGroups 的返回值中的sgId字段来获取。若不指定该参数，则绑定默认安全组。（目前仅支持设置单个sgId）</p>
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * <p>节点池选项</p>
    */
    @SerializedName("NodePool")
    @Expose
    private NodePoolOption NodePool;

    /**
    * <p>校验规则相关选项，可配置跳过某些校验规则。目前支持GlobalRouteCIDRCheck（跳过GlobalRouter的相关校验），VpcCniCIDRCheck（跳过VpcCni相关校验）</p>
    */
    @SerializedName("SkipValidateOptions")
    @Expose
    private String [] SkipValidateOptions;

    /**
    * <p>参数InstanceAdvancedSettingsOverride数组用于定制化地配置各台instance，与InstanceIds顺序对应。当传入InstanceAdvancedSettingsOverrides数组时，将覆盖默认参数InstanceAdvancedSettings；当没有传入参数InstanceAdvancedSettingsOverrides时，InstanceAdvancedSettings参数对每台instance生效。参数InstanceAdvancedSettingsOverride数组的长度应与InstanceIds数组一致；当长度大于InstanceIds数组长度时将报错；当长度小于InstanceIds数组时，没有对应配置的instance将使用默认配置。</p>
    */
    @SerializedName("InstanceAdvancedSettingsOverrides")
    @Expose
    private InstanceAdvancedSettings [] InstanceAdvancedSettingsOverrides;

    /**
    * <p>添加已有节点时需要跳过的步骤，默认为空，当前支持 :</p><ul><li>ResetCVM——跳过 CVM 重装（请确保 TKE 的 UserData 已经写入 CVM）</li><li>InstallRuntime——跳过运行时安装</li><li>ConfigRuntime——跳过运行时配置文件下发</li><li>InstallKubelet——跳过 kubelet 配置文件下发</li><li>ConfigKubelet——跳过 kubelet安装</li></ul>
    */
    @SerializedName("SkipOptions")
    @Expose
    private String [] SkipOptions;

    /**
    * <p>节点镜像</p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>直接添加为原生节点</p>
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * <p>云标签列表</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>自动续费标识，NOTIFY_AND_AUTO_RENEW（通知过期且自动续费）、NOTIFY_AND_MANUAL_RENEW（通知过期不自动续费）</p>
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
     * Get <p>集群ID（请登录 <a href="https://console.cloud.tencent.com/tke2">TKE 控制台</a> 获取集群 ID ）</p> 
     * @return ClusterId <p>集群ID（请登录 <a href="https://console.cloud.tencent.com/tke2">TKE 控制台</a> 获取集群 ID ）</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID（请登录 <a href="https://console.cloud.tencent.com/tke2">TKE 控制台</a> 获取集群 ID ）</p>
     * @param ClusterId <p>集群ID（请登录 <a href="https://console.cloud.tencent.com/tke2">TKE 控制台</a> 获取集群 ID ）</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>实例列表，不支持竞价实例（请登录 <a href="https://console.cloud.tencent.com/cvm">CVM控制台</a> 获取待添加节点ID ）</p> 
     * @return InstanceIds <p>实例列表，不支持竞价实例（请登录 <a href="https://console.cloud.tencent.com/cvm">CVM控制台</a> 获取待添加节点ID ）</p>
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set <p>实例列表，不支持竞价实例（请登录 <a href="https://console.cloud.tencent.com/cvm">CVM控制台</a> 获取待添加节点ID ）</p>
     * @param InstanceIds <p>实例列表，不支持竞价实例（请登录 <a href="https://console.cloud.tencent.com/cvm">CVM控制台</a> 获取待添加节点ID ）</p>
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get <p>实例额外需要设置参数信息(默认值)</p> 
     * @return InstanceAdvancedSettings <p>实例额外需要设置参数信息(默认值)</p>
     */
    public InstanceAdvancedSettings getInstanceAdvancedSettings() {
        return this.InstanceAdvancedSettings;
    }

    /**
     * Set <p>实例额外需要设置参数信息(默认值)</p>
     * @param InstanceAdvancedSettings <p>实例额外需要设置参数信息(默认值)</p>
     */
    public void setInstanceAdvancedSettings(InstanceAdvancedSettings InstanceAdvancedSettings) {
        this.InstanceAdvancedSettings = InstanceAdvancedSettings;
    }

    /**
     * Get <p>增强服务。通过该参数可以指定是否开启云安全、云监控等服务。若不指定该参数，则默认开启云监控、云安全服务。</p> 
     * @return EnhancedService <p>增强服务。通过该参数可以指定是否开启云安全、云监控等服务。若不指定该参数，则默认开启云监控、云安全服务。</p>
     */
    public EnhancedService getEnhancedService() {
        return this.EnhancedService;
    }

    /**
     * Set <p>增强服务。通过该参数可以指定是否开启云安全、云监控等服务。若不指定该参数，则默认开启云监控、云安全服务。</p>
     * @param EnhancedService <p>增强服务。通过该参数可以指定是否开启云安全、云监控等服务。若不指定该参数，则默认开启云监控、云安全服务。</p>
     */
    public void setEnhancedService(EnhancedService EnhancedService) {
        this.EnhancedService = EnhancedService;
    }

    /**
     * Get <p>节点登录信息（目前仅支持使用Password或者单个KeyIds）</p> 
     * @return LoginSettings <p>节点登录信息（目前仅支持使用Password或者单个KeyIds）</p>
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set <p>节点登录信息（目前仅支持使用Password或者单个KeyIds）</p>
     * @param LoginSettings <p>节点登录信息（目前仅支持使用Password或者单个KeyIds）</p>
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * Get <p>重装系统时，可以指定修改实例的HostName(集群为HostName模式时，此参数必传，规则名称除不支持大写字符外与<a href="https://cloud.tencent.com/document/product/213/15730">CVM创建实例</a>接口HostName一致)</p> 
     * @return HostName <p>重装系统时，可以指定修改实例的HostName(集群为HostName模式时，此参数必传，规则名称除不支持大写字符外与<a href="https://cloud.tencent.com/document/product/213/15730">CVM创建实例</a>接口HostName一致)</p>
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set <p>重装系统时，可以指定修改实例的HostName(集群为HostName模式时，此参数必传，规则名称除不支持大写字符外与<a href="https://cloud.tencent.com/document/product/213/15730">CVM创建实例</a>接口HostName一致)</p>
     * @param HostName <p>重装系统时，可以指定修改实例的HostName(集群为HostName模式时，此参数必传，规则名称除不支持大写字符外与<a href="https://cloud.tencent.com/document/product/213/15730">CVM创建实例</a>接口HostName一致)</p>
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get <p>实例所属安全组。该参数可以通过调用 DescribeSecurityGroups 的返回值中的sgId字段来获取。若不指定该参数，则绑定默认安全组。（目前仅支持设置单个sgId）</p> 
     * @return SecurityGroupIds <p>实例所属安全组。该参数可以通过调用 DescribeSecurityGroups 的返回值中的sgId字段来获取。若不指定该参数，则绑定默认安全组。（目前仅支持设置单个sgId）</p>
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>实例所属安全组。该参数可以通过调用 DescribeSecurityGroups 的返回值中的sgId字段来获取。若不指定该参数，则绑定默认安全组。（目前仅支持设置单个sgId）</p>
     * @param SecurityGroupIds <p>实例所属安全组。该参数可以通过调用 DescribeSecurityGroups 的返回值中的sgId字段来获取。若不指定该参数，则绑定默认安全组。（目前仅支持设置单个sgId）</p>
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get <p>节点池选项</p> 
     * @return NodePool <p>节点池选项</p>
     */
    public NodePoolOption getNodePool() {
        return this.NodePool;
    }

    /**
     * Set <p>节点池选项</p>
     * @param NodePool <p>节点池选项</p>
     */
    public void setNodePool(NodePoolOption NodePool) {
        this.NodePool = NodePool;
    }

    /**
     * Get <p>校验规则相关选项，可配置跳过某些校验规则。目前支持GlobalRouteCIDRCheck（跳过GlobalRouter的相关校验），VpcCniCIDRCheck（跳过VpcCni相关校验）</p> 
     * @return SkipValidateOptions <p>校验规则相关选项，可配置跳过某些校验规则。目前支持GlobalRouteCIDRCheck（跳过GlobalRouter的相关校验），VpcCniCIDRCheck（跳过VpcCni相关校验）</p>
     */
    public String [] getSkipValidateOptions() {
        return this.SkipValidateOptions;
    }

    /**
     * Set <p>校验规则相关选项，可配置跳过某些校验规则。目前支持GlobalRouteCIDRCheck（跳过GlobalRouter的相关校验），VpcCniCIDRCheck（跳过VpcCni相关校验）</p>
     * @param SkipValidateOptions <p>校验规则相关选项，可配置跳过某些校验规则。目前支持GlobalRouteCIDRCheck（跳过GlobalRouter的相关校验），VpcCniCIDRCheck（跳过VpcCni相关校验）</p>
     */
    public void setSkipValidateOptions(String [] SkipValidateOptions) {
        this.SkipValidateOptions = SkipValidateOptions;
    }

    /**
     * Get <p>参数InstanceAdvancedSettingsOverride数组用于定制化地配置各台instance，与InstanceIds顺序对应。当传入InstanceAdvancedSettingsOverrides数组时，将覆盖默认参数InstanceAdvancedSettings；当没有传入参数InstanceAdvancedSettingsOverrides时，InstanceAdvancedSettings参数对每台instance生效。参数InstanceAdvancedSettingsOverride数组的长度应与InstanceIds数组一致；当长度大于InstanceIds数组长度时将报错；当长度小于InstanceIds数组时，没有对应配置的instance将使用默认配置。</p> 
     * @return InstanceAdvancedSettingsOverrides <p>参数InstanceAdvancedSettingsOverride数组用于定制化地配置各台instance，与InstanceIds顺序对应。当传入InstanceAdvancedSettingsOverrides数组时，将覆盖默认参数InstanceAdvancedSettings；当没有传入参数InstanceAdvancedSettingsOverrides时，InstanceAdvancedSettings参数对每台instance生效。参数InstanceAdvancedSettingsOverride数组的长度应与InstanceIds数组一致；当长度大于InstanceIds数组长度时将报错；当长度小于InstanceIds数组时，没有对应配置的instance将使用默认配置。</p>
     */
    public InstanceAdvancedSettings [] getInstanceAdvancedSettingsOverrides() {
        return this.InstanceAdvancedSettingsOverrides;
    }

    /**
     * Set <p>参数InstanceAdvancedSettingsOverride数组用于定制化地配置各台instance，与InstanceIds顺序对应。当传入InstanceAdvancedSettingsOverrides数组时，将覆盖默认参数InstanceAdvancedSettings；当没有传入参数InstanceAdvancedSettingsOverrides时，InstanceAdvancedSettings参数对每台instance生效。参数InstanceAdvancedSettingsOverride数组的长度应与InstanceIds数组一致；当长度大于InstanceIds数组长度时将报错；当长度小于InstanceIds数组时，没有对应配置的instance将使用默认配置。</p>
     * @param InstanceAdvancedSettingsOverrides <p>参数InstanceAdvancedSettingsOverride数组用于定制化地配置各台instance，与InstanceIds顺序对应。当传入InstanceAdvancedSettingsOverrides数组时，将覆盖默认参数InstanceAdvancedSettings；当没有传入参数InstanceAdvancedSettingsOverrides时，InstanceAdvancedSettings参数对每台instance生效。参数InstanceAdvancedSettingsOverride数组的长度应与InstanceIds数组一致；当长度大于InstanceIds数组长度时将报错；当长度小于InstanceIds数组时，没有对应配置的instance将使用默认配置。</p>
     */
    public void setInstanceAdvancedSettingsOverrides(InstanceAdvancedSettings [] InstanceAdvancedSettingsOverrides) {
        this.InstanceAdvancedSettingsOverrides = InstanceAdvancedSettingsOverrides;
    }

    /**
     * Get <p>添加已有节点时需要跳过的步骤，默认为空，当前支持 :</p><ul><li>ResetCVM——跳过 CVM 重装（请确保 TKE 的 UserData 已经写入 CVM）</li><li>InstallRuntime——跳过运行时安装</li><li>ConfigRuntime——跳过运行时配置文件下发</li><li>InstallKubelet——跳过 kubelet 配置文件下发</li><li>ConfigKubelet——跳过 kubelet安装</li></ul> 
     * @return SkipOptions <p>添加已有节点时需要跳过的步骤，默认为空，当前支持 :</p><ul><li>ResetCVM——跳过 CVM 重装（请确保 TKE 的 UserData 已经写入 CVM）</li><li>InstallRuntime——跳过运行时安装</li><li>ConfigRuntime——跳过运行时配置文件下发</li><li>InstallKubelet——跳过 kubelet 配置文件下发</li><li>ConfigKubelet——跳过 kubelet安装</li></ul>
     */
    public String [] getSkipOptions() {
        return this.SkipOptions;
    }

    /**
     * Set <p>添加已有节点时需要跳过的步骤，默认为空，当前支持 :</p><ul><li>ResetCVM——跳过 CVM 重装（请确保 TKE 的 UserData 已经写入 CVM）</li><li>InstallRuntime——跳过运行时安装</li><li>ConfigRuntime——跳过运行时配置文件下发</li><li>InstallKubelet——跳过 kubelet 配置文件下发</li><li>ConfigKubelet——跳过 kubelet安装</li></ul>
     * @param SkipOptions <p>添加已有节点时需要跳过的步骤，默认为空，当前支持 :</p><ul><li>ResetCVM——跳过 CVM 重装（请确保 TKE 的 UserData 已经写入 CVM）</li><li>InstallRuntime——跳过运行时安装</li><li>ConfigRuntime——跳过运行时配置文件下发</li><li>InstallKubelet——跳过 kubelet 配置文件下发</li><li>ConfigKubelet——跳过 kubelet安装</li></ul>
     */
    public void setSkipOptions(String [] SkipOptions) {
        this.SkipOptions = SkipOptions;
    }

    /**
     * Get <p>节点镜像</p> 
     * @return ImageId <p>节点镜像</p>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>节点镜像</p>
     * @param ImageId <p>节点镜像</p>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>直接添加为原生节点</p> 
     * @return NodeType <p>直接添加为原生节点</p>
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set <p>直接添加为原生节点</p>
     * @param NodeType <p>直接添加为原生节点</p>
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get <p>云标签列表</p> 
     * @return Tags <p>云标签列表</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>云标签列表</p>
     * @param Tags <p>云标签列表</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>自动续费标识，NOTIFY_AND_AUTO_RENEW（通知过期且自动续费）、NOTIFY_AND_MANUAL_RENEW（通知过期不自动续费）</p> 
     * @return RenewFlag <p>自动续费标识，NOTIFY_AND_AUTO_RENEW（通知过期且自动续费）、NOTIFY_AND_MANUAL_RENEW（通知过期不自动续费）</p>
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>自动续费标识，NOTIFY_AND_AUTO_RENEW（通知过期且自动续费）、NOTIFY_AND_MANUAL_RENEW（通知过期不自动续费）</p>
     * @param RenewFlag <p>自动续费标识，NOTIFY_AND_AUTO_RENEW（通知过期且自动续费）、NOTIFY_AND_MANUAL_RENEW（通知过期不自动续费）</p>
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    public AddExistedInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddExistedInstancesRequest(AddExistedInstancesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.InstanceAdvancedSettings != null) {
            this.InstanceAdvancedSettings = new InstanceAdvancedSettings(source.InstanceAdvancedSettings);
        }
        if (source.EnhancedService != null) {
            this.EnhancedService = new EnhancedService(source.EnhancedService);
        }
        if (source.LoginSettings != null) {
            this.LoginSettings = new LoginSettings(source.LoginSettings);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.NodePool != null) {
            this.NodePool = new NodePoolOption(source.NodePool);
        }
        if (source.SkipValidateOptions != null) {
            this.SkipValidateOptions = new String[source.SkipValidateOptions.length];
            for (int i = 0; i < source.SkipValidateOptions.length; i++) {
                this.SkipValidateOptions[i] = new String(source.SkipValidateOptions[i]);
            }
        }
        if (source.InstanceAdvancedSettingsOverrides != null) {
            this.InstanceAdvancedSettingsOverrides = new InstanceAdvancedSettings[source.InstanceAdvancedSettingsOverrides.length];
            for (int i = 0; i < source.InstanceAdvancedSettingsOverrides.length; i++) {
                this.InstanceAdvancedSettingsOverrides[i] = new InstanceAdvancedSettings(source.InstanceAdvancedSettingsOverrides[i]);
            }
        }
        if (source.SkipOptions != null) {
            this.SkipOptions = new String[source.SkipOptions.length];
            for (int i = 0; i < source.SkipOptions.length; i++) {
                this.SkipOptions[i] = new String(source.SkipOptions[i]);
            }
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamObj(map, prefix + "InstanceAdvancedSettings.", this.InstanceAdvancedSettings);
        this.setParamObj(map, prefix + "EnhancedService.", this.EnhancedService);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamObj(map, prefix + "NodePool.", this.NodePool);
        this.setParamArraySimple(map, prefix + "SkipValidateOptions.", this.SkipValidateOptions);
        this.setParamArrayObj(map, prefix + "InstanceAdvancedSettingsOverrides.", this.InstanceAdvancedSettingsOverrides);
        this.setParamArraySimple(map, prefix + "SkipOptions.", this.SkipOptions);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);

    }
}

