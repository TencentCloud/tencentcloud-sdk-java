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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCcnPolicyBasedRoutingRuleAttributeRequest extends AbstractModel {

    /**
    * 云联网ID
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * 策略路由匹配规则ID
    */
    @SerializedName("PolicyBasedRoutingRuleId")
    @Expose
    private String PolicyBasedRoutingRuleId;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 云联网ID 
     * @return CcnId 云联网ID
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set 云联网ID
     * @param CcnId 云联网ID
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get 策略路由匹配规则ID 
     * @return PolicyBasedRoutingRuleId 策略路由匹配规则ID
     */
    public String getPolicyBasedRoutingRuleId() {
        return this.PolicyBasedRoutingRuleId;
    }

    /**
     * Set 策略路由匹配规则ID
     * @param PolicyBasedRoutingRuleId 策略路由匹配规则ID
     */
    public void setPolicyBasedRoutingRuleId(String PolicyBasedRoutingRuleId) {
        this.PolicyBasedRoutingRuleId = PolicyBasedRoutingRuleId;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ModifyCcnPolicyBasedRoutingRuleAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCcnPolicyBasedRoutingRuleAttributeRequest(ModifyCcnPolicyBasedRoutingRuleAttributeRequest source) {
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.PolicyBasedRoutingRuleId != null) {
            this.PolicyBasedRoutingRuleId = new String(source.PolicyBasedRoutingRuleId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "PolicyBasedRoutingRuleId", this.PolicyBasedRoutingRuleId);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

