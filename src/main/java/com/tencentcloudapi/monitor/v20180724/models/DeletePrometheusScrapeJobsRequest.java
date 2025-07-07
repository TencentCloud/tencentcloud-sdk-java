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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeletePrometheusScrapeJobsRequest extends AbstractModel {

    /**
    * 实例 ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Agent ID(可通过 DescribePrometheusAgents 接口获取)
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * 任务 ID 列表(可通过 DescribePrometheusScrapeJobs 接口获取)
    */
    @SerializedName("JobIds")
    @Expose
    private String [] JobIds;

    /**
     * Get 实例 ID 
     * @return InstanceId 实例 ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID
     * @param InstanceId 实例 ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Agent ID(可通过 DescribePrometheusAgents 接口获取) 
     * @return AgentId Agent ID(可通过 DescribePrometheusAgents 接口获取)
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set Agent ID(可通过 DescribePrometheusAgents 接口获取)
     * @param AgentId Agent ID(可通过 DescribePrometheusAgents 接口获取)
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get 任务 ID 列表(可通过 DescribePrometheusScrapeJobs 接口获取) 
     * @return JobIds 任务 ID 列表(可通过 DescribePrometheusScrapeJobs 接口获取)
     */
    public String [] getJobIds() {
        return this.JobIds;
    }

    /**
     * Set 任务 ID 列表(可通过 DescribePrometheusScrapeJobs 接口获取)
     * @param JobIds 任务 ID 列表(可通过 DescribePrometheusScrapeJobs 接口获取)
     */
    public void setJobIds(String [] JobIds) {
        this.JobIds = JobIds;
    }

    public DeletePrometheusScrapeJobsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeletePrometheusScrapeJobsRequest(DeletePrometheusScrapeJobsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.JobIds != null) {
            this.JobIds = new String[source.JobIds.length];
            for (int i = 0; i < source.JobIds.length; i++) {
                this.JobIds[i] = new String(source.JobIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamArraySimple(map, prefix + "JobIds.", this.JobIds);

    }
}

