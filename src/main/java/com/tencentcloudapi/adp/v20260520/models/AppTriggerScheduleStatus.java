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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppTriggerScheduleStatus extends AbstractModel {

    /**
    * <p>最近一次触发时间</p><p>参数格式：格式为YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("LastFireTime")
    @Expose
    private String LastFireTime;

    /**
    * <p>下一次触发时间</p><p>参数格式：格式为YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("NextFireTime")
    @Expose
    private String NextFireTime;

    /**
    * <p>触发方式</p>
    */
    @SerializedName("PolicySummary")
    @Expose
    private String PolicySummary;

    /**
     * Get <p>最近一次触发时间</p><p>参数格式：格式为YYYY-MM-DD hh:mm:ss</p> 
     * @return LastFireTime <p>最近一次触发时间</p><p>参数格式：格式为YYYY-MM-DD hh:mm:ss</p>
     */
    public String getLastFireTime() {
        return this.LastFireTime;
    }

    /**
     * Set <p>最近一次触发时间</p><p>参数格式：格式为YYYY-MM-DD hh:mm:ss</p>
     * @param LastFireTime <p>最近一次触发时间</p><p>参数格式：格式为YYYY-MM-DD hh:mm:ss</p>
     */
    public void setLastFireTime(String LastFireTime) {
        this.LastFireTime = LastFireTime;
    }

    /**
     * Get <p>下一次触发时间</p><p>参数格式：格式为YYYY-MM-DD hh:mm:ss</p> 
     * @return NextFireTime <p>下一次触发时间</p><p>参数格式：格式为YYYY-MM-DD hh:mm:ss</p>
     */
    public String getNextFireTime() {
        return this.NextFireTime;
    }

    /**
     * Set <p>下一次触发时间</p><p>参数格式：格式为YYYY-MM-DD hh:mm:ss</p>
     * @param NextFireTime <p>下一次触发时间</p><p>参数格式：格式为YYYY-MM-DD hh:mm:ss</p>
     */
    public void setNextFireTime(String NextFireTime) {
        this.NextFireTime = NextFireTime;
    }

    /**
     * Get <p>触发方式</p> 
     * @return PolicySummary <p>触发方式</p>
     */
    public String getPolicySummary() {
        return this.PolicySummary;
    }

    /**
     * Set <p>触发方式</p>
     * @param PolicySummary <p>触发方式</p>
     */
    public void setPolicySummary(String PolicySummary) {
        this.PolicySummary = PolicySummary;
    }

    public AppTriggerScheduleStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppTriggerScheduleStatus(AppTriggerScheduleStatus source) {
        if (source.LastFireTime != null) {
            this.LastFireTime = new String(source.LastFireTime);
        }
        if (source.NextFireTime != null) {
            this.NextFireTime = new String(source.NextFireTime);
        }
        if (source.PolicySummary != null) {
            this.PolicySummary = new String(source.PolicySummary);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LastFireTime", this.LastFireTime);
        this.setParamSimple(map, prefix + "NextFireTime", this.NextFireTime);
        this.setParamSimple(map, prefix + "PolicySummary", this.PolicySummary);

    }
}

