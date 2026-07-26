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
    * 
    */
    @SerializedName("LastFireTime")
    @Expose
    private String LastFireTime;

    /**
    * 
    */
    @SerializedName("NextFireTime")
    @Expose
    private String NextFireTime;

    /**
    * 
    */
    @SerializedName("PolicySummary")
    @Expose
    private String PolicySummary;

    /**
     * Get  
     * @return LastFireTime 
     */
    public String getLastFireTime() {
        return this.LastFireTime;
    }

    /**
     * Set 
     * @param LastFireTime 
     */
    public void setLastFireTime(String LastFireTime) {
        this.LastFireTime = LastFireTime;
    }

    /**
     * Get  
     * @return NextFireTime 
     */
    public String getNextFireTime() {
        return this.NextFireTime;
    }

    /**
     * Set 
     * @param NextFireTime 
     */
    public void setNextFireTime(String NextFireTime) {
        this.NextFireTime = NextFireTime;
    }

    /**
     * Get  
     * @return PolicySummary 
     */
    public String getPolicySummary() {
        return this.PolicySummary;
    }

    /**
     * Set 
     * @param PolicySummary 
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

