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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HealthScoreInfo extends AbstractModel{

    /**
    * 异常详情。
    */
    @SerializedName("IssueTypes")
    @Expose
    private IssueTypeInfo [] IssueTypes;

    /**
    * 异常事件总数。
    */
    @SerializedName("EventsTotalCount")
    @Expose
    private Long EventsTotalCount;

    /**
    * 健康得分。
    */
    @SerializedName("HealthScore")
    @Expose
    private Long HealthScore;

    /**
    * 健康等级, 如："HEALTH", "SUB_HEALTH", "RISK", "HIGH_RISK"。
    */
    @SerializedName("HealthLevel")
    @Expose
    private String HealthLevel;

    /**
     * Get 异常详情。 
     * @return IssueTypes 异常详情。
     */
    public IssueTypeInfo [] getIssueTypes() {
        return this.IssueTypes;
    }

    /**
     * Set 异常详情。
     * @param IssueTypes 异常详情。
     */
    public void setIssueTypes(IssueTypeInfo [] IssueTypes) {
        this.IssueTypes = IssueTypes;
    }

    /**
     * Get 异常事件总数。 
     * @return EventsTotalCount 异常事件总数。
     */
    public Long getEventsTotalCount() {
        return this.EventsTotalCount;
    }

    /**
     * Set 异常事件总数。
     * @param EventsTotalCount 异常事件总数。
     */
    public void setEventsTotalCount(Long EventsTotalCount) {
        this.EventsTotalCount = EventsTotalCount;
    }

    /**
     * Get 健康得分。 
     * @return HealthScore 健康得分。
     */
    public Long getHealthScore() {
        return this.HealthScore;
    }

    /**
     * Set 健康得分。
     * @param HealthScore 健康得分。
     */
    public void setHealthScore(Long HealthScore) {
        this.HealthScore = HealthScore;
    }

    /**
     * Get 健康等级, 如："HEALTH", "SUB_HEALTH", "RISK", "HIGH_RISK"。 
     * @return HealthLevel 健康等级, 如："HEALTH", "SUB_HEALTH", "RISK", "HIGH_RISK"。
     */
    public String getHealthLevel() {
        return this.HealthLevel;
    }

    /**
     * Set 健康等级, 如："HEALTH", "SUB_HEALTH", "RISK", "HIGH_RISK"。
     * @param HealthLevel 健康等级, 如："HEALTH", "SUB_HEALTH", "RISK", "HIGH_RISK"。
     */
    public void setHealthLevel(String HealthLevel) {
        this.HealthLevel = HealthLevel;
    }

    public HealthScoreInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HealthScoreInfo(HealthScoreInfo source) {
        if (source.IssueTypes != null) {
            this.IssueTypes = new IssueTypeInfo[source.IssueTypes.length];
            for (int i = 0; i < source.IssueTypes.length; i++) {
                this.IssueTypes[i] = new IssueTypeInfo(source.IssueTypes[i]);
            }
        }
        if (source.EventsTotalCount != null) {
            this.EventsTotalCount = new Long(source.EventsTotalCount);
        }
        if (source.HealthScore != null) {
            this.HealthScore = new Long(source.HealthScore);
        }
        if (source.HealthLevel != null) {
            this.HealthLevel = new String(source.HealthLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "IssueTypes.", this.IssueTypes);
        this.setParamSimple(map, prefix + "EventsTotalCount", this.EventsTotalCount);
        this.setParamSimple(map, prefix + "HealthScore", this.HealthScore);
        this.setParamSimple(map, prefix + "HealthLevel", this.HealthLevel);

    }
}

