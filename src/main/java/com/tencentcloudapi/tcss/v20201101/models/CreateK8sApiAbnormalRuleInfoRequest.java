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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateK8sApiAbnormalRuleInfoRequest extends AbstractModel{

    /**
    * 规则详情
    */
    @SerializedName("RuleInfo")
    @Expose
    private K8sApiAbnormalRuleInfo RuleInfo;

    /**
    * 拷贝规则ID(适用于复制规则场景)
    */
    @SerializedName("CopySrcRuleID")
    @Expose
    private String CopySrcRuleID;

    /**
    * 事件ID(适用于事件加白场景)
    */
    @SerializedName("EventID")
    @Expose
    private Long EventID;

    /**
     * Get 规则详情 
     * @return RuleInfo 规则详情
     */
    public K8sApiAbnormalRuleInfo getRuleInfo() {
        return this.RuleInfo;
    }

    /**
     * Set 规则详情
     * @param RuleInfo 规则详情
     */
    public void setRuleInfo(K8sApiAbnormalRuleInfo RuleInfo) {
        this.RuleInfo = RuleInfo;
    }

    /**
     * Get 拷贝规则ID(适用于复制规则场景) 
     * @return CopySrcRuleID 拷贝规则ID(适用于复制规则场景)
     */
    public String getCopySrcRuleID() {
        return this.CopySrcRuleID;
    }

    /**
     * Set 拷贝规则ID(适用于复制规则场景)
     * @param CopySrcRuleID 拷贝规则ID(适用于复制规则场景)
     */
    public void setCopySrcRuleID(String CopySrcRuleID) {
        this.CopySrcRuleID = CopySrcRuleID;
    }

    /**
     * Get 事件ID(适用于事件加白场景) 
     * @return EventID 事件ID(适用于事件加白场景)
     */
    public Long getEventID() {
        return this.EventID;
    }

    /**
     * Set 事件ID(适用于事件加白场景)
     * @param EventID 事件ID(适用于事件加白场景)
     */
    public void setEventID(Long EventID) {
        this.EventID = EventID;
    }

    public CreateK8sApiAbnormalRuleInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateK8sApiAbnormalRuleInfoRequest(CreateK8sApiAbnormalRuleInfoRequest source) {
        if (source.RuleInfo != null) {
            this.RuleInfo = new K8sApiAbnormalRuleInfo(source.RuleInfo);
        }
        if (source.CopySrcRuleID != null) {
            this.CopySrcRuleID = new String(source.CopySrcRuleID);
        }
        if (source.EventID != null) {
            this.EventID = new Long(source.EventID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "RuleInfo.", this.RuleInfo);
        this.setParamSimple(map, prefix + "CopySrcRuleID", this.CopySrcRuleID);
        this.setParamSimple(map, prefix + "EventID", this.EventID);

    }
}

