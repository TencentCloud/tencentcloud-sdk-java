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

public class GlobalAcceleratorAclPolicies extends AbstractModel {

    /**
    * 访问控制策略ID。
    */
    @SerializedName("GlobalAcceleratorAclPolicyId")
    @Expose
    private String GlobalAcceleratorAclPolicyId;

    /**
    * 默认动作。
    */
    @SerializedName("DefaultAction")
    @Expose
    private String DefaultAction;

    /**
    * 状态。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 访问控制策略ID。 
     * @return GlobalAcceleratorAclPolicyId 访问控制策略ID。
     */
    public String getGlobalAcceleratorAclPolicyId() {
        return this.GlobalAcceleratorAclPolicyId;
    }

    /**
     * Set 访问控制策略ID。
     * @param GlobalAcceleratorAclPolicyId 访问控制策略ID。
     */
    public void setGlobalAcceleratorAclPolicyId(String GlobalAcceleratorAclPolicyId) {
        this.GlobalAcceleratorAclPolicyId = GlobalAcceleratorAclPolicyId;
    }

    /**
     * Get 默认动作。 
     * @return DefaultAction 默认动作。
     */
    public String getDefaultAction() {
        return this.DefaultAction;
    }

    /**
     * Set 默认动作。
     * @param DefaultAction 默认动作。
     */
    public void setDefaultAction(String DefaultAction) {
        this.DefaultAction = DefaultAction;
    }

    /**
     * Get 状态。 
     * @return Status 状态。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态。
     * @param Status 状态。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public GlobalAcceleratorAclPolicies() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GlobalAcceleratorAclPolicies(GlobalAcceleratorAclPolicies source) {
        if (source.GlobalAcceleratorAclPolicyId != null) {
            this.GlobalAcceleratorAclPolicyId = new String(source.GlobalAcceleratorAclPolicyId);
        }
        if (source.DefaultAction != null) {
            this.DefaultAction = new String(source.DefaultAction);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GlobalAcceleratorAclPolicyId", this.GlobalAcceleratorAclPolicyId);
        this.setParamSimple(map, prefix + "DefaultAction", this.DefaultAction);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

