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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterSummaryResponse extends AbstractModel {

    /**
    * <p>集群总数</p>
    */
    @SerializedName("TotalClusterCount")
    @Expose
    private Long TotalClusterCount;

    /**
    * <p>告警集群总数</p>
    */
    @SerializedName("AlarmClusterCount")
    @Expose
    private Long AlarmClusterCount;

    /**
    * <p>风险集群总数</p>
    */
    @SerializedName("RiskClusterCount")
    @Expose
    private Long RiskClusterCount;

    /**
    * <p>节点总数</p>
    */
    @SerializedName("TotalNodeCount")
    @Expose
    private Long TotalNodeCount;

    /**
    * <p>总核数</p>
    */
    @SerializedName("TotalCoreCount")
    @Expose
    private Long TotalCoreCount;

    /**
    * <p>告警事件总数</p>
    */
    @SerializedName("AlarmEventCount")
    @Expose
    private Long AlarmEventCount;

    /**
    * <p>严重告警事件数</p>
    */
    @SerializedName("CriticalAlarmEventCount")
    @Expose
    private Long CriticalAlarmEventCount;

    /**
    * <p>高危告警事件数</p>
    */
    @SerializedName("HighAlarmEventCount")
    @Expose
    private Long HighAlarmEventCount;

    /**
    * <p>中危告警事件数</p>
    */
    @SerializedName("MiddleAlarmEventCount")
    @Expose
    private Long MiddleAlarmEventCount;

    /**
    * <p>低危告警事件数</p>
    */
    @SerializedName("LowAlarmEventCount")
    @Expose
    private Long LowAlarmEventCount;

    /**
    * <p>风险事件总数</p>
    */
    @SerializedName("RiskEventCount")
    @Expose
    private Long RiskEventCount;

    /**
    * <p>严重风险事件数</p>
    */
    @SerializedName("CriticalRiskEventCount")
    @Expose
    private Long CriticalRiskEventCount;

    /**
    * <p>高危风险事件数</p>
    */
    @SerializedName("HighRiskEventCount")
    @Expose
    private Long HighRiskEventCount;

    /**
    * <p>中危风险事件个数</p>
    */
    @SerializedName("MiddleRiskEventCount")
    @Expose
    private Long MiddleRiskEventCount;

    /**
    * <p>低危风险事件个数</p>
    */
    @SerializedName("LowRiskEventCount")
    @Expose
    private Long LowRiskEventCount;

    /**
    * <p>已使用核数额度</p>
    */
    @SerializedName("UsedCoreQuota")
    @Expose
    private Long UsedCoreQuota;

    /**
    * <p>已购买核数额度</p>
    */
    @SerializedName("PurchasedCoreQuota")
    @Expose
    private Long PurchasedCoreQuota;

    /**
    * <p>弹性计费核数</p>
    */
    @SerializedName("ElasticCoreQuota")
    @Expose
    private Long ElasticCoreQuota;

    /**
    * <p>集群未防护核数</p>
    */
    @SerializedName("UnprotectedCoreCount")
    @Expose
    private Long UnprotectedCoreCount;

    /**
    * <p>集群已防护核数</p>
    */
    @SerializedName("ProtectedCoreCount")
    @Expose
    private Long ProtectedCoreCount;

    /**
    * <p>未防护集群数</p>
    */
    @SerializedName("UnprotectedClusterCount")
    @Expose
    private Long UnprotectedClusterCount;

    /**
    * <p>已防护集群数</p>
    */
    @SerializedName("ProtectedClusterCount")
    @Expose
    private Long ProtectedClusterCount;

    /**
    * <p>腾讯云TKE集群数量</p>
    */
    @SerializedName("TkeClusterCount")
    @Expose
    private Long TkeClusterCount;

    /**
    * <p>自建集群数量</p>
    */
    @SerializedName("SelfBuiltClusterCount")
    @Expose
    private Long SelfBuiltClusterCount;

    /**
    * <p>严重告警集群数量</p>
    */
    @SerializedName("CriticalAlarmClusterCount")
    @Expose
    private Long CriticalAlarmClusterCount;

    /**
    * <p>高危告警集群数量</p>
    */
    @SerializedName("HighAlarmClusterCount")
    @Expose
    private Long HighAlarmClusterCount;

    /**
    * <p>严重风险集群数</p>
    */
    @SerializedName("CriticalRiskClusterCount")
    @Expose
    private Long CriticalRiskClusterCount;

    /**
    * <p>高危风险集群数量</p>
    */
    @SerializedName("HighRiskClusterCount")
    @Expose
    private Long HighRiskClusterCount;

    /**
    * <p>未绑定旗舰版节点数量</p>
    */
    @SerializedName("UnboundUltimateNodeCount")
    @Expose
    private Long UnboundUltimateNodeCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>集群总数</p> 
     * @return TotalClusterCount <p>集群总数</p>
     */
    public Long getTotalClusterCount() {
        return this.TotalClusterCount;
    }

    /**
     * Set <p>集群总数</p>
     * @param TotalClusterCount <p>集群总数</p>
     */
    public void setTotalClusterCount(Long TotalClusterCount) {
        this.TotalClusterCount = TotalClusterCount;
    }

    /**
     * Get <p>告警集群总数</p> 
     * @return AlarmClusterCount <p>告警集群总数</p>
     * @deprecated
     */
    @Deprecated
    public Long getAlarmClusterCount() {
        return this.AlarmClusterCount;
    }

    /**
     * Set <p>告警集群总数</p>
     * @param AlarmClusterCount <p>告警集群总数</p>
     * @deprecated
     */
    @Deprecated
    public void setAlarmClusterCount(Long AlarmClusterCount) {
        this.AlarmClusterCount = AlarmClusterCount;
    }

    /**
     * Get <p>风险集群总数</p> 
     * @return RiskClusterCount <p>风险集群总数</p>
     * @deprecated
     */
    @Deprecated
    public Long getRiskClusterCount() {
        return this.RiskClusterCount;
    }

    /**
     * Set <p>风险集群总数</p>
     * @param RiskClusterCount <p>风险集群总数</p>
     * @deprecated
     */
    @Deprecated
    public void setRiskClusterCount(Long RiskClusterCount) {
        this.RiskClusterCount = RiskClusterCount;
    }

    /**
     * Get <p>节点总数</p> 
     * @return TotalNodeCount <p>节点总数</p>
     */
    public Long getTotalNodeCount() {
        return this.TotalNodeCount;
    }

    /**
     * Set <p>节点总数</p>
     * @param TotalNodeCount <p>节点总数</p>
     */
    public void setTotalNodeCount(Long TotalNodeCount) {
        this.TotalNodeCount = TotalNodeCount;
    }

    /**
     * Get <p>总核数</p> 
     * @return TotalCoreCount <p>总核数</p>
     */
    public Long getTotalCoreCount() {
        return this.TotalCoreCount;
    }

    /**
     * Set <p>总核数</p>
     * @param TotalCoreCount <p>总核数</p>
     */
    public void setTotalCoreCount(Long TotalCoreCount) {
        this.TotalCoreCount = TotalCoreCount;
    }

    /**
     * Get <p>告警事件总数</p> 
     * @return AlarmEventCount <p>告警事件总数</p>
     * @deprecated
     */
    @Deprecated
    public Long getAlarmEventCount() {
        return this.AlarmEventCount;
    }

    /**
     * Set <p>告警事件总数</p>
     * @param AlarmEventCount <p>告警事件总数</p>
     * @deprecated
     */
    @Deprecated
    public void setAlarmEventCount(Long AlarmEventCount) {
        this.AlarmEventCount = AlarmEventCount;
    }

    /**
     * Get <p>严重告警事件数</p> 
     * @return CriticalAlarmEventCount <p>严重告警事件数</p>
     * @deprecated
     */
    @Deprecated
    public Long getCriticalAlarmEventCount() {
        return this.CriticalAlarmEventCount;
    }

    /**
     * Set <p>严重告警事件数</p>
     * @param CriticalAlarmEventCount <p>严重告警事件数</p>
     * @deprecated
     */
    @Deprecated
    public void setCriticalAlarmEventCount(Long CriticalAlarmEventCount) {
        this.CriticalAlarmEventCount = CriticalAlarmEventCount;
    }

    /**
     * Get <p>高危告警事件数</p> 
     * @return HighAlarmEventCount <p>高危告警事件数</p>
     * @deprecated
     */
    @Deprecated
    public Long getHighAlarmEventCount() {
        return this.HighAlarmEventCount;
    }

    /**
     * Set <p>高危告警事件数</p>
     * @param HighAlarmEventCount <p>高危告警事件数</p>
     * @deprecated
     */
    @Deprecated
    public void setHighAlarmEventCount(Long HighAlarmEventCount) {
        this.HighAlarmEventCount = HighAlarmEventCount;
    }

    /**
     * Get <p>中危告警事件数</p> 
     * @return MiddleAlarmEventCount <p>中危告警事件数</p>
     * @deprecated
     */
    @Deprecated
    public Long getMiddleAlarmEventCount() {
        return this.MiddleAlarmEventCount;
    }

    /**
     * Set <p>中危告警事件数</p>
     * @param MiddleAlarmEventCount <p>中危告警事件数</p>
     * @deprecated
     */
    @Deprecated
    public void setMiddleAlarmEventCount(Long MiddleAlarmEventCount) {
        this.MiddleAlarmEventCount = MiddleAlarmEventCount;
    }

    /**
     * Get <p>低危告警事件数</p> 
     * @return LowAlarmEventCount <p>低危告警事件数</p>
     * @deprecated
     */
    @Deprecated
    public Long getLowAlarmEventCount() {
        return this.LowAlarmEventCount;
    }

    /**
     * Set <p>低危告警事件数</p>
     * @param LowAlarmEventCount <p>低危告警事件数</p>
     * @deprecated
     */
    @Deprecated
    public void setLowAlarmEventCount(Long LowAlarmEventCount) {
        this.LowAlarmEventCount = LowAlarmEventCount;
    }

    /**
     * Get <p>风险事件总数</p> 
     * @return RiskEventCount <p>风险事件总数</p>
     * @deprecated
     */
    @Deprecated
    public Long getRiskEventCount() {
        return this.RiskEventCount;
    }

    /**
     * Set <p>风险事件总数</p>
     * @param RiskEventCount <p>风险事件总数</p>
     * @deprecated
     */
    @Deprecated
    public void setRiskEventCount(Long RiskEventCount) {
        this.RiskEventCount = RiskEventCount;
    }

    /**
     * Get <p>严重风险事件数</p> 
     * @return CriticalRiskEventCount <p>严重风险事件数</p>
     * @deprecated
     */
    @Deprecated
    public Long getCriticalRiskEventCount() {
        return this.CriticalRiskEventCount;
    }

    /**
     * Set <p>严重风险事件数</p>
     * @param CriticalRiskEventCount <p>严重风险事件数</p>
     * @deprecated
     */
    @Deprecated
    public void setCriticalRiskEventCount(Long CriticalRiskEventCount) {
        this.CriticalRiskEventCount = CriticalRiskEventCount;
    }

    /**
     * Get <p>高危风险事件数</p> 
     * @return HighRiskEventCount <p>高危风险事件数</p>
     * @deprecated
     */
    @Deprecated
    public Long getHighRiskEventCount() {
        return this.HighRiskEventCount;
    }

    /**
     * Set <p>高危风险事件数</p>
     * @param HighRiskEventCount <p>高危风险事件数</p>
     * @deprecated
     */
    @Deprecated
    public void setHighRiskEventCount(Long HighRiskEventCount) {
        this.HighRiskEventCount = HighRiskEventCount;
    }

    /**
     * Get <p>中危风险事件个数</p> 
     * @return MiddleRiskEventCount <p>中危风险事件个数</p>
     * @deprecated
     */
    @Deprecated
    public Long getMiddleRiskEventCount() {
        return this.MiddleRiskEventCount;
    }

    /**
     * Set <p>中危风险事件个数</p>
     * @param MiddleRiskEventCount <p>中危风险事件个数</p>
     * @deprecated
     */
    @Deprecated
    public void setMiddleRiskEventCount(Long MiddleRiskEventCount) {
        this.MiddleRiskEventCount = MiddleRiskEventCount;
    }

    /**
     * Get <p>低危风险事件个数</p> 
     * @return LowRiskEventCount <p>低危风险事件个数</p>
     * @deprecated
     */
    @Deprecated
    public Long getLowRiskEventCount() {
        return this.LowRiskEventCount;
    }

    /**
     * Set <p>低危风险事件个数</p>
     * @param LowRiskEventCount <p>低危风险事件个数</p>
     * @deprecated
     */
    @Deprecated
    public void setLowRiskEventCount(Long LowRiskEventCount) {
        this.LowRiskEventCount = LowRiskEventCount;
    }

    /**
     * Get <p>已使用核数额度</p> 
     * @return UsedCoreQuota <p>已使用核数额度</p>
     */
    public Long getUsedCoreQuota() {
        return this.UsedCoreQuota;
    }

    /**
     * Set <p>已使用核数额度</p>
     * @param UsedCoreQuota <p>已使用核数额度</p>
     */
    public void setUsedCoreQuota(Long UsedCoreQuota) {
        this.UsedCoreQuota = UsedCoreQuota;
    }

    /**
     * Get <p>已购买核数额度</p> 
     * @return PurchasedCoreQuota <p>已购买核数额度</p>
     */
    public Long getPurchasedCoreQuota() {
        return this.PurchasedCoreQuota;
    }

    /**
     * Set <p>已购买核数额度</p>
     * @param PurchasedCoreQuota <p>已购买核数额度</p>
     */
    public void setPurchasedCoreQuota(Long PurchasedCoreQuota) {
        this.PurchasedCoreQuota = PurchasedCoreQuota;
    }

    /**
     * Get <p>弹性计费核数</p> 
     * @return ElasticCoreQuota <p>弹性计费核数</p>
     */
    public Long getElasticCoreQuota() {
        return this.ElasticCoreQuota;
    }

    /**
     * Set <p>弹性计费核数</p>
     * @param ElasticCoreQuota <p>弹性计费核数</p>
     */
    public void setElasticCoreQuota(Long ElasticCoreQuota) {
        this.ElasticCoreQuota = ElasticCoreQuota;
    }

    /**
     * Get <p>集群未防护核数</p> 
     * @return UnprotectedCoreCount <p>集群未防护核数</p>
     */
    public Long getUnprotectedCoreCount() {
        return this.UnprotectedCoreCount;
    }

    /**
     * Set <p>集群未防护核数</p>
     * @param UnprotectedCoreCount <p>集群未防护核数</p>
     */
    public void setUnprotectedCoreCount(Long UnprotectedCoreCount) {
        this.UnprotectedCoreCount = UnprotectedCoreCount;
    }

    /**
     * Get <p>集群已防护核数</p> 
     * @return ProtectedCoreCount <p>集群已防护核数</p>
     */
    public Long getProtectedCoreCount() {
        return this.ProtectedCoreCount;
    }

    /**
     * Set <p>集群已防护核数</p>
     * @param ProtectedCoreCount <p>集群已防护核数</p>
     */
    public void setProtectedCoreCount(Long ProtectedCoreCount) {
        this.ProtectedCoreCount = ProtectedCoreCount;
    }

    /**
     * Get <p>未防护集群数</p> 
     * @return UnprotectedClusterCount <p>未防护集群数</p>
     */
    public Long getUnprotectedClusterCount() {
        return this.UnprotectedClusterCount;
    }

    /**
     * Set <p>未防护集群数</p>
     * @param UnprotectedClusterCount <p>未防护集群数</p>
     */
    public void setUnprotectedClusterCount(Long UnprotectedClusterCount) {
        this.UnprotectedClusterCount = UnprotectedClusterCount;
    }

    /**
     * Get <p>已防护集群数</p> 
     * @return ProtectedClusterCount <p>已防护集群数</p>
     */
    public Long getProtectedClusterCount() {
        return this.ProtectedClusterCount;
    }

    /**
     * Set <p>已防护集群数</p>
     * @param ProtectedClusterCount <p>已防护集群数</p>
     */
    public void setProtectedClusterCount(Long ProtectedClusterCount) {
        this.ProtectedClusterCount = ProtectedClusterCount;
    }

    /**
     * Get <p>腾讯云TKE集群数量</p> 
     * @return TkeClusterCount <p>腾讯云TKE集群数量</p>
     */
    public Long getTkeClusterCount() {
        return this.TkeClusterCount;
    }

    /**
     * Set <p>腾讯云TKE集群数量</p>
     * @param TkeClusterCount <p>腾讯云TKE集群数量</p>
     */
    public void setTkeClusterCount(Long TkeClusterCount) {
        this.TkeClusterCount = TkeClusterCount;
    }

    /**
     * Get <p>自建集群数量</p> 
     * @return SelfBuiltClusterCount <p>自建集群数量</p>
     */
    public Long getSelfBuiltClusterCount() {
        return this.SelfBuiltClusterCount;
    }

    /**
     * Set <p>自建集群数量</p>
     * @param SelfBuiltClusterCount <p>自建集群数量</p>
     */
    public void setSelfBuiltClusterCount(Long SelfBuiltClusterCount) {
        this.SelfBuiltClusterCount = SelfBuiltClusterCount;
    }

    /**
     * Get <p>严重告警集群数量</p> 
     * @return CriticalAlarmClusterCount <p>严重告警集群数量</p>
     * @deprecated
     */
    @Deprecated
    public Long getCriticalAlarmClusterCount() {
        return this.CriticalAlarmClusterCount;
    }

    /**
     * Set <p>严重告警集群数量</p>
     * @param CriticalAlarmClusterCount <p>严重告警集群数量</p>
     * @deprecated
     */
    @Deprecated
    public void setCriticalAlarmClusterCount(Long CriticalAlarmClusterCount) {
        this.CriticalAlarmClusterCount = CriticalAlarmClusterCount;
    }

    /**
     * Get <p>高危告警集群数量</p> 
     * @return HighAlarmClusterCount <p>高危告警集群数量</p>
     * @deprecated
     */
    @Deprecated
    public Long getHighAlarmClusterCount() {
        return this.HighAlarmClusterCount;
    }

    /**
     * Set <p>高危告警集群数量</p>
     * @param HighAlarmClusterCount <p>高危告警集群数量</p>
     * @deprecated
     */
    @Deprecated
    public void setHighAlarmClusterCount(Long HighAlarmClusterCount) {
        this.HighAlarmClusterCount = HighAlarmClusterCount;
    }

    /**
     * Get <p>严重风险集群数</p> 
     * @return CriticalRiskClusterCount <p>严重风险集群数</p>
     * @deprecated
     */
    @Deprecated
    public Long getCriticalRiskClusterCount() {
        return this.CriticalRiskClusterCount;
    }

    /**
     * Set <p>严重风险集群数</p>
     * @param CriticalRiskClusterCount <p>严重风险集群数</p>
     * @deprecated
     */
    @Deprecated
    public void setCriticalRiskClusterCount(Long CriticalRiskClusterCount) {
        this.CriticalRiskClusterCount = CriticalRiskClusterCount;
    }

    /**
     * Get <p>高危风险集群数量</p> 
     * @return HighRiskClusterCount <p>高危风险集群数量</p>
     * @deprecated
     */
    @Deprecated
    public Long getHighRiskClusterCount() {
        return this.HighRiskClusterCount;
    }

    /**
     * Set <p>高危风险集群数量</p>
     * @param HighRiskClusterCount <p>高危风险集群数量</p>
     * @deprecated
     */
    @Deprecated
    public void setHighRiskClusterCount(Long HighRiskClusterCount) {
        this.HighRiskClusterCount = HighRiskClusterCount;
    }

    /**
     * Get <p>未绑定旗舰版节点数量</p> 
     * @return UnboundUltimateNodeCount <p>未绑定旗舰版节点数量</p>
     */
    public Long getUnboundUltimateNodeCount() {
        return this.UnboundUltimateNodeCount;
    }

    /**
     * Set <p>未绑定旗舰版节点数量</p>
     * @param UnboundUltimateNodeCount <p>未绑定旗舰版节点数量</p>
     */
    public void setUnboundUltimateNodeCount(Long UnboundUltimateNodeCount) {
        this.UnboundUltimateNodeCount = UnboundUltimateNodeCount;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeClusterSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterSummaryResponse(DescribeClusterSummaryResponse source) {
        if (source.TotalClusterCount != null) {
            this.TotalClusterCount = new Long(source.TotalClusterCount);
        }
        if (source.AlarmClusterCount != null) {
            this.AlarmClusterCount = new Long(source.AlarmClusterCount);
        }
        if (source.RiskClusterCount != null) {
            this.RiskClusterCount = new Long(source.RiskClusterCount);
        }
        if (source.TotalNodeCount != null) {
            this.TotalNodeCount = new Long(source.TotalNodeCount);
        }
        if (source.TotalCoreCount != null) {
            this.TotalCoreCount = new Long(source.TotalCoreCount);
        }
        if (source.AlarmEventCount != null) {
            this.AlarmEventCount = new Long(source.AlarmEventCount);
        }
        if (source.CriticalAlarmEventCount != null) {
            this.CriticalAlarmEventCount = new Long(source.CriticalAlarmEventCount);
        }
        if (source.HighAlarmEventCount != null) {
            this.HighAlarmEventCount = new Long(source.HighAlarmEventCount);
        }
        if (source.MiddleAlarmEventCount != null) {
            this.MiddleAlarmEventCount = new Long(source.MiddleAlarmEventCount);
        }
        if (source.LowAlarmEventCount != null) {
            this.LowAlarmEventCount = new Long(source.LowAlarmEventCount);
        }
        if (source.RiskEventCount != null) {
            this.RiskEventCount = new Long(source.RiskEventCount);
        }
        if (source.CriticalRiskEventCount != null) {
            this.CriticalRiskEventCount = new Long(source.CriticalRiskEventCount);
        }
        if (source.HighRiskEventCount != null) {
            this.HighRiskEventCount = new Long(source.HighRiskEventCount);
        }
        if (source.MiddleRiskEventCount != null) {
            this.MiddleRiskEventCount = new Long(source.MiddleRiskEventCount);
        }
        if (source.LowRiskEventCount != null) {
            this.LowRiskEventCount = new Long(source.LowRiskEventCount);
        }
        if (source.UsedCoreQuota != null) {
            this.UsedCoreQuota = new Long(source.UsedCoreQuota);
        }
        if (source.PurchasedCoreQuota != null) {
            this.PurchasedCoreQuota = new Long(source.PurchasedCoreQuota);
        }
        if (source.ElasticCoreQuota != null) {
            this.ElasticCoreQuota = new Long(source.ElasticCoreQuota);
        }
        if (source.UnprotectedCoreCount != null) {
            this.UnprotectedCoreCount = new Long(source.UnprotectedCoreCount);
        }
        if (source.ProtectedCoreCount != null) {
            this.ProtectedCoreCount = new Long(source.ProtectedCoreCount);
        }
        if (source.UnprotectedClusterCount != null) {
            this.UnprotectedClusterCount = new Long(source.UnprotectedClusterCount);
        }
        if (source.ProtectedClusterCount != null) {
            this.ProtectedClusterCount = new Long(source.ProtectedClusterCount);
        }
        if (source.TkeClusterCount != null) {
            this.TkeClusterCount = new Long(source.TkeClusterCount);
        }
        if (source.SelfBuiltClusterCount != null) {
            this.SelfBuiltClusterCount = new Long(source.SelfBuiltClusterCount);
        }
        if (source.CriticalAlarmClusterCount != null) {
            this.CriticalAlarmClusterCount = new Long(source.CriticalAlarmClusterCount);
        }
        if (source.HighAlarmClusterCount != null) {
            this.HighAlarmClusterCount = new Long(source.HighAlarmClusterCount);
        }
        if (source.CriticalRiskClusterCount != null) {
            this.CriticalRiskClusterCount = new Long(source.CriticalRiskClusterCount);
        }
        if (source.HighRiskClusterCount != null) {
            this.HighRiskClusterCount = new Long(source.HighRiskClusterCount);
        }
        if (source.UnboundUltimateNodeCount != null) {
            this.UnboundUltimateNodeCount = new Long(source.UnboundUltimateNodeCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalClusterCount", this.TotalClusterCount);
        this.setParamSimple(map, prefix + "AlarmClusterCount", this.AlarmClusterCount);
        this.setParamSimple(map, prefix + "RiskClusterCount", this.RiskClusterCount);
        this.setParamSimple(map, prefix + "TotalNodeCount", this.TotalNodeCount);
        this.setParamSimple(map, prefix + "TotalCoreCount", this.TotalCoreCount);
        this.setParamSimple(map, prefix + "AlarmEventCount", this.AlarmEventCount);
        this.setParamSimple(map, prefix + "CriticalAlarmEventCount", this.CriticalAlarmEventCount);
        this.setParamSimple(map, prefix + "HighAlarmEventCount", this.HighAlarmEventCount);
        this.setParamSimple(map, prefix + "MiddleAlarmEventCount", this.MiddleAlarmEventCount);
        this.setParamSimple(map, prefix + "LowAlarmEventCount", this.LowAlarmEventCount);
        this.setParamSimple(map, prefix + "RiskEventCount", this.RiskEventCount);
        this.setParamSimple(map, prefix + "CriticalRiskEventCount", this.CriticalRiskEventCount);
        this.setParamSimple(map, prefix + "HighRiskEventCount", this.HighRiskEventCount);
        this.setParamSimple(map, prefix + "MiddleRiskEventCount", this.MiddleRiskEventCount);
        this.setParamSimple(map, prefix + "LowRiskEventCount", this.LowRiskEventCount);
        this.setParamSimple(map, prefix + "UsedCoreQuota", this.UsedCoreQuota);
        this.setParamSimple(map, prefix + "PurchasedCoreQuota", this.PurchasedCoreQuota);
        this.setParamSimple(map, prefix + "ElasticCoreQuota", this.ElasticCoreQuota);
        this.setParamSimple(map, prefix + "UnprotectedCoreCount", this.UnprotectedCoreCount);
        this.setParamSimple(map, prefix + "ProtectedCoreCount", this.ProtectedCoreCount);
        this.setParamSimple(map, prefix + "UnprotectedClusterCount", this.UnprotectedClusterCount);
        this.setParamSimple(map, prefix + "ProtectedClusterCount", this.ProtectedClusterCount);
        this.setParamSimple(map, prefix + "TkeClusterCount", this.TkeClusterCount);
        this.setParamSimple(map, prefix + "SelfBuiltClusterCount", this.SelfBuiltClusterCount);
        this.setParamSimple(map, prefix + "CriticalAlarmClusterCount", this.CriticalAlarmClusterCount);
        this.setParamSimple(map, prefix + "HighAlarmClusterCount", this.HighAlarmClusterCount);
        this.setParamSimple(map, prefix + "CriticalRiskClusterCount", this.CriticalRiskClusterCount);
        this.setParamSimple(map, prefix + "HighRiskClusterCount", this.HighRiskClusterCount);
        this.setParamSimple(map, prefix + "UnboundUltimateNodeCount", this.UnboundUltimateNodeCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

