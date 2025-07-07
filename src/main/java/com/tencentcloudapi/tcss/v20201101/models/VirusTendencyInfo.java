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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VirusTendencyInfo extends AbstractModel {

    /**
    * 日期
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 待处理事件总数
    */
    @SerializedName("PendingEventCount")
    @Expose
    private Long PendingEventCount;

    /**
    * 风险容器总数
    */
    @SerializedName("RiskContainerCount")
    @Expose
    private Long RiskContainerCount;

    /**
    * 事件总数
    */
    @SerializedName("EventCount")
    @Expose
    private Long EventCount;

    /**
    * 隔离事件总数
    */
    @SerializedName("IsolateEventCount")
    @Expose
    private Long IsolateEventCount;

    /**
     * Get 日期 
     * @return Date 日期
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 日期
     * @param Date 日期
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 待处理事件总数 
     * @return PendingEventCount 待处理事件总数
     */
    public Long getPendingEventCount() {
        return this.PendingEventCount;
    }

    /**
     * Set 待处理事件总数
     * @param PendingEventCount 待处理事件总数
     */
    public void setPendingEventCount(Long PendingEventCount) {
        this.PendingEventCount = PendingEventCount;
    }

    /**
     * Get 风险容器总数 
     * @return RiskContainerCount 风险容器总数
     */
    public Long getRiskContainerCount() {
        return this.RiskContainerCount;
    }

    /**
     * Set 风险容器总数
     * @param RiskContainerCount 风险容器总数
     */
    public void setRiskContainerCount(Long RiskContainerCount) {
        this.RiskContainerCount = RiskContainerCount;
    }

    /**
     * Get 事件总数 
     * @return EventCount 事件总数
     */
    public Long getEventCount() {
        return this.EventCount;
    }

    /**
     * Set 事件总数
     * @param EventCount 事件总数
     */
    public void setEventCount(Long EventCount) {
        this.EventCount = EventCount;
    }

    /**
     * Get 隔离事件总数 
     * @return IsolateEventCount 隔离事件总数
     */
    public Long getIsolateEventCount() {
        return this.IsolateEventCount;
    }

    /**
     * Set 隔离事件总数
     * @param IsolateEventCount 隔离事件总数
     */
    public void setIsolateEventCount(Long IsolateEventCount) {
        this.IsolateEventCount = IsolateEventCount;
    }

    public VirusTendencyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VirusTendencyInfo(VirusTendencyInfo source) {
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.PendingEventCount != null) {
            this.PendingEventCount = new Long(source.PendingEventCount);
        }
        if (source.RiskContainerCount != null) {
            this.RiskContainerCount = new Long(source.RiskContainerCount);
        }
        if (source.EventCount != null) {
            this.EventCount = new Long(source.EventCount);
        }
        if (source.IsolateEventCount != null) {
            this.IsolateEventCount = new Long(source.IsolateEventCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "PendingEventCount", this.PendingEventCount);
        this.setParamSimple(map, prefix + "RiskContainerCount", this.RiskContainerCount);
        this.setParamSimple(map, prefix + "EventCount", this.EventCount);
        this.setParamSimple(map, prefix + "IsolateEventCount", this.IsolateEventCount);

    }
}

