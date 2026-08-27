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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDispenseExternalRuleStatusRequest extends AbstractModel {

    /**
    * 规则id列表
    */
    @SerializedName("RuleIdList")
    @Expose
    private Long [] RuleIdList;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 规则id列表 
     * @return RuleIdList 规则id列表
     */
    public Long [] getRuleIdList() {
        return this.RuleIdList;
    }

    /**
     * Set 规则id列表
     * @param RuleIdList 规则id列表
     */
    public void setRuleIdList(Long [] RuleIdList) {
        this.RuleIdList = RuleIdList;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public ModifyDispenseExternalRuleStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDispenseExternalRuleStatusRequest(ModifyDispenseExternalRuleStatusRequest source) {
        if (source.RuleIdList != null) {
            this.RuleIdList = new Long[source.RuleIdList.length];
            for (int i = 0; i < source.RuleIdList.length; i++) {
                this.RuleIdList[i] = new Long(source.RuleIdList[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RuleIdList.", this.RuleIdList);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

