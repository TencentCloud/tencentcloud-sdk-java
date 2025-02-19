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

public class GetActiveDeviceCountResponse extends AbstractModel {

    /**
    * 激活设备统计
    */
    @SerializedName("ActiveDeviceList")
    @Expose
    private ActiveDeviceList [] ActiveDeviceList;

    /**
    * 查询粒度，0:day, 1:week, 2:month, 不传默认为day
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 设备组
    */
    @SerializedName("DevGroup")
    @Expose
    private String DevGroup;

    /**
    * license类型, 不传查询全部, 1: 租户月付，2：厂商月付，3：永久授权
    */
    @SerializedName("LicenseType")
    @Expose
    private String LicenseType;

    /**
    * 租户ID
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
     * Get 激活设备统计 
     * @return ActiveDeviceList 激活设备统计
     */
    public ActiveDeviceList [] getActiveDeviceList() {
        return this.ActiveDeviceList;
    }

    /**
     * Set 激活设备统计
     * @param ActiveDeviceList 激活设备统计
     */
    public void setActiveDeviceList(ActiveDeviceList [] ActiveDeviceList) {
        this.ActiveDeviceList = ActiveDeviceList;
    }

    /**
     * Get 查询粒度，0:day, 1:week, 2:month, 不传默认为day 
     * @return Period 查询粒度，0:day, 1:week, 2:month, 不传默认为day
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 查询粒度，0:day, 1:week, 2:month, 不传默认为day
     * @param Period 查询粒度，0:day, 1:week, 2:month, 不传默认为day
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 设备组 
     * @return DevGroup 设备组
     */
    public String getDevGroup() {
        return this.DevGroup;
    }

    /**
     * Set 设备组
     * @param DevGroup 设备组
     */
    public void setDevGroup(String DevGroup) {
        this.DevGroup = DevGroup;
    }

    /**
     * Get license类型, 不传查询全部, 1: 租户月付，2：厂商月付，3：永久授权 
     * @return LicenseType license类型, 不传查询全部, 1: 租户月付，2：厂商月付，3：永久授权
     */
    public String getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set license类型, 不传查询全部, 1: 租户月付，2：厂商月付，3：永久授权
     * @param LicenseType license类型, 不传查询全部, 1: 租户月付，2：厂商月付，3：永久授权
     */
    public void setLicenseType(String LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get 租户ID 
     * @return AppId 租户ID
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 租户ID
     * @param AppId 租户ID
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

