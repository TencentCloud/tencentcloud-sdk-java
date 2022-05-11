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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BGPIPInstance extends AbstractModel{

    /**
    * 资产实例的详细信息
    */
    @SerializedName("InstanceDetail")
    @Expose
    private InstanceRelation InstanceDetail;

    /**
    * 资产实例的规格信息
    */
    @SerializedName("SpecificationLimit")
    @Expose
    private BGPIPInstanceSpecification SpecificationLimit;

    /**
    * 资产实例的使用统计信息
    */
    @SerializedName("Usage")
    @Expose
    private BGPIPInstanceUsages Usage;

    /**
    * 资产实例所在的地域
    */
    @SerializedName("Region")
    @Expose
    private RegionInfo Region;

    /**
    * 资产实例的防护状态，状态码如下：
"idle"：正常状态(无攻击)
"attacking"：攻击中
"blocking"：封堵中
"creating"：创建中
"deblocking"：解封中
"isolate"：回收隔离中
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 购买时间
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * 到期时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 资产实例的名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 资产实例所属的套餐包信息，
注意：当资产实例不是套餐包的实例时，此字段为null
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackInfo")
    @Expose
    private PackInfo PackInfo;

    /**
    * 资产实例所属的三网套餐包详情，
注意：当资产实例不是三网套餐包的实例时，此字段为null
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StaticPackRelation")
    @Expose
    private StaticPackRelation StaticPackRelation;

    /**
    * 区分高防IP境外线路
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 区分集群
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tgw")
    @Expose
    private Long Tgw;

    /**
    * 高防弹性公网IP状态，包含'CREATING'(创建中),'BINDING'(绑定中),'BIND'(已绑定),'UNBINDING'(解绑中),'UNBIND'(已解绑),'OFFLINING'(释放中),'BIND_ENI'(绑定悬空弹性网卡)。只对高防弹性公网IP实例有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EipAddressStatus")
    @Expose
    private String EipAddressStatus;

    /**
    * 是否高防弹性公网IP实例，是为1，否为0。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EipFlag")
    @Expose
    private Long EipFlag;

    /**
    * 资产实例所属的高防弹性公网IP套餐包详情，
注意：当资产实例不是高防弹性公网IP套餐包的实例时，此字段为null
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EipAddressPackRelation")
    @Expose
    private EipAddressPackRelation EipAddressPackRelation;

    /**
    * 高防弹性公网IP关联的实例信息。
注意：当资产实例不是高防弹性公网IP实例时，此字段为null
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EipAddressInfo")
    @Expose
    private EipAddressRelation EipAddressInfo;

    /**
    * 建议客户接入的域名，客户可使用域名接入。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 是否开启安全加速，是为1，否为0。
    */
    @SerializedName("DamDDoSStatus")
    @Expose
    private Long DamDDoSStatus;

    /**
    * 是否Ipv6版本的IP, 是为1，否为0
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("V6Flag")
    @Expose
    private Long V6Flag;

    /**
    * 是否渠道版高防IP，是为1，否为0
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BGPIPChannelFlag")
    @Expose
    private Long BGPIPChannelFlag;

    /**
     * Get 资产实例的详细信息 
     * @return InstanceDetail 资产实例的详细信息
     */
    public InstanceRelation getInstanceDetail() {
        return this.InstanceDetail;
    }

    /**
     * Set 资产实例的详细信息
     * @param InstanceDetail 资产实例的详细信息
     */
    public void setInstanceDetail(InstanceRelation InstanceDetail) {
        this.InstanceDetail = InstanceDetail;
    }

    /**
     * Get 资产实例的规格信息 
     * @return SpecificationLimit 资产实例的规格信息
     */
    public BGPIPInstanceSpecification getSpecificationLimit() {
        return this.SpecificationLimit;
    }

    /**
     * Set 资产实例的规格信息
     * @param SpecificationLimit 资产实例的规格信息
     */
    public void setSpecificationLimit(BGPIPInstanceSpecification SpecificationLimit) {
        this.SpecificationLimit = SpecificationLimit;
    }

    /**
     * Get 资产实例的使用统计信息 
     * @return Usage 资产实例的使用统计信息
     */
    public BGPIPInstanceUsages getUsage() {
        return this.Usage;
    }

    /**
     * Set 资产实例的使用统计信息
     * @param Usage 资产实例的使用统计信息
     */
    public void setUsage(BGPIPInstanceUsages Usage) {
        this.Usage = Usage;
    }

    /**
     * Get 资产实例所在的地域 
     * @return Region 资产实例所在的地域
     */
    public RegionInfo getRegion() {
        return this.Region;
    }

    /**
     * Set 资产实例所在的地域
     * @param Region 资产实例所在的地域
     */
    public void setRegion(RegionInfo Region) {
        this.Region = Region;
    }

    /**
     * Get 资产实例的防护状态，状态码如下：
"idle"：正常状态(无攻击)
"attacking"：攻击中
"blocking"：封堵中
"creating"：创建中
"deblocking"：解封中
"isolate"：回收隔离中 
     * @return Status 资产实例的防护状态，状态码如下：
"idle"：正常状态(无攻击)
"attacking"：攻击中
"blocking"：封堵中
"creating"：创建中
"deblocking"：解封中
"isolate"：回收隔离中
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 资产实例的防护状态，状态码如下：
"idle"：正常状态(无攻击)
"attacking"：攻击中
"blocking"：封堵中
"creating"：创建中
"deblocking"：解封中
"isolate"：回收隔离中
     * @param Status 资产实例的防护状态，状态码如下：
"idle"：正常状态(无攻击)
"attacking"：攻击中
"blocking"：封堵中
"creating"：创建中
"deblocking"：解封中
"isolate"：回收隔离中
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 购买时间 
     * @return ExpiredTime 购买时间
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 购买时间
     * @param ExpiredTime 购买时间
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get 到期时间 
     * @return CreatedTime 到期时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 到期时间
     * @param CreatedTime 到期时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 资产实例的名称 
     * @return Name 资产实例的名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 资产实例的名称
     * @param Name 资产实例的名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 资产实例所属的套餐包信息，
注意：当资产实例不是套餐包的实例时，此字段为null
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackInfo 资产实例所属的套餐包信息，
注意：当资产实例不是套餐包的实例时，此字段为null
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PackInfo getPackInfo() {
        return this.PackInfo;
    }

    /**
     * Set 资产实例所属的套餐包信息，
注意：当资产实例不是套餐包的实例时，此字段为null
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackInfo 资产实例所属的套餐包信息，
注意：当资产实例不是套餐包的实例时，此字段为null
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackInfo(PackInfo PackInfo) {
        this.PackInfo = PackInfo;
    }

    /**
     * Get 资产实例所属的三网套餐包详情，
注意：当资产实例不是三网套餐包的实例时，此字段为null
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StaticPackRelation 资产实例所属的三网套餐包详情，
注意：当资产实例不是三网套餐包的实例时，此字段为null
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StaticPackRelation getStaticPackRelation() {
        return this.StaticPackRelation;
    }

    /**
     * Set 资产实例所属的三网套餐包详情，
注意：当资产实例不是三网套餐包的实例时，此字段为null
注意：此字段可能返回 null，表示取不到有效值。
     * @param StaticPackRelation 资产实例所属的三网套餐包详情，
注意：当资产实例不是三网套餐包的实例时，此字段为null
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStaticPackRelation(StaticPackRelation StaticPackRelation) {
        this.StaticPackRelation = StaticPackRelation;
    }

    /**
     * Get 区分高防IP境外线路
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneId 区分高防IP境外线路
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 区分高防IP境外线路
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneId 区分高防IP境外线路
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 区分集群
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tgw 区分集群
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTgw() {
        return this.Tgw;
    }

    /**
     * Set 区分集群
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tgw 区分集群
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTgw(Long Tgw) {
        this.Tgw = Tgw;
    }

    /**
     * Get 高防弹性公网IP状态，包含'CREATING'(创建中),'BINDING'(绑定中),'BIND'(已绑定),'UNBINDING'(解绑中),'UNBIND'(已解绑),'OFFLINING'(释放中),'BIND_ENI'(绑定悬空弹性网卡)。只对高防弹性公网IP实例有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EipAddressStatus 高防弹性公网IP状态，包含'CREATING'(创建中),'BINDING'(绑定中),'BIND'(已绑定),'UNBINDING'(解绑中),'UNBIND'(已解绑),'OFFLINING'(释放中),'BIND_ENI'(绑定悬空弹性网卡)。只对高防弹性公网IP实例有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEipAddressStatus() {
        return this.EipAddressStatus;
    }

    /**
     * Set 高防弹性公网IP状态，包含'CREATING'(创建中),'BINDING'(绑定中),'BIND'(已绑定),'UNBINDING'(解绑中),'UNBIND'(已解绑),'OFFLINING'(释放中),'BIND_ENI'(绑定悬空弹性网卡)。只对高防弹性公网IP实例有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param EipAddressStatus 高防弹性公网IP状态，包含'CREATING'(创建中),'BINDING'(绑定中),'BIND'(已绑定),'UNBINDING'(解绑中),'UNBIND'(已解绑),'OFFLINING'(释放中),'BIND_ENI'(绑定悬空弹性网卡)。只对高防弹性公网IP实例有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEipAddressStatus(String EipAddressStatus) {
        this.EipAddressStatus = EipAddressStatus;
    }

    /**
     * Get 是否高防弹性公网IP实例，是为1，否为0。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EipFlag 是否高防弹性公网IP实例，是为1，否为0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEipFlag() {
        return this.EipFlag;
    }

    /**
     * Set 是否高防弹性公网IP实例，是为1，否为0。
注意：此字段可能返回 null，表示取不到有效值。
     * @param EipFlag 是否高防弹性公网IP实例，是为1，否为0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEipFlag(Long EipFlag) {
        this.EipFlag = EipFlag;
    }

    /**
     * Get 资产实例所属的高防弹性公网IP套餐包详情，
注意：当资产实例不是高防弹性公网IP套餐包的实例时，此字段为null
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EipAddressPackRelation 资产实例所属的高防弹性公网IP套餐包详情，
注意：当资产实例不是高防弹性公网IP套餐包的实例时，此字段为null
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EipAddressPackRelation getEipAddressPackRelation() {
        return this.EipAddressPackRelation;
    }

    /**
     * Set 资产实例所属的高防弹性公网IP套餐包详情，
注意：当资产实例不是高防弹性公网IP套餐包的实例时，此字段为null
注意：此字段可能返回 null，表示取不到有效值。
     * @param EipAddressPackRelation 资产实例所属的高防弹性公网IP套餐包详情，
注意：当资产实例不是高防弹性公网IP套餐包的实例时，此字段为null
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEipAddressPackRelation(EipAddressPackRelation EipAddressPackRelation) {
        this.EipAddressPackRelation = EipAddressPackRelation;
    }

    /**
     * Get 高防弹性公网IP关联的实例信息。
注意：当资产实例不是高防弹性公网IP实例时，此字段为null
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EipAddressInfo 高防弹性公网IP关联的实例信息。
注意：当资产实例不是高防弹性公网IP实例时，此字段为null
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EipAddressRelation getEipAddressInfo() {
        return this.EipAddressInfo;
    }

    /**
     * Set 高防弹性公网IP关联的实例信息。
注意：当资产实例不是高防弹性公网IP实例时，此字段为null
注意：此字段可能返回 null，表示取不到有效值。
     * @param EipAddressInfo 高防弹性公网IP关联的实例信息。
注意：当资产实例不是高防弹性公网IP实例时，此字段为null
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEipAddressInfo(EipAddressRelation EipAddressInfo) {
        this.EipAddressInfo = EipAddressInfo;
    }

    /**
     * Get 建议客户接入的域名，客户可使用域名接入。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Domain 建议客户接入的域名，客户可使用域名接入。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 建议客户接入的域名，客户可使用域名接入。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Domain 建议客户接入的域名，客户可使用域名接入。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 是否开启安全加速，是为1，否为0。 
     * @return DamDDoSStatus 是否开启安全加速，是为1，否为0。
     */
    public Long getDamDDoSStatus() {
        return this.DamDDoSStatus;
    }

    /**
     * Set 是否开启安全加速，是为1，否为0。
     * @param DamDDoSStatus 是否开启安全加速，是为1，否为0。
     */
    public void setDamDDoSStatus(Long DamDDoSStatus) {
        this.DamDDoSStatus = DamDDoSStatus;
    }

    /**
     * Get 是否Ipv6版本的IP, 是为1，否为0
注意：此字段可能返回 null，表示取不到有效值。 
     * @return V6Flag 是否Ipv6版本的IP, 是为1，否为0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getV6Flag() {
        return this.V6Flag;
    }

    /**
     * Set 是否Ipv6版本的IP, 是为1，否为0
注意：此字段可能返回 null，表示取不到有效值。
     * @param V6Flag 是否Ipv6版本的IP, 是为1，否为0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setV6Flag(Long V6Flag) {
        this.V6Flag = V6Flag;
    }

    /**
     * Get 是否渠道版高防IP，是为1，否为0
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BGPIPChannelFlag 是否渠道版高防IP，是为1，否为0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBGPIPChannelFlag() {
        return this.BGPIPChannelFlag;
    }

    /**
     * Set 是否渠道版高防IP，是为1，否为0
注意：此字段可能返回 null，表示取不到有效值。
     * @param BGPIPChannelFlag 是否渠道版高防IP，是为1，否为0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBGPIPChannelFlag(Long BGPIPChannelFlag) {
        this.BGPIPChannelFlag = BGPIPChannelFlag;
    }

    public BGPIPInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BGPIPInstance(BGPIPInstance source) {
        if (source.InstanceDetail != null) {
            this.InstanceDetail = new InstanceRelation(source.InstanceDetail);
        }
        if (source.SpecificationLimit != null) {
            this.SpecificationLimit = new BGPIPInstanceSpecification(source.SpecificationLimit);
        }
        if (source.Usage != null) {
            this.Usage = new BGPIPInstanceUsages(source.Usage);
        }
        if (source.Region != null) {
            this.Region = new RegionInfo(source.Region);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PackInfo != null) {
            this.PackInfo = new PackInfo(source.PackInfo);
        }
        if (source.StaticPackRelation != null) {
            this.StaticPackRelation = new StaticPackRelation(source.StaticPackRelation);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.Tgw != null) {
            this.Tgw = new Long(source.Tgw);
        }
        if (source.EipAddressStatus != null) {
            this.EipAddressStatus = new String(source.EipAddressStatus);
        }
        if (source.EipFlag != null) {
            this.EipFlag = new Long(source.EipFlag);
        }
        if (source.EipAddressPackRelation != null) {
            this.EipAddressPackRelation = new EipAddressPackRelation(source.EipAddressPackRelation);
        }
        if (source.EipAddressInfo != null) {
            this.EipAddressInfo = new EipAddressRelation(source.EipAddressInfo);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DamDDoSStatus != null) {
            this.DamDDoSStatus = new Long(source.DamDDoSStatus);
        }
        if (source.V6Flag != null) {
            this.V6Flag = new Long(source.V6Flag);
        }
        if (source.BGPIPChannelFlag != null) {
            this.BGPIPChannelFlag = new Long(source.BGPIPChannelFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "InstanceDetail.", this.InstanceDetail);
        this.setParamObj(map, prefix + "SpecificationLimit.", this.SpecificationLimit);
        this.setParamObj(map, prefix + "Usage.", this.Usage);
        this.setParamObj(map, prefix + "Region.", this.Region);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "PackInfo.", this.PackInfo);
        this.setParamObj(map, prefix + "StaticPackRelation.", this.StaticPackRelation);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Tgw", this.Tgw);
        this.setParamSimple(map, prefix + "EipAddressStatus", this.EipAddressStatus);
        this.setParamSimple(map, prefix + "EipFlag", this.EipFlag);
        this.setParamObj(map, prefix + "EipAddressPackRelation.", this.EipAddressPackRelation);
        this.setParamObj(map, prefix + "EipAddressInfo.", this.EipAddressInfo);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DamDDoSStatus", this.DamDDoSStatus);
        this.setParamSimple(map, prefix + "V6Flag", this.V6Flag);
        this.setParamSimple(map, prefix + "BGPIPChannelFlag", this.BGPIPChannelFlag);

    }
}

