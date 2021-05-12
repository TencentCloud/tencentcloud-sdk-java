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

public class ModifyClusterMachineRequest extends AbstractModel{

    /**
    * 集群id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * svr占用的机器
    */
    @SerializedName("ServerList")
    @Expose
    private MachineInfo [] ServerList;

    /**
    * proxy占用的机器
    */
    @SerializedName("ProxyList")
    @Expose
    private MachineInfo [] ProxyList;

    /**
    * 集群类型1共享集群2独占集群
    */
    @SerializedName("ClusterType")
    @Expose
    private Long ClusterType;

    /**
     * Get 集群id 
     * @return ClusterId 集群id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群id
     * @param ClusterId 集群id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get svr占用的机器 
     * @return ServerList svr占用的机器
     */
    public MachineInfo [] getServerList() {
        return this.ServerList;
    }

    /**
     * Set svr占用的机器
     * @param ServerList svr占用的机器
     */
    public void setServerList(MachineInfo [] ServerList) {
        this.ServerList = ServerList;
    }

    /**
     * Get proxy占用的机器 
     * @return ProxyList proxy占用的机器
     */
    public MachineInfo [] getProxyList() {
        return this.ProxyList;
    }

    /**
     * Set proxy占用的机器
     * @param ProxyList proxy占用的机器
     */
    public void setProxyList(MachineInfo [] ProxyList) {
        this.ProxyList = ProxyList;
    }

    /**
     * Get 集群类型1共享集群2独占集群 
     * @return ClusterType 集群类型1共享集群2独占集群
     */
    public Long getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 集群类型1共享集群2独占集群
     * @param ClusterType 集群类型1共享集群2独占集群
     */
    public void setClusterType(Long ClusterType) {
        this.ClusterType = ClusterType;
    }

    public ModifyClusterMachineRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyClusterMachineRequest(ModifyClusterMachineRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ServerList != null) {
            this.ServerList = new MachineInfo[source.ServerList.length];
            for (int i = 0; i < source.ServerList.length; i++) {
                this.ServerList[i] = new MachineInfo(source.ServerList[i]);
            }
        }
        if (source.ProxyList != null) {
            this.ProxyList = new MachineInfo[source.ProxyList.length];
            for (int i = 0; i < source.ProxyList.length; i++) {
                this.ProxyList[i] = new MachineInfo(source.ProxyList[i]);
            }
        }
        if (source.ClusterType != null) {
            this.ClusterType = new Long(source.ClusterType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "ServerList.", this.ServerList);
        this.setParamArrayObj(map, prefix + "ProxyList.", this.ProxyList);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);

    }
}

