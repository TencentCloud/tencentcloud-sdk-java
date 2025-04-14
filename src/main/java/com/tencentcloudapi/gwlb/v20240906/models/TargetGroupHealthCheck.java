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
package com.tencentcloudapi.gwlb.v20240906.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetGroupHealthCheck extends AbstractModel {

    /**
    * 是否开启健康检查。
    */
    @SerializedName("HealthSwitch")
    @Expose
    private Boolean HealthSwitch;

    /**
    * 健康检查使用的协议。支持PING和TCP两种方式，默认为PING。

- icmp: 使用PING的方式进行健康检查
- tcp: 使用TCP连接的方式进行健康检查
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 健康检查端口，探测协议为tcp时，该参数必填。

    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 健康检查超时时间。 默认为2秒。 可配置范围：2 - 30秒。
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * 检测间隔时间。 默认为5秒。 可配置范围：2 - 300秒。
    */
    @SerializedName("IntervalTime")
    @Expose
    private Long IntervalTime;

    /**
    * 检测健康阈值。 默认为3次。 可配置范围：2 - 10次。
    */
    @SerializedName("HealthNum")
    @Expose
    private Long HealthNum;

    /**
    * 检测不健康阈值。 默认为3次。 可配置范围：2 - 10次。
    */
    @SerializedName("UnHealthNum")
    @Expose
    private Long UnHealthNum;

    /**
     * Get 是否开启健康检查。 
     * @return HealthSwitch 是否开启健康检查。
     */
    public Boolean getHealthSwitch() {
        return this.HealthSwitch;
    }

    /**
     * Set 是否开启健康检查。
     * @param HealthSwitch 是否开启健康检查。
     */
    public void setHealthSwitch(Boolean HealthSwitch) {
        this.HealthSwitch = HealthSwitch;
    }

    /**
     * Get 健康检查使用的协议。支持PING和TCP两种方式，默认为PING。

- icmp: 使用PING的方式进行健康检查
- tcp: 使用TCP连接的方式进行健康检查 
     * @return Protocol 健康检查使用的协议。支持PING和TCP两种方式，默认为PING。

- icmp: 使用PING的方式进行健康检查
- tcp: 使用TCP连接的方式进行健康检查
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 健康检查使用的协议。支持PING和TCP两种方式，默认为PING。

- icmp: 使用PING的方式进行健康检查
- tcp: 使用TCP连接的方式进行健康检查
     * @param Protocol 健康检查使用的协议。支持PING和TCP两种方式，默认为PING。

- icmp: 使用PING的方式进行健康检查
- tcp: 使用TCP连接的方式进行健康检查
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 健康检查端口，探测协议为tcp时，该参数必填。
 
     * @return Port 健康检查端口，探测协议为tcp时，该参数必填。

     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 健康检查端口，探测协议为tcp时，该参数必填。

     * @param Port 健康检查端口，探测协议为tcp时，该参数必填。

     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 健康检查超时时间。 默认为2秒。 可配置范围：2 - 30秒。 
     * @return Timeout 健康检查超时时间。 默认为2秒。 可配置范围：2 - 30秒。
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 健康检查超时时间。 默认为2秒。 可配置范围：2 - 30秒。
     * @param Timeout 健康检查超时时间。 默认为2秒。 可配置范围：2 - 30秒。
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get 检测间隔时间。 默认为5秒。 可配置范围：2 - 300秒。 
     * @return IntervalTime 检测间隔时间。 默认为5秒。 可配置范围：2 - 300秒。
     */
    public Long getIntervalTime() {
        return this.IntervalTime;
    }

    /**
     * Set 检测间隔时间。 默认为5秒。 可配置范围：2 - 300秒。
     * @param IntervalTime 检测间隔时间。 默认为5秒。 可配置范围：2 - 300秒。
     */
    public void setIntervalTime(Long IntervalTime) {
        this.IntervalTime = IntervalTime;
    }

    /**
     * Get 检测健康阈值。 默认为3次。 可配置范围：2 - 10次。 
     * @return HealthNum 检测健康阈值。 默认为3次。 可配置范围：2 - 10次。
     */
    public Long getHealthNum() {
        return this.HealthNum;
    }

    /**
     * Set 检测健康阈值。 默认为3次。 可配置范围：2 - 10次。
     * @param HealthNum 检测健康阈值。 默认为3次。 可配置范围：2 - 10次。
     */
    public void setHealthNum(Long HealthNum) {
        this.HealthNum = HealthNum;
    }

    /**
     * Get 检测不健康阈值。 默认为3次。 可配置范围：2 - 10次。 
     * @return UnHealthNum 检测不健康阈值。 默认为3次。 可配置范围：2 - 10次。
     */
    public Long getUnHealthNum() {
        return this.UnHealthNum;
    }

    /**
     * Set 检测不健康阈值。 默认为3次。 可配置范围：2 - 10次。
     * @param UnHealthNum 检测不健康阈值。 默认为3次。 可配置范围：2 - 10次。
     */
    public void setUnHealthNum(Long UnHealthNum) {
        this.UnHealthNum = UnHealthNum;
    }

    public TargetGroupHealthCheck() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetGroupHealthCheck(TargetGroupHealthCheck source) {
        if (source.HealthSwitch != null) {
            this.HealthSwitch = new Boolean(source.HealthSwitch);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.IntervalTime != null) {
            this.IntervalTime = new Long(source.IntervalTime);
        }
        if (source.HealthNum != null) {
            this.HealthNum = new Long(source.HealthNum);
        }
        if (source.UnHealthNum != null) {
            this.UnHealthNum = new Long(source.UnHealthNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HealthSwitch", this.HealthSwitch);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "IntervalTime", this.IntervalTime);
        this.setParamSimple(map, prefix + "HealthNum", this.HealthNum);
        this.setParamSimple(map, prefix + "UnHealthNum", this.UnHealthNum);

    }
}

