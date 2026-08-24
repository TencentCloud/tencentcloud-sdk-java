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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstanceModel extends AbstractModel {

    /**
    * 源CVM ID
    */
    @SerializedName("SourceInstanceId")
    @Expose
    private String SourceInstanceId;

    /**
    * 实例计费模式
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * 实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * 镜像ID
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 指定系统盘规格
    */
    @SerializedName("SystemDisk")
    @Expose
    private DiskModel SystemDisk;

    /**
    * 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * 实例类型
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 指定数据盘规格列表
    */
    @SerializedName("DataDisks")
    @Expose
    private DiskModel [] DataDisks;

    /**
    * 私有网络相关信息配置
    */
    @SerializedName("VirtualPrivateCloud")
    @Expose
    private VirtualPrivateCloud VirtualPrivateCloud;

    /**
    * 公网带宽相关信息设置
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * 实例显示名称。不传则新实例名为"未命名"。最大长度不能超60个字节。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例登录设置
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSettings LoginSettings;

    /**
    * 增强服务配置
    */
    @SerializedName("EnhancedService")
    @Expose
    private EnhancedService EnhancedService;

    /**
    * 竞价实例最高出价
    */
    @SerializedName("SpotPrice")
    @Expose
    private String SpotPrice;

    /**
    * 实例主机名
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 提供给实例使用的用户数据
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
    * 放置群组ID
    */
    @SerializedName("DisasterRecoverGroupIds")
    @Expose
    private String [] DisasterRecoverGroupIds;

    /**
    * 关机计费模式，默认关机收费（KEEP_CHARGING / STOP_CHARGING），仅 CreateInstanceCopyPair 场景生效
    */
    @SerializedName("StoppedMode")
    @Expose
    private String StoppedMode;

    /**
    * 容灾演练使用的复制对ID，仅 CreateInstanceDrillPairs 场景生效
    */
    @SerializedName("CopyPairId")
    @Expose
    private String CopyPairId;

    /**
    * 容灾演练的恢复时间点，仅 CreateInstanceDrillPairs 场景生效
    */
    @SerializedName("RecoveryTime")
    @Expose
    private String RecoveryTime;

    /**
     * Get 源CVM ID 
     * @return SourceInstanceId 源CVM ID
     */
    public String getSourceInstanceId() {
        return this.SourceInstanceId;
    }

    /**
     * Set 源CVM ID
     * @param SourceInstanceId 源CVM ID
     */
    public void setSourceInstanceId(String SourceInstanceId) {
        this.SourceInstanceId = SourceInstanceId;
    }

    /**
     * Get 实例计费模式 
     * @return InstanceChargeType 实例计费模式
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set 实例计费模式
     * @param InstanceChargeType 实例计费模式
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get 实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。 
     * @return Placement 实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set 实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。
     * @param Placement 实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get 镜像ID 
     * @return ImageId 镜像ID
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 镜像ID
     * @param ImageId 镜像ID
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 指定系统盘规格 
     * @return SystemDisk 指定系统盘规格
     */
    public DiskModel getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set 指定系统盘规格
     * @param SystemDisk 指定系统盘规格
     */
    public void setSystemDisk(DiskModel SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。 
     * @return InstanceChargePrepaid 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。
     * @param InstanceChargePrepaid 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get 实例类型 
     * @return InstanceType 实例类型
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型
     * @param InstanceType 实例类型
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 指定数据盘规格列表 
     * @return DataDisks 指定数据盘规格列表
     */
    public DiskModel [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set 指定数据盘规格列表
     * @param DataDisks 指定数据盘规格列表
     */
    public void setDataDisks(DiskModel [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * Get 私有网络相关信息配置 
     * @return VirtualPrivateCloud 私有网络相关信息配置
     */
    public VirtualPrivateCloud getVirtualPrivateCloud() {
        return this.VirtualPrivateCloud;
    }

    /**
     * Set 私有网络相关信息配置
     * @param VirtualPrivateCloud 私有网络相关信息配置
     */
    public void setVirtualPrivateCloud(VirtualPrivateCloud VirtualPrivateCloud) {
        this.VirtualPrivateCloud = VirtualPrivateCloud;
    }

    /**
     * Get 公网带宽相关信息设置 
     * @return InternetAccessible 公网带宽相关信息设置
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set 公网带宽相关信息设置
     * @param InternetAccessible 公网带宽相关信息设置
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Get 实例显示名称。不传则新实例名为"未命名"。最大长度不能超60个字节。 
     * @return InstanceName 实例显示名称。不传则新实例名为"未命名"。最大长度不能超60个字节。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例显示名称。不传则新实例名为"未命名"。最大长度不能超60个字节。
     * @param InstanceName 实例显示名称。不传则新实例名为"未命名"。最大长度不能超60个字节。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例登录设置 
     * @return LoginSettings 实例登录设置
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set 实例登录设置
     * @param LoginSettings 实例登录设置
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * Get 增强服务配置 
     * @return EnhancedService 增强服务配置
     */
    public EnhancedService getEnhancedService() {
        return this.EnhancedService;
    }

    /**
     * Set 增强服务配置
     * @param EnhancedService 增强服务配置
     */
    public void setEnhancedService(EnhancedService EnhancedService) {
        this.EnhancedService = EnhancedService;
    }

    /**
     * Get 竞价实例最高出价 
     * @return SpotPrice 竞价实例最高出价
     */
    public String getSpotPrice() {
        return this.SpotPrice;
    }

    /**
     * Set 竞价实例最高出价
     * @param SpotPrice 竞价实例最高出价
     */
    public void setSpotPrice(String SpotPrice) {
        this.SpotPrice = SpotPrice;
    }

    /**
     * Get 实例主机名 
     * @return HostName 实例主机名
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set 实例主机名
     * @param HostName 实例主机名
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get 提供给实例使用的用户数据 
     * @return UserData 提供给实例使用的用户数据
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Set 提供给实例使用的用户数据
     * @param UserData 提供给实例使用的用户数据
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    /**
     * Get 放置群组ID 
     * @return DisasterRecoverGroupIds 放置群组ID
     */
    public String [] getDisasterRecoverGroupIds() {
        return this.DisasterRecoverGroupIds;
    }

    /**
     * Set 放置群组ID
     * @param DisasterRecoverGroupIds 放置群组ID
     */
    public void setDisasterRecoverGroupIds(String [] DisasterRecoverGroupIds) {
        this.DisasterRecoverGroupIds = DisasterRecoverGroupIds;
    }

    /**
     * Get 关机计费模式，默认关机收费（KEEP_CHARGING / STOP_CHARGING），仅 CreateInstanceCopyPair 场景生效 
     * @return StoppedMode 关机计费模式，默认关机收费（KEEP_CHARGING / STOP_CHARGING），仅 CreateInstanceCopyPair 场景生效
     */
    public String getStoppedMode() {
        return this.StoppedMode;
    }

    /**
     * Set 关机计费模式，默认关机收费（KEEP_CHARGING / STOP_CHARGING），仅 CreateInstanceCopyPair 场景生效
     * @param StoppedMode 关机计费模式，默认关机收费（KEEP_CHARGING / STOP_CHARGING），仅 CreateInstanceCopyPair 场景生效
     */
    public void setStoppedMode(String StoppedMode) {
        this.StoppedMode = StoppedMode;
    }

    /**
     * Get 容灾演练使用的复制对ID，仅 CreateInstanceDrillPairs 场景生效 
     * @return CopyPairId 容灾演练使用的复制对ID，仅 CreateInstanceDrillPairs 场景生效
     */
    public String getCopyPairId() {
        return this.CopyPairId;
    }

    /**
     * Set 容灾演练使用的复制对ID，仅 CreateInstanceDrillPairs 场景生效
     * @param CopyPairId 容灾演练使用的复制对ID，仅 CreateInstanceDrillPairs 场景生效
     */
    public void setCopyPairId(String CopyPairId) {
        this.CopyPairId = CopyPairId;
    }

    /**
     * Get 容灾演练的恢复时间点，仅 CreateInstanceDrillPairs 场景生效 
     * @return RecoveryTime 容灾演练的恢复时间点，仅 CreateInstanceDrillPairs 场景生效
     */
    public String getRecoveryTime() {
        return this.RecoveryTime;
    }

    /**
     * Set 容灾演练的恢复时间点，仅 CreateInstanceDrillPairs 场景生效
     * @param RecoveryTime 容灾演练的恢复时间点，仅 CreateInstanceDrillPairs 场景生效
     */
    public void setRecoveryTime(String RecoveryTime) {
        this.RecoveryTime = RecoveryTime;
    }

    public CreateInstanceModel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstanceModel(CreateInstanceModel source) {
        if (source.SourceInstanceId != null) {
            this.SourceInstanceId = new String(source.SourceInstanceId);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.Placement != null) {
            this.Placement = new Placement(source.Placement);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.SystemDisk != null) {
            this.SystemDisk = new DiskModel(source.SystemDisk);
        }
        if (source.InstanceChargePrepaid != null) {
            this.InstanceChargePrepaid = new InstanceChargePrepaid(source.InstanceChargePrepaid);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.DataDisks != null) {
            this.DataDisks = new DiskModel[source.DataDisks.length];
            for (int i = 0; i < source.DataDisks.length; i++) {
                this.DataDisks[i] = new DiskModel(source.DataDisks[i]);
            }
        }
        if (source.VirtualPrivateCloud != null) {
            this.VirtualPrivateCloud = new VirtualPrivateCloud(source.VirtualPrivateCloud);
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
        if (source.EnhancedService != null) {
            this.EnhancedService = new EnhancedService(source.EnhancedService);
        }
        if (source.SpotPrice != null) {
            this.SpotPrice = new String(source.SpotPrice);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
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
        if (source.StoppedMode != null) {
            this.StoppedMode = new String(source.StoppedMode);
        }
        if (source.CopyPairId != null) {
            this.CopyPairId = new String(source.CopyPairId);
        }
        if (source.RecoveryTime != null) {
            this.RecoveryTime = new String(source.RecoveryTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceInstanceId", this.SourceInstanceId);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);
        this.setParamObj(map, prefix + "VirtualPrivateCloud.", this.VirtualPrivateCloud);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamObj(map, prefix + "EnhancedService.", this.EnhancedService);
        this.setParamSimple(map, prefix + "SpotPrice", this.SpotPrice);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "UserData", this.UserData);
        this.setParamArraySimple(map, prefix + "DisasterRecoverGroupIds.", this.DisasterRecoverGroupIds);
        this.setParamSimple(map, prefix + "StoppedMode", this.StoppedMode);
        this.setParamSimple(map, prefix + "CopyPairId", this.CopyPairId);
        this.setParamSimple(map, prefix + "RecoveryTime", this.RecoveryTime);

    }
}

