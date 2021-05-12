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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateHTTPListenerRequest extends AbstractModel{

    /**
    * 监听器名称
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * 监听器端口，基于同种传输层协议（TCP 或 UDP）的监听器，端口不可重复
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 通道ID，与GroupId不能同时设置，对应为通道创建监听器
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * 通道组ID，与ProxyId不能同时设置，对应为通道组创建监听器
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
     * Get 监听器名称 
     * @return ListenerName 监听器名称
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set 监听器名称
     * @param ListenerName 监听器名称
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get 监听器端口，基于同种传输层协议（TCP 或 UDP）的监听器，端口不可重复 
     * @return Port 监听器端口，基于同种传输层协议（TCP 或 UDP）的监听器，端口不可重复
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 监听器端口，基于同种传输层协议（TCP 或 UDP）的监听器，端口不可重复
     * @param Port 监听器端口，基于同种传输层协议（TCP 或 UDP）的监听器，端口不可重复
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 通道ID，与GroupId不能同时设置，对应为通道创建监听器 
     * @return ProxyId 通道ID，与GroupId不能同时设置，对应为通道创建监听器
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set 通道ID，与GroupId不能同时设置，对应为通道创建监听器
     * @param ProxyId 通道ID，与GroupId不能同时设置，对应为通道创建监听器
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get 通道组ID，与ProxyId不能同时设置，对应为通道组创建监听器 
     * @return GroupId 通道组ID，与ProxyId不能同时设置，对应为通道组创建监听器
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 通道组ID，与ProxyId不能同时设置，对应为通道组创建监听器
     * @param GroupId 通道组ID，与ProxyId不能同时设置，对应为通道组创建监听器
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

