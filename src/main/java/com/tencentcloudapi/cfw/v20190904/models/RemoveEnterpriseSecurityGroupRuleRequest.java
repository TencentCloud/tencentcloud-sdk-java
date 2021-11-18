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

public class RemoveEnterpriseSecurityGroupRuleRequest extends AbstractModel{

    /**
    * 规则的uuid，可通过查询规则列表获取
    */
    @SerializedName("RuleUuid")
    @Expose
    private Long RuleUuid;

    /**
    * 删除类型，0是单条删除，RuleUuid填写删除规则id，1为全部删除，RuleUuid填0即可
    */
    @SerializedName("RemoveType")
    @Expose
    private Long RemoveType;

    /**
     * Get 规则的uuid，可通过查询规则列表获取 
     * @return RuleUuid 规则的uuid，可通过查询规则列表获取
     */
    public Long getRuleUuid() {
        return this.RuleUuid;
    }

    /**
     * Set 规则的uuid，可通过查询规则列表获取
     * @param RuleUuid 规则的uuid，可通过查询规则列表获取
     */
    public void setRuleUuid(Long RuleUuid) {
        this.RuleUuid = RuleUuid;
    }

    /**
     * Get 删除类型，0是单条删除，RuleUuid填写删除规则id，1为全部删除，RuleUuid填0即可 
     * @return RemoveType 删除类型，0是单条删除，RuleUuid填写删除规则id，1为全部删除，RuleUuid填0即可
     */
    public Long getRemoveType() {
        return this.RemoveType;
    }

    /**
     * Set 删除类型，0是单条删除，RuleUuid填写删除规则id，1为全部删除，RuleUuid填0即可
     * @param RemoveType 删除类型，0是单条删除，RuleUuid填写删除规则id，1为全部删除，RuleUuid填0即可
     */
    public void setRemoveType(Long RemoveType) {
        this.RemoveType = RemoveType;
    }

    public RemoveEnterpriseSecurityGroupRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoveEnterpriseSecurityGroupRuleRequest(RemoveEnterpriseSecurityGroupRuleRequest source) {
        if (source.RuleUuid != null) {
            this.RuleUuid = new Long(source.RuleUuid);
        }
        if (source.RemoveType != null) {
            this.RemoveType = new Long(source.RemoveType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleUuid", this.RuleUuid);
        this.setParamSimple(map, prefix + "RemoveType", this.RemoveType);

    }
}

