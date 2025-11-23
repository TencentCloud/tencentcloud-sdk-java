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

public class EnableLimitRuleItem extends AbstractModel {

    /**
    * 规则ID
    */
    @SerializedName("LimitRuleId")
    @Expose
    private Long LimitRuleId;

    /**
    * 规则开关，0开启，1关闭
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 规则ID 
     * @return LimitRuleId 规则ID
     */
    public Long getLimitRuleId() {
        return this.LimitRuleId;
    }

    /**
     * Set 规则ID
     * @param LimitRuleId 规则ID
     */
    public void setLimitRuleId(Long LimitRuleId) {
        this.LimitRuleId = LimitRuleId;
    }

    /**
     * Get 规则开关，0开启，1关闭 
     * @return Status 规则开关，0开启，1关闭
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 规则开关，0开启，1关闭
     * @param Status 规则开关，0开启，1关闭
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public EnableLimitRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnableLimitRuleItem(EnableLimitRuleItem source) {
        if (source.LimitRuleId != null) {
            this.LimitRuleId = new Long(source.LimitRuleId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LimitRuleId", this.LimitRuleId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

