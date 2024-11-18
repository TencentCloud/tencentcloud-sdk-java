/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.thpc.v20230321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateClusterRequest extends AbstractModel {

    /**
    * 集群中实例所在的位置。
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * 指定管理节点。
    */
    @SerializedName("ManagerNode")
    @Expose
    private ManagerNode ManagerNode;

    /**
    * 指定管理节点的数量。默认取值：1。取值范围：1～2。
    */
    @SerializedName("ManagerNodeCount")
    @Expose
    private Long ManagerNodeCount;

    /**
    * 指定计算节点。
    */
    @SerializedName("ComputeNode")
    @Expose
    private ComputeNode ComputeNode;

    /**
    * 指定计算节点的数量。默认取值：0。
    */
    @SerializedName("ComputeNodeCount")
    @Expose
    private Long ComputeNodeCount;

    /**
    * 调度器类型。默认取值：SLURM。<li>SGE：SGE调度器。</li><li>SLURM：SLURM调度器。</li>
    */
    @SerializedName("SchedulerType")
    @Expose
    private String SchedulerType;

    /**
    * 创建调度器的版本号，可填写版本号为“latest” 和 各调度器支持的版本号；如果是"latest", 则代表创建的是平台当前支持的该类型调度器最新版本。如果不填写，默认创建的是“latest”版本调度器
各调度器支持的集群版本：
<li>SLURM：21.08.8、23.11.7</li>
<li>SGE：     8.1.9</li>
    */
    @SerializedName("SchedulerVersion")
    @Expose
    private String SchedulerVersion;

    /**
    * 指定有效的[镜像](https://cloud.tencent.com/document/product/213/4940)ID，格式形如`img-xxx`。目前支持部分公有镜像和自定义镜像。公共镜像请参考[镜像限制](https://cloud.tencent.com/document/product/1527/64818)
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 私有网络相关信息配置。
    */
    @SerializedName("VirtualPrivateCloud")
    @Expose
    private VirtualPrivateCloud VirtualPrivateCloud;

    /**
    * 集群登录设置。
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSettings LoginSettings;

    /**
    * 集群中实例所属安全组。该参数可以通过调用 [DescribeSecurityGroups](https://cloud.tencent.com/document/api/215/15808) 的返回值中的sgId字段来获取。若不指定该参数，则绑定默认安全组。
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * 是否只预检此次请求。
true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数，请求格式，业务限制和云服务器库存。
如果检查不通过，则返回对应错误码；
如果检查通过，则返回RequestId.
false（默认）：发送正常请求，通过检查后直接创建实例
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * 域名字服务类型。默认取值：NIS。
<li>NIS：NIS域名字服务。</li>
    */
    @SerializedName("AccountType")
    @Expose
    private String AccountType;

    /**
    * 集群显示名称。
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 集群存储选项
    */
    @SerializedName("StorageOption")
    @Expose
    private StorageOption StorageOption;

    /**
    * 指定登录节点。
    */
    @SerializedName("LoginNode")
    @Expose
    private LoginNode LoginNode;

    /**
    * 指定登录节点的数量。默认取值：0。取值范围：0～10。
    */
    @SerializedName("LoginNodeCount")
    @Expose
    private Long LoginNodeCount;

    /**
    * 创建集群时同时绑定的标签对说明。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 弹性伸缩类型。默认值：THPC_AS
    */
    @SerializedName("AutoScalingType")
    @Expose
    private String AutoScalingType;

    /**
    * 节点初始化脚本信息列表。
    */
    @SerializedName("InitNodeScripts")
    @Expose
    private NodeScript [] InitNodeScripts;

    /**
    * 高性能计算集群ID。若创建的实例为高性能计算实例，需指定实例放置的集群，否则不可指定。
    */
    @SerializedName("HpcClusterId")
    @Expose
    private String HpcClusterId;

    /**
     * Get 集群中实例所在的位置。 
     * @return Placement 集群中实例所在的位置。
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set 集群中实例所在的位置。
     * @param Placement 集群中实例所在的位置。
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get 指定管理节点。 
     * @return ManagerNode 指定管理节点。
     */
    public ManagerNode getManagerNode() {
        return this.ManagerNode;
    }

    /**
     * Set 指定管理节点。
     * @param ManagerNode 指定管理节点。
     */
    public void setManagerNode(ManagerNode ManagerNode) {
        this.ManagerNode = ManagerNode;
    }

    /**
     * Get 指定管理节点的数量。默认取值：1。取值范围：1～2。 
     * @return ManagerNodeCount 指定管理节点的数量。默认取值：1。取值范围：1～2。
     */
    public Long getManagerNodeCount() {
        return this.ManagerNodeCount;
    }

    /**
     * Set 指定管理节点的数量。默认取值：1。取值范围：1～2。
     * @param ManagerNodeCount 指定管理节点的数量。默认取值：1。取值范围：1～2。
     */
    public void setManagerNodeCount(Long ManagerNodeCount) {
        this.ManagerNodeCount = ManagerNodeCount;
    }

    /**
     * Get 指定计算节点。 
     * @return ComputeNode 指定计算节点。
     */
    public ComputeNode getComputeNode() {
        return this.ComputeNode;
    }

    /**
     * Set 指定计算节点。
     * @param ComputeNode 指定计算节点。
     */
    public void setComputeNode(ComputeNode ComputeNode) {
        this.ComputeNode = ComputeNode;
    }

    /**
     * Get 指定计算节点的数量。默认取值：0。 
     * @return ComputeNodeCount 指定计算节点的数量。默认取值：0。
     */
    public Long getComputeNodeCount() {
        return this.ComputeNodeCount;
    }

    /**
     * Set 指定计算节点的数量。默认取值：0。
     * @param ComputeNodeCount 指定计算节点的数量。默认取值：0。
     */
    public void setComputeNodeCount(Long ComputeNodeCount) {
        this.ComputeNodeCount = ComputeNodeCount;
    }

    /**
     * Get 调度器类型。默认取值：SLURM。<li>SGE：SGE调度器。</li><li>SLURM：SLURM调度器。</li> 
     * @return SchedulerType 调度器类型。默认取值：SLURM。<li>SGE：SGE调度器。</li><li>SLURM：SLURM调度器。</li>
     */
    public String getSchedulerType() {
        return this.SchedulerType;
    }

    /**
     * Set 调度器类型。默认取值：SLURM。<li>SGE：SGE调度器。</li><li>SLURM：SLURM调度器。</li>
     * @param SchedulerType 调度器类型。默认取值：SLURM。<li>SGE：SGE调度器。</li><li>SLURM：SLURM调度器。</li>
     */
    public void setSchedulerType(String SchedulerType) {
        this.SchedulerType = SchedulerType;
    }

    /**
     * Get 创建调度器的版本号，可填写版本号为“latest” 和 各调度器支持的版本号；如果是"latest", 则代表创建的是平台当前支持的该类型调度器最新版本。如果不填写，默认创建的是“latest”版本调度器
各调度器支持的集群版本：
<li>SLURM：21.08.8、23.11.7</li>
<li>SGE：     8.1.9</li> 
     * @return SchedulerVersion 创建调度器的版本号，可填写版本号为“latest” 和 各调度器支持的版本号；如果是"latest", 则代表创建的是平台当前支持的该类型调度器最新版本。如果不填写，默认创建的是“latest”版本调度器
各调度器支持的集群版本：
<li>SLURM：21.08.8、23.11.7</li>
<li>SGE：     8.1.9</li>
     */
    public String getSchedulerVersion() {
        return this.SchedulerVersion;
    }

    /**
     * Set 创建调度器的版本号，可填写版本号为“latest” 和 各调度器支持的版本号；如果是"latest", 则代表创建的是平台当前支持的该类型调度器最新版本。如果不填写，默认创建的是“latest”版本调度器
各调度器支持的集群版本：
<li>SLURM：21.08.8、23.11.7</li>
<li>SGE：     8.1.9</li>
     * @param SchedulerVersion 创建调度器的版本号，可填写版本号为“latest” 和 各调度器支持的版本号；如果是"latest", 则代表创建的是平台当前支持的该类型调度器最新版本。如果不填写，默认创建的是“latest”版本调度器
各调度器支持的集群版本：
<li>SLURM：21.08.8、23.11.7</li>
<li>SGE：     8.1.9</li>
     */
    public void setSchedulerVersion(String SchedulerVersion) {
        this.SchedulerVersion = SchedulerVersion;
    }

    /**
     * Get 指定有效的[镜像](https://cloud.tencent.com/document/product/213/4940)ID，格式形如`img-xxx`。目前支持部分公有镜像和自定义镜像。公共镜像请参考[镜像限制](https://cloud.tencent.com/document/product/1527/64818) 
     * @return ImageId 指定有效的[镜像](https://cloud.tencent.com/document/product/213/4940)ID，格式形如`img-xxx`。目前支持部分公有镜像和自定义镜像。公共镜像请参考[镜像限制](https://cloud.tencent.com/document/product/1527/64818)
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 指定有效的[镜像](https://cloud.tencent.com/document/product/213/4940)ID，格式形如`img-xxx`。目前支持部分公有镜像和自定义镜像。公共镜像请参考[镜像限制](https://cloud.tencent.com/document/product/1527/64818)
     * @param ImageId 指定有效的[镜像](https://cloud.tencent.com/document/product/213/4940)ID，格式形如`img-xxx`。目前支持部分公有镜像和自定义镜像。公共镜像请参考[镜像限制](https://cloud.tencent.com/document/product/1527/64818)
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 私有网络相关信息配置。 
     * @return VirtualPrivateCloud 私有网络相关信息配置。
     */
    public VirtualPrivateCloud getVirtualPrivateCloud() {
        return this.VirtualPrivateCloud;
    }

    /**
     * Set 私有网络相关信息配置。
     * @param VirtualPrivateCloud 私有网络相关信息配置。
     */
    public void setVirtualPrivateCloud(VirtualPrivateCloud VirtualPrivateCloud) {
        this.VirtualPrivateCloud = VirtualPrivateCloud;
    }

    /**
     * Get 集群登录设置。 
     * @return LoginSettings 集群登录设置。
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set 集群登录设置。
     * @param LoginSettings 集群登录设置。
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * Get 集群中实例所属安全组。该参数可以通过调用 [DescribeSecurityGroups](https://cloud.tencent.com/document/api/215/15808) 的返回值中的sgId字段来获取。若不指定该参数，则绑定默认安全组。 
     * @return SecurityGroupIds 集群中实例所属安全组。该参数可以通过调用 [DescribeSecurityGroups](https://cloud.tencent.com/document/api/215/15808) 的返回值中的sgId字段来获取。若不指定该参数，则绑定默认安全组。
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 集群中实例所属安全组。该参数可以通过调用 [DescribeSecurityGroups](https://cloud.tencent.com/document/api/215/15808) 的返回值中的sgId字段来获取。若不指定该参数，则绑定默认安全组。
     * @param SecurityGroupIds 集群中实例所属安全组。该参数可以通过调用 [DescribeSecurityGroups](https://cloud.tencent.com/document/api/215/15808) 的返回值中的sgId字段来获取。若不指定该参数，则绑定默认安全组。
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。 
     * @return ClientToken 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
     * @param ClientToken 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get 是否只预检此次请求。
true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数，请求格式，业务限制和云服务器库存。
如果检查不通过，则返回对应错误码；
如果检查通过，则返回RequestId.
false（默认）：发送正常请求，通过检查后直接创建实例 
     * @return DryRun 是否只预检此次请求。
true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数，请求格式，业务限制和云服务器库存。
如果检查不通过，则返回对应错误码；
如果检查通过，则返回RequestId.
false（默认）：发送正常请求，通过检查后直接创建实例
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set 是否只预检此次请求。
true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数，请求格式，业务限制和云服务器库存。
如果检查不通过，则返回对应错误码；
如果检查通过，则返回RequestId.
false（默认）：发送正常请求，通过检查后直接创建实例
     * @param DryRun 是否只预检此次请求。
true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数，请求格式，业务限制和云服务器库存。
如果检查不通过，则返回对应错误码；
如果检查通过，则返回RequestId.
false（默认）：发送正常请求，通过检查后直接创建实例
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get 域名字服务类型。默认取值：NIS。
<li>NIS：NIS域名字服务。</li> 
     * @return AccountType 域名字服务类型。默认取值：NIS。
<li>NIS：NIS域名字服务。</li>
     */
    public String getAccountType() {
        return this.AccountType;
    }

    /**
     * Set 域名字服务类型。默认取值：NIS。
<li>NIS：NIS域名字服务。</li>
     * @param AccountType 域名字服务类型。默认取值：NIS。
<li>NIS：NIS域名字服务。</li>
     */
    public void setAccountType(String AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get 集群显示名称。 
     * @return ClusterName 集群显示名称。
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群显示名称。
     * @param ClusterName 集群显示名称。
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 集群存储选项 
     * @return StorageOption 集群存储选项
     */
    public StorageOption getStorageOption() {
        return this.StorageOption;
    }

    /**
     * Set 集群存储选项
     * @param StorageOption 集群存储选项
     */
    public void setStorageOption(StorageOption StorageOption) {
        this.StorageOption = StorageOption;
    }

    /**
     * Get 指定登录节点。 
     * @return LoginNode 指定登录节点。
     */
    public LoginNode getLoginNode() {
        return this.LoginNode;
    }

    /**
     * Set 指定登录节点。
     * @param LoginNode 指定登录节点。
     */
    public void setLoginNode(LoginNode LoginNode) {
        this.LoginNode = LoginNode;
    }

    /**
     * Get 指定登录节点的数量。默认取值：0。取值范围：0～10。 
     * @return LoginNodeCount 指定登录节点的数量。默认取值：0。取值范围：0～10。
     */
    public Long getLoginNodeCount() {
        return this.LoginNodeCount;
    }

    /**
     * Set 指定登录节点的数量。默认取值：0。取值范围：0～10。
     * @param LoginNodeCount 指定登录节点的数量。默认取值：0。取值范围：0～10。
     */
    public void setLoginNodeCount(Long LoginNodeCount) {
        this.LoginNodeCount = LoginNodeCount;
    }

    /**
     * Get 创建集群时同时绑定的标签对说明。 
     * @return Tags 创建集群时同时绑定的标签对说明。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 创建集群时同时绑定的标签对说明。
     * @param Tags 创建集群时同时绑定的标签对说明。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 弹性伸缩类型。默认值：THPC_AS 
     * @return AutoScalingType 弹性伸缩类型。默认值：THPC_AS
     */
    public String getAutoScalingType() {
        return this.AutoScalingType;
    }

    /**
     * Set 弹性伸缩类型。默认值：THPC_AS
     * @param AutoScalingType 弹性伸缩类型。默认值：THPC_AS
     */
    public void setAutoScalingType(String AutoScalingType) {
        this.AutoScalingType = AutoScalingType;
    }

    /**
     * Get 节点初始化脚本信息列表。 
     * @return InitNodeScripts 节点初始化脚本信息列表。
     */
    public NodeScript [] getInitNodeScripts() {
        return this.InitNodeScripts;
    }

    /**
     * Set 节点初始化脚本信息列表。
     * @param InitNodeScripts 节点初始化脚本信息列表。
     */
    public void setInitNodeScripts(NodeScript [] InitNodeScripts) {
        this.InitNodeScripts = InitNodeScripts;
    }

    /**
     * Get 高性能计算集群ID。若创建的实例为高性能计算实例，需指定实例放置的集群，否则不可指定。 
     * @return HpcClusterId 高性能计算集群ID。若创建的实例为高性能计算实例，需指定实例放置的集群，否则不可指定。
     */
    public String getHpcClusterId() {
        return this.HpcClusterId;
    }

    /**
     * Set 高性能计算集群ID。若创建的实例为高性能计算实例，需指定实例放置的集群，否则不可指定。
     * @param HpcClusterId 高性能计算集群ID。若创建的实例为高性能计算实例，需指定实例放置的集群，否则不可指定。
     */
    public void setHpcClusterId(String HpcClusterId) {
        this.HpcClusterId = HpcClusterId;
    }

    public CreateClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateClusterRequest(CreateClusterRequest source) {
        if (source.Placement != null) {
            this.Placement = new Placement(source.Placement);
        }
        if (source.ManagerNode != null) {
            this.ManagerNode = new ManagerNode(source.ManagerNode);
        }
        if (source.ManagerNodeCount != null) {
            this.ManagerNodeCount = new Long(source.ManagerNodeCount);
        }
        if (source.ComputeNode != null) {
            this.ComputeNode = new ComputeNode(source.ComputeNode);
        }
        if (source.ComputeNodeCount != null) {
            this.ComputeNodeCount = new Long(source.ComputeNodeCount);
        }
        if (source.SchedulerType != null) {
            this.SchedulerType = new String(source.SchedulerType);
        }
        if (source.SchedulerVersion != null) {
            this.SchedulerVersion = new String(source.SchedulerVersion);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.VirtualPrivateCloud != null) {
            this.VirtualPrivateCloud = new VirtualPrivateCloud(source.VirtualPrivateCloud);
        }
        if (source.LoginSettings != null) {
            this.LoginSettings = new LoginSettings(source.LoginSettings);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
        if (source.AccountType != null) {
            this.AccountType = new String(source.AccountType);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.StorageOption != null) {
            this.StorageOption = new StorageOption(source.StorageOption);
        }
        if (source.LoginNode != null) {
            this.LoginNode = new LoginNode(source.LoginNode);
        }
        if (source.LoginNodeCount != null) {
            this.LoginNodeCount = new Long(source.LoginNodeCount);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.AutoScalingType != null) {
            this.AutoScalingType = new String(source.AutoScalingType);
        }
        if (source.InitNodeScripts != null) {
            this.InitNodeScripts = new NodeScript[source.InitNodeScripts.length];
            for (int i = 0; i < source.InitNodeScripts.length; i++) {
                this.InitNodeScripts[i] = new NodeScript(source.InitNodeScripts[i]);
            }
        }
        if (source.HpcClusterId != null) {
            this.HpcClusterId = new String(source.HpcClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamObj(map, prefix + "ManagerNode.", this.ManagerNode);
        this.setParamSimple(map, prefix + "ManagerNodeCount", this.ManagerNodeCount);
        this.setParamObj(map, prefix + "ComputeNode.", this.ComputeNode);
        this.setParamSimple(map, prefix + "ComputeNodeCount", this.ComputeNodeCount);
        this.setParamSimple(map, prefix + "SchedulerType", this.SchedulerType);
        this.setParamSimple(map, prefix + "SchedulerVersion", this.SchedulerVersion);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamObj(map, prefix + "VirtualPrivateCloud.", this.VirtualPrivateCloud);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamObj(map, prefix + "StorageOption.", this.StorageOption);
        this.setParamObj(map, prefix + "LoginNode.", this.LoginNode);
        this.setParamSimple(map, prefix + "LoginNodeCount", this.LoginNodeCount);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "AutoScalingType", this.AutoScalingType);
        this.setParamArrayObj(map, prefix + "InitNodeScripts.", this.InitNodeScripts);
        this.setParamSimple(map, prefix + "HpcClusterId", this.HpcClusterId);

    }
}

