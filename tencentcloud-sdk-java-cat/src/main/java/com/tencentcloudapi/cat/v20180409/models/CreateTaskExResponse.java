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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTaskExResponse extends AbstractModel{

    /**
    * 拨测结果查询ID。接下来可以使用查询拨测是否能够成功，验证能否通过。
    */
    @SerializedName("ResultId")
    @Expose
    private Long ResultId;

    /**
    * 拨测任务ID。验证通过后，创建任务时使用，传递给CreateTask 接口。
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 拨测结果查询ID。接下来可以使用查询拨测是否能够成功，验证能否通过。 
     * @return ResultId 拨测结果查询ID。接下来可以使用查询拨测是否能够成功，验证能否通过。
     */
    public Long getResultId() {
        return this.ResultId;
    }

    /**
     * Set 拨测结果查询ID。接下来可以使用查询拨测是否能够成功，验证能否通过。
     * @param ResultId 拨测结果查询ID。接下来可以使用查询拨测是否能够成功，验证能否通过。
     */
    public void setResultId(Long ResultId) {
        this.ResultId = ResultId;
    }

    /**
     * Get 拨测任务ID。验证通过后，创建任务时使用，传递给CreateTask 接口。 
     * @return TaskId 拨测任务ID。验证通过后，创建任务时使用，传递给CreateTask 接口。
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 拨测任务ID。验证通过后，创建任务时使用，传递给CreateTask 接口。
     * @param TaskId 拨测任务ID。验证通过后，创建任务时使用，传递给CreateTask 接口。
     */
    public void setTaskId(Long TaskId) {
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResultId", this.ResultId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

