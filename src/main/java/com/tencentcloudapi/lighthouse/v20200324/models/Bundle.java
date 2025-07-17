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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Bundle extends AbstractModel {

    /**
    * 套餐 ID。
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * 内存大小，单位 GB。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 系统盘类型。
取值范围： 
<li> CLOUD_SSD：SSD 云硬盘</li><li> CLOUD_PREMIUM：高性能云硬盘</li>
    */
    @SerializedName("SystemDiskType")
    @Expose
    private String SystemDiskType;

    /**
    * 系统盘大小。单位GB。
    */
    @SerializedName("SystemDiskSize")
    @Expose
    private Long SystemDiskSize;

    /**
    * 每月网络流量，单位 GB。
    */
    @SerializedName("MonthlyTraffic")
    @Expose
    private Long MonthlyTraffic;

    /**
    * 是否支持 Linux/Unix 平台。
    */
    @SerializedName("SupportLinuxUnixPlatform")
    @Expose
    private Boolean SupportLinuxUnixPlatform;

    /**
    * 是否支持 Windows 平台。
    */
    @SerializedName("SupportWindowsPlatform")
    @Expose
    private Boolean SupportWindowsPlatform;

    /**
    * 套餐当前单位价格信息。
    */
    @SerializedName("Price")
    @Expose
    private Price Price;

    /**
    * CPU 核数。
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * 峰值带宽，单位 Mbps。
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * 网络计费类型。
    */
    @SerializedName("InternetChargeType")
    @Expose
    private String InternetChargeType;

    /**
    * 套餐售卖状态,取值:‘AVAILABLE’(可用) , ‘SOLD_OUT’(售罄)
    */
    @SerializedName("BundleSalesState")
    @Expose
    private String BundleSalesState;

    /**
    * 套餐类型。
取值范围：
<li>GENERAL_BUNDLE：通用型</li>
<li>STORAGE_BUNDLE：存储型</li>
<li>ENTERPRISE_BUNDLE：企业型</li>
<li>EXCLUSIVE_BUNDLE：专属型</li>
<li>BEFAST_BUNDLE：蜂驰型 </li>
<li>STARTER_BUNDLE：入门型</li>
<li>CAREFREE_BUNDLE：无忧型</li>
<li>RAZOR_SPEED_BUNDLE：锐驰型</li>
    */
    @SerializedName("BundleType")
    @Expose
    private String BundleType;

    /**
    * 套餐类型描述信息。
    */
    @SerializedName("BundleTypeDescription")
    @Expose
    private String BundleTypeDescription;

    /**
    * 套餐展示标签.
取值范围:
"ACTIVITY": 活动套餐,
"NORMAL": 普通套餐
"CAREFREE": 无忧套餐
    */
    @SerializedName("BundleDisplayLabel")
    @Expose
    private String BundleDisplayLabel;

    /**
    * 流量是否无上限。
    */
    @SerializedName("TrafficUnlimited")
    @Expose
    private Boolean TrafficUnlimited;

    /**
     * Get 套餐 ID。 
     * @return BundleId 套餐 ID。
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set 套餐 ID。
     * @param BundleId 套餐 ID。
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get 内存大小，单位 GB。 
     * @return Memory 内存大小，单位 GB。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存大小，单位 GB。
     * @param Memory 内存大小，单位 GB。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 系统盘类型。
取值范围： 
<li> CLOUD_SSD：SSD 云硬盘</li><li> CLOUD_PREMIUM：高性能云硬盘</li> 
     * @return SystemDiskType 系统盘类型。
取值范围： 
<li> CLOUD_SSD：SSD 云硬盘</li><li> CLOUD_PREMIUM：高性能云硬盘</li>
     */
    public String getSystemDiskType() {
        return this.SystemDiskType;
    }

    /**
     * Set 系统盘类型。
取值范围： 
<li> CLOUD_SSD：SSD 云硬盘</li><li> CLOUD_PREMIUM：高性能云硬盘</li>
     * @param SystemDiskType 系统盘类型。
取值范围： 
<li> CLOUD_SSD：SSD 云硬盘</li><li> CLOUD_PREMIUM：高性能云硬盘</li>
     */
    public void setSystemDiskType(String SystemDiskType) {
        this.SystemDiskType = SystemDiskType;
    }

    /**
     * Get 系统盘大小。单位GB。 
     * @return SystemDiskSize 系统盘大小。单位GB。
     */
    public Long getSystemDiskSize() {
        return this.SystemDiskSize;
    }

    /**
     * Set 系统盘大小。单位GB。
     * @param SystemDiskSize 系统盘大小。单位GB。
     */
    public void setSystemDiskSize(Long SystemDiskSize) {
        this.SystemDiskSize = SystemDiskSize;
    }

    /**
     * Get 每月网络流量，单位 GB。 
     * @return MonthlyTraffic 每月网络流量，单位 GB。
     */
    public Long getMonthlyTraffic() {
        return this.MonthlyTraffic;
    }

    /**
     * Set 每月网络流量，单位 GB。
     * @param MonthlyTraffic 每月网络流量，单位 GB。
     */
    public void setMonthlyTraffic(Long MonthlyTraffic) {
        this.MonthlyTraffic = MonthlyTraffic;
    }

    /**
     * Get 是否支持 Linux/Unix 平台。 
     * @return SupportLinuxUnixPlatform 是否支持 Linux/Unix 平台。
     */
    public Boolean getSupportLinuxUnixPlatform() {
        return this.SupportLinuxUnixPlatform;
    }

    /**
     * Set 是否支持 Linux/Unix 平台。
     * @param SupportLinuxUnixPlatform 是否支持 Linux/Unix 平台。
     */
    public void setSupportLinuxUnixPlatform(Boolean SupportLinuxUnixPlatform) {
        this.SupportLinuxUnixPlatform = SupportLinuxUnixPlatform;
    }

    /**
     * Get 是否支持 Windows 平台。 
     * @return SupportWindowsPlatform 是否支持 Windows 平台。
     */
    public Boolean getSupportWindowsPlatform() {
        return this.SupportWindowsPlatform;
    }

    /**
     * Set 是否支持 Windows 平台。
     * @param SupportWindowsPlatform 是否支持 Windows 平台。
     */
    public void setSupportWindowsPlatform(Boolean SupportWindowsPlatform) {
        this.SupportWindowsPlatform = SupportWindowsPlatform;
    }

    /**
     * Get 套餐当前单位价格信息。 
     * @return Price 套餐当前单位价格信息。
     */
    public Price getPrice() {
        return this.Price;
    }

    /**
     * Set 套餐当前单位价格信息。
     * @param Price 套餐当前单位价格信息。
     */
    public void setPrice(Price Price) {
        this.Price = Price;
    }

    /**
     * Get CPU 核数。 
     * @return CPU CPU 核数。
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set CPU 核数。
     * @param CPU CPU 核数。
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get 峰值带宽，单位 Mbps。 
     * @return InternetMaxBandwidthOut 峰值带宽，单位 Mbps。
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set 峰值带宽，单位 Mbps。
     * @param InternetMaxBandwidthOut 峰值带宽，单位 Mbps。
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get 网络计费类型。 
     * @return InternetChargeType 网络计费类型。
     */
    public String getInternetChargeType() {
        return this.InternetChargeType;
    }

    /**
     * Set 网络计费类型。
     * @param InternetChargeType 网络计费类型。
     */
    public void setInternetChargeType(String InternetChargeType) {
        this.InternetChargeType = InternetChargeType;
    }

    /**
     * Get 套餐售卖状态,取值:‘AVAILABLE’(可用) , ‘SOLD_OUT’(售罄) 
     * @return BundleSalesState 套餐售卖状态,取值:‘AVAILABLE’(可用) , ‘SOLD_OUT’(售罄)
     */
    public String getBundleSalesState() {
        return this.BundleSalesState;
    }

    /**
     * Set 套餐售卖状态,取值:‘AVAILABLE’(可用) , ‘SOLD_OUT’(售罄)
     * @param BundleSalesState 套餐售卖状态,取值:‘AVAILABLE’(可用) , ‘SOLD_OUT’(售罄)
     */
    public void setBundleSalesState(String BundleSalesState) {
        this.BundleSalesState = BundleSalesState;
    }

    /**
     * Get 套餐类型。
取值范围：
<li>GENERAL_BUNDLE：通用型</li>
<li>STORAGE_BUNDLE：存储型</li>
<li>ENTERPRISE_BUNDLE：企业型</li>
<li>EXCLUSIVE_BUNDLE：专属型</li>
<li>BEFAST_BUNDLE：蜂驰型 </li>
<li>STARTER_BUNDLE：入门型</li>
<li>CAREFREE_BUNDLE：无忧型</li>
<li>RAZOR_SPEED_BUNDLE：锐驰型</li> 
     * @return BundleType 套餐类型。
取值范围：
<li>GENERAL_BUNDLE：通用型</li>
<li>STORAGE_BUNDLE：存储型</li>
<li>ENTERPRISE_BUNDLE：企业型</li>
<li>EXCLUSIVE_BUNDLE：专属型</li>
<li>BEFAST_BUNDLE：蜂驰型 </li>
<li>STARTER_BUNDLE：入门型</li>
<li>CAREFREE_BUNDLE：无忧型</li>
<li>RAZOR_SPEED_BUNDLE：锐驰型</li>
     */
    public String getBundleType() {
        return this.BundleType;
    }

    /**
     * Set 套餐类型。
取值范围：
<li>GENERAL_BUNDLE：通用型</li>
<li>STORAGE_BUNDLE：存储型</li>
<li>ENTERPRISE_BUNDLE：企业型</li>
<li>EXCLUSIVE_BUNDLE：专属型</li>
<li>BEFAST_BUNDLE：蜂驰型 </li>
<li>STARTER_BUNDLE：入门型</li>
<li>CAREFREE_BUNDLE：无忧型</li>
<li>RAZOR_SPEED_BUNDLE：锐驰型</li>
     * @param BundleType 套餐类型。
取值范围：
<li>GENERAL_BUNDLE：通用型</li>
<li>STORAGE_BUNDLE：存储型</li>
<li>ENTERPRISE_BUNDLE：企业型</li>
<li>EXCLUSIVE_BUNDLE：专属型</li>
<li>BEFAST_BUNDLE：蜂驰型 </li>
<li>STARTER_BUNDLE：入门型</li>
<li>CAREFREE_BUNDLE：无忧型</li>
<li>RAZOR_SPEED_BUNDLE：锐驰型</li>
     */
    public void setBundleType(String BundleType) {
        this.BundleType = BundleType;
    }

    /**
     * Get 套餐类型描述信息。 
     * @return BundleTypeDescription 套餐类型描述信息。
     */
    public String getBundleTypeDescription() {
        return this.BundleTypeDescription;
    }

    /**
     * Set 套餐类型描述信息。
     * @param BundleTypeDescription 套餐类型描述信息。
     */
    public void setBundleTypeDescription(String BundleTypeDescription) {
        this.BundleTypeDescription = BundleTypeDescription;
    }

    /**
     * Get 套餐展示标签.
取值范围:
"ACTIVITY": 活动套餐,
"NORMAL": 普通套餐
"CAREFREE": 无忧套餐 
     * @return BundleDisplayLabel 套餐展示标签.
取值范围:
"ACTIVITY": 活动套餐,
"NORMAL": 普通套餐
"CAREFREE": 无忧套餐
     */
    public String getBundleDisplayLabel() {
        return this.BundleDisplayLabel;
    }

    /**
     * Set 套餐展示标签.
取值范围:
"ACTIVITY": 活动套餐,
"NORMAL": 普通套餐
"CAREFREE": 无忧套餐
     * @param BundleDisplayLabel 套餐展示标签.
取值范围:
"ACTIVITY": 活动套餐,
"NORMAL": 普通套餐
"CAREFREE": 无忧套餐
     */
    public void setBundleDisplayLabel(String BundleDisplayLabel) {
        this.BundleDisplayLabel = BundleDisplayLabel;
    }

    /**
     * Get 流量是否无上限。 
     * @return TrafficUnlimited 流量是否无上限。
     */
    public Boolean getTrafficUnlimited() {
        return this.TrafficUnlimited;
    }

    /**
     * Set 流量是否无上限。
     * @param TrafficUnlimited 流量是否无上限。
     */
    public void setTrafficUnlimited(Boolean TrafficUnlimited) {
        this.TrafficUnlimited = TrafficUnlimited;
    }

    public Bundle() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Bundle(Bundle source) {
        if (source.BundleId != null) {
            this.BundleId = new String(source.BundleId);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.SystemDiskType != null) {
            this.SystemDiskType = new String(source.SystemDiskType);
        }
        if (source.SystemDiskSize != null) {
            this.SystemDiskSize = new Long(source.SystemDiskSize);
        }
        if (source.MonthlyTraffic != null) {
            this.MonthlyTraffic = new Long(source.MonthlyTraffic);
        }
        if (source.SupportLinuxUnixPlatform != null) {
            this.SupportLinuxUnixPlatform = new Boolean(source.SupportLinuxUnixPlatform);
        }
        if (source.SupportWindowsPlatform != null) {
            this.SupportWindowsPlatform = new Boolean(source.SupportWindowsPlatform);
        }
        if (source.Price != null) {
            this.Price = new Price(source.Price);
        }
        if (source.CPU != null) {
            this.CPU = new Long(source.CPU);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.InternetChargeType != null) {
            this.InternetChargeType = new String(source.InternetChargeType);
        }
        if (source.BundleSalesState != null) {
            this.BundleSalesState = new String(source.BundleSalesState);
        }
        if (source.BundleType != null) {
            this.BundleType = new String(source.BundleType);
        }
        if (source.BundleTypeDescription != null) {
            this.BundleTypeDescription = new String(source.BundleTypeDescription);
        }
        if (source.BundleDisplayLabel != null) {
            this.BundleDisplayLabel = new String(source.BundleDisplayLabel);
        }
        if (source.TrafficUnlimited != null) {
            this.TrafficUnlimited = new Boolean(source.TrafficUnlimited);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "SystemDiskType", this.SystemDiskType);
        this.setParamSimple(map, prefix + "SystemDiskSize", this.SystemDiskSize);
        this.setParamSimple(map, prefix + "MonthlyTraffic", this.MonthlyTraffic);
        this.setParamSimple(map, prefix + "SupportLinuxUnixPlatform", this.SupportLinuxUnixPlatform);
        this.setParamSimple(map, prefix + "SupportWindowsPlatform", this.SupportWindowsPlatform);
        this.setParamObj(map, prefix + "Price.", this.Price);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "InternetChargeType", this.InternetChargeType);
        this.setParamSimple(map, prefix + "BundleSalesState", this.BundleSalesState);
        this.setParamSimple(map, prefix + "BundleType", this.BundleType);
        this.setParamSimple(map, prefix + "BundleTypeDescription", this.BundleTypeDescription);
        this.setParamSimple(map, prefix + "BundleDisplayLabel", this.BundleDisplayLabel);
        this.setParamSimple(map, prefix + "TrafficUnlimited", this.TrafficUnlimited);

    }
}

