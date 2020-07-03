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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRealServerStatisticsRequest extends AbstractModel{

    /**
    * 源站ID
    */
    @SerializedName("RealServerId")
    @Expose
    private String RealServerId;

    /**
    * 监听器ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 统计时长，单位：小时。仅支持最近1,3,6,12,24小时的统计查询
    */
    @SerializedName("WithinTime")
    @Expose
    private Long WithinTime;

    /**
    * 规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
     * Get 源站ID 
     * @return RealServerId 源站ID
     */
    public String getRealServerId() {
        return this.RealServerId;
    }

    /**
     * Set 源站ID
     * @param RealServerId 源站ID
     */
    public void setRealServerId(String RealServerId) {
        this.RealServerId = RealServerId;
    }

    /**
     * Get 监听器ID 
     * @return ListenerId 监听器ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 监听器ID
     * @param ListenerId 监听器ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 统计时长，单位：小时。仅支持最近1,3,6,12,24小时的统计查询 
     * @return WithinTime 统计时长，单位：小时。仅支持最近1,3,6,12,24小时的统计查询
     */
    public Long getWithinTime() {
        return this.WithinTime;
    }

    /**
     * Set 统计时长，单位：小时。仅支持最近1,3,6,12,24小时的统计查询
     * @param WithinTime 统计时长，单位：小时。仅支持最近1,3,6,12,24小时的统计查询
     */
    public void setWithinTime(Long WithinTime) {
        this.WithinTime = WithinTime;
    }

    /**
     * Get 规则ID 
     * @return RuleId 规则ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID
     * @param RuleId 规则ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RealServerId", this.RealServerId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "WithinTime", this.WithinTime);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);

    }
}

