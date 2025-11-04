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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIntegrateTaskResponse extends AbstractModel {

    /**
    * 当前步骤
    */
    @SerializedName("CurrentStep")
    @Expose
    private String CurrentStep;

    /**
    * 当前进度
    */
    @SerializedName("CurrentProgress")
    @Expose
    private String CurrentProgress;

    /**
    * 任务状态
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 当前步骤 
     * @return CurrentStep 当前步骤
     */
    public String getCurrentStep() {
        return this.CurrentStep;
    }

    /**
     * Set 当前步骤
     * @param CurrentStep 当前步骤
     */
    public void setCurrentStep(String CurrentStep) {
        this.CurrentStep = CurrentStep;
    }

    /**
     * Get 当前进度 
     * @return CurrentProgress 当前进度
     */
    public String getCurrentProgress() {
        return this.CurrentProgress;
    }

    /**
     * Set 当前进度
     * @param CurrentProgress 当前进度
     */
    public void setCurrentProgress(String CurrentProgress) {
        this.CurrentProgress = CurrentProgress;
    }

    /**
     * Get 任务状态 
     * @return TaskStatus 任务状态
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 任务状态
     * @param TaskStatus 任务状态
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeIntegrateTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIntegrateTaskResponse(DescribeIntegrateTaskResponse source) {
        if (source.CurrentStep != null) {
            this.CurrentStep = new String(source.CurrentStep);
        }
        if (source.CurrentProgress != null) {
            this.CurrentProgress = new String(source.CurrentProgress);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CurrentStep", this.CurrentStep);
        this.setParamSimple(map, prefix + "CurrentProgress", this.CurrentProgress);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

