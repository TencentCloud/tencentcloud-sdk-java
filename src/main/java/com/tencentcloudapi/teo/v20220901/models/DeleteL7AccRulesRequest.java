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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteL7AccRulesRequest extends AbstractModel {

    /**
    * 站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 需要删除的规则 ID 列表。您可以通过 DescribeL7AccRules 获取 Ruleid。
    */
    @SerializedName("RuleIds")
    @Expose
    private String [] RuleIds;

    /**
     * Get 站点 ID。 
     * @return ZoneId 站点 ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点 ID。
     * @param ZoneId 站点 ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 需要删除的规则 ID 列表。您可以通过 DescribeL7AccRules 获取 Ruleid。 
     * @return RuleIds 需要删除的规则 ID 列表。您可以通过 DescribeL7AccRules 获取 Ruleid。
     */
    public String [] getRuleIds() {
        return this.RuleIds;
    }

    /**
     * Set 需要删除的规则 ID 列表。您可以通过 DescribeL7AccRules 获取 Ruleid。
     * @param RuleIds 需要删除的规则 ID 列表。您可以通过 DescribeL7AccRules 获取 Ruleid。
     */
    public void setRuleIds(String [] RuleIds) {
        this.RuleIds = RuleIds;
    }

    public DeleteL7AccRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteL7AccRulesRequest(DeleteL7AccRulesRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
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
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "RuleIds.", this.RuleIds);

    }
}

