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

public class AddNodesRequest extends AbstractModel {

    /**
    * <p>集群中实例所在的位置。</p>
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * <p>集群ID。</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>私有网络相关信息配置。</p>
    */
    @SerializedName("VirtualPrivateCloud")
    @Expose
    private VirtualPrivateCloud VirtualPrivateCloud;

    /**
    * <p>添加节点数量。</p>
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * <p>指定有效的<a href="https://cloud.tencent.com/document/product/213/4940">镜像</a>ID，格式形如<code>img-xxx</code>。目前仅支持公有镜像和特定自定义镜像。</p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>节点<a href="https://cloud.tencent.com/document/product/213/2180">计费类型</a>。<br><li>PREPAID：预付费，即包年包月</li><br><li>POSTPAID_BY_HOUR：按小时后付费</li><br><li>SPOTPAID：竞价付费<br>默认值：POSTPAID_BY_HOUR。</li></p>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月节点的购买时长、是否设置自动续费等属性。若指定节点的付费模式为预付费则该参数必传。</p>
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * <p>节点机型。不同实例机型指定了不同的资源规格。<br><li>具体取值可通过调用接口<a href="https://cloud.tencent.com/document/api/213/15749">DescribeInstanceTypeConfigs</a>来获得最新的规格表或参见<a href="https://cloud.tencent.com/document/product/213/11518">实例规格</a>描述。</li></p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>节点系统盘配置信息。若不指定该参数，则按照系统默认值进行分配。</p>
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk [] SystemDisk;

    /**
    * <p>节点数据盘配置信息。若不指定该参数，则默认不购买数据盘。支持购买的时候指定21块数据盘，其中最多包含1块LOCAL_BASIC数据盘或者LOCAL_SSD数据盘，最多包含20块CLOUD_BASIC数据盘、CLOUD_PREMIUM数据盘或者CLOUD_SSD数据盘。</p>
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

    /**
    * <p>公网带宽相关信息设置。若不指定该参数，则默认公网带宽为0Mbps。</p>
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * <p>节点显示名称。<br>不指定节点显示名称则默认显示‘未命名’。<br>最多支持60个字符。</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

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
    * <p>队列名称。不指定则为默认队列。<li>SLURM默认队列为：compute。</li></p>
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * <p>添加节点角色。默认值：Compute<br><li>Compute：计算节点。</li><br><li>Login：登录节点。</li></p>
    */
    @SerializedName("NodeRole")
    @Expose
    private String NodeRole;

    /**
    * <p>是否只预检此次请求。<br>true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数，请求格式，业务限制和云服务器库存。<br>如果检查不通过，则返回对应错误码；<br>如果检查通过，则返回RequestId.<br>false（默认）：发送正常请求，通过检查后直接创建实例</p>
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * <p>添加节点类型。默认取值：STATIC。<li>STATIC：静态节点，不会参与弹性伸缩流程。</li><li>DYNAMIC：弹性节点，会被弹性缩容的节点。管控节点和登录节点不支持此参数。</li></p>
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

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
     * Get <p>集群ID。</p> 
     * @return ClusterId <p>集群ID。</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID。</p>
     * @param ClusterId <p>集群ID。</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
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
     * Get <p>添加节点数量。</p> 
     * @return Count <p>添加节点数量。</p>
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set <p>添加节点数量。</p>
     * @param Count <p>添加节点数量。</p>
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get <p>指定有效的<a href="https://cloud.tencent.com/document/product/213/4940">镜像</a>ID，格式形如<code>img-xxx</code>。目前仅支持公有镜像和特定自定义镜像。</p> 
     * @return ImageId <p>指定有效的<a href="https://cloud.tencent.com/document/product/213/4940">镜像</a>ID，格式形如<code>img-xxx</code>。目前仅支持公有镜像和特定自定义镜像。</p>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>指定有效的<a href="https://cloud.tencent.com/document/product/213/4940">镜像</a>ID，格式形如<code>img-xxx</code>。目前仅支持公有镜像和特定自定义镜像。</p>
     * @param ImageId <p>指定有效的<a href="https://cloud.tencent.com/document/product/213/4940">镜像</a>ID，格式形如<code>img-xxx</code>。目前仅支持公有镜像和特定自定义镜像。</p>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>节点<a href="https://cloud.tencent.com/document/product/213/2180">计费类型</a>。<br><li>PREPAID：预付费，即包年包月</li><br><li>POSTPAID_BY_HOUR：按小时后付费</li><br><li>SPOTPAID：竞价付费<br>默认值：POSTPAID_BY_HOUR。</li></p> 
     * @return InstanceChargeType <p>节点<a href="https://cloud.tencent.com/document/product/213/2180">计费类型</a>。<br><li>PREPAID：预付费，即包年包月</li><br><li>POSTPAID_BY_HOUR：按小时后付费</li><br><li>SPOTPAID：竞价付费<br>默认值：POSTPAID_BY_HOUR。</li></p>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set <p>节点<a href="https://cloud.tencent.com/document/product/213/2180">计费类型</a>。<br><li>PREPAID：预付费，即包年包月</li><br><li>POSTPAID_BY_HOUR：按小时后付费</li><br><li>SPOTPAID：竞价付费<br>默认值：POSTPAID_BY_HOUR。</li></p>
     * @param InstanceChargeType <p>节点<a href="https://cloud.tencent.com/document/product/213/2180">计费类型</a>。<br><li>PREPAID：预付费，即包年包月</li><br><li>POSTPAID_BY_HOUR：按小时后付费</li><br><li>SPOTPAID：竞价付费<br>默认值：POSTPAID_BY_HOUR。</li></p>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月节点的购买时长、是否设置自动续费等属性。若指定节点的付费模式为预付费则该参数必传。</p> 
     * @return InstanceChargePrepaid <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月节点的购买时长、是否设置自动续费等属性。若指定节点的付费模式为预付费则该参数必传。</p>
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月节点的购买时长、是否设置自动续费等属性。若指定节点的付费模式为预付费则该参数必传。</p>
     * @param InstanceChargePrepaid <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月节点的购买时长、是否设置自动续费等属性。若指定节点的付费模式为预付费则该参数必传。</p>
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get <p>节点机型。不同实例机型指定了不同的资源规格。<br><li>具体取值可通过调用接口<a href="https://cloud.tencent.com/document/api/213/15749">DescribeInstanceTypeConfigs</a>来获得最新的规格表或参见<a href="https://cloud.tencent.com/document/product/213/11518">实例规格</a>描述。</li></p> 
     * @return InstanceType <p>节点机型。不同实例机型指定了不同的资源规格。<br><li>具体取值可通过调用接口<a href="https://cloud.tencent.com/document/api/213/15749">DescribeInstanceTypeConfigs</a>来获得最新的规格表或参见<a href="https://cloud.tencent.com/document/product/213/11518">实例规格</a>描述。</li></p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>节点机型。不同实例机型指定了不同的资源规格。<br><li>具体取值可通过调用接口<a href="https://cloud.tencent.com/document/api/213/15749">DescribeInstanceTypeConfigs</a>来获得最新的规格表或参见<a href="https://cloud.tencent.com/document/product/213/11518">实例规格</a>描述。</li></p>
     * @param InstanceType <p>节点机型。不同实例机型指定了不同的资源规格。<br><li>具体取值可通过调用接口<a href="https://cloud.tencent.com/document/api/213/15749">DescribeInstanceTypeConfigs</a>来获得最新的规格表或参见<a href="https://cloud.tencent.com/document/product/213/11518">实例规格</a>描述。</li></p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>节点系统盘配置信息。若不指定该参数，则按照系统默认值进行分配。</p> 
     * @return SystemDisk <p>节点系统盘配置信息。若不指定该参数，则按照系统默认值进行分配。</p>
     */
    public SystemDisk [] getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set <p>节点系统盘配置信息。若不指定该参数，则按照系统默认值进行分配。</p>
     * @param SystemDisk <p>节点系统盘配置信息。若不指定该参数，则按照系统默认值进行分配。</p>
     */
    public void setSystemDisk(SystemDisk [] SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get <p>节点数据盘配置信息。若不指定该参数，则默认不购买数据盘。支持购买的时候指定21块数据盘，其中最多包含1块LOCAL_BASIC数据盘或者LOCAL_SSD数据盘，最多包含20块CLOUD_BASIC数据盘、CLOUD_PREMIUM数据盘或者CLOUD_SSD数据盘。</p> 
     * @return DataDisks <p>节点数据盘配置信息。若不指定该参数，则默认不购买数据盘。支持购买的时候指定21块数据盘，其中最多包含1块LOCAL_BASIC数据盘或者LOCAL_SSD数据盘，最多包含20块CLOUD_BASIC数据盘、CLOUD_PREMIUM数据盘或者CLOUD_SSD数据盘。</p>
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set <p>节点数据盘配置信息。若不指定该参数，则默认不购买数据盘。支持购买的时候指定21块数据盘，其中最多包含1块LOCAL_BASIC数据盘或者LOCAL_SSD数据盘，最多包含20块CLOUD_BASIC数据盘、CLOUD_PREMIUM数据盘或者CLOUD_SSD数据盘。</p>
     * @param DataDisks <p>节点数据盘配置信息。若不指定该参数，则默认不购买数据盘。支持购买的时候指定21块数据盘，其中最多包含1块LOCAL_BASIC数据盘或者LOCAL_SSD数据盘，最多包含20块CLOUD_BASIC数据盘、CLOUD_PREMIUM数据盘或者CLOUD_SSD数据盘。</p>
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * Get <p>公网带宽相关信息设置。若不指定该参数，则默认公网带宽为0Mbps。</p> 
     * @return InternetAccessible <p>公网带宽相关信息设置。若不指定该参数，则默认公网带宽为0Mbps。</p>
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set <p>公网带宽相关信息设置。若不指定该参数，则默认公网带宽为0Mbps。</p>
     * @param InternetAccessible <p>公网带宽相关信息设置。若不指定该参数，则默认公网带宽为0Mbps。</p>
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Get <p>节点显示名称。<br>不指定节点显示名称则默认显示‘未命名’。<br>最多支持60个字符。</p> 
     * @return InstanceName <p>节点显示名称。<br>不指定节点显示名称则默认显示‘未命名’。<br>最多支持60个字符。</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>节点显示名称。<br>不指定节点显示名称则默认显示‘未命名’。<br>最多支持60个字符。</p>
     * @param InstanceName <p>节点显示名称。<br>不指定节点显示名称则默认显示‘未命名’。<br>最多支持60个字符。</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
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
     * Get <p>队列名称。不指定则为默认队列。<li>SLURM默认队列为：compute。</li></p> 
     * @return QueueName <p>队列名称。不指定则为默认队列。<li>SLURM默认队列为：compute。</li></p>
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set <p>队列名称。不指定则为默认队列。<li>SLURM默认队列为：compute。</li></p>
     * @param QueueName <p>队列名称。不指定则为默认队列。<li>SLURM默认队列为：compute。</li></p>
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get <p>添加节点角色。默认值：Compute<br><li>Compute：计算节点。</li><br><li>Login：登录节点。</li></p> 
     * @return NodeRole <p>添加节点角色。默认值：Compute<br><li>Compute：计算节点。</li><br><li>Login：登录节点。</li></p>
     */
    public String getNodeRole() {
        return this.NodeRole;
    }

    /**
     * Set <p>添加节点角色。默认值：Compute<br><li>Compute：计算节点。</li><br><li>Login：登录节点。</li></p>
     * @param NodeRole <p>添加节点角色。默认值：Compute<br><li>Compute：计算节点。</li><br><li>Login：登录节点。</li></p>
     */
    public void setNodeRole(String NodeRole) {
        this.NodeRole = NodeRole;
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
     * Get <p>添加节点类型。默认取值：STATIC。<li>STATIC：静态节点，不会参与弹性伸缩流程。</li><li>DYNAMIC：弹性节点，会被弹性缩容的节点。管控节点和登录节点不支持此参数。</li></p> 
     * @return NodeType <p>添加节点类型。默认取值：STATIC。<li>STATIC：静态节点，不会参与弹性伸缩流程。</li><li>DYNAMIC：弹性节点，会被弹性缩容的节点。管控节点和登录节点不支持此参数。</li></p>
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set <p>添加节点类型。默认取值：STATIC。<li>STATIC：静态节点，不会参与弹性伸缩流程。</li><li>DYNAMIC：弹性节点，会被弹性缩容的节点。管控节点和登录节点不支持此参数。</li></p>
     * @param NodeType <p>添加节点类型。默认取值：STATIC。<li>STATIC：静态节点，不会参与弹性伸缩流程。</li><li>DYNAMIC：弹性节点，会被弹性缩容的节点。管控节点和登录节点不支持此参数。</li></p>
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    public AddNodesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddNodesRequest(AddNodesRequest source) {
        if (source.Placement != null) {
            this.Placement = new Placement(source.Placement);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.VirtualPrivateCloud != null) {
            this.VirtualPrivateCloud = new VirtualPrivateCloud(source.VirtualPrivateCloud);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.InstanceChargePrepaid != null) {
            this.InstanceChargePrepaid = new InstanceChargePrepaid(source.InstanceChargePrepaid);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.SystemDisk != null) {
            this.SystemDisk = new SystemDisk[source.SystemDisk.length];
            for (int i = 0; i < source.SystemDisk.length; i++) {
                this.SystemDisk[i] = new SystemDisk(source.SystemDisk[i]);
            }
        }
        if (source.DataDisks != null) {
            this.DataDisks = new DataDisk[source.DataDisks.length];
            for (int i = 0; i < source.DataDisks.length; i++) {
                this.DataDisks[i] = new DataDisk(source.DataDisks[i]);
            }
        }
        if (source.InternetAccessible != null) {
            this.InternetAccessible = new InternetAccessible(source.InternetAccessible);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
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
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.NodeRole != null) {
            this.NodeRole = new String(source.NodeRole);
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamObj(map, prefix + "VirtualPrivateCloud.", this.VirtualPrivateCloud);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamArrayObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "NodeRole", this.NodeRole);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);

    }
}

