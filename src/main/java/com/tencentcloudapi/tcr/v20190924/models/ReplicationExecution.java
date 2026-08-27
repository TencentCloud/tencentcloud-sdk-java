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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReplicationExecution extends AbstractModel {

    /**
    * 执行记录ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionID")
    @Expose
    private Long ExecutionID;

    /**
    * 策略ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyID")
    @Expose
    private Long PolicyID;

    /**
    * 执行状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 执行任务总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 执行任务成功数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Succeed")
    @Expose
    private Long Succeed;

    /**
    * 开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 执行记录ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionID 执行记录ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExecutionID() {
        return this.ExecutionID;
    }

    /**
     * Set 执行记录ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionID 执行记录ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionID(Long ExecutionID) {
        this.ExecutionID = ExecutionID;
    }

    /**
     * Get 策略ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolicyID 策略ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPolicyID() {
        return this.PolicyID;
    }

    /**
     * Set 策略ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicyID 策略ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicyID(Long PolicyID) {
        this.PolicyID = PolicyID;
    }

    /**
     * Get 执行状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 执行状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 执行状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 执行状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 执行任务总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 执行任务总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 执行任务总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 执行任务总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 执行任务成功数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Succeed 执行任务成功数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSucceed() {
        return this.Succeed;
    }

    /**
     * Set 执行任务成功数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Succeed 执行任务成功数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSucceed(Long Succeed) {
        this.Succeed = Succeed;
    }

    /**
     * Get 开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public ReplicationExecution() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReplicationExecution(ReplicationExecution source) {
        if (source.ExecutionID != null) {
            this.ExecutionID = new Long(source.ExecutionID);
        }
        if (source.PolicyID != null) {
            this.PolicyID = new Long(source.PolicyID);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Succeed != null) {
            this.Succeed = new Long(source.Succeed);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExecutionID", this.ExecutionID);
        this.setParamSimple(map, prefix + "PolicyID", this.PolicyID);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Succeed", this.Succeed);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

