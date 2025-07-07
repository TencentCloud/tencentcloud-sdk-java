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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSparkSessionBatchSQLResponse extends AbstractModel {

    /**
    * 状态：0：运行中、1：成功、2：失败、3：取消、4：超时；
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * SQL子任务列表，仅展示运行完成的子任务，若某个任务运行失败，后续其它子任务不返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tasks")
    @Expose
    private BatchSqlTask [] Tasks;

    /**
    * 非sql运行的异常事件信息，包含资源创建失败、调度异常，JOB超时等，正常运行下该Event值为空
    */
    @SerializedName("Event")
    @Expose
    private String Event;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 状态：0：运行中、1：成功、2：失败、3：取消、4：超时； 
     * @return State 状态：0：运行中、1：成功、2：失败、3：取消、4：超时；
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 状态：0：运行中、1：成功、2：失败、3：取消、4：超时；
     * @param State 状态：0：运行中、1：成功、2：失败、3：取消、4：超时；
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get SQL子任务列表，仅展示运行完成的子任务，若某个任务运行失败，后续其它子任务不返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tasks SQL子任务列表，仅展示运行完成的子任务，若某个任务运行失败，后续其它子任务不返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BatchSqlTask [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set SQL子任务列表，仅展示运行完成的子任务，若某个任务运行失败，后续其它子任务不返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tasks SQL子任务列表，仅展示运行完成的子任务，若某个任务运行失败，后续其它子任务不返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTasks(BatchSqlTask [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get 非sql运行的异常事件信息，包含资源创建失败、调度异常，JOB超时等，正常运行下该Event值为空 
     * @return Event 非sql运行的异常事件信息，包含资源创建失败、调度异常，JOB超时等，正常运行下该Event值为空
     */
    public String getEvent() {
        return this.Event;
    }

    /**
     * Set 非sql运行的异常事件信息，包含资源创建失败、调度异常，JOB超时等，正常运行下该Event值为空
     * @param Event 非sql运行的异常事件信息，包含资源创建失败、调度异常，JOB超时等，正常运行下该Event值为空
     */
    public void setEvent(String Event) {
        this.Event = Event;
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

    public DescribeSparkSessionBatchSQLResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSparkSessionBatchSQLResponse(DescribeSparkSessionBatchSQLResponse source) {
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.Tasks != null) {
            this.Tasks = new BatchSqlTask[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new BatchSqlTask(source.Tasks[i]);
            }
        }
        if (source.Event != null) {
            this.Event = new String(source.Event);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "Event", this.Event);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

