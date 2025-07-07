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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePrometheusConfigResponse extends AbstractModel {

    /**
    * 全局配置
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * ServiceMonitor配置
    */
    @SerializedName("ServiceMonitors")
    @Expose
    private PrometheusConfigItem [] ServiceMonitors;

    /**
    * PodMonitor配置
    */
    @SerializedName("PodMonitors")
    @Expose
    private PrometheusConfigItem [] PodMonitors;

    /**
    * 原生Job
    */
    @SerializedName("RawJobs")
    @Expose
    private PrometheusConfigItem [] RawJobs;

    /**
    * Probes
    */
    @SerializedName("Probes")
    @Expose
    private PrometheusConfigItem [] Probes;

    /**
    * 实例组件是否需要升级
    */
    @SerializedName("ImageNeedUpdate")
    @Expose
    private Boolean ImageNeedUpdate;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 全局配置 
     * @return Config 全局配置
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set 全局配置
     * @param Config 全局配置
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    /**
     * Get ServiceMonitor配置 
     * @return ServiceMonitors ServiceMonitor配置
     */
    public PrometheusConfigItem [] getServiceMonitors() {
        return this.ServiceMonitors;
    }

    /**
     * Set ServiceMonitor配置
     * @param ServiceMonitors ServiceMonitor配置
     */
    public void setServiceMonitors(PrometheusConfigItem [] ServiceMonitors) {
        this.ServiceMonitors = ServiceMonitors;
    }

    /**
     * Get PodMonitor配置 
     * @return PodMonitors PodMonitor配置
     */
    public PrometheusConfigItem [] getPodMonitors() {
        return this.PodMonitors;
    }

    /**
     * Set PodMonitor配置
     * @param PodMonitors PodMonitor配置
     */
    public void setPodMonitors(PrometheusConfigItem [] PodMonitors) {
        this.PodMonitors = PodMonitors;
    }

    /**
     * Get 原生Job 
     * @return RawJobs 原生Job
     */
    public PrometheusConfigItem [] getRawJobs() {
        return this.RawJobs;
    }

    /**
     * Set 原生Job
     * @param RawJobs 原生Job
     */
    public void setRawJobs(PrometheusConfigItem [] RawJobs) {
        this.RawJobs = RawJobs;
    }

    /**
     * Get Probes 
     * @return Probes Probes
     */
    public PrometheusConfigItem [] getProbes() {
        return this.Probes;
    }

    /**
     * Set Probes
     * @param Probes Probes
     */
    public void setProbes(PrometheusConfigItem [] Probes) {
        this.Probes = Probes;
    }

    /**
     * Get 实例组件是否需要升级 
     * @return ImageNeedUpdate 实例组件是否需要升级
     */
    public Boolean getImageNeedUpdate() {
        return this.ImageNeedUpdate;
    }

    /**
     * Set 实例组件是否需要升级
     * @param ImageNeedUpdate 实例组件是否需要升级
     */
    public void setImageNeedUpdate(Boolean ImageNeedUpdate) {
        this.ImageNeedUpdate = ImageNeedUpdate;
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

    public DescribePrometheusConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePrometheusConfigResponse(DescribePrometheusConfigResponse source) {
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
        if (source.ImageNeedUpdate != null) {
            this.ImageNeedUpdate = new Boolean(source.ImageNeedUpdate);
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
        this.setParamSimple(map, prefix + "ImageNeedUpdate", this.ImageNeedUpdate);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

