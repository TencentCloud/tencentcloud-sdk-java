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

public class UpdateRowFilterRequest extends AbstractModel{

    /**
    * 行过滤策略的id，此值可以通过DescribeUserInfo或者DescribeWorkGroupInfo接口获取
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * 新的过滤策略。
    */
    @SerializedName("Policy")
    @Expose
    private Policy Policy;

    /**
     * Get 行过滤策略的id，此值可以通过DescribeUserInfo或者DescribeWorkGroupInfo接口获取 
     * @return PolicyId 行过滤策略的id，此值可以通过DescribeUserInfo或者DescribeWorkGroupInfo接口获取
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 行过滤策略的id，此值可以通过DescribeUserInfo或者DescribeWorkGroupInfo接口获取
     * @param PolicyId 行过滤策略的id，此值可以通过DescribeUserInfo或者DescribeWorkGroupInfo接口获取
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 新的过滤策略。 
     * @return Policy 新的过滤策略。
     */
    public Policy getPolicy() {
        return this.Policy;
    }

    /**
     * Set 新的过滤策略。
     * @param Policy 新的过滤策略。
     */
    public void setPolicy(Policy Policy) {
        this.Policy = Policy;
    }

    public UpdateRowFilterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateRowFilterRequest(UpdateRowFilterRequest source) {
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.Policy != null) {
            this.Policy = new Policy(source.Policy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamObj(map, prefix + "Policy.", this.Policy);

    }
}

