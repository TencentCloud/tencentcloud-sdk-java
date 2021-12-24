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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CronJob extends AbstractModel{

    /**
    * 调度配置
    */
    @SerializedName("Schedule")
    @Expose
    private String Schedule;

    /**
    * 运行时间
    */
    @SerializedName("StartingDeadlineSeconds")
    @Expose
    private Long StartingDeadlineSeconds;

    /**
    * job并行策略(Allow|Forbid|Replace)
    */
    @SerializedName("ConcurrencyPolicy")
    @Expose
    private String ConcurrencyPolicy;

    /**
    * Job配置
    */
    @SerializedName("Job")
    @Expose
    private Job Job;

    /**
     * Get 调度配置 
     * @return Schedule 调度配置
     */
    public String getSchedule() {
        return this.Schedule;
    }

    /**
     * Set 调度配置
     * @param Schedule 调度配置
     */
    public void setSchedule(String Schedule) {
        this.Schedule = Schedule;
    }

    /**
     * Get 运行时间 
     * @return StartingDeadlineSeconds 运行时间
     */
    public Long getStartingDeadlineSeconds() {
        return this.StartingDeadlineSeconds;
    }

    /**
     * Set 运行时间
     * @param StartingDeadlineSeconds 运行时间
     */
    public void setStartingDeadlineSeconds(Long StartingDeadlineSeconds) {
        this.StartingDeadlineSeconds = StartingDeadlineSeconds;
    }

    /**
     * Get job并行策略(Allow|Forbid|Replace) 
     * @return ConcurrencyPolicy job并行策略(Allow|Forbid|Replace)
     */
    public String getConcurrencyPolicy() {
        return this.ConcurrencyPolicy;
    }

    /**
     * Set job并行策略(Allow|Forbid|Replace)
     * @param ConcurrencyPolicy job并行策略(Allow|Forbid|Replace)
     */
    public void setConcurrencyPolicy(String ConcurrencyPolicy) {
        this.ConcurrencyPolicy = ConcurrencyPolicy;
    }

    /**
     * Get Job配置 
     * @return Job Job配置
     */
    public Job getJob() {
        return this.Job;
    }

    /**
     * Set Job配置
     * @param Job Job配置
     */
    public void setJob(Job Job) {
        this.Job = Job;
    }

    public CronJob() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CronJob(CronJob source) {
        if (source.Schedule != null) {
            this.Schedule = new String(source.Schedule);
        }
        if (source.StartingDeadlineSeconds != null) {
            this.StartingDeadlineSeconds = new Long(source.StartingDeadlineSeconds);
        }
        if (source.ConcurrencyPolicy != null) {
            this.ConcurrencyPolicy = new String(source.ConcurrencyPolicy);
        }
        if (source.Job != null) {
            this.Job = new Job(source.Job);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Schedule", this.Schedule);
        this.setParamSimple(map, prefix + "StartingDeadlineSeconds", this.StartingDeadlineSeconds);
        this.setParamSimple(map, prefix + "ConcurrencyPolicy", this.ConcurrencyPolicy);
        this.setParamObj(map, prefix + "Job.", this.Job);

    }
}

