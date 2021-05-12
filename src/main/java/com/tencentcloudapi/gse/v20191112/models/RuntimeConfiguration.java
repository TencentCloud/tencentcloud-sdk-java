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

public class RuntimeConfiguration extends AbstractModel{

    /**
    * 游戏会话进程超时，最小值1，最大值600，单位秒
    */
    @SerializedName("GameServerSessionActivationTimeoutSeconds")
    @Expose
    private Long GameServerSessionActivationTimeoutSeconds;

    /**
    * 最大游戏会话数，最小值1，最大值2147483647
    */
    @SerializedName("MaxConcurrentGameServerSessionActivations")
    @Expose
    private Long MaxConcurrentGameServerSessionActivations;

    /**
    * 服务进程配置，至少有一个进程配置
    */
    @SerializedName("ServerProcesses")
    @Expose
    private ServerProcesse [] ServerProcesses;

    /**
     * Get 游戏会话进程超时，最小值1，最大值600，单位秒 
     * @return GameServerSessionActivationTimeoutSeconds 游戏会话进程超时，最小值1，最大值600，单位秒
     */
    public Long getGameServerSessionActivationTimeoutSeconds() {
        return this.GameServerSessionActivationTimeoutSeconds;
    }

    /**
     * Set 游戏会话进程超时，最小值1，最大值600，单位秒
     * @param GameServerSessionActivationTimeoutSeconds 游戏会话进程超时，最小值1，最大值600，单位秒
     */
    public void setGameServerSessionActivationTimeoutSeconds(Long GameServerSessionActivationTimeoutSeconds) {
        this.GameServerSessionActivationTimeoutSeconds = GameServerSessionActivationTimeoutSeconds;
    }

    /**
     * Get 最大游戏会话数，最小值1，最大值2147483647 
     * @return MaxConcurrentGameServerSessionActivations 最大游戏会话数，最小值1，最大值2147483647
     */
    public Long getMaxConcurrentGameServerSessionActivations() {
        return this.MaxConcurrentGameServerSessionActivations;
    }

    /**
     * Set 最大游戏会话数，最小值1，最大值2147483647
     * @param MaxConcurrentGameServerSessionActivations 最大游戏会话数，最小值1，最大值2147483647
     */
    public void setMaxConcurrentGameServerSessionActivations(Long MaxConcurrentGameServerSessionActivations) {
        this.MaxConcurrentGameServerSessionActivations = MaxConcurrentGameServerSessionActivations;
    }

    /**
     * Get 服务进程配置，至少有一个进程配置 
     * @return ServerProcesses 服务进程配置，至少有一个进程配置
     */
    public ServerProcesse [] getServerProcesses() {
        return this.ServerProcesses;
    }

    /**
     * Set 服务进程配置，至少有一个进程配置
     * @param ServerProcesses 服务进程配置，至少有一个进程配置
     */
    public void setServerProcesses(ServerProcesse [] ServerProcesses) {
        this.ServerProcesses = ServerProcesses;
    }

    public RuntimeConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuntimeConfiguration(RuntimeConfiguration source) {
        if (source.GameServerSessionActivationTimeoutSeconds != null) {
            this.GameServerSessionActivationTimeoutSeconds = new Long(source.GameServerSessionActivationTimeoutSeconds);
        }
        if (source.MaxConcurrentGameServerSessionActivations != null) {
            this.MaxConcurrentGameServerSessionActivations = new Long(source.MaxConcurrentGameServerSessionActivations);
        }
        if (source.ServerProcesses != null) {
            this.ServerProcesses = new ServerProcesse[source.ServerProcesses.length];
            for (int i = 0; i < source.ServerProcesses.length; i++) {
                this.ServerProcesses[i] = new ServerProcesse(source.ServerProcesses[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GameServerSessionActivationTimeoutSeconds", this.GameServerSessionActivationTimeoutSeconds);
        this.setParamSimple(map, prefix + "MaxConcurrentGameServerSessionActivations", this.MaxConcurrentGameServerSessionActivations);
        this.setParamArrayObj(map, prefix + "ServerProcesses.", this.ServerProcesses);

    }
}

