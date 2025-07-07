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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpstreamHealthCheckConfig extends AbstractModel {

    /**
    * 开启主动健康检查
    */
    @SerializedName("EnableActiveHealthCheck")
    @Expose
    private Boolean EnableActiveHealthCheck;

    /**
    * 主动健康检查配置
    */
    @SerializedName("ActiveHealthCheck")
    @Expose
    private KongActiveHealthCheck ActiveHealthCheck;

    /**
    * 开启被动健康检查
    */
    @SerializedName("EnablePassiveHealthCheck")
    @Expose
    private Boolean EnablePassiveHealthCheck;

    /**
    * 被动健康检查配置
    */
    @SerializedName("PassiveHealthCheck")
    @Expose
    private KongPassiveHealthCheck PassiveHealthCheck;

    /**
    * 连续健康阈值，单位：次
    */
    @SerializedName("Successes")
    @Expose
    private Long Successes;

    /**
    * 连续异常阈值，单位：次	
    */
    @SerializedName("Failures")
    @Expose
    private Long Failures;

    /**
    * 超时阈值，单位：次
    */
    @SerializedName("Timeouts")
    @Expose
    private Long Timeouts;

    /**
    * 健康HTTP状态码
    */
    @SerializedName("HealthyHttpStatuses")
    @Expose
    private Long [] HealthyHttpStatuses;

    /**
    * 异常HTTP状态码
    */
    @SerializedName("UnhealthyHttpStatuses")
    @Expose
    private Long [] UnhealthyHttpStatuses;

    /**
    * 健康检查监控上报的数据屏蔽权重为0的节点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IgnoreZeroWeightNodes")
    @Expose
    private Boolean IgnoreZeroWeightNodes;

    /**
    * 健康检查支持权重为0节点
    */
    @SerializedName("ZeroWeightHeathCheck")
    @Expose
    private Boolean ZeroWeightHeathCheck;

    /**
     * Get 开启主动健康检查 
     * @return EnableActiveHealthCheck 开启主动健康检查
     */
    public Boolean getEnableActiveHealthCheck() {
        return this.EnableActiveHealthCheck;
    }

    /**
     * Set 开启主动健康检查
     * @param EnableActiveHealthCheck 开启主动健康检查
     */
    public void setEnableActiveHealthCheck(Boolean EnableActiveHealthCheck) {
        this.EnableActiveHealthCheck = EnableActiveHealthCheck;
    }

    /**
     * Get 主动健康检查配置 
     * @return ActiveHealthCheck 主动健康检查配置
     */
    public KongActiveHealthCheck getActiveHealthCheck() {
        return this.ActiveHealthCheck;
    }

    /**
     * Set 主动健康检查配置
     * @param ActiveHealthCheck 主动健康检查配置
     */
    public void setActiveHealthCheck(KongActiveHealthCheck ActiveHealthCheck) {
        this.ActiveHealthCheck = ActiveHealthCheck;
    }

    /**
     * Get 开启被动健康检查 
     * @return EnablePassiveHealthCheck 开启被动健康检查
     */
    public Boolean getEnablePassiveHealthCheck() {
        return this.EnablePassiveHealthCheck;
    }

    /**
     * Set 开启被动健康检查
     * @param EnablePassiveHealthCheck 开启被动健康检查
     */
    public void setEnablePassiveHealthCheck(Boolean EnablePassiveHealthCheck) {
        this.EnablePassiveHealthCheck = EnablePassiveHealthCheck;
    }

    /**
     * Get 被动健康检查配置 
     * @return PassiveHealthCheck 被动健康检查配置
     */
    public KongPassiveHealthCheck getPassiveHealthCheck() {
        return this.PassiveHealthCheck;
    }

    /**
     * Set 被动健康检查配置
     * @param PassiveHealthCheck 被动健康检查配置
     */
    public void setPassiveHealthCheck(KongPassiveHealthCheck PassiveHealthCheck) {
        this.PassiveHealthCheck = PassiveHealthCheck;
    }

    /**
     * Get 连续健康阈值，单位：次 
     * @return Successes 连续健康阈值，单位：次
     */
    public Long getSuccesses() {
        return this.Successes;
    }

    /**
     * Set 连续健康阈值，单位：次
     * @param Successes 连续健康阈值，单位：次
     */
    public void setSuccesses(Long Successes) {
        this.Successes = Successes;
    }

    /**
     * Get 连续异常阈值，单位：次	 
     * @return Failures 连续异常阈值，单位：次	
     */
    public Long getFailures() {
        return this.Failures;
    }

    /**
     * Set 连续异常阈值，单位：次	
     * @param Failures 连续异常阈值，单位：次	
     */
    public void setFailures(Long Failures) {
        this.Failures = Failures;
    }

    /**
     * Get 超时阈值，单位：次 
     * @return Timeouts 超时阈值，单位：次
     */
    public Long getTimeouts() {
        return this.Timeouts;
    }

    /**
     * Set 超时阈值，单位：次
     * @param Timeouts 超时阈值，单位：次
     */
    public void setTimeouts(Long Timeouts) {
        this.Timeouts = Timeouts;
    }

    /**
     * Get 健康HTTP状态码 
     * @return HealthyHttpStatuses 健康HTTP状态码
     */
    public Long [] getHealthyHttpStatuses() {
        return this.HealthyHttpStatuses;
    }

    /**
     * Set 健康HTTP状态码
     * @param HealthyHttpStatuses 健康HTTP状态码
     */
    public void setHealthyHttpStatuses(Long [] HealthyHttpStatuses) {
        this.HealthyHttpStatuses = HealthyHttpStatuses;
    }

    /**
     * Get 异常HTTP状态码 
     * @return UnhealthyHttpStatuses 异常HTTP状态码
     */
    public Long [] getUnhealthyHttpStatuses() {
        return this.UnhealthyHttpStatuses;
    }

    /**
     * Set 异常HTTP状态码
     * @param UnhealthyHttpStatuses 异常HTTP状态码
     */
    public void setUnhealthyHttpStatuses(Long [] UnhealthyHttpStatuses) {
        this.UnhealthyHttpStatuses = UnhealthyHttpStatuses;
    }

    /**
     * Get 健康检查监控上报的数据屏蔽权重为0的节点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IgnoreZeroWeightNodes 健康检查监控上报的数据屏蔽权重为0的节点
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public Boolean getIgnoreZeroWeightNodes() {
        return this.IgnoreZeroWeightNodes;
    }

    /**
     * Set 健康检查监控上报的数据屏蔽权重为0的节点
注意：此字段可能返回 null，表示取不到有效值。
     * @param IgnoreZeroWeightNodes 健康检查监控上报的数据屏蔽权重为0的节点
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setIgnoreZeroWeightNodes(Boolean IgnoreZeroWeightNodes) {
        this.IgnoreZeroWeightNodes = IgnoreZeroWeightNodes;
    }

    /**
     * Get 健康检查支持权重为0节点 
     * @return ZeroWeightHeathCheck 健康检查支持权重为0节点
     */
    public Boolean getZeroWeightHeathCheck() {
        return this.ZeroWeightHeathCheck;
    }

    /**
     * Set 健康检查支持权重为0节点
     * @param ZeroWeightHeathCheck 健康检查支持权重为0节点
     */
    public void setZeroWeightHeathCheck(Boolean ZeroWeightHeathCheck) {
        this.ZeroWeightHeathCheck = ZeroWeightHeathCheck;
    }

    public UpstreamHealthCheckConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpstreamHealthCheckConfig(UpstreamHealthCheckConfig source) {
        if (source.EnableActiveHealthCheck != null) {
            this.EnableActiveHealthCheck = new Boolean(source.EnableActiveHealthCheck);
        }
        if (source.ActiveHealthCheck != null) {
            this.ActiveHealthCheck = new KongActiveHealthCheck(source.ActiveHealthCheck);
        }
        if (source.EnablePassiveHealthCheck != null) {
            this.EnablePassiveHealthCheck = new Boolean(source.EnablePassiveHealthCheck);
        }
        if (source.PassiveHealthCheck != null) {
            this.PassiveHealthCheck = new KongPassiveHealthCheck(source.PassiveHealthCheck);
        }
        if (source.Successes != null) {
            this.Successes = new Long(source.Successes);
        }
        if (source.Failures != null) {
            this.Failures = new Long(source.Failures);
        }
        if (source.Timeouts != null) {
            this.Timeouts = new Long(source.Timeouts);
        }
        if (source.HealthyHttpStatuses != null) {
            this.HealthyHttpStatuses = new Long[source.HealthyHttpStatuses.length];
            for (int i = 0; i < source.HealthyHttpStatuses.length; i++) {
                this.HealthyHttpStatuses[i] = new Long(source.HealthyHttpStatuses[i]);
            }
        }
        if (source.UnhealthyHttpStatuses != null) {
            this.UnhealthyHttpStatuses = new Long[source.UnhealthyHttpStatuses.length];
            for (int i = 0; i < source.UnhealthyHttpStatuses.length; i++) {
                this.UnhealthyHttpStatuses[i] = new Long(source.UnhealthyHttpStatuses[i]);
            }
        }
        if (source.IgnoreZeroWeightNodes != null) {
            this.IgnoreZeroWeightNodes = new Boolean(source.IgnoreZeroWeightNodes);
        }
        if (source.ZeroWeightHeathCheck != null) {
            this.ZeroWeightHeathCheck = new Boolean(source.ZeroWeightHeathCheck);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableActiveHealthCheck", this.EnableActiveHealthCheck);
        this.setParamObj(map, prefix + "ActiveHealthCheck.", this.ActiveHealthCheck);
        this.setParamSimple(map, prefix + "EnablePassiveHealthCheck", this.EnablePassiveHealthCheck);
        this.setParamObj(map, prefix + "PassiveHealthCheck.", this.PassiveHealthCheck);
        this.setParamSimple(map, prefix + "Successes", this.Successes);
        this.setParamSimple(map, prefix + "Failures", this.Failures);
        this.setParamSimple(map, prefix + "Timeouts", this.Timeouts);
        this.setParamArraySimple(map, prefix + "HealthyHttpStatuses.", this.HealthyHttpStatuses);
        this.setParamArraySimple(map, prefix + "UnhealthyHttpStatuses.", this.UnhealthyHttpStatuses);
        this.setParamSimple(map, prefix + "IgnoreZeroWeightNodes", this.IgnoreZeroWeightNodes);
        this.setParamSimple(map, prefix + "ZeroWeightHeathCheck", this.ZeroWeightHeathCheck);

    }
}

