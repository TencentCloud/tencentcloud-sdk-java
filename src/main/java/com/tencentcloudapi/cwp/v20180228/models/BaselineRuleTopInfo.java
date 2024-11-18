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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselineRuleTopInfo extends AbstractModel {

    /**
    * 基线检测项名
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 检测项危害等级
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 事件总数
    */
    @SerializedName("EventCount")
    @Expose
    private Long EventCount;

    /**
    * 检测项id
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
     * Get 基线检测项名 
     * @return RuleName 基线检测项名
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 基线检测项名
     * @param RuleName 基线检测项名
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 检测项危害等级 
     * @return Level 检测项危害等级
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 检测项危害等级
     * @param Level 检测项危害等级
     */
    public void setLevel(Long Level) {
        this.Level = Level;
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
     * Get 检测项id 
     * @return RuleId 检测项id
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 检测项id
     * @param RuleId 检测项id
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    public BaselineRuleTopInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineRuleTopInfo(BaselineRuleTopInfo source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.EventCount != null) {
            this.EventCount = new Long(source.EventCount);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "EventCount", this.EventCount);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);

    }
}

