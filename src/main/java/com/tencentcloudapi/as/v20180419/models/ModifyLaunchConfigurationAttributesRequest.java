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

public class ModifyLaunchConfigurationAttributesRequest extends AbstractModel {

    /**
    * <p>启动配置ID。可通过登录 <a href="https://console.cloud.tencent.com/autoscaling/config">控制台</a> 或调用接口 <a href="https://cloud.tencent.com/document/api/377/20445">DescribeLaunchConfigurations</a> ，取返回信息中的 LaunchConfigurationId 获取启动配置ID。</p>
    */
    @SerializedName("LaunchConfigurationId")
    @Expose
    private String LaunchConfigurationId;

    /**
    * <p>指定有效的<a href="https://cloud.tencent.com/document/product/213/4940">镜像</a>ID，格式形如<code>img-8toqc6s3</code>。镜像类型分为四种：<br><li>公共镜像</li><li>自定义镜像</li><li>共享镜像</li><li>服务市场镜像</li><br>可通过以下方式获取可用的镜像ID：<br><li><code>公共镜像</code>、<code>自定义镜像</code>、<code>共享镜像</code>的镜像ID可通过登录<a href="https://console.cloud.tencent.com/cvm/image?rid=1&amp;imageType=PUBLIC_IMAGE">控制台</a>查询；<code>服务镜像市场</code>的镜像ID可通过<a href="https://market.cloud.tencent.com/list">云市场</a>查询。</li><li>通过调用接口 <a href="https://cloud.tencent.com/document/api/213/15715">DescribeImages</a> ，取返回信息中的<code>ImageId</code>字段。</li></p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>实例类型列表，不同实例机型指定了不同的资源规格，最多支持10种实例机型。<br>InstanceType 指定单一实例类型，通过设置 InstanceTypes可以指定多实例类型，并使原有的InstanceType失效。具体取值可通过调用接口<a href="https://cloud.tencent.com/document/api/213/15749">DescribeInstanceTypeConfigs</a>来获得最新的规格表或参见<a href="https://cloud.tencent.com/document/product/213/11518">实例规格描述</a>。</p>
    */
    @SerializedName("InstanceTypes")
    @Expose
    private String [] InstanceTypes;

    /**
    * <p>实例类型校验策略，在实际修改 InstanceTypes 时发挥作用，取值包括 ALL 和 ANY，默认取值为ANY。</p><li> ALL，所有实例类型（InstanceType）都可用则通过校验，否则校验报错。</li> <li> ANY，存在任何一个实例类型（InstanceType）可用则通过校验，否则校验报错。</li> 实例类型不可用的常见原因包括该实例类型售罄、对应云盘售罄等。如果 InstanceTypes 中一款机型不存在或者已下线，则无论 InstanceTypesCheckPolicy 采用何种取值，都会校验报错。
    */
    @SerializedName("InstanceTypesCheckPolicy")
    @Expose
    private String InstanceTypesCheckPolicy;

    /**
    * <p>启动配置显示名称。名称仅支持中文、英文、数字、下划线、分隔符&quot;-&quot;、小数点，最大长度不能超60个字节。</p>
    */
    @SerializedName("LaunchConfigurationName")
    @Expose
    private String LaunchConfigurationName;

    /**
    * <p>经过 Base64 编码后的自定义数据，最大长度不超过16KB。如果要清空UserData，则指定其为空字符串。</p>
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
    * <p>实例所属安全组。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的<code>SecurityGroupId</code>字段来获取。<br>若指定该参数，请至少提供一个安全组，列表顺序有先后。</p>
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * <p>公网带宽相关信息设置。<br>当公网出带宽上限为0Mbps时，不支持修改为开通分配公网IP；相应的，当前为开通分配公网IP时，修改的公网出带宽上限值必须大于0Mbps。</p>
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * <p>实例计费类型。具体取值范围如下：</p><li>POSTPAID_BY_HOUR：按小时后付费</li><li>SPOTPAID：竞价付费</li><li>PREPAID：预付费，即包年包月</li><li>CDCPAID：专用集群付费</li>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。<br>若修改实例的付费模式为预付费，则该参数必传；从预付费修改为其他付费模式时，本字段原信息会自动丢弃。<br>当新增该字段时，必须传递购买实例的时长，其它未传递字段会设置为默认值。<br>当修改本字段时，当前付费模式必须为预付费。</p>
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * <p>实例的市场相关选项，如竞价实例相关参数。<br>若修改实例的付费模式为竞价付费，则该参数必传；从竞价付费修改为其他付费模式时，本字段原信息会自动丢弃。<br>当新增该字段时，必须传递竞价相关选项下的竞价出价，其它未传递字段会设置为默认值。<br>当修改本字段时，当前付费模式必须为竞价付费。</p>
    */
    @SerializedName("InstanceMarketOptions")
    @Expose
    private InstanceMarketOptionsRequest InstanceMarketOptions;

    /**
    * <p>云盘类型选择策略，取值范围：</p><li>ORIGINAL：使用设置的云盘类型。</li><li>AUTOMATIC：自动选择当前可用的云盘类型。</li>
    */
    @SerializedName("DiskTypePolicy")
    @Expose
    private String DiskTypePolicy;

    /**
    * <p>实例系统盘配置信息。</p>
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk SystemDisk;

    /**
    * <p>实例数据盘配置信息。<br>最多支持指定11块数据盘。采取整体修改，因此请提供修改后的全部值。<br>数据盘类型默认与系统盘类型保持一致。</p>
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

    /**
    * <p>云服务器主机名（HostName）的相关设置。<br>不支持windows实例设置主机名。<br>新增该属性时，必须传递云服务器的主机名，其它未传递字段会设置为默认值。<br>会校验主机名(如果存在后缀则加上后缀)是否超过最大位数46。</p>
    */
    @SerializedName("HostNameSettings")
    @Expose
    private HostNameSettings HostNameSettings;

    /**
    * <p>云服务器（InstanceName）实例名的相关设置。<br>如果用户在启动配置中设置此字段，则伸缩组创建出的实例 InstanceName 参照此字段进行设置，并传递给 CVM；如果用户未在启动配置中设置此字段，则伸缩组创建出的实例 InstanceName 按照“as-{{ 伸缩组AutoScalingGroupName }}”进行设置，并传递给 CVM。<br>新增该属性时，必须传递云服务器的实例名称，其它未传递字段会设置为默认值。<br>会校验实例名(如果存在后缀则加上后缀)是否超过最大位数108。</p>
    */
    @SerializedName("InstanceNameSettings")
    @Expose
    private InstanceNameSettings InstanceNameSettings;

    /**
    * <p>增强服务。通过该参数可以指定是否开启云安全、云监控等服务。</p>
    */
    @SerializedName("EnhancedService")
    @Expose
    private EnhancedService EnhancedService;

    /**
    * <p>CAM角色名称。可通过<a href="https://cloud.tencent.com/document/product/598/36223">DescribeRoleList</a>接口返回值中的roleName获取。</p>
    */
    @SerializedName("CamRoleName")
    @Expose
    private String CamRoleName;

    /**
    * <p>高性能计算集群ID。可通过调用<a href="https://cloud.tencent.com/document/product/213/83220">DescribeHpcClusters</a>接口获取该参数。<br>注意：此字段默认为空。</p>
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
    * <p>置放群组id，仅支持指定一个。可通过调用<a href="https://cloud.tencent.com/document/product/213/17810">DescribeDisasterRecoverGroups</a>接口获取该参数。</p>
    */
    @SerializedName("DisasterRecoverGroupIds")
    @Expose
    private String [] DisasterRecoverGroupIds;

    /**
    * <p>实例登录设置，包括密码、密钥或保持镜像的原始登录设置。<br>请注意，指定新的登录设置会覆盖原有登录设置。例如，如果您之前使用密码登录，使用该参数将登录设置修改为密钥，则原有密码被清除。</p>
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSettings LoginSettings;

    /**
    * <p>实例标签列表。通过指定该参数，可以为扩容的实例绑定标签。最多支持指定10个标签。<br>该参数会覆盖原有的实例标签列表，如需新增标签，需将新标签和原有标签一并传入。</p>
    */
    @SerializedName("InstanceTags")
    @Expose
    private InstanceTag [] InstanceTags;

    /**
    * <p>镜像族名称。可通过调用<a href="https://cloud.tencent.com/document/product/213/15715">DescribeImages</a>接口获取该参数。</p>
    */
    @SerializedName("ImageFamily")
    @Expose
    private String ImageFamily;

    /**
    * <p>本地专用集群ID。</p>
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
    * <p>替换启动配置中的弹性网卡配置。</p><p>入参限制：最多 17 项；必须显式包含且只能包含一个 PRIMARY，AS 不自动补齐主网卡；显式空数组非法。</p><p>字段规则与 CreateLaunchConfiguration 一致。清除请调用 ClearLaunchConfigurationAttributes 并传 ClearNetworkInterfaces=true。</p>
    */
    @SerializedName("NetworkInterfaces")
    @Expose
    private NetworkInterface [] NetworkInterfaces;

    /**
     * Get <p>启动配置ID。可通过登录 <a href="https://console.cloud.tencent.com/autoscaling/config">控制台</a> 或调用接口 <a href="https://cloud.tencent.com/document/api/377/20445">DescribeLaunchConfigurations</a> ，取返回信息中的 LaunchConfigurationId 获取启动配置ID。</p> 
     * @return LaunchConfigurationId <p>启动配置ID。可通过登录 <a href="https://console.cloud.tencent.com/autoscaling/config">控制台</a> 或调用接口 <a href="https://cloud.tencent.com/document/api/377/20445">DescribeLaunchConfigurations</a> ，取返回信息中的 LaunchConfigurationId 获取启动配置ID。</p>
     */
    public String getLaunchConfigurationId() {
        return this.LaunchConfigurationId;
    }

    /**
     * Set <p>启动配置ID。可通过登录 <a href="https://console.cloud.tencent.com/autoscaling/config">控制台</a> 或调用接口 <a href="https://cloud.tencent.com/document/api/377/20445">DescribeLaunchConfigurations</a> ，取返回信息中的 LaunchConfigurationId 获取启动配置ID。</p>
     * @param LaunchConfigurationId <p>启动配置ID。可通过登录 <a href="https://console.cloud.tencent.com/autoscaling/config">控制台</a> 或调用接口 <a href="https://cloud.tencent.com/document/api/377/20445">DescribeLaunchConfigurations</a> ，取返回信息中的 LaunchConfigurationId 获取启动配置ID。</p>
     */
    public void setLaunchConfigurationId(String LaunchConfigurationId) {
        this.LaunchConfigurationId = LaunchConfigurationId;
    }

    /**
     * Get <p>指定有效的<a href="https://cloud.tencent.com/document/product/213/4940">镜像</a>ID，格式形如<code>img-8toqc6s3</code>。镜像类型分为四种：<br><li>公共镜像</li><li>自定义镜像</li><li>共享镜像</li><li>服务市场镜像</li><br>可通过以下方式获取可用的镜像ID：<br><li><code>公共镜像</code>、<code>自定义镜像</code>、<code>共享镜像</code>的镜像ID可通过登录<a href="https://console.cloud.tencent.com/cvm/image?rid=1&amp;imageType=PUBLIC_IMAGE">控制台</a>查询；<code>服务镜像市场</code>的镜像ID可通过<a href="https://market.cloud.tencent.com/list">云市场</a>查询。</li><li>通过调用接口 <a href="https://cloud.tencent.com/document/api/213/15715">DescribeImages</a> ，取返回信息中的<code>ImageId</code>字段。</li></p> 
     * @return ImageId <p>指定有效的<a href="https://cloud.tencent.com/document/product/213/4940">镜像</a>ID，格式形如<code>img-8toqc6s3</code>。镜像类型分为四种：<br><li>公共镜像</li><li>自定义镜像</li><li>共享镜像</li><li>服务市场镜像</li><br>可通过以下方式获取可用的镜像ID：<br><li><code>公共镜像</code>、<code>自定义镜像</code>、<code>共享镜像</code>的镜像ID可通过登录<a href="https://console.cloud.tencent.com/cvm/image?rid=1&amp;imageType=PUBLIC_IMAGE">控制台</a>查询；<code>服务镜像市场</code>的镜像ID可通过<a href="https://market.cloud.tencent.com/list">云市场</a>查询。</li><li>通过调用接口 <a href="https://cloud.tencent.com/document/api/213/15715">DescribeImages</a> ，取返回信息中的<code>ImageId</code>字段。</li></p>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>指定有效的<a href="https://cloud.tencent.com/document/product/213/4940">镜像</a>ID，格式形如<code>img-8toqc6s3</code>。镜像类型分为四种：<br><li>公共镜像</li><li>自定义镜像</li><li>共享镜像</li><li>服务市场镜像</li><br>可通过以下方式获取可用的镜像ID：<br><li><code>公共镜像</code>、<code>自定义镜像</code>、<code>共享镜像</code>的镜像ID可通过登录<a href="https://console.cloud.tencent.com/cvm/image?rid=1&amp;imageType=PUBLIC_IMAGE">控制台</a>查询；<code>服务镜像市场</code>的镜像ID可通过<a href="https://market.cloud.tencent.com/list">云市场</a>查询。</li><li>通过调用接口 <a href="https://cloud.tencent.com/document/api/213/15715">DescribeImages</a> ，取返回信息中的<code>ImageId</code>字段。</li></p>
     * @param ImageId <p>指定有效的<a href="https://cloud.tencent.com/document/product/213/4940">镜像</a>ID，格式形如<code>img-8toqc6s3</code>。镜像类型分为四种：<br><li>公共镜像</li><li>自定义镜像</li><li>共享镜像</li><li>服务市场镜像</li><br>可通过以下方式获取可用的镜像ID：<br><li><code>公共镜像</code>、<code>自定义镜像</code>、<code>共享镜像</code>的镜像ID可通过登录<a href="https://console.cloud.tencent.com/cvm/image?rid=1&amp;imageType=PUBLIC_IMAGE">控制台</a>查询；<code>服务镜像市场</code>的镜像ID可通过<a href="https://market.cloud.tencent.com/list">云市场</a>查询。</li><li>通过调用接口 <a href="https://cloud.tencent.com/document/api/213/15715">DescribeImages</a> ，取返回信息中的<code>ImageId</code>字段。</li></p>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>实例类型列表，不同实例机型指定了不同的资源规格，最多支持10种实例机型。<br>InstanceType 指定单一实例类型，通过设置 InstanceTypes可以指定多实例类型，并使原有的InstanceType失效。具体取值可通过调用接口<a href="https://cloud.tencent.com/document/api/213/15749">DescribeInstanceTypeConfigs</a>来获得最新的规格表或参见<a href="https://cloud.tencent.com/document/product/213/11518">实例规格描述</a>。</p> 
     * @return InstanceTypes <p>实例类型列表，不同实例机型指定了不同的资源规格，最多支持10种实例机型。<br>InstanceType 指定单一实例类型，通过设置 InstanceTypes可以指定多实例类型，并使原有的InstanceType失效。具体取值可通过调用接口<a href="https://cloud.tencent.com/document/api/213/15749">DescribeInstanceTypeConfigs</a>来获得最新的规格表或参见<a href="https://cloud.tencent.com/document/product/213/11518">实例规格描述</a>。</p>
     */
    public String [] getInstanceTypes() {
        return this.InstanceTypes;
    }

    /**
     * Set <p>实例类型列表，不同实例机型指定了不同的资源规格，最多支持10种实例机型。<br>InstanceType 指定单一实例类型，通过设置 InstanceTypes可以指定多实例类型，并使原有的InstanceType失效。具体取值可通过调用接口<a href="https://cloud.tencent.com/document/api/213/15749">DescribeInstanceTypeConfigs</a>来获得最新的规格表或参见<a href="https://cloud.tencent.com/document/product/213/11518">实例规格描述</a>。</p>
     * @param InstanceTypes <p>实例类型列表，不同实例机型指定了不同的资源规格，最多支持10种实例机型。<br>InstanceType 指定单一实例类型，通过设置 InstanceTypes可以指定多实例类型，并使原有的InstanceType失效。具体取值可通过调用接口<a href="https://cloud.tencent.com/document/api/213/15749">DescribeInstanceTypeConfigs</a>来获得最新的规格表或参见<a href="https://cloud.tencent.com/document/product/213/11518">实例规格描述</a>。</p>
     */
    public void setInstanceTypes(String [] InstanceTypes) {
        this.InstanceTypes = InstanceTypes;
    }

    /**
     * Get <p>实例类型校验策略，在实际修改 InstanceTypes 时发挥作用，取值包括 ALL 和 ANY，默认取值为ANY。</p><li> ALL，所有实例类型（InstanceType）都可用则通过校验，否则校验报错。</li> <li> ANY，存在任何一个实例类型（InstanceType）可用则通过校验，否则校验报错。</li> 实例类型不可用的常见原因包括该实例类型售罄、对应云盘售罄等。如果 InstanceTypes 中一款机型不存在或者已下线，则无论 InstanceTypesCheckPolicy 采用何种取值，都会校验报错。 
     * @return InstanceTypesCheckPolicy <p>实例类型校验策略，在实际修改 InstanceTypes 时发挥作用，取值包括 ALL 和 ANY，默认取值为ANY。</p><li> ALL，所有实例类型（InstanceType）都可用则通过校验，否则校验报错。</li> <li> ANY，存在任何一个实例类型（InstanceType）可用则通过校验，否则校验报错。</li> 实例类型不可用的常见原因包括该实例类型售罄、对应云盘售罄等。如果 InstanceTypes 中一款机型不存在或者已下线，则无论 InstanceTypesCheckPolicy 采用何种取值，都会校验报错。
     */
    public String getInstanceTypesCheckPolicy() {
        return this.InstanceTypesCheckPolicy;
    }

    /**
     * Set <p>实例类型校验策略，在实际修改 InstanceTypes 时发挥作用，取值包括 ALL 和 ANY，默认取值为ANY。</p><li> ALL，所有实例类型（InstanceType）都可用则通过校验，否则校验报错。</li> <li> ANY，存在任何一个实例类型（InstanceType）可用则通过校验，否则校验报错。</li> 实例类型不可用的常见原因包括该实例类型售罄、对应云盘售罄等。如果 InstanceTypes 中一款机型不存在或者已下线，则无论 InstanceTypesCheckPolicy 采用何种取值，都会校验报错。
     * @param InstanceTypesCheckPolicy <p>实例类型校验策略，在实际修改 InstanceTypes 时发挥作用，取值包括 ALL 和 ANY，默认取值为ANY。</p><li> ALL，所有实例类型（InstanceType）都可用则通过校验，否则校验报错。</li> <li> ANY，存在任何一个实例类型（InstanceType）可用则通过校验，否则校验报错。</li> 实例类型不可用的常见原因包括该实例类型售罄、对应云盘售罄等。如果 InstanceTypes 中一款机型不存在或者已下线，则无论 InstanceTypesCheckPolicy 采用何种取值，都会校验报错。
     */
    public void setInstanceTypesCheckPolicy(String InstanceTypesCheckPolicy) {
        this.InstanceTypesCheckPolicy = InstanceTypesCheckPolicy;
    }

    /**
     * Get <p>启动配置显示名称。名称仅支持中文、英文、数字、下划线、分隔符&quot;-&quot;、小数点，最大长度不能超60个字节。</p> 
     * @return LaunchConfigurationName <p>启动配置显示名称。名称仅支持中文、英文、数字、下划线、分隔符&quot;-&quot;、小数点，最大长度不能超60个字节。</p>
     */
    public String getLaunchConfigurationName() {
        return this.LaunchConfigurationName;
    }

    /**
     * Set <p>启动配置显示名称。名称仅支持中文、英文、数字、下划线、分隔符&quot;-&quot;、小数点，最大长度不能超60个字节。</p>
     * @param LaunchConfigurationName <p>启动配置显示名称。名称仅支持中文、英文、数字、下划线、分隔符&quot;-&quot;、小数点，最大长度不能超60个字节。</p>
     */
    public void setLaunchConfigurationName(String LaunchConfigurationName) {
        this.LaunchConfigurationName = LaunchConfigurationName;
    }

    /**
     * Get <p>经过 Base64 编码后的自定义数据，最大长度不超过16KB。如果要清空UserData，则指定其为空字符串。</p> 
     * @return UserData <p>经过 Base64 编码后的自定义数据，最大长度不超过16KB。如果要清空UserData，则指定其为空字符串。</p>
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Set <p>经过 Base64 编码后的自定义数据，最大长度不超过16KB。如果要清空UserData，则指定其为空字符串。</p>
     * @param UserData <p>经过 Base64 编码后的自定义数据，最大长度不超过16KB。如果要清空UserData，则指定其为空字符串。</p>
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    /**
     * Get <p>实例所属安全组。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的<code>SecurityGroupId</code>字段来获取。<br>若指定该参数，请至少提供一个安全组，列表顺序有先后。</p> 
     * @return SecurityGroupIds <p>实例所属安全组。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的<code>SecurityGroupId</code>字段来获取。<br>若指定该参数，请至少提供一个安全组，列表顺序有先后。</p>
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>实例所属安全组。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的<code>SecurityGroupId</code>字段来获取。<br>若指定该参数，请至少提供一个安全组，列表顺序有先后。</p>
     * @param SecurityGroupIds <p>实例所属安全组。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的<code>SecurityGroupId</code>字段来获取。<br>若指定该参数，请至少提供一个安全组，列表顺序有先后。</p>
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get <p>公网带宽相关信息设置。<br>当公网出带宽上限为0Mbps时，不支持修改为开通分配公网IP；相应的，当前为开通分配公网IP时，修改的公网出带宽上限值必须大于0Mbps。</p> 
     * @return InternetAccessible <p>公网带宽相关信息设置。<br>当公网出带宽上限为0Mbps时，不支持修改为开通分配公网IP；相应的，当前为开通分配公网IP时，修改的公网出带宽上限值必须大于0Mbps。</p>
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set <p>公网带宽相关信息设置。<br>当公网出带宽上限为0Mbps时，不支持修改为开通分配公网IP；相应的，当前为开通分配公网IP时，修改的公网出带宽上限值必须大于0Mbps。</p>
     * @param InternetAccessible <p>公网带宽相关信息设置。<br>当公网出带宽上限为0Mbps时，不支持修改为开通分配公网IP；相应的，当前为开通分配公网IP时，修改的公网出带宽上限值必须大于0Mbps。</p>
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Get <p>实例计费类型。具体取值范围如下：</p><li>POSTPAID_BY_HOUR：按小时后付费</li><li>SPOTPAID：竞价付费</li><li>PREPAID：预付费，即包年包月</li><li>CDCPAID：专用集群付费</li> 
     * @return InstanceChargeType <p>实例计费类型。具体取值范围如下：</p><li>POSTPAID_BY_HOUR：按小时后付费</li><li>SPOTPAID：竞价付费</li><li>PREPAID：预付费，即包年包月</li><li>CDCPAID：专用集群付费</li>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set <p>实例计费类型。具体取值范围如下：</p><li>POSTPAID_BY_HOUR：按小时后付费</li><li>SPOTPAID：竞价付费</li><li>PREPAID：预付费，即包年包月</li><li>CDCPAID：专用集群付费</li>
     * @param InstanceChargeType <p>实例计费类型。具体取值范围如下：</p><li>POSTPAID_BY_HOUR：按小时后付费</li><li>SPOTPAID：竞价付费</li><li>PREPAID：预付费，即包年包月</li><li>CDCPAID：专用集群付费</li>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。<br>若修改实例的付费模式为预付费，则该参数必传；从预付费修改为其他付费模式时，本字段原信息会自动丢弃。<br>当新增该字段时，必须传递购买实例的时长，其它未传递字段会设置为默认值。<br>当修改本字段时，当前付费模式必须为预付费。</p> 
     * @return InstanceChargePrepaid <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。<br>若修改实例的付费模式为预付费，则该参数必传；从预付费修改为其他付费模式时，本字段原信息会自动丢弃。<br>当新增该字段时，必须传递购买实例的时长，其它未传递字段会设置为默认值。<br>当修改本字段时，当前付费模式必须为预付费。</p>
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。<br>若修改实例的付费模式为预付费，则该参数必传；从预付费修改为其他付费模式时，本字段原信息会自动丢弃。<br>当新增该字段时，必须传递购买实例的时长，其它未传递字段会设置为默认值。<br>当修改本字段时，当前付费模式必须为预付费。</p>
     * @param InstanceChargePrepaid <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。<br>若修改实例的付费模式为预付费，则该参数必传；从预付费修改为其他付费模式时，本字段原信息会自动丢弃。<br>当新增该字段时，必须传递购买实例的时长，其它未传递字段会设置为默认值。<br>当修改本字段时，当前付费模式必须为预付费。</p>
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get <p>实例的市场相关选项，如竞价实例相关参数。<br>若修改实例的付费模式为竞价付费，则该参数必传；从竞价付费修改为其他付费模式时，本字段原信息会自动丢弃。<br>当新增该字段时，必须传递竞价相关选项下的竞价出价，其它未传递字段会设置为默认值。<br>当修改本字段时，当前付费模式必须为竞价付费。</p> 
     * @return InstanceMarketOptions <p>实例的市场相关选项，如竞价实例相关参数。<br>若修改实例的付费模式为竞价付费，则该参数必传；从竞价付费修改为其他付费模式时，本字段原信息会自动丢弃。<br>当新增该字段时，必须传递竞价相关选项下的竞价出价，其它未传递字段会设置为默认值。<br>当修改本字段时，当前付费模式必须为竞价付费。</p>
     */
    public InstanceMarketOptionsRequest getInstanceMarketOptions() {
        return this.InstanceMarketOptions;
    }

    /**
     * Set <p>实例的市场相关选项，如竞价实例相关参数。<br>若修改实例的付费模式为竞价付费，则该参数必传；从竞价付费修改为其他付费模式时，本字段原信息会自动丢弃。<br>当新增该字段时，必须传递竞价相关选项下的竞价出价，其它未传递字段会设置为默认值。<br>当修改本字段时，当前付费模式必须为竞价付费。</p>
     * @param InstanceMarketOptions <p>实例的市场相关选项，如竞价实例相关参数。<br>若修改实例的付费模式为竞价付费，则该参数必传；从竞价付费修改为其他付费模式时，本字段原信息会自动丢弃。<br>当新增该字段时，必须传递竞价相关选项下的竞价出价，其它未传递字段会设置为默认值。<br>当修改本字段时，当前付费模式必须为竞价付费。</p>
     */
    public void setInstanceMarketOptions(InstanceMarketOptionsRequest InstanceMarketOptions) {
        this.InstanceMarketOptions = InstanceMarketOptions;
    }

    /**
     * Get <p>云盘类型选择策略，取值范围：</p><li>ORIGINAL：使用设置的云盘类型。</li><li>AUTOMATIC：自动选择当前可用的云盘类型。</li> 
     * @return DiskTypePolicy <p>云盘类型选择策略，取值范围：</p><li>ORIGINAL：使用设置的云盘类型。</li><li>AUTOMATIC：自动选择当前可用的云盘类型。</li>
     */
    public String getDiskTypePolicy() {
        return this.DiskTypePolicy;
    }

    /**
     * Set <p>云盘类型选择策略，取值范围：</p><li>ORIGINAL：使用设置的云盘类型。</li><li>AUTOMATIC：自动选择当前可用的云盘类型。</li>
     * @param DiskTypePolicy <p>云盘类型选择策略，取值范围：</p><li>ORIGINAL：使用设置的云盘类型。</li><li>AUTOMATIC：自动选择当前可用的云盘类型。</li>
     */
    public void setDiskTypePolicy(String DiskTypePolicy) {
        this.DiskTypePolicy = DiskTypePolicy;
    }

    /**
     * Get <p>实例系统盘配置信息。</p> 
     * @return SystemDisk <p>实例系统盘配置信息。</p>
     */
    public SystemDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set <p>实例系统盘配置信息。</p>
     * @param SystemDisk <p>实例系统盘配置信息。</p>
     */
    public void setSystemDisk(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get <p>实例数据盘配置信息。<br>最多支持指定11块数据盘。采取整体修改，因此请提供修改后的全部值。<br>数据盘类型默认与系统盘类型保持一致。</p> 
     * @return DataDisks <p>实例数据盘配置信息。<br>最多支持指定11块数据盘。采取整体修改，因此请提供修改后的全部值。<br>数据盘类型默认与系统盘类型保持一致。</p>
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set <p>实例数据盘配置信息。<br>最多支持指定11块数据盘。采取整体修改，因此请提供修改后的全部值。<br>数据盘类型默认与系统盘类型保持一致。</p>
     * @param DataDisks <p>实例数据盘配置信息。<br>最多支持指定11块数据盘。采取整体修改，因此请提供修改后的全部值。<br>数据盘类型默认与系统盘类型保持一致。</p>
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * Get <p>云服务器主机名（HostName）的相关设置。<br>不支持windows实例设置主机名。<br>新增该属性时，必须传递云服务器的主机名，其它未传递字段会设置为默认值。<br>会校验主机名(如果存在后缀则加上后缀)是否超过最大位数46。</p> 
     * @return HostNameSettings <p>云服务器主机名（HostName）的相关设置。<br>不支持windows实例设置主机名。<br>新增该属性时，必须传递云服务器的主机名，其它未传递字段会设置为默认值。<br>会校验主机名(如果存在后缀则加上后缀)是否超过最大位数46。</p>
     */
    public HostNameSettings getHostNameSettings() {
        return this.HostNameSettings;
    }

    /**
     * Set <p>云服务器主机名（HostName）的相关设置。<br>不支持windows实例设置主机名。<br>新增该属性时，必须传递云服务器的主机名，其它未传递字段会设置为默认值。<br>会校验主机名(如果存在后缀则加上后缀)是否超过最大位数46。</p>
     * @param HostNameSettings <p>云服务器主机名（HostName）的相关设置。<br>不支持windows实例设置主机名。<br>新增该属性时，必须传递云服务器的主机名，其它未传递字段会设置为默认值。<br>会校验主机名(如果存在后缀则加上后缀)是否超过最大位数46。</p>
     */
    public void setHostNameSettings(HostNameSettings HostNameSettings) {
        this.HostNameSettings = HostNameSettings;
    }

    /**
     * Get <p>云服务器（InstanceName）实例名的相关设置。<br>如果用户在启动配置中设置此字段，则伸缩组创建出的实例 InstanceName 参照此字段进行设置，并传递给 CVM；如果用户未在启动配置中设置此字段，则伸缩组创建出的实例 InstanceName 按照“as-{{ 伸缩组AutoScalingGroupName }}”进行设置，并传递给 CVM。<br>新增该属性时，必须传递云服务器的实例名称，其它未传递字段会设置为默认值。<br>会校验实例名(如果存在后缀则加上后缀)是否超过最大位数108。</p> 
     * @return InstanceNameSettings <p>云服务器（InstanceName）实例名的相关设置。<br>如果用户在启动配置中设置此字段，则伸缩组创建出的实例 InstanceName 参照此字段进行设置，并传递给 CVM；如果用户未在启动配置中设置此字段，则伸缩组创建出的实例 InstanceName 按照“as-{{ 伸缩组AutoScalingGroupName }}”进行设置，并传递给 CVM。<br>新增该属性时，必须传递云服务器的实例名称，其它未传递字段会设置为默认值。<br>会校验实例名(如果存在后缀则加上后缀)是否超过最大位数108。</p>
     */
    public InstanceNameSettings getInstanceNameSettings() {
        return this.InstanceNameSettings;
    }

    /**
     * Set <p>云服务器（InstanceName）实例名的相关设置。<br>如果用户在启动配置中设置此字段，则伸缩组创建出的实例 InstanceName 参照此字段进行设置，并传递给 CVM；如果用户未在启动配置中设置此字段，则伸缩组创建出的实例 InstanceName 按照“as-{{ 伸缩组AutoScalingGroupName }}”进行设置，并传递给 CVM。<br>新增该属性时，必须传递云服务器的实例名称，其它未传递字段会设置为默认值。<br>会校验实例名(如果存在后缀则加上后缀)是否超过最大位数108。</p>
     * @param InstanceNameSettings <p>云服务器（InstanceName）实例名的相关设置。<br>如果用户在启动配置中设置此字段，则伸缩组创建出的实例 InstanceName 参照此字段进行设置，并传递给 CVM；如果用户未在启动配置中设置此字段，则伸缩组创建出的实例 InstanceName 按照“as-{{ 伸缩组AutoScalingGroupName }}”进行设置，并传递给 CVM。<br>新增该属性时，必须传递云服务器的实例名称，其它未传递字段会设置为默认值。<br>会校验实例名(如果存在后缀则加上后缀)是否超过最大位数108。</p>
     */
    public void setInstanceNameSettings(InstanceNameSettings InstanceNameSettings) {
        this.InstanceNameSettings = InstanceNameSettings;
    }

    /**
     * Get <p>增强服务。通过该参数可以指定是否开启云安全、云监控等服务。</p> 
     * @return EnhancedService <p>增强服务。通过该参数可以指定是否开启云安全、云监控等服务。</p>
     */
    public EnhancedService getEnhancedService() {
        return this.EnhancedService;
    }

    /**
     * Set <p>增强服务。通过该参数可以指定是否开启云安全、云监控等服务。</p>
     * @param EnhancedService <p>增强服务。通过该参数可以指定是否开启云安全、云监控等服务。</p>
     */
    public void setEnhancedService(EnhancedService EnhancedService) {
        this.EnhancedService = EnhancedService;
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
     * Get <p>高性能计算集群ID。可通过调用<a href="https://cloud.tencent.com/document/product/213/83220">DescribeHpcClusters</a>接口获取该参数。<br>注意：此字段默认为空。</p> 
     * @return HpcClusterId <p>高性能计算集群ID。可通过调用<a href="https://cloud.tencent.com/document/product/213/83220">DescribeHpcClusters</a>接口获取该参数。<br>注意：此字段默认为空。</p>
     */
    public String getHpcClusterId() {
        return this.HpcClusterId;
    }

    /**
     * Set <p>高性能计算集群ID。可通过调用<a href="https://cloud.tencent.com/document/product/213/83220">DescribeHpcClusters</a>接口获取该参数。<br>注意：此字段默认为空。</p>
     * @param HpcClusterId <p>高性能计算集群ID。可通过调用<a href="https://cloud.tencent.com/document/product/213/83220">DescribeHpcClusters</a>接口获取该参数。<br>注意：此字段默认为空。</p>
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
     * Get <p>置放群组id，仅支持指定一个。可通过调用<a href="https://cloud.tencent.com/document/product/213/17810">DescribeDisasterRecoverGroups</a>接口获取该参数。</p> 
     * @return DisasterRecoverGroupIds <p>置放群组id，仅支持指定一个。可通过调用<a href="https://cloud.tencent.com/document/product/213/17810">DescribeDisasterRecoverGroups</a>接口获取该参数。</p>
     */
    public String [] getDisasterRecoverGroupIds() {
        return this.DisasterRecoverGroupIds;
    }

    /**
     * Set <p>置放群组id，仅支持指定一个。可通过调用<a href="https://cloud.tencent.com/document/product/213/17810">DescribeDisasterRecoverGroups</a>接口获取该参数。</p>
     * @param DisasterRecoverGroupIds <p>置放群组id，仅支持指定一个。可通过调用<a href="https://cloud.tencent.com/document/product/213/17810">DescribeDisasterRecoverGroups</a>接口获取该参数。</p>
     */
    public void setDisasterRecoverGroupIds(String [] DisasterRecoverGroupIds) {
        this.DisasterRecoverGroupIds = DisasterRecoverGroupIds;
    }

    /**
     * Get <p>实例登录设置，包括密码、密钥或保持镜像的原始登录设置。<br>请注意，指定新的登录设置会覆盖原有登录设置。例如，如果您之前使用密码登录，使用该参数将登录设置修改为密钥，则原有密码被清除。</p> 
     * @return LoginSettings <p>实例登录设置，包括密码、密钥或保持镜像的原始登录设置。<br>请注意，指定新的登录设置会覆盖原有登录设置。例如，如果您之前使用密码登录，使用该参数将登录设置修改为密钥，则原有密码被清除。</p>
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set <p>实例登录设置，包括密码、密钥或保持镜像的原始登录设置。<br>请注意，指定新的登录设置会覆盖原有登录设置。例如，如果您之前使用密码登录，使用该参数将登录设置修改为密钥，则原有密码被清除。</p>
     * @param LoginSettings <p>实例登录设置，包括密码、密钥或保持镜像的原始登录设置。<br>请注意，指定新的登录设置会覆盖原有登录设置。例如，如果您之前使用密码登录，使用该参数将登录设置修改为密钥，则原有密码被清除。</p>
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * Get <p>实例标签列表。通过指定该参数，可以为扩容的实例绑定标签。最多支持指定10个标签。<br>该参数会覆盖原有的实例标签列表，如需新增标签，需将新标签和原有标签一并传入。</p> 
     * @return InstanceTags <p>实例标签列表。通过指定该参数，可以为扩容的实例绑定标签。最多支持指定10个标签。<br>该参数会覆盖原有的实例标签列表，如需新增标签，需将新标签和原有标签一并传入。</p>
     */
    public InstanceTag [] getInstanceTags() {
        return this.InstanceTags;
    }

    /**
     * Set <p>实例标签列表。通过指定该参数，可以为扩容的实例绑定标签。最多支持指定10个标签。<br>该参数会覆盖原有的实例标签列表，如需新增标签，需将新标签和原有标签一并传入。</p>
     * @param InstanceTags <p>实例标签列表。通过指定该参数，可以为扩容的实例绑定标签。最多支持指定10个标签。<br>该参数会覆盖原有的实例标签列表，如需新增标签，需将新标签和原有标签一并传入。</p>
     */
    public void setInstanceTags(InstanceTag [] InstanceTags) {
        this.InstanceTags = InstanceTags;
    }

    /**
     * Get <p>镜像族名称。可通过调用<a href="https://cloud.tencent.com/document/product/213/15715">DescribeImages</a>接口获取该参数。</p> 
     * @return ImageFamily <p>镜像族名称。可通过调用<a href="https://cloud.tencent.com/document/product/213/15715">DescribeImages</a>接口获取该参数。</p>
     */
    public String getImageFamily() {
        return this.ImageFamily;
    }

    /**
     * Set <p>镜像族名称。可通过调用<a href="https://cloud.tencent.com/document/product/213/15715">DescribeImages</a>接口获取该参数。</p>
     * @param ImageFamily <p>镜像族名称。可通过调用<a href="https://cloud.tencent.com/document/product/213/15715">DescribeImages</a>接口获取该参数。</p>
     */
    public void setImageFamily(String ImageFamily) {
        this.ImageFamily = ImageFamily;
    }

    /**
     * Get <p>本地专用集群ID。</p> 
     * @return DedicatedClusterId <p>本地专用集群ID。</p>
     */
    public String getDedicatedClusterId() {
        return this.DedicatedClusterId;
    }

    /**
     * Set <p>本地专用集群ID。</p>
     * @param DedicatedClusterId <p>本地专用集群ID。</p>
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

    /**
     * Get <p>替换启动配置中的弹性网卡配置。</p><p>入参限制：最多 17 项；必须显式包含且只能包含一个 PRIMARY，AS 不自动补齐主网卡；显式空数组非法。</p><p>字段规则与 CreateLaunchConfiguration 一致。清除请调用 ClearLaunchConfigurationAttributes 并传 ClearNetworkInterfaces=true。</p> 
     * @return NetworkInterfaces <p>替换启动配置中的弹性网卡配置。</p><p>入参限制：最多 17 项；必须显式包含且只能包含一个 PRIMARY，AS 不自动补齐主网卡；显式空数组非法。</p><p>字段规则与 CreateLaunchConfiguration 一致。清除请调用 ClearLaunchConfigurationAttributes 并传 ClearNetworkInterfaces=true。</p>
     */
    public NetworkInterface [] getNetworkInterfaces() {
        return this.NetworkInterfaces;
    }

    /**
     * Set <p>替换启动配置中的弹性网卡配置。</p><p>入参限制：最多 17 项；必须显式包含且只能包含一个 PRIMARY，AS 不自动补齐主网卡；显式空数组非法。</p><p>字段规则与 CreateLaunchConfiguration 一致。清除请调用 ClearLaunchConfigurationAttributes 并传 ClearNetworkInterfaces=true。</p>
     * @param NetworkInterfaces <p>替换启动配置中的弹性网卡配置。</p><p>入参限制：最多 17 项；必须显式包含且只能包含一个 PRIMARY，AS 不自动补齐主网卡；显式空数组非法。</p><p>字段规则与 CreateLaunchConfiguration 一致。清除请调用 ClearLaunchConfigurationAttributes 并传 ClearNetworkInterfaces=true。</p>
     */
    public void setNetworkInterfaces(NetworkInterface [] NetworkInterfaces) {
        this.NetworkInterfaces = NetworkInterfaces;
    }

    public ModifyLaunchConfigurationAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLaunchConfigurationAttributesRequest(ModifyLaunchConfigurationAttributesRequest source) {
        if (source.LaunchConfigurationId != null) {
            this.LaunchConfigurationId = new String(source.LaunchConfigurationId);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.InstanceTypes != null) {
            this.InstanceTypes = new String[source.InstanceTypes.length];
            for (int i = 0; i < source.InstanceTypes.length; i++) {
                this.InstanceTypes[i] = new String(source.InstanceTypes[i]);
            }
        }
        if (source.InstanceTypesCheckPolicy != null) {
            this.InstanceTypesCheckPolicy = new String(source.InstanceTypesCheckPolicy);
        }
        if (source.LaunchConfigurationName != null) {
            this.LaunchConfigurationName = new String(source.LaunchConfigurationName);
        }
        if (source.UserData != null) {
            this.UserData = new String(source.UserData);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.InternetAccessible != null) {
            this.InternetAccessible = new InternetAccessible(source.InternetAccessible);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.InstanceChargePrepaid != null) {
            this.InstanceChargePrepaid = new InstanceChargePrepaid(source.InstanceChargePrepaid);
        }
        if (source.InstanceMarketOptions != null) {
            this.InstanceMarketOptions = new InstanceMarketOptionsRequest(source.InstanceMarketOptions);
        }
        if (source.DiskTypePolicy != null) {
            this.DiskTypePolicy = new String(source.DiskTypePolicy);
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
        if (source.HostNameSettings != null) {
            this.HostNameSettings = new HostNameSettings(source.HostNameSettings);
        }
        if (source.InstanceNameSettings != null) {
            this.InstanceNameSettings = new InstanceNameSettings(source.InstanceNameSettings);
        }
        if (source.EnhancedService != null) {
            this.EnhancedService = new EnhancedService(source.EnhancedService);
        }
        if (source.CamRoleName != null) {
            this.CamRoleName = new String(source.CamRoleName);
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
        if (source.LoginSettings != null) {
            this.LoginSettings = new LoginSettings(source.LoginSettings);
        }
        if (source.InstanceTags != null) {
            this.InstanceTags = new InstanceTag[source.InstanceTags.length];
            for (int i = 0; i < source.InstanceTags.length; i++) {
                this.InstanceTags[i] = new InstanceTag(source.InstanceTags[i]);
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
        if (source.NetworkInterfaces != null) {
            this.NetworkInterfaces = new NetworkInterface[source.NetworkInterfaces.length];
            for (int i = 0; i < source.NetworkInterfaces.length; i++) {
                this.NetworkInterfaces[i] = new NetworkInterface(source.NetworkInterfaces[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LaunchConfigurationId", this.LaunchConfigurationId);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamArraySimple(map, prefix + "InstanceTypes.", this.InstanceTypes);
        this.setParamSimple(map, prefix + "InstanceTypesCheckPolicy", this.InstanceTypesCheckPolicy);
        this.setParamSimple(map, prefix + "LaunchConfigurationName", this.LaunchConfigurationName);
        this.setParamSimple(map, prefix + "UserData", this.UserData);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);
        this.setParamObj(map, prefix + "InstanceMarketOptions.", this.InstanceMarketOptions);
        this.setParamSimple(map, prefix + "DiskTypePolicy", this.DiskTypePolicy);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);
        this.setParamObj(map, prefix + "HostNameSettings.", this.HostNameSettings);
        this.setParamObj(map, prefix + "InstanceNameSettings.", this.InstanceNameSettings);
        this.setParamObj(map, prefix + "EnhancedService.", this.EnhancedService);
        this.setParamSimple(map, prefix + "CamRoleName", this.CamRoleName);
        this.setParamSimple(map, prefix + "HpcClusterId", this.HpcClusterId);
        this.setParamObj(map, prefix + "IPv6InternetAccessible.", this.IPv6InternetAccessible);
        this.setParamArraySimple(map, prefix + "DisasterRecoverGroupIds.", this.DisasterRecoverGroupIds);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamArrayObj(map, prefix + "InstanceTags.", this.InstanceTags);
        this.setParamSimple(map, prefix + "ImageFamily", this.ImageFamily);
        this.setParamSimple(map, prefix + "DedicatedClusterId", this.DedicatedClusterId);
        this.setParamObj(map, prefix + "Metadata.", this.Metadata);
        this.setParamArrayObj(map, prefix + "NetworkInterfaces.", this.NetworkInterfaces);

    }
}

