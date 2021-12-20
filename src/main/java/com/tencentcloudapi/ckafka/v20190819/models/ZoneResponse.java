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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneResponse extends AbstractModel{

    /**
    * zone列表
    */
    @SerializedName("ZoneList")
    @Expose
    private ZoneInfo [] ZoneList;

    /**
    * 最大购买实例个数
    */
    @SerializedName("MaxBuyInstanceNum")
    @Expose
    private Long MaxBuyInstanceNum;

    /**
    * 最大购买带宽 单位Mb/s
    */
    @SerializedName("MaxBandwidth")
    @Expose
    private Long MaxBandwidth;

    /**
    * 后付费单位价格
    */
    @SerializedName("UnitPrice")
    @Expose
    private Price UnitPrice;

    /**
    * 后付费消息单价
    */
    @SerializedName("MessagePrice")
    @Expose
    private Price MessagePrice;

    /**
    * 用户独占集群信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterInfo")
    @Expose
    private ClusterInfo [] ClusterInfo;

    /**
    * 购买标准版配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Standard")
    @Expose
    private String Standard;

    /**
    * 购买标准版S2配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StandardS2")
    @Expose
    private String StandardS2;

    /**
    * 购买专业版配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Profession")
    @Expose
    private String Profession;

    /**
    * 购买物理独占版配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Physical")
    @Expose
    private String Physical;

    /**
    * 公网带宽
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicNetwork")
    @Expose
    private String PublicNetwork;

    /**
    * 公网带宽配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicNetworkLimit")
    @Expose
    private String PublicNetworkLimit;

    /**
     * Get zone列表 
     * @return ZoneList zone列表
     */
    public ZoneInfo [] getZoneList() {
        return this.ZoneList;
    }

    /**
     * Set zone列表
     * @param ZoneList zone列表
     */
    public void setZoneList(ZoneInfo [] ZoneList) {
        this.ZoneList = ZoneList;
    }

    /**
     * Get 最大购买实例个数 
     * @return MaxBuyInstanceNum 最大购买实例个数
     */
    public Long getMaxBuyInstanceNum() {
        return this.MaxBuyInstanceNum;
    }

    /**
     * Set 最大购买实例个数
     * @param MaxBuyInstanceNum 最大购买实例个数
     */
    public void setMaxBuyInstanceNum(Long MaxBuyInstanceNum) {
        this.MaxBuyInstanceNum = MaxBuyInstanceNum;
    }

    /**
     * Get 最大购买带宽 单位Mb/s 
     * @return MaxBandwidth 最大购买带宽 单位Mb/s
     */
    public Long getMaxBandwidth() {
        return this.MaxBandwidth;
    }

    /**
     * Set 最大购买带宽 单位Mb/s
     * @param MaxBandwidth 最大购买带宽 单位Mb/s
     */
    public void setMaxBandwidth(Long MaxBandwidth) {
        this.MaxBandwidth = MaxBandwidth;
    }

    /**
     * Get 后付费单位价格 
     * @return UnitPrice 后付费单位价格
     */
    public Price getUnitPrice() {
        return this.UnitPrice;
    }

    /**
     * Set 后付费单位价格
     * @param UnitPrice 后付费单位价格
     */
    public void setUnitPrice(Price UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * Get 后付费消息单价 
     * @return MessagePrice 后付费消息单价
     */
    public Price getMessagePrice() {
        return this.MessagePrice;
    }

    /**
     * Set 后付费消息单价
     * @param MessagePrice 后付费消息单价
     */
    public void setMessagePrice(Price MessagePrice) {
        this.MessagePrice = MessagePrice;
    }

    /**
     * Get 用户独占集群信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterInfo 用户独占集群信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClusterInfo [] getClusterInfo() {
        return this.ClusterInfo;
    }

    /**
     * Set 用户独占集群信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterInfo 用户独占集群信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterInfo(ClusterInfo [] ClusterInfo) {
        this.ClusterInfo = ClusterInfo;
    }

    /**
     * Get 购买标准版配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Standard 购买标准版配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStandard() {
        return this.Standard;
    }

    /**
     * Set 购买标准版配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Standard 购买标准版配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStandard(String Standard) {
        this.Standard = Standard;
    }

    /**
     * Get 购买标准版S2配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StandardS2 购买标准版S2配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStandardS2() {
        return this.StandardS2;
    }

    /**
     * Set 购买标准版S2配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param StandardS2 购买标准版S2配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStandardS2(String StandardS2) {
        this.StandardS2 = StandardS2;
    }

    /**
     * Get 购买专业版配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Profession 购买专业版配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProfession() {
        return this.Profession;
    }

    /**
     * Set 购买专业版配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Profession 购买专业版配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProfession(String Profession) {
        this.Profession = Profession;
    }

    /**
     * Get 购买物理独占版配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Physical 购买物理独占版配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPhysical() {
        return this.Physical;
    }

    /**
     * Set 购买物理独占版配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Physical 购买物理独占版配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhysical(String Physical) {
        this.Physical = Physical;
    }

    /**
     * Get 公网带宽
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicNetwork 公网带宽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicNetwork() {
        return this.PublicNetwork;
    }

    /**
     * Set 公网带宽
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicNetwork 公网带宽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicNetwork(String PublicNetwork) {
        this.PublicNetwork = PublicNetwork;
    }

    /**
     * Get 公网带宽配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicNetworkLimit 公网带宽配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicNetworkLimit() {
        return this.PublicNetworkLimit;
    }

    /**
     * Set 公网带宽配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicNetworkLimit 公网带宽配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicNetworkLimit(String PublicNetworkLimit) {
        this.PublicNetworkLimit = PublicNetworkLimit;
    }

    public ZoneResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneResponse(ZoneResponse source) {
        if (source.ZoneList != null) {
            this.ZoneList = new ZoneInfo[source.ZoneList.length];
            for (int i = 0; i < source.ZoneList.length; i++) {
                this.ZoneList[i] = new ZoneInfo(source.ZoneList[i]);
            }
        }
        if (source.MaxBuyInstanceNum != null) {
            this.MaxBuyInstanceNum = new Long(source.MaxBuyInstanceNum);
        }
        if (source.MaxBandwidth != null) {
            this.MaxBandwidth = new Long(source.MaxBandwidth);
        }
        if (source.UnitPrice != null) {
            this.UnitPrice = new Price(source.UnitPrice);
        }
        if (source.MessagePrice != null) {
            this.MessagePrice = new Price(source.MessagePrice);
        }
        if (source.ClusterInfo != null) {
            this.ClusterInfo = new ClusterInfo[source.ClusterInfo.length];
            for (int i = 0; i < source.ClusterInfo.length; i++) {
                this.ClusterInfo[i] = new ClusterInfo(source.ClusterInfo[i]);
            }
        }
        if (source.Standard != null) {
            this.Standard = new String(source.Standard);
        }
        if (source.StandardS2 != null) {
            this.StandardS2 = new String(source.StandardS2);
        }
        if (source.Profession != null) {
            this.Profession = new String(source.Profession);
        }
        if (source.Physical != null) {
            this.Physical = new String(source.Physical);
        }
        if (source.PublicNetwork != null) {
            this.PublicNetwork = new String(source.PublicNetwork);
        }
        if (source.PublicNetworkLimit != null) {
            this.PublicNetworkLimit = new String(source.PublicNetworkLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ZoneList.", this.ZoneList);
        this.setParamSimple(map, prefix + "MaxBuyInstanceNum", this.MaxBuyInstanceNum);
        this.setParamSimple(map, prefix + "MaxBandwidth", this.MaxBandwidth);
        this.setParamObj(map, prefix + "UnitPrice.", this.UnitPrice);
        this.setParamObj(map, prefix + "MessagePrice.", this.MessagePrice);
        this.setParamArrayObj(map, prefix + "ClusterInfo.", this.ClusterInfo);
        this.setParamSimple(map, prefix + "Standard", this.Standard);
        this.setParamSimple(map, prefix + "StandardS2", this.StandardS2);
        this.setParamSimple(map, prefix + "Profession", this.Profession);
        this.setParamSimple(map, prefix + "Physical", this.Physical);
        this.setParamSimple(map, prefix + "PublicNetwork", this.PublicNetwork);
        this.setParamSimple(map, prefix + "PublicNetworkLimit", this.PublicNetworkLimit);

    }
}

