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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KongActiveHealthCheck extends AbstractModel {

    /**
    * <p>主动健康检查健康探测间隔，单位：秒，0表示不开启</p>
    */
    @SerializedName("HealthyInterval")
    @Expose
    private Long HealthyInterval;

    /**
    * <p>主动健康检查异常探测间隔，单位：秒，0表示不开启</p>
    */
    @SerializedName("UnHealthyInterval")
    @Expose
    private Long UnHealthyInterval;

    /**
    * <p>在 GET HTTP 请求中使用的路径，以作为主动运行状况检查的探测器运行。默认： ”/”。</p>
    */
    @SerializedName("HttpPath")
    @Expose
    private String HttpPath;

    /**
    * <p>GET HTTP 请求的超时时间，单位：秒。默认 60。</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Float Timeout;

    /**
    * <p>Host头</p>
    */
    @SerializedName("HostHeader")
    @Expose
    private String HostHeader;

    /**
     * Get <p>主动健康检查健康探测间隔，单位：秒，0表示不开启</p> 
     * @return HealthyInterval <p>主动健康检查健康探测间隔，单位：秒，0表示不开启</p>
     */
    public Long getHealthyInterval() {
        return this.HealthyInterval;
    }

    /**
     * Set <p>主动健康检查健康探测间隔，单位：秒，0表示不开启</p>
     * @param HealthyInterval <p>主动健康检查健康探测间隔，单位：秒，0表示不开启</p>
     */
    public void setHealthyInterval(Long HealthyInterval) {
        this.HealthyInterval = HealthyInterval;
    }

    /**
     * Get <p>主动健康检查异常探测间隔，单位：秒，0表示不开启</p> 
     * @return UnHealthyInterval <p>主动健康检查异常探测间隔，单位：秒，0表示不开启</p>
     */
    public Long getUnHealthyInterval() {
        return this.UnHealthyInterval;
    }

    /**
     * Set <p>主动健康检查异常探测间隔，单位：秒，0表示不开启</p>
     * @param UnHealthyInterval <p>主动健康检查异常探测间隔，单位：秒，0表示不开启</p>
     */
    public void setUnHealthyInterval(Long UnHealthyInterval) {
        this.UnHealthyInterval = UnHealthyInterval;
    }

    /**
     * Get <p>在 GET HTTP 请求中使用的路径，以作为主动运行状况检查的探测器运行。默认： ”/”。</p> 
     * @return HttpPath <p>在 GET HTTP 请求中使用的路径，以作为主动运行状况检查的探测器运行。默认： ”/”。</p>
     */
    public String getHttpPath() {
        return this.HttpPath;
    }

    /**
     * Set <p>在 GET HTTP 请求中使用的路径，以作为主动运行状况检查的探测器运行。默认： ”/”。</p>
     * @param HttpPath <p>在 GET HTTP 请求中使用的路径，以作为主动运行状况检查的探测器运行。默认： ”/”。</p>
     */
    public void setHttpPath(String HttpPath) {
        this.HttpPath = HttpPath;
    }

    /**
     * Get <p>GET HTTP 请求的超时时间，单位：秒。默认 60。</p> 
     * @return Timeout <p>GET HTTP 请求的超时时间，单位：秒。默认 60。</p>
     */
    public Float getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>GET HTTP 请求的超时时间，单位：秒。默认 60。</p>
     * @param Timeout <p>GET HTTP 请求的超时时间，单位：秒。默认 60。</p>
     */
    public void setTimeout(Float Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>Host头</p> 
     * @return HostHeader <p>Host头</p>
     */
    public String getHostHeader() {
        return this.HostHeader;
    }

    /**
     * Set <p>Host头</p>
     * @param HostHeader <p>Host头</p>
     */
    public void setHostHeader(String HostHeader) {
        this.HostHeader = HostHeader;
    }

    public KongActiveHealthCheck() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KongActiveHealthCheck(KongActiveHealthCheck source) {
        if (source.HealthyInterval != null) {
            this.HealthyInterval = new Long(source.HealthyInterval);
        }
        if (source.UnHealthyInterval != null) {
            this.UnHealthyInterval = new Long(source.UnHealthyInterval);
        }
        if (source.HttpPath != null) {
            this.HttpPath = new String(source.HttpPath);
        }
        if (source.Timeout != null) {
            this.Timeout = new Float(source.Timeout);
        }
        if (source.HostHeader != null) {
            this.HostHeader = new String(source.HostHeader);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HealthyInterval", this.HealthyInterval);
        this.setParamSimple(map, prefix + "UnHealthyInterval", this.UnHealthyInterval);
        this.setParamSimple(map, prefix + "HttpPath", this.HttpPath);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "HostHeader", this.HostHeader);

    }
}

