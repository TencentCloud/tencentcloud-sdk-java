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
package com.tencentcloudapi.chdfs.v20201112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteAccessRulesRequest extends AbstractModel {

    /**
    * 多个权限规则ID，上限为10
    */
    @SerializedName("AccessRuleIds")
    @Expose
    private Long [] AccessRuleIds;

    /**
     * Get 多个权限规则ID，上限为10 
     * @return AccessRuleIds 多个权限规则ID，上限为10
     */
    public Long [] getAccessRuleIds() {
        return this.AccessRuleIds;
    }

    /**
     * Set 多个权限规则ID，上限为10
     * @param AccessRuleIds 多个权限规则ID，上限为10
     */
    public void setAccessRuleIds(Long [] AccessRuleIds) {
        this.AccessRuleIds = AccessRuleIds;
    }

    public DeleteAccessRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAccessRulesRequest(DeleteAccessRulesRequest source) {
        if (source.AccessRuleIds != null) {
            this.AccessRuleIds = new Long[source.AccessRuleIds.length];
            for (int i = 0; i < source.AccessRuleIds.length; i++) {
                this.AccessRuleIds[i] = new Long(source.AccessRuleIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AccessRuleIds.", this.AccessRuleIds);

    }
}

