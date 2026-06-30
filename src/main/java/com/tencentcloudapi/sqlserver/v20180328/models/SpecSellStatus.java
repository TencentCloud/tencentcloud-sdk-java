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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpecSellStatus extends AbstractModel {

    /**
    * <p>可售卖的规格唯一ID</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>实例规格ID</p>
    */
    @SerializedName("SpecId")
    @Expose
    private Long SpecId;

    /**
    * <p>此规格下支持的付费模式，POST-仅支持按量计费 PRE-仅支持包年包月 ALL-支持所有</p>
    */
    @SerializedName("PayModeStatus")
    @Expose
    private String PayModeStatus;

    /**
    * <p>产品类型，购买实例的类型 HA-本地盘高可用(包括双机高可用，alwaysOn集群)，RO-本地盘只读副本，SI-云盘版单节点,BI-商业智能服务，cvmHA-云盘版高可用，cvmRO-云盘版只读副本，MultiHA-多节点，cvmMultiHA-云盘多节点</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>该规格支持的是否跨可用去，MultiZones-只支持跨可用区，SameZones-只支持同可用区，ALL-支持所有</p>
    */
    @SerializedName("MultiZonesStatus")
    @Expose
    private String MultiZonesStatus;

    /**
    * <p>架构标识，SINGLE-单节点 DOUBLE-双节点 TRIPLE-三节点 MULTI-多节点<br>示例值：SINGLE</p>
    */
    @SerializedName("Architecture")
    @Expose
    private String Architecture;

    /**
    * <p>类型标识，EXCLUSIVE-独享型，SHARED-共享型</p>
    */
    @SerializedName("Style")
    @Expose
    private String Style;

    /**
    * <p>数据库版本信息</p>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>每个可用区的售卖状态集合</p>
    */
    @SerializedName("ZoneStatusSet")
    @Expose
    private ZoneStatus [] ZoneStatusSet;

    /**
    * <p>规格的参考价格，实际价格以询价接口为准</p>
    */
    @SerializedName("Price")
    @Expose
    private Price Price;

    /**
    * <p>规格售卖状态 1-正常 2-关闭售卖但是可以升级 3-完全关闭售卖</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>最小磁盘容量时的基准 </p><p>单位：IOPS</p>
    */
    @SerializedName("MinBaselineIOPS")
    @Expose
    private Long MinBaselineIOPS;

    /**
    * <p>最大磁盘容量时的基准 </p><p>单位：IOPS</p>
    */
    @SerializedName("MaxBaselineIOPS")
    @Expose
    private Long MaxBaselineIOPS;

    /**
    * <p>最小磁盘容量时的基准吞吐量 </p><p>单位：MB/s</p>
    */
    @SerializedName("MinBaselineThroughput")
    @Expose
    private Long MinBaselineThroughput;

    /**
    * <p>最大磁盘容量时的基准吞吐量 </p><p>单位：MB/s</p>
    */
    @SerializedName("MaxBaselineThroughput")
    @Expose
    private Long MaxBaselineThroughput;

    /**
    * <p>是否支持额外 IO 性能</p><p>枚举值：</p><ul><li>TRUE： 支持额外 IO 性能</li><li>FALSE： 不支持额外 IO 性能</li></ul>
    */
    @SerializedName("ExtraIOSupported")
    @Expose
    private Boolean ExtraIOSupported;

    /**
    * <p>额外 IO 最大吞吐量 </p><p>单位：MB/s</p>
    */
    @SerializedName("MaxExtraThroughput")
    @Expose
    private Long MaxExtraThroughput;

    /**
    * <p>支持额外 IO 的最小磁盘容量</p><p>单位：GB</p><p>默认值：460</p>
    */
    @SerializedName("MinDiskSizeForExtraIO")
    @Expose
    private Long MinDiskSizeForExtraIO;

    /**
     * Get <p>可售卖的规格唯一ID</p> 
     * @return Id <p>可售卖的规格唯一ID</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>可售卖的规格唯一ID</p>
     * @param Id <p>可售卖的规格唯一ID</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>实例规格ID</p> 
     * @return SpecId <p>实例规格ID</p>
     */
    public Long getSpecId() {
        return this.SpecId;
    }

    /**
     * Set <p>实例规格ID</p>
     * @param SpecId <p>实例规格ID</p>
     */
    public void setSpecId(Long SpecId) {
        this.SpecId = SpecId;
    }

    /**
     * Get <p>此规格下支持的付费模式，POST-仅支持按量计费 PRE-仅支持包年包月 ALL-支持所有</p> 
     * @return PayModeStatus <p>此规格下支持的付费模式，POST-仅支持按量计费 PRE-仅支持包年包月 ALL-支持所有</p>
     */
    public String getPayModeStatus() {
        return this.PayModeStatus;
    }

    /**
     * Set <p>此规格下支持的付费模式，POST-仅支持按量计费 PRE-仅支持包年包月 ALL-支持所有</p>
     * @param PayModeStatus <p>此规格下支持的付费模式，POST-仅支持按量计费 PRE-仅支持包年包月 ALL-支持所有</p>
     */
    public void setPayModeStatus(String PayModeStatus) {
        this.PayModeStatus = PayModeStatus;
    }

    /**
     * Get <p>产品类型，购买实例的类型 HA-本地盘高可用(包括双机高可用，alwaysOn集群)，RO-本地盘只读副本，SI-云盘版单节点,BI-商业智能服务，cvmHA-云盘版高可用，cvmRO-云盘版只读副本，MultiHA-多节点，cvmMultiHA-云盘多节点</p> 
     * @return InstanceType <p>产品类型，购买实例的类型 HA-本地盘高可用(包括双机高可用，alwaysOn集群)，RO-本地盘只读副本，SI-云盘版单节点,BI-商业智能服务，cvmHA-云盘版高可用，cvmRO-云盘版只读副本，MultiHA-多节点，cvmMultiHA-云盘多节点</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>产品类型，购买实例的类型 HA-本地盘高可用(包括双机高可用，alwaysOn集群)，RO-本地盘只读副本，SI-云盘版单节点,BI-商业智能服务，cvmHA-云盘版高可用，cvmRO-云盘版只读副本，MultiHA-多节点，cvmMultiHA-云盘多节点</p>
     * @param InstanceType <p>产品类型，购买实例的类型 HA-本地盘高可用(包括双机高可用，alwaysOn集群)，RO-本地盘只读副本，SI-云盘版单节点,BI-商业智能服务，cvmHA-云盘版高可用，cvmRO-云盘版只读副本，MultiHA-多节点，cvmMultiHA-云盘多节点</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>该规格支持的是否跨可用去，MultiZones-只支持跨可用区，SameZones-只支持同可用区，ALL-支持所有</p> 
     * @return MultiZonesStatus <p>该规格支持的是否跨可用去，MultiZones-只支持跨可用区，SameZones-只支持同可用区，ALL-支持所有</p>
     */
    public String getMultiZonesStatus() {
        return this.MultiZonesStatus;
    }

    /**
     * Set <p>该规格支持的是否跨可用去，MultiZones-只支持跨可用区，SameZones-只支持同可用区，ALL-支持所有</p>
     * @param MultiZonesStatus <p>该规格支持的是否跨可用去，MultiZones-只支持跨可用区，SameZones-只支持同可用区，ALL-支持所有</p>
     */
    public void setMultiZonesStatus(String MultiZonesStatus) {
        this.MultiZonesStatus = MultiZonesStatus;
    }

    /**
     * Get <p>架构标识，SINGLE-单节点 DOUBLE-双节点 TRIPLE-三节点 MULTI-多节点<br>示例值：SINGLE</p> 
     * @return Architecture <p>架构标识，SINGLE-单节点 DOUBLE-双节点 TRIPLE-三节点 MULTI-多节点<br>示例值：SINGLE</p>
     */
    public String getArchitecture() {
        return this.Architecture;
    }

    /**
     * Set <p>架构标识，SINGLE-单节点 DOUBLE-双节点 TRIPLE-三节点 MULTI-多节点<br>示例值：SINGLE</p>
     * @param Architecture <p>架构标识，SINGLE-单节点 DOUBLE-双节点 TRIPLE-三节点 MULTI-多节点<br>示例值：SINGLE</p>
     */
    public void setArchitecture(String Architecture) {
        this.Architecture = Architecture;
    }

    /**
     * Get <p>类型标识，EXCLUSIVE-独享型，SHARED-共享型</p> 
     * @return Style <p>类型标识，EXCLUSIVE-独享型，SHARED-共享型</p>
     */
    public String getStyle() {
        return this.Style;
    }

    /**
     * Set <p>类型标识，EXCLUSIVE-独享型，SHARED-共享型</p>
     * @param Style <p>类型标识，EXCLUSIVE-独享型，SHARED-共享型</p>
     */
    public void setStyle(String Style) {
        this.Style = Style;
    }

    /**
     * Get <p>数据库版本信息</p> 
     * @return Version <p>数据库版本信息</p>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>数据库版本信息</p>
     * @param Version <p>数据库版本信息</p>
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>每个可用区的售卖状态集合</p> 
     * @return ZoneStatusSet <p>每个可用区的售卖状态集合</p>
     */
    public ZoneStatus [] getZoneStatusSet() {
        return this.ZoneStatusSet;
    }

    /**
     * Set <p>每个可用区的售卖状态集合</p>
     * @param ZoneStatusSet <p>每个可用区的售卖状态集合</p>
     */
    public void setZoneStatusSet(ZoneStatus [] ZoneStatusSet) {
        this.ZoneStatusSet = ZoneStatusSet;
    }

    /**
     * Get <p>规格的参考价格，实际价格以询价接口为准</p> 
     * @return Price <p>规格的参考价格，实际价格以询价接口为准</p>
     */
    public Price getPrice() {
        return this.Price;
    }

    /**
     * Set <p>规格的参考价格，实际价格以询价接口为准</p>
     * @param Price <p>规格的参考价格，实际价格以询价接口为准</p>
     */
    public void setPrice(Price Price) {
        this.Price = Price;
    }

    /**
     * Get <p>规格售卖状态 1-正常 2-关闭售卖但是可以升级 3-完全关闭售卖</p> 
     * @return Status <p>规格售卖状态 1-正常 2-关闭售卖但是可以升级 3-完全关闭售卖</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>规格售卖状态 1-正常 2-关闭售卖但是可以升级 3-完全关闭售卖</p>
     * @param Status <p>规格售卖状态 1-正常 2-关闭售卖但是可以升级 3-完全关闭售卖</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>最小磁盘容量时的基准 </p><p>单位：IOPS</p> 
     * @return MinBaselineIOPS <p>最小磁盘容量时的基准 </p><p>单位：IOPS</p>
     */
    public Long getMinBaselineIOPS() {
        return this.MinBaselineIOPS;
    }

    /**
     * Set <p>最小磁盘容量时的基准 </p><p>单位：IOPS</p>
     * @param MinBaselineIOPS <p>最小磁盘容量时的基准 </p><p>单位：IOPS</p>
     */
    public void setMinBaselineIOPS(Long MinBaselineIOPS) {
        this.MinBaselineIOPS = MinBaselineIOPS;
    }

    /**
     * Get <p>最大磁盘容量时的基准 </p><p>单位：IOPS</p> 
     * @return MaxBaselineIOPS <p>最大磁盘容量时的基准 </p><p>单位：IOPS</p>
     */
    public Long getMaxBaselineIOPS() {
        return this.MaxBaselineIOPS;
    }

    /**
     * Set <p>最大磁盘容量时的基准 </p><p>单位：IOPS</p>
     * @param MaxBaselineIOPS <p>最大磁盘容量时的基准 </p><p>单位：IOPS</p>
     */
    public void setMaxBaselineIOPS(Long MaxBaselineIOPS) {
        this.MaxBaselineIOPS = MaxBaselineIOPS;
    }

    /**
     * Get <p>最小磁盘容量时的基准吞吐量 </p><p>单位：MB/s</p> 
     * @return MinBaselineThroughput <p>最小磁盘容量时的基准吞吐量 </p><p>单位：MB/s</p>
     */
    public Long getMinBaselineThroughput() {
        return this.MinBaselineThroughput;
    }

    /**
     * Set <p>最小磁盘容量时的基准吞吐量 </p><p>单位：MB/s</p>
     * @param MinBaselineThroughput <p>最小磁盘容量时的基准吞吐量 </p><p>单位：MB/s</p>
     */
    public void setMinBaselineThroughput(Long MinBaselineThroughput) {
        this.MinBaselineThroughput = MinBaselineThroughput;
    }

    /**
     * Get <p>最大磁盘容量时的基准吞吐量 </p><p>单位：MB/s</p> 
     * @return MaxBaselineThroughput <p>最大磁盘容量时的基准吞吐量 </p><p>单位：MB/s</p>
     */
    public Long getMaxBaselineThroughput() {
        return this.MaxBaselineThroughput;
    }

    /**
     * Set <p>最大磁盘容量时的基准吞吐量 </p><p>单位：MB/s</p>
     * @param MaxBaselineThroughput <p>最大磁盘容量时的基准吞吐量 </p><p>单位：MB/s</p>
     */
    public void setMaxBaselineThroughput(Long MaxBaselineThroughput) {
        this.MaxBaselineThroughput = MaxBaselineThroughput;
    }

    /**
     * Get <p>是否支持额外 IO 性能</p><p>枚举值：</p><ul><li>TRUE： 支持额外 IO 性能</li><li>FALSE： 不支持额外 IO 性能</li></ul> 
     * @return ExtraIOSupported <p>是否支持额外 IO 性能</p><p>枚举值：</p><ul><li>TRUE： 支持额外 IO 性能</li><li>FALSE： 不支持额外 IO 性能</li></ul>
     */
    public Boolean getExtraIOSupported() {
        return this.ExtraIOSupported;
    }

    /**
     * Set <p>是否支持额外 IO 性能</p><p>枚举值：</p><ul><li>TRUE： 支持额外 IO 性能</li><li>FALSE： 不支持额外 IO 性能</li></ul>
     * @param ExtraIOSupported <p>是否支持额外 IO 性能</p><p>枚举值：</p><ul><li>TRUE： 支持额外 IO 性能</li><li>FALSE： 不支持额外 IO 性能</li></ul>
     */
    public void setExtraIOSupported(Boolean ExtraIOSupported) {
        this.ExtraIOSupported = ExtraIOSupported;
    }

    /**
     * Get <p>额外 IO 最大吞吐量 </p><p>单位：MB/s</p> 
     * @return MaxExtraThroughput <p>额外 IO 最大吞吐量 </p><p>单位：MB/s</p>
     */
    public Long getMaxExtraThroughput() {
        return this.MaxExtraThroughput;
    }

    /**
     * Set <p>额外 IO 最大吞吐量 </p><p>单位：MB/s</p>
     * @param MaxExtraThroughput <p>额外 IO 最大吞吐量 </p><p>单位：MB/s</p>
     */
    public void setMaxExtraThroughput(Long MaxExtraThroughput) {
        this.MaxExtraThroughput = MaxExtraThroughput;
    }

    /**
     * Get <p>支持额外 IO 的最小磁盘容量</p><p>单位：GB</p><p>默认值：460</p> 
     * @return MinDiskSizeForExtraIO <p>支持额外 IO 的最小磁盘容量</p><p>单位：GB</p><p>默认值：460</p>
     */
    public Long getMinDiskSizeForExtraIO() {
        return this.MinDiskSizeForExtraIO;
    }

    /**
     * Set <p>支持额外 IO 的最小磁盘容量</p><p>单位：GB</p><p>默认值：460</p>
     * @param MinDiskSizeForExtraIO <p>支持额外 IO 的最小磁盘容量</p><p>单位：GB</p><p>默认值：460</p>
     */
    public void setMinDiskSizeForExtraIO(Long MinDiskSizeForExtraIO) {
        this.MinDiskSizeForExtraIO = MinDiskSizeForExtraIO;
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
        if (source.MinBaselineIOPS != null) {
            this.MinBaselineIOPS = new Long(source.MinBaselineIOPS);
        }
        if (source.MaxBaselineIOPS != null) {
            this.MaxBaselineIOPS = new Long(source.MaxBaselineIOPS);
        }
        if (source.MinBaselineThroughput != null) {
            this.MinBaselineThroughput = new Long(source.MinBaselineThroughput);
        }
        if (source.MaxBaselineThroughput != null) {
            this.MaxBaselineThroughput = new Long(source.MaxBaselineThroughput);
        }
        if (source.ExtraIOSupported != null) {
            this.ExtraIOSupported = new Boolean(source.ExtraIOSupported);
        }
        if (source.MaxExtraThroughput != null) {
            this.MaxExtraThroughput = new Long(source.MaxExtraThroughput);
        }
        if (source.MinDiskSizeForExtraIO != null) {
            this.MinDiskSizeForExtraIO = new Long(source.MinDiskSizeForExtraIO);
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
        this.setParamSimple(map, prefix + "MinBaselineIOPS", this.MinBaselineIOPS);
        this.setParamSimple(map, prefix + "MaxBaselineIOPS", this.MaxBaselineIOPS);
        this.setParamSimple(map, prefix + "MinBaselineThroughput", this.MinBaselineThroughput);
        this.setParamSimple(map, prefix + "MaxBaselineThroughput", this.MaxBaselineThroughput);
        this.setParamSimple(map, prefix + "ExtraIOSupported", this.ExtraIOSupported);
        this.setParamSimple(map, prefix + "MaxExtraThroughput", this.MaxExtraThroughput);
        this.setParamSimple(map, prefix + "MinDiskSizeForExtraIO", this.MinDiskSizeForExtraIO);

    }
}

