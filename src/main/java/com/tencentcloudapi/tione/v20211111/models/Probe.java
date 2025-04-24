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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Probe extends AbstractModel {

    /**
    * 探针行为
    */
    @SerializedName("ProbeAction")
    @Expose
    private ProbeAction ProbeAction;

    /**
    * 等待服务启动的延迟
    */
    @SerializedName("InitialDelaySeconds")
    @Expose
    private Long InitialDelaySeconds;

    /**
    * 轮询检查时间间隔
    */
    @SerializedName("PeriodSeconds")
    @Expose
    private Long PeriodSeconds;

    /**
    * 检查超时时长
    */
    @SerializedName("TimeoutSeconds")
    @Expose
    private Long TimeoutSeconds;

    /**
    * 检测失败认定次数
    */
    @SerializedName("FailureThreshold")
    @Expose
    private Long FailureThreshold;

    /**
    * 检测成功认定次数，就绪默认 3，存活/启动默认 1
    */
    @SerializedName("SuccessThreshold")
    @Expose
    private Long SuccessThreshold;

    /**
     * Get 探针行为 
     * @return ProbeAction 探针行为
     */
    public ProbeAction getProbeAction() {
        return this.ProbeAction;
    }

    /**
     * Set 探针行为
     * @param ProbeAction 探针行为
     */
    public void setProbeAction(ProbeAction ProbeAction) {
        this.ProbeAction = ProbeAction;
    }

    /**
     * Get 等待服务启动的延迟 
     * @return InitialDelaySeconds 等待服务启动的延迟
     */
    public Long getInitialDelaySeconds() {
        return this.InitialDelaySeconds;
    }

    /**
     * Set 等待服务启动的延迟
     * @param InitialDelaySeconds 等待服务启动的延迟
     */
    public void setInitialDelaySeconds(Long InitialDelaySeconds) {
        this.InitialDelaySeconds = InitialDelaySeconds;
    }

    /**
     * Get 轮询检查时间间隔 
     * @return PeriodSeconds 轮询检查时间间隔
     */
    public Long getPeriodSeconds() {
        return this.PeriodSeconds;
    }

    /**
     * Set 轮询检查时间间隔
     * @param PeriodSeconds 轮询检查时间间隔
     */
    public void setPeriodSeconds(Long PeriodSeconds) {
        this.PeriodSeconds = PeriodSeconds;
    }

    /**
     * Get 检查超时时长 
     * @return TimeoutSeconds 检查超时时长
     */
    public Long getTimeoutSeconds() {
        return this.TimeoutSeconds;
    }

    /**
     * Set 检查超时时长
     * @param TimeoutSeconds 检查超时时长
     */
    public void setTimeoutSeconds(Long TimeoutSeconds) {
        this.TimeoutSeconds = TimeoutSeconds;
    }

    /**
     * Get 检测失败认定次数 
     * @return FailureThreshold 检测失败认定次数
     */
    public Long getFailureThreshold() {
        return this.FailureThreshold;
    }

    /**
     * Set 检测失败认定次数
     * @param FailureThreshold 检测失败认定次数
     */
    public void setFailureThreshold(Long FailureThreshold) {
        this.FailureThreshold = FailureThreshold;
    }

    /**
     * Get 检测成功认定次数，就绪默认 3，存活/启动默认 1 
     * @return SuccessThreshold 检测成功认定次数，就绪默认 3，存活/启动默认 1
     */
    public Long getSuccessThreshold() {
        return this.SuccessThreshold;
    }

    /**
     * Set 检测成功认定次数，就绪默认 3，存活/启动默认 1
     * @param SuccessThreshold 检测成功认定次数，就绪默认 3，存活/启动默认 1
     */
    public void setSuccessThreshold(Long SuccessThreshold) {
        this.SuccessThreshold = SuccessThreshold;
    }

    public Probe() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Probe(Probe source) {
        if (source.ProbeAction != null) {
            this.ProbeAction = new ProbeAction(source.ProbeAction);
        }
        if (source.InitialDelaySeconds != null) {
            this.InitialDelaySeconds = new Long(source.InitialDelaySeconds);
        }
        if (source.PeriodSeconds != null) {
            this.PeriodSeconds = new Long(source.PeriodSeconds);
        }
        if (source.TimeoutSeconds != null) {
            this.TimeoutSeconds = new Long(source.TimeoutSeconds);
        }
        if (source.FailureThreshold != null) {
            this.FailureThreshold = new Long(source.FailureThreshold);
        }
        if (source.SuccessThreshold != null) {
            this.SuccessThreshold = new Long(source.SuccessThreshold);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ProbeAction.", this.ProbeAction);
        this.setParamSimple(map, prefix + "InitialDelaySeconds", this.InitialDelaySeconds);
        this.setParamSimple(map, prefix + "PeriodSeconds", this.PeriodSeconds);
        this.setParamSimple(map, prefix + "TimeoutSeconds", this.TimeoutSeconds);
        this.setParamSimple(map, prefix + "FailureThreshold", this.FailureThreshold);
        this.setParamSimple(map, prefix + "SuccessThreshold", this.SuccessThreshold);

    }
}

