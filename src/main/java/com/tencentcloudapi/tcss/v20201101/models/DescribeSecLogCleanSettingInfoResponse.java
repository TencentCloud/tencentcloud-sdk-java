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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecLogCleanSettingInfoResponse extends AbstractModel{

    /**
    * 触发清理的储量底线
    */
    @SerializedName("ReservesLimit")
    @Expose
    private Long ReservesLimit;

    /**
    * 清理停止时的储量截至线
    */
    @SerializedName("ReservesDeadline")
    @Expose
    private Long ReservesDeadline;

    /**
    * 触发清理的存储天数
    */
    @SerializedName("DayLimit")
    @Expose
    private Long DayLimit;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 触发清理的储量底线 
     * @return ReservesLimit 触发清理的储量底线
     */
    public Long getReservesLimit() {
        return this.ReservesLimit;
    }

    /**
     * Set 触发清理的储量底线
     * @param ReservesLimit 触发清理的储量底线
     */
    public void setReservesLimit(Long ReservesLimit) {
        this.ReservesLimit = ReservesLimit;
    }

    /**
     * Get 清理停止时的储量截至线 
     * @return ReservesDeadline 清理停止时的储量截至线
     */
    public Long getReservesDeadline() {
        return this.ReservesDeadline;
    }

    /**
     * Set 清理停止时的储量截至线
     * @param ReservesDeadline 清理停止时的储量截至线
     */
    public void setReservesDeadline(Long ReservesDeadline) {
        this.ReservesDeadline = ReservesDeadline;
    }

    /**
     * Get 触发清理的存储天数 
     * @return DayLimit 触发清理的存储天数
     */
    public Long getDayLimit() {
        return this.DayLimit;
    }

    /**
     * Set 触发清理的存储天数
     * @param DayLimit 触发清理的存储天数
     */
    public void setDayLimit(Long DayLimit) {
        this.DayLimit = DayLimit;
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

    public DescribeSecLogCleanSettingInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecLogCleanSettingInfoResponse(DescribeSecLogCleanSettingInfoResponse source) {
        if (source.ReservesLimit != null) {
            this.ReservesLimit = new Long(source.ReservesLimit);
        }
        if (source.ReservesDeadline != null) {
            this.ReservesDeadline = new Long(source.ReservesDeadline);
        }
        if (source.DayLimit != null) {
            this.DayLimit = new Long(source.DayLimit);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReservesLimit", this.ReservesLimit);
        this.setParamSimple(map, prefix + "ReservesDeadline", this.ReservesDeadline);
        this.setParamSimple(map, prefix + "DayLimit", this.DayLimit);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

