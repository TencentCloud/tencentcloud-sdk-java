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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Bundle extends AbstractModel{

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
<li> LOCAL_BASIC：本地硬盘</li><li> LOCAL_SSD：本地 SSD 硬盘</li><li> CLOUD_BASIC：普通云硬盘</li><li> CLOUD_SSD：SSD 云硬盘</li><li> CLOUD_PREMIUM：高性能云硬盘</li>
    */
    @SerializedName("SystemDiskType")
    @Expose
    private String SystemDiskType;

    /**
    * 系统盘大小。
    */
    @SerializedName("SystemDiskSize")
    @Expose
    private Long SystemDiskSize;

    /**
    * 每月网络流量，单位 Gb。
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
<li> GENERAL_BUNDLE：通用型</li><li> STORAGE_BUNDLE：存储型 </li>
    */
    @SerializedName("BundleType")
    @Expose
    private String BundleType;

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
<li> LOCAL_BASIC：本地硬盘</li><li> LOCAL_SSD：本地 SSD 硬盘</li><li> CLOUD_BASIC：普通云硬盘</li><li> CLOUD_SSD：SSD 云硬盘</li><li> CLOUD_PREMIUM：高性能云硬盘</li> 
     * @return SystemDiskType 系统盘类型。
取值范围： 
<li> LOCAL_BASIC：本地硬盘</li><li> LOCAL_SSD：本地 SSD 硬盘</li><li> CLOUD_BASIC：普通云硬盘</li><li> CLOUD_SSD：SSD 云硬盘</li><li> CLOUD_PREMIUM：高性能云硬盘</li>
     */
    public String getSystemDiskType() {
        return this.SystemDiskType;
    }

    /**
     * Set 系统盘类型。
取值范围： 
<li> LOCAL_BASIC：本地硬盘</li><li> LOCAL_SSD：本地 SSD 硬盘</li><li> CLOUD_BASIC：普通云硬盘</li><li> CLOUD_SSD：SSD 云硬盘</li><li> CLOUD_PREMIUM：高性能云硬盘</li>
     * @param SystemDiskType 系统盘类型。
取值范围： 
<li> LOCAL_BASIC：本地硬盘</li><li> LOCAL_SSD：本地 SSD 硬盘</li><li> CLOUD_BASIC：普通云硬盘</li><li> CLOUD_SSD：SSD 云硬盘</li><li> CLOUD_PREMIUM：高性能云硬盘</li>
     */
    public void setSystemDiskType(String SystemDiskType) {
        this.SystemDiskType = SystemDiskType;
    }

    /**
     * Get 系统盘大小。 
     * @return SystemDiskSize 系统盘大小。
     */
    public Long getSystemDiskSize() {
        return this.SystemDiskSize;
    }

    /**
     * Set 系统盘大小。
     * @param SystemDiskSize 系统盘大小。
     */
    public void setSystemDiskSize(Long SystemDiskSize) {
        this.SystemDiskSize = SystemDiskSize;
    }

    /**
     * Get 每月网络流量，单位 Gb。 
     * @return MonthlyTraffic 每月网络流量，单位 Gb。
     */
    public Long getMonthlyTraffic() {
        return this.MonthlyTraffic;
    }

    /**
     * Set 每月网络流量，单位 Gb。
     * @param MonthlyTraffic 每月网络流量，单位 Gb。
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
<li> GENERAL_BUNDLE：通用型</li><li> STORAGE_BUNDLE：存储型 </li> 
     * @return BundleType 套餐类型。
取值范围：
<li> GENERAL_BUNDLE：通用型</li><li> STORAGE_BUNDLE：存储型 </li>
     */
    public String getBundleType() {
        return this.BundleType;
    }

    /**
     * Set 套餐类型。
取值范围：
<li> GENERAL_BUNDLE：通用型</li><li> STORAGE_BUNDLE：存储型 </li>
     * @param BundleType 套餐类型。
取值范围：
<li> GENERAL_BUNDLE：通用型</li><li> STORAGE_BUNDLE：存储型 </li>
     */
    public void setBundleType(String BundleType) {
        this.BundleType = BundleType;
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

    }
}

