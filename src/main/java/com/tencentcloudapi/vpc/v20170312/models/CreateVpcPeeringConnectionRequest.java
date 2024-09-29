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

public class CreateVpcPeeringConnectionRequest extends AbstractModel {

    /**
    * 本端VPC唯一ID。
    */
    @SerializedName("SourceVpcId")
    @Expose
    private String SourceVpcId;

    /**
    * 对等连接名称。
    */
    @SerializedName("PeeringConnectionName")
    @Expose
    private String PeeringConnectionName;

    /**
    * 对端VPC唯一ID。
    */
    @SerializedName("DestinationVpcId")
    @Expose
    private String DestinationVpcId;

    /**
    * 对端用户UIN。
    */
    @SerializedName("DestinationUin")
    @Expose
    private String DestinationUin;

    /**
    * 对端地域。
    */
    @SerializedName("DestinationRegion")
    @Expose
    private String DestinationRegion;

    /**
    * 带宽上限，单位Mbps。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 互通类型，VPC_PEER：VPC间互通；VPC_BM_PEER：VPC与黑石网络互通。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 计费模式，日峰值POSTPAID_BY_DAY_MAX，月95POSTPAID_BY_MONTH_95。
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * 服务分级：PT、AU、AG。
    */
    @SerializedName("QosLevel")
    @Expose
    private String QosLevel;

    /**
    * 标签键值对
    */
    @SerializedName("Tags")
    @Expose
    private Tags [] Tags;

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
     * Get 对端VPC唯一ID。 
     * @return DestinationVpcId 对端VPC唯一ID。
     */
    public String getDestinationVpcId() {
        return this.DestinationVpcId;
    }

    /**
     * Set 对端VPC唯一ID。
     * @param DestinationVpcId 对端VPC唯一ID。
     */
    public void setDestinationVpcId(String DestinationVpcId) {
        this.DestinationVpcId = DestinationVpcId;
    }

    /**
     * Get 对端用户UIN。 
     * @return DestinationUin 对端用户UIN。
     */
    public String getDestinationUin() {
        return this.DestinationUin;
    }

    /**
     * Set 对端用户UIN。
     * @param DestinationUin 对端用户UIN。
     */
    public void setDestinationUin(String DestinationUin) {
        this.DestinationUin = DestinationUin;
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
     * Get 带宽上限，单位Mbps。 
     * @return Bandwidth 带宽上限，单位Mbps。
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 带宽上限，单位Mbps。
     * @param Bandwidth 带宽上限，单位Mbps。
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 互通类型，VPC_PEER：VPC间互通；VPC_BM_PEER：VPC与黑石网络互通。 
     * @return Type 互通类型，VPC_PEER：VPC间互通；VPC_BM_PEER：VPC与黑石网络互通。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 互通类型，VPC_PEER：VPC间互通；VPC_BM_PEER：VPC与黑石网络互通。
     * @param Type 互通类型，VPC_PEER：VPC间互通；VPC_BM_PEER：VPC与黑石网络互通。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 计费模式，日峰值POSTPAID_BY_DAY_MAX，月95POSTPAID_BY_MONTH_95。 
     * @return ChargeType 计费模式，日峰值POSTPAID_BY_DAY_MAX，月95POSTPAID_BY_MONTH_95。
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 计费模式，日峰值POSTPAID_BY_DAY_MAX，月95POSTPAID_BY_MONTH_95。
     * @param ChargeType 计费模式，日峰值POSTPAID_BY_DAY_MAX，月95POSTPAID_BY_MONTH_95。
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get 服务分级：PT、AU、AG。 
     * @return QosLevel 服务分级：PT、AU、AG。
     */
    public String getQosLevel() {
        return this.QosLevel;
    }

    /**
     * Set 服务分级：PT、AU、AG。
     * @param QosLevel 服务分级：PT、AU、AG。
     */
    public void setQosLevel(String QosLevel) {
        this.QosLevel = QosLevel;
    }

    /**
     * Get 标签键值对 
     * @return Tags 标签键值对
     */
    public Tags [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签键值对
     * @param Tags 标签键值对
     */
    public void setTags(Tags [] Tags) {
        this.Tags = Tags;
    }

    public CreateVpcPeeringConnectionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVpcPeeringConnectionRequest(CreateVpcPeeringConnectionRequest source) {
        if (source.SourceVpcId != null) {
            this.SourceVpcId = new String(source.SourceVpcId);
        }
        if (source.PeeringConnectionName != null) {
            this.PeeringConnectionName = new String(source.PeeringConnectionName);
        }
        if (source.DestinationVpcId != null) {
            this.DestinationVpcId = new String(source.DestinationVpcId);
        }
        if (source.DestinationUin != null) {
            this.DestinationUin = new String(source.DestinationUin);
        }
        if (source.DestinationRegion != null) {
            this.DestinationRegion = new String(source.DestinationRegion);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.QosLevel != null) {
            this.QosLevel = new String(source.QosLevel);
        }
        if (source.Tags != null) {
            this.Tags = new Tags[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tags(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceVpcId", this.SourceVpcId);
        this.setParamSimple(map, prefix + "PeeringConnectionName", this.PeeringConnectionName);
        this.setParamSimple(map, prefix + "DestinationVpcId", this.DestinationVpcId);
        this.setParamSimple(map, prefix + "DestinationUin", this.DestinationUin);
        this.setParamSimple(map, prefix + "DestinationRegion", this.DestinationRegion);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "QosLevel", this.QosLevel);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

