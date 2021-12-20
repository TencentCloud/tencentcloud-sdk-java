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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SuspendProbeTaskResponse extends AbstractModel{

    /**
    * 任务总量
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 任务成功量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * 任务执行结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Results")
    @Expose
    private TaskResult [] Results;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务总量 
     * @return Total 任务总量
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 任务总量
     * @param Total 任务总量
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 任务成功量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuccessCount 任务成功量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set 任务成功量
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuccessCount 任务成功量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get 任务执行结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Results 任务执行结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskResult [] getResults() {
        return this.Results;
    }

    /**
     * Set 任务执行结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param Results 任务执行结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResults(TaskResult [] Results) {
        this.Results = Results;
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

    public SuspendProbeTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SuspendProbeTaskResponse(SuspendProbeTaskResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.Results != null) {
            this.Results = new TaskResult[source.Results.length];
            for (int i = 0; i < source.Results.length; i++) {
                this.Results[i] = new TaskResult(source.Results[i]);
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamArrayObj(map, prefix + "Results.", this.Results);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

