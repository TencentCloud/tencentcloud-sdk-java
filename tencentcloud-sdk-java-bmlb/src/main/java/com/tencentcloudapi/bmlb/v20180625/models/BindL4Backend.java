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
package com.tencentcloudapi.bmlb.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindL4Backend extends AbstractModel{

    /**
    * 待绑定的主机端口，可选值1~65535。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 待绑定的黑石物理机主机ID、虚拟机IP或者是半托管主机ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 待绑定的主机权重，可选值0~100。
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 自定义探测的主机端口，可选值1~65535。（需要监听器开启自定义健康检查）
    */
    @SerializedName("ProbePort")
    @Expose
    private Long ProbePort;

    /**
     * Get 待绑定的主机端口，可选值1~65535。 
     * @return Port 待绑定的主机端口，可选值1~65535。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 待绑定的主机端口，可选值1~65535。
     * @param Port 待绑定的主机端口，可选值1~65535。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 待绑定的黑石物理机主机ID、虚拟机IP或者是半托管主机ID。 
     * @return InstanceId 待绑定的黑石物理机主机ID、虚拟机IP或者是半托管主机ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 待绑定的黑石物理机主机ID、虚拟机IP或者是半托管主机ID。
     * @param InstanceId 待绑定的黑石物理机主机ID、虚拟机IP或者是半托管主机ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 待绑定的主机权重，可选值0~100。 
     * @return Weight 待绑定的主机权重，可选值0~100。
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 待绑定的主机权重，可选值0~100。
     * @param Weight 待绑定的主机权重，可选值0~100。
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 自定义探测的主机端口，可选值1~65535。（需要监听器开启自定义健康检查） 
     * @return ProbePort 自定义探测的主机端口，可选值1~65535。（需要监听器开启自定义健康检查）
     */
    public Long getProbePort() {
        return this.ProbePort;
    }

    /**
     * Set 自定义探测的主机端口，可选值1~65535。（需要监听器开启自定义健康检查）
     * @param ProbePort 自定义探测的主机端口，可选值1~65535。（需要监听器开启自定义健康检查）
     */
    public void setProbePort(Long ProbePort) {
        this.ProbePort = ProbePort;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "ProbePort", this.ProbePort);

    }
}

