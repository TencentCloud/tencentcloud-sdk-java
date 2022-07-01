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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyPrometheusConfigRequest extends AbstractModel{

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 集群类型
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * 集群id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * ServiceMonitors配置
    */
    @SerializedName("ServiceMonitors")
    @Expose
    private PrometheusConfigItem [] ServiceMonitors;

    /**
    * PodMonitors配置
    */
    @SerializedName("PodMonitors")
    @Expose
    private PrometheusConfigItem [] PodMonitors;

    /**
    * prometheus原生Job配置
    */
    @SerializedName("RawJobs")
    @Expose
    private PrometheusConfigItem [] RawJobs;

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 集群类型 
     * @return ClusterType 集群类型
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 集群类型
     * @param ClusterType 集群类型
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get 集群id 
     * @return ClusterId 集群id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群id
     * @param ClusterId 集群id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get ServiceMonitors配置 
     * @return ServiceMonitors ServiceMonitors配置
     */
    public PrometheusConfigItem [] getServiceMonitors() {
        return this.ServiceMonitors;
    }

    /**
     * Set ServiceMonitors配置
     * @param ServiceMonitors ServiceMonitors配置
     */
    public void setServiceMonitors(PrometheusConfigItem [] ServiceMonitors) {
        this.ServiceMonitors = ServiceMonitors;
    }

    /**
     * Get PodMonitors配置 
     * @return PodMonitors PodMonitors配置
     */
    public PrometheusConfigItem [] getPodMonitors() {
        return this.PodMonitors;
    }

    /**
     * Set PodMonitors配置
     * @param PodMonitors PodMonitors配置
     */
    public void setPodMonitors(PrometheusConfigItem [] PodMonitors) {
        this.PodMonitors = PodMonitors;
    }

    /**
     * Get prometheus原生Job配置 
     * @return RawJobs prometheus原生Job配置
     */
    public PrometheusConfigItem [] getRawJobs() {
        return this.RawJobs;
    }

    /**
     * Set prometheus原生Job配置
     * @param RawJobs prometheus原生Job配置
     */
    public void setRawJobs(PrometheusConfigItem [] RawJobs) {
        this.RawJobs = RawJobs;
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

    }
}

