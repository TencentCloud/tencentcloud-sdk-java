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

public class CreateSecurityGroupRuleRequest extends AbstractModel {

    /**
    * <p>规则组Id</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>规则列表</p>
    */
    @SerializedName("Rules")
    @Expose
    private SecurityGroupRule [] Rules;

    /**
     * Get <p>规则组Id</p> 
     * @return GroupId <p>规则组Id</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>规则组Id</p>
     * @param GroupId <p>规则组Id</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>规则列表</p> 
     * @return Rules <p>规则列表</p>
     */
    public SecurityGroupRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set <p>规则列表</p>
     * @param Rules <p>规则列表</p>
     */
    public void setRules(SecurityGroupRule [] Rules) {
        this.Rules = Rules;
    }

    public CreateSecurityGroupRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSecurityGroupRuleRequest(CreateSecurityGroupRuleRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Rules != null) {
            this.Rules = new SecurityGroupRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new SecurityGroupRule(source.Rules[i]);
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

