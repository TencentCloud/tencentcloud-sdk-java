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

public class RealServerStatus extends AbstractModel{

    /**
    * 源站ID。
    */
    @SerializedName("RealServerId")
    @Expose
    private String RealServerId;

    /**
    * 0表示未被绑定 1表示被规则或者监听器绑定。
    */
    @SerializedName("BindStatus")
    @Expose
    private Long BindStatus;

    /**
    * 绑定此源站的通道ID，没有绑定时为空字符串。
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
     * Get 源站ID。 
     * @return RealServerId 源站ID。
     */
    public String getRealServerId() {
        return this.RealServerId;
    }

    /**
     * Set 源站ID。
     * @param RealServerId 源站ID。
     */
    public void setRealServerId(String RealServerId) {
        this.RealServerId = RealServerId;
    }

    /**
     * Get 0表示未被绑定 1表示被规则或者监听器绑定。 
     * @return BindStatus 0表示未被绑定 1表示被规则或者监听器绑定。
     */
    public Long getBindStatus() {
        return this.BindStatus;
    }

    /**
     * Set 0表示未被绑定 1表示被规则或者监听器绑定。
     * @param BindStatus 0表示未被绑定 1表示被规则或者监听器绑定。
     */
    public void setBindStatus(Long BindStatus) {
        this.BindStatus = BindStatus;
    }

    /**
     * Get 绑定此源站的通道ID，没有绑定时为空字符串。 
     * @return ProxyId 绑定此源站的通道ID，没有绑定时为空字符串。
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set 绑定此源站的通道ID，没有绑定时为空字符串。
     * @param ProxyId 绑定此源站的通道ID，没有绑定时为空字符串。
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RealServerId", this.RealServerId);
        this.setParamSimple(map, prefix + "BindStatus", this.BindStatus);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);

    }
}

