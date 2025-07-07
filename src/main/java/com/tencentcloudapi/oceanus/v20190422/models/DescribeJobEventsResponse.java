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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeJobEventsResponse extends AbstractModel {

    /**
    * 该作业指定范围内的事件列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Events")
    @Expose
    private JobEvent [] Events;

    /**
    * 该作业指定范围内运行实例 ID 数组，仅当入参没有传入 RunningOrderIds 参数时才会返回。倒序输出
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunningOrderIds")
    @Expose
    private Long [] RunningOrderIds;

    /**
    * 事件的总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 实例对应的版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Versions")
    @Expose
    private Long [] Versions;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 该作业指定范围内的事件列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Events 该作业指定范围内的事件列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public JobEvent [] getEvents() {
        return this.Events;
    }

    /**
     * Set 该作业指定范围内的事件列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Events 该作业指定范围内的事件列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEvents(JobEvent [] Events) {
        this.Events = Events;
    }

    /**
     * Get 该作业指定范围内运行实例 ID 数组，仅当入参没有传入 RunningOrderIds 参数时才会返回。倒序输出
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunningOrderIds 该作业指定范围内运行实例 ID 数组，仅当入参没有传入 RunningOrderIds 参数时才会返回。倒序输出
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getRunningOrderIds() {
        return this.RunningOrderIds;
    }

    /**
     * Set 该作业指定范围内运行实例 ID 数组，仅当入参没有传入 RunningOrderIds 参数时才会返回。倒序输出
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunningOrderIds 该作业指定范围内运行实例 ID 数组，仅当入参没有传入 RunningOrderIds 参数时才会返回。倒序输出
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunningOrderIds(Long [] RunningOrderIds) {
        this.RunningOrderIds = RunningOrderIds;
    }

    /**
     * Get 事件的总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 事件的总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 事件的总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 事件的总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 实例对应的版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Versions 实例对应的版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getVersions() {
        return this.Versions;
    }

    /**
     * Set 实例对应的版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param Versions 实例对应的版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersions(Long [] Versions) {
        this.Versions = Versions;
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

    public DescribeJobEventsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeJobEventsResponse(DescribeJobEventsResponse source) {
        if (source.Events != null) {
            this.Events = new JobEvent[source.Events.length];
            for (int i = 0; i < source.Events.length; i++) {
                this.Events[i] = new JobEvent(source.Events[i]);
            }
        }
        if (source.RunningOrderIds != null) {
            this.RunningOrderIds = new Long[source.RunningOrderIds.length];
            for (int i = 0; i < source.RunningOrderIds.length; i++) {
                this.RunningOrderIds[i] = new Long(source.RunningOrderIds[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Versions != null) {
            this.Versions = new Long[source.Versions.length];
            for (int i = 0; i < source.Versions.length; i++) {
                this.Versions[i] = new Long(source.Versions[i]);
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
        this.setParamArrayObj(map, prefix + "Events.", this.Events);
        this.setParamArraySimple(map, prefix + "RunningOrderIds.", this.RunningOrderIds);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArraySimple(map, prefix + "Versions.", this.Versions);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

