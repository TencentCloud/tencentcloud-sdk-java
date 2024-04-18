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

public class Content extends AbstractModel {

    /**
    * 任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 诊断
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Diagnose")
    @Expose
    private String Diagnose;

    /**
    * 理由
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 操作
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 链接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get 任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 诊断
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Diagnose 诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiagnose() {
        return this.Diagnose;
    }

    /**
     * Set 诊断
注意：此字段可能返回 null，表示取不到有效值。
     * @param Diagnose 诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiagnose(String Diagnose) {
        this.Diagnose = Diagnose;
    }

    /**
     * Get 理由
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Reason 理由
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 理由
注意：此字段可能返回 null，表示取不到有效值。
     * @param Reason 理由
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 操作
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Operation 操作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作
注意：此字段可能返回 null，表示取不到有效值。
     * @param Operation 操作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 链接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Url 链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 链接
注意：此字段可能返回 null，表示取不到有效值。
     * @param Url 链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public Content() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Content(Content source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.Diagnose != null) {
            this.Diagnose = new String(source.Diagnose);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
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
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "Diagnose", this.Diagnose);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

