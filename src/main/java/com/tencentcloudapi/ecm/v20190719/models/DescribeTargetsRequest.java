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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTargetsRequest extends AbstractModel {

    /**
    * 负载均衡实例 ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 监听器 ID列表
    */
    @SerializedName("ListenerIds")
    @Expose
    private String [] ListenerIds;

    /**
    * 监听器协议类型
    */
    @SerializedName("Protocol")
    @Expose
    private Long Protocol;

    /**
    * 监听器端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
     * Get 负载均衡实例 ID 
     * @return LoadBalancerId 负载均衡实例 ID
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡实例 ID
     * @param LoadBalancerId 负载均衡实例 ID
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 监听器 ID列表 
     * @return ListenerIds 监听器 ID列表
     */
    public String [] getListenerIds() {
        return this.ListenerIds;
    }

    /**
     * Set 监听器 ID列表
     * @param ListenerIds 监听器 ID列表
     */
    public void setListenerIds(String [] ListenerIds) {
        this.ListenerIds = ListenerIds;
    }

    /**
     * Get 监听器协议类型 
     * @return Protocol 监听器协议类型
     */
    public Long getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 监听器协议类型
     * @param Protocol 监听器协议类型
     */
    public void setProtocol(Long Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 监听器端口 
     * @return Port 监听器端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 监听器端口
     * @param Port 监听器端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    public DescribeTargetsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTargetsRequest(DescribeTargetsRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ListenerIds != null) {
            this.ListenerIds = new String[source.ListenerIds.length];
            for (int i = 0; i < source.ListenerIds.length; i++) {
                this.ListenerIds[i] = new String(source.ListenerIds[i]);
            }
        }
        if (source.Protocol != null) {
            this.Protocol = new Long(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamArraySimple(map, prefix + "ListenerIds.", this.ListenerIds);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);

    }
}

