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
package com.tencentcloudapi.fwm.v20250611.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteNatAclRuleRequest extends AbstractModel {

    /**
    * 规则组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 规则ID列表
    */
    @SerializedName("RuleIds")
    @Expose
    private String [] RuleIds;

    /**
     * Get 规则组ID 
     * @return GroupId 规则组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 规则组ID
     * @param GroupId 规则组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 规则ID列表 
     * @return RuleIds 规则ID列表
     */
    public String [] getRuleIds() {
        return this.RuleIds;
    }

    /**
     * Set 规则ID列表
     * @param RuleIds 规则ID列表
     */
    public void setRuleIds(String [] RuleIds) {
        this.RuleIds = RuleIds;
    }

    public DeleteNatAclRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteNatAclRuleRequest(DeleteNatAclRuleRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.RuleIds != null) {
            this.RuleIds = new String[source.RuleIds.length];
            for (int i = 0; i < source.RuleIds.length; i++) {
                this.RuleIds[i] = new String(source.RuleIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamArraySimple(map, prefix + "RuleIds.", this.RuleIds);

    }
}

