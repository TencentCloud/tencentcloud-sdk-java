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

public class ResourceTaskStatusResult extends AbstractModel {

    /**
    * 变更状态：
- `0`：成功
- `1`：失败
- `2`：执行中
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

    /**
     * Get 变更状态：
- `0`：成功
- `1`：失败
- `2`：执行中 
     * @return TaskStatus 变更状态：
- `0`：成功
- `1`：失败
- `2`：执行中
     */
    public Long getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 变更状态：
- `0`：成功
- `1`：失败
- `2`：执行中
     * @param TaskStatus 变更状态：
- `0`：成功
- `1`：失败
- `2`：执行中
     */
    public void setTaskStatus(Long TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    public ResourceTaskStatusResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceTaskStatusResult(ResourceTaskStatusResult source) {
        if (source.TaskStatus != null) {
            this.TaskStatus = new Long(source.TaskStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);

    }
}

