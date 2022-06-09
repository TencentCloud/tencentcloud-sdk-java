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
package com.tencentcloudapi.mmps.v20200710.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskFlowStepsInfo extends AbstractModel{

    /**
    * 流程编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowNo")
    @Expose
    private String FlowNo;

    /**
    * 流程名称
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * 流程状态, 其他值:进行中, 2:成功, 3:失败
    */
    @SerializedName("FlowStatus")
    @Expose
    private Long FlowStatus;

    /**
    * 流程状态描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowStateDesc")
    @Expose
    private String FlowStateDesc;

    /**
    * 流程启动时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 流程完成时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 流程编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowNo 流程编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlowNo() {
        return this.FlowNo;
    }

    /**
     * Set 流程编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowNo 流程编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowNo(String FlowNo) {
        this.FlowNo = FlowNo;
    }

    /**
     * Get 流程名称 
     * @return FlowName 流程名称
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set 流程名称
     * @param FlowName 流程名称
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    /**
     * Get 流程状态, 其他值:进行中, 2:成功, 3:失败 
     * @return FlowStatus 流程状态, 其他值:进行中, 2:成功, 3:失败
     */
    public Long getFlowStatus() {
        return this.FlowStatus;
    }

    /**
     * Set 流程状态, 其他值:进行中, 2:成功, 3:失败
     * @param FlowStatus 流程状态, 其他值:进行中, 2:成功, 3:失败
     */
    public void setFlowStatus(Long FlowStatus) {
        this.FlowStatus = FlowStatus;
    }

    /**
     * Get 流程状态描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowStateDesc 流程状态描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlowStateDesc() {
        return this.FlowStateDesc;
    }

    /**
     * Set 流程状态描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowStateDesc 流程状态描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowStateDesc(String FlowStateDesc) {
        this.FlowStateDesc = FlowStateDesc;
    }

    /**
     * Get 流程启动时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 流程启动时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 流程启动时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 流程启动时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 流程完成时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 流程完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 流程完成时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 流程完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public TaskFlowStepsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskFlowStepsInfo(TaskFlowStepsInfo source) {
        if (source.FlowNo != null) {
            this.FlowNo = new String(source.FlowNo);
        }
        if (source.FlowName != null) {
            this.FlowName = new String(source.FlowName);
        }
        if (source.FlowStatus != null) {
            this.FlowStatus = new Long(source.FlowStatus);
        }
        if (source.FlowStateDesc != null) {
            this.FlowStateDesc = new String(source.FlowStateDesc);
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
        this.setParamSimple(map, prefix + "FlowNo", this.FlowNo);
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);
        this.setParamSimple(map, prefix + "FlowStatus", this.FlowStatus);
        this.setParamSimple(map, prefix + "FlowStateDesc", this.FlowStateDesc);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

