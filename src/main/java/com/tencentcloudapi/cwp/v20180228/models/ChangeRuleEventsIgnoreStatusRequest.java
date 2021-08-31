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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChangeRuleEventsIgnoreStatusRequest extends AbstractModel{

    /**
    * 忽略状态 0:取消忽略 ； 1:忽略
    */
    @SerializedName("IgnoreStatus")
    @Expose
    private Long IgnoreStatus;

    /**
    * 检测项id数组
    */
    @SerializedName("RuleIdList")
    @Expose
    private Long [] RuleIdList;

    /**
    * 事件id数组
    */
    @SerializedName("EventIdList")
    @Expose
    private Long [] EventIdList;

    /**
     * Get 忽略状态 0:取消忽略 ； 1:忽略 
     * @return IgnoreStatus 忽略状态 0:取消忽略 ； 1:忽略
     */
    public Long getIgnoreStatus() {
        return this.IgnoreStatus;
    }

    /**
     * Set 忽略状态 0:取消忽略 ； 1:忽略
     * @param IgnoreStatus 忽略状态 0:取消忽略 ； 1:忽略
     */
    public void setIgnoreStatus(Long IgnoreStatus) {
        this.IgnoreStatus = IgnoreStatus;
    }

    /**
     * Get 检测项id数组 
     * @return RuleIdList 检测项id数组
     */
    public Long [] getRuleIdList() {
        return this.RuleIdList;
    }

    /**
     * Set 检测项id数组
     * @param RuleIdList 检测项id数组
     */
    public void setRuleIdList(Long [] RuleIdList) {
        this.RuleIdList = RuleIdList;
    }

    /**
     * Get 事件id数组 
     * @return EventIdList 事件id数组
     */
    public Long [] getEventIdList() {
        return this.EventIdList;
    }

    /**
     * Set 事件id数组
     * @param EventIdList 事件id数组
     */
    public void setEventIdList(Long [] EventIdList) {
        this.EventIdList = EventIdList;
    }

    public ChangeRuleEventsIgnoreStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChangeRuleEventsIgnoreStatusRequest(ChangeRuleEventsIgnoreStatusRequest source) {
        if (source.IgnoreStatus != null) {
            this.IgnoreStatus = new Long(source.IgnoreStatus);
        }
        if (source.RuleIdList != null) {
            this.RuleIdList = new Long[source.RuleIdList.length];
            for (int i = 0; i < source.RuleIdList.length; i++) {
                this.RuleIdList[i] = new Long(source.RuleIdList[i]);
            }
        }
        if (source.EventIdList != null) {
            this.EventIdList = new Long[source.EventIdList.length];
            for (int i = 0; i < source.EventIdList.length; i++) {
                this.EventIdList[i] = new Long(source.EventIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IgnoreStatus", this.IgnoreStatus);
        this.setParamArraySimple(map, prefix + "RuleIdList.", this.RuleIdList);
        this.setParamArraySimple(map, prefix + "EventIdList.", this.EventIdList);

    }
}

