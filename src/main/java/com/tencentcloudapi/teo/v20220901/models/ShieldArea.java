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

public class ShieldArea extends AbstractModel{

    /**
    * 站点Id。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * DDoS策略Id。
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * 防护类型，参考值：
<li>domain：7层子域；</li>
<li>application：4层应用。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 7层站点名。
    */
    @SerializedName("EntityName")
    @Expose
    private String EntityName;

    /**
    * 该防护分区下的7层子域名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DDoSHosts")
    @Expose
    private DDoSHost [] DDoSHosts;

    /**
    * 四层tcp转发规则数。
    */
    @SerializedName("TcpNum")
    @Expose
    private Long TcpNum;

    /**
    * 四层udp转发规则数。
    */
    @SerializedName("UdpNum")
    @Expose
    private Long UdpNum;

    /**
    * 实例名称。
    */
    @SerializedName("Entity")
    @Expose
    private String Entity;

    /**
     * Get 站点Id。 
     * @return ZoneId 站点Id。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点Id。
     * @param ZoneId 站点Id。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get DDoS策略Id。 
     * @return PolicyId DDoS策略Id。
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set DDoS策略Id。
     * @param PolicyId DDoS策略Id。
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 防护类型，参考值：
<li>domain：7层子域；</li>
<li>application：4层应用。</li> 
     * @return Type 防护类型，参考值：
<li>domain：7层子域；</li>
<li>application：4层应用。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 防护类型，参考值：
<li>domain：7层子域；</li>
<li>application：4层应用。</li>
     * @param Type 防护类型，参考值：
<li>domain：7层子域；</li>
<li>application：4层应用。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 7层站点名。 
     * @return EntityName 7层站点名。
     */
    public String getEntityName() {
        return this.EntityName;
    }

    /**
     * Set 7层站点名。
     * @param EntityName 7层站点名。
     */
    public void setEntityName(String EntityName) {
        this.EntityName = EntityName;
    }

    /**
     * Get 该防护分区下的7层子域名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DDoSHosts 该防护分区下的7层子域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DDoSHost [] getDDoSHosts() {
        return this.DDoSHosts;
    }

    /**
     * Set 该防护分区下的7层子域名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DDoSHosts 该防护分区下的7层子域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDDoSHosts(DDoSHost [] DDoSHosts) {
        this.DDoSHosts = DDoSHosts;
    }

    /**
     * Get 四层tcp转发规则数。 
     * @return TcpNum 四层tcp转发规则数。
     */
    public Long getTcpNum() {
        return this.TcpNum;
    }

    /**
     * Set 四层tcp转发规则数。
     * @param TcpNum 四层tcp转发规则数。
     */
    public void setTcpNum(Long TcpNum) {
        this.TcpNum = TcpNum;
    }

    /**
     * Get 四层udp转发规则数。 
     * @return UdpNum 四层udp转发规则数。
     */
    public Long getUdpNum() {
        return this.UdpNum;
    }

    /**
     * Set 四层udp转发规则数。
     * @param UdpNum 四层udp转发规则数。
     */
    public void setUdpNum(Long UdpNum) {
        this.UdpNum = UdpNum;
    }

    /**
     * Get 实例名称。 
     * @return Entity 实例名称。
     */
    public String getEntity() {
        return this.Entity;
    }

    /**
     * Set 实例名称。
     * @param Entity 实例名称。
     */
    public void setEntity(String Entity) {
        this.Entity = Entity;
    }

    public ShieldArea() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ShieldArea(ShieldArea source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.EntityName != null) {
            this.EntityName = new String(source.EntityName);
        }
        if (source.DDoSHosts != null) {
            this.DDoSHosts = new DDoSHost[source.DDoSHosts.length];
            for (int i = 0; i < source.DDoSHosts.length; i++) {
                this.DDoSHosts[i] = new DDoSHost(source.DDoSHosts[i]);
            }
        }
        if (source.TcpNum != null) {
            this.TcpNum = new Long(source.TcpNum);
        }
        if (source.UdpNum != null) {
            this.UdpNum = new Long(source.UdpNum);
        }
        if (source.Entity != null) {
            this.Entity = new String(source.Entity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "EntityName", this.EntityName);
        this.setParamArrayObj(map, prefix + "DDoSHosts.", this.DDoSHosts);
        this.setParamSimple(map, prefix + "TcpNum", this.TcpNum);
        this.setParamSimple(map, prefix + "UdpNum", this.UdpNum);
        this.setParamSimple(map, prefix + "Entity", this.Entity);

    }
}

