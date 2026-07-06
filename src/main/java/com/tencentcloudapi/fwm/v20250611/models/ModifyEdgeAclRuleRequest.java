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

public class ModifyEdgeAclRuleRequest extends AbstractModel {

    /**
    * 规则组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 要修改的规则，必须包含RuleId
    */
    @SerializedName("Rule")
    @Expose
    private EdgeAclRuleInfo Rule;

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
     * Get 要修改的规则，必须包含RuleId 
     * @return Rule 要修改的规则，必须包含RuleId
     */
    public EdgeAclRuleInfo getRule() {
        return this.Rule;
    }

    /**
     * Set 要修改的规则，必须包含RuleId
     * @param Rule 要修改的规则，必须包含RuleId
     */
    public void setRule(EdgeAclRuleInfo Rule) {
        this.Rule = Rule;
    }

    public ModifyEdgeAclRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyEdgeAclRuleRequest(ModifyEdgeAclRuleRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Rule != null) {
            this.Rule = new EdgeAclRuleInfo(source.Rule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamObj(map, prefix + "Rule.", this.Rule);

    }
}

