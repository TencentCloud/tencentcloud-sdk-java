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

public class RealServerBindSetReq extends AbstractModel {

    /**
    * 源站id
    */
    @SerializedName("RealServerId")
    @Expose
    private String RealServerId;

    /**
    * 源站端口
    */
    @SerializedName("RealServerPort")
    @Expose
    private Long RealServerPort;

    /**
    * 源站IP
    */
    @SerializedName("RealServerIP")
    @Expose
    private String RealServerIP;

    /**
    * 源站权重
    */
    @SerializedName("RealServerWeight")
    @Expose
    private Long RealServerWeight;

    /**
    * 源站主备角色：master表示主，slave表示备，该参数必须在监听器打开了源站主备模式。
    */
    @SerializedName("RealServerFailoverRole")
    @Expose
    private String RealServerFailoverRole;

    /**
     * Get 源站id 
     * @return RealServerId 源站id
     */
    public String getRealServerId() {
        return this.RealServerId;
    }

    /**
     * Set 源站id
     * @param RealServerId 源站id
     */
    public void setRealServerId(String RealServerId) {
        this.RealServerId = RealServerId;
    }

    /**
     * Get 源站端口 
     * @return RealServerPort 源站端口
     */
    public Long getRealServerPort() {
        return this.RealServerPort;
    }

    /**
     * Set 源站端口
     * @param RealServerPort 源站端口
     */
    public void setRealServerPort(Long RealServerPort) {
        this.RealServerPort = RealServerPort;
    }

    /**
     * Get 源站IP 
     * @return RealServerIP 源站IP
     */
    public String getRealServerIP() {
        return this.RealServerIP;
    }

    /**
     * Set 源站IP
     * @param RealServerIP 源站IP
     */
    public void setRealServerIP(String RealServerIP) {
        this.RealServerIP = RealServerIP;
    }

    /**
     * Get 源站权重 
     * @return RealServerWeight 源站权重
     */
    public Long getRealServerWeight() {
        return this.RealServerWeight;
    }

    /**
     * Set 源站权重
     * @param RealServerWeight 源站权重
     */
    public void setRealServerWeight(Long RealServerWeight) {
        this.RealServerWeight = RealServerWeight;
    }

    /**
     * Get 源站主备角色：master表示主，slave表示备，该参数必须在监听器打开了源站主备模式。 
     * @return RealServerFailoverRole 源站主备角色：master表示主，slave表示备，该参数必须在监听器打开了源站主备模式。
     */
    public String getRealServerFailoverRole() {
        return this.RealServerFailoverRole;
    }

    /**
     * Set 源站主备角色：master表示主，slave表示备，该参数必须在监听器打开了源站主备模式。
     * @param RealServerFailoverRole 源站主备角色：master表示主，slave表示备，该参数必须在监听器打开了源站主备模式。
     */
    public void setRealServerFailoverRole(String RealServerFailoverRole) {
        this.RealServerFailoverRole = RealServerFailoverRole;
    }

    public RealServerBindSetReq() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RealServerBindSetReq(RealServerBindSetReq source) {
        if (source.RealServerId != null) {
            this.RealServerId = new String(source.RealServerId);
        }
        if (source.RealServerPort != null) {
            this.RealServerPort = new Long(source.RealServerPort);
        }
        if (source.RealServerIP != null) {
            this.RealServerIP = new String(source.RealServerIP);
        }
        if (source.RealServerWeight != null) {
            this.RealServerWeight = new Long(source.RealServerWeight);
        }
        if (source.RealServerFailoverRole != null) {
            this.RealServerFailoverRole = new String(source.RealServerFailoverRole);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RealServerId", this.RealServerId);
        this.setParamSimple(map, prefix + "RealServerPort", this.RealServerPort);
        this.setParamSimple(map, prefix + "RealServerIP", this.RealServerIP);
        this.setParamSimple(map, prefix + "RealServerWeight", this.RealServerWeight);
        this.setParamSimple(map, prefix + "RealServerFailoverRole", this.RealServerFailoverRole);

    }
}

