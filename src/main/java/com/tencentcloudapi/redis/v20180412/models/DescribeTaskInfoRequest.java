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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskInfoRequest extends AbstractModel {

    /**
    * 任务 ID, 请通过接口[DescribeTaskList](https://cloud.tencent.com/document/product/239/39374) 的返回参数 **Tasks** 的子参数 **TaskId** 获取。
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
     * Get 任务 ID, 请通过接口[DescribeTaskList](https://cloud.tencent.com/document/product/239/39374) 的返回参数 **Tasks** 的子参数 **TaskId** 获取。 
     * @return TaskId 任务 ID, 请通过接口[DescribeTaskList](https://cloud.tencent.com/document/product/239/39374) 的返回参数 **Tasks** 的子参数 **TaskId** 获取。
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务 ID, 请通过接口[DescribeTaskList](https://cloud.tencent.com/document/product/239/39374) 的返回参数 **Tasks** 的子参数 **TaskId** 获取。
     * @param TaskId 任务 ID, 请通过接口[DescribeTaskList](https://cloud.tencent.com/document/product/239/39374) 的返回参数 **Tasks** 的子参数 **TaskId** 获取。
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    public DescribeTaskInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskInfoRequest(DescribeTaskInfoRequest source) {
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

