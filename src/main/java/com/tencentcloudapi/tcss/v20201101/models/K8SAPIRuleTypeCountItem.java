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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class K8SAPIRuleTypeCountItem extends AbstractModel {

    /**
    * <p>规则类型</p><p>枚举值：</p><ul><li>ABNORMAL_CREATE_POD： 可疑容器创建</li></ul>
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * <p>规则对应告警数量</p>
    */
    @SerializedName("EventCount")
    @Expose
    private Long EventCount;

    /**
     * Get <p>规则类型</p><p>枚举值：</p><ul><li>ABNORMAL_CREATE_POD： 可疑容器创建</li></ul> 
     * @return RuleType <p>规则类型</p><p>枚举值：</p><ul><li>ABNORMAL_CREATE_POD： 可疑容器创建</li></ul>
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set <p>规则类型</p><p>枚举值：</p><ul><li>ABNORMAL_CREATE_POD： 可疑容器创建</li></ul>
     * @param RuleType <p>规则类型</p><p>枚举值：</p><ul><li>ABNORMAL_CREATE_POD： 可疑容器创建</li></ul>
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get <p>规则对应告警数量</p> 
     * @return EventCount <p>规则对应告警数量</p>
     */
    public Long getEventCount() {
        return this.EventCount;
    }

    /**
     * Set <p>规则对应告警数量</p>
     * @param EventCount <p>规则对应告警数量</p>
     */
    public void setEventCount(Long EventCount) {
        this.EventCount = EventCount;
    }

    public K8SAPIRuleTypeCountItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public K8SAPIRuleTypeCountItem(K8SAPIRuleTypeCountItem source) {
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.EventCount != null) {
            this.EventCount = new Long(source.EventCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "EventCount", this.EventCount);

    }
}

