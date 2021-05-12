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
package com.tencentcloudapi.asw.v20200722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeExecutionResponse extends AbstractModel{

    /**
    * 执行资源名
    */
    @SerializedName("ExecutionResourceName")
    @Expose
    private String ExecutionResourceName;

    /**
    * 资源名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 执行开始时间，毫秒
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * 执行结束时间，毫秒
    */
    @SerializedName("StopDate")
    @Expose
    private String StopDate;

    /**
    * 状态机资源名
    */
    @SerializedName("StateMachineResourceName")
    @Expose
    private String StateMachineResourceName;

    /**
    * 执行状态。INIT，RUNNING，SUCCEED，FAILED，TERMINATED
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 执行的输入
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Input")
    @Expose
    private String Input;

    /**
    * 执行的输出
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Output")
    @Expose
    private String Output;

    /**
    * 启动执行时，状态机的定义
    */
    @SerializedName("ExecutionDefinition")
    @Expose
    private String ExecutionDefinition;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 执行资源名 
     * @return ExecutionResourceName 执行资源名
     */
    public String getExecutionResourceName() {
        return this.ExecutionResourceName;
    }

    /**
     * Set 执行资源名
     * @param ExecutionResourceName 执行资源名
     */
    public void setExecutionResourceName(String ExecutionResourceName) {
        this.ExecutionResourceName = ExecutionResourceName;
    }

    /**
     * Get 资源名称 
     * @return Name 资源名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 资源名称
     * @param Name 资源名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 执行开始时间，毫秒 
     * @return StartDate 执行开始时间，毫秒
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set 执行开始时间，毫秒
     * @param StartDate 执行开始时间，毫秒
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get 执行结束时间，毫秒 
     * @return StopDate 执行结束时间，毫秒
     */
    public String getStopDate() {
        return this.StopDate;
    }

    /**
     * Set 执行结束时间，毫秒
     * @param StopDate 执行结束时间，毫秒
     */
    public void setStopDate(String StopDate) {
        this.StopDate = StopDate;
    }

    /**
     * Get 状态机资源名 
     * @return StateMachineResourceName 状态机资源名
     */
    public String getStateMachineResourceName() {
        return this.StateMachineResourceName;
    }

    /**
     * Set 状态机资源名
     * @param StateMachineResourceName 状态机资源名
     */
    public void setStateMachineResourceName(String StateMachineResourceName) {
        this.StateMachineResourceName = StateMachineResourceName;
    }

    /**
     * Get 执行状态。INIT，RUNNING，SUCCEED，FAILED，TERMINATED 
     * @return Status 执行状态。INIT，RUNNING，SUCCEED，FAILED，TERMINATED
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 执行状态。INIT，RUNNING，SUCCEED，FAILED，TERMINATED
     * @param Status 执行状态。INIT，RUNNING，SUCCEED，FAILED，TERMINATED
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 执行的输入
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Input 执行的输入
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInput() {
        return this.Input;
    }

    /**
     * Set 执行的输入
注意：此字段可能返回 null，表示取不到有效值。
     * @param Input 执行的输入
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInput(String Input) {
        this.Input = Input;
    }

    /**
     * Get 执行的输出
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Output 执行的输出
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutput() {
        return this.Output;
    }

    /**
     * Set 执行的输出
注意：此字段可能返回 null，表示取不到有效值。
     * @param Output 执行的输出
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutput(String Output) {
        this.Output = Output;
    }

    /**
     * Get 启动执行时，状态机的定义 
     * @return ExecutionDefinition 启动执行时，状态机的定义
     */
    public String getExecutionDefinition() {
        return this.ExecutionDefinition;
    }

    /**
     * Set 启动执行时，状态机的定义
     * @param ExecutionDefinition 启动执行时，状态机的定义
     */
    public void setExecutionDefinition(String ExecutionDefinition) {
        this.ExecutionDefinition = ExecutionDefinition;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeExecutionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeExecutionResponse(DescribeExecutionResponse source) {
        if (source.ExecutionResourceName != null) {
            this.ExecutionResourceName = new String(source.ExecutionResourceName);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.StartDate != null) {
            this.StartDate = new String(source.StartDate);
        }
        if (source.StopDate != null) {
            this.StopDate = new String(source.StopDate);
        }
        if (source.StateMachineResourceName != null) {
            this.StateMachineResourceName = new String(source.StateMachineResourceName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Input != null) {
            this.Input = new String(source.Input);
        }
        if (source.Output != null) {
            this.Output = new String(source.Output);
        }
        if (source.ExecutionDefinition != null) {
            this.ExecutionDefinition = new String(source.ExecutionDefinition);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExecutionResourceName", this.ExecutionResourceName);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "StopDate", this.StopDate);
        this.setParamSimple(map, prefix + "StateMachineResourceName", this.StateMachineResourceName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Input", this.Input);
        this.setParamSimple(map, prefix + "Output", this.Output);
        this.setParamSimple(map, prefix + "ExecutionDefinition", this.ExecutionDefinition);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

