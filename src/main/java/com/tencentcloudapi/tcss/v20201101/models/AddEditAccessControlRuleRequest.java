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

public class AddEditAccessControlRuleRequest extends AbstractModel {

    /**
    * 增加策略信息，策略id为空，编辑策略是id不能为空
    */
    @SerializedName("RuleInfo")
    @Expose
    private AccessControlRuleInfo RuleInfo;

    /**
    * 仅在白名单时候使用
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
     * Get 增加策略信息，策略id为空，编辑策略是id不能为空 
     * @return RuleInfo 增加策略信息，策略id为空，编辑策略是id不能为空
     */
    public AccessControlRuleInfo getRuleInfo() {
        return this.RuleInfo;
    }

    /**
     * Set 增加策略信息，策略id为空，编辑策略是id不能为空
     * @param RuleInfo 增加策略信息，策略id为空，编辑策略是id不能为空
     */
    public void setRuleInfo(AccessControlRuleInfo RuleInfo) {
        this.RuleInfo = RuleInfo;
    }

    /**
     * Get 仅在白名单时候使用 
     * @return EventId 仅在白名单时候使用
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set 仅在白名单时候使用
     * @param EventId 仅在白名单时候使用
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    public AddEditAccessControlRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddEditAccessControlRuleRequest(AddEditAccessControlRuleRequest source) {
        if (source.RuleInfo != null) {
            this.RuleInfo = new AccessControlRuleInfo(source.RuleInfo);
        }
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "RuleInfo.", this.RuleInfo);
        this.setParamSimple(map, prefix + "EventId", this.EventId);

    }
}

