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

public class ApiSecExcludeRule extends AbstractModel {

    /**
    * 规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 匹配类型，regex、prefix、suffix、contain匹配模式
    */
    @SerializedName("MatchType")
    @Expose
    private String MatchType;

    /**
    * 匹配内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 状态开关
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 规则更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get 规则名称 
     * @return RuleName 规则名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称
     * @param RuleName 规则名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 匹配类型，regex、prefix、suffix、contain匹配模式 
     * @return MatchType 匹配类型，regex、prefix、suffix、contain匹配模式
     */
    public String getMatchType() {
        return this.MatchType;
    }

    /**
     * Set 匹配类型，regex、prefix、suffix、contain匹配模式
     * @param MatchType 匹配类型，regex、prefix、suffix、contain匹配模式
     */
    public void setMatchType(String MatchType) {
        this.MatchType = MatchType;
    }

    /**
     * Get 匹配内容 
     * @return Content 匹配内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 匹配内容
     * @param Content 匹配内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 状态开关 
     * @return Status 状态开关
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态开关
     * @param Status 状态开关
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 规则更新时间 
     * @return UpdateTime 规则更新时间
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 规则更新时间
     * @param UpdateTime 规则更新时间
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public ApiSecExcludeRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiSecExcludeRule(ApiSecExcludeRule source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.MatchType != null) {
            this.MatchType = new String(source.MatchType);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "MatchType", this.MatchType);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

