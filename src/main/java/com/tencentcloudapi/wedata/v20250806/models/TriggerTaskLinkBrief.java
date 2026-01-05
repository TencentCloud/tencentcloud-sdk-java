/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TriggerTaskLinkBrief extends AbstractModel {

    /**
    * 连接ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LinkId")
    @Expose
    private String LinkId;

    /**
    * 所属工作流ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 所属工作流版本ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowVersionId")
    @Expose
    private String WorkflowVersionId;

    /**
    * 上游任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpstreamTaskId")
    @Expose
    private String UpstreamTaskId;

    /**
    * 下游任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DownstreamTaskId")
    @Expose
    private String DownstreamTaskId;

    /**
     * Get 连接ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LinkId 连接ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLinkId() {
        return this.LinkId;
    }

    /**
     * Set 连接ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param LinkId 连接ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLinkId(String LinkId) {
        this.LinkId = LinkId;
    }

    /**
     * Get 所属工作流ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowId 所属工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 所属工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowId 所属工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get 所属工作流版本ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowVersionId 所属工作流版本ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowVersionId() {
        return this.WorkflowVersionId;
    }

    /**
     * Set 所属工作流版本ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowVersionId 所属工作流版本ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowVersionId(String WorkflowVersionId) {
        this.WorkflowVersionId = WorkflowVersionId;
    }

    /**
     * Get 上游任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpstreamTaskId 上游任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpstreamTaskId() {
        return this.UpstreamTaskId;
    }

    /**
     * Set 上游任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpstreamTaskId 上游任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpstreamTaskId(String UpstreamTaskId) {
        this.UpstreamTaskId = UpstreamTaskId;
    }

    /**
     * Get 下游任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DownstreamTaskId 下游任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDownstreamTaskId() {
        return this.DownstreamTaskId;
    }

    /**
     * Set 下游任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DownstreamTaskId 下游任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDownstreamTaskId(String DownstreamTaskId) {
        this.DownstreamTaskId = DownstreamTaskId;
    }

    public TriggerTaskLinkBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerTaskLinkBrief(TriggerTaskLinkBrief source) {
        if (source.LinkId != null) {
            this.LinkId = new String(source.LinkId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowVersionId != null) {
            this.WorkflowVersionId = new String(source.WorkflowVersionId);
        }
        if (source.UpstreamTaskId != null) {
            this.UpstreamTaskId = new String(source.UpstreamTaskId);
        }
        if (source.DownstreamTaskId != null) {
            this.DownstreamTaskId = new String(source.DownstreamTaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LinkId", this.LinkId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowVersionId", this.WorkflowVersionId);
        this.setParamSimple(map, prefix + "UpstreamTaskId", this.UpstreamTaskId);
        this.setParamSimple(map, prefix + "DownstreamTaskId", this.DownstreamTaskId);

    }
}

