/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneResponse extends AbstractModel {

    /**
    * <p>zone列表</p>
    */
    @SerializedName("ZoneList")
    @Expose
    private ZoneInfo [] ZoneList;

    /**
    * <p>最大购买实例个数</p>
    */
    @SerializedName("MaxBuyInstanceNum")
    @Expose
    private Long MaxBuyInstanceNum;

    /**
    * <p>最大购买带宽 单位Mb/s</p>
    */
    @SerializedName("MaxBandwidth")
    @Expose
    private Long MaxBandwidth;

    /**
    * <p>后付费单位价格</p>
    */
    @SerializedName("UnitPrice")
    @Expose
    private Price UnitPrice;

    /**
    * <p>后付费消息单价</p>
    */
    @SerializedName("MessagePrice")
    @Expose
    private Price MessagePrice;

    /**
    * <p>用户独占集群信息</p>
    */
    @SerializedName("ClusterInfo")
    @Expose
    private ClusterInfo [] ClusterInfo;

    /**
    * <p>购买标准版配置</p>
    */
    @SerializedName("Standard")
    @Expose
    private String Standard;

    /**
    * <p>购买标准版S2配置</p>
    */
    @SerializedName("StandardS2")
    @Expose
    private String StandardS2;

    /**
    * <p>购买专业版配置</p>
    */
    @SerializedName("Profession")
    @Expose
    private String Profession;

    /**
    * <p>购买物理独占版配置</p>
    */
    @SerializedName("Physical")
    @Expose
    private String Physical;

    /**
    * <p>公网带宽 最小3Mbps  最大999Mbps 仅专业版支持填写   已废弃,无实际意义</p>
    */
    @SerializedName("PublicNetwork")
    @Expose
    private String PublicNetwork;

    /**
    * <p>公网带宽配置</p>
    */
    @SerializedName("PublicNetworkLimit")
    @Expose
    private String PublicNetworkLimit;

    /**
    * <p>请求Id</p>
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
    * <p>分页offset</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>分页limit</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>是否必须录入tag</p>
    */
    @SerializedName("ForceCheckTag")
    @Expose
    private Boolean ForceCheckTag;

    /**
     * Get <p>zone列表</p> 
     * @return ZoneList <p>zone列表</p>
     */
    public ZoneInfo [] getZoneList() {
        return this.ZoneList;
    }

    /**
     * Set <p>zone列表</p>
     * @param ZoneList <p>zone列表</p>
     */
    public void setZoneList(ZoneInfo [] ZoneList) {
        this.ZoneList = ZoneList;
    }

    /**
     * Get <p>最大购买实例个数</p> 
     * @return MaxBuyInstanceNum <p>最大购买实例个数</p>
     */
    public Long getMaxBuyInstanceNum() {
        return this.MaxBuyInstanceNum;
    }

    /**
     * Set <p>最大购买实例个数</p>
     * @param MaxBuyInstanceNum <p>最大购买实例个数</p>
     */
    public void setMaxBuyInstanceNum(Long MaxBuyInstanceNum) {
        this.MaxBuyInstanceNum = MaxBuyInstanceNum;
    }

    /**
     * Get <p>最大购买带宽 单位Mb/s</p> 
     * @return MaxBandwidth <p>最大购买带宽 单位Mb/s</p>
     */
    public Long getMaxBandwidth() {
        return this.MaxBandwidth;
    }

    /**
     * Set <p>最大购买带宽 单位Mb/s</p>
     * @param MaxBandwidth <p>最大购买带宽 单位Mb/s</p>
     */
    public void setMaxBandwidth(Long MaxBandwidth) {
        this.MaxBandwidth = MaxBandwidth;
    }

    /**
     * Get <p>后付费单位价格</p> 
     * @return UnitPrice <p>后付费单位价格</p>
     */
    public Price getUnitPrice() {
        return this.UnitPrice;
    }

    /**
     * Set <p>后付费单位价格</p>
     * @param UnitPrice <p>后付费单位价格</p>
     */
    public void setUnitPrice(Price UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * Get <p>后付费消息单价</p> 
     * @return MessagePrice <p>后付费消息单价</p>
     */
    public Price getMessagePrice() {
        return this.MessagePrice;
    }

    /**
     * Set <p>后付费消息单价</p>
     * @param MessagePrice <p>后付费消息单价</p>
     */
    public void setMessagePrice(Price MessagePrice) {
        this.MessagePrice = MessagePrice;
    }

    /**
     * Get <p>用户独占集群信息</p> 
     * @return ClusterInfo <p>用户独占集群信息</p>
     */
    public ClusterInfo [] getClusterInfo() {
        return this.ClusterInfo;
    }

    /**
     * Set <p>用户独占集群信息</p>
     * @param ClusterInfo <p>用户独占集群信息</p>
     */
    public void setClusterInfo(ClusterInfo [] ClusterInfo) {
        this.ClusterInfo = ClusterInfo;
    }

    /**
     * Get <p>购买标准版配置</p> 
     * @return Standard <p>购买标准版配置</p>
     */
    public String getStandard() {
        return this.Standard;
    }

    /**
     * Set <p>购买标准版配置</p>
     * @param Standard <p>购买标准版配置</p>
     */
    public void setStandard(String Standard) {
        this.Standard = Standard;
    }

    /**
     * Get <p>购买标准版S2配置</p> 
     * @return StandardS2 <p>购买标准版S2配置</p>
     */
    public String getStandardS2() {
        return this.StandardS2;
    }

    /**
     * Set <p>购买标准版S2配置</p>
     * @param StandardS2 <p>购买标准版S2配置</p>
     */
    public void setStandardS2(String StandardS2) {
        this.StandardS2 = StandardS2;
    }

    /**
     * Get <p>购买专业版配置</p> 
     * @return Profession <p>购买专业版配置</p>
     */
    public String getProfession() {
        return this.Profession;
    }

    /**
     * Set <p>购买专业版配置</p>
     * @param Profession <p>购买专业版配置</p>
     */
    public void setProfession(String Profession) {
        this.Profession = Profession;
    }

    /**
     * Get <p>购买物理独占版配置</p> 
     * @return Physical <p>购买物理独占版配置</p>
     */
    public String getPhysical() {
        return this.Physical;
    }

    /**
     * Set <p>购买物理独占版配置</p>
     * @param Physical <p>购买物理独占版配置</p>
     */
    public void setPhysical(String Physical) {
        this.Physical = Physical;
    }

    /**
     * Get <p>公网带宽 最小3Mbps  最大999Mbps 仅专业版支持填写   已废弃,无实际意义</p> 
     * @return PublicNetwork <p>公网带宽 最小3Mbps  最大999Mbps 仅专业版支持填写   已废弃,无实际意义</p>
     */
    public String getPublicNetwork() {
        return this.PublicNetwork;
    }

    /**
     * Set <p>公网带宽 最小3Mbps  最大999Mbps 仅专业版支持填写   已废弃,无实际意义</p>
     * @param PublicNetwork <p>公网带宽 最小3Mbps  最大999Mbps 仅专业版支持填写   已废弃,无实际意义</p>
     */
    public void setPublicNetwork(String PublicNetwork) {
        this.PublicNetwork = PublicNetwork;
    }

    /**
     * Get <p>公网带宽配置</p> 
     * @return PublicNetworkLimit <p>公网带宽配置</p>
     */
    public String getPublicNetworkLimit() {
        return this.PublicNetworkLimit;
    }

    /**
     * Set <p>公网带宽配置</p>
     * @param PublicNetworkLimit <p>公网带宽配置</p>
     */
    public void setPublicNetworkLimit(String PublicNetworkLimit) {
        this.PublicNetworkLimit = PublicNetworkLimit;
    }

    /**
     * Get <p>请求Id</p> 
     * @return RequestId <p>请求Id</p>
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set <p>请求Id</p>
     * @param RequestId <p>请求Id</p>
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Get <p>分页offset</p> 
     * @return Offset <p>分页offset</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页offset</p>
     * @param Offset <p>分页offset</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>分页limit</p> 
     * @return Limit <p>分页limit</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页limit</p>
     * @param Limit <p>分页limit</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>是否必须录入tag</p> 
     * @return ForceCheckTag <p>是否必须录入tag</p>
     */
    public Boolean getForceCheckTag() {
        return this.ForceCheckTag;
    }

    /**
     * Set <p>是否必须录入tag</p>
     * @param ForceCheckTag <p>是否必须录入tag</p>
     */
    public void setForceCheckTag(Boolean ForceCheckTag) {
        this.ForceCheckTag = ForceCheckTag;
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
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ForceCheckTag != null) {
            this.ForceCheckTag = new Boolean(source.ForceCheckTag);
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ForceCheckTag", this.ForceCheckTag);

    }
}

