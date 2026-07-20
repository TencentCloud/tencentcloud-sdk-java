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
package com.tencentcloudapi.ga2.v20250115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteGlobalAcceleratorAclRuleRequest extends AbstractModel {

    /**
    * 全球加速实例ID。
    */
    @SerializedName("GlobalAcceleratorId")
    @Expose
    private String GlobalAcceleratorId;

    /**
    * 安全策略ID
    */
    @SerializedName("GlobalAcceleratorAclPolicyId")
    @Expose
    private String GlobalAcceleratorAclPolicyId;

    /**
    * Acl规则ID。
    */
    @SerializedName("GlobalAcceleratorAclRuleIds")
    @Expose
    private String [] GlobalAcceleratorAclRuleIds;

    /**
     * Get 全球加速实例ID。 
     * @return GlobalAcceleratorId 全球加速实例ID。
     */
    public String getGlobalAcceleratorId() {
        return this.GlobalAcceleratorId;
    }

    /**
     * Set 全球加速实例ID。
     * @param GlobalAcceleratorId 全球加速实例ID。
     */
    public void setGlobalAcceleratorId(String GlobalAcceleratorId) {
        this.GlobalAcceleratorId = GlobalAcceleratorId;
    }

    /**
     * Get 安全策略ID 
     * @return GlobalAcceleratorAclPolicyId 安全策略ID
     */
    public String getGlobalAcceleratorAclPolicyId() {
        return this.GlobalAcceleratorAclPolicyId;
    }

    /**
     * Set 安全策略ID
     * @param GlobalAcceleratorAclPolicyId 安全策略ID
     */
    public void setGlobalAcceleratorAclPolicyId(String GlobalAcceleratorAclPolicyId) {
        this.GlobalAcceleratorAclPolicyId = GlobalAcceleratorAclPolicyId;
    }

    /**
     * Get Acl规则ID。 
     * @return GlobalAcceleratorAclRuleIds Acl规则ID。
     */
    public String [] getGlobalAcceleratorAclRuleIds() {
        return this.GlobalAcceleratorAclRuleIds;
    }

    /**
     * Set Acl规则ID。
     * @param GlobalAcceleratorAclRuleIds Acl规则ID。
     */
    public void setGlobalAcceleratorAclRuleIds(String [] GlobalAcceleratorAclRuleIds) {
        this.GlobalAcceleratorAclRuleIds = GlobalAcceleratorAclRuleIds;
    }

    public DeleteGlobalAcceleratorAclRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteGlobalAcceleratorAclRuleRequest(DeleteGlobalAcceleratorAclRuleRequest source) {
        if (source.GlobalAcceleratorId != null) {
            this.GlobalAcceleratorId = new String(source.GlobalAcceleratorId);
        }
        if (source.GlobalAcceleratorAclPolicyId != null) {
            this.GlobalAcceleratorAclPolicyId = new String(source.GlobalAcceleratorAclPolicyId);
        }
        if (source.GlobalAcceleratorAclRuleIds != null) {
            this.GlobalAcceleratorAclRuleIds = new String[source.GlobalAcceleratorAclRuleIds.length];
            for (int i = 0; i < source.GlobalAcceleratorAclRuleIds.length; i++) {
                this.GlobalAcceleratorAclRuleIds[i] = new String(source.GlobalAcceleratorAclRuleIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GlobalAcceleratorId", this.GlobalAcceleratorId);
        this.setParamSimple(map, prefix + "GlobalAcceleratorAclPolicyId", this.GlobalAcceleratorAclPolicyId);
        this.setParamArraySimple(map, prefix + "GlobalAcceleratorAclRuleIds.", this.GlobalAcceleratorAclRuleIds);

    }
}

