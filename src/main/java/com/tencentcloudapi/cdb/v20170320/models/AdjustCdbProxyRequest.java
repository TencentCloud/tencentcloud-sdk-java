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

public class AdjustCdbProxyRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 代理组ID
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * 节点规格配置
    */
    @SerializedName("ProxyNodeCustom")
    @Expose
    private ProxyNodeCustom [] ProxyNodeCustom;

    /**
    * 重新负载均衡：auto(自动),manual(手动)
    */
    @SerializedName("ReloadBalance")
    @Expose
    private String ReloadBalance;

    /**
    * 升级切换时间：nowTime(升级完成时),timeWindow(维护时间内)
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
     * Get 代理组ID 
     * @return ProxyGroupId 代理组ID
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set 代理组ID
     * @param ProxyGroupId 代理组ID
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get 节点规格配置 
     * @return ProxyNodeCustom 节点规格配置
     */
    public ProxyNodeCustom [] getProxyNodeCustom() {
        return this.ProxyNodeCustom;
    }

    /**
     * Set 节点规格配置
     * @param ProxyNodeCustom 节点规格配置
     */
    public void setProxyNodeCustom(ProxyNodeCustom [] ProxyNodeCustom) {
        this.ProxyNodeCustom = ProxyNodeCustom;
    }

    /**
     * Get 重新负载均衡：auto(自动),manual(手动) 
     * @return ReloadBalance 重新负载均衡：auto(自动),manual(手动)
     */
    public String getReloadBalance() {
        return this.ReloadBalance;
    }

    /**
     * Set 重新负载均衡：auto(自动),manual(手动)
     * @param ReloadBalance 重新负载均衡：auto(自动),manual(手动)
     */
    public void setReloadBalance(String ReloadBalance) {
        this.ReloadBalance = ReloadBalance;
    }

    /**
     * Get 升级切换时间：nowTime(升级完成时),timeWindow(维护时间内) 
     * @return UpgradeTime 升级切换时间：nowTime(升级完成时),timeWindow(维护时间内)
     */
    public String getUpgradeTime() {
        return this.UpgradeTime;
    }

    /**
     * Set 升级切换时间：nowTime(升级完成时),timeWindow(维护时间内)
     * @param UpgradeTime 升级切换时间：nowTime(升级完成时),timeWindow(维护时间内)
     */
    public void setUpgradeTime(String UpgradeTime) {
        this.UpgradeTime = UpgradeTime;
    }

    public AdjustCdbProxyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdjustCdbProxyRequest(AdjustCdbProxyRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
        }
        if (source.ProxyNodeCustom != null) {
            this.ProxyNodeCustom = new ProxyNodeCustom[source.ProxyNodeCustom.length];
            for (int i = 0; i < source.ProxyNodeCustom.length; i++) {
                this.ProxyNodeCustom[i] = new ProxyNodeCustom(source.ProxyNodeCustom[i]);
            }
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
        this.setParamArrayObj(map, prefix + "ProxyNodeCustom.", this.ProxyNodeCustom);
        this.setParamSimple(map, prefix + "ReloadBalance", this.ReloadBalance);
        this.setParamSimple(map, prefix + "UpgradeTime", this.UpgradeTime);

    }
}

