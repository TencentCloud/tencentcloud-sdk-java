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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NotebookSessionStatementBatchInformation extends AbstractModel{

    /**
    * 任务详情列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotebookSessionStatementBatch")
    @Expose
    private NotebookSessionStatementInfo [] NotebookSessionStatementBatch;

    /**
    * 当前批任务是否运行完成
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsAvailable")
    @Expose
    private Boolean IsAvailable;

    /**
    * Session唯一标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Batch唯一标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BatchId")
    @Expose
    private String BatchId;

    /**
     * Get 任务详情列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NotebookSessionStatementBatch 任务详情列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NotebookSessionStatementInfo [] getNotebookSessionStatementBatch() {
        return this.NotebookSessionStatementBatch;
    }

    /**
     * Set 任务详情列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotebookSessionStatementBatch 任务详情列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotebookSessionStatementBatch(NotebookSessionStatementInfo [] NotebookSessionStatementBatch) {
        this.NotebookSessionStatementBatch = NotebookSessionStatementBatch;
    }

    /**
     * Get 当前批任务是否运行完成
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsAvailable 当前批任务是否运行完成
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsAvailable() {
        return this.IsAvailable;
    }

    /**
     * Set 当前批任务是否运行完成
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsAvailable 当前批任务是否运行完成
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsAvailable(Boolean IsAvailable) {
        this.IsAvailable = IsAvailable;
    }

    /**
     * Get Session唯一标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionId Session唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set Session唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionId Session唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Batch唯一标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BatchId Batch唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBatchId() {
        return this.BatchId;
    }

    /**
     * Set Batch唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param BatchId Batch唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBatchId(String BatchId) {
        this.BatchId = BatchId;
    }

    public NotebookSessionStatementBatchInformation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NotebookSessionStatementBatchInformation(NotebookSessionStatementBatchInformation source) {
        if (source.NotebookSessionStatementBatch != null) {
            this.NotebookSessionStatementBatch = new NotebookSessionStatementInfo[source.NotebookSessionStatementBatch.length];
            for (int i = 0; i < source.NotebookSessionStatementBatch.length; i++) {
                this.NotebookSessionStatementBatch[i] = new NotebookSessionStatementInfo(source.NotebookSessionStatementBatch[i]);
            }
        }
        if (source.IsAvailable != null) {
            this.IsAvailable = new Boolean(source.IsAvailable);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.BatchId != null) {
            this.BatchId = new String(source.BatchId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "NotebookSessionStatementBatch.", this.NotebookSessionStatementBatch);
        this.setParamSimple(map, prefix + "IsAvailable", this.IsAvailable);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "BatchId", this.BatchId);

    }
}

