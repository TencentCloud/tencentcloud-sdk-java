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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchKillIntegrationTaskInstancesResponse extends AbstractModel {

    /**
    * 操作成功的任务数
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * 操作失败的任务数
    */
    @SerializedName("FailedCount")
    @Expose
    private Long FailedCount;

    /**
    * 任务总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 实际传的为taskId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskNames")
    @Expose
    private String [] TaskNames;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 操作成功的任务数 
     * @return SuccessCount 操作成功的任务数
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set 操作成功的任务数
     * @param SuccessCount 操作成功的任务数
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get 操作失败的任务数 
     * @return FailedCount 操作失败的任务数
     */
    public Long getFailedCount() {
        return this.FailedCount;
    }

    /**
     * Set 操作失败的任务数
     * @param FailedCount 操作失败的任务数
     */
    public void setFailedCount(Long FailedCount) {
        this.FailedCount = FailedCount;
    }

    /**
     * Get 任务总数 
     * @return TotalCount 任务总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 任务总数
     * @param TotalCount 任务总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 实际传的为taskId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskNames 实际传的为taskId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTaskNames() {
        return this.TaskNames;
    }

    /**
     * Set 实际传的为taskId
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskNames 实际传的为taskId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskNames(String [] TaskNames) {
        this.TaskNames = TaskNames;
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

    public BatchKillIntegrationTaskInstancesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchKillIntegrationTaskInstancesResponse(BatchKillIntegrationTaskInstancesResponse source) {
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.FailedCount != null) {
            this.FailedCount = new Long(source.FailedCount);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TaskNames != null) {
            this.TaskNames = new String[source.TaskNames.length];
            for (int i = 0; i < source.TaskNames.length; i++) {
                this.TaskNames[i] = new String(source.TaskNames[i]);
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
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "FailedCount", this.FailedCount);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArraySimple(map, prefix + "TaskNames.", this.TaskNames);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

