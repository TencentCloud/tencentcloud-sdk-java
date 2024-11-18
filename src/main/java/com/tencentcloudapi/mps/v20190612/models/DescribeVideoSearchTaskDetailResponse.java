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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVideoSearchTaskDetailResponse extends AbstractModel {

    /**
    * 查询的任务Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 查询的任务的状态，可能为WAITING、PROCESSING、FAIL、SUCCESS。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 查询的任务的结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SearchTaskResults")
    @Expose
    private SearchTaskResult [] SearchTaskResults;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 查询的任务Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 查询的任务Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 查询的任务Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 查询的任务Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 查询的任务的状态，可能为WAITING、PROCESSING、FAIL、SUCCESS。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 查询的任务的状态，可能为WAITING、PROCESSING、FAIL、SUCCESS。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 查询的任务的状态，可能为WAITING、PROCESSING、FAIL、SUCCESS。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 查询的任务的状态，可能为WAITING、PROCESSING、FAIL、SUCCESS。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 查询的任务的结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SearchTaskResults 查询的任务的结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SearchTaskResult [] getSearchTaskResults() {
        return this.SearchTaskResults;
    }

    /**
     * Set 查询的任务的结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param SearchTaskResults 查询的任务的结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSearchTaskResults(SearchTaskResult [] SearchTaskResults) {
        this.SearchTaskResults = SearchTaskResults;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeVideoSearchTaskDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVideoSearchTaskDetailResponse(DescribeVideoSearchTaskDetailResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SearchTaskResults != null) {
            this.SearchTaskResults = new SearchTaskResult[source.SearchTaskResults.length];
            for (int i = 0; i < source.SearchTaskResults.length; i++) {
                this.SearchTaskResults[i] = new SearchTaskResult(source.SearchTaskResults[i]);
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
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "SearchTaskResults.", this.SearchTaskResults);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

