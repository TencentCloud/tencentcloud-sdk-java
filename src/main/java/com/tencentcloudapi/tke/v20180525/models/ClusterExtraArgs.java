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

public class ClusterExtraArgs extends AbstractModel {

    /**
    * etcd自定义参数，只支持独立集群
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Etcd")
    @Expose
    private String [] Etcd;

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
     * Get etcd自定义参数，只支持独立集群
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Etcd etcd自定义参数，只支持独立集群
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getEtcd() {
        return this.Etcd;
    }

    /**
     * Set etcd自定义参数，只支持独立集群
注意：此字段可能返回 null，表示取不到有效值。
     * @param Etcd etcd自定义参数，只支持独立集群
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEtcd(String [] Etcd) {
        this.Etcd = Etcd;
    }

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

    public ClusterExtraArgs() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterExtraArgs(ClusterExtraArgs source) {
        if (source.Etcd != null) {
            this.Etcd = new String[source.Etcd.length];
            for (int i = 0; i < source.Etcd.length; i++) {
                this.Etcd[i] = new String(source.Etcd[i]);
            }
        }
        if (source.KubeAPIServer != null) {
            this.KubeAPIServer = new String[source.KubeAPIServer.length];
            for (int i = 0; i < source.KubeAPIServer.length; i++) {
                this.KubeAPIServer[i] = new String(source.KubeAPIServer[i]);
            }
        }
        if (source.KubeControllerManager != null) {
            this.KubeControllerManager = new String[source.KubeControllerManager.length];
            for (int i = 0; i < source.KubeControllerManager.length; i++) {
                this.KubeControllerManager[i] = new String(source.KubeControllerManager[i]);
            }
        }
        if (source.KubeScheduler != null) {
            this.KubeScheduler = new String[source.KubeScheduler.length];
            for (int i = 0; i < source.KubeScheduler.length; i++) {
                this.KubeScheduler[i] = new String(source.KubeScheduler[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Etcd.", this.Etcd);
        this.setParamArraySimple(map, prefix + "KubeAPIServer.", this.KubeAPIServer);
        this.setParamArraySimple(map, prefix + "KubeControllerManager.", this.KubeControllerManager);
        this.setParamArraySimple(map, prefix + "KubeScheduler.", this.KubeScheduler);

    }
}

