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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetHealth extends AbstractModel{

    /**
    * Target的内网IP
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * Target绑定的端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 当前健康状态，true：健康，false：不健康（包括尚未开始探测、探测中、状态异常等几种状态）。只有处于健康状态（且权重大于0），负载均衡才会向其转发流量。
    */
    @SerializedName("HealthStatus")
    @Expose
    private Boolean HealthStatus;

    /**
    * Target的实例ID，如 ins-12345678
    */
    @SerializedName("TargetId")
    @Expose
    private String TargetId;

    /**
    * 当前健康状态的详细信息。如：Alive、Dead、Unknown。Alive状态为健康，Dead状态为异常，Unknown状态包括尚未开始探测、探测中、状态未知。
    */
    @SerializedName("HealthStatusDetial")
    @Expose
    private String HealthStatusDetial;

    /**
     * Get Target的内网IP 
     * @return IP Target的内网IP
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set Target的内网IP
     * @param IP Target的内网IP
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get Target绑定的端口 
     * @return Port Target绑定的端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Target绑定的端口
     * @param Port Target绑定的端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 当前健康状态，true：健康，false：不健康（包括尚未开始探测、探测中、状态异常等几种状态）。只有处于健康状态（且权重大于0），负载均衡才会向其转发流量。 
     * @return HealthStatus 当前健康状态，true：健康，false：不健康（包括尚未开始探测、探测中、状态异常等几种状态）。只有处于健康状态（且权重大于0），负载均衡才会向其转发流量。
     */
    public Boolean getHealthStatus() {
        return this.HealthStatus;
    }

    /**
     * Set 当前健康状态，true：健康，false：不健康（包括尚未开始探测、探测中、状态异常等几种状态）。只有处于健康状态（且权重大于0），负载均衡才会向其转发流量。
     * @param HealthStatus 当前健康状态，true：健康，false：不健康（包括尚未开始探测、探测中、状态异常等几种状态）。只有处于健康状态（且权重大于0），负载均衡才会向其转发流量。
     */
    public void setHealthStatus(Boolean HealthStatus) {
        this.HealthStatus = HealthStatus;
    }

    /**
     * Get Target的实例ID，如 ins-12345678 
     * @return TargetId Target的实例ID，如 ins-12345678
     */
    public String getTargetId() {
        return this.TargetId;
    }

    /**
     * Set Target的实例ID，如 ins-12345678
     * @param TargetId Target的实例ID，如 ins-12345678
     */
    public void setTargetId(String TargetId) {
        this.TargetId = TargetId;
    }

    /**
     * Get 当前健康状态的详细信息。如：Alive、Dead、Unknown。Alive状态为健康，Dead状态为异常，Unknown状态包括尚未开始探测、探测中、状态未知。 
     * @return HealthStatusDetial 当前健康状态的详细信息。如：Alive、Dead、Unknown。Alive状态为健康，Dead状态为异常，Unknown状态包括尚未开始探测、探测中、状态未知。
     */
    public String getHealthStatusDetial() {
        return this.HealthStatusDetial;
    }

    /**
     * Set 当前健康状态的详细信息。如：Alive、Dead、Unknown。Alive状态为健康，Dead状态为异常，Unknown状态包括尚未开始探测、探测中、状态未知。
     * @param HealthStatusDetial 当前健康状态的详细信息。如：Alive、Dead、Unknown。Alive状态为健康，Dead状态为异常，Unknown状态包括尚未开始探测、探测中、状态未知。
     */
    public void setHealthStatusDetial(String HealthStatusDetial) {
        this.HealthStatusDetial = HealthStatusDetial;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "HealthStatus", this.HealthStatus);
        this.setParamSimple(map, prefix + "TargetId", this.TargetId);
        this.setParamSimple(map, prefix + "HealthStatusDetial", this.HealthStatusDetial);

    }
}

