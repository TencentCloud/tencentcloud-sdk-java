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

public class LoadBalancing extends AbstractModel{

    /**
    * 负载均衡ID。
    */
    @SerializedName("LoadBalancingId")
    @Expose
    private String LoadBalancingId;

    /**
    * 站点ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 子域名，填写@表示根域。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 代理模式，取值有：
<li>dns_only：仅DNS；</li>
<li>proxied：开启代理。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 当Type=dns_only表示DNS记录的缓存时间。
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
    * 状态，取值有：
<li>online：部署成功；</li>
<li>process：部署中。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 调度域名。
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * 主源源站组ID。
    */
    @SerializedName("OriginGroupId")
    @Expose
    private String OriginGroupId;

    /**
    * 备用源站源站组ID。为空表示不适用备用源站。
    */
    @SerializedName("BackupOriginGroupId")
    @Expose
    private String BackupOriginGroupId;

    /**
    * 更新时间。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 回源类型，取值有：
<li>normal：主备回源；</li>
<li>advanced：高级回源配置。</li>
    */
    @SerializedName("OriginType")
    @Expose
    private String OriginType;

    /**
    * 高级回源配置，当OriginType=advanced时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdvancedOriginGroups")
    @Expose
    private AdvancedOriginGroup [] AdvancedOriginGroups;

    /**
     * Get 负载均衡ID。 
     * @return LoadBalancingId 负载均衡ID。
     */
    public String getLoadBalancingId() {
        return this.LoadBalancingId;
    }

    /**
     * Set 负载均衡ID。
     * @param LoadBalancingId 负载均衡ID。
     */
    public void setLoadBalancingId(String LoadBalancingId) {
        this.LoadBalancingId = LoadBalancingId;
    }

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
     * Get 子域名，填写@表示根域。 
     * @return Host 子域名，填写@表示根域。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 子域名，填写@表示根域。
     * @param Host 子域名，填写@表示根域。
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 代理模式，取值有：
<li>dns_only：仅DNS；</li>
<li>proxied：开启代理。</li> 
     * @return Type 代理模式，取值有：
<li>dns_only：仅DNS；</li>
<li>proxied：开启代理。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 代理模式，取值有：
<li>dns_only：仅DNS；</li>
<li>proxied：开启代理。</li>
     * @param Type 代理模式，取值有：
<li>dns_only：仅DNS；</li>
<li>proxied：开启代理。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 当Type=dns_only表示DNS记录的缓存时间。 
     * @return TTL 当Type=dns_only表示DNS记录的缓存时间。
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set 当Type=dns_only表示DNS记录的缓存时间。
     * @param TTL 当Type=dns_only表示DNS记录的缓存时间。
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    /**
     * Get 状态，取值有：
<li>online：部署成功；</li>
<li>process：部署中。</li> 
     * @return Status 状态，取值有：
<li>online：部署成功；</li>
<li>process：部署中。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态，取值有：
<li>online：部署成功；</li>
<li>process：部署中。</li>
     * @param Status 状态，取值有：
<li>online：部署成功；</li>
<li>process：部署中。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 调度域名。 
     * @return Cname 调度域名。
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set 调度域名。
     * @param Cname 调度域名。
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get 主源源站组ID。 
     * @return OriginGroupId 主源源站组ID。
     */
    public String getOriginGroupId() {
        return this.OriginGroupId;
    }

    /**
     * Set 主源源站组ID。
     * @param OriginGroupId 主源源站组ID。
     */
    public void setOriginGroupId(String OriginGroupId) {
        this.OriginGroupId = OriginGroupId;
    }

    /**
     * Get 备用源站源站组ID。为空表示不适用备用源站。 
     * @return BackupOriginGroupId 备用源站源站组ID。为空表示不适用备用源站。
     */
    public String getBackupOriginGroupId() {
        return this.BackupOriginGroupId;
    }

    /**
     * Set 备用源站源站组ID。为空表示不适用备用源站。
     * @param BackupOriginGroupId 备用源站源站组ID。为空表示不适用备用源站。
     */
    public void setBackupOriginGroupId(String BackupOriginGroupId) {
        this.BackupOriginGroupId = BackupOriginGroupId;
    }

    /**
     * Get 更新时间。 
     * @return UpdateTime 更新时间。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间。
     * @param UpdateTime 更新时间。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 回源类型，取值有：
<li>normal：主备回源；</li>
<li>advanced：高级回源配置。</li> 
     * @return OriginType 回源类型，取值有：
<li>normal：主备回源；</li>
<li>advanced：高级回源配置。</li>
     */
    public String getOriginType() {
        return this.OriginType;
    }

    /**
     * Set 回源类型，取值有：
<li>normal：主备回源；</li>
<li>advanced：高级回源配置。</li>
     * @param OriginType 回源类型，取值有：
<li>normal：主备回源；</li>
<li>advanced：高级回源配置。</li>
     */
    public void setOriginType(String OriginType) {
        this.OriginType = OriginType;
    }

    /**
     * Get 高级回源配置，当OriginType=advanced时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdvancedOriginGroups 高级回源配置，当OriginType=advanced时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AdvancedOriginGroup [] getAdvancedOriginGroups() {
        return this.AdvancedOriginGroups;
    }

    /**
     * Set 高级回源配置，当OriginType=advanced时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdvancedOriginGroups 高级回源配置，当OriginType=advanced时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdvancedOriginGroups(AdvancedOriginGroup [] AdvancedOriginGroups) {
        this.AdvancedOriginGroups = AdvancedOriginGroups;
    }

    public LoadBalancing() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoadBalancing(LoadBalancing source) {
        if (source.LoadBalancingId != null) {
            this.LoadBalancingId = new String(source.LoadBalancingId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.TTL != null) {
            this.TTL = new Long(source.TTL);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
        if (source.OriginGroupId != null) {
            this.OriginGroupId = new String(source.OriginGroupId);
        }
        if (source.BackupOriginGroupId != null) {
            this.BackupOriginGroupId = new String(source.BackupOriginGroupId);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.OriginType != null) {
            this.OriginType = new String(source.OriginType);
        }
        if (source.AdvancedOriginGroups != null) {
            this.AdvancedOriginGroups = new AdvancedOriginGroup[source.AdvancedOriginGroups.length];
            for (int i = 0; i < source.AdvancedOriginGroups.length; i++) {
                this.AdvancedOriginGroups[i] = new AdvancedOriginGroup(source.AdvancedOriginGroups[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancingId", this.LoadBalancingId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TTL", this.TTL);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Cname", this.Cname);
        this.setParamSimple(map, prefix + "OriginGroupId", this.OriginGroupId);
        this.setParamSimple(map, prefix + "BackupOriginGroupId", this.BackupOriginGroupId);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "OriginType", this.OriginType);
        this.setParamArrayObj(map, prefix + "AdvancedOriginGroups.", this.AdvancedOriginGroups);

    }
}

