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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PeerConnection extends AbstractModel {

    /**
    * 本端VPC唯一ID。
    */
    @SerializedName("SourceVpcId")
    @Expose
    private String SourceVpcId;

    /**
    * 对端VPC唯一ID。
    */
    @SerializedName("PeerVpcId")
    @Expose
    private String PeerVpcId;

    /**
    * 对等连接唯一ID。
    */
    @SerializedName("PeeringConnectionId")
    @Expose
    private String PeeringConnectionId;

    /**
    * 对等连接名称。
    */
    @SerializedName("PeeringConnectionName")
    @Expose
    private String PeeringConnectionName;

    /**
    * 对等连接状态，PENDING，投放中；ACTIVE，使用中；REJECTED，已拒绝‘DELETED，已删除；FAILED，失败；EXPIRED，已过期；ISOLATED，隔离中。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 是否是新控制器，true: 是NewAfc；false:不是。
    */
    @SerializedName("IsNgw")
    @Expose
    private Boolean IsNgw;

    /**
    * 对等连接带宽值。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 本端地域。
    */
    @SerializedName("SourceRegion")
    @Expose
    private String SourceRegion;

    /**
    * 对端地域。
    */
    @SerializedName("DestinationRegion")
    @Expose
    private String DestinationRegion;

    /**
    * 创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 本端APPID。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 对端APPID。
    */
    @SerializedName("PeerAppId")
    @Expose
    private Long PeerAppId;

    /**
    * 计费类型，POSTPAID_BY_DAY_MAX：日峰值计费；POSTPAID_BY_MONTH_95：月95计费。
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * 本端UIN。
    */
    @SerializedName("SourceUin")
    @Expose
    private Long SourceUin;

    /**
    * 对端UIN。
    */
    @SerializedName("DestinationUin")
    @Expose
    private Long DestinationUin;

    /**
    * 资源标签数据。
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
    * 服务分级：PT、AU、AG。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QosLevel")
    @Expose
    private String QosLevel;

    /**
    * 互通类型，VPC_PEER：VPC间互通；VPC_BM_PEER：VPC与黑石网络互通。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 本端VPC唯一ID。 
     * @return SourceVpcId 本端VPC唯一ID。
     */
    public String getSourceVpcId() {
        return this.SourceVpcId;
    }

    /**
     * Set 本端VPC唯一ID。
     * @param SourceVpcId 本端VPC唯一ID。
     */
    public void setSourceVpcId(String SourceVpcId) {
        this.SourceVpcId = SourceVpcId;
    }

    /**
     * Get 对端VPC唯一ID。 
     * @return PeerVpcId 对端VPC唯一ID。
     */
    public String getPeerVpcId() {
        return this.PeerVpcId;
    }

    /**
     * Set 对端VPC唯一ID。
     * @param PeerVpcId 对端VPC唯一ID。
     */
    public void setPeerVpcId(String PeerVpcId) {
        this.PeerVpcId = PeerVpcId;
    }

    /**
     * Get 对等连接唯一ID。 
     * @return PeeringConnectionId 对等连接唯一ID。
     */
    public String getPeeringConnectionId() {
        return this.PeeringConnectionId;
    }

    /**
     * Set 对等连接唯一ID。
     * @param PeeringConnectionId 对等连接唯一ID。
     */
    public void setPeeringConnectionId(String PeeringConnectionId) {
        this.PeeringConnectionId = PeeringConnectionId;
    }

    /**
     * Get 对等连接名称。 
     * @return PeeringConnectionName 对等连接名称。
     */
    public String getPeeringConnectionName() {
        return this.PeeringConnectionName;
    }

    /**
     * Set 对等连接名称。
     * @param PeeringConnectionName 对等连接名称。
     */
    public void setPeeringConnectionName(String PeeringConnectionName) {
        this.PeeringConnectionName = PeeringConnectionName;
    }

    /**
     * Get 对等连接状态，PENDING，投放中；ACTIVE，使用中；REJECTED，已拒绝‘DELETED，已删除；FAILED，失败；EXPIRED，已过期；ISOLATED，隔离中。 
     * @return State 对等连接状态，PENDING，投放中；ACTIVE，使用中；REJECTED，已拒绝‘DELETED，已删除；FAILED，失败；EXPIRED，已过期；ISOLATED，隔离中。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 对等连接状态，PENDING，投放中；ACTIVE，使用中；REJECTED，已拒绝‘DELETED，已删除；FAILED，失败；EXPIRED，已过期；ISOLATED，隔离中。
     * @param State 对等连接状态，PENDING，投放中；ACTIVE，使用中；REJECTED，已拒绝‘DELETED，已删除；FAILED，失败；EXPIRED，已过期；ISOLATED，隔离中。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 是否是新控制器，true: 是NewAfc；false:不是。 
     * @return IsNgw 是否是新控制器，true: 是NewAfc；false:不是。
     */
    public Boolean getIsNgw() {
        return this.IsNgw;
    }

    /**
     * Set 是否是新控制器，true: 是NewAfc；false:不是。
     * @param IsNgw 是否是新控制器，true: 是NewAfc；false:不是。
     */
    public void setIsNgw(Boolean IsNgw) {
        this.IsNgw = IsNgw;
    }

    /**
     * Get 对等连接带宽值。 
     * @return Bandwidth 对等连接带宽值。
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 对等连接带宽值。
     * @param Bandwidth 对等连接带宽值。
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 本端地域。 
     * @return SourceRegion 本端地域。
     */
    public String getSourceRegion() {
        return this.SourceRegion;
    }

    /**
     * Set 本端地域。
     * @param SourceRegion 本端地域。
     */
    public void setSourceRegion(String SourceRegion) {
        this.SourceRegion = SourceRegion;
    }

    /**
     * Get 对端地域。 
     * @return DestinationRegion 对端地域。
     */
    public String getDestinationRegion() {
        return this.DestinationRegion;
    }

    /**
     * Set 对端地域。
     * @param DestinationRegion 对端地域。
     */
    public void setDestinationRegion(String DestinationRegion) {
        this.DestinationRegion = DestinationRegion;
    }

    /**
     * Get 创建时间。 
     * @return CreateTime 创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。
     * @param CreateTime 创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 本端APPID。 
     * @return AppId 本端APPID。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 本端APPID。
     * @param AppId 本端APPID。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 对端APPID。 
     * @return PeerAppId 对端APPID。
     */
    public Long getPeerAppId() {
        return this.PeerAppId;
    }

    /**
     * Set 对端APPID。
     * @param PeerAppId 对端APPID。
     */
    public void setPeerAppId(Long PeerAppId) {
        this.PeerAppId = PeerAppId;
    }

    /**
     * Get 计费类型，POSTPAID_BY_DAY_MAX：日峰值计费；POSTPAID_BY_MONTH_95：月95计费。 
     * @return ChargeType 计费类型，POSTPAID_BY_DAY_MAX：日峰值计费；POSTPAID_BY_MONTH_95：月95计费。
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 计费类型，POSTPAID_BY_DAY_MAX：日峰值计费；POSTPAID_BY_MONTH_95：月95计费。
     * @param ChargeType 计费类型，POSTPAID_BY_DAY_MAX：日峰值计费；POSTPAID_BY_MONTH_95：月95计费。
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get 本端UIN。 
     * @return SourceUin 本端UIN。
     */
    public Long getSourceUin() {
        return this.SourceUin;
    }

    /**
     * Set 本端UIN。
     * @param SourceUin 本端UIN。
     */
    public void setSourceUin(Long SourceUin) {
        this.SourceUin = SourceUin;
    }

    /**
     * Get 对端UIN。 
     * @return DestinationUin 对端UIN。
     */
    public Long getDestinationUin() {
        return this.DestinationUin;
    }

    /**
     * Set 对端UIN。
     * @param DestinationUin 对端UIN。
     */
    public void setDestinationUin(Long DestinationUin) {
        this.DestinationUin = DestinationUin;
    }

    /**
     * Get 资源标签数据。 
     * @return TagSet 资源标签数据。
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 资源标签数据。
     * @param TagSet 资源标签数据。
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get 服务分级：PT、AU、AG。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QosLevel 服务分级：PT、AU、AG。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQosLevel() {
        return this.QosLevel;
    }

    /**
     * Set 服务分级：PT、AU、AG。
注意：此字段可能返回 null，表示取不到有效值。
     * @param QosLevel 服务分级：PT、AU、AG。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQosLevel(String QosLevel) {
        this.QosLevel = QosLevel;
    }

    /**
     * Get 互通类型，VPC_PEER：VPC间互通；VPC_BM_PEER：VPC与黑石网络互通。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 互通类型，VPC_PEER：VPC间互通；VPC_BM_PEER：VPC与黑石网络互通。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 互通类型，VPC_PEER：VPC间互通；VPC_BM_PEER：VPC与黑石网络互通。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 互通类型，VPC_PEER：VPC间互通；VPC_BM_PEER：VPC与黑石网络互通。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public PeerConnection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PeerConnection(PeerConnection source) {
        if (source.SourceVpcId != null) {
            this.SourceVpcId = new String(source.SourceVpcId);
        }
        if (source.PeerVpcId != null) {
            this.PeerVpcId = new String(source.PeerVpcId);
        }
        if (source.PeeringConnectionId != null) {
            this.PeeringConnectionId = new String(source.PeeringConnectionId);
        }
        if (source.PeeringConnectionName != null) {
            this.PeeringConnectionName = new String(source.PeeringConnectionName);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.IsNgw != null) {
            this.IsNgw = new Boolean(source.IsNgw);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.SourceRegion != null) {
            this.SourceRegion = new String(source.SourceRegion);
        }
        if (source.DestinationRegion != null) {
            this.DestinationRegion = new String(source.DestinationRegion);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.PeerAppId != null) {
            this.PeerAppId = new Long(source.PeerAppId);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.SourceUin != null) {
            this.SourceUin = new Long(source.SourceUin);
        }
        if (source.DestinationUin != null) {
            this.DestinationUin = new Long(source.DestinationUin);
        }
        if (source.TagSet != null) {
            this.TagSet = new Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new Tag(source.TagSet[i]);
            }
        }
        if (source.QosLevel != null) {
            this.QosLevel = new String(source.QosLevel);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceVpcId", this.SourceVpcId);
        this.setParamSimple(map, prefix + "PeerVpcId", this.PeerVpcId);
        this.setParamSimple(map, prefix + "PeeringConnectionId", this.PeeringConnectionId);
        this.setParamSimple(map, prefix + "PeeringConnectionName", this.PeeringConnectionName);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "IsNgw", this.IsNgw);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "SourceRegion", this.SourceRegion);
        this.setParamSimple(map, prefix + "DestinationRegion", this.DestinationRegion);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "PeerAppId", this.PeerAppId);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "SourceUin", this.SourceUin);
        this.setParamSimple(map, prefix + "DestinationUin", this.DestinationUin);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "QosLevel", this.QosLevel);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

