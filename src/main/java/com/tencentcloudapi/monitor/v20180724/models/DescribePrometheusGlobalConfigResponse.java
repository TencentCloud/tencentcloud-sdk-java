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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePrometheusGlobalConfigResponse extends AbstractModel{

    /**
    * 配置内容
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * ServiceMonitors列表以及对应targets信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceMonitors")
    @Expose
    private PrometheusConfigItem [] ServiceMonitors;

    /**
    * PodMonitors列表以及对应targets信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PodMonitors")
    @Expose
    private PrometheusConfigItem [] PodMonitors;

    /**
    * RawJobs列表以及对应targets信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RawJobs")
    @Expose
    private PrometheusConfigItem [] RawJobs;

    /**
    * Probes列表以及对应targets信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Probes")
    @Expose
    private PrometheusConfigItem [] Probes;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 配置内容 
     * @return Config 配置内容
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set 配置内容
     * @param Config 配置内容
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    /**
     * Get ServiceMonitors列表以及对应targets信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceMonitors ServiceMonitors列表以及对应targets信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrometheusConfigItem [] getServiceMonitors() {
        return this.ServiceMonitors;
    }

    /**
     * Set ServiceMonitors列表以及对应targets信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceMonitors ServiceMonitors列表以及对应targets信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceMonitors(PrometheusConfigItem [] ServiceMonitors) {
        this.ServiceMonitors = ServiceMonitors;
    }

    /**
     * Get PodMonitors列表以及对应targets信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PodMonitors PodMonitors列表以及对应targets信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrometheusConfigItem [] getPodMonitors() {
        return this.PodMonitors;
    }

    /**
     * Set PodMonitors列表以及对应targets信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param PodMonitors PodMonitors列表以及对应targets信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPodMonitors(PrometheusConfigItem [] PodMonitors) {
        this.PodMonitors = PodMonitors;
    }

    /**
     * Get RawJobs列表以及对应targets信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RawJobs RawJobs列表以及对应targets信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrometheusConfigItem [] getRawJobs() {
        return this.RawJobs;
    }

    /**
     * Set RawJobs列表以及对应targets信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param RawJobs RawJobs列表以及对应targets信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRawJobs(PrometheusConfigItem [] RawJobs) {
        this.RawJobs = RawJobs;
    }

    /**
     * Get Probes列表以及对应targets信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Probes Probes列表以及对应targets信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrometheusConfigItem [] getProbes() {
        return this.Probes;
    }

    /**
     * Set Probes列表以及对应targets信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Probes Probes列表以及对应targets信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProbes(PrometheusConfigItem [] Probes) {
        this.Probes = Probes;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribePrometheusGlobalConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePrometheusGlobalConfigResponse(DescribePrometheusGlobalConfigResponse source) {
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
        if (source.ServiceMonitors != null) {
            this.ServiceMonitors = new PrometheusConfigItem[source.ServiceMonitors.length];
            for (int i = 0; i < source.ServiceMonitors.length; i++) {
                this.ServiceMonitors[i] = new PrometheusConfigItem(source.ServiceMonitors[i]);
            }
        }
        if (source.PodMonitors != null) {
            this.PodMonitors = new PrometheusConfigItem[source.PodMonitors.length];
            for (int i = 0; i < source.PodMonitors.length; i++) {
                this.PodMonitors[i] = new PrometheusConfigItem(source.PodMonitors[i]);
            }
        }
        if (source.RawJobs != null) {
            this.RawJobs = new PrometheusConfigItem[source.RawJobs.length];
            for (int i = 0; i < source.RawJobs.length; i++) {
                this.RawJobs[i] = new PrometheusConfigItem(source.RawJobs[i]);
            }
        }
        if (source.Probes != null) {
            this.Probes = new PrometheusConfigItem[source.Probes.length];
            for (int i = 0; i < source.Probes.length; i++) {
                this.Probes[i] = new PrometheusConfigItem(source.Probes[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Config", this.Config);
        this.setParamArrayObj(map, prefix + "ServiceMonitors.", this.ServiceMonitors);
        this.setParamArrayObj(map, prefix + "PodMonitors.", this.PodMonitors);
        this.setParamArrayObj(map, prefix + "RawJobs.", this.RawJobs);
        this.setParamArrayObj(map, prefix + "Probes.", this.Probes);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

