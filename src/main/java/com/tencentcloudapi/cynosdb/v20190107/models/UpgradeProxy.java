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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeProxy extends AbstractModel {

    /**
    * cpu
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * memory
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * 代理节点信息
    */
    @SerializedName("ProxyZones")
    @Expose
    private ProxyZone [] ProxyZones;

    /**
    * 重新负载均衡
    */
    @SerializedName("ReloadBalance")
    @Expose
    private String ReloadBalance;

    /**
     * Get cpu 
     * @return Cpu cpu
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set cpu
     * @param Cpu cpu
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get memory 
     * @return Mem memory
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set memory
     * @param Mem memory
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get 代理节点信息 
     * @return ProxyZones 代理节点信息
     */
    public ProxyZone [] getProxyZones() {
        return this.ProxyZones;
    }

    /**
     * Set 代理节点信息
     * @param ProxyZones 代理节点信息
     */
    public void setProxyZones(ProxyZone [] ProxyZones) {
        this.ProxyZones = ProxyZones;
    }

    /**
     * Get 重新负载均衡 
     * @return ReloadBalance 重新负载均衡
     */
    public String getReloadBalance() {
        return this.ReloadBalance;
    }

    /**
     * Set 重新负载均衡
     * @param ReloadBalance 重新负载均衡
     */
    public void setReloadBalance(String ReloadBalance) {
        this.ReloadBalance = ReloadBalance;
    }

    public UpgradeProxy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeProxy(UpgradeProxy source) {
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Mem != null) {
            this.Mem = new Long(source.Mem);
        }
        if (source.ProxyZones != null) {
            this.ProxyZones = new ProxyZone[source.ProxyZones.length];
            for (int i = 0; i < source.ProxyZones.length; i++) {
                this.ProxyZones[i] = new ProxyZone(source.ProxyZones[i]);
            }
        }
        if (source.ReloadBalance != null) {
            this.ReloadBalance = new String(source.ReloadBalance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamArrayObj(map, prefix + "ProxyZones.", this.ProxyZones);
        this.setParamSimple(map, prefix + "ReloadBalance", this.ReloadBalance);

    }
}

