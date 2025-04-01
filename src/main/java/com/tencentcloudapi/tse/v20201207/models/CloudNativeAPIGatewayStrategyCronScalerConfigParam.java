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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudNativeAPIGatewayStrategyCronScalerConfigParam extends AbstractModel {

    /**
    * 定时伸缩周期
    */
    @SerializedName("Period")
    @Expose
    private String Period;

    /**
    * 定时伸缩开始时间
    */
    @SerializedName("StartAt")
    @Expose
    private String StartAt;

    /**
    * 定时伸缩目标节点数，不超过指标伸缩中定义的最大节点数
    */
    @SerializedName("TargetReplicas")
    @Expose
    private Long TargetReplicas;

    /**
    * 定时伸缩cron表达式，无需输入
    */
    @SerializedName("Crontab")
    @Expose
    private String Crontab;

    /**
     * Get 定时伸缩周期 
     * @return Period 定时伸缩周期
     */
    public String getPeriod() {
        return this.Period;
    }

    /**
     * Set 定时伸缩周期
     * @param Period 定时伸缩周期
     */
    public void setPeriod(String Period) {
        this.Period = Period;
    }

    /**
     * Get 定时伸缩开始时间 
     * @return StartAt 定时伸缩开始时间
     */
    public String getStartAt() {
        return this.StartAt;
    }

    /**
     * Set 定时伸缩开始时间
     * @param StartAt 定时伸缩开始时间
     */
    public void setStartAt(String StartAt) {
        this.StartAt = StartAt;
    }

    /**
     * Get 定时伸缩目标节点数，不超过指标伸缩中定义的最大节点数 
     * @return TargetReplicas 定时伸缩目标节点数，不超过指标伸缩中定义的最大节点数
     */
    public Long getTargetReplicas() {
        return this.TargetReplicas;
    }

    /**
     * Set 定时伸缩目标节点数，不超过指标伸缩中定义的最大节点数
     * @param TargetReplicas 定时伸缩目标节点数，不超过指标伸缩中定义的最大节点数
     */
    public void setTargetReplicas(Long TargetReplicas) {
        this.TargetReplicas = TargetReplicas;
    }

    /**
     * Get 定时伸缩cron表达式，无需输入 
     * @return Crontab 定时伸缩cron表达式，无需输入
     */
    public String getCrontab() {
        return this.Crontab;
    }

    /**
     * Set 定时伸缩cron表达式，无需输入
     * @param Crontab 定时伸缩cron表达式，无需输入
     */
    public void setCrontab(String Crontab) {
        this.Crontab = Crontab;
    }

    public CloudNativeAPIGatewayStrategyCronScalerConfigParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudNativeAPIGatewayStrategyCronScalerConfigParam(CloudNativeAPIGatewayStrategyCronScalerConfigParam source) {
        if (source.Period != null) {
            this.Period = new String(source.Period);
        }
        if (source.StartAt != null) {
            this.StartAt = new String(source.StartAt);
        }
        if (source.TargetReplicas != null) {
            this.TargetReplicas = new Long(source.TargetReplicas);
        }
        if (source.Crontab != null) {
            this.Crontab = new String(source.Crontab);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "StartAt", this.StartAt);
        this.setParamSimple(map, prefix + "TargetReplicas", this.TargetReplicas);
        this.setParamSimple(map, prefix + "Crontab", this.Crontab);

    }
}

