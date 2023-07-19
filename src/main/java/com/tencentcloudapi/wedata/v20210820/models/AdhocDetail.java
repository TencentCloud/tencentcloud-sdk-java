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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdhocDetail extends AbstractModel{

    /**
    * 子任务记录Id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 脚本内容
    */
    @SerializedName("ScriptContent")
    @Expose
    private String ScriptContent;

    /**
    * 任务启动时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 当前任务状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 提交任务id
    */
    @SerializedName("RecordId")
    @Expose
    private Long RecordId;

    /**
     * Get 子任务记录Id 
     * @return Id 子任务记录Id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 子任务记录Id
     * @param Id 子任务记录Id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 脚本内容 
     * @return ScriptContent 脚本内容
     */
    public String getScriptContent() {
        return this.ScriptContent;
    }

    /**
     * Set 脚本内容
     * @param ScriptContent 脚本内容
     */
    public void setScriptContent(String ScriptContent) {
        this.ScriptContent = ScriptContent;
    }

    /**
     * Get 任务启动时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 任务启动时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 任务启动时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 任务启动时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 任务结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 当前任务状态 
     * @return Status 当前任务状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 当前任务状态
     * @param Status 当前任务状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
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

    public AdhocDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdhocDetail(AdhocDetail source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.ScriptContent != null) {
            this.ScriptContent = new String(source.ScriptContent);
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
        if (source.RecordId != null) {
            this.RecordId = new Long(source.RecordId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ScriptContent", this.ScriptContent);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);

    }
}

