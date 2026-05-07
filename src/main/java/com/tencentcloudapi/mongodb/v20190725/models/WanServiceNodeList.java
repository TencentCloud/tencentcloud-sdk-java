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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WanServiceNodeList extends AbstractModel {

    /**
    * 实例节点的vip及端口信息。
    */
    @SerializedName("VipVport")
    @Expose
    private String VipVport;

    /**
    * CLB监听器监听端口，取值范围1~65535。
    */
    @SerializedName("ListenerPort")
    @Expose
    private String ListenerPort;

    /**
     * Get 实例节点的vip及端口信息。 
     * @return VipVport 实例节点的vip及端口信息。
     */
    public String getVipVport() {
        return this.VipVport;
    }

    /**
     * Set 实例节点的vip及端口信息。
     * @param VipVport 实例节点的vip及端口信息。
     */
    public void setVipVport(String VipVport) {
        this.VipVport = VipVport;
    }

    /**
     * Get CLB监听器监听端口，取值范围1~65535。 
     * @return ListenerPort CLB监听器监听端口，取值范围1~65535。
     */
    public String getListenerPort() {
        return this.ListenerPort;
    }

    /**
     * Set CLB监听器监听端口，取值范围1~65535。
     * @param ListenerPort CLB监听器监听端口，取值范围1~65535。
     */
    public void setListenerPort(String ListenerPort) {
        this.ListenerPort = ListenerPort;
    }

    public WanServiceNodeList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WanServiceNodeList(WanServiceNodeList source) {
        if (source.VipVport != null) {
            this.VipVport = new String(source.VipVport);
        }
        if (source.ListenerPort != null) {
            this.ListenerPort = new String(source.ListenerPort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VipVport", this.VipVport);
        this.setParamSimple(map, prefix + "ListenerPort", this.ListenerPort);

    }
}

