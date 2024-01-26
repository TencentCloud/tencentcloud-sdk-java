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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdhocSubTaskDto extends AbstractModel {

    /**
    * 子任务id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 子任务开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 子任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 子任务状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 子任务sql内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScriptContent")
    @Expose
    private String ScriptContent;

    /**
    * 提交任务id
    */
    @SerializedName("RecordId")
    @Expose
    private Long RecordId;

    /**
    * 子任务执行时长
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
     * Get 子任务id 
     * @return Id 子任务id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 子任务id
     * @param Id 子任务id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 子任务开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 子任务开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 子任务开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 子任务开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 子任务结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 子任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 子任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 子任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 子任务状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 子任务状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 子任务状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 子任务状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 子任务sql内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScriptContent 子任务sql内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScriptContent() {
        return this.ScriptContent;
    }

    /**
     * Set 子任务sql内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScriptContent 子任务sql内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScriptContent(String ScriptContent) {
        this.ScriptContent = ScriptContent;
    }

    /**
     * Get 提交任务id 
     * @return RecordId 提交任务id
     */
    public Long getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 提交任务id
     * @param RecordId 提交任务id
     */
    public void setRecordId(Long RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get 子任务执行时长 
     * @return Duration 子任务执行时长
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set 子任务执行时长
     * @param Duration 子任务执行时长
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    public AdhocSubTaskDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdhocSubTaskDto(AdhocSubTaskDto source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ScriptContent != null) {
            this.ScriptContent = new String(source.ScriptContent);
        }
        if (source.RecordId != null) {
            this.RecordId = new Long(source.RecordId);
        }
        if (source.Duration != null) {
            this.Duration = new String(source.Duration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ScriptContent", this.ScriptContent);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "Duration", this.Duration);

    }
}

