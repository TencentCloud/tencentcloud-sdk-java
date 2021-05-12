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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateApiRateLimitRuleRequest extends AbstractModel{

    /**
    * 限流规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 开启/禁用，enabled/disabled
    */
    @SerializedName("UsableStatus")
    @Expose
    private String UsableStatus;

    /**
    * qps值，开启限流规则时，必填
    */
    @SerializedName("MaxQps")
    @Expose
    private Long MaxQps;

    /**
     * Get 限流规则ID 
     * @return RuleId 限流规则ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 限流规则ID
     * @param RuleId 限流规则ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 开启/禁用，enabled/disabled 
     * @return UsableStatus 开启/禁用，enabled/disabled
     */
    public String getUsableStatus() {
        return this.UsableStatus;
    }

    /**
     * Set 开启/禁用，enabled/disabled
     * @param UsableStatus 开启/禁用，enabled/disabled
     */
    public void setUsableStatus(String UsableStatus) {
        this.UsableStatus = UsableStatus;
    }

    /**
     * Get qps值，开启限流规则时，必填 
     * @return MaxQps qps值，开启限流规则时，必填
     */
    public Long getMaxQps() {
        return this.MaxQps;
    }

    /**
     * Set qps值，开启限流规则时，必填
     * @param MaxQps qps值，开启限流规则时，必填
     */
    public void setMaxQps(Long MaxQps) {
        this.MaxQps = MaxQps;
    }

    public UpdateApiRateLimitRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateApiRateLimitRuleRequest(UpdateApiRateLimitRuleRequest source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.UsableStatus != null) {
            this.UsableStatus = new String(source.UsableStatus);
        }
        if (source.MaxQps != null) {
            this.MaxQps = new Long(source.MaxQps);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "UsableStatus", this.UsableStatus);
        this.setParamSimple(map, prefix + "MaxQps", this.MaxQps);

    }
}

