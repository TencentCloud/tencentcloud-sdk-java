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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveStreamProcessTask extends AbstractModel {

    /**
    * <p>媒体处理任务 ID。</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>任务流状态，取值：</p><li>PROCESSING：处理中；</li><li>FINISH：已完成。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>错误码，0 表示成功，其他值表示失败。</p>
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * <p>错误信息。</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>直播流 URL。</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get <p>媒体处理任务 ID。</p> 
     * @return TaskId <p>媒体处理任务 ID。</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>媒体处理任务 ID。</p>
     * @param TaskId <p>媒体处理任务 ID。</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>任务流状态，取值：</p><li>PROCESSING：处理中；</li><li>FINISH：已完成。</li> 
     * @return Status <p>任务流状态，取值：</p><li>PROCESSING：处理中；</li><li>FINISH：已完成。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务流状态，取值：</p><li>PROCESSING：处理中；</li><li>FINISH：已完成。</li>
     * @param Status <p>任务流状态，取值：</p><li>PROCESSING：处理中；</li><li>FINISH：已完成。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>错误码，0 表示成功，其他值表示失败。</p> 
     * @return ErrCode <p>错误码，0 表示成功，其他值表示失败。</p>
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set <p>错误码，0 表示成功，其他值表示失败。</p>
     * @param ErrCode <p>错误码，0 表示成功，其他值表示失败。</p>
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get <p>错误信息。</p> 
     * @return Message <p>错误信息。</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>错误信息。</p>
     * @param Message <p>错误信息。</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>直播流 URL。</p> 
     * @return Url <p>直播流 URL。</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>直播流 URL。</p>
     * @param Url <p>直播流 URL。</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public LiveStreamProcessTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveStreamProcessTask(LiveStreamProcessTask source) {
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
        if (source.Url != null) {
            this.Url = new String(source.Url);
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
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

