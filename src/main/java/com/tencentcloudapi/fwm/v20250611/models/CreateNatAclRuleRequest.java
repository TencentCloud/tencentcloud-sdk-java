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

public class CreateNatAclRuleRequest extends AbstractModel {

    /**
    * 规则组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 规则列表
    */
    @SerializedName("Rules")
    @Expose
    private NatAclRule [] Rules;

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
     * Get 规则列表 
     * @return Rules 规则列表
     */
    public NatAclRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set 规则列表
     * @param Rules 规则列表
     */
    public void setRules(NatAclRule [] Rules) {
        this.Rules = Rules;
    }

    public CreateNatAclRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateNatAclRuleRequest(CreateNatAclRuleRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Rules != null) {
            this.Rules = new NatAclRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new NatAclRule(source.Rules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);

    }
}

