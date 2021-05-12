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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyReadOnlyGroupConfigRequest extends AbstractModel{

    /**
    * 只读组ID
    */
    @SerializedName("ReadOnlyGroupId")
    @Expose
    private String ReadOnlyGroupId;

    /**
    * 只读组名称
    */
    @SerializedName("ReadOnlyGroupName")
    @Expose
    private String ReadOnlyGroupName;

    /**
    * 延迟时间配置开关：0关、1开
    */
    @SerializedName("ReplayLagEliminate")
    @Expose
    private Long ReplayLagEliminate;

    /**
    * 延迟日志大小配置开关：0关、1开
    */
    @SerializedName("ReplayLatencyEliminate")
    @Expose
    private Long ReplayLatencyEliminate;

    /**
    * 延迟日志大小阈值，单位MB
    */
    @SerializedName("MaxReplayLatency")
    @Expose
    private Long MaxReplayLatency;

    /**
    * 延迟时间大小阈值，单位ms
    */
    @SerializedName("MaxReplayLag")
    @Expose
    private Long MaxReplayLag;

    /**
    * 自动负载均衡开关：0关、1开
    */
    @SerializedName("Rebalance")
    @Expose
    private Long Rebalance;

    /**
    * 延迟剔除最小保留实例数
    */
    @SerializedName("MinDelayEliminateReserve")
    @Expose
    private Long MinDelayEliminateReserve;

    /**
     * Get 只读组ID 
     * @return ReadOnlyGroupId 只读组ID
     */
    public String getReadOnlyGroupId() {
        return this.ReadOnlyGroupId;
    }

    /**
     * Set 只读组ID
     * @param ReadOnlyGroupId 只读组ID
     */
    public void setReadOnlyGroupId(String ReadOnlyGroupId) {
        this.ReadOnlyGroupId = ReadOnlyGroupId;
    }

    /**
     * Get 只读组名称 
     * @return ReadOnlyGroupName 只读组名称
     */
    public String getReadOnlyGroupName() {
        return this.ReadOnlyGroupName;
    }

    /**
     * Set 只读组名称
     * @param ReadOnlyGroupName 只读组名称
     */
    public void setReadOnlyGroupName(String ReadOnlyGroupName) {
        this.ReadOnlyGroupName = ReadOnlyGroupName;
    }

    /**
     * Get 延迟时间配置开关：0关、1开 
     * @return ReplayLagEliminate 延迟时间配置开关：0关、1开
     */
    public Long getReplayLagEliminate() {
        return this.ReplayLagEliminate;
    }

    /**
     * Set 延迟时间配置开关：0关、1开
     * @param ReplayLagEliminate 延迟时间配置开关：0关、1开
     */
    public void setReplayLagEliminate(Long ReplayLagEliminate) {
        this.ReplayLagEliminate = ReplayLagEliminate;
    }

    /**
     * Get 延迟日志大小配置开关：0关、1开 
     * @return ReplayLatencyEliminate 延迟日志大小配置开关：0关、1开
     */
    public Long getReplayLatencyEliminate() {
        return this.ReplayLatencyEliminate;
    }

    /**
     * Set 延迟日志大小配置开关：0关、1开
     * @param ReplayLatencyEliminate 延迟日志大小配置开关：0关、1开
     */
    public void setReplayLatencyEliminate(Long ReplayLatencyEliminate) {
        this.ReplayLatencyEliminate = ReplayLatencyEliminate;
    }

    /**
     * Get 延迟日志大小阈值，单位MB 
     * @return MaxReplayLatency 延迟日志大小阈值，单位MB
     */
    public Long getMaxReplayLatency() {
        return this.MaxReplayLatency;
    }

    /**
     * Set 延迟日志大小阈值，单位MB
     * @param MaxReplayLatency 延迟日志大小阈值，单位MB
     */
    public void setMaxReplayLatency(Long MaxReplayLatency) {
        this.MaxReplayLatency = MaxReplayLatency;
    }

    /**
     * Get 延迟时间大小阈值，单位ms 
     * @return MaxReplayLag 延迟时间大小阈值，单位ms
     */
    public Long getMaxReplayLag() {
        return this.MaxReplayLag;
    }

    /**
     * Set 延迟时间大小阈值，单位ms
     * @param MaxReplayLag 延迟时间大小阈值，单位ms
     */
    public void setMaxReplayLag(Long MaxReplayLag) {
        this.MaxReplayLag = MaxReplayLag;
    }

    /**
     * Get 自动负载均衡开关：0关、1开 
     * @return Rebalance 自动负载均衡开关：0关、1开
     */
    public Long getRebalance() {
        return this.Rebalance;
    }

    /**
     * Set 自动负载均衡开关：0关、1开
     * @param Rebalance 自动负载均衡开关：0关、1开
     */
    public void setRebalance(Long Rebalance) {
        this.Rebalance = Rebalance;
    }

    /**
     * Get 延迟剔除最小保留实例数 
     * @return MinDelayEliminateReserve 延迟剔除最小保留实例数
     */
    public Long getMinDelayEliminateReserve() {
        return this.MinDelayEliminateReserve;
    }

    /**
     * Set 延迟剔除最小保留实例数
     * @param MinDelayEliminateReserve 延迟剔除最小保留实例数
     */
    public void setMinDelayEliminateReserve(Long MinDelayEliminateReserve) {
        this.MinDelayEliminateReserve = MinDelayEliminateReserve;
    }

    public ModifyReadOnlyGroupConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyReadOnlyGroupConfigRequest(ModifyReadOnlyGroupConfigRequest source) {
        if (source.ReadOnlyGroupId != null) {
            this.ReadOnlyGroupId = new String(source.ReadOnlyGroupId);
        }
        if (source.ReadOnlyGroupName != null) {
            this.ReadOnlyGroupName = new String(source.ReadOnlyGroupName);
        }
        if (source.ReplayLagEliminate != null) {
            this.ReplayLagEliminate = new Long(source.ReplayLagEliminate);
        }
        if (source.ReplayLatencyEliminate != null) {
            this.ReplayLatencyEliminate = new Long(source.ReplayLatencyEliminate);
        }
        if (source.MaxReplayLatency != null) {
            this.MaxReplayLatency = new Long(source.MaxReplayLatency);
        }
        if (source.MaxReplayLag != null) {
            this.MaxReplayLag = new Long(source.MaxReplayLag);
        }
        if (source.Rebalance != null) {
            this.Rebalance = new Long(source.Rebalance);
        }
        if (source.MinDelayEliminateReserve != null) {
            this.MinDelayEliminateReserve = new Long(source.MinDelayEliminateReserve);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReadOnlyGroupId", this.ReadOnlyGroupId);
        this.setParamSimple(map, prefix + "ReadOnlyGroupName", this.ReadOnlyGroupName);
        this.setParamSimple(map, prefix + "ReplayLagEliminate", this.ReplayLagEliminate);
        this.setParamSimple(map, prefix + "ReplayLatencyEliminate", this.ReplayLatencyEliminate);
        this.setParamSimple(map, prefix + "MaxReplayLatency", this.MaxReplayLatency);
        this.setParamSimple(map, prefix + "MaxReplayLag", this.MaxReplayLag);
        this.setParamSimple(map, prefix + "Rebalance", this.Rebalance);
        this.setParamSimple(map, prefix + "MinDelayEliminateReserve", this.MinDelayEliminateReserve);

    }
}

