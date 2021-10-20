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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunInstancesRequest extends AbstractModel{

    /**
    * 需要创建实例的可用区及创建数目及运营商的列表。在单次请求的过程中，单个region下的请求创建实例数上限为100
    */
    @SerializedName("ZoneInstanceCountISPSet")
    @Expose
    private ZoneInstanceCountISP [] ZoneInstanceCountISPSet;

    /**
    * 实例登录密码。不同操作系统类型密码复杂度限制不一样，具体如下：
Linux实例密码必须8到30位，至少包括两项[a-z]，[A-Z]、[0-9] 和 [( ) ` ~ ! @ # $ % ^ & - + = | { } [ ] : ; ' , . ? / ]中的特殊符。Windows实例密码必须12到30位，至少包括三项[a-z]，[A-Z]，[0-9] 和 [( ) ` ~ ! @ # $ % ^ & - + = | { } [ ] : ; ' , . ? /]中的特殊符号。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 公网出带宽上限，单位：Mbps。
1.如果未传该参数或者传的值为0，则使用模块下的默认值。
2.如果未传该参数或者传的值为0且未指定模块，则使用InternetMaxBandwidthIn的值
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * 模块ID。如果未传该参数，则必须传ImageId，InstanceType，DataDiskSize，InternetMaxBandwidthOut参数
    */
    @SerializedName("ModuleId")
    @Expose
    private String ModuleId;

    /**
    * 镜像ID。如果未传该参数或者传的值为空，则使用模块下的默认值
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 实例显示名称。
不指定实例显示名称则默认显示‘未命名’。
购买多台实例，如果指定模式串{R:x}，表示生成数字[x, x+n-1]，其中n表示购买实例的数量，例如server\_{R:3}，购买1台时，实例显示名称为server\_3；购买2台时，实例显示名称分别为server\_3，server\_4。
支持指定多个模式串{R:x}。
购买多台实例，如果不指定模式串，则在实例显示名称添加后缀1、2...n，其中n表示购买实例的数量，例如server_，购买2台时，实例显示名称分别为server\_1，server\_2。
如果购买的实例属于不同的地域或运营商，则上述规则在每个地域和运营商内独立计数。
最多支持60个字符（包含模式串）。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 主机名称
点号（.）和短横线（-）不能作为 HostName 的首尾字符，不能连续使用。
Windows 实例：名字符长度为[2, 15]，允许字母（不限制大小写）、数字和短横线（-）组成，不支持点号（.），不能全是数字。
其他类型（Linux 等）实例：字符长度为[2, 60]，允许支持多个点号，点之间为一段，每段允许字母（不限制大小写）、数字和短横线（-）组成。
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 用于保证请求幂等性的字符串。目前为保留参数，请勿使用。
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * 增强服务。通过该参数可以指定是否开启云安全、云监控等服务。若不指定该参数，则默认公共镜像开启云监控、云安全服务
    */
    @SerializedName("EnhancedService")
    @Expose
    private EnhancedService EnhancedService;

    /**
    * 标签列表
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification [] TagSpecification;

    /**
    * 提供给实例使用的用户数据，需要以 base64 方式编码，支持的最大数据大小为 16KB
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
    * 机型。如果未传该参数或者传的值为空，则使用模块下的默认值
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 数据盘大小，单位是G。如果未传该参数或者传的值为0，则使用模块下的默认值
    */
    @SerializedName("DataDiskSize")
    @Expose
    private Long DataDiskSize;

    /**
    * 实例所属安全组。该参数可以通过调用 DescribeSecurityGroups 的返回值中的sgId字段来获取。若不指定该参数，则绑定默认安全组。
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * 系统盘大小，单位是G。如果未传该参数或者传的值为0，则使用模块下的默认值
    */
    @SerializedName("SystemDiskSize")
    @Expose
    private Long SystemDiskSize;

    /**
    * 公网入带宽上限，单位：Mbps。
1.如果未传该参数或者传的值为0，则使用对应模块的默认值。
2.如果未传该参数或者传的值为0且未指定模块，则使用InternetMaxBandwidthOut
    */
    @SerializedName("InternetMaxBandwidthIn")
    @Expose
    private Long InternetMaxBandwidthIn;

    /**
    * 实例计费类型。其中：
0，按资源维度后付费，计算当日用量峰值，例如CPU，内存，硬盘等，仅适用于非GNR系列机型；
1，按小时后付费，单价：xx元/实例/小时，仅适用于GNR机型，如需开通该计费方式请提工单申请；
2，按月后付费，单价：xx元/实例/月，仅适用于GNR机型；
该字段不填时，非GNR机型会默认选择0；GNR机型默认选择2。
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private Long InstanceChargeType;

    /**
    * 密钥对。
    */
    @SerializedName("KeyIds")
    @Expose
    private String [] KeyIds;

    /**
    * 保持镜像的原始设置。该参数与Password或KeyIds.N不能同时指定。只有使用自定义镜像、共享镜像或外部导入镜像创建实例时才能指定该参数为TRUE。取值范围：
TRUE：表示保持镜像的登录设置
FALSE：表示不保持镜像的登录设置

默认取值：FALSE。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeepImageLogin")
    @Expose
    private String KeepImageLogin;

    /**
    * 系统盘信息。
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk SystemDisk;

    /**
    * 数据盘信息。
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

    /**
     * Get 需要创建实例的可用区及创建数目及运营商的列表。在单次请求的过程中，单个region下的请求创建实例数上限为100 
     * @return ZoneInstanceCountISPSet 需要创建实例的可用区及创建数目及运营商的列表。在单次请求的过程中，单个region下的请求创建实例数上限为100
     */
    public ZoneInstanceCountISP [] getZoneInstanceCountISPSet() {
        return this.ZoneInstanceCountISPSet;
    }

    /**
     * Set 需要创建实例的可用区及创建数目及运营商的列表。在单次请求的过程中，单个region下的请求创建实例数上限为100
     * @param ZoneInstanceCountISPSet 需要创建实例的可用区及创建数目及运营商的列表。在单次请求的过程中，单个region下的请求创建实例数上限为100
     */
    public void setZoneInstanceCountISPSet(ZoneInstanceCountISP [] ZoneInstanceCountISPSet) {
        this.ZoneInstanceCountISPSet = ZoneInstanceCountISPSet;
    }

    /**
     * Get 实例登录密码。不同操作系统类型密码复杂度限制不一样，具体如下：
Linux实例密码必须8到30位，至少包括两项[a-z]，[A-Z]、[0-9] 和 [( ) ` ~ ! @ # $ % ^ & - + = | { } [ ] : ; ' , . ? / ]中的特殊符。Windows实例密码必须12到30位，至少包括三项[a-z]，[A-Z]，[0-9] 和 [( ) ` ~ ! @ # $ % ^ & - + = | { } [ ] : ; ' , . ? /]中的特殊符号。 
     * @return Password 实例登录密码。不同操作系统类型密码复杂度限制不一样，具体如下：
Linux实例密码必须8到30位，至少包括两项[a-z]，[A-Z]、[0-9] 和 [( ) ` ~ ! @ # $ % ^ & - + = | { } [ ] : ; ' , . ? / ]中的特殊符。Windows实例密码必须12到30位，至少包括三项[a-z]，[A-Z]，[0-9] 和 [( ) ` ~ ! @ # $ % ^ & - + = | { } [ ] : ; ' , . ? /]中的特殊符号。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 实例登录密码。不同操作系统类型密码复杂度限制不一样，具体如下：
Linux实例密码必须8到30位，至少包括两项[a-z]，[A-Z]、[0-9] 和 [( ) ` ~ ! @ # $ % ^ & - + = | { } [ ] : ; ' , . ? / ]中的特殊符。Windows实例密码必须12到30位，至少包括三项[a-z]，[A-Z]，[0-9] 和 [( ) ` ~ ! @ # $ % ^ & - + = | { } [ ] : ; ' , . ? /]中的特殊符号。
     * @param Password 实例登录密码。不同操作系统类型密码复杂度限制不一样，具体如下：
Linux实例密码必须8到30位，至少包括两项[a-z]，[A-Z]、[0-9] 和 [( ) ` ~ ! @ # $ % ^ & - + = | { } [ ] : ; ' , . ? / ]中的特殊符。Windows实例密码必须12到30位，至少包括三项[a-z]，[A-Z]，[0-9] 和 [( ) ` ~ ! @ # $ % ^ & - + = | { } [ ] : ; ' , . ? /]中的特殊符号。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 公网出带宽上限，单位：Mbps。
1.如果未传该参数或者传的值为0，则使用模块下的默认值。
2.如果未传该参数或者传的值为0且未指定模块，则使用InternetMaxBandwidthIn的值 
     * @return InternetMaxBandwidthOut 公网出带宽上限，单位：Mbps。
1.如果未传该参数或者传的值为0，则使用模块下的默认值。
2.如果未传该参数或者传的值为0且未指定模块，则使用InternetMaxBandwidthIn的值
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set 公网出带宽上限，单位：Mbps。
1.如果未传该参数或者传的值为0，则使用模块下的默认值。
2.如果未传该参数或者传的值为0且未指定模块，则使用InternetMaxBandwidthIn的值
     * @param InternetMaxBandwidthOut 公网出带宽上限，单位：Mbps。
1.如果未传该参数或者传的值为0，则使用模块下的默认值。
2.如果未传该参数或者传的值为0且未指定模块，则使用InternetMaxBandwidthIn的值
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get 模块ID。如果未传该参数，则必须传ImageId，InstanceType，DataDiskSize，InternetMaxBandwidthOut参数 
     * @return ModuleId 模块ID。如果未传该参数，则必须传ImageId，InstanceType，DataDiskSize，InternetMaxBandwidthOut参数
     */
    public String getModuleId() {
        return this.ModuleId;
    }

    /**
     * Set 模块ID。如果未传该参数，则必须传ImageId，InstanceType，DataDiskSize，InternetMaxBandwidthOut参数
     * @param ModuleId 模块ID。如果未传该参数，则必须传ImageId，InstanceType，DataDiskSize，InternetMaxBandwidthOut参数
     */
    public void setModuleId(String ModuleId) {
        this.ModuleId = ModuleId;
    }

    /**
     * Get 镜像ID。如果未传该参数或者传的值为空，则使用模块下的默认值 
     * @return ImageId 镜像ID。如果未传该参数或者传的值为空，则使用模块下的默认值
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 镜像ID。如果未传该参数或者传的值为空，则使用模块下的默认值
     * @param ImageId 镜像ID。如果未传该参数或者传的值为空，则使用模块下的默认值
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 实例显示名称。
不指定实例显示名称则默认显示‘未命名’。
购买多台实例，如果指定模式串{R:x}，表示生成数字[x, x+n-1]，其中n表示购买实例的数量，例如server\_{R:3}，购买1台时，实例显示名称为server\_3；购买2台时，实例显示名称分别为server\_3，server\_4。
支持指定多个模式串{R:x}。
购买多台实例，如果不指定模式串，则在实例显示名称添加后缀1、2...n，其中n表示购买实例的数量，例如server_，购买2台时，实例显示名称分别为server\_1，server\_2。
如果购买的实例属于不同的地域或运营商，则上述规则在每个地域和运营商内独立计数。
最多支持60个字符（包含模式串）。 
     * @return InstanceName 实例显示名称。
不指定实例显示名称则默认显示‘未命名’。
购买多台实例，如果指定模式串{R:x}，表示生成数字[x, x+n-1]，其中n表示购买实例的数量，例如server\_{R:3}，购买1台时，实例显示名称为server\_3；购买2台时，实例显示名称分别为server\_3，server\_4。
支持指定多个模式串{R:x}。
购买多台实例，如果不指定模式串，则在实例显示名称添加后缀1、2...n，其中n表示购买实例的数量，例如server_，购买2台时，实例显示名称分别为server\_1，server\_2。
如果购买的实例属于不同的地域或运营商，则上述规则在每个地域和运营商内独立计数。
最多支持60个字符（包含模式串）。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例显示名称。
不指定实例显示名称则默认显示‘未命名’。
购买多台实例，如果指定模式串{R:x}，表示生成数字[x, x+n-1]，其中n表示购买实例的数量，例如server\_{R:3}，购买1台时，实例显示名称为server\_3；购买2台时，实例显示名称分别为server\_3，server\_4。
支持指定多个模式串{R:x}。
购买多台实例，如果不指定模式串，则在实例显示名称添加后缀1、2...n，其中n表示购买实例的数量，例如server_，购买2台时，实例显示名称分别为server\_1，server\_2。
如果购买的实例属于不同的地域或运营商，则上述规则在每个地域和运营商内独立计数。
最多支持60个字符（包含模式串）。
     * @param InstanceName 实例显示名称。
不指定实例显示名称则默认显示‘未命名’。
购买多台实例，如果指定模式串{R:x}，表示生成数字[x, x+n-1]，其中n表示购买实例的数量，例如server\_{R:3}，购买1台时，实例显示名称为server\_3；购买2台时，实例显示名称分别为server\_3，server\_4。
支持指定多个模式串{R:x}。
购买多台实例，如果不指定模式串，则在实例显示名称添加后缀1、2...n，其中n表示购买实例的数量，例如server_，购买2台时，实例显示名称分别为server\_1，server\_2。
如果购买的实例属于不同的地域或运营商，则上述规则在每个地域和运营商内独立计数。
最多支持60个字符（包含模式串）。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 主机名称
点号（.）和短横线（-）不能作为 HostName 的首尾字符，不能连续使用。
Windows 实例：名字符长度为[2, 15]，允许字母（不限制大小写）、数字和短横线（-）组成，不支持点号（.），不能全是数字。
其他类型（Linux 等）实例：字符长度为[2, 60]，允许支持多个点号，点之间为一段，每段允许字母（不限制大小写）、数字和短横线（-）组成。 
     * @return HostName 主机名称
点号（.）和短横线（-）不能作为 HostName 的首尾字符，不能连续使用。
Windows 实例：名字符长度为[2, 15]，允许字母（不限制大小写）、数字和短横线（-）组成，不支持点号（.），不能全是数字。
其他类型（Linux 等）实例：字符长度为[2, 60]，允许支持多个点号，点之间为一段，每段允许字母（不限制大小写）、数字和短横线（-）组成。
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set 主机名称
点号（.）和短横线（-）不能作为 HostName 的首尾字符，不能连续使用。
Windows 实例：名字符长度为[2, 15]，允许字母（不限制大小写）、数字和短横线（-）组成，不支持点号（.），不能全是数字。
其他类型（Linux 等）实例：字符长度为[2, 60]，允许支持多个点号，点之间为一段，每段允许字母（不限制大小写）、数字和短横线（-）组成。
     * @param HostName 主机名称
点号（.）和短横线（-）不能作为 HostName 的首尾字符，不能连续使用。
Windows 实例：名字符长度为[2, 15]，允许字母（不限制大小写）、数字和短横线（-）组成，不支持点号（.），不能全是数字。
其他类型（Linux 等）实例：字符长度为[2, 60]，允许支持多个点号，点之间为一段，每段允许字母（不限制大小写）、数字和短横线（-）组成。
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get 用于保证请求幂等性的字符串。目前为保留参数，请勿使用。 
     * @return ClientToken 用于保证请求幂等性的字符串。目前为保留参数，请勿使用。
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 用于保证请求幂等性的字符串。目前为保留参数，请勿使用。
     * @param ClientToken 用于保证请求幂等性的字符串。目前为保留参数，请勿使用。
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get 增强服务。通过该参数可以指定是否开启云安全、云监控等服务。若不指定该参数，则默认公共镜像开启云监控、云安全服务 
     * @return EnhancedService 增强服务。通过该参数可以指定是否开启云安全、云监控等服务。若不指定该参数，则默认公共镜像开启云监控、云安全服务
     */
    public EnhancedService getEnhancedService() {
        return this.EnhancedService;
    }

    /**
     * Set 增强服务。通过该参数可以指定是否开启云安全、云监控等服务。若不指定该参数，则默认公共镜像开启云监控、云安全服务
     * @param EnhancedService 增强服务。通过该参数可以指定是否开启云安全、云监控等服务。若不指定该参数，则默认公共镜像开启云监控、云安全服务
     */
    public void setEnhancedService(EnhancedService EnhancedService) {
        this.EnhancedService = EnhancedService;
    }

    /**
     * Get 标签列表 
     * @return TagSpecification 标签列表
     */
    public TagSpecification [] getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set 标签列表
     * @param TagSpecification 标签列表
     */
    public void setTagSpecification(TagSpecification [] TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    /**
     * Get 提供给实例使用的用户数据，需要以 base64 方式编码，支持的最大数据大小为 16KB 
     * @return UserData 提供给实例使用的用户数据，需要以 base64 方式编码，支持的最大数据大小为 16KB
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Set 提供给实例使用的用户数据，需要以 base64 方式编码，支持的最大数据大小为 16KB
     * @param UserData 提供给实例使用的用户数据，需要以 base64 方式编码，支持的最大数据大小为 16KB
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    /**
     * Get 机型。如果未传该参数或者传的值为空，则使用模块下的默认值 
     * @return InstanceType 机型。如果未传该参数或者传的值为空，则使用模块下的默认值
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 机型。如果未传该参数或者传的值为空，则使用模块下的默认值
     * @param InstanceType 机型。如果未传该参数或者传的值为空，则使用模块下的默认值
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 数据盘大小，单位是G。如果未传该参数或者传的值为0，则使用模块下的默认值 
     * @return DataDiskSize 数据盘大小，单位是G。如果未传该参数或者传的值为0，则使用模块下的默认值
     */
    public Long getDataDiskSize() {
        return this.DataDiskSize;
    }

    /**
     * Set 数据盘大小，单位是G。如果未传该参数或者传的值为0，则使用模块下的默认值
     * @param DataDiskSize 数据盘大小，单位是G。如果未传该参数或者传的值为0，则使用模块下的默认值
     */
    public void setDataDiskSize(Long DataDiskSize) {
        this.DataDiskSize = DataDiskSize;
    }

    /**
     * Get 实例所属安全组。该参数可以通过调用 DescribeSecurityGroups 的返回值中的sgId字段来获取。若不指定该参数，则绑定默认安全组。 
     * @return SecurityGroupIds 实例所属安全组。该参数可以通过调用 DescribeSecurityGroups 的返回值中的sgId字段来获取。若不指定该参数，则绑定默认安全组。
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 实例所属安全组。该参数可以通过调用 DescribeSecurityGroups 的返回值中的sgId字段来获取。若不指定该参数，则绑定默认安全组。
     * @param SecurityGroupIds 实例所属安全组。该参数可以通过调用 DescribeSecurityGroups 的返回值中的sgId字段来获取。若不指定该参数，则绑定默认安全组。
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get 系统盘大小，单位是G。如果未传该参数或者传的值为0，则使用模块下的默认值 
     * @return SystemDiskSize 系统盘大小，单位是G。如果未传该参数或者传的值为0，则使用模块下的默认值
     */
    public Long getSystemDiskSize() {
        return this.SystemDiskSize;
    }

    /**
     * Set 系统盘大小，单位是G。如果未传该参数或者传的值为0，则使用模块下的默认值
     * @param SystemDiskSize 系统盘大小，单位是G。如果未传该参数或者传的值为0，则使用模块下的默认值
     */
    public void setSystemDiskSize(Long SystemDiskSize) {
        this.SystemDiskSize = SystemDiskSize;
    }

    /**
     * Get 公网入带宽上限，单位：Mbps。
1.如果未传该参数或者传的值为0，则使用对应模块的默认值。
2.如果未传该参数或者传的值为0且未指定模块，则使用InternetMaxBandwidthOut 
     * @return InternetMaxBandwidthIn 公网入带宽上限，单位：Mbps。
1.如果未传该参数或者传的值为0，则使用对应模块的默认值。
2.如果未传该参数或者传的值为0且未指定模块，则使用InternetMaxBandwidthOut
     */
    public Long getInternetMaxBandwidthIn() {
        return this.InternetMaxBandwidthIn;
    }

    /**
     * Set 公网入带宽上限，单位：Mbps。
1.如果未传该参数或者传的值为0，则使用对应模块的默认值。
2.如果未传该参数或者传的值为0且未指定模块，则使用InternetMaxBandwidthOut
     * @param InternetMaxBandwidthIn 公网入带宽上限，单位：Mbps。
1.如果未传该参数或者传的值为0，则使用对应模块的默认值。
2.如果未传该参数或者传的值为0且未指定模块，则使用InternetMaxBandwidthOut
     */
    public void setInternetMaxBandwidthIn(Long InternetMaxBandwidthIn) {
        this.InternetMaxBandwidthIn = InternetMaxBandwidthIn;
    }

    /**
     * Get 实例计费类型。其中：
0，按资源维度后付费，计算当日用量峰值，例如CPU，内存，硬盘等，仅适用于非GNR系列机型；
1，按小时后付费，单价：xx元/实例/小时，仅适用于GNR机型，如需开通该计费方式请提工单申请；
2，按月后付费，单价：xx元/实例/月，仅适用于GNR机型；
该字段不填时，非GNR机型会默认选择0；GNR机型默认选择2。 
     * @return InstanceChargeType 实例计费类型。其中：
0，按资源维度后付费，计算当日用量峰值，例如CPU，内存，硬盘等，仅适用于非GNR系列机型；
1，按小时后付费，单价：xx元/实例/小时，仅适用于GNR机型，如需开通该计费方式请提工单申请；
2，按月后付费，单价：xx元/实例/月，仅适用于GNR机型；
该字段不填时，非GNR机型会默认选择0；GNR机型默认选择2。
     */
    public Long getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set 实例计费类型。其中：
0，按资源维度后付费，计算当日用量峰值，例如CPU，内存，硬盘等，仅适用于非GNR系列机型；
1，按小时后付费，单价：xx元/实例/小时，仅适用于GNR机型，如需开通该计费方式请提工单申请；
2，按月后付费，单价：xx元/实例/月，仅适用于GNR机型；
该字段不填时，非GNR机型会默认选择0；GNR机型默认选择2。
     * @param InstanceChargeType 实例计费类型。其中：
0，按资源维度后付费，计算当日用量峰值，例如CPU，内存，硬盘等，仅适用于非GNR系列机型；
1，按小时后付费，单价：xx元/实例/小时，仅适用于GNR机型，如需开通该计费方式请提工单申请；
2，按月后付费，单价：xx元/实例/月，仅适用于GNR机型；
该字段不填时，非GNR机型会默认选择0；GNR机型默认选择2。
     */
    public void setInstanceChargeType(Long InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get 密钥对。 
     * @return KeyIds 密钥对。
     */
    public String [] getKeyIds() {
        return this.KeyIds;
    }

    /**
     * Set 密钥对。
     * @param KeyIds 密钥对。
     */
    public void setKeyIds(String [] KeyIds) {
        this.KeyIds = KeyIds;
    }

    /**
     * Get 保持镜像的原始设置。该参数与Password或KeyIds.N不能同时指定。只有使用自定义镜像、共享镜像或外部导入镜像创建实例时才能指定该参数为TRUE。取值范围：
TRUE：表示保持镜像的登录设置
FALSE：表示不保持镜像的登录设置

默认取值：FALSE。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeepImageLogin 保持镜像的原始设置。该参数与Password或KeyIds.N不能同时指定。只有使用自定义镜像、共享镜像或外部导入镜像创建实例时才能指定该参数为TRUE。取值范围：
TRUE：表示保持镜像的登录设置
FALSE：表示不保持镜像的登录设置

默认取值：FALSE。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKeepImageLogin() {
        return this.KeepImageLogin;
    }

    /**
     * Set 保持镜像的原始设置。该参数与Password或KeyIds.N不能同时指定。只有使用自定义镜像、共享镜像或外部导入镜像创建实例时才能指定该参数为TRUE。取值范围：
TRUE：表示保持镜像的登录设置
FALSE：表示不保持镜像的登录设置

默认取值：FALSE。
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeepImageLogin 保持镜像的原始设置。该参数与Password或KeyIds.N不能同时指定。只有使用自定义镜像、共享镜像或外部导入镜像创建实例时才能指定该参数为TRUE。取值范围：
TRUE：表示保持镜像的登录设置
FALSE：表示不保持镜像的登录设置

默认取值：FALSE。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeepImageLogin(String KeepImageLogin) {
        this.KeepImageLogin = KeepImageLogin;
    }

    /**
     * Get 系统盘信息。 
     * @return SystemDisk 系统盘信息。
     */
    public SystemDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set 系统盘信息。
     * @param SystemDisk 系统盘信息。
     */
    public void setSystemDisk(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get 数据盘信息。 
     * @return DataDisks 数据盘信息。
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set 数据盘信息。
     * @param DataDisks 数据盘信息。
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    public RunInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunInstancesRequest(RunInstancesRequest source) {
        if (source.ZoneInstanceCountISPSet != null) {
            this.ZoneInstanceCountISPSet = new ZoneInstanceCountISP[source.ZoneInstanceCountISPSet.length];
            for (int i = 0; i < source.ZoneInstanceCountISPSet.length; i++) {
                this.ZoneInstanceCountISPSet[i] = new ZoneInstanceCountISP(source.ZoneInstanceCountISPSet[i]);
            }
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.ModuleId != null) {
            this.ModuleId = new String(source.ModuleId);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.EnhancedService != null) {
            this.EnhancedService = new EnhancedService(source.EnhancedService);
        }
        if (source.TagSpecification != null) {
            this.TagSpecification = new TagSpecification[source.TagSpecification.length];
            for (int i = 0; i < source.TagSpecification.length; i++) {
                this.TagSpecification[i] = new TagSpecification(source.TagSpecification[i]);
            }
        }
        if (source.UserData != null) {
            this.UserData = new String(source.UserData);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.DataDiskSize != null) {
            this.DataDiskSize = new Long(source.DataDiskSize);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.SystemDiskSize != null) {
            this.SystemDiskSize = new Long(source.SystemDiskSize);
        }
        if (source.InternetMaxBandwidthIn != null) {
            this.InternetMaxBandwidthIn = new Long(source.InternetMaxBandwidthIn);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new Long(source.InstanceChargeType);
        }
        if (source.KeyIds != null) {
            this.KeyIds = new String[source.KeyIds.length];
            for (int i = 0; i < source.KeyIds.length; i++) {
                this.KeyIds[i] = new String(source.KeyIds[i]);
            }
        }
        if (source.KeepImageLogin != null) {
            this.KeepImageLogin = new String(source.KeepImageLogin);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ZoneInstanceCountISPSet.", this.ZoneInstanceCountISPSet);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "ModuleId", this.ModuleId);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamObj(map, prefix + "EnhancedService.", this.EnhancedService);
        this.setParamArrayObj(map, prefix + "TagSpecification.", this.TagSpecification);
        this.setParamSimple(map, prefix + "UserData", this.UserData);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "DataDiskSize", this.DataDiskSize);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "SystemDiskSize", this.SystemDiskSize);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthIn", this.InternetMaxBandwidthIn);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamArraySimple(map, prefix + "KeyIds.", this.KeyIds);
        this.setParamSimple(map, prefix + "KeepImageLogin", this.KeepImageLogin);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);

    }
}

