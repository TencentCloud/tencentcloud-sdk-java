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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StartStreamIngestResponse extends AbstractModel {

    /**
    * 拉流转推的任务 ID。任务 ID 是对一次拉流转推生命周期过程的唯一标识，结束任务时会失去意义。任务 ID 需要业务保存下来，作为下次针对这个任务操作的参数。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 拉流转推的任务 ID。任务 ID 是对一次拉流转推生命周期过程的唯一标识，结束任务时会失去意义。任务 ID 需要业务保存下来，作为下次针对这个任务操作的参数。 
     * @return TaskId 拉流转推的任务 ID。任务 ID 是对一次拉流转推生命周期过程的唯一标识，结束任务时会失去意义。任务 ID 需要业务保存下来，作为下次针对这个任务操作的参数。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 拉流转推的任务 ID。任务 ID 是对一次拉流转推生命周期过程的唯一标识，结束任务时会失去意义。任务 ID 需要业务保存下来，作为下次针对这个任务操作的参数。
     * @param TaskId 拉流转推的任务 ID。任务 ID 是对一次拉流转推生命周期过程的唯一标识，结束任务时会失去意义。任务 ID 需要业务保存下来，作为下次针对这个任务操作的参数。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
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

    public StartStreamIngestResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartStreamIngestResponse(StartStreamIngestResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

