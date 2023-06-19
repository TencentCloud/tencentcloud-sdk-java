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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeProxyRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * cpu核数
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * 数据库代理组节点个数
    */
    @SerializedName("ProxyCount")
    @Expose
    private Long ProxyCount;

    /**
    * 数据库代理组ID（已废弃）
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * 重新负载均衡：auto（自动），manual（手动）
    */
    @SerializedName("ReloadBalance")
    @Expose
    private String ReloadBalance;

    /**
    * 升级时间 ：no（升级完成时）yes（实例维护时间）
    */
    @SerializedName("IsInMaintainPeriod")
    @Expose
    private String IsInMaintainPeriod;

    /**
    * 数据库代理节点信息
    */
    @SerializedName("ProxyZones")
    @Expose
    private ProxyZone [] ProxyZones;

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
     * Get cpu核数 
     * @return Cpu cpu核数
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set cpu核数
     * @param Cpu cpu核数
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存 
     * @return Mem 内存
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set 内存
     * @param Mem 内存
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get 数据库代理组节点个数 
     * @return ProxyCount 数据库代理组节点个数
     */
    public Long getProxyCount() {
        return this.ProxyCount;
    }

    /**
     * Set 数据库代理组节点个数
     * @param ProxyCount 数据库代理组节点个数
     */
    public void setProxyCount(Long ProxyCount) {
        this.ProxyCount = ProxyCount;
    }

    /**
     * Get 数据库代理组ID（已废弃） 
     * @return ProxyGroupId 数据库代理组ID（已废弃）
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set 数据库代理组ID（已废弃）
     * @param ProxyGroupId 数据库代理组ID（已废弃）
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
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
     * Get 升级时间 ：no（升级完成时）yes（实例维护时间） 
     * @return IsInMaintainPeriod 升级时间 ：no（升级完成时）yes（实例维护时间）
     */
    public String getIsInMaintainPeriod() {
        return this.IsInMaintainPeriod;
    }

    /**
     * Set 升级时间 ：no（升级完成时）yes（实例维护时间）
     * @param IsInMaintainPeriod 升级时间 ：no（升级完成时）yes（实例维护时间）
     */
    public void setIsInMaintainPeriod(String IsInMaintainPeriod) {
        this.IsInMaintainPeriod = IsInMaintainPeriod;
    }

    /**
     * Get 数据库代理节点信息 
     * @return ProxyZones 数据库代理节点信息
     */
    public ProxyZone [] getProxyZones() {
        return this.ProxyZones;
    }

    /**
     * Set 数据库代理节点信息
     * @param ProxyZones 数据库代理节点信息
     */
    public void setProxyZones(ProxyZone [] ProxyZones) {
        this.ProxyZones = ProxyZones;
    }

    public UpgradeProxyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeProxyRequest(UpgradeProxyRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Mem != null) {
            this.Mem = new Long(source.Mem);
        }
        if (source.ProxyCount != null) {
            this.ProxyCount = new Long(source.ProxyCount);
        }
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
        }
        if (source.ReloadBalance != null) {
            this.ReloadBalance = new String(source.ReloadBalance);
        }
        if (source.IsInMaintainPeriod != null) {
            this.IsInMaintainPeriod = new String(source.IsInMaintainPeriod);
        }
        if (source.ProxyZones != null) {
            this.ProxyZones = new ProxyZone[source.ProxyZones.length];
            for (int i = 0; i < source.ProxyZones.length; i++) {
                this.ProxyZones[i] = new ProxyZone(source.ProxyZones[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "ProxyCount", this.ProxyCount);
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);
        this.setParamSimple(map, prefix + "ReloadBalance", this.ReloadBalance);
        this.setParamSimple(map, prefix + "IsInMaintainPeriod", this.IsInMaintainPeriod);
        this.setParamArrayObj(map, prefix + "ProxyZones.", this.ProxyZones);

    }
}

