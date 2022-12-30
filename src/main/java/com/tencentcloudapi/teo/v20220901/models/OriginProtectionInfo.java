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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OriginProtectionInfo extends AbstractModel{

    /**
    * 站点ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 域名列表。
    */
    @SerializedName("Hosts")
    @Expose
    private String [] Hosts;

    /**
    * 代理ID列表。
    */
    @SerializedName("ProxyIds")
    @Expose
    private String [] ProxyIds;

    /**
    * 当前版本的IP白名单。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurrentIPWhitelist")
    @Expose
    private IPWhitelist CurrentIPWhitelist;

    /**
    * 该站点是否需要更新源站白名单，取值有：
<li>true ：需要更新IP白名单 ；</li>
<li>false ：无需更新IP白名单。</li>
    */
    @SerializedName("NeedUpdate")
    @Expose
    private Boolean NeedUpdate;

    /**
    * 源站防护状态，取值有：
<li>online ：源站防护启用中 ；</li>
<li>offline ：源站防护已停用 ；</li>
<li>nonactivate ：源站防护未激活，仅在从未使用过源站防护功能的站点调用中返回。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 站点套餐是否支持源站防护，取值有：
<li>true ：支持 ；</li>
<li>false ：不支持。</li>
    */
    @SerializedName("PlanSupport")
    @Expose
    private Boolean PlanSupport;

    /**
    * 最新IP白名单与当前IP白名单的对比。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiffIPWhitelist")
    @Expose
    private DiffIPWhitelist DiffIPWhitelist;

    /**
     * Get 站点ID。 
     * @return ZoneId 站点ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点ID。
     * @param ZoneId 站点ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 域名列表。 
     * @return Hosts 域名列表。
     */
    public String [] getHosts() {
        return this.Hosts;
    }

    /**
     * Set 域名列表。
     * @param Hosts 域名列表。
     */
    public void setHosts(String [] Hosts) {
        this.Hosts = Hosts;
    }

    /**
     * Get 代理ID列表。 
     * @return ProxyIds 代理ID列表。
     */
    public String [] getProxyIds() {
        return this.ProxyIds;
    }

    /**
     * Set 代理ID列表。
     * @param ProxyIds 代理ID列表。
     */
    public void setProxyIds(String [] ProxyIds) {
        this.ProxyIds = ProxyIds;
    }

    /**
     * Get 当前版本的IP白名单。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurrentIPWhitelist 当前版本的IP白名单。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IPWhitelist getCurrentIPWhitelist() {
        return this.CurrentIPWhitelist;
    }

    /**
     * Set 当前版本的IP白名单。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurrentIPWhitelist 当前版本的IP白名单。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrentIPWhitelist(IPWhitelist CurrentIPWhitelist) {
        this.CurrentIPWhitelist = CurrentIPWhitelist;
    }

    /**
     * Get 该站点是否需要更新源站白名单，取值有：
<li>true ：需要更新IP白名单 ；</li>
<li>false ：无需更新IP白名单。</li> 
     * @return NeedUpdate 该站点是否需要更新源站白名单，取值有：
<li>true ：需要更新IP白名单 ；</li>
<li>false ：无需更新IP白名单。</li>
     */
    public Boolean getNeedUpdate() {
        return this.NeedUpdate;
    }

    /**
     * Set 该站点是否需要更新源站白名单，取值有：
<li>true ：需要更新IP白名单 ；</li>
<li>false ：无需更新IP白名单。</li>
     * @param NeedUpdate 该站点是否需要更新源站白名单，取值有：
<li>true ：需要更新IP白名单 ；</li>
<li>false ：无需更新IP白名单。</li>
     */
    public void setNeedUpdate(Boolean NeedUpdate) {
        this.NeedUpdate = NeedUpdate;
    }

    /**
     * Get 源站防护状态，取值有：
<li>online ：源站防护启用中 ；</li>
<li>offline ：源站防护已停用 ；</li>
<li>nonactivate ：源站防护未激活，仅在从未使用过源站防护功能的站点调用中返回。</li> 
     * @return Status 源站防护状态，取值有：
<li>online ：源站防护启用中 ；</li>
<li>offline ：源站防护已停用 ；</li>
<li>nonactivate ：源站防护未激活，仅在从未使用过源站防护功能的站点调用中返回。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 源站防护状态，取值有：
<li>online ：源站防护启用中 ；</li>
<li>offline ：源站防护已停用 ；</li>
<li>nonactivate ：源站防护未激活，仅在从未使用过源站防护功能的站点调用中返回。</li>
     * @param Status 源站防护状态，取值有：
<li>online ：源站防护启用中 ；</li>
<li>offline ：源站防护已停用 ；</li>
<li>nonactivate ：源站防护未激活，仅在从未使用过源站防护功能的站点调用中返回。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 站点套餐是否支持源站防护，取值有：
<li>true ：支持 ；</li>
<li>false ：不支持。</li> 
     * @return PlanSupport 站点套餐是否支持源站防护，取值有：
<li>true ：支持 ；</li>
<li>false ：不支持。</li>
     */
    public Boolean getPlanSupport() {
        return this.PlanSupport;
    }

    /**
     * Set 站点套餐是否支持源站防护，取值有：
<li>true ：支持 ；</li>
<li>false ：不支持。</li>
     * @param PlanSupport 站点套餐是否支持源站防护，取值有：
<li>true ：支持 ；</li>
<li>false ：不支持。</li>
     */
    public void setPlanSupport(Boolean PlanSupport) {
        this.PlanSupport = PlanSupport;
    }

    /**
     * Get 最新IP白名单与当前IP白名单的对比。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiffIPWhitelist 最新IP白名单与当前IP白名单的对比。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiffIPWhitelist getDiffIPWhitelist() {
        return this.DiffIPWhitelist;
    }

    /**
     * Set 最新IP白名单与当前IP白名单的对比。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiffIPWhitelist 最新IP白名单与当前IP白名单的对比。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiffIPWhitelist(DiffIPWhitelist DiffIPWhitelist) {
        this.DiffIPWhitelist = DiffIPWhitelist;
    }

    public OriginProtectionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginProtectionInfo(OriginProtectionInfo source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Hosts != null) {
            this.Hosts = new String[source.Hosts.length];
            for (int i = 0; i < source.Hosts.length; i++) {
                this.Hosts[i] = new String(source.Hosts[i]);
            }
        }
        if (source.ProxyIds != null) {
            this.ProxyIds = new String[source.ProxyIds.length];
            for (int i = 0; i < source.ProxyIds.length; i++) {
                this.ProxyIds[i] = new String(source.ProxyIds[i]);
            }
        }
        if (source.CurrentIPWhitelist != null) {
            this.CurrentIPWhitelist = new IPWhitelist(source.CurrentIPWhitelist);
        }
        if (source.NeedUpdate != null) {
            this.NeedUpdate = new Boolean(source.NeedUpdate);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.PlanSupport != null) {
            this.PlanSupport = new Boolean(source.PlanSupport);
        }
        if (source.DiffIPWhitelist != null) {
            this.DiffIPWhitelist = new DiffIPWhitelist(source.DiffIPWhitelist);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "Hosts.", this.Hosts);
        this.setParamArraySimple(map, prefix + "ProxyIds.", this.ProxyIds);
        this.setParamObj(map, prefix + "CurrentIPWhitelist.", this.CurrentIPWhitelist);
        this.setParamSimple(map, prefix + "NeedUpdate", this.NeedUpdate);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PlanSupport", this.PlanSupport);
        this.setParamObj(map, prefix + "DiffIPWhitelist.", this.DiffIPWhitelist);

    }
}

