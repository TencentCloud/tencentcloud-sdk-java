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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateHTTPListenerRequest extends AbstractModel {

    /**
    * <p>监听器名称</p>
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * <p>监听器端口，基于同种传输层协议（TCP 或 UDP）的监听器，端口不可重复</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>通道ID，与GroupId不能同时设置，对应为通道创建监听器</p>
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * <p>通道组ID，与ProxyId不能同时设置，对应为通道组创建监听器</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
     * Get <p>监听器名称</p> 
     * @return ListenerName <p>监听器名称</p>
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set <p>监听器名称</p>
     * @param ListenerName <p>监听器名称</p>
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get <p>监听器端口，基于同种传输层协议（TCP 或 UDP）的监听器，端口不可重复</p> 
     * @return Port <p>监听器端口，基于同种传输层协议（TCP 或 UDP）的监听器，端口不可重复</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>监听器端口，基于同种传输层协议（TCP 或 UDP）的监听器，端口不可重复</p>
     * @param Port <p>监听器端口，基于同种传输层协议（TCP 或 UDP）的监听器，端口不可重复</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>通道ID，与GroupId不能同时设置，对应为通道创建监听器</p> 
     * @return ProxyId <p>通道ID，与GroupId不能同时设置，对应为通道创建监听器</p>
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set <p>通道ID，与GroupId不能同时设置，对应为通道创建监听器</p>
     * @param ProxyId <p>通道ID，与GroupId不能同时设置，对应为通道创建监听器</p>
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get <p>通道组ID，与ProxyId不能同时设置，对应为通道组创建监听器</p> 
     * @return GroupId <p>通道组ID，与ProxyId不能同时设置，对应为通道组创建监听器</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>通道组ID，与ProxyId不能同时设置，对应为通道组创建监听器</p>
     * @param GroupId <p>通道组ID，与ProxyId不能同时设置，对应为通道组创建监听器</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    public CreateHTTPListenerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateHTTPListenerRequest(CreateHTTPListenerRequest source) {
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);

    }
}

