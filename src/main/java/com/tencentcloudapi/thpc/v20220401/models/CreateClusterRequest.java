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
package com.tencentcloudapi.thpc.v20220401.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateClusterRequest extends AbstractModel {

    /**
    * <p>集群中实例所在的位置。</p>
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * <p>指定管理节点。</p>
    */
    @SerializedName("ManagerNode")
    @Expose
    private ManagerNode ManagerNode;

    /**
    * <p>指定管理节点的数量。默认取值：1。取值范围：1～2。</p>
    */
    @SerializedName("ManagerNodeCount")
    @Expose
    private Long ManagerNodeCount;

    /**
    * <p>指定计算节点。</p>
    */
    @SerializedName("ComputeNode")
    @Expose
    private ComputeNode ComputeNode;

    /**
    * <p>指定计算节点的数量。默认取值：0。</p>
    */
    @SerializedName("ComputeNodeCount")
    @Expose
    private Long ComputeNodeCount;

    /**
    * <p>调度器类型。默认取值：SLURM。<br><li>SLURM：SLURM调度器。</li></p>
    */
    @SerializedName("SchedulerType")
    @Expose
    private String SchedulerType;

    /**
    * <p>指定有效的<a href="https://cloud.tencent.com/document/product/213/4940">镜像</a>ID，格式形如<code>img-xxx</code>。目前支持部分公有镜像和自定义镜像。</p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>私有网络相关信息配置。</p>
    */
    @SerializedName("VirtualPrivateCloud")
    @Expose
    private VirtualPrivateCloud VirtualPrivateCloud;

    /**
    * <p>集群登录设置。</p>
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSettings LoginSettings;

    /**
    * <p>集群中实例所属安全组。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的sgId字段来获取。若不指定该参数，则绑定默认安全组。</p>
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * <p>用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。</p>
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * <p>是否只预检此次请求。<br>true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数，请求格式，业务限制和云服务器库存。<br>如果检查不通过，则返回对应错误码；<br>如果检查通过，则返回RequestId.<br>false（默认）：发送正常请求，通过检查后直接创建实例</p>
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * <p>域名字服务类型。默认取值：NIS。<li>NIS：NIS域名字服务。</li></p>
    */
    @SerializedName("AccountType")
    @Expose
    private String AccountType;

    /**
    * <p>集群显示名称。</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>集群存储选项</p>
    */
    @SerializedName("StorageOption")
    @Expose
    private StorageOption StorageOption;

    /**
    * <p>指定登录节点。</p>
    */
    @SerializedName("LoginNode")
    @Expose
    private LoginNode LoginNode;

    /**
    * <p>指定登录节点的数量。默认取值：0。取值范围：0～10。</p>
    */
    @SerializedName("LoginNodeCount")
    @Expose
    private Long LoginNodeCount;

    /**
    * <p>创建集群时同时绑定的标签对说明。</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>弹性伸缩类型。<br><li>AS：集群自动扩缩容由<a href="https://cloud.tencent.com/document/product/377/3154">弹性伸缩</a>产品实现。</li><br><li>THPC_AS：集群自动扩缩容由THPC产品内部实现。</li></p>
    */
    @SerializedName("AutoScalingType")
    @Expose
    private String AutoScalingType;

    /**
     * Get <p>集群中实例所在的位置。</p> 
     * @return Placement <p>集群中实例所在的位置。</p>
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set <p>集群中实例所在的位置。</p>
     * @param Placement <p>集群中实例所在的位置。</p>
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get <p>指定管理节点。</p> 
     * @return ManagerNode <p>指定管理节点。</p>
     */
    public ManagerNode getManagerNode() {
        return this.ManagerNode;
    }

    /**
     * Set <p>指定管理节点。</p>
     * @param ManagerNode <p>指定管理节点。</p>
     */
    public void setManagerNode(ManagerNode ManagerNode) {
        this.ManagerNode = ManagerNode;
    }

    /**
     * Get <p>指定管理节点的数量。默认取值：1。取值范围：1～2。</p> 
     * @return ManagerNodeCount <p>指定管理节点的数量。默认取值：1。取值范围：1～2。</p>
     */
    public Long getManagerNodeCount() {
        return this.ManagerNodeCount;
    }

    /**
     * Set <p>指定管理节点的数量。默认取值：1。取值范围：1～2。</p>
     * @param ManagerNodeCount <p>指定管理节点的数量。默认取值：1。取值范围：1～2。</p>
     */
    public void setManagerNodeCount(Long ManagerNodeCount) {
        this.ManagerNodeCount = ManagerNodeCount;
    }

    /**
     * Get <p>指定计算节点。</p> 
     * @return ComputeNode <p>指定计算节点。</p>
     */
    public ComputeNode getComputeNode() {
        return this.ComputeNode;
    }

    /**
     * Set <p>指定计算节点。</p>
     * @param ComputeNode <p>指定计算节点。</p>
     */
    public void setComputeNode(ComputeNode ComputeNode) {
        this.ComputeNode = ComputeNode;
    }

    /**
     * Get <p>指定计算节点的数量。默认取值：0。</p> 
     * @return ComputeNodeCount <p>指定计算节点的数量。默认取值：0。</p>
     */
    public Long getComputeNodeCount() {
        return this.ComputeNodeCount;
    }

    /**
     * Set <p>指定计算节点的数量。默认取值：0。</p>
     * @param ComputeNodeCount <p>指定计算节点的数量。默认取值：0。</p>
     */
    public void setComputeNodeCount(Long ComputeNodeCount) {
        this.ComputeNodeCount = ComputeNodeCount;
    }

    /**
     * Get <p>调度器类型。默认取值：SLURM。<br><li>SLURM：SLURM调度器。</li></p> 
     * @return SchedulerType <p>调度器类型。默认取值：SLURM。<br><li>SLURM：SLURM调度器。</li></p>
     */
    public String getSchedulerType() {
        return this.SchedulerType;
    }

    /**
     * Set <p>调度器类型。默认取值：SLURM。<br><li>SLURM：SLURM调度器。</li></p>
     * @param SchedulerType <p>调度器类型。默认取值：SLURM。<br><li>SLURM：SLURM调度器。</li></p>
     */
    public void setSchedulerType(String SchedulerType) {
        this.SchedulerType = SchedulerType;
    }

    /**
     * Get <p>指定有效的<a href="https://cloud.tencent.com/document/product/213/4940">镜像</a>ID，格式形如<code>img-xxx</code>。目前支持部分公有镜像和自定义镜像。</p> 
     * @return ImageId <p>指定有效的<a href="https://cloud.tencent.com/document/product/213/4940">镜像</a>ID，格式形如<code>img-xxx</code>。目前支持部分公有镜像和自定义镜像。</p>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>指定有效的<a href="https://cloud.tencent.com/document/product/213/4940">镜像</a>ID，格式形如<code>img-xxx</code>。目前支持部分公有镜像和自定义镜像。</p>
     * @param ImageId <p>指定有效的<a href="https://cloud.tencent.com/document/product/213/4940">镜像</a>ID，格式形如<code>img-xxx</code>。目前支持部分公有镜像和自定义镜像。</p>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>私有网络相关信息配置。</p> 
     * @return VirtualPrivateCloud <p>私有网络相关信息配置。</p>
     */
    public VirtualPrivateCloud getVirtualPrivateCloud() {
        return this.VirtualPrivateCloud;
    }

    /**
     * Set <p>私有网络相关信息配置。</p>
     * @param VirtualPrivateCloud <p>私有网络相关信息配置。</p>
     */
    public void setVirtualPrivateCloud(VirtualPrivateCloud VirtualPrivateCloud) {
        this.VirtualPrivateCloud = VirtualPrivateCloud;
    }

    /**
     * Get <p>集群登录设置。</p> 
     * @return LoginSettings <p>集群登录设置。</p>
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set <p>集群登录设置。</p>
     * @param LoginSettings <p>集群登录设置。</p>
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * Get <p>集群中实例所属安全组。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的sgId字段来获取。若不指定该参数，则绑定默认安全组。</p> 
     * @return SecurityGroupIds <p>集群中实例所属安全组。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的sgId字段来获取。若不指定该参数，则绑定默认安全组。</p>
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>集群中实例所属安全组。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的sgId字段来获取。若不指定该参数，则绑定默认安全组。</p>
     * @param SecurityGroupIds <p>集群中实例所属安全组。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的sgId字段来获取。若不指定该参数，则绑定默认安全组。</p>
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get <p>用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。</p> 
     * @return ClientToken <p>用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。</p>
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set <p>用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。</p>
     * @param ClientToken <p>用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。</p>
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get <p>是否只预检此次请求。<br>true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数，请求格式，业务限制和云服务器库存。<br>如果检查不通过，则返回对应错误码；<br>如果检查通过，则返回RequestId.<br>false（默认）：发送正常请求，通过检查后直接创建实例</p> 
     * @return DryRun <p>是否只预检此次请求。<br>true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数，请求格式，业务限制和云服务器库存。<br>如果检查不通过，则返回对应错误码；<br>如果检查通过，则返回RequestId.<br>false（默认）：发送正常请求，通过检查后直接创建实例</p>
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set <p>是否只预检此次请求。<br>true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数，请求格式，业务限制和云服务器库存。<br>如果检查不通过，则返回对应错误码；<br>如果检查通过，则返回RequestId.<br>false（默认）：发送正常请求，通过检查后直接创建实例</p>
     * @param DryRun <p>是否只预检此次请求。<br>true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数，请求格式，业务限制和云服务器库存。<br>如果检查不通过，则返回对应错误码；<br>如果检查通过，则返回RequestId.<br>false（默认）：发送正常请求，通过检查后直接创建实例</p>
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get <p>域名字服务类型。默认取值：NIS。<li>NIS：NIS域名字服务。</li></p> 
     * @return AccountType <p>域名字服务类型。默认取值：NIS。<li>NIS：NIS域名字服务。</li></p>
     */
    public String getAccountType() {
        return this.AccountType;
    }

    /**
     * Set <p>域名字服务类型。默认取值：NIS。<li>NIS：NIS域名字服务。</li></p>
     * @param AccountType <p>域名字服务类型。默认取值：NIS。<li>NIS：NIS域名字服务。</li></p>
     */
    public void setAccountType(String AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get <p>集群显示名称。</p> 
     * @return ClusterName <p>集群显示名称。</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>集群显示名称。</p>
     * @param ClusterName <p>集群显示名称。</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>集群存储选项</p> 
     * @return StorageOption <p>集群存储选项</p>
     */
    public StorageOption getStorageOption() {
        return this.StorageOption;
    }

    /**
     * Set <p>集群存储选项</p>
     * @param StorageOption <p>集群存储选项</p>
     */
    public void setStorageOption(StorageOption StorageOption) {
        this.StorageOption = StorageOption;
    }

    /**
     * Get <p>指定登录节点。</p> 
     * @return LoginNode <p>指定登录节点。</p>
     */
    public LoginNode getLoginNode() {
        return this.LoginNode;
    }

    /**
     * Set <p>指定登录节点。</p>
     * @param LoginNode <p>指定登录节点。</p>
     */
    public void setLoginNode(LoginNode LoginNode) {
        this.LoginNode = LoginNode;
    }

    /**
     * Get <p>指定登录节点的数量。默认取值：0。取值范围：0～10。</p> 
     * @return LoginNodeCount <p>指定登录节点的数量。默认取值：0。取值范围：0～10。</p>
     */
    public Long getLoginNodeCount() {
        return this.LoginNodeCount;
    }

    /**
     * Set <p>指定登录节点的数量。默认取值：0。取值范围：0～10。</p>
     * @param LoginNodeCount <p>指定登录节点的数量。默认取值：0。取值范围：0～10。</p>
     */
    public void setLoginNodeCount(Long LoginNodeCount) {
        this.LoginNodeCount = LoginNodeCount;
    }

    /**
     * Get <p>创建集群时同时绑定的标签对说明。</p> 
     * @return Tags <p>创建集群时同时绑定的标签对说明。</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>创建集群时同时绑定的标签对说明。</p>
     * @param Tags <p>创建集群时同时绑定的标签对说明。</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>弹性伸缩类型。<br><li>AS：集群自动扩缩容由<a href="https://cloud.tencent.com/document/product/377/3154">弹性伸缩</a>产品实现。</li><br><li>THPC_AS：集群自动扩缩容由THPC产品内部实现。</li></p> 
     * @return AutoScalingType <p>弹性伸缩类型。<br><li>AS：集群自动扩缩容由<a href="https://cloud.tencent.com/document/product/377/3154">弹性伸缩</a>产品实现。</li><br><li>THPC_AS：集群自动扩缩容由THPC产品内部实现。</li></p>
     */
    public String getAutoScalingType() {
        return this.AutoScalingType;
    }

    /**
     * Set <p>弹性伸缩类型。<br><li>AS：集群自动扩缩容由<a href="https://cloud.tencent.com/document/product/377/3154">弹性伸缩</a>产品实现。</li><br><li>THPC_AS：集群自动扩缩容由THPC产品内部实现。</li></p>
     * @param AutoScalingType <p>弹性伸缩类型。<br><li>AS：集群自动扩缩容由<a href="https://cloud.tencent.com/document/product/377/3154">弹性伸缩</a>产品实现。</li><br><li>THPC_AS：集群自动扩缩容由THPC产品内部实现。</li></p>
     */
    public void setAutoScalingType(String AutoScalingType) {
        this.AutoScalingType = AutoScalingType;
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

    }
}

