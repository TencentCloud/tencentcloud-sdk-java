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

public class WorkflowCanvasOplog extends AbstractModel {

    /**
    * 创建时间，时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTimestamp")
    @Expose
    private Long CreateTimestamp;

    /**
    * 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 操作人ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperatorId")
    @Expose
    private Long OperatorId;

    /**
    * 操作人名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperatorName")
    @Expose
    private String OperatorName;

    /**
    * 操作日志
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get 创建时间，时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTimestamp 创建时间，时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTimestamp() {
        return this.CreateTimestamp;
    }

    /**
     * Set 创建时间，时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTimestamp 创建时间，时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTimestamp(Long CreateTimestamp) {
        this.CreateTimestamp = CreateTimestamp;
    }

    /**
     * Get 工作流ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowId 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowId 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get 操作人ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperatorId 操作人ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOperatorId() {
        return this.OperatorId;
    }

    /**
     * Set 操作人ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperatorId 操作人ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperatorId(Long OperatorId) {
        this.OperatorId = OperatorId;
    }

    /**
     * Get 操作人名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperatorName 操作人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperatorName() {
        return this.OperatorName;
    }

    /**
     * Set 操作人名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperatorName 操作人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperatorName(String OperatorName) {
        this.OperatorName = OperatorName;
    }

    /**
     * Get 操作日志
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content 操作日志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 操作日志
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content 操作日志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public WorkflowCanvasOplog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowCanvasOplog(WorkflowCanvasOplog source) {
        if (source.CreateTimestamp != null) {
            this.CreateTimestamp = new Long(source.CreateTimestamp);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.OperatorId != null) {
            this.OperatorId = new Long(source.OperatorId);
        }
        if (source.OperatorName != null) {
            this.OperatorName = new String(source.OperatorName);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateTimestamp", this.CreateTimestamp);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "OperatorId", this.OperatorId);
        this.setParamSimple(map, prefix + "OperatorName", this.OperatorName);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

