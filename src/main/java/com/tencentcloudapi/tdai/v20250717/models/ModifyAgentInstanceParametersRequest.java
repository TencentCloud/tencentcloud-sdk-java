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
package com.tencentcloudapi.tdai.v20250717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAgentInstanceParametersRequest extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 任务类型, 可选，默认default
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 更新的参数列表
    */
    @SerializedName("Parameters")
    @Expose
    private Parameter Parameters;

    /**
    * 风险SQL智能体参数列表
    */
    @SerializedName("SqlAgentParameter")
    @Expose
    private SqlAgentParameter SqlAgentParameter;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 任务类型, 可选，默认default 
     * @return TaskType 任务类型, 可选，默认default
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型, 可选，默认default
     * @param TaskType 任务类型, 可选，默认default
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 更新的参数列表 
     * @return Parameters 更新的参数列表
     */
    public Parameter getParameters() {
        return this.Parameters;
    }

    /**
     * Set 更新的参数列表
     * @param Parameters 更新的参数列表
     */
    public void setParameters(Parameter Parameters) {
        this.Parameters = Parameters;
    }

    /**
     * Get 风险SQL智能体参数列表 
     * @return SqlAgentParameter 风险SQL智能体参数列表
     */
    public SqlAgentParameter getSqlAgentParameter() {
        return this.SqlAgentParameter;
    }

    /**
     * Set 风险SQL智能体参数列表
     * @param SqlAgentParameter 风险SQL智能体参数列表
     */
    public void setSqlAgentParameter(SqlAgentParameter SqlAgentParameter) {
        this.SqlAgentParameter = SqlAgentParameter;
    }

    public ModifyAgentInstanceParametersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAgentInstanceParametersRequest(ModifyAgentInstanceParametersRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.Parameters != null) {
            this.Parameters = new Parameter(source.Parameters);
        }
        if (source.SqlAgentParameter != null) {
            this.SqlAgentParameter = new SqlAgentParameter(source.SqlAgentParameter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamObj(map, prefix + "Parameters.", this.Parameters);
        this.setParamObj(map, prefix + "SqlAgentParameter.", this.SqlAgentParameter);

    }
}

