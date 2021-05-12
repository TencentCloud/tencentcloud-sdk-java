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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteSecurityPolicyRequest extends AbstractModel{

    /**
    * 实例Id
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * 白名单Id
    */
    @SerializedName("PolicyIndex")
    @Expose
    private Long PolicyIndex;

    /**
    * 白名单版本
    */
    @SerializedName("PolicyVersion")
    @Expose
    private String PolicyVersion;

    /**
     * Get 实例Id 
     * @return RegistryId 实例Id
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set 实例Id
     * @param RegistryId 实例Id
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get 白名单Id 
     * @return PolicyIndex 白名单Id
     */
    public Long getPolicyIndex() {
        return this.PolicyIndex;
    }

    /**
     * Set 白名单Id
     * @param PolicyIndex 白名单Id
     */
    public void setPolicyIndex(Long PolicyIndex) {
        this.PolicyIndex = PolicyIndex;
    }

    /**
     * Get 白名单版本 
     * @return PolicyVersion 白名单版本
     */
    public String getPolicyVersion() {
        return this.PolicyVersion;
    }

    /**
     * Set 白名单版本
     * @param PolicyVersion 白名单版本
     */
    public void setPolicyVersion(String PolicyVersion) {
        this.PolicyVersion = PolicyVersion;
    }

    public DeleteSecurityPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteSecurityPolicyRequest(DeleteSecurityPolicyRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.PolicyIndex != null) {
            this.PolicyIndex = new Long(source.PolicyIndex);
        }
        if (source.PolicyVersion != null) {
            this.PolicyVersion = new String(source.PolicyVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "PolicyIndex", this.PolicyIndex);
        this.setParamSimple(map, prefix + "PolicyVersion", this.PolicyVersion);

    }
}

