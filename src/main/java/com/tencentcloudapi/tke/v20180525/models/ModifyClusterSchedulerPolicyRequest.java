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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyClusterSchedulerPolicyRequest extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * SchedulerPolicy配置信息
    */
    @SerializedName("SchedulerPolicyConfig")
    @Expose
    private SchedulerPolicyConfig [] SchedulerPolicyConfig;

    /**
    * 客户端连接
    */
    @SerializedName("ClientConnection")
    @Expose
    private ClientConnection ClientConnection;

    /**
    * 扩展调度器
    */
    @SerializedName("Extenders")
    @Expose
    private Extenders [] Extenders;

    /**
    * 高性能模式
    */
    @SerializedName("HighPerformance")
    @Expose
    private Boolean HighPerformance;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get SchedulerPolicy配置信息 
     * @return SchedulerPolicyConfig SchedulerPolicy配置信息
     */
    public SchedulerPolicyConfig [] getSchedulerPolicyConfig() {
        return this.SchedulerPolicyConfig;
    }

    /**
     * Set SchedulerPolicy配置信息
     * @param SchedulerPolicyConfig SchedulerPolicy配置信息
     */
    public void setSchedulerPolicyConfig(SchedulerPolicyConfig [] SchedulerPolicyConfig) {
        this.SchedulerPolicyConfig = SchedulerPolicyConfig;
    }

    /**
     * Get 客户端连接 
     * @return ClientConnection 客户端连接
     */
    public ClientConnection getClientConnection() {
        return this.ClientConnection;
    }

    /**
     * Set 客户端连接
     * @param ClientConnection 客户端连接
     */
    public void setClientConnection(ClientConnection ClientConnection) {
        this.ClientConnection = ClientConnection;
    }

    /**
     * Get 扩展调度器 
     * @return Extenders 扩展调度器
     */
    public Extenders [] getExtenders() {
        return this.Extenders;
    }

    /**
     * Set 扩展调度器
     * @param Extenders 扩展调度器
     */
    public void setExtenders(Extenders [] Extenders) {
        this.Extenders = Extenders;
    }

    /**
     * Get 高性能模式 
     * @return HighPerformance 高性能模式
     */
    public Boolean getHighPerformance() {
        return this.HighPerformance;
    }

    /**
     * Set 高性能模式
     * @param HighPerformance 高性能模式
     */
    public void setHighPerformance(Boolean HighPerformance) {
        this.HighPerformance = HighPerformance;
    }

    public ModifyClusterSchedulerPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyClusterSchedulerPolicyRequest(ModifyClusterSchedulerPolicyRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.SchedulerPolicyConfig != null) {
            this.SchedulerPolicyConfig = new SchedulerPolicyConfig[source.SchedulerPolicyConfig.length];
            for (int i = 0; i < source.SchedulerPolicyConfig.length; i++) {
                this.SchedulerPolicyConfig[i] = new SchedulerPolicyConfig(source.SchedulerPolicyConfig[i]);
            }
        }
        if (source.ClientConnection != null) {
            this.ClientConnection = new ClientConnection(source.ClientConnection);
        }
        if (source.Extenders != null) {
            this.Extenders = new Extenders[source.Extenders.length];
            for (int i = 0; i < source.Extenders.length; i++) {
                this.Extenders[i] = new Extenders(source.Extenders[i]);
            }
        }
        if (source.HighPerformance != null) {
            this.HighPerformance = new Boolean(source.HighPerformance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "SchedulerPolicyConfig.", this.SchedulerPolicyConfig);
        this.setParamObj(map, prefix + "ClientConnection.", this.ClientConnection);
        this.setParamArrayObj(map, prefix + "Extenders.", this.Extenders);
        this.setParamSimple(map, prefix + "HighPerformance", this.HighPerformance);

    }
}

