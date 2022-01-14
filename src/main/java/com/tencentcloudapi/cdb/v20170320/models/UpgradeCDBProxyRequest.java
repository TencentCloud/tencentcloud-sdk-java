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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeCDBProxyRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 数据库代理ID
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * 代理节点个数
    */
    @SerializedName("ProxyCount")
    @Expose
    private Long ProxyCount;

    /**
    * 代理节点核数
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 代理节点内存大小
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * 重新负载均衡：auto（自动），manual（手动）
    */
    @SerializedName("ReloadBalance")
    @Expose
    private String ReloadBalance;

    /**
    * 升级时间 nowTime（升级完成时）timeWindow（实例维护时间）
    */
    @SerializedName("UpgradeTime")
    @Expose
    private String UpgradeTime;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 数据库代理ID 
     * @return ProxyGroupId 数据库代理ID
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set 数据库代理ID
     * @param ProxyGroupId 数据库代理ID
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get 代理节点个数 
     * @return ProxyCount 代理节点个数
     */
    public Long getProxyCount() {
        return this.ProxyCount;
    }

    /**
     * Set 代理节点个数
     * @param ProxyCount 代理节点个数
     */
    public void setProxyCount(Long ProxyCount) {
        this.ProxyCount = ProxyCount;
    }

    /**
     * Get 代理节点核数 
     * @return Cpu 代理节点核数
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 代理节点核数
     * @param Cpu 代理节点核数
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 代理节点内存大小 
     * @return Mem 代理节点内存大小
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set 代理节点内存大小
     * @param Mem 代理节点内存大小
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get 重新负载均衡：auto（自动），manual（手动） 
     * @return ReloadBalance 重新负载均衡：auto（自动），manual（手动）
     */
    public String getReloadBalance() {
        return this.ReloadBalance;
    }

    /**
     * Set 重新负载均衡：auto（自动），manual（手动）
     * @param ReloadBalance 重新负载均衡：auto（自动），manual（手动）
     */
    public void setReloadBalance(String ReloadBalance) {
        this.ReloadBalance = ReloadBalance;
    }

    /**
     * Get 升级时间 nowTime（升级完成时）timeWindow（实例维护时间） 
     * @return UpgradeTime 升级时间 nowTime（升级完成时）timeWindow（实例维护时间）
     */
    public String getUpgradeTime() {
        return this.UpgradeTime;
    }

    /**
     * Set 升级时间 nowTime（升级完成时）timeWindow（实例维护时间）
     * @param UpgradeTime 升级时间 nowTime（升级完成时）timeWindow（实例维护时间）
     */
    public void setUpgradeTime(String UpgradeTime) {
        this.UpgradeTime = UpgradeTime;
    }

    public UpgradeCDBProxyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeCDBProxyRequest(UpgradeCDBProxyRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
        }
        if (source.ProxyCount != null) {
            this.ProxyCount = new Long(source.ProxyCount);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Mem != null) {
            this.Mem = new Long(source.Mem);
        }
        if (source.ReloadBalance != null) {
            this.ReloadBalance = new String(source.ReloadBalance);
        }
        if (source.UpgradeTime != null) {
            this.UpgradeTime = new String(source.UpgradeTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);
        this.setParamSimple(map, prefix + "ProxyCount", this.ProxyCount);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "ReloadBalance", this.ReloadBalance);
        this.setParamSimple(map, prefix + "UpgradeTime", this.UpgradeTime);

    }
}

