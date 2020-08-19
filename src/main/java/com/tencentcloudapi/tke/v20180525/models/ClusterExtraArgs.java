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

public class ClusterExtraArgs extends AbstractModel{

    /**
    * kube-apiserver自定义参数，参数格式为["k1=v1", "k1=v2"]， 例如["max-requests-inflight=500","feature-gates=PodShareProcessNamespace=true,DynamicKubeletConfig=true"]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KubeAPIServer")
    @Expose
    private String [] KubeAPIServer;

    /**
    * kube-controller-manager自定义参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KubeControllerManager")
    @Expose
    private String [] KubeControllerManager;

    /**
    * kube-scheduler自定义参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KubeScheduler")
    @Expose
    private String [] KubeScheduler;

    /**
     * Get kube-apiserver自定义参数，参数格式为["k1=v1", "k1=v2"]， 例如["max-requests-inflight=500","feature-gates=PodShareProcessNamespace=true,DynamicKubeletConfig=true"]
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KubeAPIServer kube-apiserver自定义参数，参数格式为["k1=v1", "k1=v2"]， 例如["max-requests-inflight=500","feature-gates=PodShareProcessNamespace=true,DynamicKubeletConfig=true"]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getKubeAPIServer() {
        return this.KubeAPIServer;
    }

    /**
     * Set kube-apiserver自定义参数，参数格式为["k1=v1", "k1=v2"]， 例如["max-requests-inflight=500","feature-gates=PodShareProcessNamespace=true,DynamicKubeletConfig=true"]
注意：此字段可能返回 null，表示取不到有效值。
     * @param KubeAPIServer kube-apiserver自定义参数，参数格式为["k1=v1", "k1=v2"]， 例如["max-requests-inflight=500","feature-gates=PodShareProcessNamespace=true,DynamicKubeletConfig=true"]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKubeAPIServer(String [] KubeAPIServer) {
        this.KubeAPIServer = KubeAPIServer;
    }

    /**
     * Get kube-controller-manager自定义参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KubeControllerManager kube-controller-manager自定义参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getKubeControllerManager() {
        return this.KubeControllerManager;
    }

    /**
     * Set kube-controller-manager自定义参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param KubeControllerManager kube-controller-manager自定义参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKubeControllerManager(String [] KubeControllerManager) {
        this.KubeControllerManager = KubeControllerManager;
    }

    /**
     * Get kube-scheduler自定义参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KubeScheduler kube-scheduler自定义参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getKubeScheduler() {
        return this.KubeScheduler;
    }

    /**
     * Set kube-scheduler自定义参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param KubeScheduler kube-scheduler自定义参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKubeScheduler(String [] KubeScheduler) {
        this.KubeScheduler = KubeScheduler;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "KubeAPIServer.", this.KubeAPIServer);
        this.setParamArraySimple(map, prefix + "KubeControllerManager.", this.KubeControllerManager);
        this.setParamArraySimple(map, prefix + "KubeScheduler.", this.KubeScheduler);

    }
}

