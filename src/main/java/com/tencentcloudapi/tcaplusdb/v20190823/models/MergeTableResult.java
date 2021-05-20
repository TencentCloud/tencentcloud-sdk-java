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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MergeTableResult extends AbstractModel{

    /**
    * 任务Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 成功时此字段返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Error")
    @Expose
    private ErrorInfo Error;

    /**
    * 对比的表格信息
    */
    @SerializedName("Table")
    @Expose
    private CompareTablesInfo Table;

    /**
    * 申请单Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
     * Get 任务Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 成功时此字段返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Error 成功时此字段返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ErrorInfo getError() {
        return this.Error;
    }

    /**
     * Set 成功时此字段返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Error 成功时此字段返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setError(ErrorInfo Error) {
        this.Error = Error;
    }

    /**
     * Get 对比的表格信息 
     * @return Table 对比的表格信息
     */
    public CompareTablesInfo getTable() {
        return this.Table;
    }

    /**
     * Set 对比的表格信息
     * @param Table 对比的表格信息
     */
    public void setTable(CompareTablesInfo Table) {
        this.Table = Table;
    }

    /**
     * Get 申请单Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationId 申请单Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 申请单Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationId 申请单Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    public MergeTableResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MergeTableResult(MergeTableResult source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Error != null) {
            this.Error = new ErrorInfo(source.Error);
        }
        if (source.Table != null) {
            this.Table = new CompareTablesInfo(source.Table);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamObj(map, prefix + "Error.", this.Error);
        this.setParamObj(map, prefix + "Table.", this.Table);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);

    }
}

