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

public class ProxySimpleInfo extends AbstractModel{

    /**
    * 通道ID
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * 通道名称
    */
    @SerializedName("ProxyName")
    @Expose
    private String ProxyName;

    /**
    * 监听器列表
    */
    @SerializedName("ListenerList")
    @Expose
    private ListenerInfo [] ListenerList;

    /**
     * Get 通道ID 
     * @return ProxyId 通道ID
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set 通道ID
     * @param ProxyId 通道ID
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get 通道名称 
     * @return ProxyName 通道名称
     */
    public String getProxyName() {
        return this.ProxyName;
    }

    /**
     * Set 通道名称
     * @param ProxyName 通道名称
     */
    public void setProxyName(String ProxyName) {
        this.ProxyName = ProxyName;
    }

    /**
     * Get 监听器列表 
     * @return ListenerList 监听器列表
     */
    public ListenerInfo [] getListenerList() {
        return this.ListenerList;
    }

    /**
     * Set 监听器列表
     * @param ListenerList 监听器列表
     */
    public void setListenerList(ListenerInfo [] ListenerList) {
        this.ListenerList = ListenerList;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "ProxyName", this.ProxyName);
        this.setParamArrayObj(map, prefix + "ListenerList.", this.ListenerList);

    }
}

