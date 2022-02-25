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
package com.tencentcloudapi.tcm.v20210413.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IstioConfig extends AbstractModel{

    /**
    * 外部流量策略
    */
    @SerializedName("OutboundTrafficPolicy")
    @Expose
    private String OutboundTrafficPolicy;

    /**
    * 调用链配置（Deprecated，请使用 MeshConfig.Tracing 进行配置）
    */
    @SerializedName("Tracing")
    @Expose
    private TracingConfig Tracing;

    /**
    * 禁用策略检查功能
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisablePolicyChecks")
    @Expose
    private Boolean DisablePolicyChecks;

    /**
     * Get 外部流量策略 
     * @return OutboundTrafficPolicy 外部流量策略
     */
    public String getOutboundTrafficPolicy() {
        return this.OutboundTrafficPolicy;
    }

    /**
     * Set 外部流量策略
     * @param OutboundTrafficPolicy 外部流量策略
     */
    public void setOutboundTrafficPolicy(String OutboundTrafficPolicy) {
        this.OutboundTrafficPolicy = OutboundTrafficPolicy;
    }

    /**
     * Get 调用链配置（Deprecated，请使用 MeshConfig.Tracing 进行配置） 
     * @return Tracing 调用链配置（Deprecated，请使用 MeshConfig.Tracing 进行配置）
     */
    public TracingConfig getTracing() {
        return this.Tracing;
    }

    /**
     * Set 调用链配置（Deprecated，请使用 MeshConfig.Tracing 进行配置）
     * @param Tracing 调用链配置（Deprecated，请使用 MeshConfig.Tracing 进行配置）
     */
    public void setTracing(TracingConfig Tracing) {
        this.Tracing = Tracing;
    }

    /**
     * Get 禁用策略检查功能
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisablePolicyChecks 禁用策略检查功能
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDisablePolicyChecks() {
        return this.DisablePolicyChecks;
    }

    /**
     * Set 禁用策略检查功能
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisablePolicyChecks 禁用策略检查功能
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisablePolicyChecks(Boolean DisablePolicyChecks) {
        this.DisablePolicyChecks = DisablePolicyChecks;
    }

    public IstioConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IstioConfig(IstioConfig source) {
        if (source.OutboundTrafficPolicy != null) {
            this.OutboundTrafficPolicy = new String(source.OutboundTrafficPolicy);
        }
        if (source.Tracing != null) {
            this.Tracing = new TracingConfig(source.Tracing);
        }
        if (source.DisablePolicyChecks != null) {
            this.DisablePolicyChecks = new Boolean(source.DisablePolicyChecks);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OutboundTrafficPolicy", this.OutboundTrafficPolicy);
        this.setParamObj(map, prefix + "Tracing.", this.Tracing);
        this.setParamSimple(map, prefix + "DisablePolicyChecks", this.DisablePolicyChecks);

    }
}

