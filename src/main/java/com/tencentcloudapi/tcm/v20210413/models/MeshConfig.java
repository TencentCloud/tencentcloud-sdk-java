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

public class MeshConfig extends AbstractModel{

    /**
    * Istio配置
    */
    @SerializedName("Istio")
    @Expose
    private IstioConfig Istio;

    /**
    * AccessLog配置
    */
    @SerializedName("AccessLog")
    @Expose
    private AccessLogConfig AccessLog;

    /**
    * Prometheus配置
    */
    @SerializedName("Prometheus")
    @Expose
    private PrometheusConfig Prometheus;

    /**
    * 自动注入配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Inject")
    @Expose
    private InjectConfig Inject;

    /**
    * 调用跟踪配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tracing")
    @Expose
    private TracingConfig Tracing;

    /**
    * Sidecar自定义资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SidecarResources")
    @Expose
    private ResourceRequirements SidecarResources;

    /**
     * Get Istio配置 
     * @return Istio Istio配置
     */
    public IstioConfig getIstio() {
        return this.Istio;
    }

    /**
     * Set Istio配置
     * @param Istio Istio配置
     */
    public void setIstio(IstioConfig Istio) {
        this.Istio = Istio;
    }

    /**
     * Get AccessLog配置 
     * @return AccessLog AccessLog配置
     */
    public AccessLogConfig getAccessLog() {
        return this.AccessLog;
    }

    /**
     * Set AccessLog配置
     * @param AccessLog AccessLog配置
     */
    public void setAccessLog(AccessLogConfig AccessLog) {
        this.AccessLog = AccessLog;
    }

    /**
     * Get Prometheus配置 
     * @return Prometheus Prometheus配置
     */
    public PrometheusConfig getPrometheus() {
        return this.Prometheus;
    }

    /**
     * Set Prometheus配置
     * @param Prometheus Prometheus配置
     */
    public void setPrometheus(PrometheusConfig Prometheus) {
        this.Prometheus = Prometheus;
    }

    /**
     * Get 自动注入配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Inject 自动注入配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InjectConfig getInject() {
        return this.Inject;
    }

    /**
     * Set 自动注入配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Inject 自动注入配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInject(InjectConfig Inject) {
        this.Inject = Inject;
    }

    /**
     * Get 调用跟踪配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tracing 调用跟踪配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TracingConfig getTracing() {
        return this.Tracing;
    }

    /**
     * Set 调用跟踪配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tracing 调用跟踪配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTracing(TracingConfig Tracing) {
        this.Tracing = Tracing;
    }

    /**
     * Get Sidecar自定义资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SidecarResources Sidecar自定义资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceRequirements getSidecarResources() {
        return this.SidecarResources;
    }

    /**
     * Set Sidecar自定义资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param SidecarResources Sidecar自定义资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSidecarResources(ResourceRequirements SidecarResources) {
        this.SidecarResources = SidecarResources;
    }

    public MeshConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MeshConfig(MeshConfig source) {
        if (source.Istio != null) {
            this.Istio = new IstioConfig(source.Istio);
        }
        if (source.AccessLog != null) {
            this.AccessLog = new AccessLogConfig(source.AccessLog);
        }
        if (source.Prometheus != null) {
            this.Prometheus = new PrometheusConfig(source.Prometheus);
        }
        if (source.Inject != null) {
            this.Inject = new InjectConfig(source.Inject);
        }
        if (source.Tracing != null) {
            this.Tracing = new TracingConfig(source.Tracing);
        }
        if (source.SidecarResources != null) {
            this.SidecarResources = new ResourceRequirements(source.SidecarResources);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Istio.", this.Istio);
        this.setParamObj(map, prefix + "AccessLog.", this.AccessLog);
        this.setParamObj(map, prefix + "Prometheus.", this.Prometheus);
        this.setParamObj(map, prefix + "Inject.", this.Inject);
        this.setParamObj(map, prefix + "Tracing.", this.Tracing);
        this.setParamObj(map, prefix + "SidecarResources.", this.SidecarResources);

    }
}

