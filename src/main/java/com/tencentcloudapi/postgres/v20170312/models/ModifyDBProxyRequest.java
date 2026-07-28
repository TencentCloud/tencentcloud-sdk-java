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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBProxyRequest extends AbstractModel {

    /**
    * <p>实例 ID，格式形如：postgres-xxxxxxxx</p>
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * <p>Proxy 实例 ID，格式形如：proxy-xxxxxxxx；不传时若实例下仅有一个 Proxy 则修改该 Proxy</p>
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * <p>Proxy 描述信息，长度范围 [0, 256]</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Proxy 节点变配规格列表，按可用区分组；变配时必填</p>
    */
    @SerializedName("ProxyNodeCustom")
    @Expose
    private ProxyNodeCustom [] ProxyNodeCustom;

    /**
    * <p>负载均衡刷新策略：auto-自动；manual-手动；默认 auto</p>
    */
    @SerializedName("ReloadBalance")
    @Expose
    private String ReloadBalance;

    /**
    * <p>变配执行时机：0-立即执行（默认），1-维护时间窗内执行，2-指定时间窗执行（需配合 SwitchStartTime/SwitchEndTime）</p>
    */
    @SerializedName("SwitchTag")
    @Expose
    private Long SwitchTag;

    /**
    * <p>指定时间窗执行的开始时间，格式 HH:MM:SS，仅 SwitchTag=2 时生效</p>
    */
    @SerializedName("SwitchStartTime")
    @Expose
    private String SwitchStartTime;

    /**
    * <p>指定时间窗执行的结束时间，格式 HH:MM:SS，仅 SwitchTag=2 时生效</p>
    */
    @SerializedName("SwitchEndTime")
    @Expose
    private String SwitchEndTime;

    /**
     * Get <p>实例 ID，格式形如：postgres-xxxxxxxx</p> 
     * @return DBInstanceId <p>实例 ID，格式形如：postgres-xxxxxxxx</p>
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set <p>实例 ID，格式形如：postgres-xxxxxxxx</p>
     * @param DBInstanceId <p>实例 ID，格式形如：postgres-xxxxxxxx</p>
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get <p>Proxy 实例 ID，格式形如：proxy-xxxxxxxx；不传时若实例下仅有一个 Proxy 则修改该 Proxy</p> 
     * @return ProxyGroupId <p>Proxy 实例 ID，格式形如：proxy-xxxxxxxx；不传时若实例下仅有一个 Proxy 则修改该 Proxy</p>
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set <p>Proxy 实例 ID，格式形如：proxy-xxxxxxxx；不传时若实例下仅有一个 Proxy 则修改该 Proxy</p>
     * @param ProxyGroupId <p>Proxy 实例 ID，格式形如：proxy-xxxxxxxx；不传时若实例下仅有一个 Proxy 则修改该 Proxy</p>
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get <p>Proxy 描述信息，长度范围 [0, 256]</p> 
     * @return Description <p>Proxy 描述信息，长度范围 [0, 256]</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Proxy 描述信息，长度范围 [0, 256]</p>
     * @param Description <p>Proxy 描述信息，长度范围 [0, 256]</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Proxy 节点变配规格列表，按可用区分组；变配时必填</p> 
     * @return ProxyNodeCustom <p>Proxy 节点变配规格列表，按可用区分组；变配时必填</p>
     */
    public ProxyNodeCustom [] getProxyNodeCustom() {
        return this.ProxyNodeCustom;
    }

    /**
     * Set <p>Proxy 节点变配规格列表，按可用区分组；变配时必填</p>
     * @param ProxyNodeCustom <p>Proxy 节点变配规格列表，按可用区分组；变配时必填</p>
     */
    public void setProxyNodeCustom(ProxyNodeCustom [] ProxyNodeCustom) {
        this.ProxyNodeCustom = ProxyNodeCustom;
    }

    /**
     * Get <p>负载均衡刷新策略：auto-自动；manual-手动；默认 auto</p> 
     * @return ReloadBalance <p>负载均衡刷新策略：auto-自动；manual-手动；默认 auto</p>
     */
    public String getReloadBalance() {
        return this.ReloadBalance;
    }

    /**
     * Set <p>负载均衡刷新策略：auto-自动；manual-手动；默认 auto</p>
     * @param ReloadBalance <p>负载均衡刷新策略：auto-自动；manual-手动；默认 auto</p>
     */
    public void setReloadBalance(String ReloadBalance) {
        this.ReloadBalance = ReloadBalance;
    }

    /**
     * Get <p>变配执行时机：0-立即执行（默认），1-维护时间窗内执行，2-指定时间窗执行（需配合 SwitchStartTime/SwitchEndTime）</p> 
     * @return SwitchTag <p>变配执行时机：0-立即执行（默认），1-维护时间窗内执行，2-指定时间窗执行（需配合 SwitchStartTime/SwitchEndTime）</p>
     */
    public Long getSwitchTag() {
        return this.SwitchTag;
    }

    /**
     * Set <p>变配执行时机：0-立即执行（默认），1-维护时间窗内执行，2-指定时间窗执行（需配合 SwitchStartTime/SwitchEndTime）</p>
     * @param SwitchTag <p>变配执行时机：0-立即执行（默认），1-维护时间窗内执行，2-指定时间窗执行（需配合 SwitchStartTime/SwitchEndTime）</p>
     */
    public void setSwitchTag(Long SwitchTag) {
        this.SwitchTag = SwitchTag;
    }

    /**
     * Get <p>指定时间窗执行的开始时间，格式 HH:MM:SS，仅 SwitchTag=2 时生效</p> 
     * @return SwitchStartTime <p>指定时间窗执行的开始时间，格式 HH:MM:SS，仅 SwitchTag=2 时生效</p>
     */
    public String getSwitchStartTime() {
        return this.SwitchStartTime;
    }

    /**
     * Set <p>指定时间窗执行的开始时间，格式 HH:MM:SS，仅 SwitchTag=2 时生效</p>
     * @param SwitchStartTime <p>指定时间窗执行的开始时间，格式 HH:MM:SS，仅 SwitchTag=2 时生效</p>
     */
    public void setSwitchStartTime(String SwitchStartTime) {
        this.SwitchStartTime = SwitchStartTime;
    }

    /**
     * Get <p>指定时间窗执行的结束时间，格式 HH:MM:SS，仅 SwitchTag=2 时生效</p> 
     * @return SwitchEndTime <p>指定时间窗执行的结束时间，格式 HH:MM:SS，仅 SwitchTag=2 时生效</p>
     */
    public String getSwitchEndTime() {
        return this.SwitchEndTime;
    }

    /**
     * Set <p>指定时间窗执行的结束时间，格式 HH:MM:SS，仅 SwitchTag=2 时生效</p>
     * @param SwitchEndTime <p>指定时间窗执行的结束时间，格式 HH:MM:SS，仅 SwitchTag=2 时生效</p>
     */
    public void setSwitchEndTime(String SwitchEndTime) {
        this.SwitchEndTime = SwitchEndTime;
    }

    public ModifyDBProxyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBProxyRequest(ModifyDBProxyRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
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
        if (source.SwitchTag != null) {
            this.SwitchTag = new Long(source.SwitchTag);
        }
        if (source.SwitchStartTime != null) {
            this.SwitchStartTime = new String(source.SwitchStartTime);
        }
        if (source.SwitchEndTime != null) {
            this.SwitchEndTime = new String(source.SwitchEndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "ProxyNodeCustom.", this.ProxyNodeCustom);
        this.setParamSimple(map, prefix + "ReloadBalance", this.ReloadBalance);
        this.setParamSimple(map, prefix + "SwitchTag", this.SwitchTag);
        this.setParamSimple(map, prefix + "SwitchStartTime", this.SwitchStartTime);
        this.setParamSimple(map, prefix + "SwitchEndTime", this.SwitchEndTime);

    }
}

