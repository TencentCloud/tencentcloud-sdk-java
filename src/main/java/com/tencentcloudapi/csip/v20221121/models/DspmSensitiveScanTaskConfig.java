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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspmSensitiveScanTaskConfig extends AbstractModel {

    /**
    * 是否定时任务
    */
    @SerializedName("IsScheduled")
    @Expose
    private Boolean IsScheduled;

    /**
    * 调度周期配置
    */
    @SerializedName("ScheduleConfig")
    @Expose
    private DspmScheduleConfig ScheduleConfig;

    /**
    * 是否立即扫描
    */
    @SerializedName("IsRunAtOnce")
    @Expose
    private Boolean IsRunAtOnce;

    /**
     * Get 是否定时任务 
     * @return IsScheduled 是否定时任务
     */
    public Boolean getIsScheduled() {
        return this.IsScheduled;
    }

    /**
     * Set 是否定时任务
     * @param IsScheduled 是否定时任务
     */
    public void setIsScheduled(Boolean IsScheduled) {
        this.IsScheduled = IsScheduled;
    }

    /**
     * Get 调度周期配置 
     * @return ScheduleConfig 调度周期配置
     */
    public DspmScheduleConfig getScheduleConfig() {
        return this.ScheduleConfig;
    }

    /**
     * Set 调度周期配置
     * @param ScheduleConfig 调度周期配置
     */
    public void setScheduleConfig(DspmScheduleConfig ScheduleConfig) {
        this.ScheduleConfig = ScheduleConfig;
    }

    /**
     * Get 是否立即扫描 
     * @return IsRunAtOnce 是否立即扫描
     */
    public Boolean getIsRunAtOnce() {
        return this.IsRunAtOnce;
    }

    /**
     * Set 是否立即扫描
     * @param IsRunAtOnce 是否立即扫描
     */
    public void setIsRunAtOnce(Boolean IsRunAtOnce) {
        this.IsRunAtOnce = IsRunAtOnce;
    }

    public DspmSensitiveScanTaskConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmSensitiveScanTaskConfig(DspmSensitiveScanTaskConfig source) {
        if (source.IsScheduled != null) {
            this.IsScheduled = new Boolean(source.IsScheduled);
        }
        if (source.ScheduleConfig != null) {
            this.ScheduleConfig = new DspmScheduleConfig(source.ScheduleConfig);
        }
        if (source.IsRunAtOnce != null) {
            this.IsRunAtOnce = new Boolean(source.IsRunAtOnce);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsScheduled", this.IsScheduled);
        this.setParamObj(map, prefix + "ScheduleConfig.", this.ScheduleConfig);
        this.setParamSimple(map, prefix + "IsRunAtOnce", this.IsRunAtOnce);

    }
}

