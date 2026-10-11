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

public class ModifyPrometheusConfigRequest extends AbstractModel {

    /**
    * <p>实例id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>集群类型</p>
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * <p>集群id</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>ServiceMonitors配置</p>
    */
    @SerializedName("ServiceMonitors")
    @Expose
    private PrometheusConfigItem [] ServiceMonitors;

    /**
    * <p>PodMonitors配置</p>
    */
    @SerializedName("PodMonitors")
    @Expose
    private PrometheusConfigItem [] PodMonitors;

    /**
    * <p>prometheus原生Job配置</p>
    */
    @SerializedName("RawJobs")
    @Expose
    private PrometheusConfigItem [] RawJobs;

    /**
    * <p>0: 更新实例组件镜像版本；<br>1: 不更新实例组件镜像版本</p><p>取值范围：[0, 1]</p><p>默认值：0</p>
    */
    @SerializedName("UpdateImage")
    @Expose
    private Long UpdateImage;

    /**
     * Get <p>实例id</p> 
     * @return InstanceId <p>实例id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例id</p>
     * @param InstanceId <p>实例id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>集群类型</p> 
     * @return ClusterType <p>集群类型</p>
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>集群类型</p>
     * @param ClusterType <p>集群类型</p>
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get <p>集群id</p> 
     * @return ClusterId <p>集群id</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群id</p>
     * @param ClusterId <p>集群id</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>ServiceMonitors配置</p> 
     * @return ServiceMonitors <p>ServiceMonitors配置</p>
     */
    public PrometheusConfigItem [] getServiceMonitors() {
        return this.ServiceMonitors;
    }

    /**
     * Set <p>ServiceMonitors配置</p>
     * @param ServiceMonitors <p>ServiceMonitors配置</p>
     */
    public void setServiceMonitors(PrometheusConfigItem [] ServiceMonitors) {
        this.ServiceMonitors = ServiceMonitors;
    }

    /**
     * Get <p>PodMonitors配置</p> 
     * @return PodMonitors <p>PodMonitors配置</p>
     */
    public PrometheusConfigItem [] getPodMonitors() {
        return this.PodMonitors;
    }

    /**
     * Set <p>PodMonitors配置</p>
     * @param PodMonitors <p>PodMonitors配置</p>
     */
    public void setPodMonitors(PrometheusConfigItem [] PodMonitors) {
        this.PodMonitors = PodMonitors;
    }

    /**
     * Get <p>prometheus原生Job配置</p> 
     * @return RawJobs <p>prometheus原生Job配置</p>
     */
    public PrometheusConfigItem [] getRawJobs() {
        return this.RawJobs;
    }

    /**
     * Set <p>prometheus原生Job配置</p>
     * @param RawJobs <p>prometheus原生Job配置</p>
     */
    public void setRawJobs(PrometheusConfigItem [] RawJobs) {
        this.RawJobs = RawJobs;
    }

    /**
     * Get <p>0: 更新实例组件镜像版本；<br>1: 不更新实例组件镜像版本</p><p>取值范围：[0, 1]</p><p>默认值：0</p> 
     * @return UpdateImage <p>0: 更新实例组件镜像版本；<br>1: 不更新实例组件镜像版本</p><p>取值范围：[0, 1]</p><p>默认值：0</p>
     * @deprecated
     */
    @Deprecated
    public Long getUpdateImage() {
        return this.UpdateImage;
    }

    /**
     * Set <p>0: 更新实例组件镜像版本；<br>1: 不更新实例组件镜像版本</p><p>取值范围：[0, 1]</p><p>默认值：0</p>
     * @param UpdateImage <p>0: 更新实例组件镜像版本；<br>1: 不更新实例组件镜像版本</p><p>取值范围：[0, 1]</p><p>默认值：0</p>
     * @deprecated
     */
    @Deprecated
    public void setUpdateImage(Long UpdateImage) {
        this.UpdateImage = UpdateImage;
    }

    public ModifyPrometheusConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPrometheusConfigRequest(ModifyPrometheusConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
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
        if (source.UpdateImage != null) {
            this.UpdateImage = new Long(source.UpdateImage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "ServiceMonitors.", this.ServiceMonitors);
        this.setParamArrayObj(map, prefix + "PodMonitors.", this.PodMonitors);
        this.setParamArrayObj(map, prefix + "RawJobs.", this.RawJobs);
        this.setParamSimple(map, prefix + "UpdateImage", this.UpdateImage);

    }
}

