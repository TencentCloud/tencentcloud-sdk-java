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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeYarnScheduleHistoryResponse extends AbstractModel {

    /**
    * 任务详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tasks")
    @Expose
    private SchedulerTaskInfo [] Tasks;

    /**
    * 任务详情总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 调度类型筛选列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchedulerNameList")
    @Expose
    private String [] SchedulerNameList;

    /**
    * 状态筛选列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StateList")
    @Expose
    private Long [] StateList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tasks 任务详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SchedulerTaskInfo [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set 任务详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tasks 任务详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTasks(SchedulerTaskInfo [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get 任务详情总数 
     * @return Total 任务详情总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 任务详情总数
     * @param Total 任务详情总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 调度类型筛选列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchedulerNameList 调度类型筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSchedulerNameList() {
        return this.SchedulerNameList;
    }

    /**
     * Set 调度类型筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchedulerNameList 调度类型筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchedulerNameList(String [] SchedulerNameList) {
        this.SchedulerNameList = SchedulerNameList;
    }

    /**
     * Get 状态筛选列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StateList 状态筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getStateList() {
        return this.StateList;
    }

    /**
     * Set 状态筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param StateList 状态筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStateList(Long [] StateList) {
        this.StateList = StateList;
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

    public DescribeYarnScheduleHistoryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeYarnScheduleHistoryResponse(DescribeYarnScheduleHistoryResponse source) {
        if (source.Tasks != null) {
            this.Tasks = new SchedulerTaskInfo[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new SchedulerTaskInfo(source.Tasks[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.SchedulerNameList != null) {
            this.SchedulerNameList = new String[source.SchedulerNameList.length];
            for (int i = 0; i < source.SchedulerNameList.length; i++) {
                this.SchedulerNameList[i] = new String(source.SchedulerNameList[i]);
            }
        }
        if (source.StateList != null) {
            this.StateList = new Long[source.StateList.length];
            for (int i = 0; i < source.StateList.length; i++) {
                this.StateList[i] = new Long(source.StateList[i]);
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
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArraySimple(map, prefix + "SchedulerNameList.", this.SchedulerNameList);
        this.setParamArraySimple(map, prefix + "StateList.", this.StateList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

