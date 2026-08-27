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

public class DescribeReplicationTasksResponse extends AbstractModel {

    /**
    * 任务列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReplicationTaskList")
    @Expose
    private ReplicationTask [] ReplicationTaskList;

    /**
    * 任务列表总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReplicationTaskList 任务列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ReplicationTask [] getReplicationTaskList() {
        return this.ReplicationTaskList;
    }

    /**
     * Set 任务列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReplicationTaskList 任务列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplicationTaskList(ReplicationTask [] ReplicationTaskList) {
        this.ReplicationTaskList = ReplicationTaskList;
    }

    /**
     * Get 任务列表总数 
     * @return TotalCount 任务列表总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 任务列表总数
     * @param TotalCount 任务列表总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeReplicationTasksResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReplicationTasksResponse(DescribeReplicationTasksResponse source) {
        if (source.ReplicationTaskList != null) {
            this.ReplicationTaskList = new ReplicationTask[source.ReplicationTaskList.length];
            for (int i = 0; i < source.ReplicationTaskList.length; i++) {
                this.ReplicationTaskList[i] = new ReplicationTask(source.ReplicationTaskList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ReplicationTaskList.", this.ReplicationTaskList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

