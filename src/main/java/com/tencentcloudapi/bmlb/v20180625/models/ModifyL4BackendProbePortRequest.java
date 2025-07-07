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
package com.tencentcloudapi.bmlb.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyL4BackendProbePortRequest extends AbstractModel {

    /**
    * 负载均衡实例ID，可通过接口DescribeLoadBalancers查询。
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 负载均衡四层监听器ID，可通过接口DescribeL7Listeners查询。
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 黑石物理机主机ID、虚拟机IP或者是半托管主机ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 已绑定的主机端口。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 新的探测端口，可选值1~65535。
    */
    @SerializedName("ProbePort")
    @Expose
    private Long ProbePort;

    /**
    * 绑定类型。0：物理机 1：虚拟机IP 2：半托管机器
    */
    @SerializedName("BindType")
    @Expose
    private Long BindType;

    /**
     * Get 负载均衡实例ID，可通过接口DescribeLoadBalancers查询。 
     * @return LoadBalancerId 负载均衡实例ID，可通过接口DescribeLoadBalancers查询。
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡实例ID，可通过接口DescribeLoadBalancers查询。
     * @param LoadBalancerId 负载均衡实例ID，可通过接口DescribeLoadBalancers查询。
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 负载均衡四层监听器ID，可通过接口DescribeL7Listeners查询。 
     * @return ListenerId 负载均衡四层监听器ID，可通过接口DescribeL7Listeners查询。
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 负载均衡四层监听器ID，可通过接口DescribeL7Listeners查询。
     * @param ListenerId 负载均衡四层监听器ID，可通过接口DescribeL7Listeners查询。
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 黑石物理机主机ID、虚拟机IP或者是半托管主机ID。 
     * @return InstanceId 黑石物理机主机ID、虚拟机IP或者是半托管主机ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 黑石物理机主机ID、虚拟机IP或者是半托管主机ID。
     * @param InstanceId 黑石物理机主机ID、虚拟机IP或者是半托管主机ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 已绑定的主机端口。 
     * @return Port 已绑定的主机端口。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 已绑定的主机端口。
     * @param Port 已绑定的主机端口。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 新的探测端口，可选值1~65535。 
     * @return ProbePort 新的探测端口，可选值1~65535。
     */
    public Long getProbePort() {
        return this.ProbePort;
    }

    /**
     * Set 新的探测端口，可选值1~65535。
     * @param ProbePort 新的探测端口，可选值1~65535。
     */
    public void setProbePort(Long ProbePort) {
        this.ProbePort = ProbePort;
    }

    /**
     * Get 绑定类型。0：物理机 1：虚拟机IP 2：半托管机器 
     * @return BindType 绑定类型。0：物理机 1：虚拟机IP 2：半托管机器
     */
    public Long getBindType() {
        return this.BindType;
    }

    /**
     * Set 绑定类型。0：物理机 1：虚拟机IP 2：半托管机器
     * @param BindType 绑定类型。0：物理机 1：虚拟机IP 2：半托管机器
     */
    public void setBindType(Long BindType) {
        this.BindType = BindType;
    }

    public ModifyL4BackendProbePortRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyL4BackendProbePortRequest(ModifyL4BackendProbePortRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.ProbePort != null) {
            this.ProbePort = new Long(source.ProbePort);
        }
        if (source.BindType != null) {
            this.BindType = new Long(source.BindType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "ProbePort", this.ProbePort);
        this.setParamSimple(map, prefix + "BindType", this.BindType);

    }
}

