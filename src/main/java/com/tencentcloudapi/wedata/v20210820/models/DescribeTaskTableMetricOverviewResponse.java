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

public class DescribeTaskTableMetricOverviewResponse extends AbstractModel {

    /**
    * 表粒度指标集合
    */
    @SerializedName("TaskTableMetricInfos")
    @Expose
    private TaskTableMetricInfo [] TaskTableMetricInfos;

    /**
    * 总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 返回列表类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetricType")
    @Expose
    private String MetricType;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 表粒度指标集合 
     * @return TaskTableMetricInfos 表粒度指标集合
     */
    public TaskTableMetricInfo [] getTaskTableMetricInfos() {
        return this.TaskTableMetricInfos;
    }

    /**
     * Set 表粒度指标集合
     * @param TaskTableMetricInfos 表粒度指标集合
     */
    public void setTaskTableMetricInfos(TaskTableMetricInfo [] TaskTableMetricInfos) {
        this.TaskTableMetricInfos = TaskTableMetricInfos;
    }

    /**
     * Get 总数 
     * @return TotalCount 总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数
     * @param TotalCount 总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 返回列表类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetricType 返回列表类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMetricType() {
        return this.MetricType;
    }

    /**
     * Set 返回列表类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetricType 返回列表类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetricType(String MetricType) {
        this.MetricType = MetricType;
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

    public DescribeTaskTableMetricOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskTableMetricOverviewResponse(DescribeTaskTableMetricOverviewResponse source) {
        if (source.TaskTableMetricInfos != null) {
            this.TaskTableMetricInfos = new TaskTableMetricInfo[source.TaskTableMetricInfos.length];
            for (int i = 0; i < source.TaskTableMetricInfos.length; i++) {
                this.TaskTableMetricInfos[i] = new TaskTableMetricInfo(source.TaskTableMetricInfos[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.MetricType != null) {
            this.MetricType = new String(source.MetricType);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TaskTableMetricInfos.", this.TaskTableMetricInfos);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "MetricType", this.MetricType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

