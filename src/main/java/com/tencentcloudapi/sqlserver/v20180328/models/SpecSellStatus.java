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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpecSellStatus extends AbstractModel {

    /**
    * 可售卖的规格唯一ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 实例规格ID
    */
    @SerializedName("SpecId")
    @Expose
    private Long SpecId;

    /**
    * 此规格下支持的付费模式，POST-仅支持按量计费 PRE-仅支持包年包月 ALL-支持所有
    */
    @SerializedName("PayModeStatus")
    @Expose
    private String PayModeStatus;

    /**
    * 产品类型，购买实例的类型 HA-本地盘高可用(包括双机高可用，alwaysOn集群)，RO-本地盘只读副本，SI-云盘版单节点,BI-商业智能服务，cvmHA-云盘版高可用，cvmRO-云盘版只读副本，MultiHA-多节点，cvmMultiHA-云盘多节点
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 该规格支持的是否跨可用去，MultiZones-只支持跨可用区，SameZones-只支持同可用区，ALL-支持所有
    */
    @SerializedName("MultiZonesStatus")
    @Expose
    private String MultiZonesStatus;

    /**
    * 架构标识，SINGLE-单节点 DOUBLE-双节点 TRIPLE-三节点 MULTI-多节点
示例值：SINGLE
    */
    @SerializedName("Architecture")
    @Expose
    private String Architecture;

    /**
    * 类型标识，EXCLUSIVE-独享型，SHARED-共享型
    */
    @SerializedName("Style")
    @Expose
    private String Style;

    /**
    * 数据库版本信息
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 每个可用区的售卖状态集合
    */
    @SerializedName("ZoneStatusSet")
    @Expose
    private ZoneStatus [] ZoneStatusSet;

    /**
    * 规格的参考价格，实际价格以询价接口为准
    */
    @SerializedName("Price")
    @Expose
    private Price Price;

    /**
    * 规格售卖状态 1-正常 2-关闭售卖但是可以升级 3-完全关闭售卖
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 可售卖的规格唯一ID 
     * @return Id 可售卖的规格唯一ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 可售卖的规格唯一ID
     * @param Id 可售卖的规格唯一ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 实例规格ID 
     * @return SpecId 实例规格ID
     */
    public Long getSpecId() {
        return this.SpecId;
    }

    /**
     * Set 实例规格ID
     * @param SpecId 实例规格ID
     */
    public void setSpecId(Long SpecId) {
        this.SpecId = SpecId;
    }

    /**
     * Get 此规格下支持的付费模式，POST-仅支持按量计费 PRE-仅支持包年包月 ALL-支持所有 
     * @return PayModeStatus 此规格下支持的付费模式，POST-仅支持按量计费 PRE-仅支持包年包月 ALL-支持所有
     */
    public String getPayModeStatus() {
        return this.PayModeStatus;
    }

    /**
     * Set 此规格下支持的付费模式，POST-仅支持按量计费 PRE-仅支持包年包月 ALL-支持所有
     * @param PayModeStatus 此规格下支持的付费模式，POST-仅支持按量计费 PRE-仅支持包年包月 ALL-支持所有
     */
    public void setPayModeStatus(String PayModeStatus) {
        this.PayModeStatus = PayModeStatus;
    }

    /**
     * Get 产品类型，购买实例的类型 HA-本地盘高可用(包括双机高可用，alwaysOn集群)，RO-本地盘只读副本，SI-云盘版单节点,BI-商业智能服务，cvmHA-云盘版高可用，cvmRO-云盘版只读副本，MultiHA-多节点，cvmMultiHA-云盘多节点 
     * @return InstanceType 产品类型，购买实例的类型 HA-本地盘高可用(包括双机高可用，alwaysOn集群)，RO-本地盘只读副本，SI-云盘版单节点,BI-商业智能服务，cvmHA-云盘版高可用，cvmRO-云盘版只读副本，MultiHA-多节点，cvmMultiHA-云盘多节点
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 产品类型，购买实例的类型 HA-本地盘高可用(包括双机高可用，alwaysOn集群)，RO-本地盘只读副本，SI-云盘版单节点,BI-商业智能服务，cvmHA-云盘版高可用，cvmRO-云盘版只读副本，MultiHA-多节点，cvmMultiHA-云盘多节点
     * @param InstanceType 产品类型，购买实例的类型 HA-本地盘高可用(包括双机高可用，alwaysOn集群)，RO-本地盘只读副本，SI-云盘版单节点,BI-商业智能服务，cvmHA-云盘版高可用，cvmRO-云盘版只读副本，MultiHA-多节点，cvmMultiHA-云盘多节点
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 该规格支持的是否跨可用去，MultiZones-只支持跨可用区，SameZones-只支持同可用区，ALL-支持所有 
     * @return MultiZonesStatus 该规格支持的是否跨可用去，MultiZones-只支持跨可用区，SameZones-只支持同可用区，ALL-支持所有
     */
    public String getMultiZonesStatus() {
        return this.MultiZonesStatus;
    }

    /**
     * Set 该规格支持的是否跨可用去，MultiZones-只支持跨可用区，SameZones-只支持同可用区，ALL-支持所有
     * @param MultiZonesStatus 该规格支持的是否跨可用去，MultiZones-只支持跨可用区，SameZones-只支持同可用区，ALL-支持所有
     */
    public void setMultiZonesStatus(String MultiZonesStatus) {
        this.MultiZonesStatus = MultiZonesStatus;
    }

    /**
     * Get 架构标识，SINGLE-单节点 DOUBLE-双节点 TRIPLE-三节点 MULTI-多节点
示例值：SINGLE 
     * @return Architecture 架构标识，SINGLE-单节点 DOUBLE-双节点 TRIPLE-三节点 MULTI-多节点
示例值：SINGLE
     */
    public String getArchitecture() {
        return this.Architecture;
    }

    /**
     * Set 架构标识，SINGLE-单节点 DOUBLE-双节点 TRIPLE-三节点 MULTI-多节点
示例值：SINGLE
     * @param Architecture 架构标识，SINGLE-单节点 DOUBLE-双节点 TRIPLE-三节点 MULTI-多节点
示例值：SINGLE
     */
    public void setArchitecture(String Architecture) {
        this.Architecture = Architecture;
    }

    /**
     * Get 类型标识，EXCLUSIVE-独享型，SHARED-共享型 
     * @return Style 类型标识，EXCLUSIVE-独享型，SHARED-共享型
     */
    public String getStyle() {
        return this.Style;
    }

    /**
     * Set 类型标识，EXCLUSIVE-独享型，SHARED-共享型
     * @param Style 类型标识，EXCLUSIVE-独享型，SHARED-共享型
     */
    public void setStyle(String Style) {
        this.Style = Style;
    }

    /**
     * Get 数据库版本信息 
     * @return Version 数据库版本信息
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 数据库版本信息
     * @param Version 数据库版本信息
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 每个可用区的售卖状态集合 
     * @return ZoneStatusSet 每个可用区的售卖状态集合
     */
    public ZoneStatus [] getZoneStatusSet() {
        return this.ZoneStatusSet;
    }

    /**
     * Set 每个可用区的售卖状态集合
     * @param ZoneStatusSet 每个可用区的售卖状态集合
     */
    public void setZoneStatusSet(ZoneStatus [] ZoneStatusSet) {
        this.ZoneStatusSet = ZoneStatusSet;
    }

    /**
     * Get 规格的参考价格，实际价格以询价接口为准 
     * @return Price 规格的参考价格，实际价格以询价接口为准
     */
    public Price getPrice() {
        return this.Price;
    }

    /**
     * Set 规格的参考价格，实际价格以询价接口为准
     * @param Price 规格的参考价格，实际价格以询价接口为准
     */
    public void setPrice(Price Price) {
        this.Price = Price;
    }

    /**
     * Get 规格售卖状态 1-正常 2-关闭售卖但是可以升级 3-完全关闭售卖 
     * @return Status 规格售卖状态 1-正常 2-关闭售卖但是可以升级 3-完全关闭售卖
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 规格售卖状态 1-正常 2-关闭售卖但是可以升级 3-完全关闭售卖
     * @param Status 规格售卖状态 1-正常 2-关闭售卖但是可以升级 3-完全关闭售卖
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public SpecSellStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpecSellStatus(SpecSellStatus source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.SpecId != null) {
            this.SpecId = new Long(source.SpecId);
        }
        if (source.PayModeStatus != null) {
            this.PayModeStatus = new String(source.PayModeStatus);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.MultiZonesStatus != null) {
            this.MultiZonesStatus = new String(source.MultiZonesStatus);
        }
        if (source.Architecture != null) {
            this.Architecture = new String(source.Architecture);
        }
        if (source.Style != null) {
            this.Style = new String(source.Style);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.ZoneStatusSet != null) {
            this.ZoneStatusSet = new ZoneStatus[source.ZoneStatusSet.length];
            for (int i = 0; i < source.ZoneStatusSet.length; i++) {
                this.ZoneStatusSet[i] = new ZoneStatus(source.ZoneStatusSet[i]);
            }
        }
        if (source.Price != null) {
            this.Price = new Price(source.Price);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "SpecId", this.SpecId);
        this.setParamSimple(map, prefix + "PayModeStatus", this.PayModeStatus);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "MultiZonesStatus", this.MultiZonesStatus);
        this.setParamSimple(map, prefix + "Architecture", this.Architecture);
        this.setParamSimple(map, prefix + "Style", this.Style);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamArrayObj(map, prefix + "ZoneStatusSet.", this.ZoneStatusSet);
        this.setParamObj(map, prefix + "Price.", this.Price);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

