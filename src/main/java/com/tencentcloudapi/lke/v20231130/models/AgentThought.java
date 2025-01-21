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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentThought extends AbstractModel {

    /**
    * 会话 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 请求 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
    * 对应哪条会话, 会话 ID, 用于回答的消息存储使用, 可提前生成, 保存消息时使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * 当前请求执行时间, 单位 ms
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Elapsed")
    @Expose
    private Long Elapsed;

    /**
    * 当前是否为工作流
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsWorkflow")
    @Expose
    private Boolean IsWorkflow;

    /**
    * 如果当前是工作流，工作流名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * 具体思考过程详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Procedures")
    @Expose
    private AgentProcedure [] Procedures;

    /**
    * TraceId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TraceId")
    @Expose
    private String TraceId;

    /**
     * Get 会话 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionId 会话 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 会话 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionId 会话 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 请求 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestId 请求 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 请求 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestId 请求 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Get 对应哪条会话, 会话 ID, 用于回答的消息存储使用, 可提前生成, 保存消息时使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordId 对应哪条会话, 会话 ID, 用于回答的消息存储使用, 可提前生成, 保存消息时使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 对应哪条会话, 会话 ID, 用于回答的消息存储使用, 可提前生成, 保存消息时使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordId 对应哪条会话, 会话 ID, 用于回答的消息存储使用, 可提前生成, 保存消息时使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get 当前请求执行时间, 单位 ms
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Elapsed 当前请求执行时间, 单位 ms
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getElapsed() {
        return this.Elapsed;
    }

    /**
     * Set 当前请求执行时间, 单位 ms
注意：此字段可能返回 null，表示取不到有效值。
     * @param Elapsed 当前请求执行时间, 单位 ms
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setElapsed(Long Elapsed) {
        this.Elapsed = Elapsed;
    }

    /**
     * Get 当前是否为工作流
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsWorkflow 当前是否为工作流
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsWorkflow() {
        return this.IsWorkflow;
    }

    /**
     * Set 当前是否为工作流
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsWorkflow 当前是否为工作流
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsWorkflow(Boolean IsWorkflow) {
        this.IsWorkflow = IsWorkflow;
    }

    /**
     * Get 如果当前是工作流，工作流名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowName 如果当前是工作流，工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set 如果当前是工作流，工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowName 如果当前是工作流，工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get 具体思考过程详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Procedures 具体思考过程详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AgentProcedure [] getProcedures() {
        return this.Procedures;
    }

    /**
     * Set 具体思考过程详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param Procedures 具体思考过程详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcedures(AgentProcedure [] Procedures) {
        this.Procedures = Procedures;
    }

    /**
     * Get TraceId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TraceId TraceId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTraceId() {
        return this.TraceId;
    }

    /**
     * Set TraceId
注意：此字段可能返回 null，表示取不到有效值。
     * @param TraceId TraceId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTraceId(String TraceId) {
        this.TraceId = TraceId;
    }

    public AgentThought() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentThought(AgentThought source) {
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.Elapsed != null) {
            this.Elapsed = new Long(source.Elapsed);
        }
        if (source.IsWorkflow != null) {
            this.IsWorkflow = new Boolean(source.IsWorkflow);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.Procedures != null) {
            this.Procedures = new AgentProcedure[source.Procedures.length];
            for (int i = 0; i < source.Procedures.length; i++) {
                this.Procedures[i] = new AgentProcedure(source.Procedures[i]);
            }
        }
        if (source.TraceId != null) {
            this.TraceId = new String(source.TraceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "Elapsed", this.Elapsed);
        this.setParamSimple(map, prefix + "IsWorkflow", this.IsWorkflow);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamArrayObj(map, prefix + "Procedures.", this.Procedures);
        this.setParamSimple(map, prefix + "TraceId", this.TraceId);

    }
}

