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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttachWorkGroupPolicyRequest extends AbstractModel{

    /**
    * 工作组Id
    */
    @SerializedName("WorkGroupId")
    @Expose
    private Long WorkGroupId;

    /**
    * 要绑定的策略集合
    */
    @SerializedName("PolicySet")
    @Expose
    private Policy [] PolicySet;

    /**
     * Get 工作组Id 
     * @return WorkGroupId 工作组Id
     */
    public Long getWorkGroupId() {
        return this.WorkGroupId;
    }

    /**
     * Set 工作组Id
     * @param WorkGroupId 工作组Id
     */
    public void setWorkGroupId(Long WorkGroupId) {
        this.WorkGroupId = WorkGroupId;
    }

    /**
     * Get 要绑定的策略集合 
     * @return PolicySet 要绑定的策略集合
     */
    public Policy [] getPolicySet() {
        return this.PolicySet;
    }

    /**
     * Set 要绑定的策略集合
     * @param PolicySet 要绑定的策略集合
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

