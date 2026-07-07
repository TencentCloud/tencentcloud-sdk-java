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

public class DeleteSecurityPolicyRequest extends AbstractModel {

    /**
    * 安全策略 ID 列表，ID 格式为 tls- 后接 8 位字母数字。
    */
    @SerializedName("SecurityPolicyIds")
    @Expose
    private String [] SecurityPolicyIds;

    /**
    * 是否仅执行预检请求。取值：
- **true**：仅执行预检请求，不实际删除资源。预检请求将验证参数格式、权限及安全策略是否被引用等，帮助您在正式操作前发现潜在问题。
- **false**（默认）：执行正常请求，通过预检后将直接删除安全策略。

    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

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

    /**
     * Get 是否仅执行预检请求。取值：
- **true**：仅执行预检请求，不实际删除资源。预检请求将验证参数格式、权限及安全策略是否被引用等，帮助您在正式操作前发现潜在问题。
- **false**（默认）：执行正常请求，通过预检后将直接删除安全策略。
 
     * @return DryRun 是否仅执行预检请求。取值：
- **true**：仅执行预检请求，不实际删除资源。预检请求将验证参数格式、权限及安全策略是否被引用等，帮助您在正式操作前发现潜在问题。
- **false**（默认）：执行正常请求，通过预检后将直接删除安全策略。

     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set 是否仅执行预检请求。取值：
- **true**：仅执行预检请求，不实际删除资源。预检请求将验证参数格式、权限及安全策略是否被引用等，帮助您在正式操作前发现潜在问题。
- **false**（默认）：执行正常请求，通过预检后将直接删除安全策略。

     * @param DryRun 是否仅执行预检请求。取值：
- **true**：仅执行预检请求，不实际删除资源。预检请求将验证参数格式、权限及安全策略是否被引用等，帮助您在正式操作前发现潜在问题。
- **false**（默认）：执行正常请求，通过预检后将直接删除安全策略。

     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    public DeleteSecurityPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteSecurityPolicyRequest(DeleteSecurityPolicyRequest source) {
        if (source.SecurityPolicyIds != null) {
            this.SecurityPolicyIds = new String[source.SecurityPolicyIds.length];
            for (int i = 0; i < source.SecurityPolicyIds.length; i++) {
                this.SecurityPolicyIds[i] = new String(source.SecurityPolicyIds[i]);
            }
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SecurityPolicyIds.", this.SecurityPolicyIds);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);

    }
}

