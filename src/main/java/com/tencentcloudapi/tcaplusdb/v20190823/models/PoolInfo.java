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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PoolInfo extends AbstractModel{

    /**
    * 唯一id
    */
    @SerializedName("PoolUid")
    @Expose
    private Long PoolUid;

    /**
    * 是否支持ipv6
    */
    @SerializedName("Ipv6Enable")
    @Expose
    private Long Ipv6Enable;

    /**
    * 剩余可用app
    */
    @SerializedName("AvailableAppCount")
    @Expose
    private Long AvailableAppCount;

    /**
    * svr机器列表
    */
    @SerializedName("ServerList")
    @Expose
    private ServerMachineInfo [] ServerList;

    /**
    * proxy机器列表
    */
    @SerializedName("ProxyList")
    @Expose
    private ProxyMachineInfo [] ProxyList;

    /**
     * Get 唯一id 
     * @return PoolUid 唯一id
     */
    public Long getPoolUid() {
        return this.PoolUid;
    }

    /**
     * Set 唯一id
     * @param PoolUid 唯一id
     */
    public void setPoolUid(Long PoolUid) {
        this.PoolUid = PoolUid;
    }

    /**
     * Get 是否支持ipv6 
     * @return Ipv6Enable 是否支持ipv6
     */
    public Long getIpv6Enable() {
        return this.Ipv6Enable;
    }

    /**
     * Set 是否支持ipv6
     * @param Ipv6Enable 是否支持ipv6
     */
    public void setIpv6Enable(Long Ipv6Enable) {
        this.Ipv6Enable = Ipv6Enable;
    }

    /**
     * Get 剩余可用app 
     * @return AvailableAppCount 剩余可用app
     */
    public Long getAvailableAppCount() {
        return this.AvailableAppCount;
    }

    /**
     * Set 剩余可用app
     * @param AvailableAppCount 剩余可用app
     */
    public void setAvailableAppCount(Long AvailableAppCount) {
        this.AvailableAppCount = AvailableAppCount;
    }

    /**
     * Get svr机器列表 
     * @return ServerList svr机器列表
     */
    public ServerMachineInfo [] getServerList() {
        return this.ServerList;
    }

    /**
     * Set svr机器列表
     * @param ServerList svr机器列表
     */
    public void setServerList(ServerMachineInfo [] ServerList) {
        this.ServerList = ServerList;
    }

    /**
     * Get proxy机器列表 
     * @return ProxyList proxy机器列表
     */
    public ProxyMachineInfo [] getProxyList() {
        return this.ProxyList;
    }

    /**
     * Set proxy机器列表
     * @param ProxyList proxy机器列表
     */
    public void setProxyList(ProxyMachineInfo [] ProxyList) {
        this.ProxyList = ProxyList;
    }

    public PoolInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PoolInfo(PoolInfo source) {
        if (source.PoolUid != null) {
            this.PoolUid = new Long(source.PoolUid);
        }
        if (source.Ipv6Enable != null) {
            this.Ipv6Enable = new Long(source.Ipv6Enable);
        }
        if (source.AvailableAppCount != null) {
            this.AvailableAppCount = new Long(source.AvailableAppCount);
        }
        if (source.ServerList != null) {
            this.ServerList = new ServerMachineInfo[source.ServerList.length];
            for (int i = 0; i < source.ServerList.length; i++) {
                this.ServerList[i] = new ServerMachineInfo(source.ServerList[i]);
            }
        }
        if (source.ProxyList != null) {
            this.ProxyList = new ProxyMachineInfo[source.ProxyList.length];
            for (int i = 0; i < source.ProxyList.length; i++) {
                this.ProxyList[i] = new ProxyMachineInfo(source.ProxyList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PoolUid", this.PoolUid);
        this.setParamSimple(map, prefix + "Ipv6Enable", this.Ipv6Enable);
        this.setParamSimple(map, prefix + "AvailableAppCount", this.AvailableAppCount);
        this.setParamArrayObj(map, prefix + "ServerList.", this.ServerList);
        this.setParamArrayObj(map, prefix + "ProxyList.", this.ProxyList);

    }
}

