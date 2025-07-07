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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloseSecurityPolicyRequest extends AbstractModel {

    /**
    * 通道ID。操作通道组时无需填此参数。
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * 安全组策略ID。操作通道组时须填此参数。
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
     * Get 通道ID。操作通道组时无需填此参数。 
     * @return ProxyId 通道ID。操作通道组时无需填此参数。
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set 通道ID。操作通道组时无需填此参数。
     * @param ProxyId 通道ID。操作通道组时无需填此参数。
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get 安全组策略ID。操作通道组时须填此参数。 
     * @return PolicyId 安全组策略ID。操作通道组时须填此参数。
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 安全组策略ID。操作通道组时须填此参数。
     * @param PolicyId 安全组策略ID。操作通道组时须填此参数。
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    public CloseSecurityPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloseSecurityPolicyRequest(CloseSecurityPolicyRequest source) {
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);

    }
}

