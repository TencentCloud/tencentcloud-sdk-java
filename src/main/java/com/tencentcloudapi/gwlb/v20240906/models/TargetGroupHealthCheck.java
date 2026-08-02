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
package com.tencentcloudapi.gwlb.v20240906.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetGroupHealthCheck extends AbstractModel {

    /**
    * <p>是否开启健康检查。</p>
    */
    @SerializedName("HealthSwitch")
    @Expose
    private Boolean HealthSwitch;

    /**
    * <p>健康检查使用的协议。支持PING和TCP两种方式，默认为PING。</p><ul><li>icmp: 使用PING的方式进行健康检查</li><li>tcp: 使用TCP连接的方式进行健康检查</li></ul>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>健康检查端口，探测协议为tcp时，该参数必填。</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>健康检查超时时间。 默认为2秒。 可配置范围：2 - 30秒。</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>检测间隔时间。 默认为5秒。 可配置范围：2 - 300秒。</p>
    */
    @SerializedName("IntervalTime")
    @Expose
    private Long IntervalTime;

    /**
    * <p>检测健康阈值。 默认为3次。 可配置范围：2 - 10次。</p>
    */
    @SerializedName("HealthNum")
    @Expose
    private Long HealthNum;

    /**
    * <p>检测不健康阈值。 默认为3次。 可配置范围：2 - 10次。</p>
    */
    @SerializedName("UnHealthNum")
    @Expose
    private Long UnHealthNum;

    /**
     * Get <p>是否开启健康检查。</p> 
     * @return HealthSwitch <p>是否开启健康检查。</p>
     */
    public Boolean getHealthSwitch() {
        return this.HealthSwitch;
    }

    /**
     * Set <p>是否开启健康检查。</p>
     * @param HealthSwitch <p>是否开启健康检查。</p>
     */
    public void setHealthSwitch(Boolean HealthSwitch) {
        this.HealthSwitch = HealthSwitch;
    }

    /**
     * Get <p>健康检查使用的协议。支持PING和TCP两种方式，默认为PING。</p><ul><li>icmp: 使用PING的方式进行健康检查</li><li>tcp: 使用TCP连接的方式进行健康检查</li></ul> 
     * @return Protocol <p>健康检查使用的协议。支持PING和TCP两种方式，默认为PING。</p><ul><li>icmp: 使用PING的方式进行健康检查</li><li>tcp: 使用TCP连接的方式进行健康检查</li></ul>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>健康检查使用的协议。支持PING和TCP两种方式，默认为PING。</p><ul><li>icmp: 使用PING的方式进行健康检查</li><li>tcp: 使用TCP连接的方式进行健康检查</li></ul>
     * @param Protocol <p>健康检查使用的协议。支持PING和TCP两种方式，默认为PING。</p><ul><li>icmp: 使用PING的方式进行健康检查</li><li>tcp: 使用TCP连接的方式进行健康检查</li></ul>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>健康检查端口，探测协议为tcp时，该参数必填。</p> 
     * @return Port <p>健康检查端口，探测协议为tcp时，该参数必填。</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>健康检查端口，探测协议为tcp时，该参数必填。</p>
     * @param Port <p>健康检查端口，探测协议为tcp时，该参数必填。</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>健康检查超时时间。 默认为2秒。 可配置范围：2 - 30秒。</p> 
     * @return Timeout <p>健康检查超时时间。 默认为2秒。 可配置范围：2 - 30秒。</p>
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>健康检查超时时间。 默认为2秒。 可配置范围：2 - 30秒。</p>
     * @param Timeout <p>健康检查超时时间。 默认为2秒。 可配置范围：2 - 30秒。</p>
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>检测间隔时间。 默认为5秒。 可配置范围：2 - 300秒。</p> 
     * @return IntervalTime <p>检测间隔时间。 默认为5秒。 可配置范围：2 - 300秒。</p>
     */
    public Long getIntervalTime() {
        return this.IntervalTime;
    }

    /**
     * Set <p>检测间隔时间。 默认为5秒。 可配置范围：2 - 300秒。</p>
     * @param IntervalTime <p>检测间隔时间。 默认为5秒。 可配置范围：2 - 300秒。</p>
     */
    public void setIntervalTime(Long IntervalTime) {
        this.IntervalTime = IntervalTime;
    }

    /**
     * Get <p>检测健康阈值。 默认为3次。 可配置范围：2 - 10次。</p> 
     * @return HealthNum <p>检测健康阈值。 默认为3次。 可配置范围：2 - 10次。</p>
     */
    public Long getHealthNum() {
        return this.HealthNum;
    }

    /**
     * Set <p>检测健康阈值。 默认为3次。 可配置范围：2 - 10次。</p>
     * @param HealthNum <p>检测健康阈值。 默认为3次。 可配置范围：2 - 10次。</p>
     */
    public void setHealthNum(Long HealthNum) {
        this.HealthNum = HealthNum;
    }

    /**
     * Get <p>检测不健康阈值。 默认为3次。 可配置范围：2 - 10次。</p> 
     * @return UnHealthNum <p>检测不健康阈值。 默认为3次。 可配置范围：2 - 10次。</p>
     */
    public Long getUnHealthNum() {
        return this.UnHealthNum;
    }

    /**
     * Set <p>检测不健康阈值。 默认为3次。 可配置范围：2 - 10次。</p>
     * @param UnHealthNum <p>检测不健康阈值。 默认为3次。 可配置范围：2 - 10次。</p>
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

