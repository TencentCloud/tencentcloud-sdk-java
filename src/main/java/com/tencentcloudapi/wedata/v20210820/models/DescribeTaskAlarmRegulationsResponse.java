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

public class DescribeTaskAlarmRegulationsResponse extends AbstractModel {

    /**
    * 告警规则信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskAlarmInfos")
    @Expose
    private TaskAlarmInfo [] TaskAlarmInfos;

    /**
    * 总记录数
注意：此字段可能返回 null，表示取不到有效值。
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
     * Get 告警规则信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskAlarmInfos 告警规则信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskAlarmInfo [] getTaskAlarmInfos() {
        return this.TaskAlarmInfos;
    }

    /**
     * Set 告警规则信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskAlarmInfos 告警规则信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskAlarmInfos(TaskAlarmInfo [] TaskAlarmInfos) {
        this.TaskAlarmInfos = TaskAlarmInfos;
    }

    /**
     * Get 总记录数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 总记录数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总记录数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 总记录数
注意：此字段可能返回 null，表示取不到有效值。
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

    public DescribeTaskAlarmRegulationsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskAlarmRegulationsResponse(DescribeTaskAlarmRegulationsResponse source) {
        if (source.TaskAlarmInfos != null) {
            this.TaskAlarmInfos = new TaskAlarmInfo[source.TaskAlarmInfos.length];
            for (int i = 0; i < source.TaskAlarmInfos.length; i++) {
                this.TaskAlarmInfos[i] = new TaskAlarmInfo(source.TaskAlarmInfos[i]);
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
        this.setParamArrayObj(map, prefix + "TaskAlarmInfos.", this.TaskAlarmInfos);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

