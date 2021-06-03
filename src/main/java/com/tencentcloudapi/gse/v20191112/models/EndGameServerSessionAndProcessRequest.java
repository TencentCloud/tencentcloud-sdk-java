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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EndGameServerSessionAndProcessRequest extends AbstractModel{

    /**
    * 游戏服务器会话ID
    */
    @SerializedName("GameServerSessionId")
    @Expose
    private String GameServerSessionId;

    /**
    * CVM的公网IP地址
    */
    @SerializedName("IpAddress")
    @Expose
    private String IpAddress;

    /**
    * 端口号，最小值不小于1，最大值不超过60000
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
     * Get 游戏服务器会话ID 
     * @return GameServerSessionId 游戏服务器会话ID
     */
    public String getGameServerSessionId() {
        return this.GameServerSessionId;
    }

    /**
     * Set 游戏服务器会话ID
     * @param GameServerSessionId 游戏服务器会话ID
     */
    public void setGameServerSessionId(String GameServerSessionId) {
        this.GameServerSessionId = GameServerSessionId;
    }

    /**
     * Get CVM的公网IP地址 
     * @return IpAddress CVM的公网IP地址
     */
    public String getIpAddress() {
        return this.IpAddress;
    }

    /**
     * Set CVM的公网IP地址
     * @param IpAddress CVM的公网IP地址
     */
    public void setIpAddress(String IpAddress) {
        this.IpAddress = IpAddress;
    }

    /**
     * Get 端口号，最小值不小于1，最大值不超过60000 
     * @return Port 端口号，最小值不小于1，最大值不超过60000
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 端口号，最小值不小于1，最大值不超过60000
     * @param Port 端口号，最小值不小于1，最大值不超过60000
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    public EndGameServerSessionAndProcessRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EndGameServerSessionAndProcessRequest(EndGameServerSessionAndProcessRequest source) {
        if (source.GameServerSessionId != null) {
            this.GameServerSessionId = new String(source.GameServerSessionId);
        }
        if (source.IpAddress != null) {
            this.IpAddress = new String(source.IpAddress);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GameServerSessionId", this.GameServerSessionId);
        this.setParamSimple(map, prefix + "IpAddress", this.IpAddress);
        this.setParamSimple(map, prefix + "Port", this.Port);

    }
}

