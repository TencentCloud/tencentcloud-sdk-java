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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Device extends AbstractModel {

    /**
    * 设备ID
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 已经绑定license数量
    */
    @SerializedName("LicenseCount")
    @Expose
    private Long LicenseCount;

    /**
    * 剩余天数：天
    */
    @SerializedName("RemainDay")
    @Expose
    private Long RemainDay;

    /**
    * 过期时间：s
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 服务时长：s
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
    * 已经绑定licenseId列表
    */
    @SerializedName("LicenseIds")
    @Expose
    private String [] LicenseIds;

    /**
    * 每月license的限定时长
    */
    @SerializedName("MonthlyRemainTime")
    @Expose
    private Long MonthlyRemainTime;

    /**
    * 月封顶时长（分钟)
    */
    @SerializedName("LimitedTime")
    @Expose
    private Long LimitedTime;

    /**
     * Get 设备ID 
     * @return DeviceId 设备ID
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备ID
     * @param DeviceId 设备ID
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 设备名称 
     * @return DeviceName 设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称
     * @param DeviceName 设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 已经绑定license数量 
     * @return LicenseCount 已经绑定license数量
     */
    public Long getLicenseCount() {
        return this.LicenseCount;
    }

    /**
     * Set 已经绑定license数量
     * @param LicenseCount 已经绑定license数量
     */
    public void setLicenseCount(Long LicenseCount) {
        this.LicenseCount = LicenseCount;
    }

    /**
     * Get 剩余天数：天 
     * @return RemainDay 剩余天数：天
     */
    public Long getRemainDay() {
        return this.RemainDay;
    }

    /**
     * Set 剩余天数：天
     * @param RemainDay 剩余天数：天
     */
    public void setRemainDay(Long RemainDay) {
        this.RemainDay = RemainDay;
    }

    /**
     * Get 过期时间：s 
     * @return ExpireTime 过期时间：s
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间：s
     * @param ExpireTime 过期时间：s
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 服务时长：s 
     * @return Duration 服务时长：s
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set 服务时长：s
     * @param Duration 服务时长：s
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 已经绑定licenseId列表 
     * @return LicenseIds 已经绑定licenseId列表
     */
    public String [] getLicenseIds() {
        return this.LicenseIds;
    }

    /**
     * Set 已经绑定licenseId列表
     * @param LicenseIds 已经绑定licenseId列表
     */
    public void setLicenseIds(String [] LicenseIds) {
        this.LicenseIds = LicenseIds;
    }

    /**
     * Get 每月license的限定时长 
     * @return MonthlyRemainTime 每月license的限定时长
     */
    public Long getMonthlyRemainTime() {
        return this.MonthlyRemainTime;
    }

    /**
     * Set 每月license的限定时长
     * @param MonthlyRemainTime 每月license的限定时长
     */
    public void setMonthlyRemainTime(Long MonthlyRemainTime) {
        this.MonthlyRemainTime = MonthlyRemainTime;
    }

    /**
     * Get 月封顶时长（分钟) 
     * @return LimitedTime 月封顶时长（分钟)
     */
    public Long getLimitedTime() {
        return this.LimitedTime;
    }

    /**
     * Set 月封顶时长（分钟)
     * @param LimitedTime 月封顶时长（分钟)
     */
    public void setLimitedTime(Long LimitedTime) {
        this.LimitedTime = LimitedTime;
    }

    public Device() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Device(Device source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.LicenseCount != null) {
            this.LicenseCount = new Long(source.LicenseCount);
        }
        if (source.RemainDay != null) {
            this.RemainDay = new Long(source.RemainDay);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.Duration != null) {
            this.Duration = new String(source.Duration);
        }
        if (source.LicenseIds != null) {
            this.LicenseIds = new String[source.LicenseIds.length];
            for (int i = 0; i < source.LicenseIds.length; i++) {
                this.LicenseIds[i] = new String(source.LicenseIds[i]);
            }
        }
        if (source.MonthlyRemainTime != null) {
            this.MonthlyRemainTime = new Long(source.MonthlyRemainTime);
        }
        if (source.LimitedTime != null) {
            this.LimitedTime = new Long(source.LimitedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "LicenseCount", this.LicenseCount);
        this.setParamSimple(map, prefix + "RemainDay", this.RemainDay);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamArraySimple(map, prefix + "LicenseIds.", this.LicenseIds);
        this.setParamSimple(map, prefix + "MonthlyRemainTime", this.MonthlyRemainTime);
        this.setParamSimple(map, prefix + "LimitedTime", this.LimitedTime);

    }
}

