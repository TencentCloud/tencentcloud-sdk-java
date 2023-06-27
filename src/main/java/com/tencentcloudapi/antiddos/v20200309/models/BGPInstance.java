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

public class BGPInstance extends AbstractModel{

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
    private BGPInstanceSpecification SpecificationLimit;

    /**
    * 资产实例的使用统计信息
    */
    @SerializedName("Usage")
    @Expose
    private BGPInstanceUsages Usage;

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
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 到期时间
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

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
    * 高防包绑定的EIP属于的云产品信息
    */
    @SerializedName("EipProductInfos")
    @Expose
    private EipProductInfo [] EipProductInfos;

    /**
    * 高防包绑定状态，取值[
"idle"：绑定已完成
 "bounding"：正在绑定中
"failed"：绑定失败
]
    */
    @SerializedName("BoundStatus")
    @Expose
    private String BoundStatus;

    /**
    * 四层防护严格级别
    */
    @SerializedName("DDoSLevel")
    @Expose
    private String DDoSLevel;

    /**
    * CC防护开关
    */
    @SerializedName("CCEnable")
    @Expose
    private Long CCEnable;

    /**
    * 资源关联标签
    */
    @SerializedName("TagInfoList")
    @Expose
    private TagInfo [] TagInfoList;

    /**
    * 新版本1ip高防包
    */
    @SerializedName("IpCountNewFlag")
    @Expose
    private Long IpCountNewFlag;

    /**
    * 攻击封堵套餐标记
    */
    @SerializedName("VitalityVersion")
    @Expose
    private Long VitalityVersion;

    /**
    * 网络线路
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Line")
    @Expose
    private Long Line;

    /**
    * 弹性业务带宽开关
    */
    @SerializedName("ElasticServiceBandwidth")
    @Expose
    private Long ElasticServiceBandwidth;

    /**
    * 赠送的业务带宽
    */
    @SerializedName("GiftServiceBandWidth")
    @Expose
    private Long GiftServiceBandWidth;

    /**
    * 修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 是否是基础防护加强版 0: 不是 1: 是
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BasicPlusFlag")
    @Expose
    private Long BasicPlusFlag;

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
    public BGPInstanceSpecification getSpecificationLimit() {
        return this.SpecificationLimit;
    }

    /**
     * Set 资产实例的规格信息
     * @param SpecificationLimit 资产实例的规格信息
     */
    public void setSpecificationLimit(BGPInstanceSpecification SpecificationLimit) {
        this.SpecificationLimit = SpecificationLimit;
    }

    /**
     * Get 资产实例的使用统计信息 
     * @return Usage 资产实例的使用统计信息
     */
    public BGPInstanceUsages getUsage() {
        return this.Usage;
    }

    /**
     * Set 资产实例的使用统计信息
     * @param Usage 资产实例的使用统计信息
     */
    public void setUsage(BGPInstanceUsages Usage) {
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
     * @return CreatedTime 购买时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 购买时间
     * @param CreatedTime 购买时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 到期时间 
     * @return ExpiredTime 到期时间
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 到期时间
     * @param ExpiredTime 到期时间
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
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
     * Get 高防包绑定的EIP属于的云产品信息 
     * @return EipProductInfos 高防包绑定的EIP属于的云产品信息
     */
    public EipProductInfo [] getEipProductInfos() {
        return this.EipProductInfos;
    }

    /**
     * Set 高防包绑定的EIP属于的云产品信息
     * @param EipProductInfos 高防包绑定的EIP属于的云产品信息
     */
    public void setEipProductInfos(EipProductInfo [] EipProductInfos) {
        this.EipProductInfos = EipProductInfos;
    }

    /**
     * Get 高防包绑定状态，取值[
"idle"：绑定已完成
 "bounding"：正在绑定中
"failed"：绑定失败
] 
     * @return BoundStatus 高防包绑定状态，取值[
"idle"：绑定已完成
 "bounding"：正在绑定中
"failed"：绑定失败
]
     */
    public String getBoundStatus() {
        return this.BoundStatus;
    }

    /**
     * Set 高防包绑定状态，取值[
"idle"：绑定已完成
 "bounding"：正在绑定中
"failed"：绑定失败
]
     * @param BoundStatus 高防包绑定状态，取值[
"idle"：绑定已完成
 "bounding"：正在绑定中
"failed"：绑定失败
]
     */
    public void setBoundStatus(String BoundStatus) {
        this.BoundStatus = BoundStatus;
    }

    /**
     * Get 四层防护严格级别 
     * @return DDoSLevel 四层防护严格级别
     */
    public String getDDoSLevel() {
        return this.DDoSLevel;
    }

    /**
     * Set 四层防护严格级别
     * @param DDoSLevel 四层防护严格级别
     */
    public void setDDoSLevel(String DDoSLevel) {
        this.DDoSLevel = DDoSLevel;
    }

    /**
     * Get CC防护开关 
     * @return CCEnable CC防护开关
     */
    public Long getCCEnable() {
        return this.CCEnable;
    }

    /**
     * Set CC防护开关
     * @param CCEnable CC防护开关
     */
    public void setCCEnable(Long CCEnable) {
        this.CCEnable = CCEnable;
    }

    /**
     * Get 资源关联标签 
     * @return TagInfoList 资源关联标签
     */
    public TagInfo [] getTagInfoList() {
        return this.TagInfoList;
    }

    /**
     * Set 资源关联标签
     * @param TagInfoList 资源关联标签
     */
    public void setTagInfoList(TagInfo [] TagInfoList) {
        this.TagInfoList = TagInfoList;
    }

    /**
     * Get 新版本1ip高防包 
     * @return IpCountNewFlag 新版本1ip高防包
     */
    public Long getIpCountNewFlag() {
        return this.IpCountNewFlag;
    }

    /**
     * Set 新版本1ip高防包
     * @param IpCountNewFlag 新版本1ip高防包
     */
    public void setIpCountNewFlag(Long IpCountNewFlag) {
        this.IpCountNewFlag = IpCountNewFlag;
    }

    /**
     * Get 攻击封堵套餐标记 
     * @return VitalityVersion 攻击封堵套餐标记
     */
    public Long getVitalityVersion() {
        return this.VitalityVersion;
    }

    /**
     * Set 攻击封堵套餐标记
     * @param VitalityVersion 攻击封堵套餐标记
     */
    public void setVitalityVersion(Long VitalityVersion) {
        this.VitalityVersion = VitalityVersion;
    }

    /**
     * Get 网络线路
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Line 网络线路
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLine() {
        return this.Line;
    }

    /**
     * Set 网络线路
注意：此字段可能返回 null，表示取不到有效值。
     * @param Line 网络线路
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLine(Long Line) {
        this.Line = Line;
    }

    /**
     * Get 弹性业务带宽开关 
     * @return ElasticServiceBandwidth 弹性业务带宽开关
     */
    public Long getElasticServiceBandwidth() {
        return this.ElasticServiceBandwidth;
    }

    /**
     * Set 弹性业务带宽开关
     * @param ElasticServiceBandwidth 弹性业务带宽开关
     */
    public void setElasticServiceBandwidth(Long ElasticServiceBandwidth) {
        this.ElasticServiceBandwidth = ElasticServiceBandwidth;
    }

    /**
     * Get 赠送的业务带宽 
     * @return GiftServiceBandWidth 赠送的业务带宽
     */
    public Long getGiftServiceBandWidth() {
        return this.GiftServiceBandWidth;
    }

    /**
     * Set 赠送的业务带宽
     * @param GiftServiceBandWidth 赠送的业务带宽
     */
    public void setGiftServiceBandWidth(Long GiftServiceBandWidth) {
        this.GiftServiceBandWidth = GiftServiceBandWidth;
    }

    /**
     * Get 修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 是否是基础防护加强版 0: 不是 1: 是
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BasicPlusFlag 是否是基础防护加强版 0: 不是 1: 是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBasicPlusFlag() {
        return this.BasicPlusFlag;
    }

    /**
     * Set 是否是基础防护加强版 0: 不是 1: 是
注意：此字段可能返回 null，表示取不到有效值。
     * @param BasicPlusFlag 是否是基础防护加强版 0: 不是 1: 是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBasicPlusFlag(Long BasicPlusFlag) {
        this.BasicPlusFlag = BasicPlusFlag;
    }

    public BGPInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BGPInstance(BGPInstance source) {
        if (source.InstanceDetail != null) {
            this.InstanceDetail = new InstanceRelation(source.InstanceDetail);
        }
        if (source.SpecificationLimit != null) {
            this.SpecificationLimit = new BGPInstanceSpecification(source.SpecificationLimit);
        }
        if (source.Usage != null) {
            this.Usage = new BGPInstanceUsages(source.Usage);
        }
        if (source.Region != null) {
            this.Region = new RegionInfo(source.Region);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PackInfo != null) {
            this.PackInfo = new PackInfo(source.PackInfo);
        }
        if (source.EipProductInfos != null) {
            this.EipProductInfos = new EipProductInfo[source.EipProductInfos.length];
            for (int i = 0; i < source.EipProductInfos.length; i++) {
                this.EipProductInfos[i] = new EipProductInfo(source.EipProductInfos[i]);
            }
        }
        if (source.BoundStatus != null) {
            this.BoundStatus = new String(source.BoundStatus);
        }
        if (source.DDoSLevel != null) {
            this.DDoSLevel = new String(source.DDoSLevel);
        }
        if (source.CCEnable != null) {
            this.CCEnable = new Long(source.CCEnable);
        }
        if (source.TagInfoList != null) {
            this.TagInfoList = new TagInfo[source.TagInfoList.length];
            for (int i = 0; i < source.TagInfoList.length; i++) {
                this.TagInfoList[i] = new TagInfo(source.TagInfoList[i]);
            }
        }
        if (source.IpCountNewFlag != null) {
            this.IpCountNewFlag = new Long(source.IpCountNewFlag);
        }
        if (source.VitalityVersion != null) {
            this.VitalityVersion = new Long(source.VitalityVersion);
        }
        if (source.Line != null) {
            this.Line = new Long(source.Line);
        }
        if (source.ElasticServiceBandwidth != null) {
            this.ElasticServiceBandwidth = new Long(source.ElasticServiceBandwidth);
        }
        if (source.GiftServiceBandWidth != null) {
            this.GiftServiceBandWidth = new Long(source.GiftServiceBandWidth);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.BasicPlusFlag != null) {
            this.BasicPlusFlag = new Long(source.BasicPlusFlag);
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
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "PackInfo.", this.PackInfo);
        this.setParamArrayObj(map, prefix + "EipProductInfos.", this.EipProductInfos);
        this.setParamSimple(map, prefix + "BoundStatus", this.BoundStatus);
        this.setParamSimple(map, prefix + "DDoSLevel", this.DDoSLevel);
        this.setParamSimple(map, prefix + "CCEnable", this.CCEnable);
        this.setParamArrayObj(map, prefix + "TagInfoList.", this.TagInfoList);
        this.setParamSimple(map, prefix + "IpCountNewFlag", this.IpCountNewFlag);
        this.setParamSimple(map, prefix + "VitalityVersion", this.VitalityVersion);
        this.setParamSimple(map, prefix + "Line", this.Line);
        this.setParamSimple(map, prefix + "ElasticServiceBandwidth", this.ElasticServiceBandwidth);
        this.setParamSimple(map, prefix + "GiftServiceBandWidth", this.GiftServiceBandWidth);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "BasicPlusFlag", this.BasicPlusFlag);

    }
}

