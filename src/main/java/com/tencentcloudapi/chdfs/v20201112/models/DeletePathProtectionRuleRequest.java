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

public class DeletePathProtectionRuleRequest extends AbstractModel {

    /**
    * 路径保护规则ID
    */
    @SerializedName("PathProtectionRuleId")
    @Expose
    private Long PathProtectionRuleId;

    /**
     * Get 路径保护规则ID 
     * @return PathProtectionRuleId 路径保护规则ID
     */
    public Long getPathProtectionRuleId() {
        return this.PathProtectionRuleId;
    }

    /**
     * Set 路径保护规则ID
     * @param PathProtectionRuleId 路径保护规则ID
     */
    public void setPathProtectionRuleId(Long PathProtectionRuleId) {
        this.PathProtectionRuleId = PathProtectionRuleId;
    }

    public DeletePathProtectionRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeletePathProtectionRuleRequest(DeletePathProtectionRuleRequest source) {
        if (source.PathProtectionRuleId != null) {
            this.PathProtectionRuleId = new Long(source.PathProtectionRuleId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PathProtectionRuleId", this.PathProtectionRuleId);

    }
}

