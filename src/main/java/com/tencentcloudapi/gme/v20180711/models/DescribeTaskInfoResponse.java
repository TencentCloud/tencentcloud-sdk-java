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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskInfoResponse extends AbstractModel {

    /**
    * 进行中的任务taskid（StartRecord接口返回）。
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 录制类型：1代表单流 2代表混流 3代表单流和混流。
    */
    @SerializedName("RecordMode")
    @Expose
    private Long RecordMode;

    /**
    * 指定订阅流白名单或者黑名单。
    */
    @SerializedName("SubscribeRecordUserIds")
    @Expose
    private SubscribeRecordUserIds SubscribeRecordUserIds;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 进行中的任务taskid（StartRecord接口返回）。 
     * @return TaskId 进行中的任务taskid（StartRecord接口返回）。
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 进行中的任务taskid（StartRecord接口返回）。
     * @param TaskId 进行中的任务taskid（StartRecord接口返回）。
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 录制类型：1代表单流 2代表混流 3代表单流和混流。 
     * @return RecordMode 录制类型：1代表单流 2代表混流 3代表单流和混流。
     */
    public Long getRecordMode() {
        return this.RecordMode;
    }

    /**
     * Set 录制类型：1代表单流 2代表混流 3代表单流和混流。
     * @param RecordMode 录制类型：1代表单流 2代表混流 3代表单流和混流。
     */
    public void setRecordMode(Long RecordMode) {
        this.RecordMode = RecordMode;
    }

    /**
     * Get 指定订阅流白名单或者黑名单。 
     * @return SubscribeRecordUserIds 指定订阅流白名单或者黑名单。
     */
    public SubscribeRecordUserIds getSubscribeRecordUserIds() {
        return this.SubscribeRecordUserIds;
    }

    /**
     * Set 指定订阅流白名单或者黑名单。
     * @param SubscribeRecordUserIds 指定订阅流白名单或者黑名单。
     */
    public void setSubscribeRecordUserIds(SubscribeRecordUserIds SubscribeRecordUserIds) {
        this.SubscribeRecordUserIds = SubscribeRecordUserIds;
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

    public DescribeTaskInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskInfoResponse(DescribeTaskInfoResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.RecordMode != null) {
            this.RecordMode = new Long(source.RecordMode);
        }
        if (source.SubscribeRecordUserIds != null) {
            this.SubscribeRecordUserIds = new SubscribeRecordUserIds(source.SubscribeRecordUserIds);
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
        this.setParamSimple(map, prefix + "RecordMode", this.RecordMode);
        this.setParamObj(map, prefix + "SubscribeRecordUserIds.", this.SubscribeRecordUserIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

