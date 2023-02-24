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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RemoveNatAcRuleRequest extends AbstractModel{

    /**
    * 规则的uuid列表，可通过查询规则列表获取，注意：如果传入的是[-1]将删除所有规则
    */
    @SerializedName("RuleUuid")
    @Expose
    private Long [] RuleUuid;

    /**
    * 规则方向：1，入站；0，出站
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
     * Get 规则的uuid列表，可通过查询规则列表获取，注意：如果传入的是[-1]将删除所有规则 
     * @return RuleUuid 规则的uuid列表，可通过查询规则列表获取，注意：如果传入的是[-1]将删除所有规则
     */
    public Long [] getRuleUuid() {
        return this.RuleUuid;
    }

    /**
     * Set 规则的uuid列表，可通过查询规则列表获取，注意：如果传入的是[-1]将删除所有规则
     * @param RuleUuid 规则的uuid列表，可通过查询规则列表获取，注意：如果传入的是[-1]将删除所有规则
     */
    public void setRuleUuid(Long [] RuleUuid) {
        this.RuleUuid = RuleUuid;
    }

    /**
     * Get 规则方向：1，入站；0，出站 
     * @return Direction 规则方向：1，入站；0，出站
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set 规则方向：1，入站；0，出站
     * @param Direction 规则方向：1，入站；0，出站
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    public RemoveNatAcRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoveNatAcRuleRequest(RemoveNatAcRuleRequest source) {
        if (source.RuleUuid != null) {
            this.RuleUuid = new Long[source.RuleUuid.length];
            for (int i = 0; i < source.RuleUuid.length; i++) {
                this.RuleUuid[i] = new Long(source.RuleUuid[i]);
            }
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RuleUuid.", this.RuleUuid);
        this.setParamSimple(map, prefix + "Direction", this.Direction);

    }
}

