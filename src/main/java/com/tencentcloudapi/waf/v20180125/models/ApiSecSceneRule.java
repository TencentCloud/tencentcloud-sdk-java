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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApiSecSceneRule extends AbstractModel {

    /**
    * 场景名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 开关状态，1表示开，0表示关
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 更新时间，10位时间戳
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 规则列表
    */
    @SerializedName("RuleList")
    @Expose
    private ApiSecSceneRuleEntry [] RuleList;

    /**
    * 规则来源，系统内置:OS
客户自定义：custom
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
     * Get 场景名称 
     * @return RuleName 场景名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 场景名称
     * @param RuleName 场景名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 开关状态，1表示开，0表示关 
     * @return Status 开关状态，1表示开，0表示关
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 开关状态，1表示开，0表示关
     * @param Status 开关状态，1表示开，0表示关
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 更新时间，10位时间戳 
     * @return UpdateTime 更新时间，10位时间戳
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间，10位时间戳
     * @param UpdateTime 更新时间，10位时间戳
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 规则列表 
     * @return RuleList 规则列表
     */
    public ApiSecSceneRuleEntry [] getRuleList() {
        return this.RuleList;
    }

    /**
     * Set 规则列表
     * @param RuleList 规则列表
     */
    public void setRuleList(ApiSecSceneRuleEntry [] RuleList) {
        this.RuleList = RuleList;
    }

    /**
     * Get 规则来源，系统内置:OS
客户自定义：custom 
     * @return Source 规则来源，系统内置:OS
客户自定义：custom
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 规则来源，系统内置:OS
客户自定义：custom
     * @param Source 规则来源，系统内置:OS
客户自定义：custom
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    public ApiSecSceneRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiSecSceneRule(ApiSecSceneRule source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.RuleList != null) {
            this.RuleList = new ApiSecSceneRuleEntry[source.RuleList.length];
            for (int i = 0; i < source.RuleList.length; i++) {
                this.RuleList[i] = new ApiSecSceneRuleEntry(source.RuleList[i]);
            }
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArrayObj(map, prefix + "RuleList.", this.RuleList);
        this.setParamSimple(map, prefix + "Source", this.Source);

    }
}

