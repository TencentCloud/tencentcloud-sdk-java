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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetJobStatusResponse extends AbstractModel {

    /**
    * 异步任务id
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 是否已完成
    */
    @SerializedName("Completed")
    @Expose
    private Boolean Completed;

    /**
    * 任务状态,Success:成功,Fail:失败,Cancel:取消,Running:运行中
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 创建时间时间戳,单位毫秒
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 错误信息
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 异步任务id 
     * @return JobId 异步任务id
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 异步任务id
     * @param JobId 异步任务id
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 是否已完成 
     * @return Completed 是否已完成
     */
    public Boolean getCompleted() {
        return this.Completed;
    }

    /**
     * Set 是否已完成
     * @param Completed 是否已完成
     */
    public void setCompleted(Boolean Completed) {
        this.Completed = Completed;
    }

    /**
     * Get 任务状态,Success:成功,Fail:失败,Cancel:取消,Running:运行中 
     * @return Status 任务状态,Success:成功,Fail:失败,Cancel:取消,Running:运行中
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态,Success:成功,Fail:失败,Cancel:取消,Running:运行中
     * @param Status 任务状态,Success:成功,Fail:失败,Cancel:取消,Running:运行中
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间时间戳,单位毫秒 
     * @return CreateTime 创建时间时间戳,单位毫秒
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间时间戳,单位毫秒
     * @param CreateTime 创建时间时间戳,单位毫秒
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 错误信息 
     * @return ErrorMessage 错误信息
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set 错误信息
     * @param ErrorMessage 错误信息
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
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

    public GetJobStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetJobStatusResponse(GetJobStatusResponse source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.Completed != null) {
            this.Completed = new Boolean(source.Completed);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "Completed", this.Completed);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

