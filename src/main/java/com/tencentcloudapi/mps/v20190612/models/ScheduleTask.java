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

public class ScheduleTask extends AbstractModel{

    /**
    * 编排任务 ID。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务流状态，取值：
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 源异常时返回非0错误码，返回0 时请使用各个具体任务的 ErrCode。
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * 源异常时返回对应异常Message，否则请使用各个具体任务的 Message。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 媒体处理的目标文件信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputInfo")
    @Expose
    private MediaInputInfo InputInfo;

    /**
    * 原始视频的元信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
    * 编排任务输出。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActivityResultSet")
    @Expose
    private ActivityResult [] ActivityResultSet;

    /**
     * Get 编排任务 ID。 
     * @return TaskId 编排任务 ID。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 编排任务 ID。
     * @param TaskId 编排任务 ID。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务流状态，取值：
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成。</li> 
     * @return Status 任务流状态，取值：
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务流状态，取值：
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成。</li>
     * @param Status 任务流状态，取值：
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 源异常时返回非0错误码，返回0 时请使用各个具体任务的 ErrCode。 
     * @return ErrCode 源异常时返回非0错误码，返回0 时请使用各个具体任务的 ErrCode。
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set 源异常时返回非0错误码，返回0 时请使用各个具体任务的 ErrCode。
     * @param ErrCode 源异常时返回非0错误码，返回0 时请使用各个具体任务的 ErrCode。
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get 源异常时返回对应异常Message，否则请使用各个具体任务的 Message。 
     * @return Message 源异常时返回对应异常Message，否则请使用各个具体任务的 Message。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 源异常时返回对应异常Message，否则请使用各个具体任务的 Message。
     * @param Message 源异常时返回对应异常Message，否则请使用各个具体任务的 Message。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 媒体处理的目标文件信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputInfo 媒体处理的目标文件信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaInputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set 媒体处理的目标文件信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputInfo 媒体处理的目标文件信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputInfo(MediaInputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get 原始视频的元信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetaData 原始视频的元信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * Set 原始视频的元信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetaData 原始视频的元信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetaData(MediaMetaData MetaData) {
        this.MetaData = MetaData;
    }

    /**
     * Get 编排任务输出。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActivityResultSet 编排任务输出。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ActivityResult [] getActivityResultSet() {
        return this.ActivityResultSet;
    }

    /**
     * Set 编排任务输出。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActivityResultSet 编排任务输出。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActivityResultSet(ActivityResult [] ActivityResultSet) {
        this.ActivityResultSet = ActivityResultSet;
    }

    public ScheduleTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScheduleTask(ScheduleTask source) {
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
        if (source.InputInfo != null) {
            this.InputInfo = new MediaInputInfo(source.InputInfo);
        }
        if (source.MetaData != null) {
            this.MetaData = new MediaMetaData(source.MetaData);
        }
        if (source.ActivityResultSet != null) {
            this.ActivityResultSet = new ActivityResult[source.ActivityResultSet.length];
            for (int i = 0; i < source.ActivityResultSet.length; i++) {
                this.ActivityResultSet[i] = new ActivityResult(source.ActivityResultSet[i]);
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
        this.setParamObj(map, prefix + "InputInfo.", this.InputInfo);
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);
        this.setParamArrayObj(map, prefix + "ActivityResultSet.", this.ActivityResultSet);

    }
}

