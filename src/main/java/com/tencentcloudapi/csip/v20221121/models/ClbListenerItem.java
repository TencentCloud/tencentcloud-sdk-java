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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClbListenerItem extends AbstractModel {

    /**
    * <p>监听器ID</p>
    */
    @SerializedName("ListenerID")
    @Expose
    private String ListenerID;

    /**
    * <p>监听器名称</p>
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * <p>协议</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>端口</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get <p>监听器ID</p> 
     * @return ListenerID <p>监听器ID</p>
     */
    public String getListenerID() {
        return this.ListenerID;
    }

    /**
     * Set <p>监听器ID</p>
     * @param ListenerID <p>监听器ID</p>
     */
    public void setListenerID(String ListenerID) {
        this.ListenerID = ListenerID;
    }

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
     * Get <p>协议</p> 
     * @return Protocol <p>协议</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>协议</p>
     * @param Protocol <p>协议</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>端口</p> 
     * @return Port <p>端口</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>端口</p>
     * @param Port <p>端口</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public ClbListenerItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClbListenerItem(ClbListenerItem source) {
        if (source.ListenerID != null) {
            this.ListenerID = new String(source.ListenerID);
        }
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerID", this.ListenerID);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

