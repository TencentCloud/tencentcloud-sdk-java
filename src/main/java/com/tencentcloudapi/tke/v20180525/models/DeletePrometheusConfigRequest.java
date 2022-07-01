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

public class DeletePrometheusConfigRequest extends AbstractModel{

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
    * 要删除的ServiceMonitor名字列表
    */
    @SerializedName("ServiceMonitors")
    @Expose
    private String [] ServiceMonitors;

    /**
    * 要删除的PodMonitor名字列表
    */
    @SerializedName("PodMonitors")
    @Expose
    private String [] PodMonitors;

    /**
    * 要删除的RawJobs名字列表
    */
    @SerializedName("RawJobs")
    @Expose
    private String [] RawJobs;

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
     * Get 要删除的ServiceMonitor名字列表 
     * @return ServiceMonitors 要删除的ServiceMonitor名字列表
     */
    public String [] getServiceMonitors() {
        return this.ServiceMonitors;
    }

    /**
     * Set 要删除的ServiceMonitor名字列表
     * @param ServiceMonitors 要删除的ServiceMonitor名字列表
     */
    public void setServiceMonitors(String [] ServiceMonitors) {
        this.ServiceMonitors = ServiceMonitors;
    }

    /**
     * Get 要删除的PodMonitor名字列表 
     * @return PodMonitors 要删除的PodMonitor名字列表
     */
    public String [] getPodMonitors() {
        return this.PodMonitors;
    }

    /**
     * Set 要删除的PodMonitor名字列表
     * @param PodMonitors 要删除的PodMonitor名字列表
     */
    public void setPodMonitors(String [] PodMonitors) {
        this.PodMonitors = PodMonitors;
    }

    /**
     * Get 要删除的RawJobs名字列表 
     * @return RawJobs 要删除的RawJobs名字列表
     */
    public String [] getRawJobs() {
        return this.RawJobs;
    }

    /**
     * Set 要删除的RawJobs名字列表
     * @param RawJobs 要删除的RawJobs名字列表
     */
    public void setRawJobs(String [] RawJobs) {
        this.RawJobs = RawJobs;
    }

    public DeletePrometheusConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeletePrometheusConfigRequest(DeletePrometheusConfigRequest source) {
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
            this.ServiceMonitors = new String[source.ServiceMonitors.length];
            for (int i = 0; i < source.ServiceMonitors.length; i++) {
                this.ServiceMonitors[i] = new String(source.ServiceMonitors[i]);
            }
        }
        if (source.PodMonitors != null) {
            this.PodMonitors = new String[source.PodMonitors.length];
            for (int i = 0; i < source.PodMonitors.length; i++) {
                this.PodMonitors[i] = new String(source.PodMonitors[i]);
            }
        }
        if (source.RawJobs != null) {
            this.RawJobs = new String[source.RawJobs.length];
            for (int i = 0; i < source.RawJobs.length; i++) {
                this.RawJobs[i] = new String(source.RawJobs[i]);
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
        this.setParamArraySimple(map, prefix + "ServiceMonitors.", this.ServiceMonitors);
        this.setParamArraySimple(map, prefix + "PodMonitors.", this.PodMonitors);
        this.setParamArraySimple(map, prefix + "RawJobs.", this.RawJobs);

    }
}

