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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LaunchTemplateVersionData extends AbstractModel {

    /**
    * 实例所在的位置。
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * 实例机型。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 实例名称。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例计费模式。取值范围：
<li>`PREPAID`：表示预付费，即包年包月</li>
<li>`POSTPAID_BY_HOUR`：表示后付费，即按量计费</li>
<li>`CDHPAID`：`专用宿主机`付费，即只对`专用宿主机`计费，不对`专用宿主机`上的实例计费。</li>
<li>`SPOTPAID`：表示竞价实例付费。</li>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * 实例系统盘信息。
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk SystemDisk;

    /**
    * 实例数据盘信息。只包含随实例购买的数据盘。
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

    /**
    * 实例带宽信息。
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * 实例所属虚拟私有网络信息。
    */
    @SerializedName("VirtualPrivateCloud")
    @Expose
    private VirtualPrivateCloud VirtualPrivateCloud;

    /**
    * 生产实例所使用的镜像`ID`。
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 实例所属安全组。该参数可以通过调用 [DescribeSecurityGroups](https://cloud.tencent.com/document/api/215/15808) 的返回值中的sgId字段来获取。
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * 实例登录设置。目前只返回实例所关联的密钥。
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSettings LoginSettings;

    /**
    * CAM角色名。
    */
    @SerializedName("CamRoleName")
    @Expose
    private String CamRoleName;

    /**
    * 高性能计算集群`ID`。
    */
    @SerializedName("HpcClusterId")
    @Expose
    private String HpcClusterId;

    /**
    * 购买实例数量。
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * 增强服务。
    */
    @SerializedName("EnhancedService")
    @Expose
    private EnhancedService EnhancedService;

    /**
    * 提供给实例使用的用户数据，需要以 base64 方式编码，支持的最大数据大小为 16KB。
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
    * 置放群组ID，仅支持指定一个。
    */
    @SerializedName("DisasterRecoverGroupIds")
    @Expose
    private String [] DisasterRecoverGroupIds;

    /**
    * 定时任务。通过该参数可以为实例指定定时任务，目前仅支持定时销毁。
    */
    @SerializedName("ActionTimer")
    @Expose
    private ActionTimer ActionTimer;

    /**
    * 实例的市场相关选项，如竞价实例相关参数，若指定实例的付费模式为竞价付费则该参数必传。
    */
    @SerializedName("InstanceMarketOptions")
    @Expose
    private InstanceMarketOptionsRequest InstanceMarketOptions;

    /**
    * 云服务器的主机名。
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 用于保证请求幂等性的字符串。
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * 预付费模式，即包年包月相关参数设置。
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * 标签描述列表。通过指定该参数可以同时绑定标签到相应的云服务器、云硬盘实例。
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification [] TagSpecification;

    /**
    * 实例销毁保护标志，表示是否允许通过api接口删除实例。取值范围：

true：表示开启实例保护，不允许通过api接口删除实例
false：表示关闭实例保护，允许通过api接口删除实例

默认取值：false。
    */
    @SerializedName("DisableApiTermination")
    @Expose
    private Boolean DisableApiTermination;

    /**
     * Get 实例所在的位置。 
     * @return Placement 实例所在的位置。
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set 实例所在的位置。
     * @param Placement 实例所在的位置。
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get 实例机型。 
     * @return InstanceType 实例机型。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例机型。
     * @param InstanceType 实例机型。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 实例名称。 
     * @return InstanceName 实例名称。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称。
     * @param InstanceName 实例名称。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例计费模式。取值范围：
<li>`PREPAID`：表示预付费，即包年包月</li>
<li>`POSTPAID_BY_HOUR`：表示后付费，即按量计费</li>
<li>`CDHPAID`：`专用宿主机`付费，即只对`专用宿主机`计费，不对`专用宿主机`上的实例计费。</li>
<li>`SPOTPAID`：表示竞价实例付费。</li> 
     * @return InstanceChargeType 实例计费模式。取值范围：
<li>`PREPAID`：表示预付费，即包年包月</li>
<li>`POSTPAID_BY_HOUR`：表示后付费，即按量计费</li>
<li>`CDHPAID`：`专用宿主机`付费，即只对`专用宿主机`计费，不对`专用宿主机`上的实例计费。</li>
<li>`SPOTPAID`：表示竞价实例付费。</li>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set 实例计费模式。取值范围：
<li>`PREPAID`：表示预付费，即包年包月</li>
<li>`POSTPAID_BY_HOUR`：表示后付费，即按量计费</li>
<li>`CDHPAID`：`专用宿主机`付费，即只对`专用宿主机`计费，不对`专用宿主机`上的实例计费。</li>
<li>`SPOTPAID`：表示竞价实例付费。</li>
     * @param InstanceChargeType 实例计费模式。取值范围：
<li>`PREPAID`：表示预付费，即包年包月</li>
<li>`POSTPAID_BY_HOUR`：表示后付费，即按量计费</li>
<li>`CDHPAID`：`专用宿主机`付费，即只对`专用宿主机`计费，不对`专用宿主机`上的实例计费。</li>
<li>`SPOTPAID`：表示竞价实例付费。</li>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get 实例系统盘信息。 
     * @return SystemDisk 实例系统盘信息。
     */
    public SystemDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set 实例系统盘信息。
     * @param SystemDisk 实例系统盘信息。
     */
    public void setSystemDisk(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get 实例数据盘信息。只包含随实例购买的数据盘。 
     * @return DataDisks 实例数据盘信息。只包含随实例购买的数据盘。
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set 实例数据盘信息。只包含随实例购买的数据盘。
     * @param DataDisks 实例数据盘信息。只包含随实例购买的数据盘。
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * Get 实例带宽信息。 
     * @return InternetAccessible 实例带宽信息。
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set 实例带宽信息。
     * @param InternetAccessible 实例带宽信息。
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Get 实例所属虚拟私有网络信息。 
     * @return VirtualPrivateCloud 实例所属虚拟私有网络信息。
     */
    public VirtualPrivateCloud getVirtualPrivateCloud() {
        return this.VirtualPrivateCloud;
    }

    /**
     * Set 实例所属虚拟私有网络信息。
     * @param VirtualPrivateCloud 实例所属虚拟私有网络信息。
     */
    public void setVirtualPrivateCloud(VirtualPrivateCloud VirtualPrivateCloud) {
        this.VirtualPrivateCloud = VirtualPrivateCloud;
    }

    /**
     * Get 生产实例所使用的镜像`ID`。 
     * @return ImageId 生产实例所使用的镜像`ID`。
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 生产实例所使用的镜像`ID`。
     * @param ImageId 生产实例所使用的镜像`ID`。
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 实例所属安全组。该参数可以通过调用 [DescribeSecurityGroups](https://cloud.tencent.com/document/api/215/15808) 的返回值中的sgId字段来获取。 
     * @return SecurityGroupIds 实例所属安全组。该参数可以通过调用 [DescribeSecurityGroups](https://cloud.tencent.com/document/api/215/15808) 的返回值中的sgId字段来获取。
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 实例所属安全组。该参数可以通过调用 [DescribeSecurityGroups](https://cloud.tencent.com/document/api/215/15808) 的返回值中的sgId字段来获取。
     * @param SecurityGroupIds 实例所属安全组。该参数可以通过调用 [DescribeSecurityGroups](https://cloud.tencent.com/document/api/215/15808) 的返回值中的sgId字段来获取。
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get 实例登录设置。目前只返回实例所关联的密钥。 
     * @return LoginSettings 实例登录设置。目前只返回实例所关联的密钥。
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set 实例登录设置。目前只返回实例所关联的密钥。
     * @param LoginSettings 实例登录设置。目前只返回实例所关联的密钥。
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * Get CAM角色名。 
     * @return CamRoleName CAM角色名。
     */
    public String getCamRoleName() {
        return this.CamRoleName;
    }

    /**
     * Set CAM角色名。
     * @param CamRoleName CAM角色名。
     */
    public void setCamRoleName(String CamRoleName) {
        this.CamRoleName = CamRoleName;
    }

    /**
     * Get 高性能计算集群`ID`。 
     * @return HpcClusterId 高性能计算集群`ID`。
     */
    public String getHpcClusterId() {
        return this.HpcClusterId;
    }

    /**
     * Set 高性能计算集群`ID`。
     * @param HpcClusterId 高性能计算集群`ID`。
     */
    public void setHpcClusterId(String HpcClusterId) {
        this.HpcClusterId = HpcClusterId;
    }

    /**
     * Get 购买实例数量。 
     * @return InstanceCount 购买实例数量。
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set 购买实例数量。
     * @param InstanceCount 购买实例数量。
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get 增强服务。 
     * @return EnhancedService 增强服务。
     */
    public EnhancedService getEnhancedService() {
        return this.EnhancedService;
    }

    /**
     * Set 增强服务。
     * @param EnhancedService 增强服务。
     */
    public void setEnhancedService(EnhancedService EnhancedService) {
        this.EnhancedService = EnhancedService;
    }

    /**
     * Get 提供给实例使用的用户数据，需要以 base64 方式编码，支持的最大数据大小为 16KB。 
     * @return UserData 提供给实例使用的用户数据，需要以 base64 方式编码，支持的最大数据大小为 16KB。
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Set 提供给实例使用的用户数据，需要以 base64 方式编码，支持的最大数据大小为 16KB。
     * @param UserData 提供给实例使用的用户数据，需要以 base64 方式编码，支持的最大数据大小为 16KB。
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    /**
     * Get 置放群组ID，仅支持指定一个。 
     * @return DisasterRecoverGroupIds 置放群组ID，仅支持指定一个。
     */
    public String [] getDisasterRecoverGroupIds() {
        return this.DisasterRecoverGroupIds;
    }

    /**
     * Set 置放群组ID，仅支持指定一个。
     * @param DisasterRecoverGroupIds 置放群组ID，仅支持指定一个。
     */
    public void setDisasterRecoverGroupIds(String [] DisasterRecoverGroupIds) {
        this.DisasterRecoverGroupIds = DisasterRecoverGroupIds;
    }

    /**
     * Get 定时任务。通过该参数可以为实例指定定时任务，目前仅支持定时销毁。 
     * @return ActionTimer 定时任务。通过该参数可以为实例指定定时任务，目前仅支持定时销毁。
     */
    public ActionTimer getActionTimer() {
        return this.ActionTimer;
    }

    /**
     * Set 定时任务。通过该参数可以为实例指定定时任务，目前仅支持定时销毁。
     * @param ActionTimer 定时任务。通过该参数可以为实例指定定时任务，目前仅支持定时销毁。
     */
    public void setActionTimer(ActionTimer ActionTimer) {
        this.ActionTimer = ActionTimer;
    }

    /**
     * Get 实例的市场相关选项，如竞价实例相关参数，若指定实例的付费模式为竞价付费则该参数必传。 
     * @return InstanceMarketOptions 实例的市场相关选项，如竞价实例相关参数，若指定实例的付费模式为竞价付费则该参数必传。
     */
    public InstanceMarketOptionsRequest getInstanceMarketOptions() {
        return this.InstanceMarketOptions;
    }

    /**
     * Set 实例的市场相关选项，如竞价实例相关参数，若指定实例的付费模式为竞价付费则该参数必传。
     * @param InstanceMarketOptions 实例的市场相关选项，如竞价实例相关参数，若指定实例的付费模式为竞价付费则该参数必传。
     */
    public void setInstanceMarketOptions(InstanceMarketOptionsRequest InstanceMarketOptions) {
        this.InstanceMarketOptions = InstanceMarketOptions;
    }

    /**
     * Get 云服务器的主机名。 
     * @return HostName 云服务器的主机名。
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set 云服务器的主机名。
     * @param HostName 云服务器的主机名。
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get 用于保证请求幂等性的字符串。 
     * @return ClientToken 用于保证请求幂等性的字符串。
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 用于保证请求幂等性的字符串。
     * @param ClientToken 用于保证请求幂等性的字符串。
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get 预付费模式，即包年包月相关参数设置。 
     * @return InstanceChargePrepaid 预付费模式，即包年包月相关参数设置。
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set 预付费模式，即包年包月相关参数设置。
     * @param InstanceChargePrepaid 预付费模式，即包年包月相关参数设置。
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get 标签描述列表。通过指定该参数可以同时绑定标签到相应的云服务器、云硬盘实例。 
     * @return TagSpecification 标签描述列表。通过指定该参数可以同时绑定标签到相应的云服务器、云硬盘实例。
     */
    public TagSpecification [] getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set 标签描述列表。通过指定该参数可以同时绑定标签到相应的云服务器、云硬盘实例。
     * @param TagSpecification 标签描述列表。通过指定该参数可以同时绑定标签到相应的云服务器、云硬盘实例。
     */
    public void setTagSpecification(TagSpecification [] TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    /**
     * Get 实例销毁保护标志，表示是否允许通过api接口删除实例。取值范围：

true：表示开启实例保护，不允许通过api接口删除实例
false：表示关闭实例保护，允许通过api接口删除实例

默认取值：false。 
     * @return DisableApiTermination 实例销毁保护标志，表示是否允许通过api接口删除实例。取值范围：

true：表示开启实例保护，不允许通过api接口删除实例
false：表示关闭实例保护，允许通过api接口删除实例

默认取值：false。
     */
    public Boolean getDisableApiTermination() {
        return this.DisableApiTermination;
    }

    /**
     * Set 实例销毁保护标志，表示是否允许通过api接口删除实例。取值范围：

true：表示开启实例保护，不允许通过api接口删除实例
false：表示关闭实例保护，允许通过api接口删除实例

默认取值：false。
     * @param DisableApiTermination 实例销毁保护标志，表示是否允许通过api接口删除实例。取值范围：

true：表示开启实例保护，不允许通过api接口删除实例
false：表示关闭实例保护，允许通过api接口删除实例

默认取值：false。
     */
    public void setDisableApiTermination(Boolean DisableApiTermination) {
        this.DisableApiTermination = DisableApiTermination;
    }

    public LaunchTemplateVersionData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LaunchTemplateVersionData(LaunchTemplateVersionData source) {
        if (source.Placement != null) {
            this.Placement = new Placement(source.Placement);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
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
        if (source.VirtualPrivateCloud != null) {
            this.VirtualPrivateCloud = new VirtualPrivateCloud(source.VirtualPrivateCloud);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.LoginSettings != null) {
            this.LoginSettings = new LoginSettings(source.LoginSettings);
        }
        if (source.CamRoleName != null) {
            this.CamRoleName = new String(source.CamRoleName);
        }
        if (source.HpcClusterId != null) {
            this.HpcClusterId = new String(source.HpcClusterId);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.EnhancedService != null) {
            this.EnhancedService = new EnhancedService(source.EnhancedService);
        }
        if (source.UserData != null) {
            this.UserData = new String(source.UserData);
        }
        if (source.DisasterRecoverGroupIds != null) {
            this.DisasterRecoverGroupIds = new String[source.DisasterRecoverGroupIds.length];
            for (int i = 0; i < source.DisasterRecoverGroupIds.length; i++) {
                this.DisasterRecoverGroupIds[i] = new String(source.DisasterRecoverGroupIds[i]);
            }
        }
        if (source.ActionTimer != null) {
            this.ActionTimer = new ActionTimer(source.ActionTimer);
        }
        if (source.InstanceMarketOptions != null) {
            this.InstanceMarketOptions = new InstanceMarketOptionsRequest(source.InstanceMarketOptions);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.InstanceChargePrepaid != null) {
            this.InstanceChargePrepaid = new InstanceChargePrepaid(source.InstanceChargePrepaid);
        }
        if (source.TagSpecification != null) {
            this.TagSpecification = new TagSpecification[source.TagSpecification.length];
            for (int i = 0; i < source.TagSpecification.length; i++) {
                this.TagSpecification[i] = new TagSpecification(source.TagSpecification[i]);
            }
        }
        if (source.DisableApiTermination != null) {
            this.DisableApiTermination = new Boolean(source.DisableApiTermination);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamObj(map, prefix + "VirtualPrivateCloud.", this.VirtualPrivateCloud);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamSimple(map, prefix + "CamRoleName", this.CamRoleName);
        this.setParamSimple(map, prefix + "HpcClusterId", this.HpcClusterId);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamObj(map, prefix + "EnhancedService.", this.EnhancedService);
        this.setParamSimple(map, prefix + "UserData", this.UserData);
        this.setParamArraySimple(map, prefix + "DisasterRecoverGroupIds.", this.DisasterRecoverGroupIds);
        this.setParamObj(map, prefix + "ActionTimer.", this.ActionTimer);
        this.setParamObj(map, prefix + "InstanceMarketOptions.", this.InstanceMarketOptions);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);
        this.setParamArrayObj(map, prefix + "TagSpecification.", this.TagSpecification);
        this.setParamSimple(map, prefix + "DisableApiTermination", this.DisableApiTermination);

    }
}

