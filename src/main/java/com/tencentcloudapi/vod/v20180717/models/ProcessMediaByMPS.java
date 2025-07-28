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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProcessMediaByMPS extends AbstractModel {

    /**
    * 任务 ID。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务状态，取值：<li>PROCESSING：处理中；</li><li>FINISH：已完成。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 错误码。源异常时返回非0错误码，返回0时请使用各个具体任务的 ErrCode。
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * 错误信息。源异常时返回对应异常 Message，否则请使用各个具体任务的 Message。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * MPS 视频处理任务。
    */
    @SerializedName("SubTaskSet")
    @Expose
    private MPSSubTaskResult [] SubTaskSet;

    /**
     * Get 任务 ID。 
     * @return TaskId 任务 ID。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务 ID。
     * @param TaskId 任务 ID。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务状态，取值：<li>PROCESSING：处理中；</li><li>FINISH：已完成。</li> 
     * @return Status 任务状态，取值：<li>PROCESSING：处理中；</li><li>FINISH：已完成。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态，取值：<li>PROCESSING：处理中；</li><li>FINISH：已完成。</li>
     * @param Status 任务状态，取值：<li>PROCESSING：处理中；</li><li>FINISH：已完成。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 错误码。源异常时返回非0错误码，返回0时请使用各个具体任务的 ErrCode。 
     * @return ErrCode 错误码。源异常时返回非0错误码，返回0时请使用各个具体任务的 ErrCode。
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set 错误码。源异常时返回非0错误码，返回0时请使用各个具体任务的 ErrCode。
     * @param ErrCode 错误码。源异常时返回非0错误码，返回0时请使用各个具体任务的 ErrCode。
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get 错误信息。源异常时返回对应异常 Message，否则请使用各个具体任务的 Message。 
     * @return Message 错误信息。源异常时返回对应异常 Message，否则请使用各个具体任务的 Message。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 错误信息。源异常时返回对应异常 Message，否则请使用各个具体任务的 Message。
     * @param Message 错误信息。源异常时返回对应异常 Message，否则请使用各个具体任务的 Message。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get MPS 视频处理任务。 
     * @return SubTaskSet MPS 视频处理任务。
     */
    public MPSSubTaskResult [] getSubTaskSet() {
        return this.SubTaskSet;
    }

    /**
     * Set MPS 视频处理任务。
     * @param SubTaskSet MPS 视频处理任务。
     */
    public void setSubTaskSet(MPSSubTaskResult [] SubTaskSet) {
        this.SubTaskSet = SubTaskSet;
    }

    public ProcessMediaByMPS() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessMediaByMPS(ProcessMediaByMPS source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.SubTaskSet != null) {
            this.SubTaskSet = new MPSSubTaskResult[source.SubTaskSet.length];
            for (int i = 0; i < source.SubTaskSet.length; i++) {
                this.SubTaskSet[i] = new MPSSubTaskResult(source.SubTaskSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamArrayObj(map, prefix + "SubTaskSet.", this.SubTaskSet);

    }
}

