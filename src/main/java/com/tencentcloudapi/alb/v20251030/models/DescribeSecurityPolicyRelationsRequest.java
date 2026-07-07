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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecurityPolicyRelationsRequest extends AbstractModel {

    /**
    * 安全策略 ID 列表，ID 格式为 tls- 后接 8 位字母数字。
    */
    @SerializedName("SecurityPolicyIds")
    @Expose
    private String [] SecurityPolicyIds;

    /**
     * Get 安全策略 ID 列表，ID 格式为 tls- 后接 8 位字母数字。 
     * @return SecurityPolicyIds 安全策略 ID 列表，ID 格式为 tls- 后接 8 位字母数字。
     */
    public String [] getSecurityPolicyIds() {
        return this.SecurityPolicyIds;
    }

    /**
     * Set 安全策略 ID 列表，ID 格式为 tls- 后接 8 位字母数字。
     * @param SecurityPolicyIds 安全策略 ID 列表，ID 格式为 tls- 后接 8 位字母数字。
     */
    public void setSecurityPolicyIds(String [] SecurityPolicyIds) {
        this.SecurityPolicyIds = SecurityPolicyIds;
    }

    public DescribeSecurityPolicyRelationsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityPolicyRelationsRequest(DescribeSecurityPolicyRelationsRequest source) {
        if (source.SecurityPolicyIds != null) {
            this.SecurityPolicyIds = new String[source.SecurityPolicyIds.length];
            for (int i = 0; i < source.SecurityPolicyIds.length; i++) {
                this.SecurityPolicyIds[i] = new String(source.SecurityPolicyIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SecurityPolicyIds.", this.SecurityPolicyIds);

    }
}

