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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetActiveDeviceCountRequest extends AbstractModel {

    /**
    * <p>查询粒度。0:day, 1:week, 2:month, 不传默认为day</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>开始时间。单位秒</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>结束时间。单位秒</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>设备组, 不传查询全部</p>
    */
    @SerializedName("DevGroup")
    @Expose
    private String DevGroup;

    /**
    * <p>应用ID，指控制台上设备管理中的动态设备应用ID，不传查询全部。</p>
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * <p>license类型, 不传查询全部, 1: 租户月付，2：厂商月付，3：永久授权</p>
    */
    @SerializedName("LicenseType")
    @Expose
    private Long LicenseType;

    /**
     * Get <p>查询粒度。0:day, 1:week, 2:month, 不传默认为day</p> 
     * @return Period <p>查询粒度。0:day, 1:week, 2:month, 不传默认为day</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>查询粒度。0:day, 1:week, 2:month, 不传默认为day</p>
     * @param Period <p>查询粒度。0:day, 1:week, 2:month, 不传默认为day</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>开始时间。单位秒</p> 
     * @return StartTime <p>开始时间。单位秒</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间。单位秒</p>
     * @param StartTime <p>开始时间。单位秒</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间。单位秒</p> 
     * @return EndTime <p>结束时间。单位秒</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间。单位秒</p>
     * @param EndTime <p>结束时间。单位秒</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>设备组, 不传查询全部</p> 
     * @return DevGroup <p>设备组, 不传查询全部</p>
     */
    public String getDevGroup() {
        return this.DevGroup;
    }

    /**
     * Set <p>设备组, 不传查询全部</p>
     * @param DevGroup <p>设备组, 不传查询全部</p>
     */
    public void setDevGroup(String DevGroup) {
        this.DevGroup = DevGroup;
    }

    /**
     * Get <p>应用ID，指控制台上设备管理中的动态设备应用ID，不传查询全部。</p> 
     * @return ApplicationId <p>应用ID，指控制台上设备管理中的动态设备应用ID，不传查询全部。</p>
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set <p>应用ID，指控制台上设备管理中的动态设备应用ID，不传查询全部。</p>
     * @param ApplicationId <p>应用ID，指控制台上设备管理中的动态设备应用ID，不传查询全部。</p>
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get <p>license类型, 不传查询全部, 1: 租户月付，2：厂商月付，3：永久授权</p> 
     * @return LicenseType <p>license类型, 不传查询全部, 1: 租户月付，2：厂商月付，3：永久授权</p>
     */
    public Long getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set <p>license类型, 不传查询全部, 1: 租户月付，2：厂商月付，3：永久授权</p>
     * @param LicenseType <p>license类型, 不传查询全部, 1: 租户月付，2：厂商月付，3：永久授权</p>
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
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
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
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);

    }
}

