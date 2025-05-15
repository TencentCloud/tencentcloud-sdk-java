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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteScalingPolicyRequest extends AbstractModel {

    /**
    * 待删除的告警策略ID。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 或调用接口 [DescribeScalingPolicies](https://cloud.tencent.com/document/api/377/33178) ，取返回信息中的 AutoScalingPolicyId 获取告警策略ID。
    */
    @SerializedName("AutoScalingPolicyId")
    @Expose
    private String AutoScalingPolicyId;

    /**
     * Get 待删除的告警策略ID。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 或调用接口 [DescribeScalingPolicies](https://cloud.tencent.com/document/api/377/33178) ，取返回信息中的 AutoScalingPolicyId 获取告警策略ID。 
     * @return AutoScalingPolicyId 待删除的告警策略ID。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 或调用接口 [DescribeScalingPolicies](https://cloud.tencent.com/document/api/377/33178) ，取返回信息中的 AutoScalingPolicyId 获取告警策略ID。
     */
    public String getAutoScalingPolicyId() {
        return this.AutoScalingPolicyId;
    }

    /**
     * Set 待删除的告警策略ID。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 或调用接口 [DescribeScalingPolicies](https://cloud.tencent.com/document/api/377/33178) ，取返回信息中的 AutoScalingPolicyId 获取告警策略ID。
     * @param AutoScalingPolicyId 待删除的告警策略ID。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 或调用接口 [DescribeScalingPolicies](https://cloud.tencent.com/document/api/377/33178) ，取返回信息中的 AutoScalingPolicyId 获取告警策略ID。
     */
    public void setAutoScalingPolicyId(String AutoScalingPolicyId) {
        this.AutoScalingPolicyId = AutoScalingPolicyId;
    }

    public DeleteScalingPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteScalingPolicyRequest(DeleteScalingPolicyRequest source) {
        if (source.AutoScalingPolicyId != null) {
            this.AutoScalingPolicyId = new String(source.AutoScalingPolicyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingPolicyId", this.AutoScalingPolicyId);

    }
}

