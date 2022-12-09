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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdatePrometheusScrapeJobRequest extends AbstractModel{

    /**
    * Prometheus 实例 ID，例如：prom-abcd1234
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Agent ID，例如：agent-abcd1234，可在控制台 Agent 管理中获取
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * 抓取任务 ID，例如：job-abcd1234，可在控制台 Agent 管理-抓取任务配置中获取
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 抓取任务配置，格式：job_name:xx
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
     * Get Prometheus 实例 ID，例如：prom-abcd1234 
     * @return InstanceId Prometheus 实例 ID，例如：prom-abcd1234
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Prometheus 实例 ID，例如：prom-abcd1234
     * @param InstanceId Prometheus 实例 ID，例如：prom-abcd1234
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Agent ID，例如：agent-abcd1234，可在控制台 Agent 管理中获取 
     * @return AgentId Agent ID，例如：agent-abcd1234，可在控制台 Agent 管理中获取
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set Agent ID，例如：agent-abcd1234，可在控制台 Agent 管理中获取
     * @param AgentId Agent ID，例如：agent-abcd1234，可在控制台 Agent 管理中获取
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get 抓取任务 ID，例如：job-abcd1234，可在控制台 Agent 管理-抓取任务配置中获取 
     * @return JobId 抓取任务 ID，例如：job-abcd1234，可在控制台 Agent 管理-抓取任务配置中获取
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 抓取任务 ID，例如：job-abcd1234，可在控制台 Agent 管理-抓取任务配置中获取
     * @param JobId 抓取任务 ID，例如：job-abcd1234，可在控制台 Agent 管理-抓取任务配置中获取
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 抓取任务配置，格式：job_name:xx 
     * @return Config 抓取任务配置，格式：job_name:xx
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set 抓取任务配置，格式：job_name:xx
     * @param Config 抓取任务配置，格式：job_name:xx
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    public UpdatePrometheusScrapeJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdatePrometheusScrapeJobRequest(UpdatePrometheusScrapeJobRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "Config", this.Config);

    }
}

