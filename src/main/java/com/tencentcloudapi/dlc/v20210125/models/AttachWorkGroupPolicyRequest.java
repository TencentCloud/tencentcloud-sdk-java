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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttachWorkGroupPolicyRequest extends AbstractModel {

    /**
    * <p>工作组Id</p>
    */
    @SerializedName("WorkGroupId")
    @Expose
    private Long WorkGroupId;

    /**
    * <p>要绑定的策略集合</p>
    */
    @SerializedName("PolicySet")
    @Expose
    private Policy [] PolicySet;

    /**
     * Get <p>工作组Id</p> 
     * @return WorkGroupId <p>工作组Id</p>
     */
    public Long getWorkGroupId() {
        return this.WorkGroupId;
    }

    /**
     * Set <p>工作组Id</p>
     * @param WorkGroupId <p>工作组Id</p>
     */
    public void setWorkGroupId(Long WorkGroupId) {
        this.WorkGroupId = WorkGroupId;
    }

    /**
     * Get <p>要绑定的策略集合</p> 
     * @return PolicySet <p>要绑定的策略集合</p>
     */
    public Policy [] getPolicySet() {
        return this.PolicySet;
    }

    /**
     * Set <p>要绑定的策略集合</p>
     * @param PolicySet <p>要绑定的策略集合</p>
     */
    public void setPolicySet(Policy [] PolicySet) {
        this.PolicySet = PolicySet;
    }

    public AttachWorkGroupPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttachWorkGroupPolicyRequest(AttachWorkGroupPolicyRequest source) {
        if (source.WorkGroupId != null) {
            this.WorkGroupId = new Long(source.WorkGroupId);
        }
        if (source.PolicySet != null) {
            this.PolicySet = new Policy[source.PolicySet.length];
            for (int i = 0; i < source.PolicySet.length; i++) {
                this.PolicySet[i] = new Policy(source.PolicySet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkGroupId", this.WorkGroupId);
        this.setParamArrayObj(map, prefix + "PolicySet.", this.PolicySet);

    }
}

