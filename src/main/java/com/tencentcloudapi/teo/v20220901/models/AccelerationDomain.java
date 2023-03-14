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

public class AccelerationDomain extends AbstractModel{

    /**
    * 源站信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginDetail")
    @Expose
    private OriginDetail OriginDetail;

    /**
    * 创建时间。
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * 加速域名名称。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 修改时间。
    */
    @SerializedName("ModifiedOn")
    @Expose
    private String ModifiedOn;

    /**
    * 站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 加速域名状态，取值有：
<li>online：已生效；</li>
<li>process：部署中；</li>
<li>offline：已停用；</li>
<li>forbidden：已封禁；</li>
<li>init：未生效，待激活站点；</li>
    */
    @SerializedName("DomainStatus")
    @Expose
    private String DomainStatus;

    /**
    * CNAME 地址。
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * 加速域名归属权验证状态，取值有： <li>pending：待验证；</li> <li>finished：已完成验证。</li>	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdentificationStatus")
    @Expose
    private String IdentificationStatus;

    /**
     * Get 源站信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginDetail 源站信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OriginDetail getOriginDetail() {
        return this.OriginDetail;
    }

    /**
     * Set 源站信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginDetail 源站信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginDetail(OriginDetail OriginDetail) {
        this.OriginDetail = OriginDetail;
    }

    /**
     * Get 创建时间。 
     * @return CreatedOn 创建时间。
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 创建时间。
     * @param CreatedOn 创建时间。
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get 加速域名名称。 
     * @return DomainName 加速域名名称。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 加速域名名称。
     * @param DomainName 加速域名名称。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get 修改时间。 
     * @return ModifiedOn 修改时间。
     */
    public String getModifiedOn() {
        return this.ModifiedOn;
    }

    /**
     * Set 修改时间。
     * @param ModifiedOn 修改时间。
     */
    public void setModifiedOn(String ModifiedOn) {
        this.ModifiedOn = ModifiedOn;
    }

    /**
     * Get 站点 ID。 
     * @return ZoneId 站点 ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点 ID。
     * @param ZoneId 站点 ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 加速域名状态，取值有：
<li>online：已生效；</li>
<li>process：部署中；</li>
<li>offline：已停用；</li>
<li>forbidden：已封禁；</li>
<li>init：未生效，待激活站点；</li> 
     * @return DomainStatus 加速域名状态，取值有：
<li>online：已生效；</li>
<li>process：部署中；</li>
<li>offline：已停用；</li>
<li>forbidden：已封禁；</li>
<li>init：未生效，待激活站点；</li>
     */
    public String getDomainStatus() {
        return this.DomainStatus;
    }

    /**
     * Set 加速域名状态，取值有：
<li>online：已生效；</li>
<li>process：部署中；</li>
<li>offline：已停用；</li>
<li>forbidden：已封禁；</li>
<li>init：未生效，待激活站点；</li>
     * @param DomainStatus 加速域名状态，取值有：
<li>online：已生效；</li>
<li>process：部署中；</li>
<li>offline：已停用；</li>
<li>forbidden：已封禁；</li>
<li>init：未生效，待激活站点；</li>
     */
    public void setDomainStatus(String DomainStatus) {
        this.DomainStatus = DomainStatus;
    }

    /**
     * Get CNAME 地址。 
     * @return Cname CNAME 地址。
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set CNAME 地址。
     * @param Cname CNAME 地址。
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get 加速域名归属权验证状态，取值有： <li>pending：待验证；</li> <li>finished：已完成验证。</li>	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdentificationStatus 加速域名归属权验证状态，取值有： <li>pending：待验证；</li> <li>finished：已完成验证。</li>	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdentificationStatus() {
        return this.IdentificationStatus;
    }

    /**
     * Set 加速域名归属权验证状态，取值有： <li>pending：待验证；</li> <li>finished：已完成验证。</li>	
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdentificationStatus 加速域名归属权验证状态，取值有： <li>pending：待验证；</li> <li>finished：已完成验证。</li>	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdentificationStatus(String IdentificationStatus) {
        this.IdentificationStatus = IdentificationStatus;
    }

    public AccelerationDomain() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccelerationDomain(AccelerationDomain source) {
        if (source.OriginDetail != null) {
            this.OriginDetail = new OriginDetail(source.OriginDetail);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.ModifiedOn != null) {
            this.ModifiedOn = new String(source.ModifiedOn);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.DomainStatus != null) {
            this.DomainStatus = new String(source.DomainStatus);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
        if (source.IdentificationStatus != null) {
            this.IdentificationStatus = new String(source.IdentificationStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "OriginDetail.", this.OriginDetail);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "ModifiedOn", this.ModifiedOn);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "DomainStatus", this.DomainStatus);
        this.setParamSimple(map, prefix + "Cname", this.Cname);
        this.setParamSimple(map, prefix + "IdentificationStatus", this.IdentificationStatus);

    }
}

