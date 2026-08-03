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

public class RunJobSpecRequest extends AbstractModel {

    /**
    * <p>配置ID</p>
    */
    @SerializedName("SpecId")
    @Expose
    private String SpecId;

    /**
    * <p>外部工作流引擎业务键 flowId</p>
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * <p>外部工作流引擎业务键 executionId</p>
    */
    @SerializedName("ExecutionId")
    @Expose
    private String ExecutionId;

    /**
    * <p>业务来源标识（调用上下文，长度上限 64，禁止控制字符）</p>
    */
    @SerializedName("JobSource")
    @Expose
    private String JobSource;

    /**
     * Get <p>配置ID</p> 
     * @return SpecId <p>配置ID</p>
     */
    public String getSpecId() {
        return this.SpecId;
    }

    /**
     * Set <p>配置ID</p>
     * @param SpecId <p>配置ID</p>
     */
    public void setSpecId(String SpecId) {
        this.SpecId = SpecId;
    }

    /**
     * Get <p>外部工作流引擎业务键 flowId</p> 
     * @return FlowId <p>外部工作流引擎业务键 flowId</p>
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set <p>外部工作流引擎业务键 flowId</p>
     * @param FlowId <p>外部工作流引擎业务键 flowId</p>
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get <p>外部工作流引擎业务键 executionId</p> 
     * @return ExecutionId <p>外部工作流引擎业务键 executionId</p>
     */
    public String getExecutionId() {
        return this.ExecutionId;
    }

    /**
     * Set <p>外部工作流引擎业务键 executionId</p>
     * @param ExecutionId <p>外部工作流引擎业务键 executionId</p>
     */
    public void setExecutionId(String ExecutionId) {
        this.ExecutionId = ExecutionId;
    }

    /**
     * Get <p>业务来源标识（调用上下文，长度上限 64，禁止控制字符）</p> 
     * @return JobSource <p>业务来源标识（调用上下文，长度上限 64，禁止控制字符）</p>
     */
    public String getJobSource() {
        return this.JobSource;
    }

    /**
     * Set <p>业务来源标识（调用上下文，长度上限 64，禁止控制字符）</p>
     * @param JobSource <p>业务来源标识（调用上下文，长度上限 64，禁止控制字符）</p>
     */
    public void setJobSource(String JobSource) {
        this.JobSource = JobSource;
    }

    public RunJobSpecRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunJobSpecRequest(RunJobSpecRequest source) {
        if (source.SpecId != null) {
            this.SpecId = new String(source.SpecId);
        }
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.ExecutionId != null) {
            this.ExecutionId = new String(source.ExecutionId);
        }
        if (source.JobSource != null) {
            this.JobSource = new String(source.JobSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpecId", this.SpecId);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "ExecutionId", this.ExecutionId);
        this.setParamSimple(map, prefix + "JobSource", this.JobSource);

    }
}

