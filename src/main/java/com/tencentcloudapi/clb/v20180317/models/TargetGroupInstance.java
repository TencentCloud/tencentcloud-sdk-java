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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetGroupInstance extends AbstractModel{

    /**
    * 目标组实例的内网IP
    */
    @SerializedName("BindIP")
    @Expose
    private String BindIP;

    /**
    * 目标组实例的端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 目标组实例的权重
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 目标组实例的新端口
    */
    @SerializedName("NewPort")
    @Expose
    private Long NewPort;

    /**
     * Get 目标组实例的内网IP 
     * @return BindIP 目标组实例的内网IP
     */
    public String getBindIP() {
        return this.BindIP;
    }

    /**
     * Set 目标组实例的内网IP
     * @param BindIP 目标组实例的内网IP
     */
    public void setBindIP(String BindIP) {
        this.BindIP = BindIP;
    }

    /**
     * Get 目标组实例的端口 
     * @return Port 目标组实例的端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 目标组实例的端口
     * @param Port 目标组实例的端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 目标组实例的权重 
     * @return Weight 目标组实例的权重
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 目标组实例的权重
     * @param Weight 目标组实例的权重
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 目标组实例的新端口 
     * @return NewPort 目标组实例的新端口
     */
    public Long getNewPort() {
        return this.NewPort;
    }

    /**
     * Set 目标组实例的新端口
     * @param NewPort 目标组实例的新端口
     */
    public void setNewPort(Long NewPort) {
        this.NewPort = NewPort;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BindIP", this.BindIP);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "NewPort", this.NewPort);

    }
}

