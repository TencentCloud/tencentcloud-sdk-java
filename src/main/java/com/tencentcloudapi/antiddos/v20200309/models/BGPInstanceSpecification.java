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

public class BGPInstanceSpecification extends AbstractModel{

    /**
    * 保底防护峰值，单位Gbps
    */
    @SerializedName("ProtectBandwidth")
    @Expose
    private Long ProtectBandwidth;

    /**
    * 防护次数，单位次
    */
    @SerializedName("ProtectCountLimit")
    @Expose
    private Long ProtectCountLimit;

    /**
    * 防护IP数，单位个
    */
    @SerializedName("ProtectIPNumberLimit")
    @Expose
    private Long ProtectIPNumberLimit;

    /**
    * 自动续费状态，取值[
0：没有开启自动续费
1：开启了自动续费
]
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 联合产品标记，0代表普通高防包，1代表联合高防包
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnionPackFlag")
    @Expose
    private Long UnionPackFlag;

    /**
    * 业务带宽
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceBandWidth")
    @Expose
    private Long ServiceBandWidth;

    /**
    * 战斗服版本标记，0表示普通高防包，1表示战斗服高防包
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BattleEditionFlag")
    @Expose
    private Long BattleEditionFlag;

    /**
    * 渠道版标记，0表示普通高防包，1表示渠道版高防包
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelEditionFlag")
    @Expose
    private Long ChannelEditionFlag;

    /**
    * 高防包企业版标记，0表示普通高防包；1表示企业版高防包
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnterpriseFlag")
    @Expose
    private Long EnterpriseFlag;

    /**
    * 高防包企业版弹性阈值，0表示未开启；大于0为弹性防护阈值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ElasticLimit")
    @Expose
    private Long ElasticLimit;

    /**
     * Get 保底防护峰值，单位Gbps 
     * @return ProtectBandwidth 保底防护峰值，单位Gbps
     */
    public Long getProtectBandwidth() {
        return this.ProtectBandwidth;
    }

    /**
     * Set 保底防护峰值，单位Gbps
     * @param ProtectBandwidth 保底防护峰值，单位Gbps
     */
    public void setProtectBandwidth(Long ProtectBandwidth) {
        this.ProtectBandwidth = ProtectBandwidth;
    }

    /**
     * Get 防护次数，单位次 
     * @return ProtectCountLimit 防护次数，单位次
     */
    public Long getProtectCountLimit() {
        return this.ProtectCountLimit;
    }

    /**
     * Set 防护次数，单位次
     * @param ProtectCountLimit 防护次数，单位次
     */
    public void setProtectCountLimit(Long ProtectCountLimit) {
        this.ProtectCountLimit = ProtectCountLimit;
    }

    /**
     * Get 防护IP数，单位个 
     * @return ProtectIPNumberLimit 防护IP数，单位个
     */
    public Long getProtectIPNumberLimit() {
        return this.ProtectIPNumberLimit;
    }

    /**
     * Set 防护IP数，单位个
     * @param ProtectIPNumberLimit 防护IP数，单位个
     */
    public void setProtectIPNumberLimit(Long ProtectIPNumberLimit) {
        this.ProtectIPNumberLimit = ProtectIPNumberLimit;
    }

    /**
     * Get 自动续费状态，取值[
0：没有开启自动续费
1：开启了自动续费
] 
     * @return AutoRenewFlag 自动续费状态，取值[
0：没有开启自动续费
1：开启了自动续费
]
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动续费状态，取值[
0：没有开启自动续费
1：开启了自动续费
]
     * @param AutoRenewFlag 自动续费状态，取值[
0：没有开启自动续费
1：开启了自动续费
]
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 联合产品标记，0代表普通高防包，1代表联合高防包
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnionPackFlag 联合产品标记，0代表普通高防包，1代表联合高防包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUnionPackFlag() {
        return this.UnionPackFlag;
    }

    /**
     * Set 联合产品标记，0代表普通高防包，1代表联合高防包
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnionPackFlag 联合产品标记，0代表普通高防包，1代表联合高防包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnionPackFlag(Long UnionPackFlag) {
        this.UnionPackFlag = UnionPackFlag;
    }

    /**
     * Get 业务带宽
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceBandWidth 业务带宽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getServiceBandWidth() {
        return this.ServiceBandWidth;
    }

    /**
     * Set 业务带宽
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceBandWidth 业务带宽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceBandWidth(Long ServiceBandWidth) {
        this.ServiceBandWidth = ServiceBandWidth;
    }

    /**
     * Get 战斗服版本标记，0表示普通高防包，1表示战斗服高防包
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BattleEditionFlag 战斗服版本标记，0表示普通高防包，1表示战斗服高防包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBattleEditionFlag() {
        return this.BattleEditionFlag;
    }

    /**
     * Set 战斗服版本标记，0表示普通高防包，1表示战斗服高防包
注意：此字段可能返回 null，表示取不到有效值。
     * @param BattleEditionFlag 战斗服版本标记，0表示普通高防包，1表示战斗服高防包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBattleEditionFlag(Long BattleEditionFlag) {
        this.BattleEditionFlag = BattleEditionFlag;
    }

    /**
     * Get 渠道版标记，0表示普通高防包，1表示渠道版高防包
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelEditionFlag 渠道版标记，0表示普通高防包，1表示渠道版高防包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getChannelEditionFlag() {
        return this.ChannelEditionFlag;
    }

    /**
     * Set 渠道版标记，0表示普通高防包，1表示渠道版高防包
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelEditionFlag 渠道版标记，0表示普通高防包，1表示渠道版高防包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelEditionFlag(Long ChannelEditionFlag) {
        this.ChannelEditionFlag = ChannelEditionFlag;
    }

    /**
     * Get 高防包企业版标记，0表示普通高防包；1表示企业版高防包
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnterpriseFlag 高防包企业版标记，0表示普通高防包；1表示企业版高防包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEnterpriseFlag() {
        return this.EnterpriseFlag;
    }

    /**
     * Set 高防包企业版标记，0表示普通高防包；1表示企业版高防包
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnterpriseFlag 高防包企业版标记，0表示普通高防包；1表示企业版高防包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnterpriseFlag(Long EnterpriseFlag) {
        this.EnterpriseFlag = EnterpriseFlag;
    }

    /**
     * Get 高防包企业版弹性阈值，0表示未开启；大于0为弹性防护阈值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ElasticLimit 高防包企业版弹性阈值，0表示未开启；大于0为弹性防护阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getElasticLimit() {
        return this.ElasticLimit;
    }

    /**
     * Set 高防包企业版弹性阈值，0表示未开启；大于0为弹性防护阈值
注意：此字段可能返回 null，表示取不到有效值。
     * @param ElasticLimit 高防包企业版弹性阈值，0表示未开启；大于0为弹性防护阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setElasticLimit(Long ElasticLimit) {
        this.ElasticLimit = ElasticLimit;
    }

    public BGPInstanceSpecification() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BGPInstanceSpecification(BGPInstanceSpecification source) {
        if (source.ProtectBandwidth != null) {
            this.ProtectBandwidth = new Long(source.ProtectBandwidth);
        }
        if (source.ProtectCountLimit != null) {
            this.ProtectCountLimit = new Long(source.ProtectCountLimit);
        }
        if (source.ProtectIPNumberLimit != null) {
            this.ProtectIPNumberLimit = new Long(source.ProtectIPNumberLimit);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.UnionPackFlag != null) {
            this.UnionPackFlag = new Long(source.UnionPackFlag);
        }
        if (source.ServiceBandWidth != null) {
            this.ServiceBandWidth = new Long(source.ServiceBandWidth);
        }
        if (source.BattleEditionFlag != null) {
            this.BattleEditionFlag = new Long(source.BattleEditionFlag);
        }
        if (source.ChannelEditionFlag != null) {
            this.ChannelEditionFlag = new Long(source.ChannelEditionFlag);
        }
        if (source.EnterpriseFlag != null) {
            this.EnterpriseFlag = new Long(source.EnterpriseFlag);
        }
        if (source.ElasticLimit != null) {
            this.ElasticLimit = new Long(source.ElasticLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProtectBandwidth", this.ProtectBandwidth);
        this.setParamSimple(map, prefix + "ProtectCountLimit", this.ProtectCountLimit);
        this.setParamSimple(map, prefix + "ProtectIPNumberLimit", this.ProtectIPNumberLimit);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "UnionPackFlag", this.UnionPackFlag);
        this.setParamSimple(map, prefix + "ServiceBandWidth", this.ServiceBandWidth);
        this.setParamSimple(map, prefix + "BattleEditionFlag", this.BattleEditionFlag);
        this.setParamSimple(map, prefix + "ChannelEditionFlag", this.ChannelEditionFlag);
        this.setParamSimple(map, prefix + "EnterpriseFlag", this.EnterpriseFlag);
        this.setParamSimple(map, prefix + "ElasticLimit", this.ElasticLimit);

    }
}

