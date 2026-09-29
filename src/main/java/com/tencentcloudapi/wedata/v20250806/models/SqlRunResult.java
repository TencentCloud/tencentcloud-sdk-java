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

public class SqlRunResult extends AbstractModel {

    /**
    * 查询任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 查询任务状态。终态取值：SUCCESS（成功）、FAILED（失败）、TERMINATED（已终止）、CANCELED（已取消）；非终态取值：QUEUED（排队中）、RUNNING（执行中）。非终态时不报错，Results 返回空数组，调用方应指数退避轮询直至进入终态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 当前状态的可读说明，任意状态下均有值。用于说明 Results 为空的具体原因并给出下一步动作建议：任务未完成时提示稍后以相同 JobId 重试；任务失败/终止/取消时提示无结果数据及后续处理；成功且结果被截断时提示缩小查询范围。命名上与云API错误响应的 Error.Message 区分，本字段描述的是业务状态而非错误信息。随 Language 参数国际化
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusMessage")
    @Expose
    private String StatusMessage;

    /**
    * 查询任务总耗时，单位毫秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CostMs")
    @Expose
    private Long CostMs;

    /**
    * 是否存在结果不完整的子查询。任一子查询的 Truncated 为 true 时本字段为 true
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Truncated")
    @Expose
    private Boolean Truncated;

    /**
    * 各子查询的结果列表，顺序与 SQL 语句执行顺序一致
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Results")
    @Expose
    private SqlRunExecutionResult [] Results;

    /**
     * Get 查询任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobId 查询任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 查询任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobId 查询任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 查询任务状态。终态取值：SUCCESS（成功）、FAILED（失败）、TERMINATED（已终止）、CANCELED（已取消）；非终态取值：QUEUED（排队中）、RUNNING（执行中）。非终态时不报错，Results 返回空数组，调用方应指数退避轮询直至进入终态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 查询任务状态。终态取值：SUCCESS（成功）、FAILED（失败）、TERMINATED（已终止）、CANCELED（已取消）；非终态取值：QUEUED（排队中）、RUNNING（执行中）。非终态时不报错，Results 返回空数组，调用方应指数退避轮询直至进入终态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 查询任务状态。终态取值：SUCCESS（成功）、FAILED（失败）、TERMINATED（已终止）、CANCELED（已取消）；非终态取值：QUEUED（排队中）、RUNNING（执行中）。非终态时不报错，Results 返回空数组，调用方应指数退避轮询直至进入终态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 查询任务状态。终态取值：SUCCESS（成功）、FAILED（失败）、TERMINATED（已终止）、CANCELED（已取消）；非终态取值：QUEUED（排队中）、RUNNING（执行中）。非终态时不报错，Results 返回空数组，调用方应指数退避轮询直至进入终态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 当前状态的可读说明，任意状态下均有值。用于说明 Results 为空的具体原因并给出下一步动作建议：任务未完成时提示稍后以相同 JobId 重试；任务失败/终止/取消时提示无结果数据及后续处理；成功且结果被截断时提示缩小查询范围。命名上与云API错误响应的 Error.Message 区分，本字段描述的是业务状态而非错误信息。随 Language 参数国际化
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusMessage 当前状态的可读说明，任意状态下均有值。用于说明 Results 为空的具体原因并给出下一步动作建议：任务未完成时提示稍后以相同 JobId 重试；任务失败/终止/取消时提示无结果数据及后续处理；成功且结果被截断时提示缩小查询范围。命名上与云API错误响应的 Error.Message 区分，本字段描述的是业务状态而非错误信息。随 Language 参数国际化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusMessage() {
        return this.StatusMessage;
    }

    /**
     * Set 当前状态的可读说明，任意状态下均有值。用于说明 Results 为空的具体原因并给出下一步动作建议：任务未完成时提示稍后以相同 JobId 重试；任务失败/终止/取消时提示无结果数据及后续处理；成功且结果被截断时提示缩小查询范围。命名上与云API错误响应的 Error.Message 区分，本字段描述的是业务状态而非错误信息。随 Language 参数国际化
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusMessage 当前状态的可读说明，任意状态下均有值。用于说明 Results 为空的具体原因并给出下一步动作建议：任务未完成时提示稍后以相同 JobId 重试；任务失败/终止/取消时提示无结果数据及后续处理；成功且结果被截断时提示缩小查询范围。命名上与云API错误响应的 Error.Message 区分，本字段描述的是业务状态而非错误信息。随 Language 参数国际化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusMessage(String StatusMessage) {
        this.StatusMessage = StatusMessage;
    }

    /**
     * Get 查询任务总耗时，单位毫秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CostMs 查询任务总耗时，单位毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCostMs() {
        return this.CostMs;
    }

    /**
     * Set 查询任务总耗时，单位毫秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param CostMs 查询任务总耗时，单位毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCostMs(Long CostMs) {
        this.CostMs = CostMs;
    }

    /**
     * Get 是否存在结果不完整的子查询。任一子查询的 Truncated 为 true 时本字段为 true
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Truncated 是否存在结果不完整的子查询。任一子查询的 Truncated 为 true 时本字段为 true
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getTruncated() {
        return this.Truncated;
    }

    /**
     * Set 是否存在结果不完整的子查询。任一子查询的 Truncated 为 true 时本字段为 true
注意：此字段可能返回 null，表示取不到有效值。
     * @param Truncated 是否存在结果不完整的子查询。任一子查询的 Truncated 为 true 时本字段为 true
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTruncated(Boolean Truncated) {
        this.Truncated = Truncated;
    }

    /**
     * Get 各子查询的结果列表，顺序与 SQL 语句执行顺序一致
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Results 各子查询的结果列表，顺序与 SQL 语句执行顺序一致
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SqlRunExecutionResult [] getResults() {
        return this.Results;
    }

    /**
     * Set 各子查询的结果列表，顺序与 SQL 语句执行顺序一致
注意：此字段可能返回 null，表示取不到有效值。
     * @param Results 各子查询的结果列表，顺序与 SQL 语句执行顺序一致
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResults(SqlRunExecutionResult [] Results) {
        this.Results = Results;
    }

    public SqlRunResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SqlRunResult(SqlRunResult source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StatusMessage != null) {
            this.StatusMessage = new String(source.StatusMessage);
        }
        if (source.CostMs != null) {
            this.CostMs = new Long(source.CostMs);
        }
        if (source.Truncated != null) {
            this.Truncated = new Boolean(source.Truncated);
        }
        if (source.Results != null) {
            this.Results = new SqlRunExecutionResult[source.Results.length];
            for (int i = 0; i < source.Results.length; i++) {
                this.Results[i] = new SqlRunExecutionResult(source.Results[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusMessage", this.StatusMessage);
        this.setParamSimple(map, prefix + "CostMs", this.CostMs);
        this.setParamSimple(map, prefix + "Truncated", this.Truncated);
        this.setParamArrayObj(map, prefix + "Results.", this.Results);

    }
}

