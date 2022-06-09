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

public class DescribeScanTaskStatusResponse extends AbstractModel{

    /**
    * 返回值, 0:成功, 其他值请查看“返回值”定义
    */
    @SerializedName("Result")
    @Expose
    private Long Result;

    /**
    * 0:默认值(待检测/待咨询), 1.检测中,  4:任务完成/咨询完成, 5:任务失败, 6:咨询中;
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 诊断失败的错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * 任务流详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowSteps")
    @Expose
    private TaskFlowStepsInfo [] FlowSteps;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回值, 0:成功, 其他值请查看“返回值”定义 
     * @return Result 返回值, 0:成功, 其他值请查看“返回值”定义
     */
    public Long getResult() {
        return this.Result;
    }

    /**
     * Set 返回值, 0:成功, 其他值请查看“返回值”定义
     * @param Result 返回值, 0:成功, 其他值请查看“返回值”定义
     */
    public void setResult(Long Result) {
        this.Result = Result;
    }

    /**
     * Get 0:默认值(待检测/待咨询), 1.检测中,  4:任务完成/咨询完成, 5:任务失败, 6:咨询中; 
     * @return Status 0:默认值(待检测/待咨询), 1.检测中,  4:任务完成/咨询完成, 5:任务失败, 6:咨询中;
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0:默认值(待检测/待咨询), 1.检测中,  4:任务完成/咨询完成, 5:任务失败, 6:咨询中;
     * @param Status 0:默认值(待检测/待咨询), 1.检测中,  4:任务完成/咨询完成, 5:任务失败, 6:咨询中;
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 诊断失败的错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrMsg 诊断失败的错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set 诊断失败的错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrMsg 诊断失败的错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Get 任务流详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowSteps 任务流详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskFlowStepsInfo [] getFlowSteps() {
        return this.FlowSteps;
    }

    /**
     * Set 任务流详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowSteps 任务流详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowSteps(TaskFlowStepsInfo [] FlowSteps) {
        this.FlowSteps = FlowSteps;
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

    public DescribeScanTaskStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScanTaskStatusResponse(DescribeScanTaskStatusResponse source) {
        if (source.Result != null) {
            this.Result = new Long(source.Result);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
        if (source.FlowSteps != null) {
            this.FlowSteps = new TaskFlowStepsInfo[source.FlowSteps.length];
            for (int i = 0; i < source.FlowSteps.length; i++) {
                this.FlowSteps[i] = new TaskFlowStepsInfo(source.FlowSteps[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamArrayObj(map, prefix + "FlowSteps.", this.FlowSteps);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

