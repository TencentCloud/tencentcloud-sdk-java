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
package com.tencentcloudapi.ump.v20200918.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServerStateItem extends AbstractModel{

    /**
    * 服务器状态
1: 在线
2: 离线
3: 重启
    */
    @SerializedName("ServerState")
    @Expose
    private Long ServerState;

    /**
    * 服务器IP
    */
    @SerializedName("ServerIp")
    @Expose
    private String ServerIp;

    /**
    * 硬盘监控信息列表
    */
    @SerializedName("DiskInfos")
    @Expose
    private DiskInfo [] DiskInfos;

    /**
     * Get 服务器状态
1: 在线
2: 离线
3: 重启 
     * @return ServerState 服务器状态
1: 在线
2: 离线
3: 重启
     */
    public Long getServerState() {
        return this.ServerState;
    }

    /**
     * Set 服务器状态
1: 在线
2: 离线
3: 重启
     * @param ServerState 服务器状态
1: 在线
2: 离线
3: 重启
     */
    public void setServerState(Long ServerState) {
        this.ServerState = ServerState;
    }

    /**
     * Get 服务器IP 
     * @return ServerIp 服务器IP
     */
    public String getServerIp() {
        return this.ServerIp;
    }

    /**
     * Set 服务器IP
     * @param ServerIp 服务器IP
     */
    public void setServerIp(String ServerIp) {
        this.ServerIp = ServerIp;
    }

    /**
     * Get 硬盘监控信息列表 
     * @return DiskInfos 硬盘监控信息列表
     */
    public DiskInfo [] getDiskInfos() {
        return this.DiskInfos;
    }

    /**
     * Set 硬盘监控信息列表
     * @param DiskInfos 硬盘监控信息列表
     */
    public void setDiskInfos(DiskInfo [] DiskInfos) {
        this.DiskInfos = DiskInfos;
    }

    public ServerStateItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServerStateItem(ServerStateItem source) {
        if (source.ServerState != null) {
            this.ServerState = new Long(source.ServerState);
        }
        if (source.ServerIp != null) {
            this.ServerIp = new String(source.ServerIp);
        }
        if (source.DiskInfos != null) {
            this.DiskInfos = new DiskInfo[source.DiskInfos.length];
            for (int i = 0; i < source.DiskInfos.length; i++) {
                this.DiskInfos[i] = new DiskInfo(source.DiskInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServerState", this.ServerState);
        this.setParamSimple(map, prefix + "ServerIp", this.ServerIp);
        this.setParamArrayObj(map, prefix + "DiskInfos.", this.DiskInfos);

    }
}

