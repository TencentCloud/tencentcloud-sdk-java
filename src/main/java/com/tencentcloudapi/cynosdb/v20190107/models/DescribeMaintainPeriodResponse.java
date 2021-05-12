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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMaintainPeriodResponse extends AbstractModel{

    /**
    * 维护week days
    */
    @SerializedName("MaintainWeekDays")
    @Expose
    private String [] MaintainWeekDays;

    /**
    * 维护开始时间，单位秒
    */
    @SerializedName("MaintainStartTime")
    @Expose
    private Long MaintainStartTime;

    /**
    * 维护时长，单位秒
    */
    @SerializedName("MaintainDuration")
    @Expose
    private Long MaintainDuration;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 维护week days 
     * @return MaintainWeekDays 维护week days
     */
    public String [] getMaintainWeekDays() {
        return this.MaintainWeekDays;
    }

    /**
     * Set 维护week days
     * @param MaintainWeekDays 维护week days
     */
    public void setMaintainWeekDays(String [] MaintainWeekDays) {
        this.MaintainWeekDays = MaintainWeekDays;
    }

    /**
     * Get 维护开始时间，单位秒 
     * @return MaintainStartTime 维护开始时间，单位秒
     */
    public Long getMaintainStartTime() {
        return this.MaintainStartTime;
    }

    /**
     * Set 维护开始时间，单位秒
     * @param MaintainStartTime 维护开始时间，单位秒
     */
    public void setMaintainStartTime(Long MaintainStartTime) {
        this.MaintainStartTime = MaintainStartTime;
    }

    /**
     * Get 维护时长，单位秒 
     * @return MaintainDuration 维护时长，单位秒
     */
    public Long getMaintainDuration() {
        return this.MaintainDuration;
    }

    /**
     * Set 维护时长，单位秒
     * @param MaintainDuration 维护时长，单位秒
     */
    public void setMaintainDuration(Long MaintainDuration) {
        this.MaintainDuration = MaintainDuration;
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

    public DescribeMaintainPeriodResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMaintainPeriodResponse(DescribeMaintainPeriodResponse source) {
        if (source.MaintainWeekDays != null) {
            this.MaintainWeekDays = new String[source.MaintainWeekDays.length];
            for (int i = 0; i < source.MaintainWeekDays.length; i++) {
                this.MaintainWeekDays[i] = new String(source.MaintainWeekDays[i]);
            }
        }
        if (source.MaintainStartTime != null) {
            this.MaintainStartTime = new Long(source.MaintainStartTime);
        }
        if (source.MaintainDuration != null) {
            this.MaintainDuration = new Long(source.MaintainDuration);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MaintainWeekDays.", this.MaintainWeekDays);
        this.setParamSimple(map, prefix + "MaintainStartTime", this.MaintainStartTime);
        this.setParamSimple(map, prefix + "MaintainDuration", this.MaintainDuration);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

