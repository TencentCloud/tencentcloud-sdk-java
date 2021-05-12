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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTimerScalingPoliciesRequest extends AbstractModel{

    /**
    * 扩缩容配置服务器舰队ID
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

    /**
    * 定时器名称
    */
    @SerializedName("TimerName")
    @Expose
    private String TimerName;

    /**
    * 定时器开始时间
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 定时器结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 分页偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 页大小
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 扩缩容配置服务器舰队ID 
     * @return FleetId 扩缩容配置服务器舰队ID
     */
    public String getFleetId() {
        return this.FleetId;
    }

    /**
     * Set 扩缩容配置服务器舰队ID
     * @param FleetId 扩缩容配置服务器舰队ID
     */
    public void setFleetId(String FleetId) {
        this.FleetId = FleetId;
    }

    /**
     * Get 定时器名称 
     * @return TimerName 定时器名称
     */
    public String getTimerName() {
        return this.TimerName;
    }

    /**
     * Set 定时器名称
     * @param TimerName 定时器名称
     */
    public void setTimerName(String TimerName) {
        this.TimerName = TimerName;
    }

    /**
     * Get 定时器开始时间 
     * @return BeginTime 定时器开始时间
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 定时器开始时间
     * @param BeginTime 定时器开始时间
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 定时器结束时间 
     * @return EndTime 定时器结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 定时器结束时间
     * @param EndTime 定时器结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 分页偏移量 
     * @return Offset 分页偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量
     * @param Offset 分页偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 页大小 
     * @return Limit 页大小
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 页大小
     * @param Limit 页大小
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeTimerScalingPoliciesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTimerScalingPoliciesRequest(DescribeTimerScalingPoliciesRequest source) {
        if (source.FleetId != null) {
            this.FleetId = new String(source.FleetId);
        }
        if (source.TimerName != null) {
            this.TimerName = new String(source.TimerName);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FleetId", this.FleetId);
        this.setParamSimple(map, prefix + "TimerName", this.TimerName);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

