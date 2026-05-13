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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OverrideCfsRulesRequest extends AbstractModel {

    /**
    * 权限组 ID
    */
    @SerializedName("PermissionGroupId")
    @Expose
    private String PermissionGroupId;

    /**
    * 权限组规则列表
    */
    @SerializedName("RuleList")
    @Expose
    private InputPermissionGroupRules [] RuleList;

    /**
     * Get 权限组 ID 
     * @return PermissionGroupId 权限组 ID
     */
    public String getPermissionGroupId() {
        return this.PermissionGroupId;
    }

    /**
     * Set 权限组 ID
     * @param PermissionGroupId 权限组 ID
     */
    public void setPermissionGroupId(String PermissionGroupId) {
        this.PermissionGroupId = PermissionGroupId;
    }

    /**
     * Get 权限组规则列表 
     * @return RuleList 权限组规则列表
     */
    public InputPermissionGroupRules [] getRuleList() {
        return this.RuleList;
    }

    /**
     * Set 权限组规则列表
     * @param RuleList 权限组规则列表
     */
    public void setRuleList(InputPermissionGroupRules [] RuleList) {
        this.RuleList = RuleList;
    }

    public OverrideCfsRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OverrideCfsRulesRequest(OverrideCfsRulesRequest source) {
        if (source.PermissionGroupId != null) {
            this.PermissionGroupId = new String(source.PermissionGroupId);
        }
        if (source.RuleList != null) {
            this.RuleList = new InputPermissionGroupRules[source.RuleList.length];
            for (int i = 0; i < source.RuleList.length; i++) {
                this.RuleList[i] = new InputPermissionGroupRules(source.RuleList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PermissionGroupId", this.PermissionGroupId);
        this.setParamArrayObj(map, prefix + "RuleList.", this.RuleList);

    }
}

