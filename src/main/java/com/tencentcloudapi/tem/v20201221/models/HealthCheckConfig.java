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
package com.tencentcloudapi.tem.v20201221.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HealthCheckConfig extends AbstractModel{

    /**
    * 支持的健康检查类型，如 HttpGet，TcpSocket，Exec
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 仅当健康检查类型为 HttpGet 时有效，表示协议类型，如 HTTP，HTTPS
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 仅当健康检查类型为 HttpGet 时有效，表示请求路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 仅当健康检查类型为 Exec 时有效，表示执行的脚本内容
    */
    @SerializedName("Exec")
    @Expose
    private String Exec;

    /**
    * 仅当健康检查类型为 HttpGet\TcpSocket 时有效，表示请求路径
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 检查延迟开始时间，单位为秒，默认为 0
    */
    @SerializedName("InitialDelaySeconds")
    @Expose
    private Long InitialDelaySeconds;

    /**
    * 超时时间，单位为秒，默认为 1
    */
    @SerializedName("TimeoutSeconds")
    @Expose
    private Long TimeoutSeconds;

    /**
    * 间隔时间，单位为秒，默认为 10
    */
    @SerializedName("PeriodSeconds")
    @Expose
    private Long PeriodSeconds;

    /**
     * Get 支持的健康检查类型，如 HttpGet，TcpSocket，Exec 
     * @return Type 支持的健康检查类型，如 HttpGet，TcpSocket，Exec
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 支持的健康检查类型，如 HttpGet，TcpSocket，Exec
     * @param Type 支持的健康检查类型，如 HttpGet，TcpSocket，Exec
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 仅当健康检查类型为 HttpGet 时有效，表示协议类型，如 HTTP，HTTPS 
     * @return Protocol 仅当健康检查类型为 HttpGet 时有效，表示协议类型，如 HTTP，HTTPS
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 仅当健康检查类型为 HttpGet 时有效，表示协议类型，如 HTTP，HTTPS
     * @param Protocol 仅当健康检查类型为 HttpGet 时有效，表示协议类型，如 HTTP，HTTPS
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 仅当健康检查类型为 HttpGet 时有效，表示请求路径 
     * @return Path 仅当健康检查类型为 HttpGet 时有效，表示请求路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 仅当健康检查类型为 HttpGet 时有效，表示请求路径
     * @param Path 仅当健康检查类型为 HttpGet 时有效，表示请求路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 仅当健康检查类型为 Exec 时有效，表示执行的脚本内容 
     * @return Exec 仅当健康检查类型为 Exec 时有效，表示执行的脚本内容
     */
    public String getExec() {
        return this.Exec;
    }

    /**
     * Set 仅当健康检查类型为 Exec 时有效，表示执行的脚本内容
     * @param Exec 仅当健康检查类型为 Exec 时有效，表示执行的脚本内容
     */
    public void setExec(String Exec) {
        this.Exec = Exec;
    }

    /**
     * Get 仅当健康检查类型为 HttpGet\TcpSocket 时有效，表示请求路径 
     * @return Port 仅当健康检查类型为 HttpGet\TcpSocket 时有效，表示请求路径
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 仅当健康检查类型为 HttpGet\TcpSocket 时有效，表示请求路径
     * @param Port 仅当健康检查类型为 HttpGet\TcpSocket 时有效，表示请求路径
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 检查延迟开始时间，单位为秒，默认为 0 
     * @return InitialDelaySeconds 检查延迟开始时间，单位为秒，默认为 0
     */
    public Long getInitialDelaySeconds() {
        return this.InitialDelaySeconds;
    }

    /**
     * Set 检查延迟开始时间，单位为秒，默认为 0
     * @param InitialDelaySeconds 检查延迟开始时间，单位为秒，默认为 0
     */
    public void setInitialDelaySeconds(Long InitialDelaySeconds) {
        this.InitialDelaySeconds = InitialDelaySeconds;
    }

    /**
     * Get 超时时间，单位为秒，默认为 1 
     * @return TimeoutSeconds 超时时间，单位为秒，默认为 1
     */
    public Long getTimeoutSeconds() {
        return this.TimeoutSeconds;
    }

    /**
     * Set 超时时间，单位为秒，默认为 1
     * @param TimeoutSeconds 超时时间，单位为秒，默认为 1
     */
    public void setTimeoutSeconds(Long TimeoutSeconds) {
        this.TimeoutSeconds = TimeoutSeconds;
    }

    /**
     * Get 间隔时间，单位为秒，默认为 10 
     * @return PeriodSeconds 间隔时间，单位为秒，默认为 10
     */
    public Long getPeriodSeconds() {
        return this.PeriodSeconds;
    }

    /**
     * Set 间隔时间，单位为秒，默认为 10
     * @param PeriodSeconds 间隔时间，单位为秒，默认为 10
     */
    public void setPeriodSeconds(Long PeriodSeconds) {
        this.PeriodSeconds = PeriodSeconds;
    }

    public HealthCheckConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HealthCheckConfig(HealthCheckConfig source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Exec != null) {
            this.Exec = new String(source.Exec);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.InitialDelaySeconds != null) {
            this.InitialDelaySeconds = new Long(source.InitialDelaySeconds);
        }
        if (source.TimeoutSeconds != null) {
            this.TimeoutSeconds = new Long(source.TimeoutSeconds);
        }
        if (source.PeriodSeconds != null) {
            this.PeriodSeconds = new Long(source.PeriodSeconds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Exec", this.Exec);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "InitialDelaySeconds", this.InitialDelaySeconds);
        this.setParamSimple(map, prefix + "TimeoutSeconds", this.TimeoutSeconds);
        this.setParamSimple(map, prefix + "PeriodSeconds", this.PeriodSeconds);

    }
}

