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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNetworkFirewallPolicyStatusResponse extends AbstractModel{

    /**
    * 任务状态，可能为：Task_Running,Task_Succ,Task_Error,Task_NoExist
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * NameRepeat,K8sRuleIngressPortError等
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskResult")
    @Expose
    private String [] TaskResult;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务状态，可能为：Task_Running,Task_Succ,Task_Error,Task_NoExist 
     * @return TaskStatus 任务状态，可能为：Task_Running,Task_Succ,Task_Error,Task_NoExist
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 任务状态，可能为：Task_Running,Task_Succ,Task_Error,Task_NoExist
     * @param TaskStatus 任务状态，可能为：Task_Running,Task_Succ,Task_Error,Task_NoExist
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get NameRepeat,K8sRuleIngressPortError等
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskResult NameRepeat,K8sRuleIngressPortError等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTaskResult() {
        return this.TaskResult;
    }

    /**
     * Set NameRepeat,K8sRuleIngressPortError等
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskResult NameRepeat,K8sRuleIngressPortError等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskResult(String [] TaskResult) {
        this.TaskResult = TaskResult;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeNetworkFirewallPolicyStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNetworkFirewallPolicyStatusResponse(DescribeNetworkFirewallPolicyStatusResponse source) {
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
        if (source.TaskResult != null) {
            this.TaskResult = new String[source.TaskResult.length];
            for (int i = 0; i < source.TaskResult.length; i++) {
                this.TaskResult[i] = new String(source.TaskResult[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamArraySimple(map, prefix + "TaskResult.", this.TaskResult);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

