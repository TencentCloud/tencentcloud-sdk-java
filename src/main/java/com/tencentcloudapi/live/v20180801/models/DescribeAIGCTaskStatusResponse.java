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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAIGCTaskStatusResponse extends AbstractModel {

    /**
    * <p>任务ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>状态</p><p>枚举值：</p><ul><li>FINISHED： 1</li></ul>
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * <p>输出url</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputUrl")
    @Expose
    private String OutputUrl;

    /**
    * <p>任务创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>任务调度时间</p>
    */
    @SerializedName("ScheduledTime")
    @Expose
    private String ScheduledTime;

    /**
    * <p>任务完成时间</p>
    */
    @SerializedName("FinishedTime")
    @Expose
    private String FinishedTime;

    /**
    * <p>任务错误码</p>
    */
    @SerializedName("TaskResultCode")
    @Expose
    private Long TaskResultCode;

    /**
    * <p>任务返回错误信息</p>
    */
    @SerializedName("TaskResultMsg")
    @Expose
    private String TaskResultMsg;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>任务ID</p> 
     * @return TaskId <p>任务ID</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务ID</p>
     * @param TaskId <p>任务ID</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>状态</p><p>枚举值：</p><ul><li>FINISHED： 1</li></ul> 
     * @return TaskStatus <p>状态</p><p>枚举值：</p><ul><li>FINISHED： 1</li></ul>
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set <p>状态</p><p>枚举值：</p><ul><li>FINISHED： 1</li></ul>
     * @param TaskStatus <p>状态</p><p>枚举值：</p><ul><li>FINISHED： 1</li></ul>
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get <p>输出url</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputUrl <p>输出url</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutputUrl() {
        return this.OutputUrl;
    }

    /**
     * Set <p>输出url</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputUrl <p>输出url</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputUrl(String OutputUrl) {
        this.OutputUrl = OutputUrl;
    }

    /**
     * Get <p>任务创建时间</p> 
     * @return CreateTime <p>任务创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>任务创建时间</p>
     * @param CreateTime <p>任务创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>任务调度时间</p> 
     * @return ScheduledTime <p>任务调度时间</p>
     */
    public String getScheduledTime() {
        return this.ScheduledTime;
    }

    /**
     * Set <p>任务调度时间</p>
     * @param ScheduledTime <p>任务调度时间</p>
     */
    public void setScheduledTime(String ScheduledTime) {
        this.ScheduledTime = ScheduledTime;
    }

    /**
     * Get <p>任务完成时间</p> 
     * @return FinishedTime <p>任务完成时间</p>
     */
    public String getFinishedTime() {
        return this.FinishedTime;
    }

    /**
     * Set <p>任务完成时间</p>
     * @param FinishedTime <p>任务完成时间</p>
     */
    public void setFinishedTime(String FinishedTime) {
        this.FinishedTime = FinishedTime;
    }

    /**
     * Get <p>任务错误码</p> 
     * @return TaskResultCode <p>任务错误码</p>
     */
    public Long getTaskResultCode() {
        return this.TaskResultCode;
    }

    /**
     * Set <p>任务错误码</p>
     * @param TaskResultCode <p>任务错误码</p>
     */
    public void setTaskResultCode(Long TaskResultCode) {
        this.TaskResultCode = TaskResultCode;
    }

    /**
     * Get <p>任务返回错误信息</p> 
     * @return TaskResultMsg <p>任务返回错误信息</p>
     */
    public String getTaskResultMsg() {
        return this.TaskResultMsg;
    }

    /**
     * Set <p>任务返回错误信息</p>
     * @param TaskResultMsg <p>任务返回错误信息</p>
     */
    public void setTaskResultMsg(String TaskResultMsg) {
        this.TaskResultMsg = TaskResultMsg;
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

    public DescribeAIGCTaskStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAIGCTaskStatusResponse(DescribeAIGCTaskStatusResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
        if (source.OutputUrl != null) {
            this.OutputUrl = new String(source.OutputUrl);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ScheduledTime != null) {
            this.ScheduledTime = new String(source.ScheduledTime);
        }
        if (source.FinishedTime != null) {
            this.FinishedTime = new String(source.FinishedTime);
        }
        if (source.TaskResultCode != null) {
            this.TaskResultCode = new Long(source.TaskResultCode);
        }
        if (source.TaskResultMsg != null) {
            this.TaskResultMsg = new String(source.TaskResultMsg);
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
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "OutputUrl", this.OutputUrl);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ScheduledTime", this.ScheduledTime);
        this.setParamSimple(map, prefix + "FinishedTime", this.FinishedTime);
        this.setParamSimple(map, prefix + "TaskResultCode", this.TaskResultCode);
        this.setParamSimple(map, prefix + "TaskResultMsg", this.TaskResultMsg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

