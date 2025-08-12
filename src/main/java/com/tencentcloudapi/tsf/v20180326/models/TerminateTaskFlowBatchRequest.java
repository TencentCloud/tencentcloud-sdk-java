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

public class TerminateTaskFlowBatchRequest extends AbstractModel {

    /**
    * 工作流批次 ID，在[工作流执行记录](https://console.cloud.tencent.com/tsf/tct?rid=1&tab=taskflow)列表页第一列获取。
    */
    @SerializedName("FlowBatchId")
    @Expose
    private String FlowBatchId;

    /**
     * Get 工作流批次 ID，在[工作流执行记录](https://console.cloud.tencent.com/tsf/tct?rid=1&tab=taskflow)列表页第一列获取。 
     * @return FlowBatchId 工作流批次 ID，在[工作流执行记录](https://console.cloud.tencent.com/tsf/tct?rid=1&tab=taskflow)列表页第一列获取。
     */
    public String getFlowBatchId() {
        return this.FlowBatchId;
    }

    /**
     * Set 工作流批次 ID，在[工作流执行记录](https://console.cloud.tencent.com/tsf/tct?rid=1&tab=taskflow)列表页第一列获取。
     * @param FlowBatchId 工作流批次 ID，在[工作流执行记录](https://console.cloud.tencent.com/tsf/tct?rid=1&tab=taskflow)列表页第一列获取。
     */
    public void setFlowBatchId(String FlowBatchId) {
        this.FlowBatchId = FlowBatchId;
    }

    public TerminateTaskFlowBatchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TerminateTaskFlowBatchRequest(TerminateTaskFlowBatchRequest source) {
        if (source.FlowBatchId != null) {
            this.FlowBatchId = new String(source.FlowBatchId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowBatchId", this.FlowBatchId);

    }
}

