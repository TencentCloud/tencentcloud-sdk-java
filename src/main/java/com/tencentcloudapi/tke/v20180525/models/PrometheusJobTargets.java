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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusJobTargets extends AbstractModel{

    /**
    * 该Job的targets列表
    */
    @SerializedName("Targets")
    @Expose
    private PrometheusTarget [] Targets;

    /**
    * job的名称
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * targets总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 健康的target总数
    */
    @SerializedName("Up")
    @Expose
    private Long Up;

    /**
     * Get 该Job的targets列表 
     * @return Targets 该Job的targets列表
     */
    public PrometheusTarget [] getTargets() {
        return this.Targets;
    }

    /**
     * Set 该Job的targets列表
     * @param Targets 该Job的targets列表
     */
    public void setTargets(PrometheusTarget [] Targets) {
        this.Targets = Targets;
    }

    /**
     * Get job的名称 
     * @return JobName job的名称
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set job的名称
     * @param JobName job的名称
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get targets总数 
     * @return Total targets总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set targets总数
     * @param Total targets总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 健康的target总数 
     * @return Up 健康的target总数
     */
    public Long getUp() {
        return this.Up;
    }

    /**
     * Set 健康的target总数
     * @param Up 健康的target总数
     */
    public void setUp(Long Up) {
        this.Up = Up;
    }

    public PrometheusJobTargets() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusJobTargets(PrometheusJobTargets source) {
        if (source.Targets != null) {
            this.Targets = new PrometheusTarget[source.Targets.length];
            for (int i = 0; i < source.Targets.length; i++) {
                this.Targets[i] = new PrometheusTarget(source.Targets[i]);
            }
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Up != null) {
            this.Up = new Long(source.Up);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Targets.", this.Targets);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Up", this.Up);

    }
}

