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
package com.tencentcloudapi.hai.v20230812.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProbeConfig extends AbstractModel {

    /**
    * <p>HTTP GET请求进行健康检查</p>
    */
    @SerializedName("HttpGet")
    @Expose
    private HttpConfig HttpGet;

    /**
    * <p>容器启动后，等待多少秒开始第一次探测</p>
    */
    @SerializedName("InitialDelaySeconds")
    @Expose
    private Long InitialDelaySeconds;

    /**
    * <p>每次执行探测的间隔时间（秒）</p>
    */
    @SerializedName("PeriodSeconds")
    @Expose
    private Long PeriodSeconds;

    /**
    * <p>每次探测等待响应的超时时间（秒）</p>
    */
    @SerializedName("TimeoutSeconds")
    @Expose
    private Long TimeoutSeconds;

    /**
    * <p>探测失败后，最小连续成功次数才被认为成功</p>
    */
    @SerializedName("SuccessThreshold")
    @Expose
    private Long SuccessThreshold;

    /**
    * <p>探测失败后，Kubernetes的重试次数</p>
    */
    @SerializedName("FailureThreshold")
    @Expose
    private Long FailureThreshold;

    /**
     * Get <p>HTTP GET请求进行健康检查</p> 
     * @return HttpGet <p>HTTP GET请求进行健康检查</p>
     */
    public HttpConfig getHttpGet() {
        return this.HttpGet;
    }

    /**
     * Set <p>HTTP GET请求进行健康检查</p>
     * @param HttpGet <p>HTTP GET请求进行健康检查</p>
     */
    public void setHttpGet(HttpConfig HttpGet) {
        this.HttpGet = HttpGet;
    }

    /**
     * Get <p>容器启动后，等待多少秒开始第一次探测</p> 
     * @return InitialDelaySeconds <p>容器启动后，等待多少秒开始第一次探测</p>
     */
    public Long getInitialDelaySeconds() {
        return this.InitialDelaySeconds;
    }

    /**
     * Set <p>容器启动后，等待多少秒开始第一次探测</p>
     * @param InitialDelaySeconds <p>容器启动后，等待多少秒开始第一次探测</p>
     */
    public void setInitialDelaySeconds(Long InitialDelaySeconds) {
        this.InitialDelaySeconds = InitialDelaySeconds;
    }

    /**
     * Get <p>每次执行探测的间隔时间（秒）</p> 
     * @return PeriodSeconds <p>每次执行探测的间隔时间（秒）</p>
     */
    public Long getPeriodSeconds() {
        return this.PeriodSeconds;
    }

    /**
     * Set <p>每次执行探测的间隔时间（秒）</p>
     * @param PeriodSeconds <p>每次执行探测的间隔时间（秒）</p>
     */
    public void setPeriodSeconds(Long PeriodSeconds) {
        this.PeriodSeconds = PeriodSeconds;
    }

    /**
     * Get <p>每次探测等待响应的超时时间（秒）</p> 
     * @return TimeoutSeconds <p>每次探测等待响应的超时时间（秒）</p>
     */
    public Long getTimeoutSeconds() {
        return this.TimeoutSeconds;
    }

    /**
     * Set <p>每次探测等待响应的超时时间（秒）</p>
     * @param TimeoutSeconds <p>每次探测等待响应的超时时间（秒）</p>
     */
    public void setTimeoutSeconds(Long TimeoutSeconds) {
        this.TimeoutSeconds = TimeoutSeconds;
    }

    /**
     * Get <p>探测失败后，最小连续成功次数才被认为成功</p> 
     * @return SuccessThreshold <p>探测失败后，最小连续成功次数才被认为成功</p>
     */
    public Long getSuccessThreshold() {
        return this.SuccessThreshold;
    }

    /**
     * Set <p>探测失败后，最小连续成功次数才被认为成功</p>
     * @param SuccessThreshold <p>探测失败后，最小连续成功次数才被认为成功</p>
     */
    public void setSuccessThreshold(Long SuccessThreshold) {
        this.SuccessThreshold = SuccessThreshold;
    }

    /**
     * Get <p>探测失败后，Kubernetes的重试次数</p> 
     * @return FailureThreshold <p>探测失败后，Kubernetes的重试次数</p>
     */
    public Long getFailureThreshold() {
        return this.FailureThreshold;
    }

    /**
     * Set <p>探测失败后，Kubernetes的重试次数</p>
     * @param FailureThreshold <p>探测失败后，Kubernetes的重试次数</p>
     */
    public void setFailureThreshold(Long FailureThreshold) {
        this.FailureThreshold = FailureThreshold;
    }

    public ProbeConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProbeConfig(ProbeConfig source) {
        if (source.HttpGet != null) {
            this.HttpGet = new HttpConfig(source.HttpGet);
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
        this.setParamSimple(map, prefix + "InitialDelaySeconds", this.InitialDelaySeconds);
        this.setParamSimple(map, prefix + "PeriodSeconds", this.PeriodSeconds);
        this.setParamSimple(map, prefix + "TimeoutSeconds", this.TimeoutSeconds);
        this.setParamSimple(map, prefix + "SuccessThreshold", this.SuccessThreshold);
        this.setParamSimple(map, prefix + "FailureThreshold", this.FailureThreshold);

    }
}

