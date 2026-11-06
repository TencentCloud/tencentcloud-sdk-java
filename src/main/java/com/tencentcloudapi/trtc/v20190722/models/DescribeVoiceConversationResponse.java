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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVoiceConversationResponse extends AbstractModel {

    /**
    * <p>任务启动时间</p><p>单位：毫秒</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>转录任务状态。</p><p>枚举值：</p><ul><li>Idle： 表示当前转录任务空闲中 </li><li>InProgress： 表示当前转录任务正在进行中</li><li>Exited： 表示当前转录任务正在退出的过程中</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>转录任务的唯一Id。</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>历史对话信息。</p>
    */
    @SerializedName("HistoryContents")
    @Expose
    private VoiceConversationHistoryContent [] HistoryContents;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>任务启动时间</p><p>单位：毫秒</p> 
     * @return StartTime <p>任务启动时间</p><p>单位：毫秒</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>任务启动时间</p><p>单位：毫秒</p>
     * @param StartTime <p>任务启动时间</p><p>单位：毫秒</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>转录任务状态。</p><p>枚举值：</p><ul><li>Idle： 表示当前转录任务空闲中 </li><li>InProgress： 表示当前转录任务正在进行中</li><li>Exited： 表示当前转录任务正在退出的过程中</li></ul> 
     * @return Status <p>转录任务状态。</p><p>枚举值：</p><ul><li>Idle： 表示当前转录任务空闲中 </li><li>InProgress： 表示当前转录任务正在进行中</li><li>Exited： 表示当前转录任务正在退出的过程中</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>转录任务状态。</p><p>枚举值：</p><ul><li>Idle： 表示当前转录任务空闲中 </li><li>InProgress： 表示当前转录任务正在进行中</li><li>Exited： 表示当前转录任务正在退出的过程中</li></ul>
     * @param Status <p>转录任务状态。</p><p>枚举值：</p><ul><li>Idle： 表示当前转录任务空闲中 </li><li>InProgress： 表示当前转录任务正在进行中</li><li>Exited： 表示当前转录任务正在退出的过程中</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>转录任务的唯一Id。</p> 
     * @return TaskId <p>转录任务的唯一Id。</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>转录任务的唯一Id。</p>
     * @param TaskId <p>转录任务的唯一Id。</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>历史对话信息。</p> 
     * @return HistoryContents <p>历史对话信息。</p>
     */
    public VoiceConversationHistoryContent [] getHistoryContents() {
        return this.HistoryContents;
    }

    /**
     * Set <p>历史对话信息。</p>
     * @param HistoryContents <p>历史对话信息。</p>
     */
    public void setHistoryContents(VoiceConversationHistoryContent [] HistoryContents) {
        this.HistoryContents = HistoryContents;
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

    public DescribeVoiceConversationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVoiceConversationResponse(DescribeVoiceConversationResponse source) {
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.HistoryContents != null) {
            this.HistoryContents = new VoiceConversationHistoryContent[source.HistoryContents.length];
            for (int i = 0; i < source.HistoryContents.length; i++) {
                this.HistoryContents[i] = new VoiceConversationHistoryContent(source.HistoryContents[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArrayObj(map, prefix + "HistoryContents.", this.HistoryContents);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

