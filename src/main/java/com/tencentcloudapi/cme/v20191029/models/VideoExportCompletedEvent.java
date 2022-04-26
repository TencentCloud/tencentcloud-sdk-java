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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoExportCompletedEvent extends AbstractModel{

    /**
    * 任务 Id。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务状态，取值有：
<li>SUCCESS：成功；</li>
<li>FAIL：失败。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 错误码，取值有：
<li>0：成功；</li>
<li>其他值：失败。</li>
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * 错误信息。
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * 任务输出。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Output")
    @Expose
    private VideoEditProjectOutput Output;

    /**
     * Get 任务 Id。 
     * @return TaskId 任务 Id。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务 Id。
     * @param TaskId 任务 Id。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务状态，取值有：
<li>SUCCESS：成功；</li>
<li>FAIL：失败。</li> 
     * @return Status 任务状态，取值有：
<li>SUCCESS：成功；</li>
<li>FAIL：失败。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态，取值有：
<li>SUCCESS：成功；</li>
<li>FAIL：失败。</li>
     * @param Status 任务状态，取值有：
<li>SUCCESS：成功；</li>
<li>FAIL：失败。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 错误码，取值有：
<li>0：成功；</li>
<li>其他值：失败。</li> 
     * @return ErrCode 错误码，取值有：
<li>0：成功；</li>
<li>其他值：失败。</li>
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set 错误码，取值有：
<li>0：成功；</li>
<li>其他值：失败。</li>
     * @param ErrCode 错误码，取值有：
<li>0：成功；</li>
<li>其他值：失败。</li>
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get 错误信息。 
     * @return ErrMsg 错误信息。
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set 错误信息。
     * @param ErrMsg 错误信息。
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Get 任务输出。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Output 任务输出。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VideoEditProjectOutput getOutput() {
        return this.Output;
    }

    /**
     * Set 任务输出。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Output 任务输出。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutput(VideoEditProjectOutput Output) {
        this.Output = Output;
    }

    public VideoExportCompletedEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoExportCompletedEvent(VideoExportCompletedEvent source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
        if (source.Output != null) {
            this.Output = new VideoEditProjectOutput(source.Output);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamObj(map, prefix + "Output.", this.Output);

    }
}

