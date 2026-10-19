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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OverviewEastWestDetail extends AbstractModel {

    /**
    * <p>东西向总带宽，单位为 Mbps。</p><p>单位：Mbps</p>
    */
    @SerializedName("TotalMbps")
    @Expose
    private Long TotalMbps;

    /**
    * <p>当前已使用流量，单位为 bps。</p><p>单位：bps</p>
    */
    @SerializedName("UsedBps")
    @Expose
    private Long UsedBps;

    /**
    * <p>当前带宽使用率。</p><p>单位：%</p>
    */
    @SerializedName("UsagePercent")
    @Expose
    private Float UsagePercent;

    /**
    * <p>已分配并使用的带宽，单位为 Mbps。</p><p>单位：Mbps</p>
    */
    @SerializedName("AllocatedBandwidthUsedMbps")
    @Expose
    private Long AllocatedBandwidthUsedMbps;

    /**
    * <p>当前仍可使用带宽，单位为 Mbps。</p><p>单位：Mbps</p>
    */
    @SerializedName("CanUsedBandwidthMbps")
    @Expose
    private Long CanUsedBandwidthMbps;

    /**
    * <p>集群模式带宽，单位为 Mbps。</p><p>单位：Mbps</p>
    */
    @SerializedName("ClusterModeWidthMbps")
    @Expose
    private Long ClusterModeWidthMbps;

    /**
    * <p>主备模式带宽，单位为 Mbps。</p><p>单位：Mbps</p>
    */
    @SerializedName("MasterSlaveModeWidthMbps")
    @Expose
    private Long MasterSlaveModeWidthMbps;

    /**
    * <p>同地域防火墙实例 ID。</p>
    */
    @SerializedName("SameRegionFwInsId")
    @Expose
    private String SameRegionFwInsId;

    /**
    * <p>同地域防火墙实例名称。</p>
    */
    @SerializedName("SameRegionFwInsName")
    @Expose
    private String SameRegionFwInsName;

    /**
    * <p>同地域防火墙实例峰值流量，单位为 bps。</p><p>单位：bps</p>
    */
    @SerializedName("SameRegionMaxFlowBps")
    @Expose
    private Long SameRegionMaxFlowBps;

    /**
    * <p>跨地域防火墙实例 ID。</p>
    */
    @SerializedName("DiffRegionFwInsId")
    @Expose
    private String DiffRegionFwInsId;

    /**
    * <p>跨地域防火墙实例名称。</p>
    */
    @SerializedName("DiffRegionFwInsName")
    @Expose
    private String DiffRegionFwInsName;

    /**
    * <p>跨地域防火墙实例峰值流量，单位为 bps。</p><p>单位：bps</p>
    */
    @SerializedName("DiffRegionMaxFlowBps")
    @Expose
    private Long DiffRegionMaxFlowBps;

    /**
    * <p>防火墙实例组 ID。</p>
    */
    @SerializedName("FwGroupId")
    @Expose
    private String FwGroupId;

    /**
    * <p>防火墙实例组名称。</p>
    */
    @SerializedName("FwGroupName")
    @Expose
    private String FwGroupName;

    /**
    * <p>防火墙实例组峰值流量，单位为 bps。</p><p>单位：bps</p>
    */
    @SerializedName("FwGroupMaxFlowBps")
    @Expose
    private Long FwGroupMaxFlowBps;

    /**
    * <p>防火墙实例 ID。</p>
    */
    @SerializedName("FwInsId")
    @Expose
    private String FwInsId;

    /**
    * <p>防火墙实例名称。</p>
    */
    @SerializedName("FwInsName")
    @Expose
    private String FwInsName;

    /**
    * <p>防火墙实例峰值流量，单位为 bps。</p><p>单位：bps</p>
    */
    @SerializedName("FwInsMaxFlowBps")
    @Expose
    private Long FwInsMaxFlowBps;

    /**
    * <p>集群 VPC 峰值流量，单位为 bps。</p><p>单位：bps</p>
    */
    @SerializedName("ClusterVpcMaxFlowBps")
    @Expose
    private Long ClusterVpcMaxFlowBps;

    /**
     * Get <p>东西向总带宽，单位为 Mbps。</p><p>单位：Mbps</p> 
     * @return TotalMbps <p>东西向总带宽，单位为 Mbps。</p><p>单位：Mbps</p>
     */
    public Long getTotalMbps() {
        return this.TotalMbps;
    }

    /**
     * Set <p>东西向总带宽，单位为 Mbps。</p><p>单位：Mbps</p>
     * @param TotalMbps <p>东西向总带宽，单位为 Mbps。</p><p>单位：Mbps</p>
     */
    public void setTotalMbps(Long TotalMbps) {
        this.TotalMbps = TotalMbps;
    }

    /**
     * Get <p>当前已使用流量，单位为 bps。</p><p>单位：bps</p> 
     * @return UsedBps <p>当前已使用流量，单位为 bps。</p><p>单位：bps</p>
     */
    public Long getUsedBps() {
        return this.UsedBps;
    }

    /**
     * Set <p>当前已使用流量，单位为 bps。</p><p>单位：bps</p>
     * @param UsedBps <p>当前已使用流量，单位为 bps。</p><p>单位：bps</p>
     */
    public void setUsedBps(Long UsedBps) {
        this.UsedBps = UsedBps;
    }

    /**
     * Get <p>当前带宽使用率。</p><p>单位：%</p> 
     * @return UsagePercent <p>当前带宽使用率。</p><p>单位：%</p>
     */
    public Float getUsagePercent() {
        return this.UsagePercent;
    }

    /**
     * Set <p>当前带宽使用率。</p><p>单位：%</p>
     * @param UsagePercent <p>当前带宽使用率。</p><p>单位：%</p>
     */
    public void setUsagePercent(Float UsagePercent) {
        this.UsagePercent = UsagePercent;
    }

    /**
     * Get <p>已分配并使用的带宽，单位为 Mbps。</p><p>单位：Mbps</p> 
     * @return AllocatedBandwidthUsedMbps <p>已分配并使用的带宽，单位为 Mbps。</p><p>单位：Mbps</p>
     */
    public Long getAllocatedBandwidthUsedMbps() {
        return this.AllocatedBandwidthUsedMbps;
    }

    /**
     * Set <p>已分配并使用的带宽，单位为 Mbps。</p><p>单位：Mbps</p>
     * @param AllocatedBandwidthUsedMbps <p>已分配并使用的带宽，单位为 Mbps。</p><p>单位：Mbps</p>
     */
    public void setAllocatedBandwidthUsedMbps(Long AllocatedBandwidthUsedMbps) {
        this.AllocatedBandwidthUsedMbps = AllocatedBandwidthUsedMbps;
    }

    /**
     * Get <p>当前仍可使用带宽，单位为 Mbps。</p><p>单位：Mbps</p> 
     * @return CanUsedBandwidthMbps <p>当前仍可使用带宽，单位为 Mbps。</p><p>单位：Mbps</p>
     */
    public Long getCanUsedBandwidthMbps() {
        return this.CanUsedBandwidthMbps;
    }

    /**
     * Set <p>当前仍可使用带宽，单位为 Mbps。</p><p>单位：Mbps</p>
     * @param CanUsedBandwidthMbps <p>当前仍可使用带宽，单位为 Mbps。</p><p>单位：Mbps</p>
     */
    public void setCanUsedBandwidthMbps(Long CanUsedBandwidthMbps) {
        this.CanUsedBandwidthMbps = CanUsedBandwidthMbps;
    }

    /**
     * Get <p>集群模式带宽，单位为 Mbps。</p><p>单位：Mbps</p> 
     * @return ClusterModeWidthMbps <p>集群模式带宽，单位为 Mbps。</p><p>单位：Mbps</p>
     */
    public Long getClusterModeWidthMbps() {
        return this.ClusterModeWidthMbps;
    }

    /**
     * Set <p>集群模式带宽，单位为 Mbps。</p><p>单位：Mbps</p>
     * @param ClusterModeWidthMbps <p>集群模式带宽，单位为 Mbps。</p><p>单位：Mbps</p>
     */
    public void setClusterModeWidthMbps(Long ClusterModeWidthMbps) {
        this.ClusterModeWidthMbps = ClusterModeWidthMbps;
    }

    /**
     * Get <p>主备模式带宽，单位为 Mbps。</p><p>单位：Mbps</p> 
     * @return MasterSlaveModeWidthMbps <p>主备模式带宽，单位为 Mbps。</p><p>单位：Mbps</p>
     */
    public Long getMasterSlaveModeWidthMbps() {
        return this.MasterSlaveModeWidthMbps;
    }

    /**
     * Set <p>主备模式带宽，单位为 Mbps。</p><p>单位：Mbps</p>
     * @param MasterSlaveModeWidthMbps <p>主备模式带宽，单位为 Mbps。</p><p>单位：Mbps</p>
     */
    public void setMasterSlaveModeWidthMbps(Long MasterSlaveModeWidthMbps) {
        this.MasterSlaveModeWidthMbps = MasterSlaveModeWidthMbps;
    }

    /**
     * Get <p>同地域防火墙实例 ID。</p> 
     * @return SameRegionFwInsId <p>同地域防火墙实例 ID。</p>
     */
    public String getSameRegionFwInsId() {
        return this.SameRegionFwInsId;
    }

    /**
     * Set <p>同地域防火墙实例 ID。</p>
     * @param SameRegionFwInsId <p>同地域防火墙实例 ID。</p>
     */
    public void setSameRegionFwInsId(String SameRegionFwInsId) {
        this.SameRegionFwInsId = SameRegionFwInsId;
    }

    /**
     * Get <p>同地域防火墙实例名称。</p> 
     * @return SameRegionFwInsName <p>同地域防火墙实例名称。</p>
     */
    public String getSameRegionFwInsName() {
        return this.SameRegionFwInsName;
    }

    /**
     * Set <p>同地域防火墙实例名称。</p>
     * @param SameRegionFwInsName <p>同地域防火墙实例名称。</p>
     */
    public void setSameRegionFwInsName(String SameRegionFwInsName) {
        this.SameRegionFwInsName = SameRegionFwInsName;
    }

    /**
     * Get <p>同地域防火墙实例峰值流量，单位为 bps。</p><p>单位：bps</p> 
     * @return SameRegionMaxFlowBps <p>同地域防火墙实例峰值流量，单位为 bps。</p><p>单位：bps</p>
     */
    public Long getSameRegionMaxFlowBps() {
        return this.SameRegionMaxFlowBps;
    }

    /**
     * Set <p>同地域防火墙实例峰值流量，单位为 bps。</p><p>单位：bps</p>
     * @param SameRegionMaxFlowBps <p>同地域防火墙实例峰值流量，单位为 bps。</p><p>单位：bps</p>
     */
    public void setSameRegionMaxFlowBps(Long SameRegionMaxFlowBps) {
        this.SameRegionMaxFlowBps = SameRegionMaxFlowBps;
    }

    /**
     * Get <p>跨地域防火墙实例 ID。</p> 
     * @return DiffRegionFwInsId <p>跨地域防火墙实例 ID。</p>
     */
    public String getDiffRegionFwInsId() {
        return this.DiffRegionFwInsId;
    }

    /**
     * Set <p>跨地域防火墙实例 ID。</p>
     * @param DiffRegionFwInsId <p>跨地域防火墙实例 ID。</p>
     */
    public void setDiffRegionFwInsId(String DiffRegionFwInsId) {
        this.DiffRegionFwInsId = DiffRegionFwInsId;
    }

    /**
     * Get <p>跨地域防火墙实例名称。</p> 
     * @return DiffRegionFwInsName <p>跨地域防火墙实例名称。</p>
     */
    public String getDiffRegionFwInsName() {
        return this.DiffRegionFwInsName;
    }

    /**
     * Set <p>跨地域防火墙实例名称。</p>
     * @param DiffRegionFwInsName <p>跨地域防火墙实例名称。</p>
     */
    public void setDiffRegionFwInsName(String DiffRegionFwInsName) {
        this.DiffRegionFwInsName = DiffRegionFwInsName;
    }

    /**
     * Get <p>跨地域防火墙实例峰值流量，单位为 bps。</p><p>单位：bps</p> 
     * @return DiffRegionMaxFlowBps <p>跨地域防火墙实例峰值流量，单位为 bps。</p><p>单位：bps</p>
     */
    public Long getDiffRegionMaxFlowBps() {
        return this.DiffRegionMaxFlowBps;
    }

    /**
     * Set <p>跨地域防火墙实例峰值流量，单位为 bps。</p><p>单位：bps</p>
     * @param DiffRegionMaxFlowBps <p>跨地域防火墙实例峰值流量，单位为 bps。</p><p>单位：bps</p>
     */
    public void setDiffRegionMaxFlowBps(Long DiffRegionMaxFlowBps) {
        this.DiffRegionMaxFlowBps = DiffRegionMaxFlowBps;
    }

    /**
     * Get <p>防火墙实例组 ID。</p> 
     * @return FwGroupId <p>防火墙实例组 ID。</p>
     */
    public String getFwGroupId() {
        return this.FwGroupId;
    }

    /**
     * Set <p>防火墙实例组 ID。</p>
     * @param FwGroupId <p>防火墙实例组 ID。</p>
     */
    public void setFwGroupId(String FwGroupId) {
        this.FwGroupId = FwGroupId;
    }

    /**
     * Get <p>防火墙实例组名称。</p> 
     * @return FwGroupName <p>防火墙实例组名称。</p>
     */
    public String getFwGroupName() {
        return this.FwGroupName;
    }

    /**
     * Set <p>防火墙实例组名称。</p>
     * @param FwGroupName <p>防火墙实例组名称。</p>
     */
    public void setFwGroupName(String FwGroupName) {
        this.FwGroupName = FwGroupName;
    }

    /**
     * Get <p>防火墙实例组峰值流量，单位为 bps。</p><p>单位：bps</p> 
     * @return FwGroupMaxFlowBps <p>防火墙实例组峰值流量，单位为 bps。</p><p>单位：bps</p>
     */
    public Long getFwGroupMaxFlowBps() {
        return this.FwGroupMaxFlowBps;
    }

    /**
     * Set <p>防火墙实例组峰值流量，单位为 bps。</p><p>单位：bps</p>
     * @param FwGroupMaxFlowBps <p>防火墙实例组峰值流量，单位为 bps。</p><p>单位：bps</p>
     */
    public void setFwGroupMaxFlowBps(Long FwGroupMaxFlowBps) {
        this.FwGroupMaxFlowBps = FwGroupMaxFlowBps;
    }

    /**
     * Get <p>防火墙实例 ID。</p> 
     * @return FwInsId <p>防火墙实例 ID。</p>
     */
    public String getFwInsId() {
        return this.FwInsId;
    }

    /**
     * Set <p>防火墙实例 ID。</p>
     * @param FwInsId <p>防火墙实例 ID。</p>
     */
    public void setFwInsId(String FwInsId) {
        this.FwInsId = FwInsId;
    }

    /**
     * Get <p>防火墙实例名称。</p> 
     * @return FwInsName <p>防火墙实例名称。</p>
     */
    public String getFwInsName() {
        return this.FwInsName;
    }

    /**
     * Set <p>防火墙实例名称。</p>
     * @param FwInsName <p>防火墙实例名称。</p>
     */
    public void setFwInsName(String FwInsName) {
        this.FwInsName = FwInsName;
    }

    /**
     * Get <p>防火墙实例峰值流量，单位为 bps。</p><p>单位：bps</p> 
     * @return FwInsMaxFlowBps <p>防火墙实例峰值流量，单位为 bps。</p><p>单位：bps</p>
     */
    public Long getFwInsMaxFlowBps() {
        return this.FwInsMaxFlowBps;
    }

    /**
     * Set <p>防火墙实例峰值流量，单位为 bps。</p><p>单位：bps</p>
     * @param FwInsMaxFlowBps <p>防火墙实例峰值流量，单位为 bps。</p><p>单位：bps</p>
     */
    public void setFwInsMaxFlowBps(Long FwInsMaxFlowBps) {
        this.FwInsMaxFlowBps = FwInsMaxFlowBps;
    }

    /**
     * Get <p>集群 VPC 峰值流量，单位为 bps。</p><p>单位：bps</p> 
     * @return ClusterVpcMaxFlowBps <p>集群 VPC 峰值流量，单位为 bps。</p><p>单位：bps</p>
     */
    public Long getClusterVpcMaxFlowBps() {
        return this.ClusterVpcMaxFlowBps;
    }

    /**
     * Set <p>集群 VPC 峰值流量，单位为 bps。</p><p>单位：bps</p>
     * @param ClusterVpcMaxFlowBps <p>集群 VPC 峰值流量，单位为 bps。</p><p>单位：bps</p>
     */
    public void setClusterVpcMaxFlowBps(Long ClusterVpcMaxFlowBps) {
        this.ClusterVpcMaxFlowBps = ClusterVpcMaxFlowBps;
    }

    public OverviewEastWestDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OverviewEastWestDetail(OverviewEastWestDetail source) {
        if (source.TotalMbps != null) {
            this.TotalMbps = new Long(source.TotalMbps);
        }
        if (source.UsedBps != null) {
            this.UsedBps = new Long(source.UsedBps);
        }
        if (source.UsagePercent != null) {
            this.UsagePercent = new Float(source.UsagePercent);
        }
        if (source.AllocatedBandwidthUsedMbps != null) {
            this.AllocatedBandwidthUsedMbps = new Long(source.AllocatedBandwidthUsedMbps);
        }
        if (source.CanUsedBandwidthMbps != null) {
            this.CanUsedBandwidthMbps = new Long(source.CanUsedBandwidthMbps);
        }
        if (source.ClusterModeWidthMbps != null) {
            this.ClusterModeWidthMbps = new Long(source.ClusterModeWidthMbps);
        }
        if (source.MasterSlaveModeWidthMbps != null) {
            this.MasterSlaveModeWidthMbps = new Long(source.MasterSlaveModeWidthMbps);
        }
        if (source.SameRegionFwInsId != null) {
            this.SameRegionFwInsId = new String(source.SameRegionFwInsId);
        }
        if (source.SameRegionFwInsName != null) {
            this.SameRegionFwInsName = new String(source.SameRegionFwInsName);
        }
        if (source.SameRegionMaxFlowBps != null) {
            this.SameRegionMaxFlowBps = new Long(source.SameRegionMaxFlowBps);
        }
        if (source.DiffRegionFwInsId != null) {
            this.DiffRegionFwInsId = new String(source.DiffRegionFwInsId);
        }
        if (source.DiffRegionFwInsName != null) {
            this.DiffRegionFwInsName = new String(source.DiffRegionFwInsName);
        }
        if (source.DiffRegionMaxFlowBps != null) {
            this.DiffRegionMaxFlowBps = new Long(source.DiffRegionMaxFlowBps);
        }
        if (source.FwGroupId != null) {
            this.FwGroupId = new String(source.FwGroupId);
        }
        if (source.FwGroupName != null) {
            this.FwGroupName = new String(source.FwGroupName);
        }
        if (source.FwGroupMaxFlowBps != null) {
            this.FwGroupMaxFlowBps = new Long(source.FwGroupMaxFlowBps);
        }
        if (source.FwInsId != null) {
            this.FwInsId = new String(source.FwInsId);
        }
        if (source.FwInsName != null) {
            this.FwInsName = new String(source.FwInsName);
        }
        if (source.FwInsMaxFlowBps != null) {
            this.FwInsMaxFlowBps = new Long(source.FwInsMaxFlowBps);
        }
        if (source.ClusterVpcMaxFlowBps != null) {
            this.ClusterVpcMaxFlowBps = new Long(source.ClusterVpcMaxFlowBps);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalMbps", this.TotalMbps);
        this.setParamSimple(map, prefix + "UsedBps", this.UsedBps);
        this.setParamSimple(map, prefix + "UsagePercent", this.UsagePercent);
        this.setParamSimple(map, prefix + "AllocatedBandwidthUsedMbps", this.AllocatedBandwidthUsedMbps);
        this.setParamSimple(map, prefix + "CanUsedBandwidthMbps", this.CanUsedBandwidthMbps);
        this.setParamSimple(map, prefix + "ClusterModeWidthMbps", this.ClusterModeWidthMbps);
        this.setParamSimple(map, prefix + "MasterSlaveModeWidthMbps", this.MasterSlaveModeWidthMbps);
        this.setParamSimple(map, prefix + "SameRegionFwInsId", this.SameRegionFwInsId);
        this.setParamSimple(map, prefix + "SameRegionFwInsName", this.SameRegionFwInsName);
        this.setParamSimple(map, prefix + "SameRegionMaxFlowBps", this.SameRegionMaxFlowBps);
        this.setParamSimple(map, prefix + "DiffRegionFwInsId", this.DiffRegionFwInsId);
        this.setParamSimple(map, prefix + "DiffRegionFwInsName", this.DiffRegionFwInsName);
        this.setParamSimple(map, prefix + "DiffRegionMaxFlowBps", this.DiffRegionMaxFlowBps);
        this.setParamSimple(map, prefix + "FwGroupId", this.FwGroupId);
        this.setParamSimple(map, prefix + "FwGroupName", this.FwGroupName);
        this.setParamSimple(map, prefix + "FwGroupMaxFlowBps", this.FwGroupMaxFlowBps);
        this.setParamSimple(map, prefix + "FwInsId", this.FwInsId);
        this.setParamSimple(map, prefix + "FwInsName", this.FwInsName);
        this.setParamSimple(map, prefix + "FwInsMaxFlowBps", this.FwInsMaxFlowBps);
        this.setParamSimple(map, prefix + "ClusterVpcMaxFlowBps", this.ClusterVpcMaxFlowBps);

    }
}

