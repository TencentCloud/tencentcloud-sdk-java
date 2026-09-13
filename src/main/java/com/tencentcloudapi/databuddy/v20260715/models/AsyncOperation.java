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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AsyncOperation extends AbstractModel {

    /**
    * 是否异步执行；ZIP 解压创建时为 true
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsAsync")
    @Expose
    private Boolean IsAsync;

    /**
    * Workspace 持久化的异步作业 ID，用于查询作业进度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 调用方生成的提交幂等与链路追踪标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperationId")
    @Expose
    private String OperationId;

    /**
    * 异步作业状态：0-未指定，1-已受理，2-解压中，3-回调处理中，4-成功，5-部分失败，6-失败
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 是否异步执行；ZIP 解压创建时为 true
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsAsync 是否异步执行；ZIP 解压创建时为 true
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsAsync() {
        return this.IsAsync;
    }

    /**
     * Set 是否异步执行；ZIP 解压创建时为 true
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsAsync 是否异步执行；ZIP 解压创建时为 true
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsAsync(Boolean IsAsync) {
        this.IsAsync = IsAsync;
    }

    /**
     * Get Workspace 持久化的异步作业 ID，用于查询作业进度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobId Workspace 持久化的异步作业 ID，用于查询作业进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Workspace 持久化的异步作业 ID，用于查询作业进度
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobId Workspace 持久化的异步作业 ID，用于查询作业进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 调用方生成的提交幂等与链路追踪标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperationId 调用方生成的提交幂等与链路追踪标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperationId() {
        return this.OperationId;
    }

    /**
     * Set 调用方生成的提交幂等与链路追踪标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperationId 调用方生成的提交幂等与链路追踪标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperationId(String OperationId) {
        this.OperationId = OperationId;
    }

    /**
     * Get 异步作业状态：0-未指定，1-已受理，2-解压中，3-回调处理中，4-成功，5-部分失败，6-失败
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 异步作业状态：0-未指定，1-已受理，2-解压中，3-回调处理中，4-成功，5-部分失败，6-失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 异步作业状态：0-未指定，1-已受理，2-解压中，3-回调处理中，4-成功，5-部分失败，6-失败
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 异步作业状态：0-未指定，1-已受理，2-解压中，3-回调处理中，4-成功，5-部分失败，6-失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public AsyncOperation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AsyncOperation(AsyncOperation source) {
        if (source.IsAsync != null) {
            this.IsAsync = new Boolean(source.IsAsync);
        }
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.OperationId != null) {
            this.OperationId = new String(source.OperationId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsAsync", this.IsAsync);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "OperationId", this.OperationId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

