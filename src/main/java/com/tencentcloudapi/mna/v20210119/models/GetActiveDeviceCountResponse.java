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

public class GetActiveDeviceCountResponse extends AbstractModel {

    /**
    * <p>激活设备统计</p>
    */
    @SerializedName("ActiveDeviceList")
    @Expose
    private ActiveDeviceList [] ActiveDeviceList;

    /**
    * <p>查询粒度，0:day, 1:week, 2:month, 不传默认为day</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>设备组</p>
    */
    @SerializedName("DevGroup")
    @Expose
    private String DevGroup;

    /**
    * <p>license类型, 不传查询全部, 1: 租户月付，2：厂商月付，3：永久授权</p>
    */
    @SerializedName("LicenseType")
    @Expose
    private String LicenseType;

    /**
    * <p>租户ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>激活设备统计</p> 
     * @return ActiveDeviceList <p>激活设备统计</p>
     */
    public ActiveDeviceList [] getActiveDeviceList() {
        return this.ActiveDeviceList;
    }

    /**
     * Set <p>激活设备统计</p>
     * @param ActiveDeviceList <p>激活设备统计</p>
     */
    public void setActiveDeviceList(ActiveDeviceList [] ActiveDeviceList) {
        this.ActiveDeviceList = ActiveDeviceList;
    }

    /**
     * Get <p>查询粒度，0:day, 1:week, 2:month, 不传默认为day</p> 
     * @return Period <p>查询粒度，0:day, 1:week, 2:month, 不传默认为day</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>查询粒度，0:day, 1:week, 2:month, 不传默认为day</p>
     * @param Period <p>查询粒度，0:day, 1:week, 2:month, 不传默认为day</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>开始时间</p> 
     * @return StartTime <p>开始时间</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间</p>
     * @param StartTime <p>开始时间</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间</p> 
     * @return EndTime <p>结束时间</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间</p>
     * @param EndTime <p>结束时间</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>设备组</p> 
     * @return DevGroup <p>设备组</p>
     */
    public String getDevGroup() {
        return this.DevGroup;
    }

    /**
     * Set <p>设备组</p>
     * @param DevGroup <p>设备组</p>
     */
    public void setDevGroup(String DevGroup) {
        this.DevGroup = DevGroup;
    }

    /**
     * Get <p>license类型, 不传查询全部, 1: 租户月付，2：厂商月付，3：永久授权</p> 
     * @return LicenseType <p>license类型, 不传查询全部, 1: 租户月付，2：厂商月付，3：永久授权</p>
     */
    public String getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set <p>license类型, 不传查询全部, 1: 租户月付，2：厂商月付，3：永久授权</p>
     * @param LicenseType <p>license类型, 不传查询全部, 1: 租户月付，2：厂商月付，3：永久授权</p>
     */
    public void setLicenseType(String LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get <p>租户ID</p> 
     * @return AppId <p>租户ID</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>租户ID</p>
     * @param AppId <p>租户ID</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetActiveDeviceCountResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetActiveDeviceCountResponse(GetActiveDeviceCountResponse source) {
        if (source.ActiveDeviceList != null) {
            this.ActiveDeviceList = new ActiveDeviceList[source.ActiveDeviceList.length];
            for (int i = 0; i < source.ActiveDeviceList.length; i++) {
                this.ActiveDeviceList[i] = new ActiveDeviceList(source.ActiveDeviceList[i]);
            }
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.DevGroup != null) {
            this.DevGroup = new String(source.DevGroup);
        }
        if (source.LicenseType != null) {
            this.LicenseType = new String(source.LicenseType);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ActiveDeviceList.", this.ActiveDeviceList);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "DevGroup", this.DevGroup);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

