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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RemoveVpcAcRuleRequest extends AbstractModel {

    /**
    * 规则的uuid列表，可通过查询规则列表获取，注意：如果传入的是[-1]将删除所有规则
    */
    @SerializedName("RuleUuids")
    @Expose
    private Long [] RuleUuids;

    /**
     * Get 规则的uuid列表，可通过查询规则列表获取，注意：如果传入的是[-1]将删除所有规则 
     * @return RuleUuids 规则的uuid列表，可通过查询规则列表获取，注意：如果传入的是[-1]将删除所有规则
     */
    public Long [] getRuleUuids() {
        return this.RuleUuids;
    }

    /**
     * Set 规则的uuid列表，可通过查询规则列表获取，注意：如果传入的是[-1]将删除所有规则
     * @param RuleUuids 规则的uuid列表，可通过查询规则列表获取，注意：如果传入的是[-1]将删除所有规则
     */
    public void setRuleUuids(Long [] RuleUuids) {
        this.RuleUuids = RuleUuids;
    }

    public RemoveVpcAcRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoveVpcAcRuleRequest(RemoveVpcAcRuleRequest source) {
        if (source.RuleUuids != null) {
            this.RuleUuids = new Long[source.RuleUuids.length];
            for (int i = 0; i < source.RuleUuids.length; i++) {
                this.RuleUuids[i] = new Long(source.RuleUuids[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RuleUuids.", this.RuleUuids);

    }
}

