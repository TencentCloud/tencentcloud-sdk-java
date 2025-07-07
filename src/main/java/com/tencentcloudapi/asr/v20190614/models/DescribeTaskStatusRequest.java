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
package com.tencentcloudapi.asr.v20190614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskStatusRequest extends AbstractModel {

    /**
    * 从CreateRecTask接口获取的TaskId，用于获取任务状态与结果。
**注意：TaskId有效期为24小时，超过24小时的TaskId请不要再查询。**
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
     * Get 从CreateRecTask接口获取的TaskId，用于获取任务状态与结果。
**注意：TaskId有效期为24小时，超过24小时的TaskId请不要再查询。** 
     * @return TaskId 从CreateRecTask接口获取的TaskId，用于获取任务状态与结果。
**注意：TaskId有效期为24小时，超过24小时的TaskId请不要再查询。**
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 从CreateRecTask接口获取的TaskId，用于获取任务状态与结果。
**注意：TaskId有效期为24小时，超过24小时的TaskId请不要再查询。**
     * @param TaskId 从CreateRecTask接口获取的TaskId，用于获取任务状态与结果。
**注意：TaskId有效期为24小时，超过24小时的TaskId请不要再查询。**
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    public DescribeTaskStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskStatusRequest(DescribeTaskStatusRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);

    }
}

