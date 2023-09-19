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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveScheduleTask extends AbstractModel{

    /**
    * 直播编排任务 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务流状态，取值：
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 源异常时返回非0错误码，返回0 时请使用各个具体任务的 ErrCode。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * 源异常时返回对应异常Message，否则请使用各个具体任务的 Message。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 直播流 URL。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 直播编排任务输出。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LiveActivityResultSet")
    @Expose
    private LiveActivityResult [] LiveActivityResultSet;

    /**
     * Get 直播编排任务 ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 直播编排任务 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 直播编排任务 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 直播编排任务 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务流状态，取值：
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成。</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 任务流状态，取值：
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务流状态，取值：
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 任务流状态，取值：
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 源异常时返回非0错误码，返回0 时请使用各个具体任务的 ErrCode。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrCode 源异常时返回非0错误码，返回0 时请使用各个具体任务的 ErrCode。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set 源异常时返回非0错误码，返回0 时请使用各个具体任务的 ErrCode。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrCode 源异常时返回非0错误码，返回0 时请使用各个具体任务的 ErrCode。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get 源异常时返回对应异常Message，否则请使用各个具体任务的 Message。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message 源异常时返回对应异常Message，否则请使用各个具体任务的 Message。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 源异常时返回对应异常Message，否则请使用各个具体任务的 Message。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 源异常时返回对应异常Message，否则请使用各个具体任务的 Message。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 直播流 URL。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Url 直播流 URL。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 直播流 URL。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Url 直播流 URL。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 直播编排任务输出。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LiveActivityResultSet 直播编排任务输出。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LiveActivityResult [] getLiveActivityResultSet() {
        return this.LiveActivityResultSet;
    }

    /**
     * Set 直播编排任务输出。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LiveActivityResultSet 直播编排任务输出。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLiveActivityResultSet(LiveActivityResult [] LiveActivityResultSet) {
        this.LiveActivityResultSet = LiveActivityResultSet;
    }

    public LiveScheduleTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveScheduleTask(LiveScheduleTask source) {
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
        if (source.LiveActivityResultSet != null) {
            this.LiveActivityResultSet = new LiveActivityResult[source.LiveActivityResultSet.length];
            for (int i = 0; i < source.LiveActivityResultSet.length; i++) {
                this.LiveActivityResultSet[i] = new LiveActivityResult(source.LiveActivityResultSet[i]);
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
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamArrayObj(map, prefix + "LiveActivityResultSet.", this.LiveActivityResultSet);

    }
}

