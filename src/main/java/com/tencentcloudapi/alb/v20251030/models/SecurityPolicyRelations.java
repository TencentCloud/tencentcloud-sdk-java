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

public class SecurityPolicyRelations extends AbstractModel {

    /**
    * 安全策略与监听的关联关系列表。
    */
    @SerializedName("RelatedListeners")
    @Expose
    private RelatedListener [] RelatedListeners;

    /**
    * 安全策略 ID，格式为 tls- 后接 8 位字母数字。
    */
    @SerializedName("SecurityPolicyId")
    @Expose
    private String SecurityPolicyId;

    /**
     * Get 安全策略与监听的关联关系列表。 
     * @return RelatedListeners 安全策略与监听的关联关系列表。
     */
    public RelatedListener [] getRelatedListeners() {
        return this.RelatedListeners;
    }

    /**
     * Set 安全策略与监听的关联关系列表。
     * @param RelatedListeners 安全策略与监听的关联关系列表。
     */
    public void setRelatedListeners(RelatedListener [] RelatedListeners) {
        this.RelatedListeners = RelatedListeners;
    }

    /**
     * Get 安全策略 ID，格式为 tls- 后接 8 位字母数字。 
     * @return SecurityPolicyId 安全策略 ID，格式为 tls- 后接 8 位字母数字。
     */
    public String getSecurityPolicyId() {
        return this.SecurityPolicyId;
    }

    /**
     * Set 安全策略 ID，格式为 tls- 后接 8 位字母数字。
     * @param SecurityPolicyId 安全策略 ID，格式为 tls- 后接 8 位字母数字。
     */
    public void setSecurityPolicyId(String SecurityPolicyId) {
        this.SecurityPolicyId = SecurityPolicyId;
    }

    public SecurityPolicyRelations() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityPolicyRelations(SecurityPolicyRelations source) {
        if (source.RelatedListeners != null) {
            this.RelatedListeners = new RelatedListener[source.RelatedListeners.length];
            for (int i = 0; i < source.RelatedListeners.length; i++) {
                this.RelatedListeners[i] = new RelatedListener(source.RelatedListeners[i]);
            }
        }
        if (source.SecurityPolicyId != null) {
            this.SecurityPolicyId = new String(source.SecurityPolicyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RelatedListeners.", this.RelatedListeners);
        this.setParamSimple(map, prefix + "SecurityPolicyId", this.SecurityPolicyId);

    }
}

