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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProbeConfiguration extends AbstractModel {

    /**
    * HTTP GET 探测配置
    */
    @SerializedName("HttpGet")
    @Expose
    private HttpGetAction HttpGet;

    /**
    * 健康检查就绪超时
    */
    @SerializedName("ReadyTimeoutMs")
    @Expose
    private Long ReadyTimeoutMs;

    /**
    * 健康检查单次探测超时
    */
    @SerializedName("ProbeTimeoutMs")
    @Expose
    private Long ProbeTimeoutMs;

    /**
    * 健康检查间隔
    */
    @SerializedName("ProbePeriodMs")
    @Expose
    private Long ProbePeriodMs;

    /**
    * 健康检查成功阈值
    */
    @SerializedName("SuccessThreshold")
    @Expose
    private Long SuccessThreshold;

    /**
    * 健康检查失败阈值
    */
    @SerializedName("FailureThreshold")
    @Expose
    private Long FailureThreshold;

    /**
     * Get HTTP GET 探测配置 
     * @return HttpGet HTTP GET 探测配置
     */
    public HttpGetAction getHttpGet() {
        return this.HttpGet;
    }

    /**
     * Set HTTP GET 探测配置
     * @param HttpGet HTTP GET 探测配置
     */
    public void setHttpGet(HttpGetAction HttpGet) {
        this.HttpGet = HttpGet;
    }

    /**
     * Get 健康检查就绪超时 
     * @return ReadyTimeoutMs 健康检查就绪超时
     */
    public Long getReadyTimeoutMs() {
        return this.ReadyTimeoutMs;
    }

    /**
     * Set 健康检查就绪超时
     * @param ReadyTimeoutMs 健康检查就绪超时
     */
    public void setReadyTimeoutMs(Long ReadyTimeoutMs) {
        this.ReadyTimeoutMs = ReadyTimeoutMs;
    }

    /**
     * Get 健康检查单次探测超时 
     * @return ProbeTimeoutMs 健康检查单次探测超时
     */
    public Long getProbeTimeoutMs() {
        return this.ProbeTimeoutMs;
    }

    /**
     * Set 健康检查单次探测超时
     * @param ProbeTimeoutMs 健康检查单次探测超时
     */
    public void setProbeTimeoutMs(Long ProbeTimeoutMs) {
        this.ProbeTimeoutMs = ProbeTimeoutMs;
    }

    /**
     * Get 健康检查间隔 
     * @return ProbePeriodMs 健康检查间隔
     */
    public Long getProbePeriodMs() {
        return this.ProbePeriodMs;
    }

    /**
     * Set 健康检查间隔
     * @param ProbePeriodMs 健康检查间隔
     */
    public void setProbePeriodMs(Long ProbePeriodMs) {
        this.ProbePeriodMs = ProbePeriodMs;
    }

    /**
     * Get 健康检查成功阈值 
     * @return SuccessThreshold 健康检查成功阈值
     */
    public Long getSuccessThreshold() {
        return this.SuccessThreshold;
    }

    /**
     * Set 健康检查成功阈值
     * @param SuccessThreshold 健康检查成功阈值
     */
    public void setSuccessThreshold(Long SuccessThreshold) {
        this.SuccessThreshold = SuccessThreshold;
    }

    /**
     * Get 健康检查失败阈值 
     * @return FailureThreshold 健康检查失败阈值
     */
    public Long getFailureThreshold() {
        return this.FailureThreshold;
    }

    /**
     * Set 健康检查失败阈值
     * @param FailureThreshold 健康检查失败阈值
     */
    public void setFailureThreshold(Long FailureThreshold) {
        this.FailureThreshold = FailureThreshold;
    }

    public ProbeConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProbeConfiguration(ProbeConfiguration source) {
        if (source.HttpGet != null) {
            this.HttpGet = new HttpGetAction(source.HttpGet);
        }
        if (source.ReadyTimeoutMs != null) {
            this.ReadyTimeoutMs = new Long(source.ReadyTimeoutMs);
        }
        if (source.ProbeTimeoutMs != null) {
            this.ProbeTimeoutMs = new Long(source.ProbeTimeoutMs);
        }
        if (source.ProbePeriodMs != null) {
            this.ProbePeriodMs = new Long(source.ProbePeriodMs);
        }
        if (source.SuccessThreshold != null) {
            this.SuccessThreshold = new Long(source.SuccessThreshold);
        }
        if (source.FailureThreshold != null) {
            this.FailureThreshold = new Long(source.FailureThreshold);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "HttpGet.", this.HttpGet);
        this.setParamSimple(map, prefix + "ReadyTimeoutMs", this.ReadyTimeoutMs);
        this.setParamSimple(map, prefix + "ProbeTimeoutMs", this.ProbeTimeoutMs);
        this.setParamSimple(map, prefix + "ProbePeriodMs", this.ProbePeriodMs);
        this.setParamSimple(map, prefix + "SuccessThreshold", this.SuccessThreshold);
        this.setParamSimple(map, prefix + "FailureThreshold", this.FailureThreshold);

    }
}

