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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExecuteTaskFlowRequest extends AbstractModel {

    /**
    * 工作流 ID。[工作流管理](https://console.cloud.tencent.com/tsf/tct?rid=1&tab=workflowManage)列表页查看工作流ID。
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
     * Get 工作流 ID。[工作流管理](https://console.cloud.tencent.com/tsf/tct?rid=1&tab=workflowManage)列表页查看工作流ID。 
     * @return FlowId 工作流 ID。[工作流管理](https://console.cloud.tencent.com/tsf/tct?rid=1&tab=workflowManage)列表页查看工作流ID。
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 工作流 ID。[工作流管理](https://console.cloud.tencent.com/tsf/tct?rid=1&tab=workflowManage)列表页查看工作流ID。
     * @param FlowId 工作流 ID。[工作流管理](https://console.cloud.tencent.com/tsf/tct?rid=1&tab=workflowManage)列表页查看工作流ID。
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    public ExecuteTaskFlowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExecuteTaskFlowRequest(ExecuteTaskFlowRequest source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);

    }
}

