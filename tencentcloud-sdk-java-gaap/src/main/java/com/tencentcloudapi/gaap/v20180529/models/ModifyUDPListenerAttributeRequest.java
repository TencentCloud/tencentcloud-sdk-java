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

public class ModifyUDPListenerAttributeRequest extends AbstractModel{

    /**
    * 监听器ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 通道组ID，ProxyId和GroupId必须设置一个，但不能同时设置。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 通道ID，ProxyId和GroupId必须设置一个，但不能同时设置。
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * 监听器名称
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * 监听器源站调度策略
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
     * Get 监听器ID 
     * @return ListenerId 监听器ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 监听器ID
     * @param ListenerId 监听器ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 通道组ID，ProxyId和GroupId必须设置一个，但不能同时设置。 
     * @return GroupId 通道组ID，ProxyId和GroupId必须设置一个，但不能同时设置。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 通道组ID，ProxyId和GroupId必须设置一个，但不能同时设置。
     * @param GroupId 通道组ID，ProxyId和GroupId必须设置一个，但不能同时设置。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 通道ID，ProxyId和GroupId必须设置一个，但不能同时设置。 
     * @return ProxyId 通道ID，ProxyId和GroupId必须设置一个，但不能同时设置。
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set 通道ID，ProxyId和GroupId必须设置一个，但不能同时设置。
     * @param ProxyId 通道ID，ProxyId和GroupId必须设置一个，但不能同时设置。
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

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
     * Get 监听器源站调度策略 
     * @return Scheduler 监听器源站调度策略
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set 监听器源站调度策略
     * @param Scheduler 监听器源站调度策略
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);

    }
}

