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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindRealServer extends AbstractModel {

    /**
    * 源站ID
    */
    @SerializedName("RealServerId")
    @Expose
    private String RealServerId;

    /**
    * 源站IP或者域名
    */
    @SerializedName("RealServerIP")
    @Expose
    private String RealServerIP;

    /**
    * 该源站所占权重
    */
    @SerializedName("RealServerWeight")
    @Expose
    private Long RealServerWeight;

    /**
    * 源站健康检查状态，其中：
0表示正常；
1表示异常。
未开启健康检查状态时，该状态始终为正常。
    */
    @SerializedName("RealServerStatus")
    @Expose
    private Long RealServerStatus;

    /**
    * 源站的端口号
    */
    @SerializedName("RealServerPort")
    @Expose
    private Long RealServerPort;

    /**
    * 当源站为域名时，域名被解析成一个或者多个IP，该字段表示其中异常的IP列表。状态异常，但该字段为空时，表示域名解析异常。
    */
    @SerializedName("DownIPList")
    @Expose
    private String [] DownIPList;

    /**
    * 源站主备角色：master表示主，slave表示备，该参数必须在监听器打开了源站主备模式。
    */
    @SerializedName("RealServerFailoverRole")
    @Expose
    private String RealServerFailoverRole;

    /**
     * Get 源站ID 
     * @return RealServerId 源站ID
     */
    public String getRealServerId() {
        return this.RealServerId;
    }

    /**
     * Set 源站ID
     * @param RealServerId 源站ID
     */
    public void setRealServerId(String RealServerId) {
        this.RealServerId = RealServerId;
    }

    /**
     * Get 源站IP或者域名 
     * @return RealServerIP 源站IP或者域名
     */
    public String getRealServerIP() {
        return this.RealServerIP;
    }

    /**
     * Set 源站IP或者域名
     * @param RealServerIP 源站IP或者域名
     */
    public void setRealServerIP(String RealServerIP) {
        this.RealServerIP = RealServerIP;
    }

    /**
     * Get 该源站所占权重 
     * @return RealServerWeight 该源站所占权重
     */
    public Long getRealServerWeight() {
        return this.RealServerWeight;
    }

    /**
     * Set 该源站所占权重
     * @param RealServerWeight 该源站所占权重
     */
    public void setRealServerWeight(Long RealServerWeight) {
        this.RealServerWeight = RealServerWeight;
    }

    /**
     * Get 源站健康检查状态，其中：
0表示正常；
1表示异常。
未开启健康检查状态时，该状态始终为正常。 
     * @return RealServerStatus 源站健康检查状态，其中：
0表示正常；
1表示异常。
未开启健康检查状态时，该状态始终为正常。
     */
    public Long getRealServerStatus() {
        return this.RealServerStatus;
    }

    /**
     * Set 源站健康检查状态，其中：
0表示正常；
1表示异常。
未开启健康检查状态时，该状态始终为正常。
     * @param RealServerStatus 源站健康检查状态，其中：
0表示正常；
1表示异常。
未开启健康检查状态时，该状态始终为正常。
     */
    public void setRealServerStatus(Long RealServerStatus) {
        this.RealServerStatus = RealServerStatus;
    }

    /**
     * Get 源站的端口号 
     * @return RealServerPort 源站的端口号
     */
    public Long getRealServerPort() {
        return this.RealServerPort;
    }

    /**
     * Set 源站的端口号
     * @param RealServerPort 源站的端口号
     */
    public void setRealServerPort(Long RealServerPort) {
        this.RealServerPort = RealServerPort;
    }

    /**
     * Get 当源站为域名时，域名被解析成一个或者多个IP，该字段表示其中异常的IP列表。状态异常，但该字段为空时，表示域名解析异常。 
     * @return DownIPList 当源站为域名时，域名被解析成一个或者多个IP，该字段表示其中异常的IP列表。状态异常，但该字段为空时，表示域名解析异常。
     */
    public String [] getDownIPList() {
        return this.DownIPList;
    }

    /**
     * Set 当源站为域名时，域名被解析成一个或者多个IP，该字段表示其中异常的IP列表。状态异常，但该字段为空时，表示域名解析异常。
     * @param DownIPList 当源站为域名时，域名被解析成一个或者多个IP，该字段表示其中异常的IP列表。状态异常，但该字段为空时，表示域名解析异常。
     */
    public void setDownIPList(String [] DownIPList) {
        this.DownIPList = DownIPList;
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

    public BindRealServer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindRealServer(BindRealServer source) {
        if (source.RealServerId != null) {
            this.RealServerId = new String(source.RealServerId);
        }
        if (source.RealServerIP != null) {
            this.RealServerIP = new String(source.RealServerIP);
        }
        if (source.RealServerWeight != null) {
            this.RealServerWeight = new Long(source.RealServerWeight);
        }
        if (source.RealServerStatus != null) {
            this.RealServerStatus = new Long(source.RealServerStatus);
        }
        if (source.RealServerPort != null) {
            this.RealServerPort = new Long(source.RealServerPort);
        }
        if (source.DownIPList != null) {
            this.DownIPList = new String[source.DownIPList.length];
            for (int i = 0; i < source.DownIPList.length; i++) {
                this.DownIPList[i] = new String(source.DownIPList[i]);
            }
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
        this.setParamSimple(map, prefix + "RealServerIP", this.RealServerIP);
        this.setParamSimple(map, prefix + "RealServerWeight", this.RealServerWeight);
        this.setParamSimple(map, prefix + "RealServerStatus", this.RealServerStatus);
        this.setParamSimple(map, prefix + "RealServerPort", this.RealServerPort);
        this.setParamArraySimple(map, prefix + "DownIPList.", this.DownIPList);
        this.setParamSimple(map, prefix + "RealServerFailoverRole", this.RealServerFailoverRole);

    }
}

