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

public class DevicesBindInfoL4Listener extends AbstractModel{

    /**
    * 七层监听器实例ID。
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 七层监听器协议类型，可选值：http,https。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 七层监听器的监听端口。
    */
    @SerializedName("LoadBalancerPort")
    @Expose
    private Long LoadBalancerPort;

    /**
    * 该转发路径所绑定的主机列表。
    */
    @SerializedName("BackendSet")
    @Expose
    private DevicesBindInfoBackend [] BackendSet;

    /**
     * Get 七层监听器实例ID。 
     * @return ListenerId 七层监听器实例ID。
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 七层监听器实例ID。
     * @param ListenerId 七层监听器实例ID。
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 七层监听器协议类型，可选值：http,https。 
     * @return Protocol 七层监听器协议类型，可选值：http,https。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 七层监听器协议类型，可选值：http,https。
     * @param Protocol 七层监听器协议类型，可选值：http,https。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 七层监听器的监听端口。 
     * @return LoadBalancerPort 七层监听器的监听端口。
     */
    public Long getLoadBalancerPort() {
        return this.LoadBalancerPort;
    }

    /**
     * Set 七层监听器的监听端口。
     * @param LoadBalancerPort 七层监听器的监听端口。
     */
    public void setLoadBalancerPort(Long LoadBalancerPort) {
        this.LoadBalancerPort = LoadBalancerPort;
    }

    /**
     * Get 该转发路径所绑定的主机列表。 
     * @return BackendSet 该转发路径所绑定的主机列表。
     */
    public DevicesBindInfoBackend [] getBackendSet() {
        return this.BackendSet;
    }

    /**
     * Set 该转发路径所绑定的主机列表。
     * @param BackendSet 该转发路径所绑定的主机列表。
     */
    public void setBackendSet(DevicesBindInfoBackend [] BackendSet) {
        this.BackendSet = BackendSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "LoadBalancerPort", this.LoadBalancerPort);
        this.setParamArrayObj(map, prefix + "BackendSet.", this.BackendSet);

    }
}

