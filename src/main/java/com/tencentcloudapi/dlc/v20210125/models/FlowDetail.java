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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowDetail extends AbstractModel {

    /**
    * <p>流程ID（数据库主键）</p>
    */
    @SerializedName("FlowId")
    @Expose
    private Long FlowId;

    /**
    * <p>Temporal Workflow ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkFlowId")
    @Expose
    private String WorkFlowId;

    /**
    * <p>流程编码</p>
    */
    @SerializedName("WorkFlowCode")
    @Expose
    private String WorkFlowCode;

    /**
    * <p>流程进度，0~100</p>
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * <p>流程状态</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>流程活动列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Activities")
    @Expose
    private FlowActivityDetail [] Activities;

    /**
     * Get <p>流程ID（数据库主键）</p> 
     * @return FlowId <p>流程ID（数据库主键）</p>
     */
    public Long getFlowId() {
        return this.FlowId;
    }

    /**
     * Set <p>流程ID（数据库主键）</p>
     * @param FlowId <p>流程ID（数据库主键）</p>
     */
    public void setFlowId(Long FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get <p>Temporal Workflow ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkFlowId <p>Temporal Workflow ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkFlowId() {
        return this.WorkFlowId;
    }

    /**
     * Set <p>Temporal Workflow ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkFlowId <p>Temporal Workflow ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkFlowId(String WorkFlowId) {
        this.WorkFlowId = WorkFlowId;
    }

    /**
     * Get <p>流程编码</p> 
     * @return WorkFlowCode <p>流程编码</p>
     */
    public String getWorkFlowCode() {
        return this.WorkFlowCode;
    }

    /**
     * Set <p>流程编码</p>
     * @param WorkFlowCode <p>流程编码</p>
     */
    public void setWorkFlowCode(String WorkFlowCode) {
        this.WorkFlowCode = WorkFlowCode;
    }

    /**
     * Get <p>流程进度，0~100</p> 
     * @return Progress <p>流程进度，0~100</p>
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set <p>流程进度，0~100</p>
     * @param Progress <p>流程进度，0~100</p>
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get <p>流程状态</p> 
     * @return Status <p>流程状态</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>流程状态</p>
     * @param Status <p>流程状态</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>流程活动列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Activities <p>流程活动列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FlowActivityDetail [] getActivities() {
        return this.Activities;
    }

    /**
     * Set <p>流程活动列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Activities <p>流程活动列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActivities(FlowActivityDetail [] Activities) {
        this.Activities = Activities;
    }

    public FlowDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowDetail(FlowDetail source) {
        if (source.FlowId != null) {
            this.FlowId = new Long(source.FlowId);
        }
        if (source.WorkFlowId != null) {
            this.WorkFlowId = new String(source.WorkFlowId);
        }
        if (source.WorkFlowCode != null) {
            this.WorkFlowCode = new String(source.WorkFlowCode);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Activities != null) {
            this.Activities = new FlowActivityDetail[source.Activities.length];
            for (int i = 0; i < source.Activities.length; i++) {
                this.Activities[i] = new FlowActivityDetail(source.Activities[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "WorkFlowId", this.WorkFlowId);
        this.setParamSimple(map, prefix + "WorkFlowCode", this.WorkFlowCode);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "Activities.", this.Activities);

    }
}

