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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SplitMediaTaskSegmentInfo extends AbstractModel{

    /**
    * 视频拆条任务输入信息。
    */
    @SerializedName("Input")
    @Expose
    private SplitMediaTaskInput Input;

    /**
    * 视频拆条任务输出信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Output")
    @Expose
    private TaskOutputMediaInfo Output;

    /**
    * 若发起视频拆条任务时指定了视频处理流程，则该字段为流程任务 ID。
    */
    @SerializedName("ProcedureTaskId")
    @Expose
    private String ProcedureTaskId;

    /**
     * Get 视频拆条任务输入信息。 
     * @return Input 视频拆条任务输入信息。
     */
    public SplitMediaTaskInput getInput() {
        return this.Input;
    }

    /**
     * Set 视频拆条任务输入信息。
     * @param Input 视频拆条任务输入信息。
     */
    public void setInput(SplitMediaTaskInput Input) {
        this.Input = Input;
    }

    /**
     * Get 视频拆条任务输出信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Output 视频拆条任务输出信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskOutputMediaInfo getOutput() {
        return this.Output;
    }

    /**
     * Set 视频拆条任务输出信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Output 视频拆条任务输出信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutput(TaskOutputMediaInfo Output) {
        this.Output = Output;
    }

    /**
     * Get 若发起视频拆条任务时指定了视频处理流程，则该字段为流程任务 ID。 
     * @return ProcedureTaskId 若发起视频拆条任务时指定了视频处理流程，则该字段为流程任务 ID。
     */
    public String getProcedureTaskId() {
        return this.ProcedureTaskId;
    }

    /**
     * Set 若发起视频拆条任务时指定了视频处理流程，则该字段为流程任务 ID。
     * @param ProcedureTaskId 若发起视频拆条任务时指定了视频处理流程，则该字段为流程任务 ID。
     */
    public void setProcedureTaskId(String ProcedureTaskId) {
        this.ProcedureTaskId = ProcedureTaskId;
    }

    public SplitMediaTaskSegmentInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SplitMediaTaskSegmentInfo(SplitMediaTaskSegmentInfo source) {
        if (source.Input != null) {
            this.Input = new SplitMediaTaskInput(source.Input);
        }
        if (source.Output != null) {
            this.Output = new TaskOutputMediaInfo(source.Output);
        }
        if (source.ProcedureTaskId != null) {
            this.ProcedureTaskId = new String(source.ProcedureTaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Input.", this.Input);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamSimple(map, prefix + "ProcedureTaskId", this.ProcedureTaskId);

    }
}

