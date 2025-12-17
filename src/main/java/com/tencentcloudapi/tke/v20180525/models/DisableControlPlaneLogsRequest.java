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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisableControlPlaneLogsRequest extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群类型。当前只支持tke
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * 组件名称列表，目前支持的组件有：kube-apiserver、kube-controller-manager、kube-scheduler、cluster-autoscaler、kapenter
    */
    @SerializedName("ComponentNames")
    @Expose
    private String [] ComponentNames;

    /**
    * 是否删除日志集和topic。 如果日志集和topic被其他采集规则使用，则不会被删除
    */
    @SerializedName("DeleteLogSetAndTopic")
    @Expose
    private Boolean DeleteLogSetAndTopic;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群类型。当前只支持tke 
     * @return ClusterType 集群类型。当前只支持tke
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 集群类型。当前只支持tke
     * @param ClusterType 集群类型。当前只支持tke
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get 组件名称列表，目前支持的组件有：kube-apiserver、kube-controller-manager、kube-scheduler、cluster-autoscaler、kapenter 
     * @return ComponentNames 组件名称列表，目前支持的组件有：kube-apiserver、kube-controller-manager、kube-scheduler、cluster-autoscaler、kapenter
     */
    public String [] getComponentNames() {
        return this.ComponentNames;
    }

    /**
     * Set 组件名称列表，目前支持的组件有：kube-apiserver、kube-controller-manager、kube-scheduler、cluster-autoscaler、kapenter
     * @param ComponentNames 组件名称列表，目前支持的组件有：kube-apiserver、kube-controller-manager、kube-scheduler、cluster-autoscaler、kapenter
     */
    public void setComponentNames(String [] ComponentNames) {
        this.ComponentNames = ComponentNames;
    }

    /**
     * Get 是否删除日志集和topic。 如果日志集和topic被其他采集规则使用，则不会被删除 
     * @return DeleteLogSetAndTopic 是否删除日志集和topic。 如果日志集和topic被其他采集规则使用，则不会被删除
     */
    public Boolean getDeleteLogSetAndTopic() {
        return this.DeleteLogSetAndTopic;
    }

    /**
     * Set 是否删除日志集和topic。 如果日志集和topic被其他采集规则使用，则不会被删除
     * @param DeleteLogSetAndTopic 是否删除日志集和topic。 如果日志集和topic被其他采集规则使用，则不会被删除
     */
    public void setDeleteLogSetAndTopic(Boolean DeleteLogSetAndTopic) {
        this.DeleteLogSetAndTopic = DeleteLogSetAndTopic;
    }

    public DisableControlPlaneLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisableControlPlaneLogsRequest(DisableControlPlaneLogsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.ComponentNames != null) {
            this.ComponentNames = new String[source.ComponentNames.length];
            for (int i = 0; i < source.ComponentNames.length; i++) {
                this.ComponentNames[i] = new String(source.ComponentNames[i]);
            }
        }
        if (source.DeleteLogSetAndTopic != null) {
            this.DeleteLogSetAndTopic = new Boolean(source.DeleteLogSetAndTopic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamArraySimple(map, prefix + "ComponentNames.", this.ComponentNames);
        this.setParamSimple(map, prefix + "DeleteLogSetAndTopic", this.DeleteLogSetAndTopic);

    }
}

