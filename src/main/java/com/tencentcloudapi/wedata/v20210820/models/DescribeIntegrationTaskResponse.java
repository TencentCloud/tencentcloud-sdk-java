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

public class DescribeIntegrationTaskResponse extends AbstractModel {

    /**
    * <p>任务信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskInfo")
    @Expose
    private IntegrationTaskInfo TaskInfo;

    /**
    * <p>采集器统计信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentStatus")
    @Expose
    private AgentStatus AgentStatus;

    /**
    * <p>任务版本信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskVersion")
    @Expose
    private TaskVersionInstance TaskVersion;

    /**
    * <p>历史实例信息</p>
    */
    @SerializedName("TaskVersionList")
    @Expose
    private RealtimeTaskInstanceVO [] TaskVersionList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>任务信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskInfo <p>任务信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IntegrationTaskInfo getTaskInfo() {
        return this.TaskInfo;
    }

    /**
     * Set <p>任务信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskInfo <p>任务信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskInfo(IntegrationTaskInfo TaskInfo) {
        this.TaskInfo = TaskInfo;
    }

    /**
     * Get <p>采集器统计信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentStatus <p>采集器统计信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AgentStatus getAgentStatus() {
        return this.AgentStatus;
    }

    /**
     * Set <p>采集器统计信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentStatus <p>采集器统计信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentStatus(AgentStatus AgentStatus) {
        this.AgentStatus = AgentStatus;
    }

    /**
     * Get <p>任务版本信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskVersion <p>任务版本信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskVersionInstance getTaskVersion() {
        return this.TaskVersion;
    }

    /**
     * Set <p>任务版本信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskVersion <p>任务版本信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskVersion(TaskVersionInstance TaskVersion) {
        this.TaskVersion = TaskVersion;
    }

    /**
     * Get <p>历史实例信息</p> 
     * @return TaskVersionList <p>历史实例信息</p>
     */
    public RealtimeTaskInstanceVO [] getTaskVersionList() {
        return this.TaskVersionList;
    }

    /**
     * Set <p>历史实例信息</p>
     * @param TaskVersionList <p>历史实例信息</p>
     */
    public void setTaskVersionList(RealtimeTaskInstanceVO [] TaskVersionList) {
        this.TaskVersionList = TaskVersionList;
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

    public DescribeIntegrationTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIntegrationTaskResponse(DescribeIntegrationTaskResponse source) {
        if (source.TaskInfo != null) {
            this.TaskInfo = new IntegrationTaskInfo(source.TaskInfo);
        }
        if (source.AgentStatus != null) {
            this.AgentStatus = new AgentStatus(source.AgentStatus);
        }
        if (source.TaskVersion != null) {
            this.TaskVersion = new TaskVersionInstance(source.TaskVersion);
        }
        if (source.TaskVersionList != null) {
            this.TaskVersionList = new RealtimeTaskInstanceVO[source.TaskVersionList.length];
            for (int i = 0; i < source.TaskVersionList.length; i++) {
                this.TaskVersionList[i] = new RealtimeTaskInstanceVO(source.TaskVersionList[i]);
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
        this.setParamObj(map, prefix + "TaskInfo.", this.TaskInfo);
        this.setParamObj(map, prefix + "AgentStatus.", this.AgentStatus);
        this.setParamObj(map, prefix + "TaskVersion.", this.TaskVersion);
        this.setParamArrayObj(map, prefix + "TaskVersionList.", this.TaskVersionList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

