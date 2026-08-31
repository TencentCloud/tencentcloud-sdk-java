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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceProviderHealthCheckConfigItemOutput extends AbstractModel {

    /**
    * <p>是否开启健康检查</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
    */
    @SerializedName("HealthCheckEnabled")
    @Expose
    private Boolean HealthCheckEnabled;

    /**
    * <p>健康检查间隔。支持以300s为步长配置。</p><p>单位：s</p><p>默认值：300</p>
    */
    @SerializedName("HealthCheckInterval")
    @Expose
    private Long HealthCheckInterval;

    /**
    * <p>不健康阈值。表示当模型连续多少次不健康时认为该模型不健康。</p><p>取值范围：[1, 10]</p><p>默认值：1</p>
    */
    @SerializedName("HealthCheckUnhealthyThreshold")
    @Expose
    private Long HealthCheckUnhealthyThreshold;

    /**
    * <p>健康检查使用的最大Token数量。部分模型如gpt系列可能仅支持大于等于16。</p><p>默认值：1</p>
    */
    @SerializedName("HealthCheckMaxTokens")
    @Expose
    private Long HealthCheckMaxTokens;

    /**
    * <p>健康检查协议</p><p>枚举值：</p><ul><li>chat： 表示/chat/completion协议</li><li>messages： 表示/v1/messages协议</li><li>responses： 表示/v1/messages协议</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HealthCheckProtocol")
    @Expose
    private String HealthCheckProtocol;

    /**
     * Get <p>是否开启健康检查</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul> 
     * @return HealthCheckEnabled <p>是否开启健康检查</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
     */
    public Boolean getHealthCheckEnabled() {
        return this.HealthCheckEnabled;
    }

    /**
     * Set <p>是否开启健康检查</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
     * @param HealthCheckEnabled <p>是否开启健康检查</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
     */
    public void setHealthCheckEnabled(Boolean HealthCheckEnabled) {
        this.HealthCheckEnabled = HealthCheckEnabled;
    }

    /**
     * Get <p>健康检查间隔。支持以300s为步长配置。</p><p>单位：s</p><p>默认值：300</p> 
     * @return HealthCheckInterval <p>健康检查间隔。支持以300s为步长配置。</p><p>单位：s</p><p>默认值：300</p>
     */
    public Long getHealthCheckInterval() {
        return this.HealthCheckInterval;
    }

    /**
     * Set <p>健康检查间隔。支持以300s为步长配置。</p><p>单位：s</p><p>默认值：300</p>
     * @param HealthCheckInterval <p>健康检查间隔。支持以300s为步长配置。</p><p>单位：s</p><p>默认值：300</p>
     */
    public void setHealthCheckInterval(Long HealthCheckInterval) {
        this.HealthCheckInterval = HealthCheckInterval;
    }

    /**
     * Get <p>不健康阈值。表示当模型连续多少次不健康时认为该模型不健康。</p><p>取值范围：[1, 10]</p><p>默认值：1</p> 
     * @return HealthCheckUnhealthyThreshold <p>不健康阈值。表示当模型连续多少次不健康时认为该模型不健康。</p><p>取值范围：[1, 10]</p><p>默认值：1</p>
     */
    public Long getHealthCheckUnhealthyThreshold() {
        return this.HealthCheckUnhealthyThreshold;
    }

    /**
     * Set <p>不健康阈值。表示当模型连续多少次不健康时认为该模型不健康。</p><p>取值范围：[1, 10]</p><p>默认值：1</p>
     * @param HealthCheckUnhealthyThreshold <p>不健康阈值。表示当模型连续多少次不健康时认为该模型不健康。</p><p>取值范围：[1, 10]</p><p>默认值：1</p>
     */
    public void setHealthCheckUnhealthyThreshold(Long HealthCheckUnhealthyThreshold) {
        this.HealthCheckUnhealthyThreshold = HealthCheckUnhealthyThreshold;
    }

    /**
     * Get <p>健康检查使用的最大Token数量。部分模型如gpt系列可能仅支持大于等于16。</p><p>默认值：1</p> 
     * @return HealthCheckMaxTokens <p>健康检查使用的最大Token数量。部分模型如gpt系列可能仅支持大于等于16。</p><p>默认值：1</p>
     */
    public Long getHealthCheckMaxTokens() {
        return this.HealthCheckMaxTokens;
    }

    /**
     * Set <p>健康检查使用的最大Token数量。部分模型如gpt系列可能仅支持大于等于16。</p><p>默认值：1</p>
     * @param HealthCheckMaxTokens <p>健康检查使用的最大Token数量。部分模型如gpt系列可能仅支持大于等于16。</p><p>默认值：1</p>
     */
    public void setHealthCheckMaxTokens(Long HealthCheckMaxTokens) {
        this.HealthCheckMaxTokens = HealthCheckMaxTokens;
    }

    /**
     * Get <p>健康检查协议</p><p>枚举值：</p><ul><li>chat： 表示/chat/completion协议</li><li>messages： 表示/v1/messages协议</li><li>responses： 表示/v1/messages协议</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HealthCheckProtocol <p>健康检查协议</p><p>枚举值：</p><ul><li>chat： 表示/chat/completion协议</li><li>messages： 表示/v1/messages协议</li><li>responses： 表示/v1/messages协议</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHealthCheckProtocol() {
        return this.HealthCheckProtocol;
    }

    /**
     * Set <p>健康检查协议</p><p>枚举值：</p><ul><li>chat： 表示/chat/completion协议</li><li>messages： 表示/v1/messages协议</li><li>responses： 表示/v1/messages协议</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HealthCheckProtocol <p>健康检查协议</p><p>枚举值：</p><ul><li>chat： 表示/chat/completion协议</li><li>messages： 表示/v1/messages协议</li><li>responses： 表示/v1/messages协议</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHealthCheckProtocol(String HealthCheckProtocol) {
        this.HealthCheckProtocol = HealthCheckProtocol;
    }

    public ServiceProviderHealthCheckConfigItemOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceProviderHealthCheckConfigItemOutput(ServiceProviderHealthCheckConfigItemOutput source) {
        if (source.HealthCheckEnabled != null) {
            this.HealthCheckEnabled = new Boolean(source.HealthCheckEnabled);
        }
        if (source.HealthCheckInterval != null) {
            this.HealthCheckInterval = new Long(source.HealthCheckInterval);
        }
        if (source.HealthCheckUnhealthyThreshold != null) {
            this.HealthCheckUnhealthyThreshold = new Long(source.HealthCheckUnhealthyThreshold);
        }
        if (source.HealthCheckMaxTokens != null) {
            this.HealthCheckMaxTokens = new Long(source.HealthCheckMaxTokens);
        }
        if (source.HealthCheckProtocol != null) {
            this.HealthCheckProtocol = new String(source.HealthCheckProtocol);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HealthCheckEnabled", this.HealthCheckEnabled);
        this.setParamSimple(map, prefix + "HealthCheckInterval", this.HealthCheckInterval);
        this.setParamSimple(map, prefix + "HealthCheckUnhealthyThreshold", this.HealthCheckUnhealthyThreshold);
        this.setParamSimple(map, prefix + "HealthCheckMaxTokens", this.HealthCheckMaxTokens);
        this.setParamSimple(map, prefix + "HealthCheckProtocol", this.HealthCheckProtocol);

    }
}

