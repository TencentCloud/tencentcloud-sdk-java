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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIntegrationTaskResponse extends AbstractModel{

    /**
    * 任务信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskInfo")
    @Expose
    private IntegrationTaskInfo TaskInfo;

    /**
    * 采集器统计信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentStatus")
    @Expose
    private AgentStatus AgentStatus;

    /**
    * 任务版本信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskVersion")
    @Expose
    private TaskVersionInstance TaskVersion;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskInfo 任务信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IntegrationTaskInfo getTaskInfo() {
        return this.TaskInfo;
    }

    /**
     * Set 任务信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskInfo 任务信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskInfo(IntegrationTaskInfo TaskInfo) {
        this.TaskInfo = TaskInfo;
    }

    /**
     * Get 采集器统计信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentStatus 采集器统计信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AgentStatus getAgentStatus() {
        return this.AgentStatus;
    }

    /**
     * Set 采集器统计信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentStatus 采集器统计信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentStatus(AgentStatus AgentStatus) {
        this.AgentStatus = AgentStatus;
    }

    /**
     * Get 任务版本信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskVersion 任务版本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskVersionInstance getTaskVersion() {
        return this.TaskVersion;
    }

    /**
     * Set 任务版本信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskVersion 任务版本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskVersion(TaskVersionInstance TaskVersion) {
        this.TaskVersion = TaskVersion;
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

