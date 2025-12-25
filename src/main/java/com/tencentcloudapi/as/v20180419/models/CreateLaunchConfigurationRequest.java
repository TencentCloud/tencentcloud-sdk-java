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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLaunchConfigurationRequest extends AbstractModel {

    /**
    * <p>启动配置显示名称。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超60个字节。</p>
    */
    @SerializedName("LaunchConfigurationName")
    @Expose
    private String LaunchConfigurationName;

    /**
    * <p>指定有效的<a href="https://cloud.tencent.com/document/product/213/4940">镜像</a>ID，格式形如<code>img-8toqc6s3</code>。镜像Id与镜像族名称，二者必填一个且只能填写一个。镜像类型分为四种：<br/><li>公共镜像</li><li>自定义镜像</li><li>共享镜像</li><li>服务市场镜像</li><br/>可通过以下方式获取可用的镜像ID：<br/><li><code>公共镜像</code>、<code>自定义镜像</code>、<code>共享镜像</code>的镜像ID可通过登录<a href="https://console.cloud.tencent.com/cvm/image?rid=1&amp;imageType=PUBLIC_IMAGE">控制台</a>查询；<code>服务镜像市场</code>的镜像ID可通过<a href="https://market.cloud.tencent.com/list">云市场</a>查询。</li><li>通过调用接口 <a href="https://cloud.tencent.com/document/api/213/15715">DescribeImages</a> ，取返回信息中的<code>ImageId</code>字段。</li></p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>启动配置所属项目ID。默认值为0，表示使用默认项目。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/651/78725">DescribeProject</a> 的返回值中的 projectId 字段来获取。注意：伸缩组内实例所属项目ID取伸缩组项目ID，与这里取值无关。</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>实例机型。不同实例机型指定了不同的资源规格，具体取值可通过调用接口 <a href="https://cloud.tencent.com/document/api/213/15749">DescribeInstanceTypeConfigs</a> 来获得最新的规格表或参见<a href="https://cloud.tencent.com/document/product/213/11518">实例类型</a>描述。<code>InstanceType</code>和<code>InstanceTypes</code>参数互斥，二者必填一个且只能填写一个。</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>实例系统盘配置信息。若不指定该参数，则按照系统默认值进行分配。</p>
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk SystemDisk;

    /**
    * <p>实例数据盘配置信息。若不指定该参数，则默认不购买数据盘，最多支持指定11块数据盘。</p>
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
    * <p>实例登录设置。通过该参数可以设置实例的登录方式密码、密钥或保持镜像的原始登录设置。默认情况下会随机生成密码，并以站内信方式知会到用户。</p>
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSettings LoginSettings;

    /**
    * <p>实例所属安全组。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的<code>SecurityGroupId</code>字段来获取。若不指定该参数，则默认不绑定安全组。</p>
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * <p>增强服务。通过该参数可以指定是否开启云安全、云监控等服务。若不指定该参数，则默认开启云监控、云安全服务。</p>
    */
    @SerializedName("EnhancedService")
    @Expose
    private EnhancedService EnhancedService;

    /**
    * <p>经过 Base64 编码后的自定义数据，最大长度不超过16KB。</p>
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
    * <p>实例计费类型，CVM默认值按照POSTPAID_BY_HOUR处理。<li>POSTPAID_BY_HOUR：按小时后付费</li><li>SPOTPAID：竞价付费</li><li>PREPAID：预付费，即包年包月</li><li>CDCPAID：专用集群付费</li></p>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * <p>实例的市场相关选项，如竞价实例相关参数，若指定实例的付费模式为竞价付费则该参数必传。</p>
    */
    @SerializedName("InstanceMarketOptions")
    @Expose
    private InstanceMarketOptionsRequest InstanceMarketOptions;

    /**
    * <p>实例机型列表，不同实例机型指定了不同的资源规格，最多支持10种实例机型。<code>InstanceType</code>和<code>InstanceTypes</code>参数互斥，二者必填一个且只能填写一个。具体取值可通过调用接口<a href="https://cloud.tencent.com/document/api/213/15749">DescribeInstanceTypeConfigs</a>来获得最新的规格表或参见<a href="https://cloud.tencent.com/document/product/213/11518">实例规格描述</a>。</p>
    */
    @SerializedName("InstanceTypes")
    @Expose
    private String [] InstanceTypes;

    /**
    * <p>CAM角色名称。可通过<a href="https://cloud.tencent.com/document/product/598/36223">DescribeRoleList</a>接口返回值中的roleName获取。</p>
    */
    @SerializedName("CamRoleName")
    @Expose
    private String CamRoleName;

    /**
    * <p>实例类型校验策略，取值包括 ALL 和 ANY，默认取值为ANY。该参数仅在 InstanceTypes 入参包含多个机型时生效。<li> ALL，所有实例类型（InstanceType）都可用则通过校验，否则校验报错。</li><li> ANY，存在任何一个实例类型（InstanceType）可用则通过校验，否则校验报错。</li></p><p>实例类型不可用的常见原因包括该实例类型售罄、对应云盘售罄等。如果 InstanceTypes 中一款机型不存在或者已下线，则无论 InstanceTypesCheckPolicy 采用何种取值，都会校验报错。</p>
    */
    @SerializedName("InstanceTypesCheckPolicy")
    @Expose
    private String InstanceTypesCheckPolicy;

    /**
    * <p>标签列表。通过指定该参数，可以为扩容的实例绑定标签。最多支持指定10个标签。</p>
    */
    @SerializedName("InstanceTags")
    @Expose
    private InstanceTag [] InstanceTags;

    /**
    * <p>标签描述列表。通过指定该参数可以支持绑定标签到启动配置。每个启动配置最多支持30个标签。</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>云服务器主机名（HostName）的相关设置。不支持windows实例设置主机名。 新增该属性时，必须传递云服务器的主机名，其它未传递字段会设置为默认值。会校验主机名(如果存在后缀则加上后缀)是否超过最大位数46。</p>
    */
    @SerializedName("HostNameSettings")
    @Expose
    private HostNameSettings HostNameSettings;

    /**
    * <p>云服务器实例名（InstanceName）的相关设置。如果用户在启动配置中设置此字段，则伸缩组创建出的实例 InstanceName 参照此字段进行设置，并传递给 CVM；如果用户未在启动配置中设置此字段，则伸缩组创建出的实例 InstanceName 按照“as-{{ 伸缩组AutoScalingGroupName }}”进行设置，并传递给 CVM。新增该属性时，必须传递云服务器的实例名称，其它未传递字段会设置为默认值。会校验实例名称(如果存在后缀则加上后缀)是否超过最大位数108。</p>
    */
    @SerializedName("InstanceNameSettings")
    @Expose
    private InstanceNameSettings InstanceNameSettings;

    /**
    * <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。</p>
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * <p>云盘类型选择策略，默认取值 ORIGINAL，取值范围：<li>ORIGINAL：使用设置的云盘类型</li><li>AUTOMATIC：自动选择当前可用的云盘类型</li></p>
    */
    @SerializedName("DiskTypePolicy")
    @Expose
    private String DiskTypePolicy;

    /**
    * <p>高性能计算集群ID。可通过调用<a href="https://cloud.tencent.com/document/product/213/83220">DescribeHpcClusters</a>接口获取该参数。注意：此字段默认为空。</p>
    */
    @SerializedName("HpcClusterId")
    @Expose
    private String HpcClusterId;

    /**
    * <p>IPv6公网带宽相关信息设置。若新建实例包含IPv6地址，该参数可为新建实例的IPv6地址分配公网带宽。关联启动配置的伸缩组Ipv6AddressCount参数为0时，该参数不会生效。</p>
    */
    @SerializedName("IPv6InternetAccessible")
    @Expose
    private IPv6InternetAccessible IPv6InternetAccessible;

    /**
    * <p>置放群组id，仅支持指定一个。</p>
    */
    @SerializedName("DisasterRecoverGroupIds")
    @Expose
    private String [] DisasterRecoverGroupIds;

    /**
    * <p>镜像族名称。镜像Id与镜像族名称，二者必填一个且只能填写一个。可通过调用<a href="https://cloud.tencent.com/document/product/213/15715">DescribeImages</a>接口获取该参数。</p>
    */
    @SerializedName("ImageFamily")
    @Expose
    private String ImageFamily;

    /**
    * <p>本地专用集群ID。可通过 <a href="https://cloud.tencent.com/document/product/1346/73758">DescribeDedicatedClusters</a> 接口获取该参数。</p>
    */
    @SerializedName("DedicatedClusterId")
    @Expose
    private String DedicatedClusterId;

    /**
    * <p>自定义metadata。</p>
    */
    @SerializedName("Metadata")
    @Expose
    private Metadata Metadata;

    /**
     * Get <p>启动配置显示名称。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超60个字节。</p> 
     * @return LaunchConfigurationName <p>启动配置显示名称。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超60个字节。</p>
     */
    public String getLaunchConfigurationName() {
        return this.LaunchConfigurationName;
    }

    /**
     * Set <p>启动配置显示名称。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超60个字节。</p>
     * @param LaunchConfigurationName <p>启动配置显示名称。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超60个字节。</p>
     */
    public void setLaunchConfigurationName(String LaunchConfigurationName) {
        this.LaunchConfigurationName = LaunchConfigurationName;
    }

    /**
     * Get <p>指定有效的<a href="https://cloud.tencent.com/document/product/213/4940">镜像</a>ID，格式形如<code>img-8toqc6s3</code>。镜像Id与镜像族名称，二者必填一个且只能填写一个。镜像类型分为四种：<br/><li>公共镜像</li><li>自定义镜像</li><li>共享镜像</li><li>服务市场镜像</li><br/>可通过以下方式获取可用的镜像ID：<br/><li><code>公共镜像</code>、<code>自定义镜像</code>、<code>共享镜像</code>的镜像ID可通过登录<a href="https://console.cloud.tencent.com/cvm/image?rid=1&amp;imageType=PUBLIC_IMAGE">控制台</a>查询；<code>服务镜像市场</code>的镜像ID可通过<a href="https://market.cloud.tencent.com/list">云市场</a>查询。</li><li>通过调用接口 <a href="https://cloud.tencent.com/document/api/213/15715">DescribeImages</a> ，取返回信息中的<code>ImageId</code>字段。</li></p> 
     * @return ImageId <p>指定有效的<a href="https://cloud.tencent.com/document/product/213/4940">镜像</a>ID，格式形如<code>img-8toqc6s3</code>。镜像Id与镜像族名称，二者必填一个且只能填写一个。镜像类型分为四种：<br/><li>公共镜像</li><li>自定义镜像</li><li>共享镜像</li><li>服务市场镜像</li><br/>可通过以下方式获取可用的镜像ID：<br/><li><code>公共镜像</code>、<code>自定义镜像</code>、<code>共享镜像</code>的镜像ID可通过登录<a href="https://console.cloud.tencent.com/cvm/image?rid=1&amp;imageType=PUBLIC_IMAGE">控制台</a>查询；<code>服务镜像市场</code>的镜像ID可通过<a href="https://market.cloud.tencent.com/list">云市场</a>查询。</li><li>通过调用接口 <a href="https://cloud.tencent.com/document/api/213/15715">DescribeImages</a> ，取返回信息中的<code>ImageId</code>字段。</li></p>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>指定有效的<a href="https://cloud.tencent.com/document/product/213/4940">镜像</a>ID，格式形如<code>img-8toqc6s3</code>。镜像Id与镜像族名称，二者必填一个且只能填写一个。镜像类型分为四种：<br/><li>公共镜像</li><li>自定义镜像</li><li>共享镜像</li><li>服务市场镜像</li><br/>可通过以下方式获取可用的镜像ID：<br/><li><code>公共镜像</code>、<code>自定义镜像</code>、<code>共享镜像</code>的镜像ID可通过登录<a href="https://console.cloud.tencent.com/cvm/image?rid=1&amp;imageType=PUBLIC_IMAGE">控制台</a>查询；<code>服务镜像市场</code>的镜像ID可通过<a href="https://market.cloud.tencent.com/list">云市场</a>查询。</li><li>通过调用接口 <a href="https://cloud.tencent.com/document/api/213/15715">DescribeImages</a> ，取返回信息中的<code>ImageId</code>字段。</li></p>
     * @param ImageId <p>指定有效的<a href="https://cloud.tencent.com/document/product/213/4940">镜像</a>ID，格式形如<code>img-8toqc6s3</code>。镜像Id与镜像族名称，二者必填一个且只能填写一个。镜像类型分为四种：<br/><li>公共镜像</li><li>自定义镜像</li><li>共享镜像</li><li>服务市场镜像</li><br/>可通过以下方式获取可用的镜像ID：<br/><li><code>公共镜像</code>、<code>自定义镜像</code>、<code>共享镜像</code>的镜像ID可通过登录<a href="https://console.cloud.tencent.com/cvm/image?rid=1&amp;imageType=PUBLIC_IMAGE">控制台</a>查询；<code>服务镜像市场</code>的镜像ID可通过<a href="https://market.cloud.tencent.com/list">云市场</a>查询。</li><li>通过调用接口 <a href="https://cloud.tencent.com/document/api/213/15715">DescribeImages</a> ，取返回信息中的<code>ImageId</code>字段。</li></p>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>启动配置所属项目ID。默认值为0，表示使用默认项目。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/651/78725">DescribeProject</a> 的返回值中的 projectId 字段来获取。注意：伸缩组内实例所属项目ID取伸缩组项目ID，与这里取值无关。</p> 
     * @return ProjectId <p>启动配置所属项目ID。默认值为0，表示使用默认项目。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/651/78725">DescribeProject</a> 的返回值中的 projectId 字段来获取。注意：伸缩组内实例所属项目ID取伸缩组项目ID，与这里取值无关。</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>启动配置所属项目ID。默认值为0，表示使用默认项目。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/651/78725">DescribeProject</a> 的返回值中的 projectId 字段来获取。注意：伸缩组内实例所属项目ID取伸缩组项目ID，与这里取值无关。</p>
     * @param ProjectId <p>启动配置所属项目ID。默认值为0，表示使用默认项目。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/651/78725">DescribeProject</a> 的返回值中的 projectId 字段来获取。注意：伸缩组内实例所属项目ID取伸缩组项目ID，与这里取值无关。</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>实例机型。不同实例机型指定了不同的资源规格，具体取值可通过调用接口 <a href="https://cloud.tencent.com/document/api/213/15749">DescribeInstanceTypeConfigs</a> 来获得最新的规格表或参见<a href="https://cloud.tencent.com/document/product/213/11518">实例类型</a>描述。<code>InstanceType</code>和<code>InstanceTypes</code>参数互斥，二者必填一个且只能填写一个。</p> 
     * @return InstanceType <p>实例机型。不同实例机型指定了不同的资源规格，具体取值可通过调用接口 <a href="https://cloud.tencent.com/document/api/213/15749">DescribeInstanceTypeConfigs</a> 来获得最新的规格表或参见<a href="https://cloud.tencent.com/document/product/213/11518">实例类型</a>描述。<code>InstanceType</code>和<code>InstanceTypes</code>参数互斥，二者必填一个且只能填写一个。</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>实例机型。不同实例机型指定了不同的资源规格，具体取值可通过调用接口 <a href="https://cloud.tencent.com/document/api/213/15749">DescribeInstanceTypeConfigs</a> 来获得最新的规格表或参见<a href="https://cloud.tencent.com/document/product/213/11518">实例类型</a>描述。<code>InstanceType</code>和<code>InstanceTypes</code>参数互斥，二者必填一个且只能填写一个。</p>
     * @param InstanceType <p>实例机型。不同实例机型指定了不同的资源规格，具体取值可通过调用接口 <a href="https://cloud.tencent.com/document/api/213/15749">DescribeInstanceTypeConfigs</a> 来获得最新的规格表或参见<a href="https://cloud.tencent.com/document/product/213/11518">实例类型</a>描述。<code>InstanceType</code>和<code>InstanceTypes</code>参数互斥，二者必填一个且只能填写一个。</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>实例系统盘配置信息。若不指定该参数，则按照系统默认值进行分配。</p> 
     * @return SystemDisk <p>实例系统盘配置信息。若不指定该参数，则按照系统默认值进行分配。</p>
     */
    public SystemDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set <p>实例系统盘配置信息。若不指定该参数，则按照系统默认值进行分配。</p>
     * @param SystemDisk <p>实例系统盘配置信息。若不指定该参数，则按照系统默认值进行分配。</p>
     */
    public void setSystemDisk(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get <p>实例数据盘配置信息。若不指定该参数，则默认不购买数据盘，最多支持指定11块数据盘。</p> 
     * @return DataDisks <p>实例数据盘配置信息。若不指定该参数，则默认不购买数据盘，最多支持指定11块数据盘。</p>
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set <p>实例数据盘配置信息。若不指定该参数，则默认不购买数据盘，最多支持指定11块数据盘。</p>
     * @param DataDisks <p>实例数据盘配置信息。若不指定该参数，则默认不购买数据盘，最多支持指定11块数据盘。</p>
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
     * Get <p>实例登录设置。通过该参数可以设置实例的登录方式密码、密钥或保持镜像的原始登录设置。默认情况下会随机生成密码，并以站内信方式知会到用户。</p> 
     * @return LoginSettings <p>实例登录设置。通过该参数可以设置实例的登录方式密码、密钥或保持镜像的原始登录设置。默认情况下会随机生成密码，并以站内信方式知会到用户。</p>
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set <p>实例登录设置。通过该参数可以设置实例的登录方式密码、密钥或保持镜像的原始登录设置。默认情况下会随机生成密码，并以站内信方式知会到用户。</p>
     * @param LoginSettings <p>实例登录设置。通过该参数可以设置实例的登录方式密码、密钥或保持镜像的原始登录设置。默认情况下会随机生成密码，并以站内信方式知会到用户。</p>
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * Get <p>实例所属安全组。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的<code>SecurityGroupId</code>字段来获取。若不指定该参数，则默认不绑定安全组。</p> 
     * @return SecurityGroupIds <p>实例所属安全组。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的<code>SecurityGroupId</code>字段来获取。若不指定该参数，则默认不绑定安全组。</p>
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>实例所属安全组。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的<code>SecurityGroupId</code>字段来获取。若不指定该参数，则默认不绑定安全组。</p>
     * @param SecurityGroupIds <p>实例所属安全组。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的<code>SecurityGroupId</code>字段来获取。若不指定该参数，则默认不绑定安全组。</p>
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
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
     * Get <p>经过 Base64 编码后的自定义数据，最大长度不超过16KB。</p> 
     * @return UserData <p>经过 Base64 编码后的自定义数据，最大长度不超过16KB。</p>
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Set <p>经过 Base64 编码后的自定义数据，最大长度不超过16KB。</p>
     * @param UserData <p>经过 Base64 编码后的自定义数据，最大长度不超过16KB。</p>
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    /**
     * Get <p>实例计费类型，CVM默认值按照POSTPAID_BY_HOUR处理。<li>POSTPAID_BY_HOUR：按小时后付费</li><li>SPOTPAID：竞价付费</li><li>PREPAID：预付费，即包年包月</li><li>CDCPAID：专用集群付费</li></p> 
     * @return InstanceChargeType <p>实例计费类型，CVM默认值按照POSTPAID_BY_HOUR处理。<li>POSTPAID_BY_HOUR：按小时后付费</li><li>SPOTPAID：竞价付费</li><li>PREPAID：预付费，即包年包月</li><li>CDCPAID：专用集群付费</li></p>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set <p>实例计费类型，CVM默认值按照POSTPAID_BY_HOUR处理。<li>POSTPAID_BY_HOUR：按小时后付费</li><li>SPOTPAID：竞价付费</li><li>PREPAID：预付费，即包年包月</li><li>CDCPAID：专用集群付费</li></p>
     * @param InstanceChargeType <p>实例计费类型，CVM默认值按照POSTPAID_BY_HOUR处理。<li>POSTPAID_BY_HOUR：按小时后付费</li><li>SPOTPAID：竞价付费</li><li>PREPAID：预付费，即包年包月</li><li>CDCPAID：专用集群付费</li></p>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get <p>实例的市场相关选项，如竞价实例相关参数，若指定实例的付费模式为竞价付费则该参数必传。</p> 
     * @return InstanceMarketOptions <p>实例的市场相关选项，如竞价实例相关参数，若指定实例的付费模式为竞价付费则该参数必传。</p>
     */
    public InstanceMarketOptionsRequest getInstanceMarketOptions() {
        return this.InstanceMarketOptions;
    }

    /**
     * Set <p>实例的市场相关选项，如竞价实例相关参数，若指定实例的付费模式为竞价付费则该参数必传。</p>
     * @param InstanceMarketOptions <p>实例的市场相关选项，如竞价实例相关参数，若指定实例的付费模式为竞价付费则该参数必传。</p>
     */
    public void setInstanceMarketOptions(InstanceMarketOptionsRequest InstanceMarketOptions) {
        this.InstanceMarketOptions = InstanceMarketOptions;
    }

    /**
     * Get <p>实例机型列表，不同实例机型指定了不同的资源规格，最多支持10种实例机型。<code>InstanceType</code>和<code>InstanceTypes</code>参数互斥，二者必填一个且只能填写一个。具体取值可通过调用接口<a href="https://cloud.tencent.com/document/api/213/15749">DescribeInstanceTypeConfigs</a>来获得最新的规格表或参见<a href="https://cloud.tencent.com/document/product/213/11518">实例规格描述</a>。</p> 
     * @return InstanceTypes <p>实例机型列表，不同实例机型指定了不同的资源规格，最多支持10种实例机型。<code>InstanceType</code>和<code>InstanceTypes</code>参数互斥，二者必填一个且只能填写一个。具体取值可通过调用接口<a href="https://cloud.tencent.com/document/api/213/15749">DescribeInstanceTypeConfigs</a>来获得最新的规格表或参见<a href="https://cloud.tencent.com/document/product/213/11518">实例规格描述</a>。</p>
     */
    public String [] getInstanceTypes() {
        return this.InstanceTypes;
    }

    /**
     * Set <p>实例机型列表，不同实例机型指定了不同的资源规格，最多支持10种实例机型。<code>InstanceType</code>和<code>InstanceTypes</code>参数互斥，二者必填一个且只能填写一个。具体取值可通过调用接口<a href="https://cloud.tencent.com/document/api/213/15749">DescribeInstanceTypeConfigs</a>来获得最新的规格表或参见<a href="https://cloud.tencent.com/document/product/213/11518">实例规格描述</a>。</p>
     * @param InstanceTypes <p>实例机型列表，不同实例机型指定了不同的资源规格，最多支持10种实例机型。<code>InstanceType</code>和<code>InstanceTypes</code>参数互斥，二者必填一个且只能填写一个。具体取值可通过调用接口<a href="https://cloud.tencent.com/document/api/213/15749">DescribeInstanceTypeConfigs</a>来获得最新的规格表或参见<a href="https://cloud.tencent.com/document/product/213/11518">实例规格描述</a>。</p>
     */
    public void setInstanceTypes(String [] InstanceTypes) {
        this.InstanceTypes = InstanceTypes;
    }

    /**
     * Get <p>CAM角色名称。可通过<a href="https://cloud.tencent.com/document/product/598/36223">DescribeRoleList</a>接口返回值中的roleName获取。</p> 
     * @return CamRoleName <p>CAM角色名称。可通过<a href="https://cloud.tencent.com/document/product/598/36223">DescribeRoleList</a>接口返回值中的roleName获取。</p>
     */
    public String getCamRoleName() {
        return this.CamRoleName;
    }

    /**
     * Set <p>CAM角色名称。可通过<a href="https://cloud.tencent.com/document/product/598/36223">DescribeRoleList</a>接口返回值中的roleName获取。</p>
     * @param CamRoleName <p>CAM角色名称。可通过<a href="https://cloud.tencent.com/document/product/598/36223">DescribeRoleList</a>接口返回值中的roleName获取。</p>
     */
    public void setCamRoleName(String CamRoleName) {
        this.CamRoleName = CamRoleName;
    }

    /**
     * Get <p>实例类型校验策略，取值包括 ALL 和 ANY，默认取值为ANY。该参数仅在 InstanceTypes 入参包含多个机型时生效。<li> ALL，所有实例类型（InstanceType）都可用则通过校验，否则校验报错。</li><li> ANY，存在任何一个实例类型（InstanceType）可用则通过校验，否则校验报错。</li></p><p>实例类型不可用的常见原因包括该实例类型售罄、对应云盘售罄等。如果 InstanceTypes 中一款机型不存在或者已下线，则无论 InstanceTypesCheckPolicy 采用何种取值，都会校验报错。</p> 
     * @return InstanceTypesCheckPolicy <p>实例类型校验策略，取值包括 ALL 和 ANY，默认取值为ANY。该参数仅在 InstanceTypes 入参包含多个机型时生效。<li> ALL，所有实例类型（InstanceType）都可用则通过校验，否则校验报错。</li><li> ANY，存在任何一个实例类型（InstanceType）可用则通过校验，否则校验报错。</li></p><p>实例类型不可用的常见原因包括该实例类型售罄、对应云盘售罄等。如果 InstanceTypes 中一款机型不存在或者已下线，则无论 InstanceTypesCheckPolicy 采用何种取值，都会校验报错。</p>
     */
    public String getInstanceTypesCheckPolicy() {
        return this.InstanceTypesCheckPolicy;
    }

    /**
     * Set <p>实例类型校验策略，取值包括 ALL 和 ANY，默认取值为ANY。该参数仅在 InstanceTypes 入参包含多个机型时生效。<li> ALL，所有实例类型（InstanceType）都可用则通过校验，否则校验报错。</li><li> ANY，存在任何一个实例类型（InstanceType）可用则通过校验，否则校验报错。</li></p><p>实例类型不可用的常见原因包括该实例类型售罄、对应云盘售罄等。如果 InstanceTypes 中一款机型不存在或者已下线，则无论 InstanceTypesCheckPolicy 采用何种取值，都会校验报错。</p>
     * @param InstanceTypesCheckPolicy <p>实例类型校验策略，取值包括 ALL 和 ANY，默认取值为ANY。该参数仅在 InstanceTypes 入参包含多个机型时生效。<li> ALL，所有实例类型（InstanceType）都可用则通过校验，否则校验报错。</li><li> ANY，存在任何一个实例类型（InstanceType）可用则通过校验，否则校验报错。</li></p><p>实例类型不可用的常见原因包括该实例类型售罄、对应云盘售罄等。如果 InstanceTypes 中一款机型不存在或者已下线，则无论 InstanceTypesCheckPolicy 采用何种取值，都会校验报错。</p>
     */
    public void setInstanceTypesCheckPolicy(String InstanceTypesCheckPolicy) {
        this.InstanceTypesCheckPolicy = InstanceTypesCheckPolicy;
    }

    /**
     * Get <p>标签列表。通过指定该参数，可以为扩容的实例绑定标签。最多支持指定10个标签。</p> 
     * @return InstanceTags <p>标签列表。通过指定该参数，可以为扩容的实例绑定标签。最多支持指定10个标签。</p>
     */
    public InstanceTag [] getInstanceTags() {
        return this.InstanceTags;
    }

    /**
     * Set <p>标签列表。通过指定该参数，可以为扩容的实例绑定标签。最多支持指定10个标签。</p>
     * @param InstanceTags <p>标签列表。通过指定该参数，可以为扩容的实例绑定标签。最多支持指定10个标签。</p>
     */
    public void setInstanceTags(InstanceTag [] InstanceTags) {
        this.InstanceTags = InstanceTags;
    }

    /**
     * Get <p>标签描述列表。通过指定该参数可以支持绑定标签到启动配置。每个启动配置最多支持30个标签。</p> 
     * @return Tags <p>标签描述列表。通过指定该参数可以支持绑定标签到启动配置。每个启动配置最多支持30个标签。</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签描述列表。通过指定该参数可以支持绑定标签到启动配置。每个启动配置最多支持30个标签。</p>
     * @param Tags <p>标签描述列表。通过指定该参数可以支持绑定标签到启动配置。每个启动配置最多支持30个标签。</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>云服务器主机名（HostName）的相关设置。不支持windows实例设置主机名。 新增该属性时，必须传递云服务器的主机名，其它未传递字段会设置为默认值。会校验主机名(如果存在后缀则加上后缀)是否超过最大位数46。</p> 
     * @return HostNameSettings <p>云服务器主机名（HostName）的相关设置。不支持windows实例设置主机名。 新增该属性时，必须传递云服务器的主机名，其它未传递字段会设置为默认值。会校验主机名(如果存在后缀则加上后缀)是否超过最大位数46。</p>
     */
    public HostNameSettings getHostNameSettings() {
        return this.HostNameSettings;
    }

    /**
     * Set <p>云服务器主机名（HostName）的相关设置。不支持windows实例设置主机名。 新增该属性时，必须传递云服务器的主机名，其它未传递字段会设置为默认值。会校验主机名(如果存在后缀则加上后缀)是否超过最大位数46。</p>
     * @param HostNameSettings <p>云服务器主机名（HostName）的相关设置。不支持windows实例设置主机名。 新增该属性时，必须传递云服务器的主机名，其它未传递字段会设置为默认值。会校验主机名(如果存在后缀则加上后缀)是否超过最大位数46。</p>
     */
    public void setHostNameSettings(HostNameSettings HostNameSettings) {
        this.HostNameSettings = HostNameSettings;
    }

    /**
     * Get <p>云服务器实例名（InstanceName）的相关设置。如果用户在启动配置中设置此字段，则伸缩组创建出的实例 InstanceName 参照此字段进行设置，并传递给 CVM；如果用户未在启动配置中设置此字段，则伸缩组创建出的实例 InstanceName 按照“as-{{ 伸缩组AutoScalingGroupName }}”进行设置，并传递给 CVM。新增该属性时，必须传递云服务器的实例名称，其它未传递字段会设置为默认值。会校验实例名称(如果存在后缀则加上后缀)是否超过最大位数108。</p> 
     * @return InstanceNameSettings <p>云服务器实例名（InstanceName）的相关设置。如果用户在启动配置中设置此字段，则伸缩组创建出的实例 InstanceName 参照此字段进行设置，并传递给 CVM；如果用户未在启动配置中设置此字段，则伸缩组创建出的实例 InstanceName 按照“as-{{ 伸缩组AutoScalingGroupName }}”进行设置，并传递给 CVM。新增该属性时，必须传递云服务器的实例名称，其它未传递字段会设置为默认值。会校验实例名称(如果存在后缀则加上后缀)是否超过最大位数108。</p>
     */
    public InstanceNameSettings getInstanceNameSettings() {
        return this.InstanceNameSettings;
    }

    /**
     * Set <p>云服务器实例名（InstanceName）的相关设置。如果用户在启动配置中设置此字段，则伸缩组创建出的实例 InstanceName 参照此字段进行设置，并传递给 CVM；如果用户未在启动配置中设置此字段，则伸缩组创建出的实例 InstanceName 按照“as-{{ 伸缩组AutoScalingGroupName }}”进行设置，并传递给 CVM。新增该属性时，必须传递云服务器的实例名称，其它未传递字段会设置为默认值。会校验实例名称(如果存在后缀则加上后缀)是否超过最大位数108。</p>
     * @param InstanceNameSettings <p>云服务器实例名（InstanceName）的相关设置。如果用户在启动配置中设置此字段，则伸缩组创建出的实例 InstanceName 参照此字段进行设置，并传递给 CVM；如果用户未在启动配置中设置此字段，则伸缩组创建出的实例 InstanceName 按照“as-{{ 伸缩组AutoScalingGroupName }}”进行设置，并传递给 CVM。新增该属性时，必须传递云服务器的实例名称，其它未传递字段会设置为默认值。会校验实例名称(如果存在后缀则加上后缀)是否超过最大位数108。</p>
     */
    public void setInstanceNameSettings(InstanceNameSettings InstanceNameSettings) {
        this.InstanceNameSettings = InstanceNameSettings;
    }

    /**
     * Get <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。</p> 
     * @return InstanceChargePrepaid <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。</p>
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。</p>
     * @param InstanceChargePrepaid <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。</p>
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get <p>云盘类型选择策略，默认取值 ORIGINAL，取值范围：<li>ORIGINAL：使用设置的云盘类型</li><li>AUTOMATIC：自动选择当前可用的云盘类型</li></p> 
     * @return DiskTypePolicy <p>云盘类型选择策略，默认取值 ORIGINAL，取值范围：<li>ORIGINAL：使用设置的云盘类型</li><li>AUTOMATIC：自动选择当前可用的云盘类型</li></p>
     */
    public String getDiskTypePolicy() {
        return this.DiskTypePolicy;
    }

    /**
     * Set <p>云盘类型选择策略，默认取值 ORIGINAL，取值范围：<li>ORIGINAL：使用设置的云盘类型</li><li>AUTOMATIC：自动选择当前可用的云盘类型</li></p>
     * @param DiskTypePolicy <p>云盘类型选择策略，默认取值 ORIGINAL，取值范围：<li>ORIGINAL：使用设置的云盘类型</li><li>AUTOMATIC：自动选择当前可用的云盘类型</li></p>
     */
    public void setDiskTypePolicy(String DiskTypePolicy) {
        this.DiskTypePolicy = DiskTypePolicy;
    }

    /**
     * Get <p>高性能计算集群ID。可通过调用<a href="https://cloud.tencent.com/document/product/213/83220">DescribeHpcClusters</a>接口获取该参数。注意：此字段默认为空。</p> 
     * @return HpcClusterId <p>高性能计算集群ID。可通过调用<a href="https://cloud.tencent.com/document/product/213/83220">DescribeHpcClusters</a>接口获取该参数。注意：此字段默认为空。</p>
     */
    public String getHpcClusterId() {
        return this.HpcClusterId;
    }

    /**
     * Set <p>高性能计算集群ID。可通过调用<a href="https://cloud.tencent.com/document/product/213/83220">DescribeHpcClusters</a>接口获取该参数。注意：此字段默认为空。</p>
     * @param HpcClusterId <p>高性能计算集群ID。可通过调用<a href="https://cloud.tencent.com/document/product/213/83220">DescribeHpcClusters</a>接口获取该参数。注意：此字段默认为空。</p>
     */
    public void setHpcClusterId(String HpcClusterId) {
        this.HpcClusterId = HpcClusterId;
    }

    /**
     * Get <p>IPv6公网带宽相关信息设置。若新建实例包含IPv6地址，该参数可为新建实例的IPv6地址分配公网带宽。关联启动配置的伸缩组Ipv6AddressCount参数为0时，该参数不会生效。</p> 
     * @return IPv6InternetAccessible <p>IPv6公网带宽相关信息设置。若新建实例包含IPv6地址，该参数可为新建实例的IPv6地址分配公网带宽。关联启动配置的伸缩组Ipv6AddressCount参数为0时，该参数不会生效。</p>
     */
    public IPv6InternetAccessible getIPv6InternetAccessible() {
        return this.IPv6InternetAccessible;
    }

    /**
     * Set <p>IPv6公网带宽相关信息设置。若新建实例包含IPv6地址，该参数可为新建实例的IPv6地址分配公网带宽。关联启动配置的伸缩组Ipv6AddressCount参数为0时，该参数不会生效。</p>
     * @param IPv6InternetAccessible <p>IPv6公网带宽相关信息设置。若新建实例包含IPv6地址，该参数可为新建实例的IPv6地址分配公网带宽。关联启动配置的伸缩组Ipv6AddressCount参数为0时，该参数不会生效。</p>
     */
    public void setIPv6InternetAccessible(IPv6InternetAccessible IPv6InternetAccessible) {
        this.IPv6InternetAccessible = IPv6InternetAccessible;
    }

    /**
     * Get <p>置放群组id，仅支持指定一个。</p> 
     * @return DisasterRecoverGroupIds <p>置放群组id，仅支持指定一个。</p>
     */
    public String [] getDisasterRecoverGroupIds() {
        return this.DisasterRecoverGroupIds;
    }

    /**
     * Set <p>置放群组id，仅支持指定一个。</p>
     * @param DisasterRecoverGroupIds <p>置放群组id，仅支持指定一个。</p>
     */
    public void setDisasterRecoverGroupIds(String [] DisasterRecoverGroupIds) {
        this.DisasterRecoverGroupIds = DisasterRecoverGroupIds;
    }

    /**
     * Get <p>镜像族名称。镜像Id与镜像族名称，二者必填一个且只能填写一个。可通过调用<a href="https://cloud.tencent.com/document/product/213/15715">DescribeImages</a>接口获取该参数。</p> 
     * @return ImageFamily <p>镜像族名称。镜像Id与镜像族名称，二者必填一个且只能填写一个。可通过调用<a href="https://cloud.tencent.com/document/product/213/15715">DescribeImages</a>接口获取该参数。</p>
     */
    public String getImageFamily() {
        return this.ImageFamily;
    }

    /**
     * Set <p>镜像族名称。镜像Id与镜像族名称，二者必填一个且只能填写一个。可通过调用<a href="https://cloud.tencent.com/document/product/213/15715">DescribeImages</a>接口获取该参数。</p>
     * @param ImageFamily <p>镜像族名称。镜像Id与镜像族名称，二者必填一个且只能填写一个。可通过调用<a href="https://cloud.tencent.com/document/product/213/15715">DescribeImages</a>接口获取该参数。</p>
     */
    public void setImageFamily(String ImageFamily) {
        this.ImageFamily = ImageFamily;
    }

    /**
     * Get <p>本地专用集群ID。可通过 <a href="https://cloud.tencent.com/document/product/1346/73758">DescribeDedicatedClusters</a> 接口获取该参数。</p> 
     * @return DedicatedClusterId <p>本地专用集群ID。可通过 <a href="https://cloud.tencent.com/document/product/1346/73758">DescribeDedicatedClusters</a> 接口获取该参数。</p>
     */
    public String getDedicatedClusterId() {
        return this.DedicatedClusterId;
    }

    /**
     * Set <p>本地专用集群ID。可通过 <a href="https://cloud.tencent.com/document/product/1346/73758">DescribeDedicatedClusters</a> 接口获取该参数。</p>
     * @param DedicatedClusterId <p>本地专用集群ID。可通过 <a href="https://cloud.tencent.com/document/product/1346/73758">DescribeDedicatedClusters</a> 接口获取该参数。</p>
     */
    public void setDedicatedClusterId(String DedicatedClusterId) {
        this.DedicatedClusterId = DedicatedClusterId;
    }

    /**
     * Get <p>自定义metadata。</p> 
     * @return Metadata <p>自定义metadata。</p>
     */
    public Metadata getMetadata() {
        return this.Metadata;
    }

    /**
     * Set <p>自定义metadata。</p>
     * @param Metadata <p>自定义metadata。</p>
     */
    public void setMetadata(Metadata Metadata) {
        this.Metadata = Metadata;
    }

    public CreateLaunchConfigurationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLaunchConfigurationRequest(CreateLaunchConfigurationRequest source) {
        if (source.LaunchConfigurationName != null) {
            this.LaunchConfigurationName = new String(source.LaunchConfigurationName);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.SystemDisk != null) {
            this.SystemDisk = new SystemDisk(source.SystemDisk);
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
        if (source.LoginSettings != null) {
            this.LoginSettings = new LoginSettings(source.LoginSettings);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.EnhancedService != null) {
            this.EnhancedService = new EnhancedService(source.EnhancedService);
        }
        if (source.UserData != null) {
            this.UserData = new String(source.UserData);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.InstanceMarketOptions != null) {
            this.InstanceMarketOptions = new InstanceMarketOptionsRequest(source.InstanceMarketOptions);
        }
        if (source.InstanceTypes != null) {
            this.InstanceTypes = new String[source.InstanceTypes.length];
            for (int i = 0; i < source.InstanceTypes.length; i++) {
                this.InstanceTypes[i] = new String(source.InstanceTypes[i]);
            }
        }
        if (source.CamRoleName != null) {
            this.CamRoleName = new String(source.CamRoleName);
        }
        if (source.InstanceTypesCheckPolicy != null) {
            this.InstanceTypesCheckPolicy = new String(source.InstanceTypesCheckPolicy);
        }
        if (source.InstanceTags != null) {
            this.InstanceTags = new InstanceTag[source.InstanceTags.length];
            for (int i = 0; i < source.InstanceTags.length; i++) {
                this.InstanceTags[i] = new InstanceTag(source.InstanceTags[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.HostNameSettings != null) {
            this.HostNameSettings = new HostNameSettings(source.HostNameSettings);
        }
        if (source.InstanceNameSettings != null) {
            this.InstanceNameSettings = new InstanceNameSettings(source.InstanceNameSettings);
        }
        if (source.InstanceChargePrepaid != null) {
            this.InstanceChargePrepaid = new InstanceChargePrepaid(source.InstanceChargePrepaid);
        }
        if (source.DiskTypePolicy != null) {
            this.DiskTypePolicy = new String(source.DiskTypePolicy);
        }
        if (source.HpcClusterId != null) {
            this.HpcClusterId = new String(source.HpcClusterId);
        }
        if (source.IPv6InternetAccessible != null) {
            this.IPv6InternetAccessible = new IPv6InternetAccessible(source.IPv6InternetAccessible);
        }
        if (source.DisasterRecoverGroupIds != null) {
            this.DisasterRecoverGroupIds = new String[source.DisasterRecoverGroupIds.length];
            for (int i = 0; i < source.DisasterRecoverGroupIds.length; i++) {
                this.DisasterRecoverGroupIds[i] = new String(source.DisasterRecoverGroupIds[i]);
            }
        }
        if (source.ImageFamily != null) {
            this.ImageFamily = new String(source.ImageFamily);
        }
        if (source.DedicatedClusterId != null) {
            this.DedicatedClusterId = new String(source.DedicatedClusterId);
        }
        if (source.Metadata != null) {
            this.Metadata = new Metadata(source.Metadata);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LaunchConfigurationName", this.LaunchConfigurationName);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamObj(map, prefix + "EnhancedService.", this.EnhancedService);
        this.setParamSimple(map, prefix + "UserData", this.UserData);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamObj(map, prefix + "InstanceMarketOptions.", this.InstanceMarketOptions);
        this.setParamArraySimple(map, prefix + "InstanceTypes.", this.InstanceTypes);
        this.setParamSimple(map, prefix + "CamRoleName", this.CamRoleName);
        this.setParamSimple(map, prefix + "InstanceTypesCheckPolicy", this.InstanceTypesCheckPolicy);
        this.setParamArrayObj(map, prefix + "InstanceTags.", this.InstanceTags);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "HostNameSettings.", this.HostNameSettings);
        this.setParamObj(map, prefix + "InstanceNameSettings.", this.InstanceNameSettings);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);
        this.setParamSimple(map, prefix + "DiskTypePolicy", this.DiskTypePolicy);
        this.setParamSimple(map, prefix + "HpcClusterId", this.HpcClusterId);
        this.setParamObj(map, prefix + "IPv6InternetAccessible.", this.IPv6InternetAccessible);
        this.setParamArraySimple(map, prefix + "DisasterRecoverGroupIds.", this.DisasterRecoverGroupIds);
        this.setParamSimple(map, prefix + "ImageFamily", this.ImageFamily);
        this.setParamSimple(map, prefix + "DedicatedClusterId", this.DedicatedClusterId);
        this.setParamObj(map, prefix + "Metadata.", this.Metadata);

    }
}

