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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetDeviceSumStatisticsResponse extends AbstractModel {

    /**
    * 激活设备总数
    */
    @SerializedName("ActivationCount")
    @Expose
    private Long ActivationCount;

    /**
    * 在线设备总数
    */
    @SerializedName("OnlineCount")
    @Expose
    private Long OnlineCount;

    /**
    * 前一天激活设备数
    */
    @SerializedName("ActivationBeforeDay")
    @Expose
    private Long ActivationBeforeDay;

    /**
    * 前一天活跃设备数
    */
    @SerializedName("ActiveBeforeDay")
    @Expose
    private Long ActiveBeforeDay;

    /**
    * 前一周激活设备数
    */
    @SerializedName("ActivationWeekDayCount")
    @Expose
    private Long ActivationWeekDayCount;

    /**
    * 前一周活跃设备数
    */
    @SerializedName("ActiveWeekDayCount")
    @Expose
    private Long ActiveWeekDayCount;

    /**
    * 上一周激活设备数
    */
    @SerializedName("ActivationBeforeWeekDayCount")
    @Expose
    private Long ActivationBeforeWeekDayCount;

    /**
    * 上一周活跃设备数
    */
    @SerializedName("ActiveBeforeWeekDayCount")
    @Expose
    private Long ActiveBeforeWeekDayCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 激活设备总数 
     * @return ActivationCount 激活设备总数
     */
    public Long getActivationCount() {
        return this.ActivationCount;
    }

    /**
     * Set 激活设备总数
     * @param ActivationCount 激活设备总数
     */
    public void setActivationCount(Long ActivationCount) {
        this.ActivationCount = ActivationCount;
    }

    /**
     * Get 在线设备总数 
     * @return OnlineCount 在线设备总数
     */
    public Long getOnlineCount() {
        return this.OnlineCount;
    }

    /**
     * Set 在线设备总数
     * @param OnlineCount 在线设备总数
     */
    public void setOnlineCount(Long OnlineCount) {
        this.OnlineCount = OnlineCount;
    }

    /**
     * Get 前一天激活设备数 
     * @return ActivationBeforeDay 前一天激活设备数
     */
    public Long getActivationBeforeDay() {
        return this.ActivationBeforeDay;
    }

    /**
     * Set 前一天激活设备数
     * @param ActivationBeforeDay 前一天激活设备数
     */
    public void setActivationBeforeDay(Long ActivationBeforeDay) {
        this.ActivationBeforeDay = ActivationBeforeDay;
    }

    /**
     * Get 前一天活跃设备数 
     * @return ActiveBeforeDay 前一天活跃设备数
     */
    public Long getActiveBeforeDay() {
        return this.ActiveBeforeDay;
    }

    /**
     * Set 前一天活跃设备数
     * @param ActiveBeforeDay 前一天活跃设备数
     */
    public void setActiveBeforeDay(Long ActiveBeforeDay) {
        this.ActiveBeforeDay = ActiveBeforeDay;
    }

    /**
     * Get 前一周激活设备数 
     * @return ActivationWeekDayCount 前一周激活设备数
     */
    public Long getActivationWeekDayCount() {
        return this.ActivationWeekDayCount;
    }

    /**
     * Set 前一周激活设备数
     * @param ActivationWeekDayCount 前一周激活设备数
     */
    public void setActivationWeekDayCount(Long ActivationWeekDayCount) {
        this.ActivationWeekDayCount = ActivationWeekDayCount;
    }

    /**
     * Get 前一周活跃设备数 
     * @return ActiveWeekDayCount 前一周活跃设备数
     */
    public Long getActiveWeekDayCount() {
        return this.ActiveWeekDayCount;
    }

    /**
     * Set 前一周活跃设备数
     * @param ActiveWeekDayCount 前一周活跃设备数
     */
    public void setActiveWeekDayCount(Long ActiveWeekDayCount) {
        this.ActiveWeekDayCount = ActiveWeekDayCount;
    }

    /**
     * Get 上一周激活设备数 
     * @return ActivationBeforeWeekDayCount 上一周激活设备数
     */
    public Long getActivationBeforeWeekDayCount() {
        return this.ActivationBeforeWeekDayCount;
    }

    /**
     * Set 上一周激活设备数
     * @param ActivationBeforeWeekDayCount 上一周激活设备数
     */
    public void setActivationBeforeWeekDayCount(Long ActivationBeforeWeekDayCount) {
        this.ActivationBeforeWeekDayCount = ActivationBeforeWeekDayCount;
    }

    /**
     * Get 上一周活跃设备数 
     * @return ActiveBeforeWeekDayCount 上一周活跃设备数
     */
    public Long getActiveBeforeWeekDayCount() {
        return this.ActiveBeforeWeekDayCount;
    }

    /**
     * Set 上一周活跃设备数
     * @param ActiveBeforeWeekDayCount 上一周活跃设备数
     */
    public void setActiveBeforeWeekDayCount(Long ActiveBeforeWeekDayCount) {
        this.ActiveBeforeWeekDayCount = ActiveBeforeWeekDayCount;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetDeviceSumStatisticsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetDeviceSumStatisticsResponse(GetDeviceSumStatisticsResponse source) {
        if (source.ActivationCount != null) {
            this.ActivationCount = new Long(source.ActivationCount);
        }
        if (source.OnlineCount != null) {
            this.OnlineCount = new Long(source.OnlineCount);
        }
        if (source.ActivationBeforeDay != null) {
            this.ActivationBeforeDay = new Long(source.ActivationBeforeDay);
        }
        if (source.ActiveBeforeDay != null) {
            this.ActiveBeforeDay = new Long(source.ActiveBeforeDay);
        }
        if (source.ActivationWeekDayCount != null) {
            this.ActivationWeekDayCount = new Long(source.ActivationWeekDayCount);
        }
        if (source.ActiveWeekDayCount != null) {
            this.ActiveWeekDayCount = new Long(source.ActiveWeekDayCount);
        }
        if (source.ActivationBeforeWeekDayCount != null) {
            this.ActivationBeforeWeekDayCount = new Long(source.ActivationBeforeWeekDayCount);
        }
        if (source.ActiveBeforeWeekDayCount != null) {
            this.ActiveBeforeWeekDayCount = new Long(source.ActiveBeforeWeekDayCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActivationCount", this.ActivationCount);
        this.setParamSimple(map, prefix + "OnlineCount", this.OnlineCount);
        this.setParamSimple(map, prefix + "ActivationBeforeDay", this.ActivationBeforeDay);
        this.setParamSimple(map, prefix + "ActiveBeforeDay", this.ActiveBeforeDay);
        this.setParamSimple(map, prefix + "ActivationWeekDayCount", this.ActivationWeekDayCount);
        this.setParamSimple(map, prefix + "ActiveWeekDayCount", this.ActiveWeekDayCount);
        this.setParamSimple(map, prefix + "ActivationBeforeWeekDayCount", this.ActivationBeforeWeekDayCount);
        this.setParamSimple(map, prefix + "ActiveBeforeWeekDayCount", this.ActiveBeforeWeekDayCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

