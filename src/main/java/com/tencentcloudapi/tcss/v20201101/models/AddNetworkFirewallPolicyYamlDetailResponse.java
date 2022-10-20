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

public class AddNetworkFirewallPolicyYamlDetailResponse extends AbstractModel{

    /**
    * 返回创建的任务的ID，为0表示创建失败。
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 创建任务的结果，"Succ"为成功，"Failed"为失败
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回创建的任务的ID，为0表示创建失败。 
     * @return TaskId 返回创建的任务的ID，为0表示创建失败。
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 返回创建的任务的ID，为0表示创建失败。
     * @param TaskId 返回创建的任务的ID，为0表示创建失败。
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 创建任务的结果，"Succ"为成功，"Failed"为失败 
     * @return Result 创建任务的结果，"Succ"为成功，"Failed"为失败
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 创建任务的结果，"Succ"为成功，"Failed"为失败
     * @param Result 创建任务的结果，"Succ"为成功，"Failed"为失败
     */
    public void setResult(String Result) {
        this.Result = Result;
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

    public AddNetworkFirewallPolicyYamlDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddNetworkFirewallPolicyYamlDetailResponse(AddNetworkFirewallPolicyYamlDetailResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

