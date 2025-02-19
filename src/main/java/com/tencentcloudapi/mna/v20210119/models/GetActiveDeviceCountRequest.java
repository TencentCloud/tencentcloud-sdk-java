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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetActiveDeviceCountRequest extends AbstractModel {

    /**
    * 查询粒度。0:day, 1:week, 2:month, 不传默认为day
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 开始时间。单位秒
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间。单位秒
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 设备组, 不传查询全部
    */
    @SerializedName("DevGroup")
    @Expose
    private String DevGroup;

    /**
    * license类型, 不传查询全部, 1: 租户月付，2：厂商月付，3：永久授权
    */
    @SerializedName("LicenseType")
    @Expose
    private Long LicenseType;

    /**
     * Get 查询粒度。0:day, 1:week, 2:month, 不传默认为day 
     * @return Period 查询粒度。0:day, 1:week, 2:month, 不传默认为day
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 查询粒度。0:day, 1:week, 2:month, 不传默认为day
     * @param Period 查询粒度。0:day, 1:week, 2:month, 不传默认为day
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 开始时间。单位秒 
     * @return StartTime 开始时间。单位秒
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间。单位秒
     * @param StartTime 开始时间。单位秒
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间。单位秒 
     * @return EndTime 结束时间。单位秒
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间。单位秒
     * @param EndTime 结束时间。单位秒
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 设备组, 不传查询全部 
     * @return DevGroup 设备组, 不传查询全部
     */
    public String getDevGroup() {
        return this.DevGroup;
    }

    /**
     * Set 设备组, 不传查询全部
     * @param DevGroup 设备组, 不传查询全部
     */
    public void setDevGroup(String DevGroup) {
        this.DevGroup = DevGroup;
    }

    /**
     * Get license类型, 不传查询全部, 1: 租户月付，2：厂商月付，3：永久授权 
     * @return LicenseType license类型, 不传查询全部, 1: 租户月付，2：厂商月付，3：永久授权
     */
    public Long getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set license类型, 不传查询全部, 1: 租户月付，2：厂商月付，3：永久授权
     * @param LicenseType license类型, 不传查询全部, 1: 租户月付，2：厂商月付，3：永久授权
     */
    public void setLicenseType(Long LicenseType) {
        this.LicenseType = LicenseType;
    }

    public GetActiveDeviceCountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetActiveDeviceCountRequest(GetActiveDeviceCountRequest source) {
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.DevGroup != null) {
            this.DevGroup = new String(source.DevGroup);
        }
        if (source.LicenseType != null) {
            this.LicenseType = new Long(source.LicenseType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "DevGroup", this.DevGroup);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);

    }
}

