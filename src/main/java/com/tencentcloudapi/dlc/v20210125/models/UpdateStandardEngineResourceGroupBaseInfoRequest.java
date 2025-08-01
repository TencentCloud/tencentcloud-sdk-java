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

public class UpdateStandardEngineResourceGroupBaseInfoRequest extends AbstractModel {

    /**
    * 引擎资源组名称
    */
    @SerializedName("EngineResourceGroupName")
    @Expose
    private String EngineResourceGroupName;

    /**
    * 自动启动，（任务提交自动拉起资源组）0-自动启动，1-不自动启动
    */
    @SerializedName("AutoLaunch")
    @Expose
    private Long AutoLaunch;

    /**
    * 自动挂起资源组。0-自动挂起，1-不自动挂起
    */
    @SerializedName("AutoPause")
    @Expose
    private Long AutoPause;

    /**
    * 自动挂起时间，单位分钟，取值范围在1-999（在无任务AutoPauseTime后，资源组自动挂起）
    */
    @SerializedName("AutoPauseTime")
    @Expose
    private Long AutoPauseTime;

    /**
    * 任务并发数
    */
    @SerializedName("MaxConcurrency")
    @Expose
    private Long MaxConcurrency;

    /**
     * Get 引擎资源组名称 
     * @return EngineResourceGroupName 引擎资源组名称
     */
    public String getEngineResourceGroupName() {
        return this.EngineResourceGroupName;
    }

    /**
     * Set 引擎资源组名称
     * @param EngineResourceGroupName 引擎资源组名称
     */
    public void setEngineResourceGroupName(String EngineResourceGroupName) {
        this.EngineResourceGroupName = EngineResourceGroupName;
    }

    /**
     * Get 自动启动，（任务提交自动拉起资源组）0-自动启动，1-不自动启动 
     * @return AutoLaunch 自动启动，（任务提交自动拉起资源组）0-自动启动，1-不自动启动
     */
    public Long getAutoLaunch() {
        return this.AutoLaunch;
    }

    /**
     * Set 自动启动，（任务提交自动拉起资源组）0-自动启动，1-不自动启动
     * @param AutoLaunch 自动启动，（任务提交自动拉起资源组）0-自动启动，1-不自动启动
     */
    public void setAutoLaunch(Long AutoLaunch) {
        this.AutoLaunch = AutoLaunch;
    }

    /**
     * Get 自动挂起资源组。0-自动挂起，1-不自动挂起 
     * @return AutoPause 自动挂起资源组。0-自动挂起，1-不自动挂起
     */
    public Long getAutoPause() {
        return this.AutoPause;
    }

    /**
     * Set 自动挂起资源组。0-自动挂起，1-不自动挂起
     * @param AutoPause 自动挂起资源组。0-自动挂起，1-不自动挂起
     */
    public void setAutoPause(Long AutoPause) {
        this.AutoPause = AutoPause;
    }

    /**
     * Get 自动挂起时间，单位分钟，取值范围在1-999（在无任务AutoPauseTime后，资源组自动挂起） 
     * @return AutoPauseTime 自动挂起时间，单位分钟，取值范围在1-999（在无任务AutoPauseTime后，资源组自动挂起）
     */
    public Long getAutoPauseTime() {
        return this.AutoPauseTime;
    }

    /**
     * Set 自动挂起时间，单位分钟，取值范围在1-999（在无任务AutoPauseTime后，资源组自动挂起）
     * @param AutoPauseTime 自动挂起时间，单位分钟，取值范围在1-999（在无任务AutoPauseTime后，资源组自动挂起）
     */
    public void setAutoPauseTime(Long AutoPauseTime) {
        this.AutoPauseTime = AutoPauseTime;
    }

    /**
     * Get 任务并发数 
     * @return MaxConcurrency 任务并发数
     */
    public Long getMaxConcurrency() {
        return this.MaxConcurrency;
    }

    /**
     * Set 任务并发数
     * @param MaxConcurrency 任务并发数
     */
    public void setMaxConcurrency(Long MaxConcurrency) {
        this.MaxConcurrency = MaxConcurrency;
    }

    public UpdateStandardEngineResourceGroupBaseInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateStandardEngineResourceGroupBaseInfoRequest(UpdateStandardEngineResourceGroupBaseInfoRequest source) {
        if (source.EngineResourceGroupName != null) {
            this.EngineResourceGroupName = new String(source.EngineResourceGroupName);
        }
        if (source.AutoLaunch != null) {
            this.AutoLaunch = new Long(source.AutoLaunch);
        }
        if (source.AutoPause != null) {
            this.AutoPause = new Long(source.AutoPause);
        }
        if (source.AutoPauseTime != null) {
            this.AutoPauseTime = new Long(source.AutoPauseTime);
        }
        if (source.MaxConcurrency != null) {
            this.MaxConcurrency = new Long(source.MaxConcurrency);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EngineResourceGroupName", this.EngineResourceGroupName);
        this.setParamSimple(map, prefix + "AutoLaunch", this.AutoLaunch);
        this.setParamSimple(map, prefix + "AutoPause", this.AutoPause);
        this.setParamSimple(map, prefix + "AutoPauseTime", this.AutoPauseTime);
        this.setParamSimple(map, prefix + "MaxConcurrency", this.MaxConcurrency);

    }
}

